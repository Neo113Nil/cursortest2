package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class yj {
    public int a = 1;
    public final jx b;
    public jx c;
    public jx d;
    public int e;
    public int f;

    public yj(jx jxVar) {
        this.b = jxVar;
        this.c = jxVar;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        hx b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.d).get(a + b.a) == 0) || this.e == 65039;
    }
}
