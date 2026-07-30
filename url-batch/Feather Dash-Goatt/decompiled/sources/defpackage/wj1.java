package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import com.feathherdashh.dashgame.R;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class wj1 {
    public static final tc1 a;
    public static final lj0 b;

    static {
        ca0.e("TypefaceCompat static init");
        tc1 tc1Var = new tc1(3);
        new ConcurrentHashMap();
        a = tc1Var;
        b = new lj0(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, z20[] z20VarArr) {
        ca0.e("TypefaceCompat.createFromFontInfo");
        try {
            a.getClass();
            Typeface typeface = null;
            try {
                FontFamily d = tc1.d(z20VarArr, context.getContentResolver());
                if (d != null) {
                    typeface = new Typeface.CustomFallbackBuilder(d).setStyle(tc1.c(d).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            return typeface;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r13.equals(r2) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface b(Context context, m20 m20Var, Resources resources, String str, int i, p4 p4Var) {
        Typeface typeface;
        Typeface typeface2 = null;
        int i2 = 0;
        if (m20Var instanceof p20) {
            p20 p20Var = (p20) m20Var;
            String str2 = p20Var.c;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                return typeface;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            sc1 sc1Var = new sc1(3);
            f20 f20Var = p20Var.b;
            f20 f20Var2 = p20Var.a;
            List of = f20Var != null ? List.of(f20Var2, f20Var) : List.of(f20Var2);
            w21 w21Var = new w21(0, handler);
            yw ywVar = new yw(sc1Var, 5, w21Var);
            if (of.size() > 1) {
                dd0.e("Fallbacks with blocking fetches are not supported for performance reasons");
                return null;
            }
            f20 f20Var3 = (f20) of.get(0);
            lj0 lj0Var = l20.a;
            List of2 = List.of(f20Var3);
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < of2.size(); i3++) {
                sb.append(((f20) of2.get(i3)).e);
                sb.append("-0");
                if (i3 < of2.size() - 1) {
                    sb.append(";");
                }
            }
            String sb2 = sb.toString();
            typeface2 = (Typeface) l20.a.a(sb2);
            if (typeface2 != null) {
                w21Var.execute(new lf(sc1Var, i2, typeface2));
            } else {
                k20 a2 = l20.a(sb2, context, List.of(f20Var3));
                ywVar.o(a2);
                typeface2 = a2.a;
            }
        } else {
            n20 n20Var = (n20) m20Var;
            a.getClass();
            try {
                o20[] o20VarArr = n20Var.a;
                int length = o20VarArr.length;
                FontFamily.Builder builder = null;
                while (i2 < length) {
                    o20 o20Var = o20VarArr[i2];
                    try {
                        Font build = new Font.Builder(resources, o20Var.e).setWeight(o20Var.a).setSlant(o20Var.b ? 1 : 0).setTtcIndex(o20Var.d).setFontVariationSettings(o20Var.c).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (IOException unused) {
                    }
                    i2++;
                }
                if (builder != null) {
                    FontFamily build2 = builder.build();
                    typeface2 = new Typeface.CustomFallbackBuilder(build2).setStyle(tc1.c(build2).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
        }
        if (typeface2 != null) {
            b.b(d(resources, str, i), typeface2);
        }
        return typeface2;
    }

    public static Typeface c(Resources resources, String str, int i) {
        Typeface typeface;
        a.getClass();
        try {
            Font build = new Font.Builder(resources, R.font.brlnsdb).build();
            typeface = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            typeface = null;
        }
        if (typeface != null) {
            b.b(d(resources, str, i), typeface);
        }
        return typeface;
    }

    public static String d(Resources resources, String str, int i) {
        return resources.getResourcePackageName(R.font.brlnsdb) + '-' + str + '-' + i + '-' + R.font.brlnsdb + "-0";
    }
}
