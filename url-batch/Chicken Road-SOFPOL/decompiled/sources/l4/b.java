package l4;

import java.util.LinkedHashMap;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4829a = new LinkedHashMap();

    public abstract Object a(w5.f fVar);

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return i.a(this.f4829a, ((b) obj).f4829a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4829a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f4829a + ')';
    }
}
