package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class nh {
    public int a = 1;
    public final xu b;
    public xu c;
    public xu d;
    public int e;
    public int f;

    public nh(xu xuVar) {
        this.b = xuVar;
        this.c = xuVar;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        vu b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.d).get(a + b.a) == 0) || this.e == 65039;
    }
}
