package j9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f5120a;

    public c(List list) {
        list.getClass();
        this.f5120a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.a(this.f5120a, ((c) obj).f5120a);
    }

    public final int hashCode() {
        return this.f5120a.hashCode();
    }

    public final String toString() {
        return "HallOfFame(scores=" + this.f5120a + ")";
    }
}
