package defpackage;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kef extends kej {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);

    @Deprecated
    static final jwv b = new jwv("cronet-annotation", null);
    public static final jwv c = new jwv("cronet-annotations", null);
    public static final jwv d = new jwv("cronet-read-buffer-size", 4096);
    public final String e;
    public final String f;
    public final kmm g;
    public final Executor h;
    public final kaa i;
    public final keh j;
    public final Runnable k;
    public BidirectionalStream l;
    public final boolean m;
    public final Object n;
    public final Collection o;
    public final int p;
    public keb q;
    public final khg r;
    private final kee u;

    public kef(String str, String str2, Executor executor, kaa kaaVar, keh kehVar, Runnable runnable, Object obj, int i, kae kaeVar, kmm kmmVar, jww jwwVar, kmt kmtVar) {
        super(kmmVar, kaaVar, jwwVar);
        this.u = new kee(this);
        this.e = str;
        this.f = str2;
        this.g = kmmVar;
        this.h = executor;
        this.i = kaaVar;
        this.j = kehVar;
        this.k = runnable;
        this.m = kaeVar.a == kad.a;
        this.n = jwwVar.e(b);
        this.o = (Collection) jwwVar.e(c);
        this.r = new khg(this, i, kmmVar, obj, kmtVar);
        this.p = ((Integer) jwwVar.e(d)).intValue();
        f();
    }

    @Override // defpackage.kfg
    public final jwt a() {
        return jwt.a;
    }

    @Override // defpackage.kej, defpackage.kem
    public final /* synthetic */ kel b() {
        return this.r;
    }

    public final void c(kbq kbqVar) {
        this.j.d(this, kbqVar);
    }

    public final void d(ByteBuffer byteBuffer, boolean z, boolean z2) {
        BidirectionalStream bidirectionalStream = this.l;
        if (bidirectionalStream == null) {
            return;
        }
        bidirectionalStream.write(byteBuffer, z);
        if (z2) {
            this.l.flush();
        }
    }

    @Override // defpackage.kej
    protected final /* synthetic */ kee i() {
        return this.u;
    }

    @Override // defpackage.kej
    protected final /* synthetic */ kel l() {
        return this.r;
    }
}
