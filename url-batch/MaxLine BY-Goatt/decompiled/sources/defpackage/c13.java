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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class c13 extends th2 {
    public static Font q(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int t = t(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int t2 = t(fontStyle, font2.getStyle());
            if (t2 < t) {
                font = font2;
                t = t2;
            }
        }
        return font;
    }

    public static int t(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.th2
    public final Typeface d(Context context, zp0 zp0Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (aq0 aq0Var : zp0Var.a) {
                try {
                    Font build = new Font.Builder(resources, aq0Var.f).setWeight(aq0Var.b).setSlant(aq0Var.c ? 1 : 0).setTtcIndex(aq0Var.e).setFontVariationSettings(aq0Var.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(q(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.th2
    public final Typeface e(Context context, mq0[] mq0VarArr, int i) {
        try {
            FontFamily r = r(mq0VarArr, context.getContentResolver());
            if (r == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(r).setStyle(q(r, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.th2
    public final Typeface f(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily r = r((mq0[]) list.get(0), contentResolver);
            if (r == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(r);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily r2 = r((mq0[]) list.get(i2), contentResolver);
                if (r2 != null) {
                    customFallbackBuilder.addCustomFallback(r2);
                }
            }
            return customFallbackBuilder.setStyle(q(r, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.th2
    public final Typeface g(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final FontFamily r(mq0[] mq0VarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (mq0 mq0Var : mq0VarArr) {
            if (Objects.equals(mq0Var.a.getScheme(), "systemfont")) {
                font = s(mq0Var);
            } else {
                try {
                    Uri uri = mq0Var.a;
                    str = mq0Var.e;
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
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(mq0Var.c).setSlant(mq0Var.d ? 1 : 0).setTtcIndex(mq0Var.b);
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

    public Font s(mq0 mq0Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
