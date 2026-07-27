package p2;

import G1.n;
import e2.r;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import y.t;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public DataInputStream f9103a;

    /* renamed from: b, reason: collision with root package name */
    public e f9104b;

    /* renamed from: c, reason: collision with root package name */
    public t f9105c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9106d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0995b f9107e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f9108f;

    public static long b(byte[] bArr) {
        return (bArr[2] << 56) + ((bArr[3] & 255) << 48) + ((bArr[4] & 255) << 40) + ((bArr[5] & 255) << 32) + ((bArr[6] & 255) << 24) + ((bArr[7] & 255) << 16) + ((bArr[8] & 255) << 8) + (bArr[9] & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z4, byte b4, byte[] bArr) {
        d dVar;
        if (b4 == 9) {
            if (!z4) {
                throw new f("PING must not fragment across frames");
            }
            if (bArr.length > 125) {
                throw new f("PING frame too long");
            }
            e eVar = this.f9104b;
            synchronized (eVar) {
                eVar.e((byte) 10, bArr);
            }
            return;
        }
        InterfaceC0995b interfaceC0995b = this.f9107e;
        if (interfaceC0995b != null && b4 != 0) {
            throw new f("Failed to continue outstanding frame");
        }
        if (interfaceC0995b == null && b4 == 0) {
            throw new f("Received continuing frame, but there's nothing to continue");
        }
        if (interfaceC0995b == null) {
            if (b4 == 2) {
                C0994a c0994a = new C0994a();
                c0994a.f9084b = 0;
                c0994a.f9083a = new ArrayList();
                dVar = c0994a;
            } else {
                d dVar2 = new d();
                dVar2.f9087a = new StringBuilder();
                dVar = dVar2;
            }
            this.f9107e = dVar;
        }
        if (!this.f9107e.a(bArr)) {
            throw new f("Failed to decode frame");
        }
        if (z4) {
            b3.t b5 = this.f9107e.b();
            this.f9107e = null;
            t tVar = this.f9105c;
            tVar.getClass();
            String str = b5.f5689e;
            r rVar = (r) tVar.f11495i;
            if (rVar.f6255j.y()) {
                rVar.f6255j.d("ws message: " + str, null, new Object[0]);
            }
            rVar.f6254i.execute(new n(tVar, 10, str));
        }
    }

    public final void c() {
        byte[] bArr;
        byte b4;
        boolean z4;
        long j4;
        this.f9105c = this.f9104b.f9094c;
        while (!this.f9108f) {
            try {
                this.f9103a.readFully(this.f9106d, 0, 1);
                bArr = this.f9106d;
                b4 = bArr[0];
                z4 = (b4 & 128) != 0;
            } catch (SocketTimeoutException unused) {
            } catch (IOException e4) {
                f fVar = new f("IO Error", e4);
                this.f9108f = true;
                e eVar = this.f9104b;
                eVar.f9094c.r(fVar);
                if (eVar.f9092a == 3) {
                    eVar.a();
                }
                eVar.b();
            } catch (f e5) {
                this.f9108f = true;
                e eVar2 = this.f9104b;
                eVar2.f9094c.r(e5);
                if (eVar2.f9092a == 3) {
                    eVar2.a();
                }
                eVar2.b();
            }
            if ((b4 & 112) != 0) {
                throw new f("Invalid frame received");
            }
            byte b5 = (byte) (b4 & 15);
            this.f9103a.readFully(bArr, 1, 1);
            byte[] bArr2 = this.f9106d;
            byte b6 = bArr2[1];
            if (b6 < 126) {
                j4 = b6;
            } else if (b6 == 126) {
                this.f9103a.readFully(bArr2, 2, 2);
                byte[] bArr3 = this.f9106d;
                j4 = ((bArr3[2] & 255) << 8) | (bArr3[3] & 255);
            } else if (b6 == Byte.MAX_VALUE) {
                this.f9103a.readFully(bArr2, 2, 8);
                j4 = b(this.f9106d);
            } else {
                j4 = 0;
            }
            int i2 = (int) j4;
            byte[] bArr4 = new byte[i2];
            this.f9103a.readFully(bArr4, 0, i2);
            if (b5 == 8) {
                this.f9104b.b();
            } else if (b5 != 10) {
                if (b5 != 1 && b5 != 2 && b5 != 9 && b5 != 0) {
                    throw new f("Unsupported opcode: " + ((int) b5));
                }
                a(z4, b5, bArr4);
            }
        }
    }
}
