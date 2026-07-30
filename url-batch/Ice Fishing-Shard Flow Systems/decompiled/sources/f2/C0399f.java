package f2;

import g2.C0448b;

/* renamed from: f2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f4790a;

    /* renamed from: b, reason: collision with root package name */
    public final K1.h f4791b;

    public C0399f(j jVar, K1.h hVar) {
        this.f4790a = jVar;
        this.f4791b = hVar;
    }

    @Override // f2.i
    public final boolean a(C0448b c0448b) {
        if (c0448b.f5021b != 4 || this.f4790a.a(c0448b)) {
            return false;
        }
        String str = c0448b.f5022c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        long j = c0448b.f5024e;
        long j7 = c0448b.f5025f;
        byte b7 = (byte) (((byte) 1) | 2);
        if (b7 == 3) {
            this.f4791b.b(new C0394a(str, j, j7));
            return true;
        }
        StringBuilder sb = new StringBuilder();
        if ((b7 & 1) == 0) {
            sb.append(" tokenExpirationTimestamp");
        }
        if ((b7 & 2) == 0) {
            sb.append(" tokenCreationTimestamp");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    @Override // f2.i
    public final boolean b(Exception exc) {
        this.f4791b.c(exc);
        return true;
    }
}
