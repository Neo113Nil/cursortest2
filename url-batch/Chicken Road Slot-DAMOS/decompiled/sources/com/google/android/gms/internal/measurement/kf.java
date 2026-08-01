package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class kf {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f2462a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f2463b = new WeakHashMap();

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Throwable th) {
        Throwable th2;
        h1 h1Var;
        Closeable closeable;
        int i3;
        WeakHashMap weakHashMap = f2463b;
        synchronized (weakHashMap) {
            th2 = th;
            while (th2 != null) {
                try {
                    if (weakHashMap.containsKey(th2)) {
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                } finally {
                }
            }
            weakHashMap.put(th, Boolean.valueOf(th2 != null));
        }
        if (th2 != null) {
            return;
        }
        WeakHashMap weakHashMap2 = f2462a;
        synchronized (weakHashMap2) {
            Throwable th3 = th;
            while (th3 != null) {
                try {
                    if (weakHashMap2.containsKey(th3)) {
                        break;
                    } else {
                        th3 = th3.getCause();
                    }
                } finally {
                }
            }
            if (th3 == null) {
                h1Var = null;
            } else {
                weakHashMap2.put(th, (gf) weakHashMap2.get(th3));
                h1Var = new h1(20);
            }
        }
        if (h1Var != null || (closeable = mf.c().f2149b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (closeable = mf.c().f2149b; closeable != null; closeable = ((ff) closeable).f2295d) {
            arrayList.add(closeable);
        }
        UUID uuid = ((ff) ((bg) arrayList.get(0))).f2296e;
        if (uuid == null) {
            a2.r.j("Null rootTraceId");
            return;
        }
        ((bg) arrayList.get(0)).getClass();
        int size = arrayList.size();
        b8.d dVar = b8.g.f1423e;
        c6.f.n(size, "expectedSize");
        c6.f.n(size, "initialCapacity");
        Object[] objArr = new Object[size];
        int size2 = arrayList.size();
        c6.f.n(size2, "expectedSize");
        c6.f.n(size2, "initialCapacity");
        Object[] objArr2 = new Object[size2];
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        for (bg bgVar : k7.e.N(arrayList)) {
            String str = ((ff) bgVar).f2298r;
            int i12 = i11 + 1;
            if (objArr2.length < i12) {
                objArr2 = Arrays.copyOf(objArr2, b8.a.b(objArr2.length, i12));
            } else {
                if (z11) {
                    objArr2 = (Object[]) objArr2.clone();
                }
                int i13 = i11 + 1;
                objArr2[i11] = str;
                wf c10 = bgVar.c();
                c10.getClass();
                i3 = i10 + 1;
                if (objArr.length >= i3) {
                    objArr = Arrays.copyOf(objArr, b8.a.b(objArr.length, i3));
                } else if (z10) {
                    objArr = (Object[]) objArr.clone();
                } else {
                    objArr[i10] = c10;
                    i10++;
                    i11 = i13;
                }
                z10 = false;
                objArr[i10] = c10;
                i10++;
                i11 = i13;
            }
            z11 = false;
            int i132 = i11 + 1;
            objArr2[i11] = str;
            wf c102 = bgVar.c();
            c102.getClass();
            i3 = i10 + 1;
            if (objArr.length >= i3) {
            }
            z10 = false;
            objArr[i10] = c102;
            i10++;
            i11 = i132;
        }
        WeakHashMap weakHashMap3 = f2462a;
        synchronized (weakHashMap3) {
            try {
                b8.s k10 = b8.g.k(i11, objArr2);
                if (k10 == null) {
                    throw new NullPointerException("Null spansNames");
                }
                b8.s k11 = b8.g.k(i10, objArr);
                if (k11 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new gf(k10, k11, uuid));
            } finally {
            }
        }
    }
}
