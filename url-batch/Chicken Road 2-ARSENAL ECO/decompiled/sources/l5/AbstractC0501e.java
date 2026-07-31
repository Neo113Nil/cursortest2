package l5;

import java.util.AbstractList;
import java.util.List;
import y5.InterfaceC0768c;

/* renamed from: l5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0501e extends AbstractList implements List, InterfaceC0768c {
    public abstract int a();

    public abstract Object b(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return b(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
