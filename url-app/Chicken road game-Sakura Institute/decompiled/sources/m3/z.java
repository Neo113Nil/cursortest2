package m3;

import A1.M;
import B1.C0097d;
import D.x1;
import G.C0192d;
import G.C0197f0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import G.W;
import G.X0;
import M2.F;
import Q.C0267c;
import Q.G;
import a.AbstractC0345a;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.InterfaceC0481v;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import b1.C0508h;
import i.H;
import j.AbstractC0705a;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.U;
import l.m0;
import l.p0;
import l.r0;
import l.s0;
import l0.C0800A;
import l0.C0802C;
import l0.C0811i;
import l0.EnumC0812j;
import n.AbstractC0864b;
import o.L;
import o1.AbstractC0921b;
import q.n0;
import s.C1114r;
import s1.C1183B;
import s1.C1186b;
import s1.C1193i;
import s1.C1194j;
import s1.E;
import s1.I;
import w2.C1294c;
import y0.C1318b;
import y2.AbstractC1343r;
import z.C1347b;
import z2.C1403G;
import z2.C1405I;
import z2.C1412P;
import z2.C1413Q;
import z2.C1433q;
import z2.C1441y;
import z2.C1442z;
import z3.C1445c;
import z3.C1446d;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static long f8493a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f8494b;

    public static final void a(C1183B c1183b, S.o oVar, S.c cVar, String str, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, C0216p c0216p, int i2, int i4) {
        int i5;
        int i6;
        int i7;
        S.c cVar2;
        String str2;
        Function1 function17;
        Function1 function18;
        Function1 function19;
        Function1 function110;
        Function1 function111;
        S.c cVar3;
        Function1 function112;
        Function1 function113;
        Function1 function114;
        Function1 function115;
        Function1 function116;
        String str3;
        c0216p.U(1840250294);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.h(c1183b) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c0216p.f("events") ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= c0216p.f(oVar) ? 256 : 128;
        }
        int i8 = 1797120 | i5;
        if ((12582912 & i2) == 0) {
            i8 = 5991424 | i5;
        }
        if ((100663296 & i2) == 0) {
            i8 |= 33554432;
        }
        int i9 = 805306368 | i8;
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0216p.h(function16) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((306783379 & i9) == 306783378 && (i6 & 3) == 2 && c0216p.z()) {
            c0216p.N();
            cVar3 = cVar;
            str3 = str;
            function112 = function1;
            function113 = function12;
            function114 = function13;
            function115 = function14;
            function116 = function15;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                i7 = i9 & (-264241153);
                cVar2 = S.b.f3952d;
                str2 = null;
                function17 = null;
                function18 = t1.x.f10719i;
                function19 = function18;
                function110 = t1.x.f10720j;
                function111 = function110;
            } else {
                c0216p.N();
                i7 = i9 & (-264241153);
                cVar2 = cVar;
                str2 = str;
                function18 = function1;
                function110 = function12;
                function19 = function13;
                function111 = function14;
                function17 = function15;
            }
            c0216p.r();
            boolean z4 = ((i7 & 112) == 32) | ((i7 & 57344) == 16384) | ((i6 & 14) == 4);
            Object I3 = c0216p.I();
            if (z4 || I3 == C0208l.f2826a) {
                s1.z zVar = new s1.z(c1183b.f10457v, str2);
                function16.invoke(zVar);
                I3 = zVar.c();
                c0216p.c0(I3);
            }
            s1.y yVar = (s1.y) I3;
            int i10 = i7 & 8078;
            int i11 = i7 >> 3;
            b(c1183b, yVar, oVar, cVar2, function18, function110, function19, function111, function17, c0216p, (57344 & i11) | i10 | (458752 & i11) | (i11 & 234881024));
            cVar3 = cVar2;
            function112 = function18;
            function113 = function110;
            function114 = function19;
            function115 = function111;
            function116 = function17;
            str3 = str2;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new t1.r(c1183b, oVar, cVar3, str3, function112, function113, function114, function115, function116, function16, i2, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:0x07fc, code lost:
    
        if (r44.f(r41) != false) goto L376;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x045a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0349  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C1183B c1183b, s1.y graph, S.o oVar, S.c cVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, C0216p c0216p, int i2) {
        InterfaceC0481v interfaceC0481v;
        int i4;
        t1.p pVar;
        ?? r10;
        boolean z4;
        boolean z5;
        Object I3;
        Map map;
        C1193i c1193i;
        boolean z6;
        P.i iVar;
        int i5;
        Function1 function16;
        boolean f4;
        Object I4;
        Function1 function17;
        Object I5;
        boolean f5;
        Object I6;
        Object I7;
        U u4;
        boolean f6;
        Object I8;
        m0 m0Var;
        int i6;
        int i7;
        boolean f7;
        Object I9;
        boolean z7;
        Map map2;
        boolean h4;
        Object I10;
        m0 m0Var2;
        X0 x02;
        boolean f8;
        Object I11;
        Activity activity;
        Intent intent;
        int[] intArray;
        Bundle bundle;
        int[] iArr;
        s1.u D3;
        int[] iArr2;
        ArrayList arrayList;
        int length;
        int i8;
        String str;
        s1.v C3;
        s1.y yVar;
        Bundle bundle2;
        s1.v C4;
        s1.y yVar2;
        ArrayList<String> stringArrayList;
        c0216p.U(-1964664536);
        int i9 = (i2 & 6) == 0 ? (c0216p.h(c1183b) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i9 |= c0216p.h(graph) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i9 |= c0216p.f(oVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i9 |= c0216p.f(cVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i9 |= c0216p.h(function1) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i9 |= c0216p.h(function12) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i9 |= c0216p.h(function13) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i9 |= c0216p.h(function14) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i9 |= c0216p.h(function15) ? 67108864 : 33554432;
        }
        int i10 = i9;
        if ((38347923 & i10) == 38347922 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.P();
            if ((i2 & 1) != 0 && !c0216p.y()) {
                c0216p.N();
            }
            c0216p.r();
            InterfaceC0481v interfaceC0481v2 = (InterfaceC0481v) c0216p.k(AbstractC0921b.f8914a);
            Z a4 = q1.b.a(c0216p);
            if (a4 == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            Y viewModelStore = a4.d();
            c1183b.getClass();
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            s1.p pVar2 = c1183b.f10451p;
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            s1.o oVar2 = s1.p.f10542c;
            C1294c c1294c = new C1294c(viewModelStore, oVar2, 0);
            Intrinsics.checkNotNullParameter(s1.p.class, "modelClass");
            Intrinsics.checkNotNullParameter(s1.p.class, "<this>");
            boolean a5 = Intrinsics.a(pVar2, (s1.p) c1294c.e(F.a(s1.p.class)));
            C1433q c1433q = c1183b.f10442g;
            if (!a5) {
                if (!c1433q.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
                C1294c c1294c2 = new C1294c(viewModelStore, oVar2, 0);
                Intrinsics.checkNotNullParameter(s1.p.class, "modelClass");
                Intrinsics.checkNotNullParameter(s1.p.class, "<this>");
                c1183b.f10451p = (s1.p) c1294c2.e(F.a(s1.p.class));
            }
            Intrinsics.checkNotNullParameter(graph, "graph");
            Intrinsics.checkNotNullParameter(graph, "graph");
            Bundle bundle3 = null;
            if (Intrinsics.a(c1183b.f10438c, graph)) {
                interfaceC0481v = interfaceC0481v2;
                i4 = i10;
                int e4 = graph.f10586o.e();
                for (int i11 = 0; i11 < e4; i11++) {
                    s1.v vVar = (s1.v) graph.f10586o.f(i11);
                    s1.y yVar3 = c1183b.f10438c;
                    Intrinsics.c(yVar3);
                    int c4 = yVar3.f10586o.c(i11);
                    s1.y yVar4 = c1183b.f10438c;
                    Intrinsics.c(yVar4);
                    H h5 = yVar4.f10586o;
                    if (h5.f6896d) {
                        i.n.a(h5);
                    }
                    int a6 = AbstractC0705a.a(h5.f6897e, h5.f6899j, c4);
                    if (a6 >= 0) {
                        Object[] objArr = h5.f6898i;
                        Object obj = objArr[a6];
                        objArr[a6] = vVar;
                    }
                }
                Iterator it = c1433q.iterator();
                while (it.hasNext()) {
                    C1193i c1193i2 = (C1193i) it.next();
                    int i12 = s1.v.f10569n;
                    List k4 = T2.r.k(AbstractC0864b.t(c1193i2.f10510e));
                    Intrinsics.checkNotNullParameter(k4, "<this>");
                    C1413Q c1413q = new C1413Q(k4);
                    s1.v vVar2 = c1183b.f10438c;
                    Intrinsics.c(vVar2);
                    Iterator it2 = c1413q.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((G) it2).f3812e;
                        if (listIterator.hasPrevious()) {
                            s1.v vVar3 = (s1.v) listIterator.previous();
                            if ((!Intrinsics.a(vVar3, c1183b.f10438c) || !Intrinsics.a(vVar2, graph)) && (vVar2 instanceof s1.y)) {
                                s1.y yVar5 = (s1.y) vVar2;
                                vVar2 = yVar5.C(vVar3.f10575l, yVar5, false);
                                Intrinsics.c(vVar2);
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(vVar2, "<set-?>");
                    c1193i2.f10510e = vVar2;
                }
            } else {
                s1.y yVar6 = c1183b.f10438c;
                LinkedHashMap linkedHashMap = c1183b.f10458w;
                boolean z8 = true;
                if (yVar6 != null) {
                    Iterator it3 = new ArrayList(c1183b.f10448m.keySet()).iterator();
                    while (it3.hasNext()) {
                        Integer id = (Integer) it3.next();
                        Intrinsics.checkNotNullExpressionValue(id, "id");
                        int intValue = id.intValue();
                        Iterator it4 = linkedHashMap.values().iterator();
                        while (it4.hasNext()) {
                            ((s1.l) it4.next()).f10530d = z8;
                        }
                        boolean r2 = c1183b.r(intValue, bundle3, o.q(C1186b.f10491j));
                        Iterator it5 = linkedHashMap.values().iterator();
                        while (it5.hasNext()) {
                            ((s1.l) it5.next()).f10530d = false;
                        }
                        if (r2) {
                            c1183b.n(intValue, true, false);
                        }
                        z8 = true;
                        bundle3 = null;
                    }
                    c1183b.n(yVar6.f10575l, true, false);
                }
                c1183b.f10438c = graph;
                Bundle bundle4 = c1183b.f10439d;
                I i13 = c1183b.f10457v;
                if (bundle4 != null && (stringArrayList = bundle4.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                    Iterator<String> it6 = stringArrayList.iterator();
                    while (it6.hasNext()) {
                        String name = it6.next();
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        i13.b(name);
                        Bundle savedState = bundle4.getBundle(name);
                        if (savedState != null) {
                            Intrinsics.checkNotNullParameter(savedState, "savedState");
                        }
                    }
                }
                Parcelable[] parcelableArr = c1183b.f10440e;
                Context context = c1183b.f10436a;
                if (parcelableArr != null) {
                    int length2 = parcelableArr.length;
                    int i14 = 0;
                    while (i14 < length2) {
                        Parcelable parcelable = parcelableArr[i14];
                        Parcelable[] parcelableArr2 = parcelableArr;
                        Intrinsics.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        C1194j c1194j = (C1194j) parcelable;
                        int i15 = c1194j.f10522e;
                        int i16 = length2;
                        s1.v d4 = c1183b.d(i15);
                        if (d4 == null) {
                            int i17 = s1.v.f10569n;
                            String s4 = AbstractC0864b.s(context, i15);
                            StringBuilder sb = new StringBuilder("Restoring the Navigation back stack failed: destination ");
                            sb.append(s4);
                            sb.append(" cannot be found from the current destination ");
                            C1193i c1193i3 = (C1193i) c1433q.C();
                            sb.append(c1193i3 != null ? c1193i3.f10510e : null);
                            throw new IllegalStateException(sb.toString());
                        }
                        C1193i a7 = c1194j.a(context, d4, c1183b.h(), c1183b.f10451p);
                        s1.H b4 = i13.b(d4.f10570d);
                        Object obj2 = linkedHashMap.get(b4);
                        if (obj2 == null) {
                            obj2 = new s1.l(c1183b, b4);
                            linkedHashMap.put(b4, obj2);
                        }
                        c1433q.addLast(a7);
                        ((s1.l) obj2).a(a7);
                        s1.y yVar7 = a7.f10510e.f10571e;
                        if (yVar7 != null) {
                            c1183b.j(a7, c1183b.f(yVar7.f10575l));
                        }
                        i14++;
                        parcelableArr = parcelableArr2;
                        length2 = i16;
                    }
                    c1183b.u();
                    c1183b.f10440e = null;
                }
                Collection values = C1412P.i(i13.f10487a).values();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : values) {
                    if (!((s1.H) obj3).f10485b) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    s1.H h6 = (s1.H) it7.next();
                    Object obj4 = linkedHashMap.get(h6);
                    if (obj4 == null) {
                        obj4 = new s1.l(c1183b, h6);
                        linkedHashMap.put(h6, obj4);
                    }
                    s1.l state = (s1.l) obj4;
                    h6.getClass();
                    Intrinsics.checkNotNullParameter(state, "state");
                    h6.f10484a = state;
                    h6.f10485b = true;
                }
                if (c1183b.f10438c == null || !c1433q.isEmpty()) {
                    interfaceC0481v = interfaceC0481v2;
                    i4 = i10;
                    c1183b.b();
                } else {
                    if (c1183b.f10441f || (activity = c1183b.f10437b) == null || (intent = activity.getIntent()) == null) {
                        interfaceC0481v = interfaceC0481v2;
                        i4 = i10;
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            try {
                                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                            } catch (Exception e5) {
                                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e5);
                            }
                            ArrayList parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundle5 = new Bundle();
                            ArrayList arrayList3 = parcelableArrayList;
                            bundle = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle != null) {
                                bundle5.putAll(bundle);
                            }
                            if (intArray != null || intArray.length == 0) {
                                s1.y i18 = c1183b.i(c1433q);
                                iArr = intArray;
                                Intrinsics.checkNotNullParameter(intent, "intent");
                                i4 = i10;
                                interfaceC0481v = interfaceC0481v2;
                                D3 = i18.D(new C0097d(intent.getData(), intent.getAction(), intent.getType(), 23), true, true, i18);
                                if (D3 != null) {
                                    s1.v vVar4 = D3.f10564d;
                                    vVar4.getClass();
                                    C1433q c1433q2 = new C1433q();
                                    s1.v vVar5 = vVar4;
                                    while (true) {
                                        s1.y yVar8 = vVar5.f10571e;
                                        if (yVar8 == null || yVar8.f10587p != vVar5.f10575l) {
                                            c1433q2.addFirst(vVar5);
                                        }
                                        if (!Intrinsics.a(yVar8, null) && yVar8 != null) {
                                            vVar5 = yVar8;
                                        }
                                    }
                                    List H3 = C1403G.H(c1433q2);
                                    ArrayList arrayList4 = new ArrayList(C1442z.h(H3, 10));
                                    Iterator it8 = H3.iterator();
                                    while (it8.hasNext()) {
                                        arrayList4.add(Integer.valueOf(((s1.v) it8.next()).f10575l));
                                    }
                                    int[] G3 = C1403G.G(arrayList4);
                                    Bundle h7 = vVar4.h(D3.f10565e);
                                    if (h7 != null) {
                                        bundle5.putAll(h7);
                                    }
                                    iArr2 = G3;
                                    arrayList = null;
                                    if (iArr2 != null && iArr2.length != 0) {
                                        s1.y yVar9 = c1183b.f10438c;
                                        length = iArr2.length;
                                        i8 = 0;
                                        while (true) {
                                            if (i8 < length) {
                                                str = null;
                                                break;
                                            }
                                            int i19 = iArr2[i8];
                                            if (i8 == 0) {
                                                s1.y yVar10 = c1183b.f10438c;
                                                Intrinsics.c(yVar10);
                                                C4 = yVar10.f10575l == i19 ? c1183b.f10438c : null;
                                            } else {
                                                Intrinsics.c(yVar9);
                                                C4 = yVar9.C(i19, yVar9, false);
                                            }
                                            if (C4 == null) {
                                                int i20 = s1.v.f10569n;
                                                str = AbstractC0864b.s(context, i19);
                                                break;
                                            }
                                            if (i8 != iArr2.length - 1 && (C4 instanceof s1.y)) {
                                                while (true) {
                                                    yVar2 = (s1.y) C4;
                                                    Intrinsics.c(yVar2);
                                                    if (!(yVar2.C(yVar2.f10587p, yVar2, false) instanceof s1.y)) {
                                                        break;
                                                    } else {
                                                        C4 = yVar2.C(yVar2.f10587p, yVar2, false);
                                                    }
                                                }
                                                yVar9 = yVar2;
                                            }
                                            i8++;
                                        }
                                        if (str == null) {
                                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                        } else {
                                            bundle5.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                            int length3 = iArr2.length;
                                            Bundle[] bundleArr = new Bundle[length3];
                                            for (int i21 = 0; i21 < length3; i21++) {
                                                Bundle bundle6 = new Bundle();
                                                bundle6.putAll(bundle5);
                                                if (arrayList != null && (bundle2 = (Bundle) arrayList.get(i21)) != null) {
                                                    bundle6.putAll(bundle2);
                                                }
                                                bundleArr[i21] = bundle6;
                                            }
                                            int flags = intent.getFlags();
                                            int i22 = 268435456 & flags;
                                            if (i22 != 0 && (flags & 32768) == 0) {
                                                intent.addFlags(32768);
                                                S0.p pVar3 = new S0.p(context);
                                                ComponentName component = intent.getComponent();
                                                Context context2 = pVar3.f4025e;
                                                if (component == null) {
                                                    component = intent.resolveActivity(context2.getPackageManager());
                                                }
                                                ArrayList arrayList5 = pVar3.f4024d;
                                                if (component != null) {
                                                    int size = arrayList5.size();
                                                    try {
                                                        for (Intent E3 = u3.d.E(context2, component); E3 != null; E3 = u3.d.E(context2, E3.getComponent())) {
                                                            arrayList5.add(size, E3);
                                                        }
                                                    } catch (PackageManager.NameNotFoundException e6) {
                                                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                        throw new IllegalArgumentException(e6);
                                                    }
                                                }
                                                arrayList5.add(intent);
                                                Intrinsics.checkNotNullExpressionValue(pVar3, "create(context).addNextI…ntWithParentStack(intent)");
                                                if (arrayList5.isEmpty()) {
                                                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                                                }
                                                Intent[] intentArr = (Intent[]) arrayList5.toArray(new Intent[0]);
                                                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                                context2.startActivities(intentArr, null);
                                                activity.finish();
                                                activity.overridePendingTransition(0, 0);
                                            } else if (i22 != 0) {
                                                if (!c1433q.isEmpty()) {
                                                    s1.y yVar11 = c1183b.f10438c;
                                                    Intrinsics.c(yVar11);
                                                    c1183b.n(yVar11.f10575l, true, false);
                                                }
                                                int i23 = 0;
                                                while (i23 < iArr2.length) {
                                                    int i24 = iArr2[i23];
                                                    int i25 = i23 + 1;
                                                    Bundle bundle7 = bundleArr[i23];
                                                    s1.v d5 = c1183b.d(i24);
                                                    if (d5 == null) {
                                                        int i26 = s1.v.f10569n;
                                                        String s5 = AbstractC0864b.s(context, i24);
                                                        StringBuilder sb2 = new StringBuilder("Deep Linking failed: destination ");
                                                        sb2.append(s5);
                                                        sb2.append(" cannot be found from the current destination ");
                                                        C1193i c1193i4 = (C1193i) c1433q.C();
                                                        sb2.append(c1193i4 != null ? c1193i4.f10510e : null);
                                                        throw new IllegalStateException(sb2.toString());
                                                    }
                                                    c1183b.k(d5, bundle7, o.q(new n0(d5, 9, c1183b)));
                                                    i23 = i25;
                                                }
                                                c1183b.f10441f = true;
                                            } else {
                                                s1.y yVar12 = c1183b.f10438c;
                                                int length4 = iArr2.length;
                                                for (int i27 = 0; i27 < length4; i27++) {
                                                    int i28 = iArr2[i27];
                                                    Bundle bundle8 = bundleArr[i27];
                                                    if (i27 == 0) {
                                                        C3 = c1183b.f10438c;
                                                    } else {
                                                        Intrinsics.c(yVar12);
                                                        C3 = yVar12.C(i28, yVar12, false);
                                                    }
                                                    if (C3 == null) {
                                                        int i29 = s1.v.f10569n;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + AbstractC0864b.s(context, i28) + " cannot be found in graph " + yVar12);
                                                    }
                                                    if (i27 == iArr2.length - 1) {
                                                        s1.y yVar13 = c1183b.f10438c;
                                                        Intrinsics.c(yVar13);
                                                        c1183b.k(C3, bundle8, new E(false, false, yVar13.f10575l, true, false, 0, 0));
                                                    } else if (C3 instanceof s1.y) {
                                                        while (true) {
                                                            yVar = (s1.y) C3;
                                                            Intrinsics.c(yVar);
                                                            if (!(yVar.C(yVar.f10587p, yVar, false) instanceof s1.y)) {
                                                                break;
                                                            } else {
                                                                C3 = yVar.C(yVar.f10587p, yVar, false);
                                                            }
                                                        }
                                                        yVar12 = yVar;
                                                    }
                                                }
                                                c1183b.f10441f = true;
                                            }
                                        }
                                    }
                                }
                            } else {
                                iArr = intArray;
                                interfaceC0481v = interfaceC0481v2;
                                i4 = i10;
                            }
                            arrayList = arrayList3;
                            iArr2 = iArr;
                            if (iArr2 != null) {
                                s1.y yVar92 = c1183b.f10438c;
                                length = iArr2.length;
                                i8 = 0;
                                while (true) {
                                    if (i8 < length) {
                                    }
                                    i8++;
                                }
                                if (str == null) {
                                }
                            }
                        }
                        intArray = null;
                        if (extras == null) {
                        }
                        Bundle bundle52 = new Bundle();
                        ArrayList arrayList32 = parcelableArrayList;
                        if (extras == null) {
                        }
                        if (bundle != null) {
                        }
                        if (intArray != null) {
                        }
                        s1.y i182 = c1183b.i(c1433q);
                        iArr = intArray;
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        i4 = i10;
                        interfaceC0481v = interfaceC0481v2;
                        D3 = i182.D(new C0097d(intent.getData(), intent.getAction(), intent.getType(), 23), true, true, i182);
                        if (D3 != null) {
                        }
                        arrayList = arrayList32;
                        iArr2 = iArr;
                        if (iArr2 != null) {
                        }
                    }
                    s1.v vVar6 = c1183b.f10438c;
                    Intrinsics.c(vVar6);
                    c1183b.k(vVar6, null, null);
                }
            }
            s1.H b5 = c1183b.f10457v.b("composable");
            t1.i iVar2 = b5 instanceof t1.i ? (t1.i) b5 : null;
            if (iVar2 == null) {
                C0222s0 s6 = c0216p.s();
                if (s6 != null) {
                    s6.f2903d = new t1.z(c1183b, graph, oVar, cVar, function1, function12, function13, function14, function15, i2, 1);
                    return;
                }
                return;
            }
            InterfaceC0191c0 u5 = C0192d.u(iVar2.b().f10531e, c0216p);
            Object I12 = c0216p.I();
            Object obj5 = C0208l.f2826a;
            if (I12 == obj5) {
                I12 = C0192d.I(0.0f);
                c0216p.c0(I12);
            }
            C0197f0 c0197f0 = (C0197f0) I12;
            Object I13 = c0216p.I();
            if (I13 == obj5) {
                I13 = C0192d.K(Boolean.FALSE, W.f2779l);
                c0216p.c0(I13);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I13;
            boolean z9 = ((List) u5.getValue()).size() > 1;
            boolean f9 = c0216p.f(u5) | c0216p.f(iVar2);
            Object I14 = c0216p.I();
            if (f9 || I14 == obj5) {
                t1.s sVar = new t1.s(iVar2, c0197f0, u5, interfaceC0191c0, null);
                c0216p.c0(sVar);
                I14 = sVar;
            }
            u3.d.h(z9, (Function2) I14, c0216p, 0);
            InterfaceC0481v interfaceC0481v3 = interfaceC0481v;
            boolean h8 = c0216p.h(c1183b) | c0216p.h(interfaceC0481v3);
            Object I15 = c0216p.I();
            if (h8 || I15 == obj5) {
                I15 = new n0(c1183b, 10, interfaceC0481v3);
                c0216p.c0(I15);
            }
            C0192d.d(interfaceC0481v3, (Function1) I15, c0216p);
            P.i Q3 = M1.a.Q(c0216p);
            InterfaceC0191c0 u6 = C0192d.u(c1183b.f10445j, c0216p);
            Object I16 = c0216p.I();
            if (I16 == obj5) {
                I16 = C0192d.D(new C.v(3, u6));
                c0216p.c0(I16);
            }
            X0 x03 = (X0) I16;
            C1193i c1193i5 = (C1193i) C1403G.y((List) x03.getValue());
            Object I17 = c0216p.I();
            if (I17 == obj5) {
                I17 = new LinkedHashMap();
                c0216p.c0(I17);
            }
            Map map3 = (Map) I17;
            c0216p.S(653353748);
            if (c1193i5 != null) {
                boolean f10 = c0216p.f(iVar2);
                if (((i4 & 3670016) ^ 1572864) <= 1048576) {
                }
                if ((i4 & 1572864) != 1048576) {
                    z4 = false;
                    z5 = f10 | z4 | ((i4 & 57344) != 16384);
                    I3 = c0216p.I();
                    if (!z5 || I3 == obj5) {
                        map = map3;
                        c1193i = c1193i5;
                        z6 = true;
                        iVar = Q3;
                        i5 = i4;
                        t1.A a8 = new t1.A(iVar2, function13, function1, interfaceC0191c0, 0);
                        c0216p.c0(a8);
                        I3 = a8;
                    } else {
                        map = map3;
                        c1193i = c1193i5;
                        iVar = Q3;
                        i5 = i4;
                        z6 = true;
                    }
                    function16 = (Function1) I3;
                    f4 = c0216p.f(iVar2) | (((((29360128 & i5) ^ 12582912) > 8388608 || !c0216p.f(function14)) && (i5 & 12582912) != 8388608) ? false : z6) | ((458752 & i5) != 131072 ? z6 : false);
                    I4 = c0216p.I();
                    if (!f4 || I4 == obj5) {
                        function17 = function16;
                        t1.A a9 = new t1.A(iVar2, function14, function12, interfaceC0191c0, 1);
                        c0216p.c0(a9);
                        I4 = a9;
                    } else {
                        function17 = function16;
                    }
                    Function1 function18 = (Function1) I4;
                    if ((234881024 & i5) != 67108864) {
                        z6 = false;
                    }
                    I5 = c0216p.I();
                    if (!z6 || I5 == obj5) {
                        I5 = new C0267c(4, function15);
                        c0216p.c0(I5);
                    }
                    Function1 function19 = (Function1) I5;
                    Boolean bool = Boolean.TRUE;
                    f5 = c0216p.f(iVar2);
                    I6 = c0216p.I();
                    if (!f5 || I6 == obj5) {
                        I6 = new n0(x03, 11, iVar2);
                        c0216p.c0(I6);
                    }
                    C0192d.d(bool, (Function1) I6, c0216p);
                    I7 = c0216p.I();
                    if (I7 == obj5) {
                        I7 = new U(c1193i);
                        c0216p.c0(I7);
                    }
                    u4 = (U) I7;
                    Object obj6 = s0.f7840a;
                    f6 = c0216p.f(u4);
                    I8 = c0216p.I();
                    if (!f6 || I8 == obj5) {
                        I8 = new m0(u4, null, "entry");
                        c0216p.c0(I8);
                    }
                    m0Var = (m0) I8;
                    if (u4 == null) {
                        c0216p.S(1030413636);
                        Object value = u4.f7635c.getValue();
                        Object value2 = u4.f7634b.getValue();
                        boolean f11 = c0216p.f(u4);
                        Object I18 = c0216p.I();
                        if (f11 || I18 == obj5) {
                            i6 = i5;
                            I18 = new p0(u4, null);
                            c0216p.c0(I18);
                        } else {
                            i6 = i5;
                        }
                        C0192d.f(value, value2, (Function2) I18, c0216p);
                        i7 = 0;
                        c0216p.q(false);
                    } else {
                        i6 = i5;
                        i7 = 0;
                        c0216p.S(1030875195);
                        m0Var.a(u4.f7634b.getValue(), c0216p, 0);
                        c0216p.q(false);
                    }
                    f7 = c0216p.f(m0Var);
                    I9 = c0216p.I();
                    if (!f7 || I9 == obj5) {
                        I9 = new r0(m0Var, i7);
                        c0216p.c0(I9);
                    }
                    C0192d.d(m0Var, (Function1) I9, c0216p);
                    if (c(interfaceC0191c0)) {
                        c0216p.S(-1218337931);
                        boolean h9 = c0216p.h(u4) | c0216p.h(c1193i) | c0216p.f(m0Var);
                        Object I19 = c0216p.I();
                        if (h9 || I19 == obj5) {
                            I19 = new t1.v(u4, c1193i, m0Var, null);
                            c0216p.c0(I19);
                        }
                        C0192d.e(c0216p, c1193i, (Function2) I19);
                        z7 = false;
                        c0216p.q(false);
                        map2 = map;
                    } else {
                        c0216p.S(-1218592968);
                        Float valueOf = Float.valueOf(c0197f0.d());
                        boolean f12 = c0216p.f(u5) | c0216p.h(u4);
                        Object I20 = c0216p.I();
                        if (f12 || I20 == obj5) {
                            I20 = new t1.t(u4, u5, c0197f0, null);
                            c0216p.c0(I20);
                        }
                        C0192d.e(c0216p, valueOf, (Function2) I20);
                        c0216p.q(false);
                        map2 = map;
                        z7 = false;
                    }
                    Function1 function110 = function17;
                    h4 = c0216p.h(map2) | c0216p.f(iVar2) | c0216p.f(function110) | c0216p.f(function18) | c0216p.f(function19);
                    I10 = c0216p.I();
                    if (!h4 || I10 == obj5) {
                        m0Var2 = m0Var;
                        x02 = x03;
                        t1.w wVar = new t1.w(map2, iVar2, function110, function18, function19, x03, interfaceC0191c0);
                        c0216p.c0(wVar);
                        I10 = wVar;
                    } else {
                        m0Var2 = m0Var;
                        x02 = x03;
                    }
                    r10 = z7;
                    pVar = null;
                    j0.c.b(m0Var2, oVar, (Function1) I10, cVar, t1.x.f10718e, O.f.b(820763100, new M(iVar, interfaceC0191c0, x02, 3), c0216p), c0216p, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                    m0 m0Var3 = m0Var2;
                    Object l4 = m0Var3.f7800a.l();
                    Object value3 = m0Var3.f7803d.getValue();
                    f8 = c0216p.f(m0Var3) | c0216p.f(iVar2) | c0216p.h(map2);
                    I11 = c0216p.I();
                    if (!f8 || I11 == obj5) {
                        t1.y yVar14 = new t1.y(m0Var3, map2, x02, iVar2, null);
                        c0216p.c0(yVar14);
                        I11 = yVar14;
                    }
                    C0192d.f(l4, value3, (Function2) I11, c0216p);
                }
                z4 = true;
                z5 = f10 | z4 | ((i4 & 57344) != 16384);
                I3 = c0216p.I();
                if (z5) {
                }
                map = map3;
                c1193i = c1193i5;
                z6 = true;
                iVar = Q3;
                i5 = i4;
                t1.A a82 = new t1.A(iVar2, function13, function1, interfaceC0191c0, 0);
                c0216p.c0(a82);
                I3 = a82;
                function16 = (Function1) I3;
                f4 = c0216p.f(iVar2) | (((((29360128 & i5) ^ 12582912) > 8388608 || !c0216p.f(function14)) && (i5 & 12582912) != 8388608) ? false : z6) | ((458752 & i5) != 131072 ? z6 : false);
                I4 = c0216p.I();
                if (f4) {
                }
                function17 = function16;
                t1.A a92 = new t1.A(iVar2, function14, function12, interfaceC0191c0, 1);
                c0216p.c0(a92);
                I4 = a92;
                Function1 function182 = (Function1) I4;
                if ((234881024 & i5) != 67108864) {
                }
                I5 = c0216p.I();
                if (!z6) {
                }
                I5 = new C0267c(4, function15);
                c0216p.c0(I5);
                Function1 function192 = (Function1) I5;
                Boolean bool2 = Boolean.TRUE;
                f5 = c0216p.f(iVar2);
                I6 = c0216p.I();
                if (!f5) {
                }
                I6 = new n0(x03, 11, iVar2);
                c0216p.c0(I6);
                C0192d.d(bool2, (Function1) I6, c0216p);
                I7 = c0216p.I();
                if (I7 == obj5) {
                }
                u4 = (U) I7;
                Object obj62 = s0.f7840a;
                f6 = c0216p.f(u4);
                I8 = c0216p.I();
                if (!f6) {
                }
                I8 = new m0(u4, null, "entry");
                c0216p.c0(I8);
                m0Var = (m0) I8;
                if (u4 == null) {
                }
                f7 = c0216p.f(m0Var);
                I9 = c0216p.I();
                if (!f7) {
                }
                I9 = new r0(m0Var, i7);
                c0216p.c0(I9);
                C0192d.d(m0Var, (Function1) I9, c0216p);
                if (c(interfaceC0191c0)) {
                }
                Function1 function1102 = function17;
                h4 = c0216p.h(map2) | c0216p.f(iVar2) | c0216p.f(function1102) | c0216p.f(function182) | c0216p.f(function192);
                I10 = c0216p.I();
                if (h4) {
                }
                m0Var2 = m0Var;
                x02 = x03;
                t1.w wVar2 = new t1.w(map2, iVar2, function1102, function182, function192, x03, interfaceC0191c0);
                c0216p.c0(wVar2);
                I10 = wVar2;
                r10 = z7;
                pVar = null;
                j0.c.b(m0Var2, oVar, (Function1) I10, cVar, t1.x.f10718e, O.f.b(820763100, new M(iVar, interfaceC0191c0, x02, 3), c0216p), c0216p, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                m0 m0Var32 = m0Var2;
                Object l42 = m0Var32.f7800a.l();
                Object value32 = m0Var32.f7803d.getValue();
                f8 = c0216p.f(m0Var32) | c0216p.f(iVar2) | c0216p.h(map2);
                I11 = c0216p.I();
                if (!f8) {
                }
                t1.y yVar142 = new t1.y(m0Var32, map2, x02, iVar2, null);
                c0216p.c0(yVar142);
                I11 = yVar142;
                C0192d.f(l42, value32, (Function2) I11, c0216p);
            } else {
                pVar = null;
                r10 = 0;
            }
            c0216p.q(r10);
            s1.H b6 = c1183b.f10457v.b("dialog");
            t1.p pVar4 = b6 instanceof t1.p ? (t1.p) b6 : pVar;
            if (pVar4 == null) {
                C0222s0 s7 = c0216p.s();
                if (s7 != null) {
                    s7.f2903d = new t1.z(c1183b, graph, oVar, cVar, function1, function12, function13, function14, function15, i2, 2);
                    return;
                }
                return;
            }
            AbstractC0864b.d(pVar4, c0216p, r10);
        }
        C0222s0 s8 = c0216p.s();
        if (s8 != null) {
            s8.f2903d = new t1.z(c1183b, graph, oVar, cVar, function1, function12, function13, function14, function15, i2, 0);
        }
    }

    public static final boolean c(InterfaceC0191c0 interfaceC0191c0) {
        return ((Boolean) interfaceC0191c0.getValue()).booleanValue();
    }

    public static final void d(r.h hVar, Object obj, int i2, Object obj2, C0216p c0216p, int i4) {
        int i5;
        c0216p.U(1439843069);
        if ((i4 & 6) == 0) {
            i5 = (c0216p.f(hVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0216p.f(obj) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0216p.d(i2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0216p.f(obj2) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
        } else {
            ((P.c) obj).d(obj2, O.f.b(980966366, new x1(i2, obj2, hVar), c0216p), c0216p, 48);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C1114r(hVar, obj, i2, obj2, i4);
        }
    }

    public static final void e(p3.a aVar, p3.c cVar, String str) {
        Logger logger = p3.d.f9129i;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f9123b);
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.f9116a);
        logger.fine(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:10:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(C0800A c0800a, E2.a aVar) {
        L l4;
        int i2;
        int size;
        int i4;
        if (aVar instanceof L) {
            l4 = (L) aVar;
            int i5 = l4.f8658l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                l4.f8658l = i5 - Integer.MIN_VALUE;
                Object obj = l4.f8657k;
                D2.a aVar2 = D2.a.f2163d;
                i2 = l4.f8658l;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    ?? r8 = c0800a.f7872l.f7882y.f7907a;
                    int size2 = r8.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (((l0.s) r8.get(i6)).f7926d) {
                            EnumC0812j enumC0812j = EnumC0812j.f7912i;
                            l4.f8656j = c0800a;
                            l4.f8658l = 1;
                            obj = c0800a.a(enumC0812j, l4);
                            if (obj == aVar2) {
                            }
                            ?? r82 = ((C0811i) obj).f7907a;
                            size = r82.size();
                            i4 = 0;
                            while (i4 < size) {
                            }
                            return Unit.f7487a;
                        }
                    }
                    return Unit.f7487a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0800a = l4.f8656j;
                AbstractC1343r.b(obj);
                ?? r822 = ((C0811i) obj).f7907a;
                size = r822.size();
                i4 = 0;
                while (i4 < size) {
                    if (((l0.s) r822.get(i4)).f7926d) {
                        EnumC0812j enumC0812j2 = EnumC0812j.f7912i;
                        l4.f8656j = c0800a;
                        l4.f8658l = 1;
                        obj = c0800a.a(enumC0812j2, l4);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        ?? r8222 = ((C0811i) obj).f7907a;
                        size = r8222.size();
                        i4 = 0;
                        while (i4 < size) {
                        }
                    } else {
                        i4++;
                    }
                }
                return Unit.f7487a;
            }
        }
        l4 = new L(aVar);
        Object obj2 = l4.f8657k;
        D2.a aVar22 = D2.a.f2163d;
        i2 = l4.f8658l;
        if (i2 != 0) {
        }
    }

    public static final Object g(C0802C c0802c, Function2 function2, C2.a aVar) {
        Object B02 = c0802c.B0(new o.M(aVar.p(), function2, null), aVar);
        return B02 == D2.a.f2163d ? B02 : Unit.f7487a;
    }

    public static final z3.z h(z3.F f4) {
        Intrinsics.checkNotNullParameter(f4, "<this>");
        return new z3.z(f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [z2.I] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean i(ArrayList arrayList) {
        ?? r02;
        long j4;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            r02 = C1405I.f11931d;
        } else {
            r02 = new ArrayList();
            Object obj = arrayList.get(0);
            int d4 = C1441y.d(arrayList);
            int i2 = 0;
            while (i2 < d4) {
                i2++;
                Object obj2 = arrayList.get(i2);
                y0.n nVar = (y0.n) obj2;
                y0.n nVar2 = (y0.n) obj;
                r02.add(new Y.c(AbstractC0345a.c(Math.abs(Y.c.d(nVar2.e().a()) - Y.c.d(nVar.e().a())), Math.abs(Y.c.e(nVar2.e().a()) - Y.c.e(nVar.e().a())))));
                obj = obj2;
            }
        }
        if (r02.size() == 1) {
            j4 = ((Y.c) C1403G.q(r02)).f4372a;
        } else {
            if (r02.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object q2 = C1403G.q(r02);
            int d5 = C1441y.d(r02);
            if (1 <= d5) {
                int i4 = 1;
                while (true) {
                    q2 = new Y.c(Y.c.h(((Y.c) q2).f4372a, ((Y.c) r02.get(i4)).f4372a));
                    if (i4 == d5) {
                        break;
                    }
                    i4++;
                }
            }
            j4 = ((Y.c) q2).f4372a;
        }
        return Y.c.e(j4) < Y.c.d(j4);
    }

    public static T j(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Object newInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (T) newInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e6);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static A k(String javaName) {
        Intrinsics.checkNotNullParameter(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return A.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return A.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return A.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return A.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return A.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    public static final String l(long j4) {
        String str;
        if (j4 <= -999500000) {
            str = ((j4 - 500000000) / 1000000000) + " s ";
        } else if (j4 <= -999500) {
            str = ((j4 - 500000) / 1000000) + " ms";
        } else if (j4 <= 0) {
            str = ((j4 - 500) / 1000) + " µs";
        } else if (j4 < 999500) {
            str = ((j4 + 500) / 1000) + " µs";
        } else if (j4 < 999500000) {
            str = ((j4 + 500000) / 1000000) + " ms";
        } else {
            str = ((j4 + 500000000) / 1000000000) + " s ";
        }
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    public static C1347b m(C1347b c1347b, M0.k kVar, A0.L l4, M0.b bVar, F0.d dVar) {
        if (c1347b != null && kVar == c1347b.f11697a && Intrinsics.a(l4, c1347b.f11698b) && bVar.e() == c1347b.f11699c.e() && dVar == c1347b.f11700d) {
            return c1347b;
        }
        C1347b c1347b2 = C1347b.f11696h;
        if (c1347b2 != null && kVar == c1347b2.f11697a && Intrinsics.a(l4, c1347b2.f11698b) && bVar.e() == c1347b2.f11699c.e() && dVar == c1347b2.f11700d) {
            return c1347b2;
        }
        C1347b c1347b3 = new C1347b(kVar, AbstractC0345a.E(l4, kVar), bVar, dVar);
        C1347b.f11696h = c1347b3;
        return c1347b3;
    }

    public static final Object n(y0.i iVar, y0.t tVar) {
        Object obj = iVar.f11576d.get(tVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final boolean o(AssertionError assertionError) {
        Logger logger = z3.t.f12033a;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? kotlin.text.y.p(message, "getsockname failed") : false;
    }

    public static boolean p() {
        boolean isEnabled;
        try {
            if (f8494b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f8494b == null) {
                f8493a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f8494b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f8494b.invoke(null, Long.valueOf(f8493a))).booleanValue();
        } catch (Exception e4) {
            if (!(e4 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e4);
                return false;
            }
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final ArrayList q(LinkedHashMap linkedHashMap, Function1 isArgumentMissing) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Intrinsics.checkNotNullParameter(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() != null) {
                throw new ClassCastException();
            }
            Intrinsics.c(null);
            throw null;
        }
        Set keySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) isArgumentMissing.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void r(C0508h c0508h, y0.n nVar) {
        Object obj = nVar.i().f11576d.get(y0.q.f11618g);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            throw new ClassCastException();
        }
        y0.n j4 = nVar.j();
        if (j4 == null) {
            return;
        }
        Object obj2 = j4.i().f11576d.get(y0.q.f11616e);
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null) {
            Object obj3 = j4.i().f11576d.get(y0.q.f11617f);
            C1318b c1318b = (C1318b) (obj3 != null ? obj3 : null);
            if (c1318b == null || (c1318b.f11537a >= 0 && c1318b.f11538b >= 0)) {
                if (nVar.i().f11576d.containsKey(y0.q.f11606A)) {
                    ArrayList arrayList = new ArrayList();
                    List h4 = y0.n.h(j4, true, 4);
                    int size = h4.size();
                    int i2 = 0;
                    for (int i4 = 0; i4 < size; i4++) {
                        y0.n nVar2 = (y0.n) h4.get(i4);
                        if (nVar2.i().f11576d.containsKey(y0.q.f11606A)) {
                            arrayList.add(nVar2);
                            if (nVar2.f11586c.t() < nVar.f11586c.t()) {
                                i2++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean i5 = i(arrayList);
                    int i6 = i5 ? 0 : i2;
                    int i7 = i5 ? i2 : 0;
                    Object obj4 = nVar.i().f11576d.get(y0.q.f11606A);
                    if (obj4 == null) {
                        obj4 = Boolean.FALSE;
                    }
                    c0508h.f5625a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i6, 1, i7, 1, false, ((Boolean) obj4).booleanValue()));
                }
            }
        }
    }

    public static final C1445c s(Socket socket) {
        Logger logger = z3.t.f12033a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        z3.E e4 = new z3.E(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        C1445c sink = new C1445c(outputStream, e4);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C1445c(e4, sink);
    }

    public static final C1446d t(Socket socket) {
        Logger logger = z3.t.f12033a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        z3.E e4 = new z3.E(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        C1446d source = new C1446d(inputStream, e4);
        Intrinsics.checkNotNullParameter(source, "source");
        return new C1446d(e4, source);
    }
}
