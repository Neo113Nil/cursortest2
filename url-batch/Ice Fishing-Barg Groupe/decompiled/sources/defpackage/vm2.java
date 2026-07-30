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
import com.ice.fishing.grenza.R;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class vm2 extends vi0 {
    public static int PsecLrZVVK61(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Font qudtW7lwm99e(FontFamily fontFamily) {
        FontStyle fontStyle = new FontStyle(400, 0);
        Font font = fontFamily.getFont(0);
        int PsecLrZVVK61 = PsecLrZVVK61(fontStyle, font.getStyle());
        for (int i = 1; i < fontFamily.getSize(); i++) {
            Font font2 = fontFamily.getFont(i);
            int PsecLrZVVK612 = PsecLrZVVK61(fontStyle, font2.getStyle());
            if (PsecLrZVVK612 < PsecLrZVVK61) {
                font = font2;
                PsecLrZVVK61 = PsecLrZVVK612;
            }
        }
        return font;
    }

    public Font D0aTLcX6Uhyo(zc0 zc0Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.vi0
    public final Typeface cpQdD2nAriOS(Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily jJwa0q7P5wHq = jJwa0q7P5wHq((zc0[]) list.get(0), contentResolver);
            if (jJwa0q7P5wHq == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(jJwa0q7P5wHq);
            for (int i = 1; i < list.size(); i++) {
                FontFamily jJwa0q7P5wHq2 = jJwa0q7P5wHq((zc0[]) list.get(i), contentResolver);
                if (jJwa0q7P5wHq2 != null) {
                    customFallbackBuilder.addCustomFallback(jJwa0q7P5wHq2);
                }
            }
            return customFallbackBuilder.setStyle(qudtW7lwm99e(jJwa0q7P5wHq).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.vi0
    public final Typeface dgRBjINgWbAK(Context context, jc0 jc0Var, Resources resources) {
        try {
            FontFamily.Builder builder = null;
            for (kc0 kc0Var : jc0Var.PxuCJdSBwIXG) {
                try {
                    Font build = new Font.Builder(resources, kc0Var.a92UlCVFR9N8).setWeight(kc0Var.lS5Rgt96tfkO).setSlant(kc0Var.TSizfFm2Yiuu ? 1 : 0).setTtcIndex(kc0Var.e9gEMXR7LXtO).setFontVariationSettings(kc0Var.Y1f8riQaR6yg).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(qudtW7lwm99e(build2).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final FontFamily jJwa0q7P5wHq(zc0[] zc0VarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (zc0 zc0Var : zc0VarArr) {
            if (Objects.equals(zc0Var.PxuCJdSBwIXG.getScheme(), "systemfont")) {
                font = D0aTLcX6Uhyo(zc0Var);
            } else {
                try {
                    Uri uri = zc0Var.PxuCJdSBwIXG;
                    str = zc0Var.e9gEMXR7LXtO;
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
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(zc0Var.TSizfFm2Yiuu).setSlant(zc0Var.Y1f8riQaR6yg ? 1 : 0).setTtcIndex(zc0Var.lS5Rgt96tfkO);
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

    @Override // defpackage.vi0
    public final Typeface r3s1LDPKFs1S(Context context, Resources resources, String str) {
        try {
            Font build = new Font.Builder(resources, R.font.roboto).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.vi0
    public final Typeface x50lh2ztY7Y5(Context context, zc0[] zc0VarArr) {
        try {
            FontFamily jJwa0q7P5wHq = jJwa0q7P5wHq(zc0VarArr, context.getContentResolver());
            if (jJwa0q7P5wHq == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(jJwa0q7P5wHq).setStyle(qudtW7lwm99e(jJwa0q7P5wHq).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
