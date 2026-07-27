package s0;

import A.AbstractC0017m;
import A.InterfaceC0019o;
import A0.C0030a;
import G.C0197f0;
import M2.C0249a;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import b0.InterfaceC0496d;
import c0.C0531b;
import com.appsflyer.attribution.RequestError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0960V;
import p0.InterfaceC0980p;
import q.AbstractC1024c;
import s.C1086B;
import s1.C1183B;
import s1.C1193i;
import s1.C1194j;
import w.EnumC1256E;
import y.InputConnectionC1308B;
import z2.C1400D;
import z2.C1403G;
import z2.C1433q;

/* renamed from: s0.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1160o0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1160o0(int i2, Object obj) {
        super(1);
        this.f10281d = i2;
        this.f10282e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025c  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, y2.j] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, y2.j] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i2;
        I.d dVar;
        Object[] objArr;
        switch (this.f10281d) {
            case 0:
                if (AbstractC1162p0.f10285b.compareAndSet(false, true)) {
                    ((Y2.e) this.f10282e).o(Unit.f7487a);
                }
                return Unit.f7487a;
            case 1:
                InterfaceC0496d interfaceC0496d = (InterfaceC0496d) obj;
                Z.r k4 = interfaceC0496d.Y().k();
                C0030a c0030a = ((C1164q0) this.f10282e).f10291j;
                if (c0030a != null) {
                    c0030a.h(k4, (C0531b) interfaceC0496d.Y().f988i);
                }
                return Unit.f7487a;
            case 2:
                G0.p pVar = (G0.p) obj;
                InputConnectionC1308B inputConnectionC1308B = pVar.f3077b;
                if (inputConnectionC1308B != null) {
                    pVar.a(inputConnectionC1308B);
                    pVar.f3077b = null;
                }
                C1167s0 c1167s0 = (C1167s0) this.f10282e;
                I.d dVar2 = c1167s0.f10388d;
                int i4 = dVar2.f3332i;
                if (i4 > 0) {
                    Object[] objArr2 = dVar2.f3330d;
                    i2 = 0;
                    while (!Intrinsics.a((WeakReference) objArr2[i2], pVar)) {
                        i2++;
                        if (i2 >= i4) {
                        }
                    }
                    dVar = c1167s0.f10388d;
                    if (i2 >= 0) {
                        dVar.n(i2);
                    }
                    if (dVar.k()) {
                        c1167s0.f10386b.invoke();
                    }
                    return Unit.f7487a;
                }
                i2 = -1;
                dVar = c1167s0.f10388d;
                if (i2 >= 0) {
                }
                if (dVar.k()) {
                }
                return Unit.f7487a;
            case 3:
                ((C0030a) this.f10282e).h((Z.r) obj, null);
                return Unit.f7487a;
            case 4:
                String key = (String) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                s1.t tVar = (s1.t) this.f10282e;
                ArrayList arrayList = tVar.f10553b;
                Collection values = ((Map) tVar.f10557f.getValue()).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    C1400D.j(((s1.q) it.next()).f10545b, arrayList2);
                }
                return Boolean.valueOf(!C1403G.B(C1403G.B(arrayList, arrayList2), (List) tVar.f10560i.getValue()).contains(key));
            case 5:
                C1193i backStackEntry = (C1193i) obj;
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                s1.v vVar = backStackEntry.f10510e;
                if (vVar == null) {
                    vVar = null;
                }
                if (vVar == null) {
                    return null;
                }
                backStackEntry.g();
                s1.H h4 = (s1.H) this.f10282e;
                s1.v destination = h4.c(vVar);
                if (destination == null) {
                    backStackEntry = null;
                } else if (!destination.equals(vVar)) {
                    s1.l b4 = h4.b();
                    Bundle h5 = destination.h(backStackEntry.g());
                    Intrinsics.checkNotNullParameter(destination, "destination");
                    C1183B c1183b = b4.f10534h;
                    backStackEntry = H1.f.k(c1183b.f10436a, destination, h5, c1183b.h(), c1183b.f10451p);
                }
                return backStackEntry;
            case 6:
                Bundle bundle = (Bundle) obj;
                C1183B c4 = m3.u.c((Context) this.f10282e);
                if (bundle != null) {
                    bundle.setClassLoader(c4.f10436a.getClassLoader());
                    c4.f10439d = bundle.getBundle("android-support-nav:controller:navigatorState");
                    c4.f10440e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = c4.f10449n;
                    linkedHashMap.clear();
                    int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length) {
                            c4.f10448m.put(Integer.valueOf(intArray[i5]), stringArrayList.get(i6));
                            i5++;
                            i6++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (String id : stringArrayList2) {
                            Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + id);
                            if (parcelableArray != null) {
                                Intrinsics.checkNotNullExpressionValue(id, "id");
                                int length2 = parcelableArray.length;
                                C1433q c1433q = new C1433q();
                                if (length2 == 0) {
                                    objArr = C1433q.f11955k;
                                } else {
                                    if (length2 <= 0) {
                                        throw new IllegalArgumentException(AbstractC0017m.g(length2, "Illegal Capacity: "));
                                    }
                                    objArr = new Object[length2];
                                }
                                c1433q.f11957e = objArr;
                                C0249a f4 = M2.J.f(parcelableArray);
                                while (f4.hasNext()) {
                                    Parcelable parcelable = (Parcelable) f4.next();
                                    Intrinsics.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                    c1433q.addLast((C1194j) parcelable);
                                }
                                linkedHashMap.put(id, c1433q);
                            }
                        }
                    }
                    c4.f10441f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                return c4;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((y0.i) obj).s(A.G.f23c, new A.F(EnumC1256E.f11019d, ((InterfaceC0019o) this.f10282e).a(), 2, true));
                return Unit.f7487a;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                float[] fArr = ((Z.E) obj).f4456a;
                InterfaceC0980p interfaceC0980p = (InterfaceC0980p) this.f10282e;
                if (interfaceC0980p.p()) {
                    AbstractC0960V.g(interfaceC0980p).i(interfaceC0980p, fArr);
                }
                return Unit.f7487a;
            case AbstractC1024c.f9242c /* 9 */:
                float floatValue = ((Number) obj).floatValue();
                w.m0 m0Var = (w.m0) this.f10282e;
                float d4 = m0Var.f11252a.d() + floatValue;
                C0197f0 c0197f0 = m0Var.f11253b;
                float d5 = c0197f0.d();
                C0197f0 c0197f02 = m0Var.f11252a;
                if (d4 > d5) {
                    floatValue = c0197f0.d() - c0197f02.d();
                } else if (d4 < 0.0f) {
                    floatValue = -c0197f02.d();
                }
                c0197f02.f(c0197f02.d() + floatValue);
                return Float.valueOf(floatValue);
            case 10:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f10282e).cancel();
                }
                return Unit.f7487a;
            case RequestError.STOP_TRACKING /* 11 */:
                ((InputConnectionC1308B) this.f10282e).a((G0.i) obj);
                return Unit.f7487a;
            case 12:
                y0.s.d((y0.i) obj, ((y0.f) this.f10282e).f11545a);
                return Unit.f7487a;
            default:
                ((List) obj).add((Float) ((C1086B) this.f10282e).invoke());
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160o0(s1.H h4, s1.E e4) {
        super(1);
        this.f10281d = 5;
        this.f10282e = h4;
    }
}
