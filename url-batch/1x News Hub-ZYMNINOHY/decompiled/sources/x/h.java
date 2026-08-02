package x;

import B.k;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import w.C1231b;

/* loaded from: classes.dex */
public class h extends android.support.v4.media.session.a {
    public static Font Z(FontFamily fontFamily, int i3) {
        FontStyle fontStyle = new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int c02 = c0(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int c03 = c0(fontStyle, font2.getStyle());
            if (c03 < c02) {
                font = font2;
                c02 = c03;
            }
        }
        return font;
    }

    public static int c0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily a0(k[] kVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (k kVar : kVarArr) {
            if (Objects.equals(kVar.f103a.getScheme(), "systemfont")) {
                font = b0(kVar);
            } else {
                try {
                    Uri uri = kVar.f103a;
                    str = kVar.f107e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e3) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(kVar.f105c).setSlant(kVar.f106d ? 1 : 0).setTtcIndex(kVar.f104b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font b0(k kVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // android.support.v4.media.session.a
    public final Typeface l(Context context, C1231b c1231b, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (w.c cVar : c1231b.f10616a) {
                try {
                    Font build = new Font.Builder(resources, cVar.f).setWeight(cVar.f10618b).setSlant(cVar.f10619c ? 1 : 0).setTtcIndex(cVar.f10621e).setFontVariationSettings(cVar.f10620d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(Z(build2, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // android.support.v4.media.session.a
    public final Typeface m(Context context, k[] kVarArr, int i3) {
        try {
            FontFamily a02 = a0(kVarArr, context.getContentResolver());
            if (a02 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(a02).setStyle(Z(a02, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // android.support.v4.media.session.a
    public final Typeface n(Context context, List list, int i3) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily a02 = a0((k[]) list.get(0), contentResolver);
            if (a02 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(a02);
            for (int i4 = 1; i4 < list.size(); i4++) {
                FontFamily a03 = a0((k[]) list.get(i4), contentResolver);
                if (a03 != null) {
                    customFallbackBuilder.addCustomFallback(a03);
                }
            }
            return customFallbackBuilder.setStyle(Z(a02, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // android.support.v4.media.session.a
    public final Typeface o(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // android.support.v4.media.session.a
    public final Typeface p(Context context, Resources resources, int i3, String str, int i4) {
        try {
            Font build = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // android.support.v4.media.session.a
    public final k w(k[] kVarArr, int i3) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
