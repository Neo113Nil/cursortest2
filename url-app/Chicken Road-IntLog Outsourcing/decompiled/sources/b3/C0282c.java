package b3;

import java.lang.ref.WeakReference;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282c extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final int f4823a;

    public C0282c(Object obj, AbstractRunnableC0283d abstractRunnableC0283d) {
        super(obj, abstractRunnableC0283d);
        this.f4823a = System.identityHashCode(obj);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C0282c ? ((C0282c) obj).get() == get() : obj.equals(this);
    }

    public final int hashCode() {
        return this.f4823a;
    }

    public final String toString() {
        return String.valueOf(get());
    }
}
