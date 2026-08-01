package a1;

import android.os.Bundle;
import b0.z0;
import b1.a0;
import b1.b0;
import c2.c2;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.se;
import com.manholeroboramprush.cardestroy.BreadCrumb;
import ge.c1;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import je.l0;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n0.e2;
import n0.g1;
import n0.n1;
import n0.v1;
import n0.z1;
import n4.h0;
import s.c0;
import s.i0;
import s.q0;
import te.a1;
import te.p1;
import te.q1;
import wd.f0;
import x3.z;
import z4.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16e;

    public /* synthetic */ d(u8.g gVar, String str) {
        this.f15d = 18;
        this.f16e = str;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, re.e] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char c10 = 1;
        switch (this.f15d) {
            case 0:
                m mVar = ((j) this.f16e).f35c;
                return Boolean.valueOf(mVar != null ? mVar.c(obj) : true);
            case 1:
                z0 z0Var = (z0) this.f16e;
                c2 c2Var = (c2) obj;
                c2Var.getClass();
                z0Var.C = ((z0) c2Var).D;
                return Boolean.FALSE;
            case 2:
                b0 b0Var = (b0) this.f16e;
                synchronized (b0Var.g) {
                    a0 a0Var = b0Var.f952i;
                    a0Var.getClass();
                    Object obj2 = a0Var.f933b;
                    obj2.getClass();
                    int i3 = a0Var.f935d;
                    c0 c0Var = a0Var.f934c;
                    if (c0Var == null) {
                        c0Var = new c0();
                        a0Var.f934c = c0Var;
                        a0Var.f937f.m(obj2, c0Var);
                    }
                    a0Var.b(obj, i3, obj2, c0Var);
                }
                return Unit.f5554a;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                BreadCrumb breadCrumb = (BreadCrumb) this.f16e;
                ye.a aVar = (ye.a) obj;
                int i10 = BreadCrumb.f3194d;
                aVar.getClass();
                boolean z10 = aVar.f10685b;
                se seVar = aVar.f10684a;
                u8.d dVar = (u8.d) seVar.f2798d;
                df.a aVar2 = df.a.f3729e;
                dVar.getClass();
                df.a aVar3 = df.a.f3732s;
                if (aVar3.compareTo(aVar2) <= 0) {
                    aVar3.compareTo(aVar2);
                }
                o4.p pVar = new o4.p(breadCrumb, c10 == true ? 1 : 0);
                ef.a aVar4 = new ef.a();
                pVar.invoke(aVar4);
                seVar.q(x.c(aVar4), true);
                ef.a aVar5 = g9.b.f4321a;
                aVar5.getClass();
                List c11 = x.c(aVar5);
                c11.getClass();
                if (aVar3.compareTo(aVar2) <= 0) {
                    ee.o.f3988a.getClass();
                    ee.m.f3986a.getClass();
                    long nanoTime = System.nanoTime() - ee.m.f3987b;
                    seVar.q(c11, z10);
                    long a9 = ee.n.a(nanoTime);
                    ((ConcurrentHashMap) ((n) seVar.f2801r).f40e).size();
                    ee.a aVar6 = ee.b.f3956e;
                    ee.b.f(a9, ee.d.MICROSECONDS);
                } else {
                    seVar.q(c11, z10);
                }
                return Unit.f5554a;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                ((g1) this.f16e).i(((Integer) obj).intValue());
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return obj == ((kotlin.collections.a) this.f16e) ? "(this Collection)" : String.valueOf(obj);
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                kotlin.collections.j jVar = (kotlin.collections.j) this.f16e;
                Map.Entry entry = (Map.Entry) obj;
                kotlin.collections.g gVar = kotlin.collections.j.f5571i;
                entry.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                sb2.append(key == jVar ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != jVar ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((kotlin.collections.i) this.f16e).c(((Integer) obj).intValue());
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                ((n0.q) this.f16e).x(obj);
                return Unit.f5554a;
            case 9:
                z1 z1Var = (z1) this.f16e;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (z1Var.f6877c) {
                    try {
                        c1 c1Var = z1Var.f6878d;
                        if (c1Var != null) {
                            l0 l0Var = z1Var.f6893u;
                            v1 v1Var = v1.f6825e;
                            l0Var.getClass();
                            l0Var.k(null, v1Var);
                            c1Var.a(cancellationException);
                            z1Var.f6890r = null;
                            c1Var.o(new b0.l0(11, z1Var, th));
                        } else {
                            z1Var.f6879e = cancellationException;
                            l0 l0Var2 = z1Var.f6893u;
                            v1 v1Var2 = v1.f6824d;
                            l0Var2.getClass();
                            l0Var2.k(null, v1Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Unit.f5554a;
            case 10:
                e2 e2Var = (e2) this.f16e;
                ie.o oVar = e2Var.f6674t;
                oVar.getClass();
                if (!Intrinsics.a(e2Var.f6674t, oVar)) {
                    n1.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                i0 i0Var = e2Var.f6673s;
                Object obj3 = e2Var.f6671i;
                if (i0Var != null) {
                    if (obj3 != null) {
                        n1.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    i0Var.a(obj);
                } else if (obj3 == null) {
                    e2Var.f6671i = obj;
                } else {
                    int i11 = q0.f8360a;
                    i0 i0Var2 = new i0();
                    i0Var2.a(obj3);
                    i0Var2.a(obj);
                    e2Var.f6673s = i0Var2;
                    e2Var.f6671i = null;
                }
                return Unit.f5554a;
            case RequestError.STOP_TRACKING /* 11 */:
                wd.b0 b0Var2 = (wd.b0) this.f16e;
                String str = (String) obj;
                str.getClass();
                Object obj4 = b0Var2.f10141d;
                return Boolean.valueOf(obj4 == null || !((Bundle) obj4).containsKey(str));
            case 12:
                h0 h0Var = (h0) this.f16e;
                n4.h hVar = (n4.h) obj;
                hVar.getClass();
                n4.s sVar = hVar.f7063e;
                q4.c cVar = hVar.f7069v;
                if (sVar == null) {
                    sVar = null;
                }
                if (sVar == null) {
                    return null;
                }
                cVar.a();
                n4.s c12 = h0Var.c(sVar);
                if (c12 == null) {
                    return null;
                }
                return c12.equals(sVar) ? hVar : h0Var.b().b(c12, c12.b(cVar.a()));
            case 13:
                ((oe.c) this.f16e).d(null);
                return Unit.f5554a;
            case 14:
                p2.a0 a0Var2 = (p2.a0) obj;
                return ((p2.j) this.f16e).a(new p2.a0(null, a0Var2.f7604b, a0Var2.f7605c, a0Var2.f7606d, a0Var2.f7607e)).getValue();
            case 15:
                pe.d dVar2 = (pe.d) this.f16e;
                re.a aVar7 = (re.a) obj;
                aVar7.getClass();
                f0.f10152a.getClass();
                re.a.a(aVar7, com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, p1.f9420b);
                String str2 = "kotlinx.serialization.Polymorphic<" + ((wd.h) dVar2.f7706a).c() + '>';
                re.c cVar2 = re.c.f8238h;
                re.e[] eVarArr = new re.e[0];
                if (StringsKt.r(str2)) {
                    a1.e("Blank serial names are prohibited");
                    return null;
                }
                if (cVar2.equals(re.h.g)) {
                    a1.e("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                    return null;
                }
                re.a aVar8 = new re.a(str2);
                re.a.a(aVar7, "value", new re.f(str2, cVar2, aVar8.f8230b.size(), w.v(eVarArr), aVar8));
                dVar2.f7707b.getClass();
                return Unit.f5554a;
            case 16:
                ?? r02 = this.f16e;
                int intValue = ((Integer) obj).intValue();
                return r02.d(intValue) + ": " + r02.h(intValue).a();
            case 17:
                q1 q1Var = (q1) this.f16e;
                re.a aVar9 = (re.a) obj;
                aVar9.getClass();
                re.a.a(aVar9, "first", q1Var.f9424a.d());
                re.a.a(aVar9, "second", q1Var.f9425b.d());
                re.a.a(aVar9, "third", q1Var.f9426c.d());
                return Unit.f5554a;
            case 18:
                String str3 = (String) this.f16e;
                b4.a aVar10 = (b4.a) obj;
                aVar10.c(u8.g.f9698d, str3);
                u8.g.d(aVar10, str3);
                return null;
            case 19:
                v.e eVar = (v.e) obj;
                ((n9.l) this.f16e).invoke(eVar.f9782d.getValue(), ((Function1) v.c.f9754k.f1869e).invoke(eVar.f9783e));
                return Unit.f5554a;
            case 20:
                return new b3.a(3, (v.z0) this.f16e);
            case 21:
                z zVar = (z) this.f16e;
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    zVar.f10502v.b(new x3.l0(th3));
                }
                if (zVar.f10504x.f4518e != hd.c0.f4498a) {
                    ((x3.h0) zVar.f10504x.getValue()).close();
                }
                return Unit.f5554a;
            case 22:
                z4.q qVar = (z4.q) this.f16e;
                k5.d dVar3 = (k5.d) obj;
                dVar3.getClass();
                qVar.f10813h = dVar3;
                return Unit.f5554a;
            case 23:
                u uVar = (u) this.f16e;
                z4.a aVar11 = (z4.a) obj;
                aVar11.getClass();
                return uVar.g(aVar11);
            default:
                z4.a0 a0Var3 = (z4.a0) this.f16e;
                ((i5.a) obj).getClass();
                return a0Var3.invoke();
        }
    }

    public /* synthetic */ d(int i3, Object obj, Object obj2) {
        this.f15d = i3;
        this.f16e = obj;
    }

    public /* synthetic */ d(int i3, Object obj) {
        this.f15d = i3;
        this.f16e = obj;
    }
}
