package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
final class vj2 implements c32 {

    /* renamed from: b, reason: collision with root package name */
    private final List<rj2> f33658b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f33659c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f33660d;

    public vj2(ArrayList arrayList) {
        this.f33658b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f33659c = new long[arrayList.size() * 2];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            rj2 rj2Var = (rj2) arrayList.get(i4);
            int i5 = i4 * 2;
            long[] jArr = this.f33659c;
            jArr[i5] = rj2Var.f31250b;
            jArr[i5 + 1] = rj2Var.f31251c;
        }
        long[] jArr2 = this.f33659c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f33660d = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final long a(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f33660d;
        if (i4 < jArr.length) {
            return jArr[i4];
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final List<uu> b(long j4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < this.f33658b.size(); i4++) {
            long[] jArr = this.f33659c;
            int i5 = i4 * 2;
            if (jArr[i5] <= j4 && j4 < jArr[i5 + 1]) {
                rj2 rj2Var = this.f33658b.get(i4);
                uu uuVar = rj2Var.f31249a;
                if (uuVar.f33252f == -3.4028235E38f) {
                    arrayList2.add(rj2Var);
                } else {
                    arrayList.add(uuVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.yandex.mobile.ads.impl.Rh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a4;
                a4 = vj2.a((rj2) obj, (rj2) obj2);
                return a4;
            }
        });
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            arrayList.add(((rj2) arrayList2.get(i6)).f31249a.a().a(1, (-1) - i6).a());
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a() {
        return this.f33660d.length;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a(long j4) {
        int a4 = u82.a(this.f33660d, j4, false);
        if (a4 < this.f33660d.length) {
            return a4;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(rj2 rj2Var, rj2 rj2Var2) {
        return Long.compare(rj2Var.f31250b, rj2Var2.f31250b);
    }
}
