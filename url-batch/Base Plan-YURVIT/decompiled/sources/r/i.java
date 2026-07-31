package r;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import androidx.datastore.preferences.protobuf.k0;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class i extends k0 {
    public static Font M(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int N2 = N(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int N3 = N(fontStyle, font2.getStyle());
            if (N3 < N2) {
                font = font2;
                N2 = N3;
            }
        }
        return font;
    }

    public static int N(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final Typeface k(Context context, q.c cVar, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (q.d dVar : cVar.f2945a) {
                try {
                    Font build = new Font.Builder(resources, dVar.f2951f).setWeight(dVar.f2947b).setSlant(dVar.f2948c ? 1 : 0).setTtcIndex(dVar.f2950e).setFontVariationSettings(dVar.f2949d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(M(build2, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final Typeface l(Context context, v.g[] gVarArr, int i2) {
        int i3;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = gVarArr.length;
            FontFamily.Builder builder = null;
            while (i3 < length) {
                v.g gVar = gVarArr[i3];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(gVar.f3073a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i3 = openFileDescriptor == null ? i3 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(gVar.f3075c).setSlant(gVar.f3076d ? 1 : 0).setTtcIndex(gVar.f3074b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder != null) {
                FontFamily build2 = builder.build();
                return new Typeface.CustomFallbackBuilder(build2).setStyle(M(build2, i2).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final Typeface m(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final Typeface n(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final v.g r(v.g[] gVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
