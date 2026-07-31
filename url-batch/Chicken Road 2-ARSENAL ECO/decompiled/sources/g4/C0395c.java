package g4;

import java.lang.ref.WeakReference;

/* renamed from: g4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395c extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final int f4280a;

    public C0395c(Object obj, AbstractRunnableC0396d abstractRunnableC0396d) {
        super(obj, abstractRunnableC0396d);
        this.f4280a = System.identityHashCode(obj);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C0395c ? ((C0395c) obj).get() == get() : obj.equals(this);
    }

    public final int hashCode() {
        return this.f4280a;
    }

    public final String toString() {
        return String.valueOf(get());
    }
}
