package u3;

import a0.a0;
import a0.i0;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.b1;
import e6.c0;
import e6.e0;
import e6.f0;
import g0.c1;
import g0.m2;
import g0.p1;
import g0.z0;
import g4.n0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import l.s1;
import l.t1;
import l.x0;
import q.t0;
import t3.b0;
import t3.d0;
import t3.g0;
import t3.h0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class z {
    public static final void a(b0 b0Var, String str, s0.o oVar, s0.c cVar, q6.c cVar2, q6.c cVar3, q6.c cVar4, q6.c cVar5, q6.c cVar6, g0.p pVar, int i7) {
        q6.c cVar7;
        q6.c cVar8;
        int i8;
        s0.c cVar9;
        q6.c cVar10;
        q6.c cVar11;
        q6.c cVar12;
        q6.c cVar13;
        q6.c cVar14;
        q6.c cVar15;
        q6.c cVar16;
        s0.c cVar17;
        pVar.S(1840250294);
        int i9 = i7 | (pVar.h(b0Var) ? 4 : 2) | (pVar.f(oVar) ? 256 : 128) | 844852224;
        if ((306783379 & i9) == 306783378 && pVar.x()) {
            pVar.L();
            cVar17 = cVar;
            cVar15 = cVar2;
            cVar16 = cVar3;
            cVar13 = cVar4;
            cVar14 = cVar5;
            cVar12 = cVar6;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                s0.g gVar = s0.b.f8078f;
                cVar7 = w.f9033i;
                cVar8 = w.f9034j;
                i8 = i9 & (-264241153);
                cVar9 = gVar;
                cVar10 = cVar7;
                cVar11 = cVar8;
            } else {
                pVar.L();
                i8 = i9 & (-264241153);
                cVar9 = cVar;
                cVar7 = cVar2;
                cVar8 = cVar3;
                cVar10 = cVar4;
                cVar11 = cVar5;
            }
            pVar.q();
            Object G = pVar.G();
            if (G == g0.l.f3784a) {
                t3.z zVar = new t3.z(b0Var.f8766v, str);
                cVar12 = cVar6;
                cVar12.f(zVar);
                G = zVar.c();
                pVar.a0(G);
            } else {
                cVar12 = cVar6;
            }
            b(b0Var, (t3.y) G, oVar, cVar9, cVar7, cVar8, cVar10, cVar11, pVar, 100884480 | (i8 & 8078));
            cVar13 = cVar10;
            cVar14 = cVar11;
            cVar15 = cVar7;
            cVar16 = cVar8;
            cVar17 = cVar9;
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new u(b0Var, str, oVar, cVar17, cVar15, cVar16, cVar13, cVar14, cVar12, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x038d  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13, types: [h6.d] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r15v5, types: [g0.p] */
    /* JADX WARN: Type inference failed for: r23v2, types: [h6.d] */
    /* JADX WARN: Type inference failed for: r23v4, types: [h6.d] */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.lang.Object, t3.b0] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, l.p1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(b0 b0Var, t3.y yVar, s0.o oVar, s0.c cVar, q6.c cVar2, q6.c cVar3, q6.c cVar4, q6.c cVar5, g0.p pVar, int i7) {
        int i8;
        androidx.lifecycle.v vVar;
        h0 h0Var;
        p pVar2;
        Object obj;
        i iVar;
        z0 z0Var;
        h0 h0Var2;
        q6.c cVar6;
        p0.g gVar;
        h0 h0Var3;
        c1 c1Var;
        m2 m2Var;
        int i9;
        ?? r12;
        l.p1 p1Var;
        t3.h hVar;
        p pVar3;
        Object vVar2;
        i iVar2;
        p0.g gVar2;
        Map map;
        m2 m2Var2;
        z0 z0Var2;
        p pVar4;
        Intent intent;
        int[] intArray;
        Bundle bundle;
        e6.j jVar;
        t3.t y4;
        ArrayList arrayList;
        int length;
        int i10;
        String str;
        t3.v x8;
        t3.y yVar2;
        Bundle bundle2;
        t3.v x9;
        t3.y yVar3;
        int i11;
        ArrayList<String> stringArrayList;
        g0.p pVar5;
        pVar.S(-1964664536);
        int i12 = (i7 & 6) == 0 ? (pVar.h(b0Var) ? 4 : 2) | i7 : i7;
        if ((i7 & 48) == 0) {
            i12 |= pVar.h(yVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i12 |= pVar.f(oVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i12 |= pVar.f(cVar) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i12 |= pVar.h(cVar2) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i12 |= pVar.h(cVar3) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i12 |= pVar.h(cVar4) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i12 |= pVar.h(cVar5) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i12 |= pVar.h(null) ? 67108864 : 33554432;
        }
        int i13 = i12;
        if ((38347923 & i13) == 38347922 && pVar.x()) {
            pVar.L();
            pVar5 = pVar;
        } else {
            pVar.N();
            if ((i7 & 1) != 0 && !pVar.w()) {
                pVar.L();
            }
            pVar.q();
            androidx.lifecycle.v vVar3 = (androidx.lifecycle.v) pVar.k(p3.b.f7197a);
            androidx.lifecycle.c1 a3 = r3.b.a(pVar);
            if (a3 == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            b1 e9 = a3.e();
            b0Var.getClass();
            h0 h0Var4 = b0Var.f8766v;
            e6.j jVar2 = b0Var.f8751g;
            r6.k.f(e9, "viewModelStore");
            t3.o oVar2 = b0Var.f8760p;
            t3.n nVar = t3.o.f8827c;
            if (!r6.k.a(oVar2, (t3.o) new b6.c(e9, nVar, 0).o(r6.w.a(t3.o.class)))) {
                if (!jVar2.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                b0Var.f8760p = (t3.o) new b6.c(e9, nVar, 0).o(r6.w.a(t3.o.class));
            }
            r6.k.f(yVar, "graph");
            LinkedHashMap linkedHashMap = b0Var.f8767w;
            i.h0 h0Var5 = yVar.f8874o;
            if (!jVar2.isEmpty() && b0Var.g() == androidx.lifecycle.o.f1007f) {
                throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            }
            if (r6.k.a(b0Var.f8747c, yVar)) {
                i8 = i13;
                vVar = vVar3;
                int e10 = h0Var5.e();
                for (int i14 = 0; i14 < e10; i14++) {
                    t3.v vVar4 = (t3.v) h0Var5.f(i14);
                    t3.y yVar4 = b0Var.f8747c;
                    r6.k.c(yVar4);
                    int c4 = yVar4.f8874o.c(i14);
                    t3.y yVar5 = b0Var.f8747c;
                    r6.k.c(yVar5);
                    i.h0 h0Var6 = yVar5.f8874o;
                    if (h0Var6.f4746f) {
                        i.m.a(h0Var6);
                    }
                    int a9 = j.a.a(h0Var6.f4747g, h0Var6.f4749i, c4);
                    if (a9 >= 0) {
                        Object[] objArr = h0Var6.f4748h;
                        Object obj2 = objArr[a9];
                        objArr[a9] = vVar4;
                    }
                }
                Iterator it = jVar2.iterator();
                while (it.hasNext()) {
                    t3.h hVar2 = (t3.h) it.next();
                    int i15 = t3.v.f8856n;
                    f0 f0Var = new f0(y6.h.q(r4.a.E(hVar2.f8792g)));
                    t3.v vVar5 = b0Var.f8747c;
                    r6.k.c(vVar5);
                    Iterator it2 = f0Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((e0) it2).f2814g;
                        if (listIterator.hasPrevious()) {
                            t3.v vVar6 = (t3.v) listIterator.previous();
                            if (!r6.k.a(vVar6, b0Var.f8747c) || !r6.k.a(vVar5, yVar)) {
                                if (vVar5 instanceof t3.y) {
                                    t3.y yVar6 = (t3.y) vVar5;
                                    vVar5 = yVar6.x(vVar6.f8862k, yVar6, false);
                                    r6.k.c(vVar5);
                                }
                            }
                        }
                    }
                    r6.k.f(vVar5, "<set-?>");
                    hVar2.f8792g = vVar5;
                }
            } else {
                t3.y yVar7 = b0Var.f8747c;
                if (yVar7 != null) {
                    ArrayList arrayList2 = new ArrayList(b0Var.f8757m.keySet());
                    int size = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList2.get(i16);
                        i16++;
                        Integer num = (Integer) obj3;
                        r6.k.e(num, "id");
                        int intValue = num.intValue();
                        for (Iterator it3 = linkedHashMap.values().iterator(); it3.hasNext(); it3 = it3) {
                            ((t3.k) it3.next()).f8814d = true;
                            arrayList2 = arrayList2;
                        }
                        ArrayList arrayList3 = arrayList2;
                        t3.e0 e0Var = new t3.e0();
                        e0Var.f8783c = true;
                        boolean z8 = e0Var.f8782b;
                        boolean z9 = e0Var.f8783c;
                        int i17 = e0Var.f8784d;
                        boolean z10 = e0Var.f8785e;
                        d0.c1 c1Var2 = e0Var.f8781a;
                        boolean o2 = b0Var.o(intValue, null, new d0(z8, z9, i17, false, z10, c1Var2.f1876a, c1Var2.f1877b));
                        Iterator it4 = linkedHashMap.values().iterator();
                        while (it4.hasNext()) {
                            ((t3.k) it4.next()).f8814d = false;
                            it4 = it4;
                            o2 = o2;
                        }
                        if (o2) {
                            b0Var.k(intValue, true, false);
                        }
                        arrayList2 = arrayList3;
                    }
                    b0Var.k(yVar7.f8862k, true, false);
                }
                b0Var.f8747c = yVar;
                Activity activity = b0Var.f8746b;
                Context context = b0Var.f8745a;
                Bundle bundle3 = b0Var.f8748d;
                if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                    int size2 = stringArrayList.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        String str2 = stringArrayList.get(i18);
                        i18++;
                        ArrayList<String> arrayList4 = stringArrayList;
                        String str3 = str2;
                        r6.k.e(str3, "name");
                        h0Var4.b(str3);
                        bundle3.getBundle(str3);
                        stringArrayList = arrayList4;
                    }
                }
                Parcelable[] parcelableArr = b0Var.f8749e;
                if (parcelableArr != null) {
                    int length2 = parcelableArr.length;
                    int i19 = 0;
                    while (i19 < length2) {
                        Parcelable parcelable = parcelableArr[i19];
                        Parcelable[] parcelableArr2 = parcelableArr;
                        r6.k.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        t3.i iVar3 = (t3.i) parcelable;
                        int i20 = iVar3.f8806g;
                        int i21 = length2;
                        t3.v c6 = b0Var.c(i20);
                        if (c6 == null) {
                            int i22 = t3.v.f8856n;
                            String D = r4.a.D(context, i20);
                            StringBuilder sb = new StringBuilder("Restoring the Navigation back stack failed: destination ");
                            sb.append(D);
                            sb.append(" cannot be found from the current destination ");
                            t3.h hVar3 = (t3.h) jVar2.y();
                            sb.append(hVar3 != null ? hVar3.f8792g : null);
                            throw new IllegalStateException(sb.toString());
                        }
                        int i23 = i19;
                        t3.h a10 = iVar3.a(context, c6, b0Var.g(), b0Var.f8760p);
                        g0 b9 = h0Var4.b(c6.f8857f);
                        Object obj4 = linkedHashMap.get(b9);
                        if (obj4 == null) {
                            obj4 = new t3.k(b0Var, b9);
                            linkedHashMap.put(b9, obj4);
                        }
                        jVar2.addLast(a10);
                        ((t3.k) obj4).a(a10);
                        t3.y yVar8 = a10.f8792g.f8858g;
                        if (yVar8 != null) {
                            b0Var.i(a10, b0Var.e(yVar8.f8862k));
                        }
                        i19 = i23 + 1;
                        parcelableArr = parcelableArr2;
                        length2 = i21;
                    }
                    b0Var.r();
                    b0Var.f8749e = null;
                }
                Collection values = c0.m0(h0Var4.f8804a).values();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : values) {
                    if (!((g0) obj5).f8790b) {
                        arrayList5.add(obj5);
                    }
                }
                int size3 = arrayList5.size();
                int i24 = 0;
                while (i24 < size3) {
                    Object obj6 = arrayList5.get(i24);
                    i24++;
                    g0 g0Var = (g0) obj6;
                    Object obj7 = linkedHashMap.get(g0Var);
                    if (obj7 == null) {
                        i11 = size3;
                        t3.k kVar = new t3.k(b0Var, g0Var);
                        linkedHashMap.put(g0Var, kVar);
                        obj7 = kVar;
                    } else {
                        i11 = size3;
                    }
                    g0Var.getClass();
                    g0Var.f8789a = (t3.k) obj7;
                    g0Var.f8790b = true;
                    size3 = i11;
                }
                if (b0Var.f8747c == null || !jVar2.isEmpty()) {
                    i8 = i13;
                    vVar = vVar3;
                    b0Var.b();
                } else {
                    if (b0Var.f8750f || activity == null || (intent = activity.getIntent()) == null) {
                        i8 = i13;
                        vVar = vVar3;
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            try {
                                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                            } catch (Exception e11) {
                                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e11);
                            }
                            ArrayList parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundle4 = new Bundle();
                            ArrayList arrayList6 = parcelableArrayList;
                            bundle = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle != null) {
                                bundle4.putAll(bundle);
                            }
                            if (intArray != null || intArray.length == 0) {
                                t3.y h3 = b0Var.h(jVar2);
                                jVar = jVar2;
                                y4 = h3.y(new b1.b(intent), true, h3);
                                if (y4 != null) {
                                    t3.v vVar7 = y4.f8849f;
                                    e6.j jVar3 = new e6.j();
                                    t3.v vVar8 = vVar7;
                                    i8 = i13;
                                    while (true) {
                                        t3.y yVar9 = vVar8.f8858g;
                                        vVar = vVar3;
                                        if (yVar9 == null || yVar9.f8875p != vVar8.f8862k) {
                                            jVar3.addFirst(vVar8);
                                        }
                                        if (!r6.k.a(yVar9, null) && yVar9 != null) {
                                            vVar8 = yVar9;
                                            vVar3 = vVar;
                                        }
                                    }
                                    List w02 = e6.l.w0(jVar3);
                                    ArrayList arrayList7 = new ArrayList(e6.n.a0(w02, 10));
                                    Iterator it5 = w02.iterator();
                                    while (it5.hasNext()) {
                                        arrayList7.add(Integer.valueOf(((t3.v) it5.next()).f8862k));
                                    }
                                    intArray = e6.l.v0(arrayList7);
                                    Bundle a11 = vVar7.a(y4.f8850g);
                                    if (a11 != null) {
                                        bundle4.putAll(a11);
                                    }
                                    arrayList = null;
                                    if (intArray != null && intArray.length != 0) {
                                        t3.y yVar10 = b0Var.f8747c;
                                        length = intArray.length;
                                        i10 = 0;
                                        while (true) {
                                            if (i10 < length) {
                                                str = null;
                                                break;
                                            }
                                            int i25 = intArray[i10];
                                            if (i10 == 0) {
                                                t3.y yVar11 = b0Var.f8747c;
                                                r6.k.c(yVar11);
                                                x9 = yVar11.f8862k == i25 ? b0Var.f8747c : null;
                                            } else {
                                                r6.k.c(yVar10);
                                                x9 = yVar10.x(i25, yVar10, false);
                                            }
                                            if (x9 == null) {
                                                int i26 = t3.v.f8856n;
                                                str = r4.a.D(context, i25);
                                                break;
                                            }
                                            if (i10 != intArray.length - 1 && (x9 instanceof t3.y)) {
                                                while (true) {
                                                    yVar3 = (t3.y) x9;
                                                    r6.k.c(yVar3);
                                                    if (!(yVar3.x(yVar3.f8875p, yVar3, false) instanceof t3.y)) {
                                                        break;
                                                    } else {
                                                        x9 = yVar3.x(yVar3.f8875p, yVar3, false);
                                                    }
                                                }
                                                yVar10 = yVar3;
                                            }
                                            i10++;
                                        }
                                        if (str == null) {
                                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                        } else {
                                            bundle4.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                            int length3 = intArray.length;
                                            Bundle[] bundleArr = new Bundle[length3];
                                            for (int i27 = 0; i27 < length3; i27++) {
                                                Bundle bundle5 = new Bundle();
                                                bundle5.putAll(bundle4);
                                                if (arrayList != null && (bundle2 = (Bundle) arrayList.get(i27)) != null) {
                                                    bundle5.putAll(bundle2);
                                                }
                                                bundleArr[i27] = bundle5;
                                            }
                                            int flags = intent.getFlags();
                                            int i28 = 268435456 & flags;
                                            if (i28 != 0 && (flags & 32768) == 0) {
                                                intent.addFlags(32768);
                                                ArrayList arrayList8 = new ArrayList();
                                                ComponentName component = intent.getComponent();
                                                if (component == null) {
                                                    component = intent.resolveActivity(context.getPackageManager());
                                                }
                                                if (component != null) {
                                                    int size4 = arrayList8.size();
                                                    try {
                                                        for (Intent I = a8.d.I(context, component); I != null; I = a8.d.I(context, I.getComponent())) {
                                                            arrayList8.add(size4, I);
                                                        }
                                                    } catch (PackageManager.NameNotFoundException e12) {
                                                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                        throw new IllegalArgumentException(e12);
                                                    }
                                                }
                                                arrayList8.add(intent);
                                                if (arrayList8.isEmpty()) {
                                                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                                                }
                                                Intent[] intentArr = (Intent[]) arrayList8.toArray(new Intent[0]);
                                                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                                context.startActivities(intentArr, null);
                                                activity.finish();
                                                activity.overridePendingTransition(0, 0);
                                            } else if (i28 != 0) {
                                                if (!jVar.isEmpty()) {
                                                    t3.y yVar12 = b0Var.f8747c;
                                                    r6.k.c(yVar12);
                                                    b0Var.k(yVar12.f8862k, true, false);
                                                }
                                                int i29 = 0;
                                                while (i29 < intArray.length) {
                                                    int i30 = intArray[i29];
                                                    int i31 = i29 + 1;
                                                    Bundle bundle6 = bundleArr[i29];
                                                    t3.v c9 = b0Var.c(i30);
                                                    if (c9 == null) {
                                                        int i32 = t3.v.f8856n;
                                                        String D2 = r4.a.D(context, i30);
                                                        StringBuilder sb2 = new StringBuilder("Deep Linking failed: destination ");
                                                        sb2.append(D2);
                                                        sb2.append(" cannot be found from the current destination ");
                                                        t3.h hVar4 = (t3.h) jVar.y();
                                                        sb2.append(hVar4 != null ? hVar4.f8792g : null);
                                                        throw new IllegalStateException(sb2.toString());
                                                    }
                                                    b0Var.j(c9, bundle6, a.a.B(new t0(c9, 9, b0Var)));
                                                    i29 = i31;
                                                }
                                                b0Var.f8750f = true;
                                            } else {
                                                t3.y yVar13 = b0Var.f8747c;
                                                int length4 = intArray.length;
                                                for (int i33 = 0; i33 < length4; i33++) {
                                                    int i34 = intArray[i33];
                                                    Bundle bundle7 = bundleArr[i33];
                                                    if (i33 == 0) {
                                                        x8 = b0Var.f8747c;
                                                    } else {
                                                        r6.k.c(yVar13);
                                                        x8 = yVar13.x(i34, yVar13, false);
                                                    }
                                                    if (x8 == null) {
                                                        int i35 = t3.v.f8856n;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + r4.a.D(context, i34) + " cannot be found in graph " + yVar13);
                                                    }
                                                    if (i33 == intArray.length - 1) {
                                                        t3.y yVar14 = b0Var.f8747c;
                                                        r6.k.c(yVar14);
                                                        b0Var.j(x8, bundle7, new d0(false, false, yVar14.f8862k, true, false, 0, 0));
                                                    } else if (x8 instanceof t3.y) {
                                                        while (true) {
                                                            yVar2 = (t3.y) x8;
                                                            r6.k.c(yVar2);
                                                            if (!(yVar2.x(yVar2.f8875p, yVar2, false) instanceof t3.y)) {
                                                                break;
                                                            } else {
                                                                x8 = yVar2.x(yVar2.f8875p, yVar2, false);
                                                            }
                                                        }
                                                        yVar13 = yVar2;
                                                    }
                                                }
                                                b0Var.f8750f = true;
                                            }
                                        }
                                    }
                                }
                            } else {
                                jVar = jVar2;
                            }
                            i8 = i13;
                            vVar = vVar3;
                            arrayList = arrayList6;
                            if (intArray != null) {
                                t3.y yVar102 = b0Var.f8747c;
                                length = intArray.length;
                                i10 = 0;
                                while (true) {
                                    if (i10 < length) {
                                    }
                                    i10++;
                                }
                                if (str == null) {
                                }
                            }
                        }
                        intArray = null;
                        if (extras == null) {
                        }
                        Bundle bundle42 = new Bundle();
                        ArrayList arrayList62 = parcelableArrayList;
                        if (extras == null) {
                        }
                        if (bundle != null) {
                        }
                        if (intArray != null) {
                        }
                        t3.y h32 = b0Var.h(jVar2);
                        jVar = jVar2;
                        y4 = h32.y(new b1.b(intent), true, h32);
                        if (y4 != null) {
                        }
                        i8 = i13;
                        vVar = vVar3;
                        arrayList = arrayList62;
                        if (intArray != null) {
                        }
                    }
                    t3.y yVar15 = b0Var.f8747c;
                    r6.k.c(yVar15);
                    b0Var.j(yVar15, null, null);
                }
            }
            g0 b10 = h0Var4.b("composable");
            i iVar4 = b10 instanceof i ? (i) b10 : null;
            if (iVar4 == null) {
                p1 r8 = pVar.r();
                if (r8 != null) {
                    r8.f3853d = new x(b0Var, yVar, oVar, cVar, cVar2, cVar3, cVar4, cVar5, i7, 1);
                    return;
                }
                return;
            }
            ?? r15 = pVar;
            z0 v5 = g0.d.v(iVar4.b().f8815e, r15);
            Object G = r15.G();
            Object obj8 = g0.l.f3784a;
            if (G == obj8) {
                G = g0.d.H(0.0f);
                r15.a0(G);
            }
            c1 c1Var3 = (c1) G;
            Object G2 = r15.G();
            if (G2 == obj8) {
                G2 = g0.d.J(Boolean.FALSE, g0.t0.f3903k);
                r15.a0(G2);
            }
            z0 z0Var3 = (z0) G2;
            boolean z11 = ((List) v5.getValue()).size() > 1;
            boolean f9 = r15.f(v5) | r15.f(iVar4);
            Object G3 = r15.G();
            if (f9 || G3 == obj8) {
                G3 = new androidx.room.d(iVar4, c1Var3, v5, z0Var3, null, 8);
                r15.a0(G3);
            }
            t6.a.i(z11, (q6.e) G3, r15, 0);
            androidx.lifecycle.v vVar9 = vVar;
            boolean h8 = r15.h(b0Var) | r15.h(vVar9);
            Object G4 = r15.G();
            if (h8 || G4 == obj8) {
                G4 = new t0(b0Var, 10, vVar9);
                r15.a0(G4);
            }
            g0.d.d(vVar9, (q6.c) G4, r15);
            p0.g W = a8.d.W(r15);
            z0 v8 = g0.d.v(b0Var.f8754j, r15);
            Object G5 = r15.G();
            if (G5 == obj8) {
                G5 = g0.d.C(new i0(v8, 5));
                r15.a0(G5);
            }
            m2 m2Var3 = (m2) G5;
            t3.h hVar5 = (t3.h) e6.l.o0((List) m2Var3.getValue());
            Object G6 = r15.G();
            if (G6 == obj8) {
                G6 = new LinkedHashMap();
                r15.a0(G6);
            }
            Map map2 = (Map) G6;
            r15.Q(653353748);
            if (hVar5 != null) {
                boolean f10 = r15.f(iVar4) | ((((i8 & 3670016) ^ 1572864) > 1048576 && r15.f(cVar4)) || (i8 & 1572864) == 1048576) | ((i8 & 57344) == 16384);
                Object G7 = r15.G();
                if (f10 || G7 == obj8) {
                    obj = obj8;
                    iVar = iVar4;
                    z0Var = z0Var3;
                    h0Var2 = h0Var4;
                    y yVar16 = new y(iVar, cVar4, cVar2, z0Var, 0);
                    r15.a0(yVar16);
                    G7 = yVar16;
                } else {
                    obj = obj8;
                    iVar = iVar4;
                    z0Var = z0Var3;
                    h0Var2 = h0Var4;
                }
                q6.c cVar7 = (q6.c) G7;
                boolean f11 = r15.f(iVar) | ((((i8 & 29360128) ^ 12582912) > 8388608 && r15.f(cVar5)) || (i8 & 12582912) == 8388608) | ((i8 & 458752) == 131072);
                Object G8 = r15.G();
                if (f11 || G8 == obj) {
                    cVar6 = cVar7;
                    y yVar17 = new y(iVar, cVar5, cVar3, z0Var, 1);
                    r15.a0(yVar17);
                    G8 = yVar17;
                } else {
                    cVar6 = cVar7;
                }
                q6.c cVar8 = (q6.c) G8;
                boolean z12 = (i8 & 234881024) == 67108864;
                Object G9 = r15.G();
                if (z12 || G9 == obj) {
                    G9 = new w(1, 3);
                    r15.a0(G9);
                }
                q6.c cVar9 = (q6.c) G9;
                Boolean bool = Boolean.TRUE;
                boolean f12 = r15.f(iVar);
                z0 z0Var4 = z0Var;
                Object G10 = r15.G();
                if (f12 || G10 == obj) {
                    G10 = new t0(m2Var3, 11, iVar);
                    r15.a0(G10);
                }
                g0.d.d(bool, (q6.c) G10, r15);
                Object G11 = r15.G();
                if (G11 == obj) {
                    G11 = new x0(hVar5);
                    r15.a0(G11);
                }
                x0 x0Var = (x0) G11;
                Object obj9 = t1.f5666a;
                boolean f13 = r15.f(x0Var);
                Object G12 = r15.G();
                if (f13 || G12 == obj) {
                    gVar = W;
                    G12 = new l.p1(x0Var, null, "entry");
                    r15.a0(G12);
                } else {
                    gVar = W;
                }
                ?? r52 = (l.p1) G12;
                if (x0Var != null) {
                    r15.Q(1030413636);
                    Object value = x0Var.f5707c.getValue();
                    Object value2 = x0Var.f5706b.getValue();
                    boolean f14 = r15.f(x0Var);
                    h0Var3 = h0Var2;
                    Object G13 = r15.G();
                    if (f14 || G13 == obj) {
                        c1Var = c1Var3;
                        m2Var = m2Var3;
                        r12 = null;
                        G13 = new a0(x0Var, (h6.d) r12, 12);
                        r15.a0(G13);
                    } else {
                        c1Var = c1Var3;
                        m2Var = m2Var3;
                        r12 = null;
                    }
                    g0.d.f(value, value2, (q6.e) G13, r15);
                    i9 = 0;
                    r15.p(false);
                } else {
                    h0Var3 = h0Var2;
                    c1Var = c1Var3;
                    m2Var = m2Var3;
                    i9 = 0;
                    r12 = null;
                    r15.Q(1030875195);
                    r52.a(x0Var.f5706b.getValue(), r15, 0);
                    r15.p(false);
                }
                boolean f15 = r15.f(r52);
                Object G14 = r15.G();
                if (f15 || G14 == obj) {
                    G14 = new s1(r52, i9);
                    r15.a0(G14);
                }
                g0.d.d(r52, (q6.c) G14, r15);
                if (c(z0Var4)) {
                    r15.Q(-1218592968);
                    Float valueOf = Float.valueOf(c1Var.e());
                    boolean f16 = r15.f(v5) | r15.h(x0Var);
                    Object G15 = r15.G();
                    if (f16 || G15 == obj) {
                        ?? r23 = r12;
                        G15 = new a0(x0Var, v5, c1Var, r23, 22);
                        r15.a0(G15);
                        pVar4 = r23;
                    } else {
                        pVar4 = r12;
                    }
                    g0.d.e(r15, valueOf, (q6.e) G15);
                    r15.p(false);
                    p1Var = r52;
                    pVar3 = pVar4;
                } else {
                    ?? r232 = r12;
                    r15.Q(-1218337931);
                    boolean h9 = r15.h(x0Var) | r15.h(hVar5) | r15.f(r52);
                    Object G16 = r15.G();
                    if (h9 || G16 == obj) {
                        p1Var = r52;
                        G16 = new androidx.lifecycle.g0(x0Var, hVar5, p1Var, (h6.d) r232, 11);
                        hVar = hVar5;
                        r15.a0(G16);
                    } else {
                        p1Var = r52;
                        hVar = hVar5;
                    }
                    g0.d.e(r15, hVar, (q6.e) G16);
                    r15.p(false);
                    pVar3 = r232;
                }
                boolean h10 = r15.h(map2) | r15.f(iVar) | r15.f(cVar6) | r15.f(cVar8) | r15.f(cVar9);
                Object G17 = r15.G();
                if (h10 || G17 == obj) {
                    iVar2 = iVar;
                    gVar2 = gVar;
                    m2 m2Var4 = m2Var;
                    vVar2 = new v(map2, iVar2, cVar6, cVar8, cVar9, m2Var4, z0Var4);
                    map = map2;
                    m2Var2 = m2Var4;
                    z0Var2 = z0Var4;
                    r15.a0(vVar2);
                } else {
                    iVar2 = iVar;
                    vVar2 = G17;
                    map = map2;
                    z0Var2 = z0Var4;
                    gVar2 = gVar;
                    m2Var2 = m2Var;
                }
                l.p1 p1Var2 = p1Var;
                h0Var = h0Var3;
                a8.d.a(p1Var2, oVar, (q6.c) vVar2, cVar, w.f9032h, o0.f.b(820763100, new n0(gVar2, z0Var2, m2Var2, 2), r15), r15, ((i8 >> 3) & 112) | 221184 | (i8 & 7168));
                Object a12 = p1Var2.f5610a.a();
                Object value3 = p1Var2.f5613d.getValue();
                boolean f17 = r15.f(p1Var2) | r15.f(iVar2) | r15.h(map);
                Object G18 = r15.G();
                if (f17 || G18 == obj) {
                    f4.x xVar = new f4.x(p1Var2, map, m2Var2, iVar2, (h6.d) null);
                    r15.a0(xVar);
                    G18 = xVar;
                }
                g0.d.f(a12, value3, (q6.e) G18, r15);
                pVar2 = pVar3;
            } else {
                h0Var = h0Var4;
                pVar2 = null;
            }
            r15.p(false);
            g0 b11 = h0Var.b("dialog");
            p pVar6 = b11 instanceof p ? (p) b11 : pVar2;
            if (pVar6 == null) {
                p1 r9 = r15.r();
                if (r9 != null) {
                    r9.f3853d = new x(b0Var, yVar, oVar, cVar, cVar2, cVar3, cVar4, cVar5, i7, 2);
                    return;
                }
                return;
            }
            t6.a.c(pVar6, r15, 0);
            pVar5 = r15;
        }
        p1 r10 = pVar5.r();
        if (r10 != null) {
            r10.f3853d = new x(b0Var, yVar, oVar, cVar, cVar2, cVar3, cVar4, cVar5, i7, 0);
        }
    }

    public static final boolean c(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void d(v7.a aVar, v7.c cVar, String str) {
        v7.d.f9172i.fine(cVar.f9166b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f9159a);
    }

    public static final boolean e(y0.d dVar, float f9, float f10) {
        float f11 = dVar.f9780a;
        if (f9 > dVar.f9782c || f11 > f9) {
            return false;
        }
        return f10 <= dVar.f9783d && dVar.f9781b <= f10;
    }

    public static Handler f(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return x2.d.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e9) {
            e = e9;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean g(String str, String str2) {
        r6.k.f(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i7 < str.length()) {
                    char charAt = str.charAt(i7);
                    int i10 = i9 + 1;
                    if (i9 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i8 - 1 == 0 && i9 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i8++;
                    }
                    i7++;
                    i9 = i10;
                } else if (i8 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return r6.k.a(z6.h.W(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final String h(long j8) {
        String str;
        if (j8 <= -999500000) {
            str = ((j8 - 500000000) / 1000000000) + " s ";
        } else if (j8 <= -999500) {
            str = ((j8 - 500000) / 1000000) + " ms";
        } else if (j8 <= 0) {
            str = ((j8 - 500) / 1000) + " µs";
        } else if (j8 < 999500) {
            str = ((j8 + 500) / 1000) + " µs";
        } else if (j8 < 999500000) {
            str = ((j8 + 500000) / 1000000) + " ms";
        } else {
            str = ((j8 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final boolean i(y0.e eVar) {
        long j8 = eVar.f9788e;
        long j9 = eVar.f9791h;
        long j10 = eVar.f9790g;
        long j11 = eVar.f9789f;
        float b9 = y0.a.b(j8);
        long j12 = eVar.f9788e;
        return b9 == y0.a.c(j12) && y0.a.b(j12) == y0.a.b(j11) && y0.a.b(j12) == y0.a.c(j11) && y0.a.b(j12) == y0.a.b(j10) && y0.a.b(j12) == y0.a.c(j10) && y0.a.b(j12) == y0.a.b(j9) && y0.a.b(j12) == y0.a.c(j9);
    }
}
