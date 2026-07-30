package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.ads.redexgen.X.ls, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1655ls<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ C1658lv A03;

    @ParametricNullness
    public abstract T A03(int entry);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ls != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    public AbstractC1655ls(final C1658lv this$0) {
        int i;
        this.A03 = this$0;
        i = this.A03.A03;
        this.A01 = i;
        this.A00 = this.A03.A0a();
        this.A02 = -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ls != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    public /* synthetic */ AbstractC1655ls(C1658lv c1658lv, B9 b9) {
        this(c1658lv);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ls != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    private void A01() {
        int i;
        i = this.A03.A03;
        if (i == this.A01) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ls != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    private final void A02() {
        this.A01 += 32;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ls != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ls != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        A01();
        if (hasNext()) {
            this.A02 = this.A00;
            T A03 = A03(this.A00);
            this.A00 = this.A03.A0b(this.A00);
            return A03;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ls != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    public final void remove() {
        Object A0E;
        A01();
        AbstractC1648ll.A04(this.A02 >= 0);
        A02();
        C1658lv c1658lv = this.A03;
        A0E = this.A03.A0E(this.A02);
        c1658lv.remove(A0E);
        this.A00 = this.A03.A0c(this.A00, this.A02);
        this.A02 = -1;
    }
}
