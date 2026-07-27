package U;

import A0.C0036g;
import A0.H;
import A0.I;
import C.t;
import M0.m;
import W2.F;
import X.e;
import Y.d;
import Y2.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.lifecycle.InterfaceC0465e;
import androidx.lifecycle.InterfaceC0481v;
import i.C0671f;
import i.j;
import i.q;
import i.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import r0.AbstractC1065f;
import r0.E;
import r0.a0;
import s0.AbstractC1125K;
import s0.C0;
import s0.C1166s;
import s0.J0;
import v0.AbstractC1235a;
import v0.AbstractC1236b;
import v0.AbstractC1237c;
import v0.AbstractC1239e;
import v0.AbstractC1242h;
import v0.C1238d;
import v0.C1243i;
import y0.C1317a;
import y0.f;
import y0.h;
import y0.i;
import y0.n;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class c implements InterfaceC0465e, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final C1166s f4065d;

    /* renamed from: e, reason: collision with root package name */
    public final e f4066e;

    /* renamed from: i, reason: collision with root package name */
    public C1238d f4067i;

    /* renamed from: j, reason: collision with root package name */
    public final q f4068j = new q();

    /* renamed from: k, reason: collision with root package name */
    public final r f4069k = new r();

    /* renamed from: l, reason: collision with root package name */
    public final long f4070l = 100;

    /* renamed from: m, reason: collision with root package name */
    public int f4071m = 1;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4072n = true;

    /* renamed from: o, reason: collision with root package name */
    public final C0671f f4073o = new C0671f(0);

    /* renamed from: p, reason: collision with root package name */
    public final Y2.e f4074p = l.a(1, 6, null);

    /* renamed from: q, reason: collision with root package name */
    public final Handler f4075q = new Handler(Looper.getMainLooper());

    /* renamed from: r, reason: collision with root package name */
    public q f4076r;

    /* renamed from: s, reason: collision with root package name */
    public long f4077s;

    /* renamed from: t, reason: collision with root package name */
    public final q f4078t;

    /* renamed from: u, reason: collision with root package name */
    public J0 f4079u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4080v;

    /* renamed from: w, reason: collision with root package name */
    public final t f4081w;

    public c(C1166s c1166s, e eVar) {
        this.f4065d = c1166s;
        this.f4066e = eVar;
        q qVar = j.f6922a;
        Intrinsics.d(qVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f4076r = qVar;
        this.f4078t = new q();
        n a4 = c1166s.getSemanticsOwner().a();
        Intrinsics.d(qVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f4079u = new J0(a4, qVar);
        this.f4081w = new t(2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:13:0x004e, B:17:0x005b, B:19:0x0063, B:21:0x006c, B:22:0x006f, B:24:0x0073, B:25:0x007c, B:34:0x003c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008d -> B:13:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(E2.c cVar) {
        b bVar;
        Object obj;
        D2.a aVar;
        int i2;
        c cVar2;
        Y2.c cVar3;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i4 = bVar.f4064n;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    bVar.f4064n = i4 - Integer.MIN_VALUE;
                    obj = bVar.f4062l;
                    aVar = D2.a.f2163d;
                    i2 = bVar.f4064n;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        try {
                            Y2.e eVar = this.f4074p;
                            eVar.getClass();
                            cVar3 = new Y2.c(eVar);
                            cVar2 = this;
                        } catch (Throwable th) {
                            th = th;
                            cVar2 = this;
                            cVar2.f4073o.clear();
                            throw th;
                        }
                    } else if (i2 == 1) {
                        cVar3 = bVar.f4061k;
                        cVar2 = bVar.f4060j;
                        AbstractC1343r.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            cVar2.f4073o.clear();
                            return Unit.f7487a;
                        }
                        cVar3.c();
                        if (cVar2.g()) {
                            cVar2.h();
                        }
                        if (!cVar2.f4080v) {
                            cVar2.f4080v = true;
                            cVar2.f4075q.post(cVar2.f4081w);
                        }
                        cVar2.f4073o.clear();
                        long j4 = cVar2.f4070l;
                        bVar.f4060j = cVar2;
                        bVar.f4061k = cVar3;
                        bVar.f4064n = 2;
                        if (F.a(j4, bVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar3 = bVar.f4061k;
                        cVar2 = bVar.f4060j;
                        AbstractC1343r.b(obj);
                    }
                    bVar.f4060j = cVar2;
                    bVar.f4061k = cVar3;
                    bVar.f4064n = 1;
                    obj = cVar3.b(bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            }
            if (i2 != 0) {
            }
            bVar.f4060j = cVar2;
            bVar.f4061k = cVar3;
            bVar.f4064n = 1;
            obj = cVar3.b(bVar);
            if (obj == aVar) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        bVar = new b(this, cVar);
        obj = bVar.f4062l;
        aVar = D2.a.f2163d;
        i2 = bVar.f4064n;
    }

    @Override // androidx.lifecycle.InterfaceC0465e
    public final void d(InterfaceC0481v interfaceC0481v) {
        m(this.f4065d.getSemanticsOwner().a());
        h();
        this.f4067i = null;
    }

    public final q e() {
        if (this.f4072n) {
            this.f4072n = false;
            this.f4076r = AbstractC1125K.e(this.f4065d.getSemanticsOwner());
            this.f4077s = System.currentTimeMillis();
        }
        return this.f4076r;
    }

    @Override // androidx.lifecycle.InterfaceC0465e
    public final void f(InterfaceC0481v interfaceC0481v) {
        this.f4067i = (C1238d) this.f4066e.invoke();
        l(this.f4065d.getSemanticsOwner().a());
        h();
    }

    public final boolean g() {
        return this.f4067i != null;
    }

    public final void h() {
        String str;
        String str2;
        C1238d c1238d = this.f4067i;
        if (c1238d != null && Build.VERSION.SDK_INT >= 29) {
            q qVar = this.f4068j;
            int i2 = qVar.f6944e;
            Object obj = c1238d.f10973a;
            String str3 = "TREAT_AS_VIEW_TREE_APPEARED";
            char c4 = 7;
            long j4 = -9187201950435737472L;
            int i4 = 0;
            View view = c1238d.f10974b;
            if (i2 != 0) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = qVar.f6942c;
                long[] jArr = qVar.f6940a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j5 = jArr[i5];
                        str2 = str3;
                        if ((((~j5) << 7) & j5 & j4) != j4) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j5 & 255) < 128) {
                                    arrayList.add((C1243i) objArr[(i5 << 3) + i7]);
                                }
                                j5 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        str3 = str2;
                        j4 = -9187201950435737472L;
                    }
                } else {
                    str2 = "TREAT_AS_VIEW_TREE_APPEARED";
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList2.add(((C1243i) arrayList.get(i8)).f10975a);
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 34) {
                    AbstractC1237c.a(C0.c(obj), arrayList2);
                } else if (i9 >= 29) {
                    ViewStructure b4 = AbstractC1236b.b(C0.c(obj), view);
                    AbstractC1235a.a(b4).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    AbstractC1236b.d(C0.c(obj), b4);
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        AbstractC1236b.d(C0.c(obj), (ViewStructure) arrayList2.get(i10));
                    }
                    ViewStructure b5 = AbstractC1236b.b(C0.c(obj), view);
                    str3 = str2;
                    AbstractC1235a.a(b5).putBoolean(str3, true);
                    AbstractC1236b.d(C0.c(obj), b5);
                    qVar.a();
                }
                str3 = str2;
                qVar.a();
            }
            r rVar = this.f4069k;
            if (rVar.f6949d != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = rVar.f6947b;
                long[] jArr2 = rVar.f6946a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j6 = jArr2[i11];
                        long[] jArr3 = jArr2;
                        str = str3;
                        if ((((~j6) << c4) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j6 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i11 << 3) + i13]));
                                }
                                j6 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length2) {
                            break;
                        }
                        i11++;
                        jArr2 = jArr3;
                        str3 = str;
                        c4 = 7;
                    }
                } else {
                    str = str3;
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i14)).intValue()));
                }
                Intrinsics.checkNotNullParameter(arrayList4, "<this>");
                long[] jArr4 = new long[arrayList4.size()];
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    jArr4[i4] = ((Number) it.next()).longValue();
                    i4++;
                }
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 34) {
                    AbstractC1236b.f(C0.c(obj), AbstractC1239e.a(view), jArr4);
                } else if (i15 >= 29) {
                    ViewStructure b6 = AbstractC1236b.b(C0.c(obj), view);
                    AbstractC1235a.a(b6).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    AbstractC1236b.d(C0.c(obj), b6);
                    AbstractC1236b.f(C0.c(obj), AbstractC1239e.a(view), jArr4);
                    ViewStructure b7 = AbstractC1236b.b(C0.c(obj), view);
                    AbstractC1235a.a(b7).putBoolean(str, true);
                    AbstractC1236b.d(C0.c(obj), b7);
                }
                rVar.b();
            }
        }
    }

    public final void i(n nVar, J0 j02) {
        List h4 = n.h(nVar, true, 4);
        int size = h4.size();
        for (int i2 = 0; i2 < size; i2++) {
            n nVar2 = (n) h4.get(i2);
            if (e().b(nVar2.f11590g) && !j02.f10064b.c(nVar2.f11590g)) {
                l(nVar2);
            }
        }
        q qVar = this.f4078t;
        int[] iArr = qVar.f6941b;
        long[] jArr = qVar.f6940a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128) {
                            int i7 = iArr[(i4 << 3) + i6];
                            if (!e().b(i7)) {
                                q qVar2 = this.f4068j;
                                if (qVar2.c(i7)) {
                                    qVar2.h(i7);
                                } else {
                                    this.f4069k.a(i7);
                                }
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        List h5 = n.h(nVar, true, 4);
        int size2 = h5.size();
        for (int i8 = 0; i8 < size2; i8++) {
            n nVar3 = (n) h5.get(i8);
            if (e().b(nVar3.f11590g)) {
                int i9 = nVar3.f11590g;
                if (qVar.b(i9)) {
                    Object f4 = qVar.f(i9);
                    if (f4 == null) {
                        AbstractC0864b.E("node not present in pruned tree before this change");
                        throw null;
                    }
                    i(nVar3, (J0) f4);
                } else {
                    continue;
                }
            }
        }
    }

    public final void j(int i2, String str) {
        C1238d c1238d;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29 && (c1238d = this.f4067i) != null) {
            long j4 = i2;
            Object obj = c1238d.f10973a;
            AutofillId a4 = i4 >= 29 ? AbstractC1236b.a(C0.c(obj), AbstractC1239e.a(c1238d.f10974b), j4) : null;
            if (a4 == null) {
                AbstractC0864b.E("Invalid content capture ID");
                throw null;
            }
            if (i4 >= 29) {
                AbstractC1236b.e(C0.c(obj), a4, str);
            }
        }
    }

    public final void k(n nVar, J0 j02) {
        r rVar = new r();
        List h4 = n.h(nVar, true, 4);
        int size = h4.size();
        int i2 = 0;
        while (true) {
            Y2.e eVar = this.f4074p;
            C0671f c0671f = this.f4073o;
            E e4 = nVar.f11586c;
            if (i2 >= size) {
                r rVar2 = j02.f10064b;
                int[] iArr = rVar2.f6947b;
                long[] jArr = rVar2.f6946a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j4 = jArr[i4];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j4 & 255) < 128 && !rVar.c(iArr[(i4 << 3) + i6])) {
                                    if (c0671f.add(e4)) {
                                        eVar.o(Unit.f7487a);
                                        return;
                                    }
                                    return;
                                }
                                j4 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                List h5 = n.h(nVar, true, 4);
                int size2 = h5.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    n nVar2 = (n) h5.get(i7);
                    if (e().b(nVar2.f11590g)) {
                        Object f4 = this.f4078t.f(nVar2.f11590g);
                        if (f4 == null) {
                            AbstractC0864b.E("node not present in pruned tree before this change");
                            throw null;
                        }
                        k(nVar2, (J0) f4);
                    }
                }
                return;
            }
            n nVar3 = (n) h4.get(i2);
            if (e().b(nVar3.f11590g)) {
                r rVar3 = j02.f10064b;
                int i8 = nVar3.f11590g;
                if (!rVar3.c(i8)) {
                    if (c0671f.add(e4)) {
                        eVar.o(Unit.f7487a);
                        return;
                    }
                    return;
                }
                rVar.a(i8);
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0216, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0218, code lost:
    
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r10 == null) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(n nVar) {
        Function1 function1;
        int i2;
        int i4;
        a0 c4;
        String p4;
        Function1 function12;
        if (g()) {
            i iVar = nVar.f11587d;
            y0.t tVar = y0.q.f11634w;
            LinkedHashMap linkedHashMap = iVar.f11576d;
            Object obj = linkedHashMap.get(tVar);
            if (obj == null) {
                obj = null;
            }
            Boolean bool = (Boolean) obj;
            int i5 = 1;
            if (this.f4071m == 1 && Intrinsics.a(bool, Boolean.TRUE)) {
                Object obj2 = linkedHashMap.get(h.f11560k);
                if (obj2 == null) {
                    obj2 = null;
                }
                C1317a c1317a = (C1317a) obj2;
                if (c1317a != null && (function12 = (Function1) c1317a.f11536b) != null) {
                }
            } else if (this.f4071m == 2 && Intrinsics.a(bool, Boolean.FALSE)) {
                Object obj3 = linkedHashMap.get(h.f11560k);
                if (obj3 == null) {
                    obj3 = null;
                }
                C1317a c1317a2 = (C1317a) obj3;
                if (c1317a2 != null && (function1 = (Function1) c1317a2.f11536b) != null) {
                }
            }
            C1238d c1238d = this.f4067i;
            int i6 = nVar.f11590g;
            if (c1238d != null && (i4 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId a4 = AbstractC1239e.a(this.f4065d);
                n j4 = nVar.j();
                Object obj4 = c1238d.f10973a;
                if (j4 != null) {
                    a4 = i4 >= 29 ? AbstractC1236b.a(C0.c(obj4), AbstractC1239e.a(c1238d.f10974b), j4.f11590g) : null;
                }
                C1243i c1243i = i4 >= 29 ? new C1243i(AbstractC1236b.c(C0.c(obj4), a4, i6)) : 0;
                if (c1243i != 0) {
                    y0.t tVar2 = y0.q.f11607C;
                    i iVar2 = nVar.f11587d;
                    LinkedHashMap linkedHashMap2 = iVar2.f11576d;
                    if (!linkedHashMap2.containsKey(tVar2)) {
                        ViewStructure viewStructure = c1243i.f10975a;
                        Bundle a5 = AbstractC1242h.a(viewStructure);
                        if (a5 != null) {
                            a5.putLong("android.view.contentcapture.EventTimestamp", this.f4077s);
                        }
                        Object obj5 = linkedHashMap2.get(y0.q.f11631t);
                        if (obj5 == null) {
                            obj5 = null;
                        }
                        String str = (String) obj5;
                        if (str != null) {
                            viewStructure.setId(i6, null, null, str);
                        }
                        Object obj6 = linkedHashMap2.get(y0.q.f11632u);
                        if (obj6 == null) {
                            obj6 = null;
                        }
                        List list = (List) obj6;
                        ViewStructure viewStructure2 = c1243i.f10975a;
                        if (list != null) {
                            AbstractC1242h.b(viewStructure2, "android.widget.TextView");
                            AbstractC1242h.e(viewStructure2, j0.c.x(list, "\n"));
                        }
                        Object obj7 = linkedHashMap2.get(y0.q.f11635x);
                        if (obj7 == null) {
                            obj7 = null;
                        }
                        C0036g c0036g = (C0036g) obj7;
                        if (c0036g != null) {
                            AbstractC1242h.b(viewStructure2, "android.widget.EditText");
                            AbstractC1242h.e(viewStructure2, c0036g);
                        }
                        Object obj8 = linkedHashMap2.get(y0.q.f11612a);
                        if (obj8 == null) {
                            obj8 = null;
                        }
                        List list2 = (List) obj8;
                        if (list2 != null) {
                            AbstractC1242h.c(viewStructure, j0.c.x(list2, "\n"));
                        }
                        Object obj9 = linkedHashMap2.get(y0.q.f11630s);
                        if (obj9 == null) {
                            obj9 = null;
                        }
                        f fVar = (f) obj9;
                        if (fVar != null && (p4 = AbstractC1125K.p(fVar.f11545a)) != null) {
                            AbstractC1242h.b(viewStructure2, p4);
                        }
                        I g4 = AbstractC1125K.g(iVar2);
                        if (g4 != null) {
                            H h4 = g4.f289a;
                            float c5 = m.c(h4.f280b.f303a.f257b);
                            M0.b bVar = h4.f285g;
                            AbstractC1242h.f(viewStructure, bVar.q() * bVar.e() * c5, 0, 0, 0);
                        }
                        n j5 = nVar.j();
                        d dVar = d.f4373e;
                        if (j5 != null && (c4 = nVar.c()) != null) {
                            r4 = c4.O0().f3990s ? c4 : null;
                            if (r4 != null) {
                                dVar = AbstractC1065f.t(j5.f11584a, 8).n(r4, true);
                            }
                        }
                        AbstractC1242h.d(viewStructure, (int) dVar.f4374a, (int) dVar.f4375b, 0, 0, (int) dVar.c(), (int) dVar.b());
                        r4 = c1243i;
                    }
                }
            }
            if (r4 != null) {
                r rVar = this.f4069k;
                if (rVar.c(i6)) {
                    int hashCode = Integer.hashCode(i6) * (-862048943);
                    int i7 = hashCode ^ (hashCode << 16);
                    int i8 = i7 & 127;
                    int i9 = rVar.f6948c;
                    int i10 = (i7 >>> 7) & i9;
                    int i11 = 0;
                    loop0: while (true) {
                        long[] jArr = rVar.f6946a;
                        int i12 = i10 >> 3;
                        int i13 = (i10 & 7) << 3;
                        long j6 = (((-i13) >> 63) & (jArr[i12 + i5] << (64 - i13))) | (jArr[i12] >>> i13);
                        long j7 = (i8 * 72340172838076673L) ^ j6;
                        long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
                            if (j8 == 0) {
                                break;
                            }
                            i2 = ((Long.numberOfTrailingZeros(j8) >> 3) + i10) & i9;
                            if (rVar.f6947b[i2] == i6) {
                                break loop0;
                            } else {
                                j8 &= j8 - 1;
                            }
                        }
                        i11 += 8;
                        i10 = (i10 + i11) & i9;
                        i5 = 1;
                    }
                    if (i2 >= 0) {
                        rVar.f(i2);
                    }
                } else {
                    this.f4068j.i(i6, r4);
                }
            }
            List h5 = n.h(nVar, true, 4);
            int size = h5.size();
            for (int i14 = 0; i14 < size; i14++) {
                l((n) h5.get(i14));
            }
        }
    }

    public final void m(n nVar) {
        if (g()) {
            int i2 = nVar.f11590g;
            q qVar = this.f4068j;
            if (qVar.c(i2)) {
                qVar.h(i2);
            } else {
                this.f4069k.a(i2);
            }
            List h4 = n.h(nVar, true, 4);
            int size = h4.size();
            for (int i4 = 0; i4 < size; i4++) {
                m((n) h4.get(i4));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4075q.removeCallbacks(this.f4081w);
        this.f4067i = null;
    }
}
