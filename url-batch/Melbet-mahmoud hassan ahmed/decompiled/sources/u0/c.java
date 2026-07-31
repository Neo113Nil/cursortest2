package u0;

import android.media.MediaCodec;
import o2.m0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f22386a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f22387b;

    /* renamed from: c, reason: collision with root package name */
    public int f22388c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f22389d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f22390e;

    /* renamed from: f, reason: collision with root package name */
    public int f22391f;

    /* renamed from: g, reason: collision with root package name */
    public int f22392g;

    /* renamed from: h, reason: collision with root package name */
    public int f22393h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f22394i;

    /* renamed from: j, reason: collision with root package name */
    private final b f22395j;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f22396a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f22397b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f22396a = cryptoInfo;
            this.f22397b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i7, int i8) {
            this.f22397b.set(i7, i8);
            this.f22396a.setPattern(this.f22397b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f22394i = cryptoInfo;
        this.f22395j = m0.f19752a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f22394i;
    }

    public void b(int i7) {
        if (i7 == 0) {
            return;
        }
        if (this.f22389d == null) {
            int[] iArr = new int[1];
            this.f22389d = iArr;
            this.f22394i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f22389d;
        iArr2[0] = iArr2[0] + i7;
    }

    public void c(int i7, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i8, int i9, int i10) {
        this.f22391f = i7;
        this.f22389d = iArr;
        this.f22390e = iArr2;
        this.f22387b = bArr;
        this.f22386a = bArr2;
        this.f22388c = i8;
        this.f22392g = i9;
        this.f22393h = i10;
        MediaCodec.CryptoInfo cryptoInfo = this.f22394i;
        cryptoInfo.numSubSamples = i7;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i8;
        if (m0.f19752a >= 24) {
            ((b) o2.a.e(this.f22395j)).b(i9, i10);
        }
    }
}
