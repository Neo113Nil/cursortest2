package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* renamed from: kotlin.collections.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0629h extends AbstractList implements List, f6.c {
    public abstract int a();

    public abstract Object b(int i2);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i2) {
        return b(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
