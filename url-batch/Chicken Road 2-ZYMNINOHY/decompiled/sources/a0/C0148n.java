package a0;

import android.util.Base64;

/* renamed from: a0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0148n implements u2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4197a;

    @Override // u2.m
    public final Object get() {
        switch (this.f4197a) {
            case 0:
                return new C0141g();
            case 1:
                byte[] bArr = new byte[12];
                b0.f.f5286i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                throw new IllegalStateException();
            default:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e4) {
                    throw new IllegalStateException(e4);
                }
        }
    }
}
