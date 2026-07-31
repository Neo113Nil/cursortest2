package G1;

import B.C0011l;
import B.Y;
import D2.C0072b;
import D2.EnumC0071a;
import H0.s;
import I.AbstractC0139b;
import I.C0143d;
import O0.o;
import U.p;
import a.AbstractC0235a;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import b.C0317m;
import b0.r;
import c1.C0385i;
import com.gatesof.olympus.martu.marku.App;
import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import d0.C0401b;
import e0.C0416b;
import e2.InterfaceC0424c;
import f2.v;
import f2.x;
import j.AbstractC0522D;
import j.AbstractC0537k;
import j.C0538l;
import j.C0544r;
import j.C0548v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k.AbstractC0561a;
import m.s0;
import m0.C0641a;
import m0.C0642b;
import m1.C0646d;
import m1.q;
import m1.t;
import m1.u;
import n0.C0709g;
import n0.C0710h;
import n1.C0719a;
import q1.C0812b;
import r.AbstractC0856c;
import r0.InterfaceC0919p;
import s1.C0966d;
import t0.AbstractC0993f;
import t0.E;
import t2.InterfaceC1053f;
import u0.C1123s;
import u0.K0;
import w1.C1174A;
import w1.C1182e;
import x.O;
import z.C1256t;

