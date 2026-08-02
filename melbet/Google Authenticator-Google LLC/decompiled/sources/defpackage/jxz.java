package defpackage;

import java.net.InetSocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxz extends ixb {
    public ScheduledExecutorService a;
    public final CronetEngine b;
    public final kiu c;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    public final bst i = kmt.f;
    public int d = 4194304;

    public jxz(String str, int i, CronetEngine cronetEngine) {
        this.c = new kiu(InetSocketAddress.createUnresolved(str, i), khd.d(str, i), new kee(this));
        this.b = cronetEngine;
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("delegate", this.c);
        return T.toString();
    }
}
