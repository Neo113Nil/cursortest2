package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hpf extends hou {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public hpf(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void f() {
        hoq.I(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.hou
    protected final void a(byte[] bArr, int i) {
        f();
        this.a.update(bArr, 0, i);
    }

    @Override // defpackage.hpc
    public final hpa k() {
        f();
        this.c = true;
        int i = this.b;
        MessageDigest messageDigest = this.a;
        if (i == messageDigest.getDigestLength()) {
            byte[] digest = messageDigest.digest();
            int i2 = hpa.b;
            return new hoy(digest);
        }
        byte[] copyOf = Arrays.copyOf(messageDigest.digest(), i);
        int i3 = hpa.b;
        return new hoy(copyOf);
    }
}
