package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.vz1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class vz1 {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<a> f33830h = new Comparator() { // from class: com.yandex.mobile.ads.impl.Wj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int a4;
            a4 = vz1.a((vz1.a) obj, (vz1.a) obj2);
            return a4;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<a> f33831i = new Comparator() { // from class: com.yandex.mobile.ads.impl.Xj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int b4;
            b4 = vz1.b((vz1.a) obj, (vz1.a) obj2);
            return b4;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f33832a;

    /* renamed from: e, reason: collision with root package name */
    private int f33836e;

    /* renamed from: f, reason: collision with root package name */
    private int f33837f;

    /* renamed from: g, reason: collision with root package name */
    private int f33838g;

    /* renamed from: c, reason: collision with root package name */
    private final a[] f33834c = new a[5];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f33833b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private int f33835d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f33839a;

        /* renamed from: b, reason: collision with root package name */
        public int f33840b;

        /* renamed from: c, reason: collision with root package name */
        public float f33841c;

        private a() {
        }
    }

    public vz1(int i4) {
        this.f33832a = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(a aVar, a aVar2) {
        return Float.compare(aVar.f33841c, aVar2.f33841c);
    }

    public final void a(int i4, float f4) {
        a aVar;
        if (this.f33835d != 1) {
            Collections.sort(this.f33833b, f33830h);
            this.f33835d = 1;
        }
        int i5 = this.f33838g;
        if (i5 > 0) {
            a[] aVarArr = this.f33834c;
            int i6 = i5 - 1;
            this.f33838g = i6;
            aVar = aVarArr[i6];
        } else {
            aVar = new a();
        }
        int i7 = this.f33836e;
        this.f33836e = i7 + 1;
        aVar.f33839a = i7;
        aVar.f33840b = i4;
        aVar.f33841c = f4;
        this.f33833b.add(aVar);
        this.f33837f += i4;
        while (true) {
            int i8 = this.f33837f;
            int i9 = this.f33832a;
            if (i8 <= i9) {
                return;
            }
            int i10 = i8 - i9;
            a aVar2 = this.f33833b.get(0);
            int i11 = aVar2.f33840b;
            if (i11 <= i10) {
                this.f33837f -= i11;
                this.f33833b.remove(0);
                int i12 = this.f33838g;
                if (i12 < 5) {
                    a[] aVarArr2 = this.f33834c;
                    this.f33838g = i12 + 1;
                    aVarArr2[i12] = aVar2;
                }
            } else {
                aVar2.f33840b = i11 - i10;
                this.f33837f -= i10;
            }
        }
    }

    public final void b() {
        this.f33833b.clear();
        this.f33835d = -1;
        this.f33836e = 0;
        this.f33837f = 0;
    }

    public final float a() {
        if (this.f33835d != 0) {
            Collections.sort(this.f33833b, f33831i);
            this.f33835d = 0;
        }
        float f4 = 0.5f * this.f33837f;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f33833b.size(); i5++) {
            a aVar = this.f33833b.get(i5);
            i4 += aVar.f33840b;
            if (i4 >= f4) {
                return aVar.f33841c;
            }
        }
        if (this.f33833b.isEmpty()) {
            return Float.NaN;
        }
        return this.f33833b.get(r0.size() - 1).f33841c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(a aVar, a aVar2) {
        return aVar.f33839a - aVar2.f33839a;
    }
}
