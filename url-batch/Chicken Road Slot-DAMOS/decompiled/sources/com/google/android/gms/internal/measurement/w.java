package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends AbstractMap {

    /* renamed from: t, reason: collision with root package name */
    public static final t f2903t = new t(1);

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f2904d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2905e;

    /* renamed from: i, reason: collision with root package name */
    public final v f2906i;

    /* renamed from: r, reason: collision with root package name */
    public Integer f2907r;

    /* renamed from: s, reason: collision with root package name */
    public String f2908s;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x016d, code lost:
    
        if (r8 < 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.w, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.measurement.w] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(w wVar, w wVar2) {
        int i3;
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.f2906i = new v(abstractMap, -1);
        abstractMap.f2907r = null;
        abstractMap.f2908s = null;
        int size = wVar2.size() + wVar.size();
        int i10 = wVar.f2905e[wVar.size()] + wVar2.f2905e[wVar2.size()];
        int i11 = size + 1;
        Object[] objArr2 = new Object[i10];
        int[] iArr = new int[i11];
        int i12 = 0;
        iArr[0] = size;
        Map.Entry c10 = wVar.c(0);
        Map.Entry c11 = wVar2.c(0);
        int i13 = 0;
        int i14 = 0;
        int i15 = size;
        int i16 = 0;
        while (true) {
            if (c10 == null && c11 == null) {
                break;
            }
            int i17 = i16 + 1;
            if (c10 != null) {
                if (c11 != null) {
                    int compareTo = ((String) c10.getKey()).compareTo((String) c11.getKey());
                    if (compareTo == 0) {
                        int i18 = i13 + 1;
                        int i19 = i14 + 1;
                        objArr2[i16] = new AbstractMap.SimpleImmutableEntry((String) c10.getKey(), new v(abstractMap, i16));
                        v vVar = (v) c10.getValue();
                        v vVar2 = (v) c11.getValue();
                        int i20 = 0;
                        int i21 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int c12 = vVar.c();
                            w wVar3 = vVar.f2859e;
                            if (i20 >= c12 - vVar.b() && i21 >= vVar2.c() - vVar2.b()) {
                                break;
                            }
                            int i22 = i20 == vVar.c() - vVar.b() ? 1 : i21 == vVar2.c() - vVar2.b() ? -1 : 0;
                            if (i22 == 0) {
                                t tVar = x.f2958b;
                                i3 = i20;
                                i22 = x.f2958b.compare(wVar3.f2904d[vVar.b() + i20], vVar2.f2859e.f2904d[vVar2.b() + i21]);
                            } else {
                                i3 = i20;
                            }
                            if (i22 < 0) {
                                i20 = i3 + 1;
                                obj = wVar3.f2904d[vVar.b() + i3];
                            } else {
                                int i23 = i21 + 1;
                                Object obj2 = vVar2.f2859e.f2904d[vVar2.b() + i21];
                                if (i22 == 0) {
                                    i21 = i23;
                                    obj = obj2;
                                    i20 = i3 + 1;
                                } else {
                                    i21 = i23;
                                    obj = obj2;
                                    i20 = i3;
                                }
                            }
                            objArr2[i15] = obj;
                            abstractMap = this;
                            i15++;
                        }
                        iArr[i17] = i15;
                        c10 = wVar.c(i19);
                        c11 = wVar2.c(i18);
                        i14 = i19;
                        i13 = i18;
                        i16 = i17;
                        i12 = 0;
                    }
                }
                i14++;
                i15 = a(c10, i16, i15, objArr2, iArr);
                c10 = wVar.c(i14);
                i16 = i17;
                i12 = 0;
                abstractMap = this;
            }
            Map.Entry entry = c10;
            i13++;
            int a9 = a(c11, i16, i15, objArr2, iArr);
            c11 = wVar2.c(i13);
            i15 = a9;
            c10 = entry;
            i16 = i17;
            i12 = 0;
            abstractMap = this;
        }
        int i24 = iArr[i12];
        int i25 = i24 - i16;
        if (i25 != 0) {
            for (int i26 = i12; i26 <= i16; i26++) {
                iArr[i26] = iArr[i26] - i25;
            }
            int i27 = iArr[i16];
            int i28 = i27 - i16;
            if (b(i10, i27)) {
                objArr = new Object[i27];
                System.arraycopy(objArr2, i12, objArr, i12, i16);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i24, objArr, i16, i28);
            objArr2 = objArr;
        }
        abstractMap.f2904d = objArr2;
        int i29 = iArr[i12] + 1;
        abstractMap.f2905e = b(i11, i29) ? Arrays.copyOf(iArr, i29) : iArr;
    }

    public static boolean b(int i3, int i10) {
        return i3 > 16 && i3 * 9 > i10 * 10;
    }

    public final int a(Map.Entry entry, int i3, int i10, Object[] objArr, int[] iArr) {
        v vVar = (v) entry.getValue();
        int c10 = vVar.c() - vVar.b();
        System.arraycopy(vVar.f2859e.f2904d, vVar.b(), objArr, i10, c10);
        objArr[i3] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new v(this, i3));
        int i11 = i10 + c10;
        iArr[i3 + 1] = i11;
        return i11;
    }

    public final Map.Entry c(int i3) {
        if (i3 < this.f2905e[0]) {
            return (Map.Entry) this.f2904d[i3];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f2906i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f2907r == null) {
            this.f2907r = Integer.valueOf(super.hashCode());
        }
        return this.f2907r.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f2908s == null) {
            this.f2908s = super.toString();
        }
        return this.f2908s;
    }

    public w() {
        List list = Collections.EMPTY_LIST;
        this.f2906i = new v(this, -1);
        this.f2907r = null;
        this.f2908s = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.f2904d = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.f2905e = iArr;
                return;
            }
            throw v4.a.i(it2);
        }
        throw v4.a.i(it);
    }
}
