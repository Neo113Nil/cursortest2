package id;

import java.util.Map;
import kotlin.collections.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a extends n {
    public abstract boolean c(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }

    public /* bridge */ boolean e(Map.Entry entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return e((Map.Entry) obj);
        }
        return false;
    }
}
