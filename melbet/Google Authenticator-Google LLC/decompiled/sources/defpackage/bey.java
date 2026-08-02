package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bey implements bmn {
    public final MessageDigest a;
    private final bmq b = new bmq();

    public bey(MessageDigest messageDigest) {
        this.a = messageDigest;
    }

    @Override // defpackage.bmn
    public final bmq bp() {
        return this.b;
    }
}
