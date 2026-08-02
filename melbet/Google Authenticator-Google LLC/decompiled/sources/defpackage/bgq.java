package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgq implements bgf {
    public static final bgq a = new bgq(1, null);
    private final /* synthetic */ int b;

    public bgq(int i) {
        this.b = i;
    }

    @Override // defpackage.bgf
    public final bge b(bgj bgjVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? new eex(bgjVar, 2) : new eex(bgjVar, 1) : new bfu(bgjVar.a(bfv.class, InputStream.class), 6) : bgi.a : new bgr(bgjVar.a(bfv.class, InputStream.class));
    }

    @Deprecated
    public bgq(int i, byte[] bArr) {
        this.b = i;
    }
}
