package w1;

import java.security.MessageDigest;

/* renamed from: w1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5152e implements O1.b {

    /* renamed from: n, reason: collision with root package name */
    public final MessageDigest f41592n;

    /* renamed from: u, reason: collision with root package name */
    public final O1.e f41593u = new O1.e();

    public C5152e(MessageDigest messageDigest) {
        this.f41592n = messageDigest;
    }

    @Override // O1.b
    public final O1.e b() {
        return this.f41593u;
    }
}
