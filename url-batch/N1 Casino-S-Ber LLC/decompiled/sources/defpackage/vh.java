package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class vh {
    public int a = 1;
    public final iu b;
    public iu c;
    public iu d;
    public int e;
    public int f;

    public vh(iu iuVar) {
        this.b = iuVar;
        this.c = iuVar;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        gu b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.d).get(a + b.a) == 0) || this.e == 65039;
    }
}
