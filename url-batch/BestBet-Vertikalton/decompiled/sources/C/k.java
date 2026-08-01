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
public final class k extends H1.d {
    public static Font y0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int z02 = z0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int z03 = z0(fontStyle, font2.getStyle());
            if (z03 < z02) {
                font = font2;
                z02 = z03;
            }
        }
        return font;
    }

    public static int z0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // H1.d
    public final Typeface r(Context context, B.g gVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (B.h hVar : gVar.f34a) {
                try {
                    Font build = new Font.Builder(resources, hVar.f39f).setWeight(hVar.f36b).setSlant(hVar.f37c ? 1 : 0).setTtcIndex(hVar.f38e).setFontVariationSettings(hVar.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(y0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // H1.d
    public final Typeface s(Context context, H.j[] jVarArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = jVarArr.length;
            FontFamily.Builder builder = null;
            while (i2 < length) {
                H.j jVar = jVarArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(jVar.f497a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(jVar.f499c).setSlant(jVar.d ? 1 : 0).setTtcIndex(jVar.f498b).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(y0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // H1.d
    public final Typeface t(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // H1.d
    public final H.j x(int i, H.j[] jVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
