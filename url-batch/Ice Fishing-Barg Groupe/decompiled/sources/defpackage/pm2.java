package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.ice.fishing.grenza.R;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class pm2 {
    public static final vi0 PxuCJdSBwIXG;
    public static Paint TSizfFm2Yiuu;
    public static final b41 lS5Rgt96tfkO;

    static {
        sj0.wdg6QnbFHrFF("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            PxuCJdSBwIXG = new wm2();
        } else if (i >= 29) {
            PxuCJdSBwIXG = new vm2();
        } else if (i >= 28) {
            PxuCJdSBwIXG = new um2();
        } else if (i >= 26) {
            PxuCJdSBwIXG = new tm2();
        } else {
            Method method = rm2.a92UlCVFR9N8;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                PxuCJdSBwIXG = new rm2();
            } else {
                PxuCJdSBwIXG = new qm2();
            }
        }
        lS5Rgt96tfkO = new b41(16);
        TSizfFm2Yiuu = null;
        Trace.endSection();
    }

    public static Typeface PxuCJdSBwIXG(Context context, ic0 ic0Var, Resources resources, String str, int i, hq0 hq0Var) {
        Typeface dgRBjINgWbAK;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        boolean z = ic0Var instanceof lc0;
        b41 b41Var = lS5Rgt96tfkO;
        if (z) {
            lc0 lc0Var = (lc0) ic0Var;
            String str2 = lc0Var.lS5Rgt96tfkO;
            int i2 = 0;
            if (TextUtils.isEmpty(str2) || (build = TSizfFm2Yiuu(str2)) == null) {
                ArrayList arrayList = lc0Var.PxuCJdSBwIXG;
                if (arrayList.size() == 1) {
                    build = TSizfFm2Yiuu(((bc0) arrayList.get(0)).e9gEMXR7LXtO);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= arrayList.size()) {
                                        break;
                                    }
                                    bc0 bc0Var = (bc0) arrayList.get(i4);
                                    if (i4 == arrayList.size() - 1 && TextUtils.isEmpty(bc0Var.a92UlCVFR9N8)) {
                                        customFallbackBuilder.setSystemFallback(bc0Var.e9gEMXR7LXtO);
                                        break;
                                    }
                                    String str3 = bc0Var.e9gEMXR7LXtO;
                                    String str4 = bc0Var.a92UlCVFR9N8;
                                    Font Y1f8riQaR6yg = Y1f8riQaR6yg(TSizfFm2Yiuu(str3));
                                    if (Y1f8riQaR6yg == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + bc0Var.e9gEMXR7LXtO + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = yh0.pnx5pC0XzaCw(Y1f8riQaR6yg).build();
                                    } else {
                                        try {
                                            yh0.dgRBjINgWbAK();
                                            yh0.IAToe7bXGz4N();
                                            fontVariationSettings = sx2.PxuCJdSBwIXG(Y1f8riQaR6yg).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = yh0.wdg6QnbFHrFF(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = yh0.RAsUl2FVSrh6(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i4++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (TSizfFm2Yiuu(((bc0) arrayList.get(i3)).e9gEMXR7LXtO) == null) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                b41Var.Y1f8riQaR6yg(lS5Rgt96tfkO(resources, str, i), build);
                return build;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            ib0 ib0Var = new ib0(20);
            ArrayList arrayList2 = lc0Var.PxuCJdSBwIXG;
            dv1 dv1Var = new dv1(handler);
            op0 op0Var = new op0(5, ib0Var, dv1Var);
            if (arrayList2.size() > 1) {
                u9.XL4ISE6Oc65B("Fallbacks with blocking fetches are not supported for performance reasons");
                return null;
            }
            bc0 bc0Var2 = (bc0) arrayList2.get(0);
            b41 b41Var2 = hc0.PxuCJdSBwIXG;
            ArrayList arrayList3 = new ArrayList(1);
            Object obj = new Object[]{bc0Var2}[0];
            Objects.requireNonNull(obj);
            arrayList3.add(obj);
            List unmodifiableList = Collections.unmodifiableList(arrayList3);
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < unmodifiableList.size(); i5++) {
                sb.append(((bc0) unmodifiableList.get(i5)).RAsUl2FVSrh6);
                sb.append("-0");
                if (i5 < unmodifiableList.size() - 1) {
                    sb.append(";");
                }
            }
            String sb2 = sb.toString();
            dgRBjINgWbAK = (Typeface) hc0.PxuCJdSBwIXG.TSizfFm2Yiuu(sb2);
            if (dgRBjINgWbAK != null) {
                dv1Var.execute(new sh(i2, ib0Var, dgRBjINgWbAK));
            } else {
                ArrayList arrayList4 = new ArrayList(1);
                Object obj2 = new Object[]{bc0Var2}[0];
                Objects.requireNonNull(obj2);
                arrayList4.add(obj2);
                gc0 PxuCJdSBwIXG2 = hc0.PxuCJdSBwIXG(sb2, context, Collections.unmodifiableList(arrayList4));
                op0Var.S9EYkSpbGuxq(PxuCJdSBwIXG2);
                dgRBjINgWbAK = PxuCJdSBwIXG2.PxuCJdSBwIXG;
            }
        } else {
            dgRBjINgWbAK = PxuCJdSBwIXG.dgRBjINgWbAK(context, (jc0) ic0Var, resources);
        }
        if (dgRBjINgWbAK != null) {
            b41Var.Y1f8riQaR6yg(lS5Rgt96tfkO(resources, str, i), dgRBjINgWbAK);
        }
        return dgRBjINgWbAK;
    }

    public static Typeface TSizfFm2Yiuu(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font Y1f8riQaR6yg(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (TSizfFm2Yiuu == null) {
            TSizfFm2Yiuu = new Paint();
        }
        TSizfFm2Yiuu.setTextSize(10.0f);
        TSizfFm2Yiuu.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, TSizfFm2Yiuu);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }

    public static String lS5Rgt96tfkO(Resources resources, String str, int i) {
        return resources.getResourcePackageName(R.font.roboto) + '-' + str + '-' + i + '-' + R.font.roboto + "-0";
    }
}
