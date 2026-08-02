package T;

/* renamed from: T.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0100s {

    /* renamed from: a, reason: collision with root package name */
    public final long f2882a;

    static {
        new C0100s(new r());
        W.J.G(0);
        W.J.G(1);
        W.J.G(2);
        W.J.G(3);
        W.J.G(4);
        W.J.G(5);
        W.J.G(6);
        W.J.G(7);
    }

    public C0100s(r rVar) {
        String str = W.J.f3263a;
        this.f2882a = rVar.f2881a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0100s)) {
            return false;
        }
        C0100s c0100s = (C0100s) obj;
        c0100s.getClass();
        return this.f2882a == c0100s.f2882a;
    }

    public final int hashCode() {
        long j4 = this.f2882a;
        return ((((int) 0) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 923521;
    }
}
