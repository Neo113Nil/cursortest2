package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blk implements bln {
    public final int a;
    public Bitmap b;
    private blb c;
    private final Handler d;
    private final long e;

    public blk(Handler handler, int i, long j) {
        if (!bmi.k(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.d = handler;
        this.a = i;
        this.e = j;
    }

    @Override // defpackage.bln
    public final blb a() {
        return this.c;
    }

    @Override // defpackage.bln
    public final void bq(blg blgVar) {
        blgVar.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.bln
    public final void c(blb blbVar) {
        this.c = blbVar;
    }

    @Override // defpackage.bln
    public final void d() {
        this.b = null;
    }

    @Override // defpackage.bln
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        this.b = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.e);
    }

    @Override // defpackage.bln
    public final void e() {
    }

    @Override // defpackage.bkd
    public final void g() {
    }

    @Override // defpackage.bkd
    public final void h() {
    }

    @Override // defpackage.bkd
    public final void i() {
    }

    public blk() {
        throw null;
    }

    @Override // defpackage.bln
    public final void b(Drawable drawable) {
    }

    @Override // defpackage.bln
    public final void j(blg blgVar) {
    }
}
