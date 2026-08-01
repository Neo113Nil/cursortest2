package k4;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5386a = new LinkedHashMap();

    public abstract Object a(u8.d dVar);

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return Intrinsics.a(this.f5386a, ((b) obj).f5386a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5386a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f5386a + ')';
    }
}
