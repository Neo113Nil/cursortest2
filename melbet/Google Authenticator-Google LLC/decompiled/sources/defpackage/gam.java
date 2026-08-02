package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.authenticator2.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gam {
    public final Object a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;

    public gam(brr brrVar, cd cdVar, ClassLoader classLoader, bk bkVar, Bundle bundle) {
        this.c = false;
        this.b = -1;
        this.d = brrVar;
        this.a = cdVar;
        cc ccVar = (cc) bundle.getParcelable("state");
        bd b = bkVar.b(ccVar.a);
        b.m = ccVar.b;
        b.w = ccVar.c;
        b.y = ccVar.d;
        b.z = true;
        b.G = ccVar.e;
        b.H = ccVar.f;
        b.I = ccVar.g;
        b.L = ccVar.h;
        b.t = ccVar.i;
        b.K = ccVar.j;
        b.J = ccVar.k;
        b.Z = aek.values()[ccVar.l];
        b.p = ccVar.m;
        b.q = ccVar.n;
        b.T = ccVar.o;
        this.e = b;
        b.i = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        b.ah(bundle2);
        if (by.U(2)) {
            Objects.toString(b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    private final void o() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((fer) it.next()).a();
        }
        this.c = false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void a(boolean z) {
        fao.c();
        synchronized (this.a) {
            if (z != this.c) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.c = z;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void b(Animator animator) {
        this.e.add(animator);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void c(acr acrVar) {
        this.a.add(acrVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void d(fer ferVar) {
        this.d.add(ferVar);
    }

    public final void e() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            o();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f() {
        if (this.c) {
            return;
        }
        this.c = true;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((fer) it.next()).b();
        }
        ?? r1 = this.a;
        this.b = r1.size();
        ?? r2 = this.e;
        if (!r2.isEmpty()) {
            this.b++;
        }
        if (this.b == 0) {
            o();
            return;
        }
        fep fepVar = new fep(this);
        for (acr acrVar : r1) {
            acrVar.g(fepVar);
            acrVar.e();
        }
        if (r2.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        fhq.h(animatorSet, new ArrayList((Collection) r2));
        animatorSet.addListener(new feq(this));
        animatorSet.start();
    }

    public final void g(cno cnoVar, clg clgVar, String str) {
        Object obj = this.d;
        ((qy) obj).put(cnoVar, clgVar);
        Object obj2 = this.e;
        ((qy) obj2).put(cnoVar, str);
        this.b--;
        if (!clgVar.c()) {
            this.c = true;
        }
        if (this.b == 0) {
            if (!this.c) {
                ((bst) this.a).c(obj2);
            } else {
                ((bst) this.a).b(new cmo((qi) obj));
            }
        }
    }

    public final Bundle h() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Object obj = this.e;
        bd bdVar = (bd) obj;
        if (bdVar.h == -1 && (bundle = bdVar.i) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new cc(bdVar));
        if (bdVar.h > 0) {
            Bundle bundle3 = new Bundle();
            at atVar = new at(obj, bundle3, 0);
            e eVar = bdVar.ah;
            e.c(atVar);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            ((brr) this.d).B(bdVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            bdVar.ai.j(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle a = bdVar.E.a();
            if (!a.isEmpty()) {
                bundle2.putBundle("childFragmentManager", a);
            }
            if (bdVar.R != null) {
                n();
            }
            SparseArray<? extends Parcelable> sparseArray = bdVar.j;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = bdVar.k;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = bdVar.n;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void i() {
        View view;
        View view2;
        Object obj = this.e;
        bd bdVar = (bd) obj;
        bd e = by.e(bdVar.Q);
        bd bdVar2 = bdVar.F;
        if (e != null && !e.equals(bdVar2)) {
            int i = bdVar.H;
            int i2 = ado.a;
            obj.getClass();
            adv advVar = new adv(bdVar, e, i);
            ado.d(advVar);
            adn b = ado.b(bdVar);
            if (b.b.contains(adm.e) && ado.e(b, obj.getClass(), advVar.getClass())) {
                ado.c(b, advVar);
            }
        }
        Object obj2 = this.a;
        ViewGroup viewGroup = bdVar.Q;
        int i3 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = ((cd) obj2).a;
            int indexOf = arrayList.indexOf(obj);
            int i4 = indexOf - 1;
            while (true) {
                if (i4 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        bd bdVar3 = (bd) arrayList.get(indexOf);
                        if (bdVar3.Q == viewGroup && (view = bdVar3.R) != null) {
                            i3 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    bd bdVar4 = (bd) arrayList.get(i4);
                    if (bdVar4.Q == viewGroup && (view2 = bdVar4.R) != null) {
                        i3 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i4--;
                }
            }
        }
        bdVar.Q.addView(bdVar.R, i3);
    }

    final void j() {
        String str;
        Object obj = this.e;
        bd bdVar = (bd) obj;
        if (bdVar.w) {
            return;
        }
        if (by.U(3)) {
            Objects.toString(obj);
        }
        Bundle bundle = bdVar.i;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater H = bdVar.H(bundle2);
        ViewGroup viewGroup2 = bdVar.Q;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = bdVar.H;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(a.ab(obj, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (ViewGroup) bdVar.C.m.a(i);
                if (viewGroup == null) {
                    if (!bdVar.z && !bdVar.y) {
                        try {
                            str = ((bd) obj).bs().getResourceName(((bd) obj).H);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        StringBuilder sb = new StringBuilder("No view found for id 0x");
                        Object obj2 = this.e;
                        sb.append(Integer.toHexString(((bd) obj2).H));
                        sb.append(" (");
                        sb.append(str);
                        sb.append(") for fragment ");
                        sb.append(obj2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!(viewGroup instanceof bj)) {
                    Object obj3 = this.e;
                    int i2 = ado.a;
                    obj3.getClass();
                    bd bdVar2 = (bd) obj3;
                    adu aduVar = new adu(bdVar2, viewGroup);
                    ado.d(aduVar);
                    adn b = ado.b(bdVar2);
                    if (b.b.contains(adm.i) && ado.e(b, obj3.getClass(), aduVar.getClass())) {
                        ado.c(b, aduVar);
                    }
                }
            }
        }
        Object obj4 = this.e;
        bd bdVar3 = (bd) obj4;
        bdVar3.Q = viewGroup;
        bdVar3.m(H, viewGroup, bundle2);
        if (bdVar3.R != null) {
            if (by.U(3)) {
                Objects.toString(obj4);
            }
            bdVar3.R.setSaveFromParentEnabled(false);
            bdVar3.R.setTag(R.id.fragment_container_view_tag, obj4);
            if (viewGroup != null) {
                i();
            }
            if (bdVar3.J) {
                bdVar3.R.setVisibility(8);
            }
            if (bdVar3.R.isAttachedToWindow()) {
                View view = bdVar3.R;
                int i3 = yq.a;
                view.requestApplyInsets();
            } else {
                View view2 = bdVar3.R;
                view2.addOnAttachStateChangeListener(new fu(view2, 1));
            }
            bdVar3.ae();
            ((brr) this.d).E(bdVar3, bdVar3.R, bundle2, false);
            int visibility = bdVar3.R.getVisibility();
            bdVar3.B().l = bdVar3.R.getAlpha();
            if (bdVar3.Q != null && visibility == 0) {
                View findFocus = bdVar3.R.findFocus();
                if (findFocus != null) {
                    bdVar3.ai(findFocus);
                    if (by.U(2)) {
                        Objects.toString(findFocus);
                        Objects.toString(obj4);
                    }
                }
                bdVar3.R.setAlpha(0.0f);
            }
        }
        bdVar3.h = 2;
    }

    public final void k() {
        Object obj = this.e;
        bd bdVar = (bd) obj;
        if (bdVar.w && bdVar.x && !bdVar.A) {
            if (by.U(3)) {
                Objects.toString(obj);
            }
            Bundle bundle = bdVar.i;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            bdVar.m(bdVar.H(bundle2), null, bundle2);
            View view = bdVar.R;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                bdVar.R.setTag(R.id.fragment_container_view_tag, obj);
                if (bdVar.J) {
                    bdVar.R.setVisibility(8);
                }
                bdVar.ae();
                ((brr) this.d).E(bdVar, bdVar.R, bundle2, false);
                bdVar.h = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x04b5, code lost:
    
        r12.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x056d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x07f8, code lost:
    
        if (r6 != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x056d, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [aer, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        int i;
        int i2;
        ViewGroup viewGroup;
        bd b;
        View view;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        int i3 = 2;
        if (this.c) {
            if (by.U(2)) {
                Objects.toString(this.e);
                return;
            }
            return;
        }
        int i4 = 1;
        boolean z = false;
        Object[] objArr = 0;
        try {
            this.c = true;
            Object[] objArr2 = false;
            while (true) {
                ?? r4 = this.e;
                int i5 = 6;
                int i6 = 5;
                int i7 = 4;
                int i8 = 3;
                if (((bd) r4).C == null) {
                    i = ((bd) r4).h;
                } else {
                    i = this.b;
                    int ordinal = ((bd) r4).Z.ordinal();
                    if (ordinal == 1) {
                        i = Math.min(i, 0);
                    } else if (ordinal == 2) {
                        i = Math.min(i, 1);
                    } else if (ordinal == 3) {
                        i = Math.min(i, 5);
                    } else if (ordinal != 4) {
                        i = Math.min(i, -1);
                    }
                    if (((bd) r4).w) {
                        boolean z2 = ((bd) r4).x;
                        int i9 = this.b;
                        if (z2) {
                            i = Math.max(i9, 2);
                            View view2 = ((bd) r4).R;
                            if (view2 != null && view2.getParent() == null) {
                                i = Math.min(i, 2);
                            }
                        } else {
                            i = i9 < 4 ? Math.min(i, ((bd) r4).h) : Math.min(i, 1);
                        }
                    }
                    if (((bd) r4).y && ((bd) r4).Q == null) {
                        i = Math.min(i, 4);
                    }
                    if (!((bd) r4).s) {
                        i = Math.min(i, 1);
                    }
                    ViewGroup viewGroup4 = ((bd) r4).Q;
                    if (viewGroup4 != null) {
                        cn c = cn.c(viewGroup4, ((bd) r4).G());
                        r4.getClass();
                        cm a = c.a((bd) r4);
                        i2 = a != null ? a.i : 0;
                        cm b2 = c.b((bd) r4);
                        int i10 = b2 != null ? b2.i : 0;
                        if (i2 == 0 || i2 - 1 == 0) {
                            i2 = i10;
                        }
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 2) {
                        i = Math.min(i, 6);
                    } else if (i2 == 3) {
                        i = Math.max(i, 3);
                    } else if (((bd) r4).t) {
                        i = ((bd) r4).aq() ? Math.min(i, 1) : Math.min(i, -1);
                    }
                    if (((bd) r4).S && ((bd) r4).h < 5) {
                        i = Math.min(i, 4);
                    }
                    if (((bd) r4).u) {
                        i = Math.max(i, 3);
                    }
                    if (by.U(2)) {
                        Objects.toString(r4);
                    }
                }
                int i11 = ((bd) r4).h;
                if (i == i11) {
                    if (objArr2 == false && i11 == -1 && ((bd) r4).t && !((bd) r4).aq()) {
                        boolean z3 = ((bd) r4).v;
                        if (by.U(3)) {
                            Objects.toString(r4);
                        }
                        Object obj = this.a;
                        ((cd) obj).d.a((bd) r4, true);
                        ((cd) obj).m(this);
                        if (by.U(3)) {
                            Objects.toString(r4);
                        }
                        ((bd) r4).U();
                    }
                    if (((bd) r4).V) {
                        if (((bd) r4).R != null && (viewGroup = ((bd) r4).Q) != null) {
                            cn c2 = cn.c(viewGroup, ((bd) r4).G());
                            if (((bd) r4).J) {
                                if (by.U(2)) {
                                    Objects.toString(r4);
                                }
                                c2.i(3, 1, this);
                            } else {
                                if (by.U(2)) {
                                    Objects.toString(r4);
                                }
                                c2.i(2, 1, this);
                            }
                        }
                        by byVar = ((bd) r4).C;
                        if (byVar != null && ((bd) r4).s && by.ab((bd) r4)) {
                            byVar.r = true;
                        }
                        ((bd) r4).V = false;
                        boolean z4 = ((bd) r4).J;
                        ((bd) r4).E.u();
                    }
                    return;
                }
                gam gamVar = null;
                if (i <= i11) {
                    switch (i11 - 1) {
                        case -1:
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            ((bd) r4).h = -1;
                            ((bd) r4).P = false;
                            e eVar = ((bd) r4).ah;
                            e.c(new as((bd) r4, 11));
                            ((bd) r4).W = null;
                            if (!((bd) r4).P) {
                                throw new co(a.ab(r4, "Fragment ", " did not call through to super.onDetach()"));
                            }
                            by byVar2 = ((bd) r4).E;
                            if (!byVar2.u) {
                                byVar2.r();
                                ((bd) r4).E = new by();
                            }
                            ((brr) this.d).w((bd) r4, false);
                            ((bd) r4).h = -1;
                            ((bd) r4).D = null;
                            ((bd) r4).aa.a();
                            ((bd) r4).F = null;
                            ((bd) r4).C = null;
                            if ((!((bd) r4).t || ((bd) r4).aq()) && !((cd) this.a).d.e((bd) r4)) {
                                break;
                            }
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            ((bd) r4).U();
                            break;
                        case 0:
                            boolean z5 = ((bd) r4).v;
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            Object[] objArr3 = ((bd) r4).t && !((bd) r4).aq();
                            if (objArr3 != false) {
                                boolean z6 = ((bd) r4).v;
                                ((cd) this.a).a(((bd) r4).m, null);
                            }
                            if (objArr3 == false) {
                                Object obj2 = this.a;
                                if (!((cd) obj2).d.e((bd) r4)) {
                                    String str = ((bd) r4).p;
                                    if (str != null && (b = ((cd) obj2).b(str)) != null && b.L) {
                                        ((bd) r4).o = b;
                                    }
                                    ((bd) r4).h = 0;
                                    break;
                                }
                            }
                            boolean z7 = ((bd) r4).D instanceof agl ? ((cd) this.a).d.f : !((Activity) r6.c).isChangingConfigurations();
                            if (objArr3 != false) {
                                boolean z8 = ((bd) r4).v;
                            }
                            ((cd) this.a).d.a((bd) r4, false);
                            ((bd) r4).E.r();
                            e eVar2 = ((bd) r4).ah;
                            e.c(new as((bd) r4, 19));
                            ((bd) r4).h = 0;
                            ((bd) r4).P = false;
                            ((bd) r4).X = false;
                            e.c(new as((bd) r4, 20));
                            if (!((bd) r4).P) {
                                throw new co(a.ab(r4, "Fragment ", " did not call through to super.onDestroy()"));
                            }
                            ((brr) this.d).v((bd) r4, false);
                            Object obj3 = this.a;
                            for (gam gamVar2 : ((cd) obj3).d()) {
                                if (gamVar2 != null) {
                                    Object obj4 = gamVar2.e;
                                    if (((bd) r4).m.equals(((bd) obj4).p)) {
                                        ((bd) obj4).o = (bd) r4;
                                        ((bd) obj4).p = null;
                                    }
                                }
                            }
                            String str2 = ((bd) r4).p;
                            if (str2 != null) {
                                ((bd) r4).o = ((cd) obj3).b(str2);
                            }
                            ((cd) obj3).m(this);
                            break;
                            break;
                        case 1:
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            ViewGroup viewGroup5 = ((bd) r4).Q;
                            if (viewGroup5 != null && (view = ((bd) r4).R) != null) {
                                viewGroup5.removeView(view);
                            }
                            ((bd) r4).E.B(1);
                            if (((bd) r4).R != null && ((bd) r4).ab.L().c.a(aek.c)) {
                                e eVar3 = ((bd) r4).ah;
                                e.c(new as((bd) r4, i3));
                            }
                            ((bd) r4).h = 1;
                            ((bd) r4).P = false;
                            e eVar4 = ((bd) r4).ah;
                            e.c(new as((bd) r4, i8));
                            if (!((bd) r4).P) {
                                throw new co(a.ab(r4, "Fragment ", " did not call through to super.onDestroyView()"));
                            }
                            qz qzVar = agt.a(r4).b.b;
                            int b3 = qzVar.b();
                            for (int i12 = 0; i12 < b3; i12++) {
                                ((agu) qzVar.c(i12)).l();
                            }
                            ((bd) r4).A = false;
                            ((brr) this.d).F((bd) r4, false);
                            ((bd) r4).Q = null;
                            ((bd) r4).R = null;
                            ((bd) r4).ab = null;
                            ((bd) r4).ac.i(null);
                            ((bd) r4).x = false;
                            ((bd) r4).h = 1;
                            break;
                        case 2:
                            ((bd) r4).x = false;
                            ((bd) r4).h = 2;
                            break;
                        case 3:
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            boolean z9 = ((bd) r4).v;
                            if (((bd) r4).R != null && ((bd) r4).j == null) {
                                n();
                            }
                            if (((bd) r4).R != null && (viewGroup2 = ((bd) r4).Q) != null) {
                                cn c3 = cn.c(viewGroup2, ((bd) r4).G());
                                if (by.U(2)) {
                                    Objects.toString(r4);
                                }
                                c3.i(1, 3, this);
                            }
                            ((bd) r4).h = 3;
                            break;
                        case 4:
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            ((bd) r4).E.C();
                            if (((bd) r4).R != null) {
                                e eVar5 = ((bd) r4).ah;
                                e.c(new as((bd) r4, 8));
                            }
                            e eVar6 = ((bd) r4).ah;
                            e.c(new as((bd) r4, 9));
                            ((bd) r4).h = 4;
                            ((bd) r4).P = false;
                            e.c(new as((bd) r4, 10));
                            if (!((bd) r4).P) {
                                throw new co(a.ab(r4, "Fragment ", " did not call through to super.onStop()"));
                            }
                            ((brr) this.d).D((bd) r4, false);
                            break;
                        case 5:
                            ((bd) r4).h = 5;
                            break;
                        case 6:
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            ((bd) r4).E.x();
                            if (((bd) r4).R != null) {
                                e eVar7 = ((bd) r4).ah;
                                e.c(new as((bd) r4, 16));
                            }
                            e eVar8 = ((bd) r4).ah;
                            e.c(new as((bd) r4, 17));
                            ((bd) r4).h = 6;
                            ((bd) r4).P = false;
                            e.c(new as((bd) r4, 18));
                            if (!((bd) r4).P) {
                                throw new co(a.ab(r4, "Fragment ", " did not call through to super.onPause()"));
                            }
                            ((brr) this.d).x((bd) r4, false);
                            break;
                    }
                } else {
                    switch (i11 + 1) {
                        case 0:
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            bd bdVar = ((bd) r4).o;
                            if (bdVar != null) {
                                gam k = ((cd) this.a).k(bdVar.m);
                                if (k == null) {
                                    throw new IllegalStateException("Fragment " + ((Object) r4) + " declared target fragment " + ((bd) r4).o + " that does not belong to this FragmentManager!");
                                }
                                ((bd) r4).p = ((bd) r4).o.m;
                                ((bd) r4).o = null;
                                gamVar = k;
                                break;
                            } else {
                                String str3 = ((bd) r4).p;
                                if (str3 != null && (gamVar = ((cd) this.a).k(str3)) == null) {
                                    throw new IllegalStateException("Fragment " + ((Object) r4) + " declared target fragment " + ((bd) r4).p + " that does not belong to this FragmentManager!");
                                }
                            }
                            by byVar3 = ((bd) r4).C;
                            ((bd) r4).D = byVar3.l;
                            ((bd) r4).F = byVar3.n;
                            Object obj5 = this.d;
                            ((brr) obj5).y((bd) r4, false);
                            ArrayList arrayList = ((bd) r4).af;
                            int size = arrayList.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                ((bb) arrayList.get(i13)).a();
                            }
                            arrayList.clear();
                            ((bd) r4).E.k(((bd) r4).D, ((bd) r4).bu(), (bd) r4);
                            ((bd) r4).h = 0;
                            ((bd) r4).P = false;
                            e eVar9 = ((bd) r4).ah;
                            e.c(new as((bd) r4, (int) (objArr == true ? 1 : 0)));
                            if (!((bd) r4).P) {
                                throw new co(a.ab(r4, "Fragment ", " did not call through to super.onAttach()"));
                            }
                            Iterator it = ((bd) r4).C.j.iterator();
                            while (it.hasNext()) {
                                ((cb) it.next()).e();
                            }
                            by byVar4 = ((bd) r4).E;
                            byVar4.s = false;
                            byVar4.t = false;
                            byVar4.v.g = false;
                            byVar4.B(0);
                            ((brr) obj5).t((bd) r4, false);
                            break;
                            break;
                        case 1:
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            Bundle bundle = ((bd) r4).i;
                            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
                            if (!((bd) r4).X) {
                                Object obj6 = this.d;
                                ((brr) obj6).z((bd) r4, bundle2, false);
                                ((bd) r4).E.noteStateNotSaved();
                                ((bd) r4).h = 1;
                                ((bd) r4).P = false;
                                ((bd) r4).ag.a(new na(r4, 1, null));
                                e eVar10 = ((bd) r4).ah;
                                e.c(new at((Object) r4, bundle2, 5));
                                ((bd) r4).X = true;
                                if (!((bd) r4).P) {
                                    throw new co(a.ab(r4, "Fragment ", " did not call through to super.onCreate()"));
                                }
                                e.c(new bo(r4, i4));
                                ((brr) obj6).u((bd) r4, bundle2, false);
                                break;
                            } else {
                                ((bd) r4).h = 1;
                                ((bd) r4).af();
                                break;
                            }
                        case 2:
                            k();
                            j();
                            break;
                        case 3:
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            Bundle bundle3 = ((bd) r4).i;
                            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            ((bd) r4).E.noteStateNotSaved();
                            ((bd) r4).h = 3;
                            ((bd) r4).P = false;
                            e eVar11 = ((bd) r4).ah;
                            e.c(new at((Object) r4, bundle4, 2));
                            if (!((bd) r4).P) {
                                throw new co(a.ab(r4, "Fragment ", " did not call through to super.onActivityCreated()"));
                            }
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            if (((bd) r4).R != null) {
                                Bundle bundle5 = ((bd) r4).i;
                                Bundle bundle6 = bundle5 != null ? bundle5.getBundle("savedInstanceState") : null;
                                SparseArray<Parcelable> sparseArray = ((bd) r4).j;
                                if (sparseArray != null) {
                                    ((bd) r4).R.restoreHierarchyState(sparseArray);
                                    ((bd) r4).j = null;
                                }
                                ((bd) r4).P = false;
                                e.c(new at((Object) r4, bundle6, 3));
                                if (!((bd) r4).P) {
                                    throw new co(a.ab(r4, "Fragment ", " did not call through to super.onViewStateRestored()"));
                                }
                                if (((bd) r4).R != null) {
                                    e.c(new as((bd) r4, 15));
                                }
                            }
                            ((bd) r4).i = null;
                            ((bd) r4).E.o();
                            ((brr) this.d).s((bd) r4, bundle4, false);
                            break;
                        case 4:
                            if (((bd) r4).R != null && (viewGroup3 = ((bd) r4).Q) != null) {
                                cn c4 = cn.c(viewGroup3, ((bd) r4).G());
                                int M = a.M(((bd) r4).R.getVisibility());
                                if (by.U(2)) {
                                    Objects.toString(r4);
                                }
                                c4.i(M, 2, this);
                            }
                            ((bd) r4).h = 4;
                            break;
                        case 5:
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            ((bd) r4).E.noteStateNotSaved();
                            ((bd) r4).E.af(true);
                            ((bd) r4).h = 5;
                            ((bd) r4).P = false;
                            e eVar12 = ((bd) r4).ah;
                            e.c(new as((bd) r4, i7));
                            if (!((bd) r4).P) {
                                throw new co(a.ab(r4, "Fragment ", " did not call through to super.onStart()"));
                            }
                            e.c(new as((bd) r4, i6));
                            if (((bd) r4).R != null) {
                                e.c(new as((bd) r4, i5));
                            }
                            ((bd) r4).E.A();
                            ((brr) this.d).C((bd) r4, false);
                            break;
                        case 6:
                            ((bd) r4).h = 6;
                            break;
                        case 7:
                            if (by.U(3)) {
                                Objects.toString(r4);
                            }
                            az azVar = ((bd) r4).U;
                            View view3 = azVar == null ? null : azVar.m;
                            if (view3 != null) {
                                if (view3 != ((bd) r4).R) {
                                    for (ViewParent parent = view3.getParent(); parent != null; parent = parent.getParent()) {
                                        if (parent != ((bd) r4).R) {
                                        }
                                    }
                                }
                                view3.requestFocus();
                                if (by.U(2)) {
                                    Objects.toString(view3);
                                    Objects.toString(r4);
                                    Objects.toString(((bd) r4).R.findFocus());
                                }
                            }
                            ((bd) r4).ai(null);
                            ((bd) r4).E.noteStateNotSaved();
                            ((bd) r4).E.af(true);
                            ((bd) r4).h = 7;
                            ((bd) r4).P = false;
                            e eVar13 = ((bd) r4).ah;
                            e.c(new as((bd) r4, 12));
                            if (!((bd) r4).P) {
                                throw new co(a.ab(r4, "Fragment ", " did not call through to super.onResume()"));
                            }
                            e.c(new as((bd) r4, 13));
                            if (((bd) r4).R != null) {
                                e.c(new as((bd) r4, 14));
                            }
                            ((bd) r4).E.z();
                            ((brr) this.d).A((bd) r4, false);
                            ((cd) this.a).a(((bd) r4).m, null);
                            ((bd) r4).i = null;
                            ((bd) r4).j = null;
                            ((bd) r4).k = null;
                            break;
                    }
                }
                objArr2 = true;
            }
        } finally {
            this.c = false;
        }
    }

    public final void m(ClassLoader classLoader) {
        Object obj = this.e;
        bd bdVar = (bd) obj;
        Bundle bundle = bdVar.i;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (bdVar.i.getBundle("savedInstanceState") == null) {
            bdVar.i.putBundle("savedInstanceState", new Bundle());
        }
        try {
            ((bd) obj).j = ((bd) obj).i.getSparseParcelableArray("viewState");
            bd bdVar2 = (bd) this.e;
            bdVar2.k = bdVar2.i.getBundle("viewRegistryState");
            cc ccVar = (cc) bdVar2.i.getParcelable("state");
            if (ccVar != null) {
                bdVar2.p = ccVar.m;
                bdVar2.q = ccVar.n;
                Boolean bool = bdVar2.l;
                bdVar2.T = ccVar.o;
            }
            if (bdVar2.T) {
                return;
            }
            bdVar2.S = true;
        } catch (BadParcelableException e) {
            Object obj2 = this.e;
            Objects.toString(obj2);
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(obj2)), e);
        }
    }

    final void n() {
        Object obj = this.e;
        bd bdVar = (bd) obj;
        if (bdVar.R == null) {
            return;
        }
        if (by.U(2)) {
            Objects.toString(obj);
            Objects.toString(bdVar.R);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        bdVar.R.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            bdVar.j = sparseArray;
        }
        Bundle bundle = new Bundle();
        bdVar.ab.b.j(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        bdVar.k = bundle;
    }

    public gam(brr brrVar, cd cdVar, bd bdVar, Bundle bundle) {
        this.c = false;
        this.b = -1;
        this.d = brrVar;
        this.a = cdVar;
        this.e = bdVar;
        bdVar.j = null;
        bdVar.k = null;
        bdVar.B = 0;
        bdVar.x = false;
        bdVar.s = false;
        bd bdVar2 = bdVar.o;
        bdVar.p = bdVar2 != null ? bdVar2.m : null;
        bdVar.o = null;
        bdVar.i = bundle;
        bdVar.n = bundle.getBundle("arguments");
    }

    public gam(brr brrVar, cd cdVar, bd bdVar) {
        this.c = false;
        this.b = -1;
        this.d = brrVar;
        this.a = cdVar;
        this.e = bdVar;
    }

    public gam(Iterable iterable) {
        new qi();
        this.e = new qi();
        this.a = new bst();
        this.c = false;
        this.d = new qi();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((qy) this.d).put(((cmw) it.next()).g(), null);
        }
        this.b = ((qy) this.d).d;
    }

    public gam(byte[] bArr) {
        this.e = new ArrayList();
        this.a = new ArrayList();
        this.d = new ArrayList();
        this.b = 0;
        this.c = false;
    }

    public gam() {
        this.a = new Object();
        this.d = new HashSet();
        this.e = new gio(this, 1);
    }
}
