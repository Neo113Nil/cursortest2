package t;

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
import s.C0295f;
import s.C0296g;
import x.C0329h;

/* loaded from: classes.dex */
public final class j extends i1.a {
    public static Font O(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int P2 = P(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int P3 = P(fontStyle, font2.getStyle());
            if (P3 < P2) {
                font = font2;
                P2 = P3;
            }
        }
        return font;
    }

    public static int P(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // i1.a
    public final Typeface c(Context context, C0295f c0295f, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (C0296g c0296g : c0295f.f3405a) {
                try {
                    Font build = new Font.Builder(resources, c0296g.f3411f).setWeight(c0296g.f3407b).setSlant(c0296g.f3408c ? 1 : 0).setTtcIndex(c0296g.f3410e).setFontVariationSettings(c0296g.f3409d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(O(build2, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // i1.a
    public final Typeface d(Context context, C0329h[] c0329hArr, int i2) {
        int i3;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c0329hArr.length;
            FontFamily.Builder builder = null;
            while (i3 < length) {
                C0329h c0329h = c0329hArr[i3];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0329h.f3583a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i3 = openFileDescriptor == null ? i3 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(c0329h.f3585c).setSlant(c0329h.f3586d ? 1 : 0).setTtcIndex(c0329h.f3584b).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(O(build2, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // i1.a
    public final Typeface e(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // i1.a
    public final Typeface f(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // i1.a
    public final C0329h l(C0329h[] c0329hArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
