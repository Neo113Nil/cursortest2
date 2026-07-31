package kotlinx.coroutines.internal;

import m6.y1;

/* loaded from: classes.dex */
final class s extends y1 {

    /* renamed from: g, reason: collision with root package name */
    private final Throwable f18374g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18375h;

    public s(Throwable th, String str) {
        this.f18374g = th;
        this.f18375h = str;
    }

    private final Void U() {
        String i7;
        if (this.f18374g == null) {
            r.c();
            throw new v5.d();
        }
        String str = this.f18375h;
        String str2 = "";
        if (str != null && (i7 = kotlin.jvm.internal.i.i(". ", str)) != null) {
            str2 = i7;
        }
        throw new IllegalStateException(kotlin.jvm.internal.i.i("Module with the Main dispatcher had failed to initialize", str2), this.f18374g);
    }

    @Override // m6.f0
    public boolean Q(y5.g gVar) {
        U();
        throw new v5.d();
    }

    @Override // m6.y1
    public y1 R() {
        return this;
    }

    @Override // m6.f0
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void P(y5.g gVar, Runnable runnable) {
        U();
        throw new v5.d();
    }

    @Override // m6.y1, m6.f0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f18374g;
        sb.append(th != null ? kotlin.jvm.internal.i.i(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
