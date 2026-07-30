package B;

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
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class l extends V6.b {
    public static Font T(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int W4 = W(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int W6 = W(fontStyle, font2.getStyle());
            if (W6 < W4) {
                font = font2;
                W4 = W6;
            }
        }
        return font;
    }

    public static int W(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily U(F.k[] kVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (F.k kVar : kVarArr) {
            if (Objects.equals(kVar.f744a.getScheme(), "systemfont")) {
                font = V(kVar);
            } else {
                try {
                    Uri uri = kVar.f744a;
                    str = kVar.f748e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e7) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(kVar.f746c).setSlant(kVar.f747d ? 1 : 0).setTtcIndex(kVar.f745b);
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

    public Font V(F.k kVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // V6.b
    public final Typeface o(Context context, A.e eVar, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (A.f fVar : eVar.f14a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f20f).setWeight(fVar.f16b).setSlant(fVar.f17c ? 1 : 0).setTtcIndex(fVar.f19e).setFontVariationSettings(fVar.f18d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(T(build2, i2).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // V6.b
    public final Typeface p(Context context, F.k[] kVarArr, int i2) {
        try {
            FontFamily U4 = U(kVarArr, context.getContentResolver());
            if (U4 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(U4).setStyle(T(U4, i2).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // V6.b
    public final Typeface q(Context context, List list, int i2) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily U4 = U((F.k[]) list.get(0), contentResolver);
            if (U4 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(U4);
            for (int i5 = 1; i5 < list.size(); i5++) {
                FontFamily U7 = U((F.k[]) list.get(i5), contentResolver);
                if (U7 != null) {
                    customFallbackBuilder.addCustomFallback(U7);
                }
            }
            return customFallbackBuilder.setStyle(T(U4, i2).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // V6.b
    public final Typeface r(Context context, Resources resources, int i2, String str, int i5) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }
}
