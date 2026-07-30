package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q61 extends t61 implements Iterable {
    public final ArrayList m = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof q61) && ((q61) obj).m.equals(this.m);
        }
        return true;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.m.iterator();
    }
}
