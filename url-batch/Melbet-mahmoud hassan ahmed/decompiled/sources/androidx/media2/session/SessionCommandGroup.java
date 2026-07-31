package androidx.media2.session;

import java.util.HashSet;
import java.util.Set;
import q.d;

/* loaded from: classes.dex */
public final class SessionCommandGroup implements a0.b {

    /* renamed from: a, reason: collision with root package name */
    Set<SessionCommand> f1201a = new HashSet();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionCommandGroup)) {
            return false;
        }
        Set<SessionCommand> set = this.f1201a;
        Set<SessionCommand> set2 = ((SessionCommandGroup) obj).f1201a;
        return set == null ? set2 == null : set.equals(set2);
    }

    public int hashCode() {
        return d.c(this.f1201a);
    }
}
