package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kku {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    public final int e;
    final kkw f;
    final boolean g;
    final boolean h;

    public kku(List list, Collection collection, Collection collection2, kkw kkwVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = kkwVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        hoq.I(!z2 || list == null, "passThrough should imply buffer is null");
        hoq.I((z2 && kkwVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        hoq.I(!z2 || (collection.size() == 1 && collection.contains(kkwVar)) || (collection.size() == 0 && kkwVar.b), "passThrough should imply winningSubstream is drained");
        hoq.I((z && kkwVar == null) ? false : true, "cancelled should imply committed");
    }

    final kku a(kkw kkwVar) {
        Collection unmodifiableCollection;
        boolean z = this.h;
        hoq.I(!z, "hedging frozen");
        kkw kkwVar2 = this.f;
        hoq.I(kkwVar2 == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(kkwVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(kkwVar);
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new kku(this.b, this.c, unmodifiableCollection, kkwVar2, this.g, this.a, z, this.e + 1);
    }

    final kku b() {
        return this.h ? this : new kku(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    final kku c(kkw kkwVar) {
        hoq.I(!this.a, "Already passThrough");
        boolean z = kkwVar.b;
        Collection collection = this.c;
        if (!z) {
            if (collection.isEmpty()) {
                collection = Collections.singletonList(kkwVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(kkwVar);
                collection = DesugarCollections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collection;
        kkw kkwVar2 = this.f;
        boolean z2 = kkwVar2 != null;
        List list = this.b;
        if (z2) {
            hoq.I(kkwVar2 == kkwVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new kku(list, collection2, this.d, kkwVar2, this.g, z2, this.h, this.e);
    }
}
