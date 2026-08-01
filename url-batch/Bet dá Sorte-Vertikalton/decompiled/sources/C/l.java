package C;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends u1.l {
    public static Font r0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int s02 = s0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int s03 = s0(fontStyle, font2.getStyle());
            if (s03 < s02) {
                font = font2;
                s02 = s03;
            }
        }
        return font;
    }

    public static int s0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // u1.l
    public final Typeface n(Context context, B.g gVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (B.h hVar : gVar.f43a) {
                try {
                    Font build = new Font.Builder(resources, hVar.f48f).setWeight(hVar.f45b).setSlant(hVar.f46c ? 1 : 0).setTtcIndex(hVar.f47e).setFontVariationSettings(hVar.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(r0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // u1.l
    public final Typeface o(Context context, H.k[] kVarArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = kVarArr.length;
            FontFamily.Builder builder = null;
            while (i2 < length) {
                H.k kVar = kVarArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(kVar.f291a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(kVar.f293c).setSlant(kVar.d ? 1 : 0).setTtcIndex(kVar.f292b).build();
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
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(r0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // u1.l
    public final Typeface p(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // u1.l
    public final H.k s(int i, H.k[] kVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
