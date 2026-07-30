package u5;

import b3.z;
import h7.s;
import j5.r;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public DataInputStream f9075a;

    /* renamed from: b, reason: collision with root package name */
    public d f9076b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.room.c f9077c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9078d;

    /* renamed from: e, reason: collision with root package name */
    public b f9079e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f9080f;

    public static long b(byte[] bArr) {
        return (bArr[2] << 56) + ((bArr[3] & 255) << 48) + ((bArr[4] & 255) << 40) + ((bArr[5] & 255) << 32) + ((bArr[6] & 255) << 24) + ((bArr[7] & 255) << 16) + ((bArr[8] & 255) << 8) + (bArr[9] & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z8, byte b9, byte[] bArr) {
        c cVar;
        if (b9 == 9) {
            if (!z8) {
                throw new e("PING must not fragment across frames");
            }
            if (bArr.length > 125) {
                throw new e("PING frame too long");
            }
            d dVar = this.f9076b;
            synchronized (dVar) {
                dVar.e((byte) 10, bArr);
            }
            return;
        }
        b bVar = this.f9079e;
        if (bVar != null && b9 != 0) {
            throw new e("Failed to continue outstanding frame");
        }
        if (bVar == null && b9 == 0) {
            throw new e("Received continuing frame, but there's nothing to continue");
        }
        if (bVar == null) {
            if (b9 == 2) {
                a aVar = new a();
                aVar.f9057b = 0;
                aVar.f9056a = new ArrayList();
                cVar = aVar;
            } else {
                c cVar2 = new c();
                cVar2.f9059a = new StringBuilder();
                cVar = cVar2;
            }
            this.f9079e = cVar;
        }
        if (!this.f9079e.a(bArr)) {
            throw new e("Failed to decode frame");
        }
        if (z8) {
            s b10 = this.f9079e.b();
            this.f9079e = null;
            androidx.room.c cVar3 = this.f9077c;
            cVar3.getClass();
            String str = b10.f4707g;
            r rVar = (r) cVar3.f1070h;
            if (rVar.f5119j.v()) {
                rVar.f5119j.d("ws message: " + str, null, new Object[0]);
            }
            rVar.f5118i.execute(new z(5, (Object) cVar3, (Object) str, false));
        }
    }

    public final void c() {
        byte[] bArr;
        byte b9;
        boolean z8;
        long j8;
        this.f9077c = this.f9076b.f9066c;
        while (!this.f9080f) {
            try {
                this.f9075a.readFully(this.f9078d, 0, 1);
                bArr = this.f9078d;
                b9 = bArr[0];
                z8 = (b9 & 128) != 0;
            } catch (SocketTimeoutException unused) {
            } catch (IOException e9) {
                e eVar = new e("IO Error", e9);
                this.f9080f = true;
                d dVar = this.f9076b;
                dVar.f9066c.w(eVar);
                if (dVar.f9064a == 3) {
                    dVar.a();
                }
                dVar.b();
            } catch (e e10) {
                this.f9080f = true;
                d dVar2 = this.f9076b;
                dVar2.f9066c.w(e10);
                if (dVar2.f9064a == 3) {
                    dVar2.a();
                }
                dVar2.b();
            }
            if ((b9 & 112) != 0) {
                throw new e("Invalid frame received");
            }
            byte b10 = (byte) (b9 & 15);
            this.f9075a.readFully(bArr, 1, 1);
            byte[] bArr2 = this.f9078d;
            byte b11 = bArr2[1];
            if (b11 < 126) {
                j8 = b11;
            } else if (b11 == 126) {
                this.f9075a.readFully(bArr2, 2, 2);
                byte[] bArr3 = this.f9078d;
                j8 = ((bArr3[2] & 255) << 8) | (bArr3[3] & 255);
            } else if (b11 == Byte.MAX_VALUE) {
                this.f9075a.readFully(bArr2, 2, 8);
                j8 = b(this.f9078d);
            } else {
                j8 = 0;
            }
            int i7 = (int) j8;
            byte[] bArr4 = new byte[i7];
            this.f9075a.readFully(bArr4, 0, i7);
            if (b10 == 8) {
                this.f9076b.b();
            } else if (b10 != 10) {
                if (b10 != 1 && b10 != 2 && b10 != 9 && b10 != 0) {
                    throw new e("Unsupported opcode: " + ((int) b10));
                }
                a(z8, b10, bArr4);
            }
        }
    }
}
