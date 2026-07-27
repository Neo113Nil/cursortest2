package z2;

import java.util.AbstractList;
import java.util.List;

/* renamed from: z2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1428l extends AbstractList implements List, N2.c {
    public abstract int e();

    public abstract Object h(int i2);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i2) {
        return h(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return e();
    }
}
