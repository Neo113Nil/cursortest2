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
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vh extends vl {
    private static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        return abs + (slant == slant2 ? 0 : 2);
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Font j(FontFamily fontFamily, int i) {
        Font font;
        FontStyle style;
        int size;
        Font font2;
        FontStyle style2;
        int i2 = 1;
        FontStyle fontStyle = new FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0);
        font = fontFamily.getFont(0);
        style = font.getStyle();
        int i3 = i(fontStyle, style);
        while (i2 < size) {
            font2 = fontFamily.getFont(i2);
            style2 = font2.getStyle();
            int i4 = i(fontStyle, style2);
            int i5 = i4 < i3 ? i4 : i3;
            if (i4 < i3) {
                font = font2;
            }
            i2++;
            i3 = i5;
        }
        return font;
    }

    @Override // defpackage.vl
    public final Typeface a(Context context, wh[] whVarArr, int i) {
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build;
        try {
            FontFamily h = h(whVarArr, context.getContentResolver());
            if (h == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(h);
            style = j(h, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build = style2.build();
            return build;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.vl
    public final Typeface b(Context context, brn brnVar, Resources resources, int i) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            Object obj = brnVar.a;
            int length = ((wh[]) obj).length;
            FontFamily.Builder builder = null;
            for (int i2 = 0; i2 < length; i2++) {
                wh whVar = ((wh[]) obj)[i2];
                try {
                    weight = new Font.Builder(resources, whVar.e).setWeight(whVar.b);
                    slant = weight.setSlant(whVar.c ? 1 : 0);
                    ttcIndex = slant.setTtcIndex(whVar.a);
                    fontVariationSettings = ttcIndex.setFontVariationSettings(whVar.d);
                    build3 = fontVariationSettings.build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build3);
                    } else {
                        builder.addFont(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = j(build, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.vl
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            build = new Font.Builder(resources, i).build();
            build2 = new FontFamily.Builder(build).build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
            style = build.getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    protected Font e(wh whVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.vl
    protected final wh f(wh[] whVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.vl
    public final Typeface g(Context context, List list, int i) {
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily h = h((wh[]) list.get(0), contentResolver);
            if (h == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(h);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily h2 = h((wh[]) list.get(i2), contentResolver);
                if (h2 != null) {
                    customFallbackBuilder.addCustomFallback(h2);
                }
            }
            style = j(h, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build = style2.build();
            return build;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    protected final FontFamily h(wh[] whVarArr, ContentResolver contentResolver) {
        FontFamily build;
        Font font;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        FontFamily.Builder builder = null;
        for (wh whVar : whVarArr) {
            if (whVar.a()) {
                font = e(whVar);
            } else {
                try {
                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor((Uri) whVar.f, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            weight = new Font.Builder(openFileDescriptor).setWeight(whVar.b);
                            slant = weight.setSlant(whVar.c ? 1 : 0);
                            ttcIndex = slant.setTtcIndex(whVar.a);
                            String str = whVar.d;
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
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                font = null;
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
        build = builder.build();
        return build;
    }

    @Override // defpackage.vl
    protected final Typeface m(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
