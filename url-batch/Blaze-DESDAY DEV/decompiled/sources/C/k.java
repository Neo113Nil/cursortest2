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
public final class k extends z1.d {
    public static Font v0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int w02 = w0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int w03 = w0(fontStyle, font2.getStyle());
            if (w03 < w02) {
                font = font2;
                w02 = w03;
            }
        }
        return font;
    }

    public static int w0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // z1.d
    public final Typeface A(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // z1.d
    public final H.k B(int i, H.k[] kVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // z1.d
    public final Typeface y(Context context, B.g gVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (B.h hVar : gVar.f35a) {
                try {
                    Font build = new Font.Builder(resources, hVar.f40f).setWeight(hVar.f37b).setSlant(hVar.f38c ? 1 : 0).setTtcIndex(hVar.f39e).setFontVariationSettings(hVar.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(v0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // z1.d
    public final Typeface z(Context context, H.k[] kVarArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = kVarArr.length;
            FontFamily.Builder builder = null;
            while (i2 < length) {
                H.k kVar = kVarArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(kVar.f294a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(kVar.f296c).setSlant(kVar.d ? 1 : 0).setTtcIndex(kVar.f295b).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(v0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }
}
