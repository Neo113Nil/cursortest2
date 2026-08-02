package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class haq extends hhk {
    final /* synthetic */ has a;

    public haq(has hasVar) {
        this.a = hasVar;
    }

    @Override // defpackage.hhk
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.hhk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.a.a.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new har(this.a);
    }

    @Override // defpackage.hhk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        has hasVar = this.a;
        Object key = entry.getKey();
        hbg hbgVar = hasVar.b;
        Map map = hbgVar.a;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        hbgVar.b -= size;
        return true;
    }
}
