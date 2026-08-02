package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class khr {
    public List a;
    public int b;
    public int c;

    public khr(List list) {
        this.a = list;
    }

    public final jwt a() {
        return ((jxx) this.a.get(this.b)).f;
    }

    public final SocketAddress b() {
        return (SocketAddress) ((jxx) this.a.get(this.b)).e.get(this.c);
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
    }
}
