package a8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final a f339d = new a();

    @Override // a8.g
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // a8.g
    public final boolean b() {
        return false;
    }

    @Override // a8.g
    public final Object c() {
        return null;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
