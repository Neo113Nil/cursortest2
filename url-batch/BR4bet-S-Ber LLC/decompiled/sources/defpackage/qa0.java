package defpackage;

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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class qa0 extends xf {
    public static Font P(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int S = S(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int S2 = S(fontStyle, font2.getStyle());
            if (S2 < S) {
                font = font2;
                S = S2;
            }
        }
        return font;
    }

    public static int S(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily Q(hm[] hmVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (hm hmVar : hmVarArr) {
            if (Objects.equals(hmVar.a.getScheme(), "systemfont")) {
                font = R(hmVar);
            } else {
                try {
                    Uri uri = hmVar.a;
                    str = hmVar.e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(hmVar.c).setSlant(hmVar.d ? 1 : 0).setTtcIndex(hmVar.b);
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

    public Font R(hm hmVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.xf
    public final Typeface k(Context context, em emVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (fm fmVar : emVar.a) {
                try {
                    Font build = new Font.Builder(resources, fmVar.f).setWeight(fmVar.b).setSlant(fmVar.c ? 1 : 0).setTtcIndex(fmVar.e).setFontVariationSettings(fmVar.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(P(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.xf
    public final Typeface l(Context context, hm[] hmVarArr, int i) {
        try {
            FontFamily Q = Q(hmVarArr, context.getContentResolver());
            if (Q == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(Q).setStyle(P(Q, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.xf
    public final Typeface m(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily Q = Q((hm[]) list.get(0), contentResolver);
            if (Q == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(Q);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily Q2 = Q((hm[]) list.get(i2), contentResolver);
                if (Q2 != null) {
                    customFallbackBuilder.addCustomFallback(Q2);
                }
            }
            return customFallbackBuilder.setStyle(P(Q, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.xf
    public final Typeface n(Context context, Resources resources, int i, String str) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
