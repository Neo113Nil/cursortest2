package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class kc implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ kc(hl hlVar, dg dgVar, za1 za1Var, xm0 xm0Var) {
        this.d = 2;
        this.e = hlVar;
        this.g = dgVar;
        this.h = za1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        s11 s11Var;
        Object value;
        Iterable iterable;
        int i2 = this.d;
        int i3 = 0;
        dn dnVar = null;
        int i4 = 1;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.e;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((lc) obj3).a();
                ha haVar = (ha) ((mc) obj2).g;
                int i5 = ((x11) obj).d;
                do {
                    i = haVar.get();
                } while (!haVar.compareAndSet(i, ((i >>> 27) & 15) == i5 ? i - 1 : i));
                return Unit.a;
            case 1:
                he heVar = (he) obj3;
                s11 z0 = he.z0(heVar, (qp0) obj2, (w3) obj);
                if (z0 == null) {
                    return null;
                }
                wm wmVar = heVar.s;
                if (ba0.a(wmVar.y, 0L)) {
                    r80.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return z0.e(wmVar.C0(z0, wmVar.y, 0L) ^ (-9223372034707292160L));
            case 2:
                hl hlVar = (hl) obj3;
                dg dgVar = (dg) obj2;
                za1 za1Var = (za1) obj;
                cl clVar = hlVar.M;
                dg dgVar2 = clVar.b;
                try {
                    clVar.b = dgVar;
                    za1 za1Var2 = hlVar.G;
                    int[] iArr = hlVar.o;
                    en0 en0Var = hlVar.v;
                    hlVar.o = null;
                    hlVar.v = null;
                    try {
                        hlVar.G = za1Var;
                        boolean z = clVar.e;
                        try {
                            clVar.e = false;
                            throw null;
                        } catch (Throwable th) {
                            clVar.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        hlVar.G = za1Var2;
                        hlVar.o = iArr;
                        hlVar.v = en0Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    clVar.b = dgVar2;
                    throw th3;
                }
            case 3:
                wm wmVar2 = (wm) obj3;
                sl1 sl1Var = (sl1) obj2;
                ke keVar = (ke) obj;
                ee eeVar = wmVar2.w;
                while (true) {
                    eo0 eo0Var = eeVar.a;
                    int i6 = eo0Var.g;
                    if (i6 != 0) {
                        if (i6 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        s11 s11Var2 = (s11) ((sm) eo0Var.d[i6 - 1]).a.invoke();
                        if (s11Var2 == null ? true : wm.A0(wmVar2, s11Var2, 0L, 0L, 3)) {
                            tf tfVar = ((sm) eeVar.a.k(r6.g - 1)).b;
                            Unit unit = Unit.a;
                            i31 i31Var = k31.d;
                            tfVar.l(unit);
                        }
                    }
                }
                if (wmVar2.x && (s11Var = (s11) wmVar2.v.invoke()) != null && wm.A0(wmVar2, s11Var, 0L, 0L, 3)) {
                    wmVar2.x = false;
                }
                sl1Var.e = wm.z0(wmVar2, keVar, 0L);
                return Unit.a;
            case 4:
                w8 w8Var = (w8) obj3;
                z8 z8Var = (z8) obj2;
                Function0 function0 = (Function0) obj;
                u8 u8Var = w8Var.a;
                qt0 qt0Var = w8Var.b;
                p8 p8Var = p8.a;
                if (Intrinsics.a(u8Var, p8Var) && Intrinsics.a(qt0Var, mt0.a)) {
                    z8Var.o();
                } else if (Intrinsics.a(u8Var, p8Var) && Intrinsics.a(qt0Var, nt0.a)) {
                    z8Var.q();
                } else if (Intrinsics.a(u8Var, p8Var) && Intrinsics.a(qt0Var, jt0.a)) {
                    z8Var.g();
                } else if (Intrinsics.a(u8Var, p8Var) && Intrinsics.a(qt0Var, kt0.a)) {
                    be1 be1Var = z8Var.e;
                    e40 e40Var = ((w8) be1Var.getValue()).i;
                    if (e40Var != null) {
                        z8Var.k(new ia(System.currentTimeMillis(), e40Var.a, e40Var.c, 0, ja.e), 0, true);
                        do {
                            value = be1Var.getValue();
                        } while (!be1Var.h(value, w8.a((w8) value, null, new ot0(false), null, 0, 0, null, null, null, null, false, 2045)));
                    }
                } else if (Intrinsics.a(u8Var, p8Var) && (qt0Var instanceof ot0)) {
                    z8Var.i();
                } else if (Intrinsics.a(qt0Var, pt0.a) || Intrinsics.a(qt0Var, lt0.a)) {
                    z8Var.f();
                } else {
                    boolean a = Intrinsics.a(u8Var, t8.a);
                    r8 r8Var = r8.a;
                    if (a) {
                        z8Var.n(r8Var);
                    } else if (Intrinsics.a(u8Var, r8Var)) {
                        function0.invoke();
                    } else {
                        z8Var.n(r8Var);
                    }
                }
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                wf0 wf0Var = (wf0) obj2;
                de0 de0Var = (de0) obj;
                kf0 kf0Var = (kf0) ((xr) obj3).getValue();
                IntRange intRange = (IntRange) ((ve0) wf0Var.e.e).getValue();
                u5 u5Var = new u5();
                u5 u5Var2 = kf0Var.a;
                int i7 = intRange.d;
                if (i7 < 0) {
                    r80.c("negative nearestRange.first");
                }
                int min = Math.min(intRange.e, u5Var2.a - 1);
                if (min < i7) {
                    ln0 ln0Var = qq0.a;
                    ln0Var.getClass();
                    u5Var.b = ln0Var;
                    u5Var.c = new Object[0];
                    u5Var.a = 0;
                } else {
                    int i8 = (min - i7) + 1;
                    u5Var.c = new Object[i8];
                    u5Var.a = i7;
                    ln0 ln0Var2 = new ln0(i8);
                    eo0 eo0Var2 = (eo0) u5Var2.b;
                    if (i7 < 0 || i7 >= u5Var2.a) {
                        StringBuilder n = qy0.n("Index ", i7, ", size ");
                        n.append(u5Var2.a);
                        r80.d(n.toString());
                    }
                    if (min < 0 || min >= u5Var2.a) {
                        StringBuilder n2 = qy0.n("Index ", min, ", size ");
                        n2.append(u5Var2.a);
                        r80.d(n2.toString());
                    }
                    if (min < i7) {
                        r80.a("toIndex (" + min + ") should be not smaller than fromIndex (" + i7 + ')');
                    }
                    int c = ka0.c(i7, eo0Var2);
                    int i9 = ((ja0) eo0Var2.d[c]).a;
                    while (i9 <= min) {
                        ja0 ja0Var = (ja0) eo0Var2.d[c];
                        yw ywVar = ja0Var.c;
                        int i10 = ja0Var.a;
                        int max = Math.max(i7, i10);
                        int min2 = Math.min(min, (i10 + ja0Var.b) - i4);
                        if (max <= min2) {
                            while (true) {
                                gq gqVar = new gq(max);
                                ln0Var2.g(max, gqVar);
                                ((Object[]) u5Var.c)[max - u5Var.a] = gqVar;
                                if (max != min2) {
                                    max++;
                                }
                            }
                        }
                        i9 += ja0Var.b;
                        c++;
                        i4 = 1;
                    }
                    u5Var.b = ln0Var2;
                }
                return new mf0(wf0Var, kf0Var, de0Var, u5Var);
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                d3 d3Var = (d3) obj3;
                db1 db1Var = (db1) obj2;
                at0 at0Var = (at0) obj;
                if (d3Var != null) {
                    db1Var.a(db1Var.c(d3Var) - db1Var.t);
                }
                List x = uq1.x(db1Var, null, db1Var.t, null);
                wk wkVar = (wk) CollectionsKt.t(x);
                Integer num = wkVar != null ? wkVar.b : null;
                List c2 = at0Var.c(num);
                if (num != null && !c2.isEmpty()) {
                    wk wkVar2 = (wk) CollectionsKt.p(c2);
                    int size = c2.size() - 1;
                    if (size <= 0) {
                        iterable = nv.d;
                    } else if (size == 1) {
                        iterable = yh.b(CollectionsKt.s(c2));
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        if (c2 instanceof RandomAccess) {
                            int size2 = c2.size();
                            while (i4 < size2) {
                                arrayList.add(c2.get(i4));
                                i4++;
                            }
                        } else {
                            ListIterator listIterator = c2.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        iterable = arrayList;
                    }
                    c2 = CollectionsKt.u(yh.b(new wk(wkVar2.a, null, num)), iterable);
                }
                return new vk(CollectionsKt.u(x, c2));
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                ((ao0) obj2).setValue(Boolean.TRUE);
                uq1.N((sn) obj3, null, new fd1((nd1) obj, dnVar, i3), 3);
                return Unit.a;
            default:
                ((yu0) obj3).i(System.currentTimeMillis());
                gb0.d((ao0) obj2, true);
                ((ao0) obj).setValue(jd1.d);
                return Unit.a;
        }
    }

    public /* synthetic */ kc(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
