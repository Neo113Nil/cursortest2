package H6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements w {

    /* renamed from: a, reason: collision with root package name */
    public final v f1055a;

    public j(Throwable e7) {
        Intrinsics.checkNotNullParameter(e7, "e");
        this.f1055a = new v(this, e7, 2);
    }

    @Override // H6.w
    public final w a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // H6.w
    public final v b() {
        return this.f1055a;
    }

    @Override // H6.w
    public final r c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // H6.w, I6.f
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // H6.w
    public final boolean e() {
        return false;
    }

    @Override // H6.w
    public final v g() {
        return this.f1055a;
    }
}
