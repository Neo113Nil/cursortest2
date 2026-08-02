package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmq {
    public volatile boolean a;

    public final void a() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }
}
