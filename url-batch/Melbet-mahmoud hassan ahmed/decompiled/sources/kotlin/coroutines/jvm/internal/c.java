package kotlin.coroutines.jvm.internal;

/* loaded from: classes.dex */
public final class c implements y5.d<Object> {

    /* renamed from: f, reason: collision with root package name */
    public static final c f18292f = new c();

    private c() {
    }

    @Override // y5.d
    public y5.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // y5.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
