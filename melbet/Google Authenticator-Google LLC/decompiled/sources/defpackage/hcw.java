package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hcw extends hdl implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue a;

    public hcw() {
        hoq.A(true, "maxSize (%s) must >= 0", 50);
        this.a = new ArrayDeque(50);
    }

    @Override // defpackage.hdl, defpackage.hdc
    protected final /* synthetic */ Collection a() {
        return this.a;
    }

    @Override // defpackage.hdc, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (size() == 50) {
            this.a.remove();
        }
        this.a.add(obj);
        return true;
    }

    @Override // defpackage.hdc, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < 50) {
            return hnu.N(this, collection.iterator());
        }
        clear();
        return hnu.N(this, hnu.T(collection, size - 50).iterator());
    }

    @Override // defpackage.hdl
    protected final Queue b() {
        return this.a;
    }

    @Override // defpackage.hdc, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.hdl, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
