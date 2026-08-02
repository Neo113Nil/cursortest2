package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chc {
    public String a;
    public byte[] b;
    private int c;
    private int d;
    private final List e = new ArrayList();

    public final chd a() {
        int i = this.c;
        if (i != 1 && i != 2) {
            throw new IllegalStateException("Invalid WriteMode.");
        }
        List list = this.e;
        if (list.isEmpty()) {
            throw new IllegalStateException("Must specify at least one audit record.");
        }
        int i2 = this.d;
        if (i2 != 0) {
            return new chd(this.c, i2, this.a, (byte[][]) list.toArray(new byte[0][]), null, this.b);
        }
        throw new IllegalStateException("Invalid componentId.");
    }

    public final void b(byte[] bArr) {
        this.e.add(bArr);
    }

    public final void c() {
        this.d = 234;
    }

    public final void d() {
        this.c = 2;
    }
}
