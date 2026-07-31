package kotlin.collections;

import i2.InterfaceC2474d;
import java.util.AbstractList;
import java.util.List;

/* renamed from: kotlin.collections.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3215e extends AbstractList implements List, InterfaceC2474d {
    protected AbstractC3215e() {
    }

    public abstract int d();

    public abstract Object e(int i4);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i4) {
        return e(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
