package o3;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class x extends v {

    /* renamed from: h, reason: collision with root package name */
    private static final WeakReference<byte[]> f19874h = new WeakReference<>(null);

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<byte[]> f19875g;

    x(byte[] bArr) {
        super(bArr);
        this.f19875g = f19874h;
    }

    protected abstract byte[] B3();

    @Override // o3.v
    final byte[] q0() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f19875g.get();
            if (bArr == null) {
                bArr = B3();
                this.f19875g = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
