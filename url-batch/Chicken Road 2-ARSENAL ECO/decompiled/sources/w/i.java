package w;

import A.k;
import a.AbstractC0219a;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import v.C0698c;
import v.C0699d;

/* loaded from: classes.dex */
public final class i extends AbstractC0219a {
    public static Font S(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? 700 : 400, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int T6 = T(fontStyle, font.getStyle());
        for (int i8 = 1; i8 < fontFamily.getSize(); i8++) {
            Font font2 = fontFamily.getFont(i8);
            int T7 = T(fontStyle, font2.getStyle());
            if (T7 < T6) {
                font = font2;
                T6 = T7;
            }
        }
        return font;
    }

    public static int T(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // a.AbstractC0219a
    public final Typeface g(Context context, C0698c c0698c, Resources resources, int i7) {
        try {
            FontFamily.Builder builder = null;
            for (C0699d c0699d : c0698c.f6041a) {
                try {
                    Font build = new Font.Builder(resources, c0699d.f6047f).setWeight(c0699d.f6043b).setSlant(c0699d.f6044c ? 1 : 0).setTtcIndex(c0699d.f6046e).setFontVariationSettings(c0699d.f6045d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(S(build2, i7).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // a.AbstractC0219a
    public final Typeface h(Context context, k[] kVarArr, int i7) {
        int i8;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = kVarArr.length;
            FontFamily.Builder builder = null;
            while (i8 < length) {
                k kVar = kVarArr[i8];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(kVar.f28a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i8 = openFileDescriptor == null ? i8 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(kVar.f30c).setSlant(kVar.f31d ? 1 : 0).setTtcIndex(kVar.f29b).build();
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
                return new Typeface.CustomFallbackBuilder(build2).setStyle(S(build2, i7).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // a.AbstractC0219a
    public final Typeface i(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // a.AbstractC0219a
    public final Typeface j(Context context, Resources resources, int i7, String str, int i8) {
        try {
            Font build = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // a.AbstractC0219a
    public final k o(k[] kVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
