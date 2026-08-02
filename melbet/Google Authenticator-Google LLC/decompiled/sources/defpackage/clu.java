package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class clu extends cqr {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public clu(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] b();

    @Override // defpackage.cqr
    public final byte[] z() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.b.get();
            if (bArr == null) {
                bArr = b();
                this.b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
