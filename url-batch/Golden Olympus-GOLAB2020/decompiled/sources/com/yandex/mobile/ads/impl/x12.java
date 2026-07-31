package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class x12 implements c32 {

    /* renamed from: b, reason: collision with root package name */
    private final List<List<uu>> f34363b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Long> f34364c;

    public x12(ArrayList arrayList, ArrayList arrayList2) {
        this.f34363b = arrayList;
        this.f34364c = arrayList2;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final long a(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (i4 < this.f34364c.size()) {
            return this.f34364c.get(i4).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final List<uu> b(long j4) {
        int a4 = u82.a((List) this.f34364c, Long.valueOf(j4), false);
        return a4 == -1 ? Collections.EMPTY_LIST : this.f34363b.get(a4);
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a() {
        return this.f34364c.size();
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final int a(long j4) {
        int i4;
        List<Long> list = this.f34364c;
        Long valueOf = Long.valueOf(j4);
        int i5 = u82.f32873a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i4 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i4 = binarySearch;
        }
        if (i4 < this.f34364c.size()) {
            return i4;
        }
        return -1;
    }
}
