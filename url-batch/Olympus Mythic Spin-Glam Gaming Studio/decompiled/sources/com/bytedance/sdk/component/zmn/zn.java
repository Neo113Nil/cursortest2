package com.bytedance.sdk.component.zmn;

/* loaded from: classes5.dex */
public abstract class zn<P, R> extends com.bytedance.sdk.component.zmn.fs<P, R> {
    private zmn fs;
    private boolean zmn = true;
    private btk zn;

    public interface fs {
        zn zmn();
    }

    interface zmn {
        void zmn(Object obj);

        void zmn(Throwable th);
    }

    protected abstract void zmn(P p, btk btkVar) throws Exception;

    @Override // com.bytedance.sdk.component.zmn.fs
    public /* bridge */ /* synthetic */ String zmn() {
        return super.zmn();
    }

    protected final void zmn(R r) {
        if (hhw()) {
            this.fs.zmn(r);
            fb();
        }
    }

    protected final void zmn(Throwable th) {
        if (hhw()) {
            this.fs.zmn(th);
            fb();
        }
    }

    protected final void zn() {
        zmn((Throwable) null);
    }

    protected void fb() {
        this.zmn = false;
        this.zn = null;
    }

    void zmn(P p, btk btkVar, zmn zmnVar) throws Exception {
        this.zn = btkVar;
        this.fs = zmnVar;
        zmn(p, btkVar);
    }

    void btk() {
        fb();
    }

    private boolean hhw() {
        if (this.zmn) {
            return true;
        }
        zg.zmn(new IllegalStateException("Jsb async call already finished: " + zmn() + ", hashcode: " + hashCode()));
        return false;
    }
}
