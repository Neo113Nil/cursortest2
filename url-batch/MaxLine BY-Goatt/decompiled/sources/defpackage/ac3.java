package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ac3 implements Iterator {
    public final /* synthetic */ Iterator m;

    public ac3(Iterator it) {
        this.m = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new pc3((String) this.m.next());
    }
}
