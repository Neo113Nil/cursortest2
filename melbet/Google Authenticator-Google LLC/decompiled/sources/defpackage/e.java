package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "SIMPLE";
            case 3:
                return "CHOICE";
            case 4:
                return "PLURAL";
            case 5:
                return "SELECT";
            case 6:
                return "SELECTORDINAL";
            default:
                return "null";
        }
    }

    public static boolean b(int i) {
        return i == 4 || i == 6;
    }

    public static final void c(Runnable runnable) {
        aok.a.a("androidx.fragment");
        cyi cyiVar = cyi.a;
        try {
            runnable.run();
        } finally {
        }
    }

    public static final int d(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public static final void e(Context context) {
        context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public static Drawable f(Context context, int i) {
        return ls.e().c(context, i);
    }

    public static vv g(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return vv.c(languageTags);
    }

    public static void h(Configuration configuration, vv vvVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(vvVar.e());
        configuration.setLocales(forLanguageTags);
    }

    public static void i(faa faaVar, bya byaVar) {
        hoq.X(faaVar, byn.class, new bvn(byaVar, 6));
        hoq.X(faaVar, bxz.class, new byb(byaVar));
    }

    public static void j(faa faaVar, bxq bxqVar) {
        hoq.X(faaVar, bxk.class, new bvn(bxqVar, 2));
        hoq.X(faaVar, bxy.class, new bvn(bxqVar, 3));
        hoq.X(faaVar, bxl.class, new bvn(bxqVar, 4));
        hoq.X(faaVar, bye.class, new bvn(bxqVar, 5));
    }

    public static void k(faa faaVar, bvm bvmVar) {
        hoq.X(faaVar, bwf.class, new bop(bvmVar, 14));
        hoq.X(faaVar, bwa.class, new bop(bvmVar, 15));
        hoq.X(faaVar, bur.class, new bop(bvmVar, 16));
        hoq.X(faaVar, bvd.class, new bop(bvmVar, 17));
        hoq.X(faaVar, bvu.class, new bop(bvmVar, 18));
        hoq.X(faaVar, bvv.class, new bop(bvmVar, 19));
        hoq.X(faaVar, but.class, new bop(bvmVar, 20));
        hoq.X(faaVar, bus.class, new bvn(bvmVar, 1));
        hoq.X(faaVar, buq.class, new bvn(bvmVar, 0));
        hoq.X(faaVar, bvs.class, new bop(bvmVar, 10));
        hoq.X(faaVar, bvt.class, new bop(bvmVar, 11));
        hoq.X(faaVar, bux.class, new bop(bvmVar, 12));
        hoq.X(faaVar, bvr.class, new bop(bvmVar, 13));
    }

    public static void l(faa faaVar, bse bseVar) {
        hoq.X(faaVar, bsd.class, new bop(bseVar, 9));
    }

    public static void m(faa faaVar, bri briVar) {
        hoq.X(faaVar, brg.class, new bop(briVar, 6));
    }

    public static void n(faa faaVar, bqw bqwVar) {
        hoq.X(faaVar, bqa.class, new bop(bqwVar, 4));
        hoq.X(faaVar, bqu.class, new bop(bqwVar, 5));
    }
}
