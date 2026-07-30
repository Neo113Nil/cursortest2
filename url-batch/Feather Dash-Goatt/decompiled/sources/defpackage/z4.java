package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.appsflyer.internal.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z4 implements iq, View.OnAttachStateChangeListener {
    public final d4 d;
    public final v3 e;
    public yw g;
    public final ArrayList h = new ArrayList();
    public final long i = 100;
    public w4 j = w4.d;
    public boolean k = true;
    public final we l = yr1.i(1, 6, null);
    public final Handler m = new Handler(Looper.getMainLooper());
    public en0 n;
    public long o;
    public final en0 p;
    public m81 q;
    public boolean r;
    public final e4 s;

    public z4(d4 d4Var, v3 v3Var) {
        this.d = d4Var;
        this.e = v3Var;
        en0 en0Var = r90.a;
        en0Var.getClass();
        this.n = en0Var;
        this.p = new en0();
        this.q = new m81(d4Var.getSemanticsOwner().a(), en0Var);
        this.s = new e4(1, this);
    }

    @Override // defpackage.iq
    public final void a(vg0 vg0Var) {
        m(this.d.getSemanticsOwner().a());
        j();
        this.g = null;
    }

    @Override // defpackage.iq
    public final void b(vg0 vg0Var) {
        this.g = (yw) this.e.invoke();
        l(-1, this.d.getSemanticsOwner().a());
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (defpackage.mo.l(r7.i, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:11:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(fn fnVar) {
        y4 y4Var;
        int i;
        ve veVar;
        if (fnVar instanceof y4) {
            y4Var = (y4) fnVar;
            int i2 = y4Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y4Var.k = i2 - Integer.MIN_VALUE;
                Object obj = y4Var.i;
                tn tnVar = tn.d;
                i = y4Var.k;
                if (i != 0) {
                    ca0.v(obj);
                    we weVar = this.l;
                    weVar.getClass();
                    veVar = new ve(weVar);
                } else if (i == 1) {
                    veVar = y4Var.h;
                    ca0.v(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.a;
                    }
                    veVar.c();
                    if (i()) {
                        j();
                    }
                    if (!this.r) {
                        this.r = true;
                        this.m.post(this.s);
                    }
                    y4Var.h = veVar;
                    y4Var.k = 2;
                } else {
                    if (i != 2) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    veVar = y4Var.h;
                    ca0.v(obj);
                }
                y4Var.h = veVar;
                y4Var.k = 1;
                obj = veVar.b(y4Var);
            }
        }
        y4Var = new y4(this, fnVar);
        Object obj2 = y4Var.i;
        tn tnVar2 = tn.d;
        i = y4Var.k;
        if (i != 0) {
        }
        y4Var.h = veVar;
        y4Var.k = 1;
        obj2 = veVar.b(y4Var);
    }

    public final void f(q90 q90Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long[] jArr3;
        m81 m81Var;
        int i3;
        long[] jArr4;
        m81 m81Var2;
        String str;
        long j3;
        String str2;
        int i4;
        q90 q90Var2 = q90Var;
        int[] iArr3 = q90Var2.b;
        long[] jArr5 = q90Var2.a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j4 = jArr5[i5];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j4 & 255) < 128) {
                        int i9 = iArr3[(i5 << 3) + i8];
                        c = c2;
                        m81 m81Var3 = (m81) this.p.b(i9);
                        n81 n81Var = (n81) q90Var2.b(i9);
                        l81 l81Var = n81Var != null ? n81Var.a : null;
                        if (l81Var == null) {
                            throw qy0.g("no value for specified key");
                        }
                        j2 = j5;
                        int i10 = l81Var.g;
                        vn0 vn0Var = l81Var.d.d;
                        String str3 = "Invalid content capture ID";
                        if (m81Var3 == null) {
                            Object[] objArr = vn0Var.b;
                            long[] jArr6 = vn0Var.a;
                            int i11 = i6;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j6 = jArr6[i12];
                                    j = j4;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j6 & 255) < 128) {
                                                j3 = j6;
                                                t81 t81Var = (t81) objArr[(i12 << 3) + i14];
                                                t81 t81Var2 = p81.z;
                                                if (Intrinsics.a(t81Var, t81Var2)) {
                                                    Object g = vn0Var.g(t81Var2);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                    List list = (List) g;
                                                    String valueOf = String.valueOf(list != null ? (y7) CollectionsKt.firstOrNull(list) : null);
                                                    yw ywVar = this.g;
                                                    if (ywVar != null) {
                                                        str2 = str3;
                                                        i4 = i8;
                                                        AutofillId n = ywVar.n(i10);
                                                        if (n == null) {
                                                            throw qy0.g(str2);
                                                        }
                                                        ((ContentCaptureSession) ywVar.e).notifyViewTextChanged(n, valueOf);
                                                        j6 = j3 >> i11;
                                                        i14++;
                                                        i8 = i4;
                                                        str3 = str2;
                                                    }
                                                }
                                            } else {
                                                j3 = j6;
                                            }
                                            str2 = str3;
                                            i4 = i8;
                                            j6 = j3 >> i11;
                                            i14++;
                                            i8 = i4;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        i = i8;
                                        if (i13 != i11) {
                                            break;
                                        }
                                    } else {
                                        str = str3;
                                        i = i8;
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                    j4 = j;
                                    i8 = i;
                                    str3 = str;
                                    i11 = 8;
                                }
                            } else {
                                j = j4;
                                i = i8;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            j = j4;
                            i = i8;
                            Object[] objArr2 = vn0Var.b;
                            long[] jArr7 = vn0Var.a;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j7 = jArr7[i15];
                                    Object[] objArr3 = objArr2;
                                    long[] jArr8 = jArr7;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            if ((j7 & 255) < 128) {
                                                t81 t81Var3 = (t81) objArr3[(i15 << 3) + i17];
                                                i3 = i17;
                                                t81 t81Var4 = p81.z;
                                                if (Intrinsics.a(t81Var3, t81Var4)) {
                                                    Object g2 = m81Var3.a.d.g(t81Var4);
                                                    if (g2 == null) {
                                                        g2 = null;
                                                    }
                                                    List list2 = (List) g2;
                                                    y7 y7Var = list2 != null ? (y7) CollectionsKt.firstOrNull(list2) : null;
                                                    Object g3 = vn0Var.g(t81Var4);
                                                    if (g3 == null) {
                                                        g3 = null;
                                                    }
                                                    List list3 = (List) g3;
                                                    y7 y7Var2 = list3 != null ? (y7) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.a(y7Var, y7Var2)) {
                                                        String valueOf2 = String.valueOf(y7Var2);
                                                        yw ywVar2 = this.g;
                                                        if (ywVar2 != null) {
                                                            jArr4 = jArr8;
                                                            m81Var2 = m81Var3;
                                                            AutofillId n2 = ywVar2.n(i10);
                                                            if (n2 == null) {
                                                                throw qy0.g("Invalid content capture ID");
                                                            }
                                                            ((ContentCaptureSession) ywVar2.e).notifyViewTextChanged(n2, valueOf2);
                                                            j7 >>= 8;
                                                            i17 = i3 + 1;
                                                            m81Var3 = m81Var2;
                                                            jArr8 = jArr4;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i3 = i17;
                                            }
                                            jArr4 = jArr8;
                                            m81Var2 = m81Var3;
                                            j7 >>= 8;
                                            i17 = i3 + 1;
                                            m81Var3 = m81Var2;
                                            jArr8 = jArr4;
                                        }
                                        jArr3 = jArr8;
                                        m81Var = m81Var3;
                                        if (i16 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr8;
                                        m81Var = m81Var3;
                                    }
                                    if (i15 == length3) {
                                        break;
                                    }
                                    i15++;
                                    objArr2 = objArr3;
                                    m81Var3 = m81Var;
                                    jArr7 = jArr3;
                                }
                            }
                        }
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i8;
                        i2 = i6;
                    }
                    j4 = j >> i2;
                    i8 = i + 1;
                    q90Var2 = q90Var;
                    i6 = i2;
                    c2 = c;
                    j5 = j2;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr5;
                if (i7 != i6) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            q90Var2 = q90Var;
            iArr3 = iArr;
            jArr5 = jArr;
        }
    }

    public final void g(l81 l81Var, Function2 function2) {
        l81Var.getClass();
        List j = l81.j(4, l81Var);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (h().a(((l81) obj).g)) {
                function2.b(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final q90 h() {
        if (this.k) {
            this.k = false;
            this.n = m90.v(this.d.getSemanticsOwner(), y3.i);
            this.o = System.currentTimeMillis();
        }
        return this.n;
    }

    public final boolean i() {
        return this.g != null;
    }

    public final void j() {
        yw ywVar = this.g;
        if (ywVar == null) {
            return;
        }
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) ywVar.e;
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            om omVar = (om) arrayList.get(i);
            int ordinal = omVar.c.ordinal();
            if (ordinal == 0) {
                nq0 nq0Var = omVar.d;
                if (nq0Var != null) {
                    contentCaptureSession.notifyViewAppeared((ViewStructure) nq0Var.e);
                }
            } else if (ordinal != 1) {
                l.a();
                return;
            } else {
                AutofillId n = ywVar.n(omVar.a);
                if (n != null) {
                    contentCaptureSession.notifyViewDisappeared(n);
                }
            }
        }
        contentCaptureSession.notifyViewsDisappeared(((View) ywVar.g).getAutofillId(), new long[]{Long.MIN_VALUE});
        arrayList.clear();
    }

    public final void k(l81 l81Var, m81 m81Var) {
        g(l81Var, new r4(m81Var, 1, this));
        List j = l81.j(4, l81Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            l81 l81Var2 = (l81) j.get(i);
            q90 h = h();
            int i2 = l81Var2.g;
            if (h.a(i2)) {
                en0 en0Var = this.p;
                if (en0Var.a(i2)) {
                    Object b = en0Var.b(i2);
                    if (b == null) {
                        throw qy0.g("node not present in pruned tree before this change");
                    }
                    k(l81Var2, (m81) b);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, l81 l81Var) {
        Function1 function1;
        s11 s11Var;
        nq0 nq0Var;
        Function1 function12;
        if (i()) {
            vn0 vn0Var = l81Var.d.d;
            Object g = vn0Var.g(p81.B);
            if (g == null) {
                g = null;
            }
            Boolean bool = (Boolean) g;
            if (this.j == w4.d && Intrinsics.a(bool, Boolean.TRUE)) {
                Object g2 = vn0Var.g(g81.m);
                if (g2 == null) {
                    g2 = null;
                }
                z0 z0Var = (z0) g2;
                if (z0Var != null && (function12 = (Function1) z0Var.b) != null) {
                }
            } else if (this.j == w4.e && Intrinsics.a(bool, Boolean.FALSE)) {
                Object g3 = vn0Var.g(g81.m);
                if (g3 == null) {
                    g3 = null;
                }
                z0 z0Var2 = (z0) g3;
                if (z0Var2 != null && (function1 = (Function1) z0Var2.b) != null) {
                }
            }
            int i2 = l81Var.g;
            yw ywVar = this.g;
            if (ywVar != null) {
                AutofillId autofillId = this.d.getAutofillId();
                l81 l = l81Var.l();
                int i3 = l81Var.g;
                if (l == null || (autofillId = ywVar.n(l.g)) != null) {
                    ViewStructure newVirtualViewStructure = ((ContentCaptureSession) ywVar.e).newVirtualViewStructure(autofillId, i3);
                    nq0 nq0Var2 = new nq0(21, newVirtualViewStructure);
                    h81 h81Var = l81Var.d;
                    t81 t81Var = p81.H;
                    vn0 vn0Var2 = h81Var.d;
                    if (!vn0Var2.c(t81Var)) {
                        Bundle extras = newVirtualViewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.o);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object g4 = vn0Var2.g(p81.x);
                        if (g4 == null) {
                            g4 = null;
                        }
                        String str = (String) g4;
                        if (str != null) {
                            newVirtualViewStructure.setId(i3, null, null, str);
                        }
                        Object g5 = vn0Var2.g(p81.m);
                        if (g5 == null) {
                            g5 = null;
                        }
                        if (((Boolean) g5) != null) {
                            newVirtualViewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object g6 = vn0Var2.g(p81.z);
                        if (g6 == null) {
                            g6 = null;
                        }
                        List list = (List) g6;
                        if (list != null) {
                            newVirtualViewStructure.setClassName("android.widget.TextView");
                            newVirtualViewStructure.setText(zh0.a(list, "\n", null, 62));
                        }
                        Object g7 = vn0Var2.g(p81.D);
                        if (g7 == null) {
                            g7 = null;
                        }
                        y7 y7Var = (y7) g7;
                        if (y7Var != null) {
                            newVirtualViewStructure.setClassName("android.widget.EditText");
                            newVirtualViewStructure.setText(y7Var);
                        }
                        Object g8 = vn0Var2.g(p81.a);
                        if (g8 == null) {
                            g8 = null;
                        }
                        List list2 = (List) g8;
                        if (list2 != null) {
                            newVirtualViewStructure.setContentDescription(zh0.a(list2, "\n", null, 62));
                        }
                        Object g9 = vn0Var2.g(p81.w);
                        if (g9 == null) {
                            g9 = null;
                        }
                        if (((e41) g9) != null) {
                            newVirtualViewStructure.setClassName("android.widget.ImageView");
                        }
                        hh1 y = gb0.y(h81Var);
                        if (y != null) {
                            gh1 gh1Var = y.a;
                            th1 th1Var = gh1Var.b;
                            nr nrVar = gh1Var.g;
                            newVirtualViewStructure.setTextStyle(nrVar.f() * nrVar.k() * wh1.c(th1Var.a.b), 0, 0, 0);
                        }
                        qp0 d = l81Var.d();
                        if (d != null) {
                            qp0 qp0Var = d.J0().r ? d : null;
                            if (qp0Var != null) {
                                s11Var = l81Var.a(qp0Var);
                                float f = s11Var.a;
                                float f2 = s11Var.b;
                                newVirtualViewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (s11Var.c - f), (int) (s11Var.d - f2));
                                nq0Var = nq0Var2;
                                if (nq0Var != null) {
                                    this.h.add(new om(i2, this.o, pm.d, nq0Var));
                                }
                                g(l81Var, new n(1, this));
                            }
                        }
                        s11Var = s11.e;
                        float f3 = s11Var.a;
                        float f22 = s11Var.b;
                        newVirtualViewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (s11Var.c - f3), (int) (s11Var.d - f22));
                        nq0Var = nq0Var2;
                        if (nq0Var != null) {
                        }
                        g(l81Var, new n(1, this));
                    }
                }
            }
            nq0Var = null;
            if (nq0Var != null) {
            }
            g(l81Var, new n(1, this));
        }
    }

    public final void m(l81 l81Var) {
        if (i()) {
            this.h.add(new om(l81Var.g, this.o, pm.e, null));
            List j = l81.j(4, l81Var);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                m((l81) j.get(i));
            }
        }
    }

    public final void n() {
        en0 en0Var = this.p;
        en0Var.c();
        q90 h = h();
        int[] iArr = h.b;
        Object[] objArr = h.c;
        long[] jArr = h.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            en0Var.h(iArr[i4], new m81(((n81) objArr[i4]).a, h()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.q = new m81(this.d.getSemanticsOwner().a(), h());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.m.removeCallbacks(this.s);
        this.g = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
