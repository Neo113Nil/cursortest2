package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k extends AbstractCollection implements Collection, xd.b {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}
