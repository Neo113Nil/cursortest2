package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ara extends kr {
    public final ael a;
    public final by e;
    public final qq f;
    public final qq g;
    public boolean h;
    public boolean i;
    public final brn j;
    private final qq k;
    private aqy l;

    public ara(bd bdVar) {
        by F = bdVar.F();
        ael aelVar = ((glo) bdVar).c;
        this.f = new qq(null);
        this.g = new qq(null);
        this.k = new qq(null);
        this.j = new brn((byte[]) null, (byte[]) null, (short[]) null);
        this.h = false;
        this.i = false;
        this.e = F;
        this.a = aelVar;
        super.o(true);
    }

    private final Long B(int i) {
        int i2 = 0;
        Long l = null;
        while (true) {
            qq qqVar = this.k;
            if (i2 >= qqVar.b()) {
                return l;
            }
            if (((Integer) qqVar.e(i2)).intValue() == i) {
                if (l != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l = Long.valueOf(qqVar.c(i2));
            }
            i2++;
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    private final void C(long j) {
        ViewParent parent;
        qq qqVar = this.f;
        bd bdVar = (bd) qqVar.d(j);
        if (bdVar == null) {
            return;
        }
        View view = bdVar.R;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!y(j)) {
            this.g.h(j);
        }
        if (!bdVar.ao()) {
            qqVar.h(j);
            return;
        }
        if (w()) {
            this.i = true;
            return;
        }
        if (bdVar.ao() && y(j)) {
            brn brnVar = this.j;
            ArrayList arrayList = new ArrayList();
            Iterator it = brnVar.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((ym) it.next()).o());
            }
            by byVar = this.e;
            gam k = byVar.b.k(bdVar.m);
            if (k == null || !((bd) k.e).equals(bdVar)) {
                byVar.O(new IllegalStateException(a.ab(bdVar, "Fragment ", " is not currently in the FragmentManager")));
            }
            bc bcVar = ((bd) k.e).h >= 0 ? new bc(k.h()) : null;
            brn.C(arrayList);
            this.g.g(j, bcVar);
        }
        brn brnVar2 = this.j;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = brnVar2.a.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ym) it2.next()).n());
        }
        try {
            ae aeVar = new ae(this.e);
            aeVar.i(bdVar);
            aeVar.c();
            qqVar.h(j);
        } finally {
            brn.C(arrayList2);
        }
    }

    private final void D(bd bdVar, FrameLayout frameLayout) {
        awc awcVar = new awc(bdVar, frameLayout);
        ((CopyOnWriteArrayList) this.e.x.a).add(new brn(awcVar, (char[]) null));
    }

    public static String t(String str, long j) {
        return str + j;
    }

    public static boolean v(String str, String str2) {
        return str.startsWith(str2) && str.length() > 2;
    }

    public static final void x(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public static final boolean y(long j) {
        return j >= 0 && j < 4;
    }

    public static long z(String str) {
        return Long.parseLong(str.substring(2));
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    public final void A(lp lpVar) {
        bd bdVar = (bd) this.f.d(lpVar.e);
        if (bdVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout B = lpVar.B();
        View view = bdVar.R;
        if (!bdVar.ao() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (bdVar.ao() && view == null) {
            D(bdVar, B);
            return;
        }
        if (bdVar.ao() && view.getParent() != null) {
            if (view.getParent() != B) {
                x(view, B);
                return;
            }
            return;
        }
        if (bdVar.ao()) {
            x(view, B);
            return;
        }
        if (w()) {
            if (this.e.u) {
                return;
            }
            this.a.a(new nv(this, lpVar, 4, null));
            return;
        }
        D(bdVar, B);
        brn brnVar = this.j;
        ArrayList arrayList = new ArrayList();
        Iterator it = brnVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((ym) it.next()).m());
        }
        try {
            bdVar.aj(false);
            ae aeVar = new ae(this.e);
            aeVar.d(0, bdVar, "f" + lpVar.e, 1);
            aeVar.j(bdVar, aek.d);
            aeVar.c();
            this.l.a(false);
        } finally {
            brn.C(arrayList);
        }
    }

    @Override // defpackage.kr
    public final int a() {
        return 4;
    }

    @Override // defpackage.kr
    public final long c(int i) {
        return i;
    }

    @Override // defpackage.kr
    public final /* synthetic */ lp d(ViewGroup viewGroup, int i) {
        int i2 = lp.s;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new lp(frameLayout);
    }

    @Override // defpackage.kr
    public final void j(RecyclerView recyclerView) {
        if (this.l != null) {
            throw new IllegalArgumentException();
        }
        aqy aqyVar = new aqy(this);
        this.l = aqyVar;
        aqyVar.b = aqy.b(recyclerView);
        aqyVar.e = new aqx(aqyVar);
        aqyVar.b.j(aqyVar.e);
        aqyVar.d = new aqw(aqyVar);
        ara araVar = aqyVar.c;
        araVar.r(aqyVar.d);
        aqyVar.a = new na(aqyVar, 3, null);
        araVar.a.a(aqyVar.a);
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void k(lp lpVar, int i) {
        Bundle bundle;
        long j = lpVar.e;
        int id = lpVar.B().getId();
        Long B = B(id);
        if (B != null && B.longValue() != j) {
            C(B.longValue());
            this.k.h(B.longValue());
        }
        this.k.g(j, Integer.valueOf(id));
        long j2 = i;
        qq qqVar = this.f;
        if (!qqVar.i(j2)) {
            String valueOf = String.valueOf(i);
            bsg bsgVar = new bsg();
            jqq.g(bsgVar);
            gmb.c(bsgVar, valueOf);
            bc bcVar = (bc) this.g.d(j2);
            if (bsgVar.C != null) {
                throw new IllegalStateException("Fragment already added");
            }
            Bundle bundle2 = null;
            if (bcVar != null && (bundle = bcVar.a) != null) {
                bundle2 = bundle;
            }
            bsgVar.i = bundle2;
            qqVar.g(j2, bsgVar);
        }
        if (lpVar.B().isAttachedToWindow()) {
            A(lpVar);
        }
        u();
    }

    @Override // defpackage.kr
    public final void l(RecyclerView recyclerView) {
        aqy aqyVar = this.l;
        ViewPager2 b = aqy.b(recyclerView);
        b.a.a.remove(aqyVar.e);
        ara araVar = aqyVar.c;
        araVar.s(aqyVar.d);
        araVar.a.c(aqyVar.a);
        aqyVar.b = null;
        this.l = null;
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void m(lp lpVar) {
        A(lpVar);
        u();
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void n(lp lpVar) {
        Long B = B(lpVar.B().getId());
        if (B != null) {
            C(B.longValue());
            this.k.h(B.longValue());
        }
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ boolean q() {
        return true;
    }

    public final void u() {
        qq qqVar;
        bd bdVar;
        View view;
        if (!this.i || w()) {
            return;
        }
        qk qkVar = new qk(0);
        int i = 0;
        while (true) {
            qqVar = this.f;
            if (i >= qqVar.b()) {
                break;
            }
            long c = qqVar.c(i);
            if (!y(c)) {
                qkVar.add(Long.valueOf(c));
                this.k.h(c);
            }
            i++;
        }
        if (!this.h) {
            this.i = false;
            for (int i2 = 0; i2 < qqVar.b(); i2++) {
                long c2 = qqVar.c(i2);
                if (!this.k.i(c2) && ((bdVar = (bd) qqVar.d(c2)) == null || (view = bdVar.R) == null || view.getParent() == null)) {
                    qkVar.add(Long.valueOf(c2));
                }
            }
        }
        qj qjVar = new qj(qkVar);
        while (qjVar.hasNext()) {
            C(((Long) qjVar.next()).longValue());
        }
    }

    public final boolean w() {
        return this.e.X();
    }
}
