package com.crrepa.s0;

import com.crrepa.ble.util.BleLog;
import com.crrepa.f.g;

/* loaded from: classes3.dex */
public class e extends c {

    /* renamed from: i, reason: collision with root package name */
    private static final int f13787i = 986;

    /* renamed from: g, reason: collision with root package name */
    private final com.crrepa.k0.c f13788g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13789h;

    class a implements com.crrepa.k0.b {
        a() {
        }

        @Override // com.crrepa.k0.b
        public void onConnectionStateChanged(int i8) {
            BleLog.d("HisiliconSPPFileTransInitiator onConnectionStateChanged: " + i8);
            if (e.this.f13789h) {
                BleLog.d("HisiliconSPPFileTransInitiator transCompleted");
                return;
            }
            e.this.resetTimer();
            if (i8 == 2) {
                e.this.b();
            } else if (i8 == 0) {
                e.this.onTransFileError();
            }
        }

        @Override // com.crrepa.k0.b
        public void onReceiveData(byte[] bArr) {
        }
    }

    protected e(byte b8) {
        super(b8);
        this.f13788g = com.crrepa.k0.c.c();
        this.f13789h = false;
    }

    private void c() {
        String b8 = com.crrepa.g1.d.b();
        BleLog.d("HisiliconSPPFileTransInitiator connect: " + b8);
        this.f13788g.a(b8, true, new a());
    }

    private void d() {
        sendBleMessage(g.a(getCmd(), new byte[]{5}));
    }

    @Override // com.crrepa.s0.c
    public void abort() {
        d();
        release();
    }

    @Override // com.crrepa.l0.g
    protected void release() {
        super.release();
        this.f13789h = true;
        BleLog.d("spp release fileType: " + ((int) this.f13784e));
    }

    @Override // com.crrepa.l0.g
    protected void sendFile(int i8) {
        try {
            BleLog.d("sendFile offset: " + i8);
            byte[] transBytes = getTransBytes(i8);
            int i9 = 0;
            while (i9 < transBytes.length) {
                int i10 = i9 + f13787i;
                int length = transBytes.length < i10 ? transBytes.length - i9 : f13787i;
                BleLog.d("sendFile length: " + length);
                byte[] bArr = new byte[length + 4];
                bArr[0] = -2;
                bArr[1] = a4.a.G;
                byte[] a8 = com.crrepa.g1.c.a(length);
                System.arraycopy(a8, 0, bArr, 2, a8.length);
                System.arraycopy(transBytes, i9, bArr, 4, length);
                this.f13788g.a(bArr);
                i9 = i10;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            onTransFileError();
        }
    }

    @Override // com.crrepa.s0.c, com.crrepa.l0.g
    protected void startTrans() {
        this.f13789h = false;
        c();
    }
}
