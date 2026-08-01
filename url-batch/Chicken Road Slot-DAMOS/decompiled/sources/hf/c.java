package hf;

import kotlin.jvm.internal.Intrinsics;
import wd.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4539a;

    public c(h hVar) {
        this.f4539a = mf.a.a(hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && Intrinsics.a(this.f4539a, ((c) obj).f4539a);
    }

    @Override // hf.a
    public final String getValue() {
        return this.f4539a;
    }

    public final int hashCode() {
        return this.f4539a.hashCode();
    }

    public final String toString() {
        return this.f4539a;
    }
}
