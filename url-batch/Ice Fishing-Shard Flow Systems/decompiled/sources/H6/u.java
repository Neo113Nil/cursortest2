package H6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final r f1121a;

    public u(r connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f1121a = connection;
    }

    @Override // H6.w
    public final w a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // H6.w
    public final v b() {
        throw new IllegalStateException("already connected");
    }

    @Override // H6.w
    public final r c() {
        return this.f1121a;
    }

    @Override // H6.w, I6.f
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // H6.w
    public final boolean e() {
        return true;
    }

    @Override // H6.w
    public final v g() {
        throw new IllegalStateException("already connected");
    }
}
