package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.layout.b;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p8 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p8(int i, Object obj, Object obj2) {
        super(1);
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x03a9, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        u72 u72Var;
        bm0 bm0Var;
        Object obj2;
        ad1 lifecycle;
        int i = 4;
        View view = null;
        int i2 = 0;
        r8 = false;
        r8 = false;
        boolean z = false;
        int i3 = 1;
        switch (this.m) {
            case 0:
                Context context = (Context) this.n;
                Context applicationContext = context.getApplicationContext();
                q8 q8Var = (q8) this.o;
                applicationContext.registerComponentCallbacks(q8Var);
                return new o8(i2, context, q8Var);
            case 1:
                Context context2 = (Context) this.n;
                Context applicationContext2 = context2.getApplicationContext();
                r8 r8Var = (r8) this.o;
                applicationContext2.registerComponentCallbacks(r8Var);
                return new o8(i3, context2, r8Var);
            case 2:
                return new u21((tc1) this.n, new u(i3, (ua) this.o));
            case 3:
                u21 u21Var = (u21) this.n;
                synchronized (u21Var.c) {
                    try {
                        u21Var.e = true;
                        eo1 eo1Var = u21Var.d;
                        Object[] objArr = eo1Var.m;
                        int i4 = eo1Var.o;
                        while (i2 < i4) {
                            jt1 jt1Var = (jt1) ((k63) objArr[i2]).get();
                            if (jt1Var != null && (u72Var = jt1Var.b) != null) {
                                u72Var.closeConnection();
                                jt1Var.b = null;
                            }
                            i2++;
                        }
                        u21Var.d.g();
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                sv2 sv2Var = ((ua) this.o).n;
                sv2Var.b.set(null);
                sv2Var.a.g();
                return Unit.a;
            case 4:
                m32 m32Var = (m32) this.n;
                m32Var.setPositionProvider((o32) this.o);
                m32Var.m();
                return new xa(0);
            case 5:
                xb xbVar = (xb) this.n;
                yb ybVar = (yb) this.o;
                synchronized (xbVar.q) {
                    xbVar.s.remove(ybVar);
                }
                return Unit.a;
            case 6:
                ((zb) this.n).m.removeFrameCallback((yb) this.o);
                return Unit.a;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                m12 m12Var = (m12) obj;
                n12 n12Var = (n12) this.n;
                float h = ((r20) this.o).c.h();
                m12Var.getClass();
                m12.a(m12Var, n12Var);
                n12Var.i0(s31.c(0L, n12Var.q), h, null);
                return Unit.a;
            case 8:
                cz2 cz2Var = (cz2) obj;
                tn1 tn1Var = ((zc) this.n).d;
                so2 so2Var = (so2) tn1Var.g(cz2Var.b());
                long j = so2Var != null ? ((x31) so2Var.getValue()).a : 0L;
                so2 so2Var2 = (so2) tn1Var.g(cz2Var.c());
                long j2 = so2Var2 != null ? ((x31) so2Var2.getValue()).a : 0L;
                tl2 tl2Var = (tl2) ((yc) this.o).b.getValue();
                return (tl2Var == null || (bm0Var = (bm0) tl2Var.a.invoke(new x31(j), new x31(j2))) == null) ? bd3.G(7, null) : bm0Var;
            case 9:
                return ((zd) this.n).invoke(((List) this.o).get(((Number) obj).intValue()));
            case 10:
                m12.l((m12) obj, (n12) this.n, ((oo) this.o).A);
                return Unit.a;
            case 11:
                k91 k91Var = (k91) obj;
                k91Var.a();
                yd0.x(k91Var, ((yw1) this.n).a, (cq) this.o, 0.0f, null, 60);
                return Unit.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                k91 k91Var2 = (k91) obj;
                k91Var2.a();
                yd0.x(k91Var2, (oa) this.n, (cq) this.o, 0.0f, null, 60);
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                ((mp) this.n).a.k((g20) this.o);
                return Unit.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                KeyEvent keyEvent = ((x71) obj).a;
                if (((sc1) this.n).a() == zw0.n && keyEvent.getKeyCode() == 4 && z71.D(keyEvent) == 1) {
                    ((gv2) this.o).e(null);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                Throwable th2 = (Throwable) obj;
                ur urVar = (ur) this.n;
                if (th2 == null) {
                    Object O = ((i90) this.o).O();
                    if (O instanceof v11) {
                        lh.g("This job has not completed yet");
                        obj2 = null;
                    } else {
                        if (O instanceof gx) {
                            throw ((gx) O).a;
                        }
                        obj2 = j8.Y(O);
                    }
                    urVar.d = true;
                    wr wrVar = urVar.b;
                    if (wrVar != null && wrVar.n.set(obj2)) {
                        urVar.a = null;
                        urVar.b = null;
                        urVar.c = null;
                    }
                } else if (th2 instanceof CancellationException) {
                    urVar.d = true;
                    wr wrVar2 = urVar.b;
                    if (wrVar2 != null && wrVar2.n.cancel(true)) {
                        urVar.a = null;
                        urVar.b = null;
                        urVar.c = null;
                    }
                } else {
                    urVar.d = true;
                    wr wrVar3 = urVar.b;
                    if (wrVar3 != null && wrVar3.n.setException(th2)) {
                        urVar.a = null;
                        urVar.b = null;
                        urVar.c = null;
                    }
                }
                return Unit.a;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                i43 i43Var = (i43) this.n;
                h43 h43Var = (h43) i43Var.c;
                h43 h43Var2 = (h43) i43Var.b;
                ph2.c(i43Var, (t22) obj);
                tf2 tf2Var = (tf2) this.o;
                float a = ((g53) tk3.J(tf2Var, p00.s)).a();
                long b = mh2.b(a, a);
                if (f43.b(b) <= 0.0f || f43.c(b) <= 0.0f) {
                    h21.b("maximumVelocity should be a positive value. You specified=" + ((Object) f43.f(b)));
                }
                long b2 = mh2.b(h43Var2.b(f43.b(b)), h43Var.b(f43.c(b)));
                ni.k(0, r1.length, null, h43Var2.c);
                h43Var2.d = 0;
                ni.k(0, r1.length, null, h43Var.c);
                h43Var.d = 0;
                i43Var.a = 0L;
                lq lqVar = tf2Var.G;
                if (lqVar != null) {
                    int i5 = rd0.a;
                    lqVar.d(new zc0(mh2.b(Float.isNaN(f43.b(b2)) ? 0.0f : f43.b(b2), Float.isNaN(f43.c(b2)) ? 0.0f : f43.c(b2))));
                }
                return Unit.a;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                View view2 = (View) obj;
                View view3 = (View) this.n;
                p7 p7Var = new p7(view2.getNextFocusForwardId(), 1);
                View view4 = null;
                while (true) {
                    View N = tk3.N(view2, p7Var, view4);
                    if (N == null && view2 != view3) {
                        ViewParent parent = view2.getParent();
                        if (parent != null && (parent instanceof View)) {
                            View view5 = (View) parent;
                            view4 = view2;
                            view2 = view5;
                        }
                    }
                }
                return Boolean.valueOf(view == ((View) this.o));
            case 18:
                ((bn1) this.n).c((a41) this.o);
                return Unit.a;
            case 19:
                MatchResult matchResult = (MatchResult) obj;
                a82 a82Var = (a82) this.n;
                if (a82Var.m == -1) {
                    a82Var.m = matchResult.a().m;
                }
                ((a82) this.o).m = matchResult.a().n + 1;
                return BuildConfig.FLAVOR;
            case 20:
                lq0 c = ((sa1) this.n).c(((Number) obj).intValue());
                int i6 = c.a;
                List list = c.b;
                ArrayList arrayList = new ArrayList(list.size());
                la1 la1Var = (la1) this.o;
                int size = list.size();
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    int i9 = (int) ((mw0) list.get(i8)).a;
                    arrayList.add(new Pair(Integer.valueOf(i6), new u10(la1Var.a(i7, i9))));
                    i6++;
                    i7 += i9;
                }
                return arrayList;
            case 21:
                gc1 gc1Var = (gc1) this.n;
                LinkedHashSet linkedHashSet = gc1Var.o;
                Object obj3 = this.o;
                linkedHashSet.remove(obj3);
                return new o8(3, gc1Var, obj3);
            case 22:
                return ((zd) this.n).invoke(((List) this.o).get(((Number) obj).intValue()));
            case 23:
                eq1 eq1Var = (eq1) obj;
                up1 up1Var = (up1) this.o;
                eq1Var.getClass();
                Unit unit2 = Unit.a;
                ak0 ak0Var = eq1Var.a;
                ak0Var.m = 0;
                ak0Var.n = 0;
                op1 op1Var = (op1) this.n;
                if (op1Var instanceof rp1) {
                    int i10 = op1.u;
                    Iterator it = aj2.c(op1Var, bl0.K).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            op1 op1Var2 = (op1) it.next();
                            cp1 cp1Var = (cp1) up1Var.g.f();
                            op1 op1Var3 = cp1Var != null ? cp1Var.n : null;
                            if (Intrinsics.b(op1Var2, op1Var3 != null ? op1Var3.n : null)) {
                            }
                        } else {
                            int i11 = rp1.z;
                            eq1Var.d = zm3.u(up1Var.f()).r;
                            Unit unit3 = Unit.a;
                            eq1Var.e = true;
                        }
                    }
                }
                return Unit.a;
            case 24:
                up1 up1Var2 = (up1) this.n;
                id1 id1Var = (id1) this.o;
                up1Var2.getClass();
                id1Var.getClass();
                ep1 ep1Var = up1Var2.s;
                if (!id1Var.equals(up1Var2.o)) {
                    id1 id1Var2 = up1Var2.o;
                    if (id1Var2 != null && (lifecycle = id1Var2.getLifecycle()) != null) {
                        lifecycle.c(ep1Var);
                    }
                    up1Var2.o = id1Var;
                    id1Var.getLifecycle().a(ep1Var);
                }
                return new xa(2);
            case Constants.MAX_TREE_DEPTH /* 25 */:
                return new o8(i, (so2) this.n, (ez) this.o);
            case 26:
                k91 k91Var3 = (k91) obj;
                long j3 = ((ql2) ((ku2) this.n).get()).a;
                float d = ql2.d(j3);
                if (d > 0.0f) {
                    int i12 = kx1.b;
                    float D = k91Var3.D(4.0f);
                    ns nsVar = k91Var3.m;
                    float D2 = k91Var3.D(((yx1) this.o).a(k91Var3.getLayoutDirection())) - D;
                    float f = (D * 2.0f) + d + D2;
                    u81 layoutDirection = k91Var3.getLayoutDirection();
                    int[] iArr = jx1.a;
                    float d2 = iArr[layoutDirection.ordinal()] == 1 ? ql2.d(nsVar.f()) - f : D2 < 0.0f ? 0.0f : D2;
                    if (iArr[k91Var3.getLayoutDirection().ordinal()] == 1) {
                        f = ql2.d(nsVar.f()) - (D2 >= 0.0f ? D2 : 0.0f);
                    }
                    float f2 = f;
                    float b3 = ql2.b(j3);
                    float f3 = (-b3) / 2.0f;
                    float f4 = b3 / 2.0f;
                    mh mhVar = nsVar.n;
                    long v = mhVar.v();
                    mhVar.o().m();
                    try {
                        ((mh) ((ar0) mhVar.n).n).o().g(d2, f3, f2, f4, 0);
                        k91Var3.a();
                    } finally {
                        mhVar.o().j();
                        mhVar.J(v);
                    }
                } else {
                    k91Var3.a();
                }
                return Unit.a;
            case 27:
                ng1 ng1Var = (ng1) obj;
                kc2 kc2Var = (kc2) this.n;
                if (kc2Var.A.s.h() > 0) {
                    ng1Var.m = true;
                    qg1 qg1Var = ng1Var.p;
                    t81 v0 = qg1Var.v0();
                    if (s31.a(ng1Var.n, 9223372034707292159L)) {
                        ng1Var.n = yk3.R(v0.b(0L));
                        ng1Var.o = v0.N();
                    }
                    qg1Var.x0().Q.b();
                    long N2 = v0.N();
                    tn1 tn1Var2 = ((a31) this.o).r;
                    int i13 = (int) (N2 >> 32);
                    int i14 = (int) (N2 & 4294967295L);
                    for (l83 l83Var : b.b) {
                        Object g = tn1Var2.g(l83Var);
                        g.getClass();
                        t83 t83Var = (t83) g;
                        b.a(ng1Var, ((m83) l83Var).c, t83Var.h, i13, i14);
                        if (((Boolean) t83Var.b.getValue()).booleanValue()) {
                            b.a(ng1Var, t83Var.f, t83Var.j, i13, i14);
                            b.a(ng1Var, t83Var.g, t83Var.k, i13, i14);
                        }
                        b.a(ng1Var, ((m83) l83Var).d, t83Var.i, i13, i14);
                    }
                    if (kc2Var.A.t.h()) {
                        jn1 jn1Var = kc2Var.A.t;
                        Object[] objArr2 = jn1Var.a;
                        int i15 = jn1Var.b;
                        for (int i16 = 0; i16 < i15; i16++) {
                            zn1 zn1Var = (zn1) objArr2[i16];
                            o21 o21Var = (o21) kc2Var.A.u.get(i16);
                            Rect rect = (Rect) zn1Var.getValue();
                            ng1Var.a(o21Var.b(), rect.left);
                            ng1Var.a(o21Var.d(), rect.top);
                            ng1Var.a(o21Var.c(), rect.right);
                            ng1Var.a(o21Var.a(), rect.bottom);
                        }
                    }
                }
                return Unit.a;
            case 28:
                ((go1) this.n).a.setValue(new aj0((z63) this.o, (z63) obj));
                return Unit.a;
            default:
                ag2 ag2Var = (ag2) this.n;
                cg2 cg2Var = (cg2) this.o;
                long j4 = ((xc0) obj).a;
                long a2 = cg2Var.d == ww1.n ? au1.a(j4, 0.0f, 1) : au1.a(j4, 0.0f, 2);
                cg2 cg2Var2 = ag2Var.a;
                cg2Var2.g = 1;
                px1 px1Var = cg2Var2.b;
                if (px1Var == null || !(cg2Var2.a.c() || cg2Var2.a.a())) {
                    cg2.a(cg2Var2, cg2Var2.h, a2, 1);
                } else {
                    px1Var.f(a2, cg2Var2.g, cg2Var2.j);
                }
                return Unit.a;
        }
    }
}
