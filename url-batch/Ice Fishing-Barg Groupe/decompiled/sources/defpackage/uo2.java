package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uo2 extends qv1 implements o82 {
    public final q51 OPXfSBeufaJ8;
    public final long wdg6QnbFHrFF;

    public uo2(q51 q51Var, long j) {
        this.OPXfSBeufaJ8 = q51Var;
        this.wdg6QnbFHrFF = j;
    }

    @Override // defpackage.qv1
    public final ig OPXfSBeufaJ8() {
        return new es1(this);
    }

    @Override // defpackage.o82
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return yj2.Y1f8riQaR6yg;
    }

    @Override // defpackage.qv1
    public final q51 a92UlCVFR9N8() {
        return this.OPXfSBeufaJ8;
    }

    @Override // defpackage.qv1
    public final long lS5Rgt96tfkO() {
        return this.wdg6QnbFHrFF;
    }

    @Override // defpackage.qv1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
