package g4;

import java.util.AbstractList;
import java.util.List;
import u4.InterfaceC1483c;

/* renamed from: g4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0460e extends AbstractList implements List, InterfaceC1483c {
    public abstract int c();

    public abstract Object d(int i2);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i2) {
        return d(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return c();
    }
}
