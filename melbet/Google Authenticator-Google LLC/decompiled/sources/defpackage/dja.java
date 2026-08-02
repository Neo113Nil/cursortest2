package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.SimpleAvatarView;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dja {
    public static volatile dja c;

    public dja() {
    }

    public static jiv A(View view, View.OnClickListener onClickListener) {
        onClickListener.onClick(view);
        return jiv.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jig B(ijp ijpVar) {
        int H;
        jha jhaVar;
        ijpVar.getClass();
        int i = ijpVar.c;
        int i2 = 1;
        if (i != 15 ? (H = a.H(ijpVar.j)) == 0 : !(i == 15 && (H = a.H(((Integer) ijpVar.d).intValue())) != 0)) {
            H = 1;
        }
        int i3 = H - 1;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = 3;
            } else if (i3 == 2) {
                i2 = 2;
            } else if (i3 != 3) {
                if (i3 != 5) {
                    i2 = 11;
                }
            }
            jhaVar = new jha(i2, null);
            if (jhaVar == null) {
                return new jig(jhaVar);
            }
            return null;
        }
        jhaVar = null;
        if (jhaVar == null) {
        }
    }

    public static dwc C(ijd ijdVar, Optional optional) {
        int y = a.y(ijdVar.b);
        int i = 1;
        if (y == 0) {
            y = 1;
        }
        int i2 = y - 1;
        if (i2 == 2) {
            return new dwc(new jfm(new jfh(new jha(2, new jhh(R.string.og_important_account_alert_badge_a11y_label)))), 2);
        }
        if (i2 != 3) {
            return null;
        }
        ggx ggxVar = new ggx(new ajt(17), i);
        if (true == optional.isPresent()) {
            optional = Optional.ofNullable(ggxVar.a.a(optional.get()));
        }
        return (dwc) optional.orElse(null);
    }

    public static jij D(float f, jhb jhbVar, jhh jhhVar) {
        jhq jhqVar;
        jhbVar.getClass();
        jil jilVar = new jil((int) (f * 100.0f), jhbVar);
        if (jhhVar != null) {
            jhqVar = new jhq(jhhVar, jhb.c, 5, (Integer) 1, 16);
        } else {
            jhqVar = null;
        }
        return new jij(new jik(jilVar, jhqVar));
    }

    public static boolean E(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static Object F(dsf dsfVar, jit jitVar) {
        dsg dsgVar = dsfVar.b;
        dsgVar.getClass();
        dov dovVar = dsfVar.c;
        dovVar.getClass();
        return dih.G(dsgVar, dovVar, jitVar);
    }

    public static brr G(ExecutorService executorService) {
        eq eqVar = new eq(new dxn());
        eqVar.a = executorService;
        return eqVar.a();
    }

    public static ddi a(hvi hviVar) {
        bry bryVar = new bry();
        bst bstVar = new bst((bry) bryVar.a);
        hnu.aS(hviVar, new djr(bstVar, hviVar, bryVar), huf.a);
        return (ddi) bstVar.a;
    }

    public static long b(boolean z, boolean z2, boolean z3, int i, int i2, int i3, long j) {
        long j2 = true != z ? 0L : 1L;
        long j3 = (true != z2 ? 0L : 1L) | (j2 + j2);
        return (((((((((j3 + j3) | (true == z3 ? 1L : 0L)) << 6) | ((i + 21) & 63)) << 6) | (i2 + 21)) << 6) | ((i3 + 21) & 63)) << 43) | (8796093022207L & j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ExecutorService c(dio dioVar, dhm dhmVar, ThreadFactory threadFactory, dis disVar, dhr dhrVar) {
        gzp h;
        ThreadFactory threadFactory2;
        if (dhmVar.a.f()) {
            ThreadFactory threadFactory3 = threadFactory;
            dhl dhlVar = new dhl(threadFactory3);
            Set set = dhmVar.d;
            synchronized (set) {
                set.add(dhlVar);
            }
            h = gzp.h(dhlVar);
            threadFactory2 = threadFactory3;
        } else {
            h = gyf.a;
            threadFactory2 = threadFactory;
        }
        ThreadFactory threadFactory4 = threadFactory2;
        if (h.f()) {
            threadFactory4 = h.b();
        }
        ThreadFactory threadFactory5 = threadFactory4;
        if (dioVar.c) {
            threadFactory5 = new diu(threadFactory4, disVar);
        }
        ThreadFactory threadFactory6 = threadFactory5;
        if (dioVar.d != diq.a) {
            threadFactory6 = new cxb(threadFactory5, 2);
        }
        hqf hqfVar = new hqf(dioVar.b, threadFactory6, new ath(disVar, 10), new ath(disVar, 11));
        if (!h.f()) {
            return hqfVar;
        }
        Object b = h.b();
        return new dhj((dhn) dhmVar.a.b(), dhrVar, dhmVar.b, dhmVar.c, (dhl) b, dhmVar.d, hqfVar, new kee(hqfVar, null));
    }

    public static ThreadFactory d(String str, ThreadFactory threadFactory) {
        ids idsVar = new ids((char[]) null, (byte[]) null);
        idsVar.m(true);
        idsVar.n(str.concat(" Thread #%d"));
        idsVar.b = threadFactory;
        return ids.p(idsVar);
    }

    public static /* synthetic */ hvm e(koe koeVar, gzp gzpVar) {
        return gzpVar.f() ? (hvm) gzpVar.b() : (hvm) koeVar.b();
    }

    public static dis f(cbp cbpVar, dio dioVar) {
        return dioVar.c ? cbpVar.c(dioVar) : dis.a;
    }

    public static int g(ehr ehrVar, jfr jfrVar) {
        jfrVar.getClass();
        if (ehrVar != null) {
            return jfrVar.b(ehrVar.a) ? 1 : 2;
        }
        return 3;
    }

    public static dql l(Context context, boolean z) {
        if (z) {
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.og_apd_premium_ring_gap);
            return new dql(new dqm(resources.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_large_ring), resources.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_legacy_large_ring), resources.getDimensionPixelSize(R.dimen.og_apd_premium_large_ring_width), resources.getDimensionPixelSize(R.dimen.og_apd_premium_large_ring_width), resources.getDimensionPixelSize(R.dimen.og_apd_premium_small_ring_width), dimensionPixelSize, dimensionPixelSize, dimensionPixelSize));
        }
        Resources resources2 = context.getResources();
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.og_apd_legacy_large_ring_width);
        int dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.og_apd_large_ring_width);
        int dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.og_apd_small_ring_width);
        return new dql(new dqm(resources2.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_large_ring), resources2.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_legacy_large_ring), dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize4, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4));
    }

    public static dqk m(dqr dqrVar, String str, ecj ecjVar, int i) {
        return new dqk(dqrVar, ecjVar, str, i);
    }

    public static int n(Resources resources, int i, int i2) {
        resources.getClass();
        if (i2 != 0) {
            return i2 == 2 ? resources.getDimensionPixelSize(R.dimen.og_apd_overlapping_badge_size) : i > resources.getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_medium_badge) ? resources.getDimensionPixelSize(R.dimen.og_apd_large_badge_size) : i > resources.getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_small_badge) ? resources.getDimensionPixelSize(R.dimen.og_apd_medium_badge_size) : i > resources.getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_extra_small_badge) ? resources.getDimensionPixelSize(R.dimen.og_apd_small_badge_size) : resources.getDimensionPixelSize(R.dimen.og_apd_extra_small_badge_size);
        }
        throw null;
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? i != 2 ? "RED_ALERT" : "YELLOW_ALERT" : "APP_CUSTOM";
    }

    public static Integer p(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? 0 : 4;
        }
        return 3;
    }

    public static int q(boolean z) {
        return z ? R.color.google_white : R.color.og_elevation_dark_5;
    }

    public static int r(boolean z) {
        return z ? R.color.google_grey900 : R.color.google_grey100;
    }

    public static int s(boolean z) {
        return z ? R.color.google_grey100 : R.color.google_grey800;
    }

    public static dzi x(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        context.getClass();
        dye dyeVar = new dye(context);
        viewGroup.addView(dyeVar, new ViewGroup.LayoutParams(-2, -2));
        int dimensionPixelSize = dyeVar.getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_card_default_button_vertical_margin);
        return new dzi(dyeVar, dimensionPixelSize, dimensionPixelSize);
    }

    public static void y(SimpleAvatarView simpleAvatarView, boolean z) {
        simpleAvatarView.q(z ? simpleAvatarView.getResources().getDimensionPixelSize(R.dimen.og_apd_compact_avatar_size) : simpleAvatarView.getResources().getDimensionPixelSize(R.dimen.bento_selected_account_avatar_size));
    }

    public static void z(View view, View view2, View view3, boolean z, View view4) {
        int i;
        if (!z) {
            i = 0;
        } else if (view4.getVisibility() == 0 || view3.getVisibility() == 0) {
            Resources resources = view.getResources();
            resources.getClass();
            i = dih.aa(resources.getDisplayMetrics(), 32) - ((int) (resources.getDisplayMetrics().scaledDensity * 6.0f));
        } else {
            i = dih.aa(view.getResources().getDisplayMetrics(), 4);
        }
        view.setPadding(view.getPaddingLeft(), (view2.getBottom() - i) - ((z && view4.getVisibility() == 0) ? 0 : dih.aa(view.getResources().getDisplayMetrics(), 6)), view.getPaddingRight(), view.getPaddingBottom());
    }

    public gzp t() {
        return gyf.a;
    }

    public gzp u() {
        return gyf.a;
    }

    public final eaq w(ViewGroup viewGroup) {
        return new eaq(viewGroup, hoq.v(new cud(viewGroup, 15)), hoq.v(new cud(viewGroup, 16)), hoq.v(new dxi(viewGroup, this, 7)));
    }

    public dja(char[] cArr) {
    }

    public void k(Object obj, int i) {
    }

    public void i() {
    }

    public void v() {
    }

    public void h(hel helVar) {
    }

    public void j(Object obj) {
    }
}
