package q0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.h;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4867b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractCollection f39880a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4867b(List topics) {
        h.e(topics, "topics");
        this.f39880a = (AbstractCollection) topics;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.AbstractCollection, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4867b)) {
            return false;
        }
        ?? r02 = this.f39880a;
        C4867b c4867b = (C4867b) obj;
        if (r02.size() != c4867b.f39880a.size()) {
            return false;
        }
        return new HashSet((Collection) r02).equals(new HashSet(c4867b.f39880a));
    }

    public final int hashCode() {
        return Objects.hash(this.f39880a);
    }

    public final String toString() {
        return "Topics=" + this.f39880a;
    }
}
