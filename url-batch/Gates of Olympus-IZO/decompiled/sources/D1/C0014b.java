package D1;

import I.AbstractC0085b;
import I.C0089d;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.util.SparseArray;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import b0.InterfaceC0285r;
import d0.C0321b;
import e0.C0336b;
import f.AbstractC0382a;
import h1.C0438i;
import j.AbstractC0478D;
import j.AbstractC0493k;
import j.C0494l;
import j.C0500r;
import j.C0504v;
import j1.C0513d;
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
import k.AbstractC0522a;
import k.C0523b;
import k1.C0526a;
import m.w0;
import m0.C0616a;
import m0.C0617b;
import m0.C0620e;
import n1.C0675b;
import p1.C0765d;
import r0.InterfaceC0838k;
import t0.AbstractC0898f;
import u0.C0997t;
import x2.C1057b;
import x2.EnumC1056a;

/* renamed from: D1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f535a;

    /* renamed from: b, reason: collision with root package name */
    public Object f536b;

    /* renamed from: c, reason: collision with root package name */
    public Object f537c;

    /* renamed from: d, reason: collision with root package name */
    public Object f538d;

    public /* synthetic */ C0014b(Object obj, Object obj2, Object obj3, int i3) {
        this.f535a = i3;
        this.f536b = obj;
        this.f537c = obj2;
        this.f538d = obj3;
    }

    public void A() {
        ArrayList arrayList = (ArrayList) this.f537c;
        if (arrayList.isEmpty()) {
            C0089d.S("empty stack");
            throw null;
        }
        this.f538d = arrayList.remove(arrayList.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    public void a(long j3, List list, boolean z3) {
        long[] jArr;
        boolean z4;
        long[] jArr2;
        boolean z5;
        int i3;
        n0.e eVar;
        n0.e eVar2;
        n0.f fVar = (n0.f) this.f537c;
        C0500r c0500r = (C0500r) this.f538d;
        int i4 = 0;
        c0500r.f5199e = 0;
        long[] jArr3 = c0500r.f5195a;
        char c3 = 7;
        if (jArr3 != AbstractC0478D.f5136a) {
            M1.k.d0(jArr3);
            long[] jArr4 = c0500r.f5195a;
            int i5 = c0500r.f5198d;
            int i6 = i5 >> 3;
            long j4 = 255 << ((i5 & 7) << 3);
            jArr4[i6] = (jArr4[i6] & (~j4)) | j4;
        }
        M1.k.c0(c0500r.f5197c, 0, c0500r.f5198d);
        c0500r.f5200f = AbstractC0478D.c(c0500r.f5198d) - c0500r.f5199e;
        int size = list.size();
        boolean z6 = true;
        n0.f fVar2 = fVar;
        int i7 = 0;
        boolean z7 = true;
        while (i7 < size) {
            U.k kVar = (U.k) list.get(i7);
            if (z7) {
                K.d dVar = fVar2.f6213a;
                int i8 = dVar.f2642f;
                if (i8 > 0) {
                    ?? r14 = dVar.f2640d;
                    int i9 = i4;
                    while (true) {
                        eVar2 = r14[i9];
                        if (Z1.i.a(((n0.e) eVar2).f6205b, kVar)) {
                            break;
                        }
                        int i10 = i9 + 1;
                        if (i10 >= i8) {
                            break;
                        } else {
                            i9 = i10;
                        }
                    }
                }
                eVar2 = 0;
                eVar = eVar2;
                if (eVar != null) {
                    eVar.f6211h = true;
                    eVar.f6206c.a(j3);
                    Object b2 = c0500r.b(j3);
                    Object obj = b2;
                    if (b2 == null) {
                        C0504v c0504v = new C0504v();
                        c0500r.d(j3, c0504v);
                        obj = c0504v;
                    }
                    ((C0504v) obj).a(eVar);
                    fVar2 = eVar;
                    i7++;
                    i4 = 0;
                } else {
                    z7 = false;
                }
            }
            eVar = new n0.e(kVar);
            eVar.f6206c.a(j3);
            Object b3 = c0500r.b(j3);
            Object obj2 = b3;
            if (b3 == null) {
                C0504v c0504v2 = new C0504v();
                c0500r.d(j3, c0504v2);
                obj2 = c0504v2;
            }
            ((C0504v) obj2).a(eVar);
            fVar2.f6213a.b(eVar);
            fVar2 = eVar;
            i7++;
            i4 = 0;
        }
        if (!z3) {
            return;
        }
        long[] jArr5 = c0500r.f5196b;
        Object[] objArr = c0500r.f5197c;
        long[] jArr6 = c0500r.f5195a;
        int length = jArr6.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j5 = jArr6[i11];
            if ((((~j5) << c3) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j5 & 255) < 128) {
                        int i15 = (i11 << 3) + i14;
                        long j6 = jArr5[i15];
                        C0504v c0504v3 = (C0504v) objArr[i15];
                        K.d dVar2 = fVar.f6213a;
                        int i16 = dVar2.f2642f;
                        if (i16 > 0) {
                            Object[] objArr2 = dVar2.f2640d;
                            int i17 = 0;
                            while (true) {
                                ((n0.e) objArr2[i17]).i(j6, c0504v3);
                                jArr2 = jArr5;
                                z5 = true;
                                int i18 = i17 + 1;
                                if (i18 >= i16) {
                                    break;
                                }
                                i17 = i18;
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
                        i3 = i12;
                    }
                    j5 >>= i3;
                    i14++;
                    z6 = z5;
                    i12 = i3;
                    jArr5 = jArr2;
                }
                jArr = jArr5;
                z4 = z6;
                if (i13 != i12) {
                    return;
                }
            } else {
                jArr = jArr5;
                z4 = z6;
            }
            if (i11 == length) {
                return;
            }
            i11++;
            z6 = z4;
            jArr5 = jArr;
            c3 = 7;
        }
    }

    public void b() {
        ((ArrayList) this.f537c).clear();
        this.f538d = (t0.D) this.f536b;
        ((t0.D) this.f536b).L();
    }

    public boolean c(C2.c cVar, boolean z3) {
        boolean z4;
        boolean z5;
        n0.f fVar = (n0.f) this.f537c;
        if (!fVar.a((C0494l) cVar.f484e, (InterfaceC0838k) this.f536b, cVar, z3)) {
            return false;
        }
        K.d dVar = fVar.f6213a;
        int i3 = dVar.f2642f;
        if (i3 > 0) {
            Object[] objArr = dVar.f2640d;
            int i4 = 0;
            z4 = false;
            do {
                z4 = ((n0.e) objArr[i4]).h(cVar, z3) || z4;
                i4++;
            } while (i4 < i3);
        } else {
            z4 = false;
        }
        int i5 = dVar.f2642f;
        if (i5 > 0) {
            Object[] objArr2 = dVar.f2640d;
            int i6 = 0;
            z5 = false;
            do {
                z5 = ((n0.e) objArr2[i6]).g(cVar) || z5;
                i6++;
            } while (i6 < i5);
        } else {
            z5 = false;
        }
        fVar.c(cVar);
        return z5 || z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(long j3, long j4, R1.c cVar) {
        C0616a c0616a;
        int i3;
        long j5;
        if (cVar instanceof C0616a) {
            c0616a = (C0616a) cVar;
            int i4 = c0616a.f5896f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0616a.f5896f = i4 - Integer.MIN_VALUE;
                C0616a c0616a2 = c0616a;
                Object obj = c0616a2.f5894d;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0616a2.f5896f;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    C0620e c0620e = (C0620e) this.f536b;
                    C0620e c0620e2 = null;
                    if (c0620e != null && c0620e.p) {
                        c0620e2 = (C0620e) AbstractC0898f.k(c0620e);
                    }
                    if (c0620e2 == null) {
                        j5 = 0;
                        return new M0.n(j5);
                    }
                    c0616a2.f5896f = 1;
                    obj = c0620e2.w0(j3, j4, c0616a2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    I2.l.Q(obj);
                }
                j5 = ((M0.n) obj).f2783a;
                return new M0.n(j5);
            }
        }
        c0616a = new C0616a(this, cVar);
        C0616a c0616a22 = c0616a;
        Object obj2 = c0616a22.f5894d;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0616a22.f5896f;
        if (i3 != 0) {
        }
        j5 = ((M0.n) obj2).f2783a;
        return new M0.n(j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(long j3, R1.c cVar) {
        C0617b c0617b;
        int i3;
        long j4;
        if (cVar instanceof C0617b) {
            c0617b = (C0617b) cVar;
            int i4 = c0617b.f5899f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0617b.f5899f = i4 - Integer.MIN_VALUE;
                Object obj = c0617b.f5897d;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0617b.f5899f;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    C0620e c0620e = (C0620e) this.f536b;
                    C0620e c0620e2 = null;
                    if (c0620e != null && c0620e.p) {
                        c0620e2 = (C0620e) AbstractC0898f.k(c0620e);
                    }
                    if (c0620e2 == null) {
                        j4 = 0;
                        return new M0.n(j4);
                    }
                    c0617b.f5899f = 1;
                    obj = c0620e2.y0(j3, c0617b);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    I2.l.Q(obj);
                }
                j4 = ((M0.n) obj).f2783a;
                return new M0.n(j4);
            }
        }
        c0617b = new C0617b(this, cVar);
        Object obj2 = c0617b.f5897d;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0617b.f5899f;
        if (i3 != 0) {
        }
        j4 = ((M0.n) obj2).f2783a;
        return new M0.n(j4);
    }

    public void f(Object obj) {
        ((ArrayList) this.f537c).add(this.f538d);
        this.f538d = obj;
    }

    public Object g() {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0085b.f2234a) {
            return this.f538d;
        }
        Q.e eVar = (Q.e) ((AtomicReference) this.f536b).get();
        int a3 = eVar.a(id);
        if (a3 >= 0) {
            return eVar.f3091c[a3];
        }
        return null;
    }

    public InterfaceC0285r h() {
        return ((C0321b) this.f538d).f4443d.f4441c;
    }

    public Object i() {
        return this.f538d;
    }

    public M0.b j() {
        return ((C0321b) this.f538d).f4443d.f4439a;
    }

    public C0336b k() {
        return (C0336b) this.f537c;
    }

    public M0.j l() {
        return ((C0321b) this.f538d).f4443d.f4440b;
    }

    public long m() {
        return ((C0321b) this.f538d).f4443d.f4442d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V n(Z1.d dVar, String str) {
        boolean isInstance;
        V a3;
        Z1.i.f(str, "key");
        a0 a0Var = (a0) this.f536b;
        a0Var.getClass();
        LinkedHashMap linkedHashMap = a0Var.f4007a;
        V v3 = (V) linkedHashMap.get(str);
        Class cls = dVar.f3469a;
        Z1.i.f(cls, "jClass");
        Map map = Z1.d.f3466b;
        Z1.i.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = Z1.w.e(num.intValue(), v3);
        } else {
            if (cls.isPrimitive()) {
                cls = I2.d.B(Z1.u.a(cls));
            }
            isInstance = cls.isInstance(v3);
        }
        X x3 = (X) this.f537c;
        if (isInstance) {
            if (x3 instanceof Z) {
                Z1.i.c(v3);
                ((Z) x3).d(v3);
            }
            Z1.i.d(v3, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return v3;
        }
        C0675b c0675b = new C0675b((w0) this.f538d);
        ((LinkedHashMap) c0675b.f5876a).put(C0765d.f6760a, str);
        try {
            try {
                a3 = x3.c(dVar, c0675b);
            } catch (AbstractMethodError unused) {
                a3 = x3.a(I2.d.A(dVar));
            }
        } catch (AbstractMethodError unused2) {
            a3 = x3.b(I2.d.A(dVar), c0675b);
        }
        Z1.i.f(a3, "viewModel");
        V v4 = (V) linkedHashMap.put(str, a3);
        if (v4 != null) {
            v4.b();
        }
        return a3;
    }

    public boolean o(CharSequence charSequence, int i3, int i4, j1.t tVar) {
        if ((tVar.f5291c & 3) == 0) {
            C0513d c0513d = (C0513d) this.f538d;
            C0526a c3 = tVar.c();
            int a3 = c3.a(8);
            if (a3 != 0) {
                ((ByteBuffer) c3.f2874g).getShort(a3 + c3.f2871d);
            }
            c0513d.getClass();
            ThreadLocal threadLocal = C0513d.f5246b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i3 < i4) {
                sb.append(charSequence.charAt(i3));
                i3++;
            }
            TextPaint textPaint = c0513d.f5247a;
            String sb2 = sb.toString();
            int i5 = V0.e.f3353a;
            boolean a4 = V0.d.a(textPaint, sb2);
            int i6 = tVar.f5291c & 4;
            tVar.f5291c = a4 ? i6 | 2 : i6 | 1;
        }
        return (tVar.f5291c & 3) == 2;
    }

    public boolean p() {
        C0014b c0014b;
        return ((F0.t) this.f536b).f1468d != this.f538d || ((c0014b = (C0014b) this.f537c) != null && c0014b.p());
    }

    public void q(Object obj) {
        b.m mVar = (b.m) this.f536b;
        LinkedHashMap linkedHashMap = mVar.f4168b;
        String str = (String) this.f537c;
        Object obj2 = linkedHashMap.get(str);
        AbstractC0382a abstractC0382a = (AbstractC0382a) this.f538d;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0382a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        ArrayList arrayList = mVar.f4170d;
        arrayList.add(str);
        try {
            mVar.b(intValue, abstractC0382a, obj);
        } catch (Exception e3) {
            arrayList.remove(str);
            throw e3;
        }
    }

    public void r() {
        C0997t c0997t = ((t0.D) this.f536b).f7724l;
        if (c0997t != null) {
            c0997t.v();
        }
    }

    public Object s(CharSequence charSequence, int i3, int i4, int i5, boolean z3, j1.o oVar) {
        int i6;
        char c3;
        E0.b bVar = new E0.b((j1.s) ((A2.k) this.f537c).f110d);
        int codePointAt = Character.codePointAt(charSequence, i3);
        boolean z4 = true;
        int i7 = 0;
        int i8 = i3;
        loop0: while (true) {
            i6 = i8;
            while (i8 < i4 && i7 < i5 && z4) {
                SparseArray sparseArray = ((j1.s) bVar.f729f).f5286a;
                j1.s sVar = sparseArray == null ? null : (j1.s) sparseArray.get(codePointAt);
                if (bVar.f725b == 2) {
                    if (sVar != null) {
                        bVar.f729f = sVar;
                        bVar.f727d++;
                    } else {
                        if (codePointAt == 65038) {
                            bVar.c();
                        } else if (codePointAt != 65039) {
                            j1.s sVar2 = (j1.s) bVar.f729f;
                            if (sVar2.f5287b != null) {
                                if (bVar.f727d != 1) {
                                    bVar.f730g = sVar2;
                                    bVar.c();
                                } else if (bVar.d()) {
                                    bVar.f730g = (j1.s) bVar.f729f;
                                    bVar.c();
                                } else {
                                    bVar.c();
                                }
                                c3 = 3;
                            } else {
                                bVar.c();
                            }
                        }
                        c3 = 1;
                    }
                    c3 = 2;
                } else if (sVar == null) {
                    bVar.c();
                    c3 = 1;
                } else {
                    bVar.f725b = 2;
                    bVar.f729f = sVar;
                    bVar.f727d = 1;
                    c3 = 2;
                }
                bVar.f726c = codePointAt;
                if (c3 == 1) {
                    i8 = Character.charCount(Character.codePointAt(charSequence, i6)) + i6;
                    if (i8 < i4) {
                        codePointAt = Character.codePointAt(charSequence, i8);
                    }
                } else if (c3 == 2) {
                    int charCount = Character.charCount(codePointAt) + i8;
                    if (charCount < i4) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i8 = charCount;
                } else if (c3 == 3) {
                    if (z3 || !o(charSequence, i6, i8, ((j1.s) bVar.f730g).f5287b)) {
                        z4 = oVar.b(charSequence, i6, i8, ((j1.s) bVar.f730g).f5287b);
                        i7++;
                    }
                }
            }
        }
        if (bVar.f725b == 2 && ((j1.s) bVar.f729f).f5287b != null && ((bVar.f727d > 1 || bVar.d()) && i7 < i5 && z4 && (z3 || !o(charSequence, i6, i8, ((j1.s) bVar.f729f).f5287b)))) {
            oVar.b(charSequence, i6, i8, ((j1.s) bVar.f729f).f5287b);
        }
        return oVar.a();
    }

    public void t(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0085b.f2234a) {
            this.f538d = obj;
            return;
        }
        synchronized (this.f537c) {
            Q.e eVar = (Q.e) ((AtomicReference) this.f536b).get();
            int a3 = eVar.a(id);
            if (a3 < 0) {
                ((AtomicReference) this.f536b).set(eVar.b(id, obj));
            } else {
                eVar.f3091c[a3] = obj;
            }
        }
    }

    public String toString() {
        switch (this.f535a) {
            case 12:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f536b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f537c;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f538d;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                Z1.i.e(sb2, "sb.toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public void u(InterfaceC0285r interfaceC0285r) {
        ((C0321b) this.f538d).f4443d.f4441c = interfaceC0285r;
    }

    public void v(M0.b bVar) {
        ((C0321b) this.f538d).f4443d.f4439a = bVar;
    }

    public void w(C0336b c0336b) {
        this.f537c = c0336b;
    }

    public void x(M0.j jVar) {
        ((C0321b) this.f538d).f4443d.f4440b = jVar;
    }

    public void y(long j3) {
        ((C0321b) this.f538d).f4443d.f4442d = j3;
    }

    public void z() {
        R.l lVar = (R.l) this.f536b;
        LinkedHashMap linkedHashMap = lVar.f3162c;
        String str = (String) this.f537c;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove((A2.l) this.f538d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        lVar.f3162c.put(str, list);
    }

    public C0014b(a0 a0Var, X x3, w0 w0Var) {
        this.f535a = 11;
        Z1.i.f(a0Var, "store");
        Z1.i.f(w0Var, "extras");
        this.f536b = a0Var;
        this.f537c = x3;
        this.f538d = w0Var;
    }

    public C0014b(InterfaceC0838k interfaceC0838k) {
        this.f535a = 10;
        this.f536b = interfaceC0838k;
        this.f537c = new n0.f(0);
        C0500r c0500r = new C0500r();
        c0500r.f5195a = AbstractC0478D.f5136a;
        c0500r.f5196b = AbstractC0493k.f5168a;
        c0500r.f5197c = AbstractC0522a.f5304c;
        c0500r.c(AbstractC0478D.f(10));
        this.f538d = c0500r;
    }

    public C0014b(int i3) {
        this.f535a = i3;
        switch (i3) {
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f536b = new AtomicReference(Q.f.f3092a);
                this.f537c = new Object();
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                this.f536b = new WeakHashMap();
                this.f537c = new WeakHashMap();
                this.f538d = new WeakHashMap();
                break;
            case AbstractC0382a.f4777a /* 9 */:
                this.f537c = new A2.l(23, this);
                break;
            default:
                this.f538d = new F0.a(4);
                break;
        }
    }

    public C0014b(Intent intent) {
        this.f535a = 12;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f536b = data;
        this.f537c = action;
        this.f538d = type;
    }

    public C0014b(C0321b c0321b) {
        this.f535a = 6;
        this.f538d = c0321b;
        this.f536b = new A2.g(20, this);
    }

    public C0014b(A2.k kVar, F0.a aVar, C0513d c0513d, Set set) {
        this.f535a = 8;
        this.f536b = aVar;
        this.f537c = kVar;
        this.f538d = c0513d;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new j1.p(str, 0));
        }
    }

    public C0014b(F0.t tVar, C0014b c0014b) {
        this.f535a = 3;
        this.f536b = tVar;
        this.f537c = c0014b;
        this.f538d = tVar.f1468d;
    }

    public C0014b(t0.D d3) {
        this.f535a = 13;
        this.f536b = d3;
        this.f537c = new ArrayList();
        this.f538d = d3;
    }

    public C0014b(Application application) {
        this.f535a = 0;
        C1057b c1057b = x2.c.f8731d;
        Z1.i.f(c1057b, "from");
        x2.i iVar = c1057b.f8732a;
        EnumC1056a enumC1056a = iVar.p;
        String str = iVar.f8749j;
        boolean z3 = iVar.f8748i;
        if (z3) {
            if (Z1.i.a(str, "type")) {
                if (enumC1056a != EnumC1056a.f8729d) {
                    throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
                }
            } else {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
        }
        boolean z4 = iVar.f8744e;
        String str2 = iVar.f8746g;
        if (!z4) {
            if (!Z1.i.a(str2, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
            }
        } else if (!Z1.i.a(str2, "    ")) {
            for (int i3 = 0; i3 < str2.length(); i3++) {
                char charAt = str2.charAt(i3);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str2).toString());
                }
            }
        }
        x2.i iVar2 = new x2.i(iVar.f8740a, true, true, iVar.f8743d, z4, iVar.f8745f, str2, iVar.f8747h, z3, str, iVar.f8750k, iVar.f8751l, iVar.f8752m, iVar.f8753n, iVar.f8754o, enumC1056a);
        C0523b c0523b = c1057b.f8733b;
        Z1.i.f(c0523b, "module");
        x2.p pVar = new x2.p(iVar2, c0523b);
        this.f536b = application;
        this.f537c = pVar;
        A2.t tVar = new A2.t();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Z1.i.f(timeUnit, "unit");
        tVar.f158r = B2.c.b(10L, timeUnit);
        tVar.f159s = B2.c.b(15L, timeUnit);
        this.f538d = new A2.u(tVar);
    }
}