/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2115a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2116b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2117c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2118d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i3) {
        this.f2115a = i3;
        this.f2116b = obj;
        this.f2117c = obj2;
        this.f2118d = obj3;
    }

    public void A() {
        R.l lVar = (R.l) this.f2116b;
        LinkedHashMap linkedHashMap = lVar.f4035c;
        String str = (String) this.f2117c;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove((A.h) this.f2118d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        lVar.f4035c.put(str, list);
    }

    public void B() {
        ArrayList arrayList = (ArrayList) this.f2117c;
        if (arrayList.isEmpty()) {
            C0143d.T("empty stack");
            throw null;
        }
        this.f2118d = arrayList.remove(arrayList.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j3, List list, boolean z3) {
        long[] jArr;
        boolean z4;
        long[] jArr2;
        boolean z5;
        int i3;
        C0709g c0709g;
        C0709g c0709g2;
        C0710h c0710h = (C0710h) this.f2117c;
        C0544r c0544r = (C0544r) this.f2118d;
        c0544r.f6317e = 0;
        long[] jArr3 = c0544r.f6313a;
        char c2 = 7;
        if (jArr3 != AbstractC0522D.f6254a) {
            S1.k.s0(jArr3);
            long[] jArr4 = c0544r.f6313a;
            int i4 = c0544r.f6316d;
            int i5 = i4 >> 3;
            long j4 = 255 << ((i4 & 7) << 3);
            jArr4[i5] = (jArr4[i5] & (~j4)) | j4;
        }
        S1.k.r0(c0544r.f6315c, null, 0, c0544r.f6316d);
        c0544r.f6318f = AbstractC0522D.c(c0544r.f6316d) - c0544r.f6317e;
        int size = list.size();
        boolean z6 = true;
        C0710h c0710h2 = c0710h;
        boolean z7 = true;
        for (int i6 = 0; i6 < size; i6++) {
            p pVar = (p) list.get(i6);
            if (z7) {
                K.d dVar = c0710h2.f7291a;
                int i7 = dVar.f3216f;
                if (i7 > 0) {
                    ?? r15 = dVar.f3214d;
                    int i8 = 0;
                    while (true) {
                        c0709g2 = r15[i8];
                        if (f2.j.a(((C0709g) c0709g2).f7283b, pVar)) {
                            break;
                        }
                        int i9 = i8 + 1;
                        if (i9 >= i7) {
                            break;
                        } else {
                            i8 = i9;
                        }
                    }
                    c0709g = c0709g2;
                    if (c0709g == null) {
                        c0709g.f7289h = true;
                        c0709g.f7284c.a(j3);
                        Object b3 = c0544r.b(j3);
                        Object obj = b3;
                        if (b3 == null) {
                            C0548v c0548v = new C0548v();
                            c0544r.d(j3, c0548v);
                            obj = c0548v;
                        }
                        ((C0548v) obj).a(c0709g);
                        c0710h2 = c0709g;
                    } else {
                        z7 = false;
                    }
                }
                c0709g2 = 0;
                c0709g = c0709g2;
                if (c0709g == null) {
                }
            }
            c0709g = new C0709g(pVar);
            c0709g.f7284c.a(j3);
            Object b4 = c0544r.b(j3);
            Object obj2 = b4;
            if (b4 == null) {
                C0548v c0548v2 = new C0548v();
                c0544r.d(j3, c0548v2);
                obj2 = c0548v2;
            }
            ((C0548v) obj2).a(c0709g);
            c0710h2.f7291a.b(c0709g);
            c0710h2 = c0709g;
        }
        if (!z3) {
            return;
        }
        long[] jArr5 = c0544r.f6314b;
        Object[] objArr = c0544r.f6315c;
        long[] jArr6 = c0544r.f6313a;
        int length = jArr6.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j5 = jArr6[i10];
            if ((((~j5) << c2) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j5 & 255) < 128) {
                        int i14 = (i10 << 3) + i13;
                        long j6 = jArr5[i14];
                        C0548v c0548v3 = (C0548v) objArr[i14];
                        K.d dVar2 = c0710h.f7291a;
                        int i15 = dVar2.f3216f;
                        if (i15 > 0) {
                            Object[] objArr2 = dVar2.f3214d;
                            int i16 = 0;
                            while (true) {
                                ((C0709g) objArr2[i16]).i(j6, c0548v3);
                                jArr2 = jArr5;
                                z5 = true;
                                int i17 = i16 + 1;
                                if (i17 >= i15) {
                                    break;
                                }
                                i16 = i17;
                                jArr5 = jArr2;
                            }
                        } else {
                            jArr2 = jArr5;
                            z5 = true;
                        }
                        i3 = 8;
                    } else {
                        jArr2 = jArr5;
                        z5 = z6;
                        i3 = i11;
                    }
                    j5 >>= i3;
                    i13++;
                    z6 = z5;
                    i11 = i3;
                    jArr5 = jArr2;
                }
                jArr = jArr5;
                z4 = z6;
                if (i12 != i11) {
                    return;
                }
            } else {
                jArr = jArr5;
                z4 = z6;
            }
            if (i10 == length) {
                return;
            }
            i10++;
            z6 = z4;
            jArr5 = jArr;
            c2 = 7;
        }
    }

    public void b() {
        ((ArrayList) this.f2117c).clear();
        this.f2118d = (E) this.f2116b;
        ((E) this.f2116b).N();
    }

    public boolean c(C1256t c1256t, boolean z3) {
        boolean z4;
        boolean z5;
        C0710h c0710h = (C0710h) this.f2117c;
        if (!c0710h.a((C0538l) c1256t.f10466e, (InterfaceC0919p) this.f2116b, c1256t, z3)) {
            return false;
        }
        K.d dVar = c0710h.f7291a;
        int i3 = dVar.f3216f;
        if (i3 > 0) {
            Object[] objArr = dVar.f3214d;
            int i4 = 0;
            z4 = false;
            do {
                z4 = ((C0709g) objArr[i4]).h(c1256t, z3) || z4;
                i4++;
            } while (i4 < i3);
        } else {
            z4 = false;
        }
        int i5 = dVar.f3216f;
        if (i5 > 0) {
            Object[] objArr2 = dVar.f3214d;
            int i6 = 0;
            z5 = false;
            do {
                z5 = ((C0709g) objArr2[i6]).g(c1256t) || z5;
                i6++;
            } while (i6 < i5);
        } else {
            z5 = false;
        }
        c0710h.c(c1256t);
        return z5 || z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(long j3, long j4, X1.c cVar) {
        C0641a c0641a;
        int i3;
        long j5;
        if (cVar instanceof C0641a) {
            c0641a = (C0641a) cVar;
            int i4 = c0641a.f6917i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0641a.f6917i = i4 - Integer.MIN_VALUE;
                C0641a c0641a2 = c0641a;
                Object obj = c0641a2.f6915g;
                W1.a aVar = W1.a.f4608d;
                i3 = c0641a2.f6917i;
                if (i3 != 0) {
                    R1.a.e(obj);
                    m0.e eVar = (m0.e) this.f2116b;
                    m0.e eVar2 = null;
                    if (eVar != null && eVar.f4501p) {
                        eVar2 = (m0.e) AbstractC0993f.k(eVar);
                    }
                    if (eVar2 == null) {
                        j5 = 0;
                        return new o(j5);
                    }
                    c0641a2.f6917i = 1;
                    obj = eVar2.z0(j3, j4, c0641a2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.a.e(obj);
                }
                j5 = ((o) obj).f3749a;
                return new o(j5);
            }
        }
        c0641a = new C0641a(this, cVar);
        C0641a c0641a22 = c0641a;
        Object obj2 = c0641a22.f6915g;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0641a22.f6917i;
        if (i3 != 0) {
        }
        j5 = ((o) obj2).f3749a;
        return new o(j5);
    }

    @Override // G1.j
    public Object delete(n nVar, V1.d dVar) {
        return w1.h.a((AppDatabase_Impl) this.f2116b, new k(this, nVar, 1), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(long j3, X1.c cVar) {
        C0642b c0642b;
        int i3;
        long j4;
        if (cVar instanceof C0642b) {
            c0642b = (C0642b) cVar;
            int i4 = c0642b.f6920i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0642b.f6920i = i4 - Integer.MIN_VALUE;
                Object obj = c0642b.f6918g;
                W1.a aVar = W1.a.f4608d;
                i3 = c0642b.f6920i;
                if (i3 != 0) {
                    R1.a.e(obj);
                    m0.e eVar = (m0.e) this.f2116b;
                    m0.e eVar2 = null;
                    if (eVar != null && eVar.f4501p) {
                        eVar2 = (m0.e) AbstractC0993f.k(eVar);
                    }
                    if (eVar2 == null) {
                        j4 = 0;
                        return new o(j4);
                    }
                    c0642b.f6920i = 1;
                    obj = eVar2.B0(j3, c0642b);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.a.e(obj);
                }
                j4 = ((o) obj).f3749a;
                return new o(j4);
            }
        }
        c0642b = new C0642b(this, cVar);
        Object obj2 = c0642b.f6918g;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c0642b.f6920i;
        if (i3 != 0) {
        }
        j4 = ((o) obj2).f3749a;
        return new o(j4);
    }

    public void f(Object obj) {
        ((ArrayList) this.f2117c).add(this.f2118d);
        this.f2118d = obj;
    }

    public Object g() {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0139b.f2791a) {
            return this.f2118d;
        }
        Q.e eVar = (Q.e) ((AtomicReference) this.f2116b).get();
        int a3 = eVar.a(id);
        if (a3 >= 0) {
            return eVar.f3957c[a3];
        }
        return null;
    }

    public r h() {
        return ((C0401b) this.f2118d).f5648d.f5646c;
    }

    public Object i() {
        return this.f2118d;
    }

    @Override // G1.j
    public Object insert(n nVar, V1.d dVar) {
        return w1.h.a((AppDatabase_Impl) this.f2116b, new k(this, nVar, 0), dVar);
    }

    public O0.b j() {
        return ((C0401b) this.f2118d).f5648d.f5644a;
    }

    public C0416b k() {
        return (C0416b) this.f2117c;
    }

    public O l() {
        O o3 = (O) this.f2117c;
        if (o3 != null) {
            return o3;
        }
        f2.j.j("keyboardActions");
        throw null;
    }

    public O0.k m() {
        return ((C0401b) this.f2118d).f5648d.f5645b;
    }

    public long n() {
        return ((C0401b) this.f2118d).f5648d.f5647d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V o(f2.d dVar, String str) {
        boolean isInstance;
        V a3;
        f2.j.f(str, "key");
        a0 a0Var = (a0) this.f2116b;
        a0Var.getClass();
        LinkedHashMap linkedHashMap = a0Var.f5208a;
        V v3 = (V) linkedHashMap.get(str);
        Class cls = dVar.f5821a;
        f2.j.f(cls, "jClass");
        Map map = f2.d.f5818b;
        f2.j.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = x.e(num.intValue(), v3);
        } else {
            if (cls.isPrimitive()) {
                cls = AbstractC0235a.z(v.a(cls));
            }
            isInstance = cls.isInstance(v3);
        }
        X x3 = (X) this.f2117c;
        if (isInstance) {
            if (x3 instanceof Z) {
                f2.j.c(v3);
                ((Z) x3).d(v3);
            }
            f2.j.d(v3, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return v3;
        }
        C0812b c0812b = new C0812b((s0) this.f2118d);
        ((LinkedHashMap) c0812b.f6877a).put(C0966d.f8358a, str);
        try {
            try {
                a3 = x3.c(dVar, c0812b);
            } catch (AbstractMethodError unused) {
                a3 = x3.a(AbstractC0235a.y(dVar));
            }
        } catch (AbstractMethodError unused2) {
            a3 = x3.b(AbstractC0235a.y(dVar), c0812b);
        }
        f2.j.f(a3, "viewModel");
        V v4 = (V) linkedHashMap.put(str, a3);
        if (v4 != null) {
            v4.b();
        }
        return a3;
    }

    @Override // G1.j
    public InterfaceC1053f observeAll() {
        l lVar = new l(this, C1174A.b("SELECT * FROM haircuts ORDER BY timestamp DESC", 0), 0);
        return new H1.c(new C1182e((AppDatabase_Impl) this.f2116b, new String[]{"haircuts"}, lVar, null));
    }

    @Override // G1.j
    public InterfaceC1053f observeForClient(long j3) {
        C1174A b3 = C1174A.b("SELECT * FROM haircuts WHERE clientId = ? ORDER BY timestamp DESC", 1);
        b3.A(j3, 1);
        l lVar = new l(this, b3, 1);
        return new H1.c(new C1182e((AppDatabase_Impl) this.f2116b, new String[]{"haircuts"}, lVar, null));
    }

    public boolean p(CharSequence charSequence, int i3, int i4, u uVar) {
        if ((uVar.f6984c & 3) == 0) {
            C0646d c0646d = (C0646d) this.f2118d;
            C0719a c2 = uVar.c();
            int a3 = c2.a(8);
            if (a3 != 0) {
                ((ByteBuffer) c2.f4353g).getShort(a3 + c2.f4350d);
            }
            c0646d.getClass();
            ThreadLocal threadLocal = C0646d.f6936b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i3 < i4) {
                sb.append(charSequence.charAt(i3));
                i3++;
            }
            TextPaint textPaint = c0646d.f6937a;
            String sb2 = sb.toString();
            int i5 = X0.e.f4627a;
            boolean a4 = X0.d.a(textPaint, sb2);
            int i6 = uVar.f6984c & 4;
            uVar.f6984c = a4 ? i6 | 2 : i6 | 1;
        }
        return (uVar.f6984c & 3) == 2;
    }

    public boolean q() {
        m mVar;
        return ((s) this.f2116b).f2611d != this.f2118d || ((mVar = (m) this.f2117c) != null && mVar.q());
    }

    public void r(Object obj) {
        C0317m c0317m = (C0317m) this.f2116b;
        LinkedHashMap linkedHashMap = c0317m.f5304b;
        String str = (String) this.f2117c;
        Object obj2 = linkedHashMap.get(str);
        O2.d dVar = (O2.d) this.f2118d;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + dVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        ArrayList arrayList = c0317m.f5306d;
        arrayList.add(str);
        try {
            c0317m.b(intValue, dVar, obj);
        } catch (Exception e3) {
            arrayList.remove(str);
            throw e3;
        }
    }

    public void s() {
        C1123s c1123s = ((E) this.f2116b).f8548l;
        if (c1123s != null) {
            c1123s.v();
        }
    }

    public Object t(CharSequence charSequence, int i3, int i4, int i5, boolean z3, m1.o oVar) {
        int i6;
        char c2;
        G0.b bVar = new G0.b((t) ((g) this.f2117c).f2095g);
        int codePointAt = Character.codePointAt(charSequence, i3);
        boolean z4 = true;
        int i7 = 0;
        int i8 = i3;
        loop0: while (true) {
            i6 = i8;
            while (i8 < i4 && i7 < i5 && z4) {
                SparseArray sparseArray = ((t) bVar.f2079f).f6979a;
                t tVar = sparseArray == null ? null : (t) sparseArray.get(codePointAt);
                if (bVar.f2075b == 2) {
                    if (tVar != null) {
                        bVar.f2079f = tVar;
                        bVar.f2077d++;
                    } else {
                        if (codePointAt == 65038) {
                            bVar.c();
                        } else if (codePointAt != 65039) {
                            t tVar2 = (t) bVar.f2079f;
                            if (tVar2.f6980b != null) {
                                if (bVar.f2077d != 1) {
                                    bVar.f2080g = tVar2;
                                    bVar.c();
                                } else if (bVar.d()) {
                                    bVar.f2080g = (t) bVar.f2079f;
                                    bVar.c();
                                } else {
                                    bVar.c();
                                }
                                c2 = 3;
                            } else {
                                bVar.c();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (tVar == null) {
                    bVar.c();
                    c2 = 1;
                } else {
                    bVar.f2075b = 2;
                    bVar.f2079f = tVar;
                    bVar.f2077d = 1;
                    c2 = 2;
                }
                bVar.f2076c = codePointAt;
                if (c2 == 1) {
                    i8 = Character.charCount(Character.codePointAt(charSequence, i6)) + i6;
                    if (i8 < i4) {
                        codePointAt = Character.codePointAt(charSequence, i8);
                    }
                } else if (c2 == 2) {
                    int charCount = Character.charCount(codePointAt) + i8;
                    if (charCount < i4) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i8 = charCount;
                } else if (c2 == 3) {
                    if (z3 || !p(charSequence, i6, i8, ((t) bVar.f2080g).f6980b)) {
                        z4 = oVar.c(charSequence, i6, i8, ((t) bVar.f2080g).f6980b);
                        i7++;
                    }
                }
            }
        }
        if (bVar.f2075b == 2 && ((t) bVar.f2079f).f6980b != null && ((bVar.f2077d > 1 || bVar.d()) && i7 < i5 && z4 && (z3 || !p(charSequence, i6, i8, ((t) bVar.f2079f).f6980b)))) {
            oVar.c(charSequence, i6, i8, ((t) bVar.f2079f).f6980b);
        }
        return oVar.b();
    }

    public String toString() {
        switch (this.f2115a) {
            case 17:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f2116b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f2117c;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f2118d;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                f2.j.e(sb2, "sb.toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public void u(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0139b.f2791a) {
            this.f2118d = obj;
            return;
        }
        synchronized (this.f2117c) {
            Q.e eVar = (Q.e) ((AtomicReference) this.f2116b).get();
            int a3 = eVar.a(id);
            if (a3 < 0) {
                ((AtomicReference) this.f2116b).set(eVar.b(id, obj));
            } else {
                eVar.f3957c[a3] = obj;
            }
        }
    }

    public void v(r rVar) {
        ((C0401b) this.f2118d).f5648d.f5646c = rVar;
    }

    public void w(O0.b bVar) {
        ((C0401b) this.f2118d).f5648d.f5644a = bVar;
    }

    public void x(C0416b c0416b) {
        this.f2117c = c0416b;
    }

    public void y(O0.k kVar) {
        ((C0401b) this.f2118d).f5648d.f5645b = kVar;
    }

    public void z(long j3) {
        ((C0401b) this.f2118d).f5648d.f5647d = j3;
    }

    public m(a0 a0Var, X x3, s0 s0Var) {
        this.f2115a = 13;
        f2.j.f(a0Var, "store");
        f2.j.f(s0Var, "extras");
        this.f2116b = a0Var;
        this.f2117c = x3;
        this.f2118d = s0Var;
    }

    public m(K0 k02) {
        this.f2115a = 18;
        this.f2116b = k02;
    }

    public m(AppDatabase_Impl appDatabase_Impl) {
        this.f2115a = 0;
        this.f2116b = appDatabase_Impl;
        this.f2117c = new c(appDatabase_Impl, 1);
        this.f2118d = new d(appDatabase_Impl, 2);
    }

    public m(InterfaceC0919p interfaceC0919p) {
        this.f2115a = 12;
        this.f2116b = interfaceC0919p;
        this.f2117c = new C0710h(0);
        C0544r c0544r = new C0544r();
        c0544r.f6313a = AbstractC0522D.f6254a;
        c0544r.f6314b = AbstractC0537k.f6286a;
        c0544r.f6315c = AbstractC0561a.f6410c;
        c0544r.c(AbstractC0522D.f(10));
        this.f2118d = c0544r;
    }

    public m(int i3) {
        this.f2115a = i3;
        switch (i3) {
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                this.f2118d = new A1.i(6, false);
                break;
            case 5:
                this.f2116b = new WeakHashMap();
                this.f2117c = new WeakHashMap();
                this.f2118d = new WeakHashMap();
                break;
            case AbstractC0856c.f8039e /* 10 */:
                this.f2117c = new A.h(22, this);
                break;
            default:
                this.f2116b = new AtomicReference(Q.f.f3958a);
                this.f2117c = new Object();
                break;
        }
    }

    public m(Intent intent) {
        this.f2115a = 17;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f2116b = data;
        this.f2117c = action;
        this.f2118d = type;
    }

    public m(View view) {
        this.f2115a = 2;
        this.f2116b = view;
        this.f2117c = R1.a.c(R1.g.f4148e, new A.h(9, this));
        Y y3 = new Y();
        if (Build.VERSION.SDK_INT >= 30) {
            C0385i c0385i = new C0385i(view);
            c0385i.f5602e = view;
            y3.f334d = c0385i;
        } else {
            y3.f334d = new Y(view);
        }
        this.f2118d = y3;
    }

    public m(C0401b c0401b) {
        this.f2115a = 8;
        this.f2118d = c0401b;
        this.f2116b = new Y(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, Q.a aVar) {
        this.f2115a = 14;
        this.f2116b = (f2.k) interfaceC0424c;
        this.f2117c = (f2.k) interfaceC0424c2;
        this.f2118d = aVar;
    }

    public m(g gVar, A1.i iVar, C0646d c0646d, Set set) {
        this.f2115a = 11;
        this.f2116b = iVar;
        this.f2117c = gVar;
        this.f2118d = c0646d;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            t(str, 0, str.length(), 1, true, new q(str, 0));
        }
    }

    public m(s sVar, m mVar) {
        this.f2115a = 4;
        this.f2116b = sVar;
        this.f2117c = mVar;
        this.f2118d = sVar.f2611d;
    }

    public m(E e3) {
        this.f2115a = 16;
        this.f2116b = e3;
        this.f2117c = new ArrayList();
        this.f2118d = e3;
    }

    public m(App app, String str, C0011l c0011l) {
        this.f2115a = 19;
        f2.j.f(c0011l, "callback");
        this.f2116b = app;
        this.f2117c = str;
        this.f2118d = c0011l;
    }

    public m(Application application) {
        this.f2115a = 6;
        C0072b c0072b = D2.c.f870d;
        f2.j.f(c0072b, "from");
        D2.i iVar = c0072b.f871a;
        EnumC0071a enumC0071a = iVar.f894p;
        String str = iVar.f888j;
        boolean z3 = iVar.f887i;
        if (z3) {
            if (f2.j.a(str, "type")) {
                if (enumC0071a != EnumC0071a.f868d) {
                    throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
                }
            } else {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
        }
        boolean z4 = iVar.f883e;
        String str2 = iVar.f885g;
        if (!z4) {
            if (!f2.j.a(str2, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
            }
        } else if (!f2.j.a(str2, "    ")) {
            for (int i3 = 0; i3 < str2.length(); i3++) {
                char charAt = str2.charAt(i3);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str2).toString());
                }
            }
        }
        D2.i iVar2 = new D2.i(iVar.f879a, true, true, iVar.f882d, z4, iVar.f884f, str2, iVar.f886h, z3, str, iVar.f889k, iVar.f890l, iVar.f891m, iVar.f892n, iVar.f893o, enumC0071a);
        A1.i iVar3 = c0072b.f872b;
        f2.j.f(iVar3, "module");
        D2.p pVar = new D2.p(iVar2, iVar3);
        this.f2116b = application;
        this.f2117c = pVar;
        G2.q qVar = new G2.q();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f2.j.f(timeUnit, "unit");
        qVar.f2245r = H2.b.b(10L, timeUnit);
        qVar.f2246s = H2.b.b(15L, timeUnit);
        this.f2118d = new G2.r(qVar);
    }
}
