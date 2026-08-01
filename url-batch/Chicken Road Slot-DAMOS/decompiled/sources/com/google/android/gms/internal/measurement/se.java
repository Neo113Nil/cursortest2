package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.se;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class se implements l8.c, m2.o, m6.b {

    /* renamed from: d, reason: collision with root package name */
    public final Object f2798d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2799e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2800i;

    /* renamed from: r, reason: collision with root package name */
    public Object f2801r;

    /* renamed from: s, reason: collision with root package name */
    public Object f2802s;

    public se(m2.e eVar, m2.h0 h0Var, List list, x2.c cVar, p2.h hVar) {
        int i3;
        List list2;
        ArrayList arrayList;
        int i10;
        m2.e eVar2 = eVar;
        m2.h0 h0Var2 = h0Var;
        this.f2798d = eVar2;
        this.f2799e = list;
        hd.i iVar = hd.i.f4508e;
        final int i11 = 0;
        this.f2800i = hd.h.a(iVar, new Function0(this) { // from class: m2.l

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ se f6491e;

            {
                this.f6491e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f6491e.f2802s;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float a9 = ((n) obj3).f6498a.a();
                            int i12 = 1;
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i12);
                                    float a10 = ((n) obj4).f6498a.a();
                                    if (Float.compare(a9, a10) < 0) {
                                        obj3 = obj4;
                                        a9 = a10;
                                    }
                                    if (i12 != size) {
                                        i12++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        n nVar = (n) obj;
                        return Float.valueOf(nVar != null ? nVar.f6498a.a() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f6491e.f2802s;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float c10 = ((n) obj5).f6498a.f9234w.c();
                            int i13 = 1;
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i13);
                                    float c11 = ((n) obj6).f6498a.f9234w.c();
                                    if (Float.compare(c10, c11) < 0) {
                                        obj5 = obj6;
                                        c10 = c11;
                                    }
                                    if (i13 != size2) {
                                        i13++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        n nVar2 = (n) obj2;
                        return Float.valueOf(nVar2 != null ? nVar2.f6498a.f9234w.c() : 0.0f);
                }
            }
        });
        final int i12 = 1;
        this.f2801r = hd.h.a(iVar, new Function0(this) { // from class: m2.l

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ se f6491e;

            {
                this.f6491e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f6491e.f2802s;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float a9 = ((n) obj3).f6498a.a();
                            int i122 = 1;
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i122);
                                    float a10 = ((n) obj4).f6498a.a();
                                    if (Float.compare(a9, a10) < 0) {
                                        obj3 = obj4;
                                        a9 = a10;
                                    }
                                    if (i122 != size) {
                                        i122++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        n nVar = (n) obj;
                        return Float.valueOf(nVar != null ? nVar.f6498a.a() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f6491e.f2802s;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float c10 = ((n) obj5).f6498a.f9234w.c();
                            int i13 = 1;
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i13);
                                    float c11 = ((n) obj6).f6498a.f9234w.c();
                                    if (Float.compare(c10, c11) < 0) {
                                        obj5 = obj6;
                                        c10 = c11;
                                    }
                                    if (i13 != size2) {
                                        i13++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        n nVar2 = (n) obj2;
                        return Float.valueOf(nVar2 != null ? nVar2.f6498a.f9234w.c() : 0.0f);
                }
            }
        });
        m2.p pVar = h0Var2.f6482b;
        int i13 = m2.f.f6463a;
        ArrayList arrayList2 = eVar2.f6456r;
        String str = eVar2.f6454e;
        List list3 = (arrayList2 == null || (list3 = CollectionsKt.L(arrayList2, new m2.d(1))) == null) ? kotlin.collections.j0.f5574d : list3;
        ArrayList arrayList3 = new ArrayList();
        kotlin.collections.s sVar = new kotlin.collections.s();
        int size = list3.size();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            m2.c cVar2 = (m2.c) list3.get(i14);
            m2.p a9 = pVar.a((m2.p) cVar2.f6439a);
            int i16 = cVar2.f6440b;
            int i17 = cVar2.f6441c;
            if (i16 > i17) {
                r2.a.a("Reversed range is not supported");
            }
            while (i15 < i16 && !sVar.isEmpty()) {
                m2.c cVar3 = (m2.c) sVar.last();
                int i18 = cVar3.f6441c;
                List list4 = list3;
                Object obj = cVar3.f6439a;
                if (i16 < i18) {
                    arrayList3.add(new m2.c(i15, i16, obj));
                    i15 = i16;
                    list3 = list4;
                } else {
                    int i19 = size;
                    arrayList3.add(new m2.c(i15, i18, obj));
                    i15 = cVar3.f6441c;
                    while (!sVar.isEmpty() && i15 == ((m2.c) sVar.last()).f6441c) {
                        sVar.removeLast();
                    }
                    list3 = list4;
                    size = i19;
                }
            }
            List list5 = list3;
            int i20 = size;
            if (i15 < i16) {
                arrayList3.add(new m2.c(i15, i16, pVar));
                i15 = i16;
            }
            m2.c cVar4 = (m2.c) sVar.i();
            if (cVar4 != null) {
                int i21 = cVar4.f6441c;
                Object obj2 = cVar4.f6439a;
                int i22 = cVar4.f6440b;
                if (i22 == i16 && i21 == i17) {
                    sVar.removeLast();
                    sVar.addLast(new m2.c(i16, i17, ((m2.p) obj2).a(a9)));
                } else if (i22 == i21) {
                    arrayList3.add(new m2.c(i22, i21, obj2));
                    sVar.removeLast();
                    sVar.addLast(new m2.c(i16, i17, a9));
                } else {
                    if (i21 < i17) {
                        throw new IllegalArgumentException();
                    }
                    sVar.addLast(new m2.c(i16, i17, ((m2.p) obj2).a(a9)));
                }
            } else {
                sVar.addLast(new m2.c(i16, i17, a9));
            }
            i14++;
            list3 = list5;
            size = i20;
        }
        while (i15 <= str.length() && !sVar.isEmpty()) {
            m2.c cVar5 = (m2.c) sVar.last();
            Object obj3 = cVar5.f6439a;
            int i23 = cVar5.f6441c;
            arrayList3.add(new m2.c(i15, i23, obj3));
            while (!sVar.isEmpty() && i23 == ((m2.c) sVar.last()).f6441c) {
                sVar.removeLast();
            }
            i15 = i23;
        }
        if (i15 < str.length()) {
            arrayList3.add(new m2.c(i15, str.length(), pVar));
        }
        if (arrayList3.isEmpty()) {
            i3 = 0;
            arrayList3.add(new m2.c(0, 0, pVar));
        } else {
            i3 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i24 = i3;
        while (i24 < size2) {
            m2.c cVar6 = (m2.c) arrayList3.get(i24);
            int i25 = cVar6.f6440b;
            int i26 = cVar6.f6441c;
            String substring = i25 != i26 ? str.substring(i25, i26) : "";
            ArrayList arrayList5 = null;
            if (i25 == i26 || (list2 = eVar2.f6453d) == null) {
                arrayList = arrayList3;
            } else if (i25 != 0 || i26 < str.length()) {
                arrayList = arrayList3;
                arrayList5 = new ArrayList(list2.size());
                int size3 = list2.size();
                int i27 = 0;
                while (i27 < size3) {
                    int i28 = size3;
                    m2.c cVar7 = (m2.c) list2.get(i27);
                    List list6 = list2;
                    Object obj4 = cVar7.f6439a;
                    int i29 = cVar7.f6441c;
                    int i30 = i27;
                    int i31 = cVar7.f6440b;
                    String str2 = str;
                    if ((((m2.b) obj4) instanceof m2.p) || !m2.f.a(i25, i26, i31, i29)) {
                        i10 = size2;
                    } else {
                        i10 = size2;
                        arrayList5.add(new m2.c(be.f.c(i31, i25, i26) - i25, be.f.c(i29, i25, i26) - i25, (m2.b) cVar7.f6439a, cVar7.f6442d));
                    }
                    i27 = i30 + 1;
                    list2 = list6;
                    size3 = i28;
                    str = str2;
                    size2 = i10;
                }
            } else {
                arrayList5 = new ArrayList(list2.size());
                int size4 = list2.size();
                arrayList = arrayList3;
                int i32 = 0;
                while (i32 < size4) {
                    int i33 = size4;
                    Object obj5 = list2.get(i32);
                    int i34 = i32;
                    if (!(((m2.b) ((m2.c) obj5).f6439a) instanceof m2.p)) {
                        arrayList5.add(obj5);
                    }
                    i32 = i34 + 1;
                    size4 = i33;
                }
            }
            String str3 = str;
            int i35 = size2;
            m2.e eVar3 = new m2.e(substring, arrayList5 == null ? kotlin.collections.j0.f5574d : arrayList5);
            m2.p pVar2 = (m2.p) cVar6.f6439a;
            m2.h0 h0Var3 = new m2.h0(h0Var2.f6481a, pVar.a(pVar2.f6502b == 0 ? new m2.p(pVar2.f6501a, pVar.f6502b, pVar2.f6503c, pVar2.f6504d, pVar2.f6505e, pVar2.f6506f, pVar2.g, pVar2.f6507h, pVar2.f6508i) : pVar2));
            List list7 = eVar3.f6453d;
            List list8 = list7 == null ? kotlin.collections.j0.f5574d : list7;
            List list9 = (List) this.f2799e;
            ArrayList arrayList6 = new ArrayList(list9.size());
            int size5 = list9.size();
            int i36 = 0;
            while (i36 < size5) {
                m2.c cVar8 = (m2.c) list9.get(i36);
                int i37 = cVar8.f6440b;
                List list10 = list9;
                int i38 = cVar8.f6441c;
                if (m2.f.a(i25, i26, i37, i38)) {
                    if (i25 > i37 || i38 > i26) {
                        r2.a.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList6.add(new m2.c(i37 - i25, i38 - i25, cVar8.f6439a));
                }
                i36++;
                list9 = list10;
            }
            arrayList4.add(new m2.n(new t2.c(substring, h0Var3, list8, arrayList6, hVar, cVar), i25, i26));
            i24++;
            eVar2 = eVar;
            h0Var2 = h0Var;
            arrayList3 = arrayList;
            str = str3;
            size2 = i35;
        }
        this.f2802s = arrayList4;
    }

    public static se k(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        se seVar = new se(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) seVar.f2801r)) {
            try {
                ((ArrayDeque) seVar.f2801r).clear();
                String string = ((SharedPreferences) seVar.f2798d).getString((String) seVar.f2799e, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) seVar.f2800i)) {
                    String[] split = string.split((String) seVar.f2800i, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) seVar.f2801r).add(str);
                        }
                    }
                    return seVar;
                }
                return seVar;
            } finally {
            }
        }
    }

    @Override // l8.c
    public Object a(Class cls) {
        if (!((Set) this.f2798d).contains(l8.r.a(cls))) {
            kotlin.collections.i0.f(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object a9 = ((l8.c) this.f2802s).a(cls);
        if (!cls.equals(t8.b.class)) {
            return a9;
        }
        return new l8.s();
    }

    @Override // m2.o
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.f2802s;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((m2.n) arrayList.get(i3)).f6498a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // l8.c
    public w8.a c(l8.r rVar) {
        if (((Set) this.f2799e).contains(rVar)) {
            return ((l8.c) this.f2802s).c(rVar);
        }
        kotlin.collections.i0.f(rVar, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // l8.c
    public Object d(l8.r rVar) {
        if (((Set) this.f2798d).contains(rVar)) {
            return ((l8.c) this.f2802s).d(rVar);
        }
        kotlin.collections.i0.f(rVar, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override // l8.c
    public Set e(l8.r rVar) {
        if (((Set) this.f2800i).contains(rVar)) {
            return ((l8.c) this.f2802s).e(rVar);
        }
        kotlin.collections.i0.f(rVar, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // l8.c
    public w8.a f(Class cls) {
        return c(l8.r.a(cls));
    }

    @Override // l8.c
    public w8.a g(l8.r rVar) {
        if (((Set) this.f2801r).contains(rVar)) {
            return ((l8.c) this.f2802s).g(rVar);
        }
        kotlin.collections.i0.f(rVar, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    @Override // gd.a
    public Object get() {
        return new p6.b((Executor) ((gd.a) this.f2798d).get(), (l6.d) ((gd.a) this.f2799e).get(), (p.e) ((p.e) this.f2800i).get(), (r6.g) ((gd.a) this.f2801r).get(), (r6.g) ((gd.a) this.f2802s).get());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hd.g, java.lang.Object] */
    @Override // m2.o
    public float h() {
        return ((Number) this.f2801r.getValue()).floatValue();
    }

    public n0.f i(x0.b bVar, Function0 function0) {
        int i3;
        int i10;
        int i11;
        wd.a0 a0Var = new wd.a0();
        a0Var.f10139d = -1;
        synchronized (this.f2798d) {
            Throwable th = (Throwable) this.f2799e;
            if (th != null) {
                bVar.b(th);
                return n0.e.f6658e;
            }
            x0.a aVar = (x0.a) this.f2800i;
            do {
                i3 = aVar.get();
                i10 = i3 + 1;
            } while (!aVar.compareAndSet(i3, i10));
            boolean z10 = (134217727 & i10) == 1;
            a0Var.f10139d = (i10 >>> 27) & 15;
            ((s.d0) this.f2801r).a(bVar);
            if (z10 && function0 != null) {
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    synchronized (this.f2798d) {
                        try {
                            if (((Throwable) this.f2799e) == null) {
                                this.f2799e = th2;
                                s.d0 d0Var = (s.d0) this.f2801r;
                                Object[] objArr = d0Var.f8284a;
                                int i12 = d0Var.f8285b;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    ((x0.b) objArr[i13]).b(th2);
                                }
                                ((s.d0) this.f2801r).d();
                                x0.a aVar2 = (x0.a) this.f2800i;
                                do {
                                    i11 = aVar2.get();
                                } while (!aVar2.compareAndSet(i11, ((((i11 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            n0.e0 e0Var = new n0.e0(bVar, this, a0Var, 2);
            c6.s sVar = new c6.s();
            sVar.f1868d = e0Var;
            sVar.f1869e = new x0.a(0);
            return sVar;
        }
    }

    public void j() {
        ((u8.d) this.f2798d).getClass();
        df.a.f3732s.compareTo(df.a.f3728d);
        ee.o.f3988a.getClass();
        ee.m.f3986a.getClass();
        long nanoTime = System.nanoTime() - ee.m.f3987b;
        a1.n nVar = (a1.n) this.f2801r;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) nVar.f42r;
        int i3 = 0;
        cf.d[] dVarArr = (cf.d[]) concurrentHashMap.values().toArray(new cf.d[0]);
        ArrayList d10 = kotlin.collections.y.d(Arrays.copyOf(dVarArr, dVarArr.length));
        concurrentHashMap.clear();
        se seVar = (se) nVar.f41i;
        com.google.firebase.messaging.v vVar = new com.google.firebase.messaging.v((u8.d) seVar.f2798d, ((jf.b) seVar.f2800i).f5258d, wd.c0.a(cf.c.class), null);
        int size = d10.size();
        while (i3 < size) {
            Object obj = d10.get(i3);
            i3++;
            ((cf.d) obj).b(vVar);
        }
        long a9 = ee.n.a(nanoTime);
        ee.a aVar = ee.b.f3956e;
        ee.b.f(a9, ee.d.MICROSECONDS);
        df.a.f3732s.compareTo(df.a.f3728d);
    }

    public void l(Function1 function1) {
        int i3;
        synchronized (this.f2798d) {
            try {
                s.d0 d0Var = (s.d0) this.f2801r;
                this.f2801r = (s.d0) this.f2802s;
                this.f2802s = d0Var;
                x0.a aVar = (x0.a) this.f2800i;
                do {
                    i3 = aVar.get();
                } while (!aVar.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                int i10 = d0Var.f8285b;
                for (int i11 = 0; i11 < i10; i11++) {
                    function1.invoke(d0Var.f(i11));
                }
                d0Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float m(int i3, boolean z10) {
        Layout layout = (Layout) this.f2798d;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i3));
        if (i3 > lineEnd) {
            i3 = lineEnd;
        }
        return z10 ? layout.getPrimaryHorizontal(i3) : layout.getSecondaryHorizontal(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x003b, code lost:
    
        if (r31 != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float n(int i3, boolean z10, boolean z11) {
        int lineForOffset;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z12;
        Bidi bidi;
        boolean z13;
        int i14 = i3;
        ArrayList arrayList = (ArrayList) this.f2799e;
        Layout layout = (Layout) this.f2798d;
        if (!z11) {
            return m(i3, z10);
        }
        if (i14 <= 0) {
            lineForOffset = 0;
        } else {
            if (i14 >= layout.getText().length()) {
                lineForOffset = layout.getLineCount();
            } else {
                lineForOffset = layout.getLineForOffset(i14);
                int lineStart = layout.getLineStart(lineForOffset);
                int lineEnd = layout.getLineEnd(lineForOffset);
                if (lineStart == i14 || lineEnd == i14) {
                    if (lineStart != i14) {
                        if (!z11) {
                            lineForOffset++;
                        }
                    }
                }
            }
            lineForOffset--;
        }
        int lineStart2 = layout.getLineStart(lineForOffset);
        int lineEnd2 = layout.getLineEnd(lineForOffset);
        if (i14 != lineStart2 && i14 != lineEnd2) {
            return m(i3, z10);
        }
        if (i14 == 0 || i14 == layout.getText().length()) {
            return m(i3, z10);
        }
        Integer valueOf = Integer.valueOf(i14);
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size < 0) {
            te.a1.e(n0.l.f(size, "fromIndex (0) is greater than toIndex (", ")."));
            return 0.0f;
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i15 = size - 1;
        int i16 = 0;
        while (true) {
            if (i16 > i15) {
                i10 = -(i16 + 1);
                break;
            }
            i10 = (i16 + i15) >>> 1;
            int a9 = jd.a.a((Comparable) arrayList.get(i10), valueOf);
            if (a9 >= 0) {
                if (a9 <= 0) {
                    break;
                }
                i15 = i10 - 1;
            } else {
                i16 = i10 + 1;
            }
        }
        int i17 = i10 < 0 ? -(i10 + 1) : i10 + 1;
        if (z11 && i17 > 0) {
            int i18 = i17 - 1;
            if (i14 == ((Number) arrayList.get(i18)).intValue()) {
                i17 = i18;
            }
        }
        boolean z14 = layout.getParagraphDirection(layout.getLineForOffset(i17 == 0 ? 0 : ((Number) arrayList.get(i17 + (-1))).intValue())) == -1;
        int p4 = p(lineEnd2, lineStart2);
        int intValue = i17 == 0 ? 0 : ((Number) arrayList.get(i17 - 1)).intValue();
        int i19 = lineStart2 - intValue;
        int i20 = p4 - intValue;
        ArrayList arrayList2 = (ArrayList) this.f2800i;
        boolean[] zArr = (boolean[]) this.f2801r;
        if (zArr[i17]) {
            bidi = (Bidi) arrayList2.get(i17);
            i12 = lineForOffset;
            i11 = p4;
            i13 = -1;
        } else {
            int intValue2 = i17 == 0 ? 0 : ((Number) arrayList.get(i17 - 1)).intValue();
            int intValue3 = ((Number) arrayList.get(i17)).intValue();
            int i21 = intValue3 - intValue2;
            char[] cArr = (char[]) this.f2802s;
            i11 = p4;
            if (cArr == null || cArr.length < i21) {
                cArr = new char[i21];
            }
            i12 = lineForOffset;
            TextUtils.getChars(layout.getText(), intValue2, intValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i21)) {
                i13 = -1;
                Bidi bidi2 = new Bidi(cArr, 0, null, 0, i21, layout.getParagraphDirection(layout.getLineForOffset(i17 == 0 ? 0 : ((Number) arrayList.get(i17 + (-1))).intValue())) == -1 ? 1 : 0);
                z12 = true;
                if (bidi2.getRunCount() != 1) {
                    bidi = bidi2;
                    arrayList2.set(i17, bidi);
                    zArr[i17] = z12;
                    if (bidi != null) {
                        char[] cArr2 = (char[]) this.f2802s;
                        cArr = cArr == cArr2 ? null : cArr2;
                    }
                    this.f2802s = cArr;
                }
            } else {
                i13 = -1;
                z12 = true;
            }
            bidi = null;
            arrayList2.set(i17, bidi);
            zArr[i17] = z12;
            if (bidi != null) {
            }
            this.f2802s = cArr;
        }
        Bidi createLineBidi = bidi != null ? bidi.createLineBidi(i19, i20) : null;
        if (createLineBidi == null) {
            z13 = true;
        } else {
            if (createLineBidi.getRunCount() != 1) {
                int runCount = createLineBidi.getRunCount();
                n2.c[] cVarArr = new n2.c[runCount];
                for (int i22 = 0; i22 < runCount; i22++) {
                    cVarArr[i22] = new n2.c(createLineBidi.getRunStart(i22) + lineStart2, createLineBidi.getRunLimit(i22) + lineStart2, createLineBidi.getRunLevel(i22) % 2 == 1);
                }
                int runCount2 = createLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i23 = 0; i23 < runCount2; i23++) {
                    bArr[i23] = (byte) createLineBidi.getRunLevel(i23);
                }
                Bidi.reorderVisually(bArr, 0, cVarArr, 0, runCount);
                if (i14 == lineStart2) {
                    int i24 = 0;
                    while (true) {
                        if (i24 >= runCount) {
                            i24 = i13;
                            break;
                        }
                        if (cVarArr[i24].f6993a == i14) {
                            break;
                        }
                        i24++;
                    }
                    boolean z15 = (z10 || z14 == cVarArr[i24].f6995c) ? !z14 : z14;
                    if (i24 == 0 && z15) {
                        return layout.getLineLeft(i12);
                    }
                    return (i24 != runCount + (-1) || z15) ? z15 ? layout.getPrimaryHorizontal(cVarArr[i24 - 1].f6993a) : layout.getPrimaryHorizontal(cVarArr[i24 + 1].f6993a) : layout.getLineRight(i12);
                }
                int i25 = i12;
                if (i14 > i11) {
                    i14 = p(i14, lineStart2);
                }
                int i26 = 0;
                while (true) {
                    if (i26 >= runCount) {
                        i26 = i13;
                        break;
                    }
                    if (cVarArr[i26].f6994b == i14) {
                        break;
                    }
                    i26++;
                }
                boolean z16 = (z10 || z14 == cVarArr[i26].f6995c) ? z14 : !z14;
                return (i26 == 0 && z16) ? layout.getLineLeft(i25) : (i26 != runCount + (-1) || z16) ? z16 ? layout.getPrimaryHorizontal(cVarArr[i26 - 1].f6994b) : layout.getPrimaryHorizontal(cVarArr[i26 + 1].f6994b) : layout.getLineRight(i25);
            }
            z13 = true;
        }
        int i27 = i12;
        boolean isRtlCharAt = layout.isRtlCharAt(lineStart2);
        if (z10 || z14 == isRtlCharAt) {
            z14 = !z14 ? z13 : false;
        }
        if (i14 == lineStart2) {
            z13 = z14;
        } else if (z14) {
            z13 = false;
        }
        return z13 ? layout.getLineLeft(i27) : layout.getLineRight(i27);
    }

    public boolean o() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        g8.g gVar = (g8.g) this.f2799e;
        gVar.a();
        Context context = gVar.f4300a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public int p(int i3, int i10) {
        while (i3 > i10) {
            char charAt = ((Layout) this.f2798d).getText().charAt(i3 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Intrinsics.b(charAt, 8192) < 0 || Intrinsics.b(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i3;
            }
            i3--;
        }
        return i3;
    }

    public void q(List list, boolean z10) {
        Object obj;
        list.getClass();
        LinkedHashSet<ef.a> linkedHashSet = new LinkedHashSet();
        kotlin.collections.s sVar = new kotlin.collections.s(new kotlin.collections.t0(list));
        while (!sVar.isEmpty()) {
            ef.a aVar = (ef.a) sVar.removeLast();
            if (linkedHashSet.add(aVar)) {
                ArrayList arrayList = aVar.f3995e;
                arrayList.getClass();
                Iterator it = new kotlin.collections.s0(arrayList).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((b1.i0) it).f988e;
                    if (listIterator.hasPrevious()) {
                        ef.a aVar2 = (ef.a) listIterator.previous();
                        if (!linkedHashSet.contains(aVar2)) {
                            sVar.addLast(aVar2);
                        }
                    }
                }
            }
        }
        a1.n nVar = (a1.n) this.f2801r;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) nVar.f42r;
        for (ef.a aVar3 : linkedHashSet) {
            for (Map.Entry entry : aVar3.f3993c.entrySet()) {
                String str = (String) entry.getKey();
                cf.b bVar = (cf.b) entry.getValue();
                af.a aVar4 = bVar.f2037a;
                u8.d dVar = (u8.d) ((se) nVar.f41i).f2798d;
                str.getClass();
                af.a aVar5 = bVar.f2037a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) nVar.f40e;
                if (((cf.b) concurrentHashMap2.get(str)) != null) {
                    if (!z10) {
                        throw new b1.j("Already existing definition for " + aVar5 + " at " + str, 1);
                    }
                    aVar5.toString();
                    dVar.getClass();
                    df.a.f3732s.compareTo(df.a.f3730i);
                    Iterator it2 = concurrentHashMap.values().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((cf.d) obj).f2037a.equals(aVar5)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (((cf.d) obj) != null) {
                        concurrentHashMap.remove(Integer.valueOf(aVar5.hashCode()));
                    }
                }
                aVar5.toString();
                dVar.getClass();
                df.a.f3732s.compareTo(df.a.f3728d);
                concurrentHashMap2.put(str, bVar);
            }
            for (cf.d dVar2 : aVar3.f3992b) {
                concurrentHashMap.put(Integer.valueOf(dVar2.f2037a.hashCode()), dVar2);
            }
        }
        jf.b bVar2 = (jf.b) this.f2800i;
        bVar2.getClass();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            bVar2.f5256b.addAll(((ef.a) it3.next()).f3994d);
        }
    }

    public void r(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.f2798d).put(str, obj);
        je.l0 l0Var = (je.l0) ((LinkedHashMap) this.f2800i).get(str);
        if (l0Var != null) {
            l0Var.j(obj);
        }
        je.l0 l0Var2 = (je.l0) ((LinkedHashMap) this.f2801r).get(str);
        if (l0Var2 != null) {
            l0Var2.j(obj);
        }
    }

    public se(f8.u0 u0Var, zd zdVar, HashMap hashMap) {
        this.f2798d = new ConcurrentHashMap();
        u0Var.getClass();
        this.f2799e = u0Var;
        zdVar.getClass();
        this.f2800i = zdVar;
        this.f2802s = hashMap;
        i7.a.t(!hashMap.isEmpty());
        this.f2801r = ib.f2403c;
    }

    public se(Map map) {
        map.getClass();
        this.f2798d = new LinkedHashMap(map);
        this.f2799e = new LinkedHashMap();
        this.f2800i = new LinkedHashMap();
        this.f2801r = new LinkedHashMap();
        this.f2802s = new d.f(2, this);
    }

    public se(kotlin.collections.k0 k0Var, kotlin.collections.k0 k0Var2, kotlin.collections.k0 k0Var3, kotlin.collections.k0 k0Var4, kotlin.collections.k0 k0Var5) {
        k0Var.getClass();
        k0Var2.getClass();
        k0Var3.getClass();
        k0Var4.getClass();
        k0Var5.getClass();
        this.f2798d = k0Var;
        this.f2799e = k0Var2;
        this.f2800i = k0Var3;
        this.f2801r = k0Var4;
        this.f2802s = k0Var5;
    }

    public se(gd.a aVar, gd.a aVar2, p.e eVar, gd.a aVar3, gd.a aVar4) {
        this.f2798d = aVar;
        this.f2799e = aVar2;
        this.f2800i = eVar;
        this.f2801r = aVar3;
        this.f2802s = aVar4;
    }

    public se(int i3) {
        switch (i3) {
            case 10:
                df.a aVar = df.a.f3728d;
                this.f2798d = new u8.d(19);
                this.f2799e = new c6.e(this);
                this.f2800i = new jf.b(this);
                this.f2801r = new a1.n(this);
                new ConcurrentHashMap();
                new HashMap();
                this.f2802s = new jf.a(0);
                break;
            default:
                this.f2798d = new Object();
                this.f2800i = new x0.a(0);
                this.f2801r = new s.d0();
                this.f2802s = new s.d0();
                break;
        }
    }

    public se(Layout layout) {
        this.f2798d = layout;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        do {
            int q3 = StringsKt.q(((Layout) this.f2798d).getText(), '\n', i3, 4);
            i3 = q3 < 0 ? ((Layout) this.f2798d).getText().length() : q3 + 1;
            arrayList.add(Integer.valueOf(i3));
        } while (i3 < ((Layout) this.f2798d).getText().length());
        this.f2799e = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f2800i = arrayList2;
        this.f2801r = new boolean[((ArrayList) this.f2799e).size()];
        ((ArrayList) this.f2799e).size();
    }

    public se(l8.b bVar, l8.c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<l8.j> set = bVar.f5900c;
        Set set2 = bVar.g;
        for (l8.j jVar : set) {
            int i3 = jVar.f5922c;
            int i10 = jVar.f5921b;
            boolean z10 = i3 == 0;
            l8.r rVar = jVar.f5920a;
            if (z10) {
                if (i10 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i3 == 2) {
                hashSet3.add(rVar);
            } else if (i10 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(l8.r.a(t8.b.class));
        }
        this.f2798d = Collections.unmodifiableSet(hashSet);
        this.f2799e = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f2800i = Collections.unmodifiableSet(hashSet4);
        this.f2801r = Collections.unmodifiableSet(hashSet5);
        this.f2802s = cVar;
    }

    public se(Context context, g8.g gVar, x8.d dVar, ra raVar, b1.m mVar) {
        this.f2798d = new n7.e(context, n7.e.f7174k, a7.b.f312a, a7.i.f325c);
        this.f2799e = gVar;
        this.f2800i = dVar;
        this.f2801r = raVar;
        this.f2802s = mVar;
    }

    public se(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f2801r = new ArrayDeque();
        this.f2798d = sharedPreferences;
        this.f2799e = "topic_operation_queue";
        this.f2800i = ",";
        this.f2802s = scheduledThreadPoolExecutor;
    }
}
