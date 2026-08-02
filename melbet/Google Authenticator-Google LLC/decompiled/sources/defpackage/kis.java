package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kis extends kar {
    final SocketAddress a;
    final String b;
    final Collection c;

    public kis(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
        this.c = Collections.singleton(socketAddress.getClass());
    }

    @Override // defpackage.kan
    public final kaq b(URI uri, kal kalVar) {
        return new kir(this);
    }

    @Override // defpackage.kan
    public final String c() {
        return "directaddress";
    }

    @Override // defpackage.kar
    protected final int d() {
        return 5;
    }

    @Override // defpackage.kar
    public final Collection e() {
        return this.c;
    }

    @Override // defpackage.kar
    protected final void f() {
    }
}
