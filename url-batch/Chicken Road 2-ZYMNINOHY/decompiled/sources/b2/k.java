package b2;

import a2.C0164d;

/* loaded from: classes.dex */
public final class k extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final C0164d f5395a;

    public k(C0164d c0164d) {
        this.f5395a = c0164d;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f5395a));
    }
}
