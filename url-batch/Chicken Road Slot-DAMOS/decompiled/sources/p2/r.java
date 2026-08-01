package p2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final List f7641a;

    public r(q... qVarArr) {
        if (qVarArr.length <= 0) {
            this.f7641a = kotlin.collections.w.v(qVarArr);
        } else {
            q qVar = qVarArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return Intrinsics.a(this.f7641a, ((r) obj).f7641a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7641a.hashCode();
    }
}
