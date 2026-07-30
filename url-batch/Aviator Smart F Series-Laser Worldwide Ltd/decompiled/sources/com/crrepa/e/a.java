package com.crrepa.e;

import com.crrepa.ble.conn.callback.CRPAiCallback;
import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final byte f12398e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f12399f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f12400g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f12401h = 3;

    /* renamed from: a, reason: collision with root package name */
    private CRPAiCallback f12402a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12403b;

    /* renamed from: c, reason: collision with root package name */
    private byte f12404c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f12405d;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f12406a = new a();

        private b() {
        }
    }

    private a() {
        this.f12403b = false;
        this.f12404c = (byte) 0;
    }

    public static a a() {
        return b.f12406a;
    }

    public void b(byte[] bArr) {
        int i8;
        if (bArr.length < 3) {
            return;
        }
        this.f12404c = bArr[2];
        BleLog.d("onAiModel: " + ((int) this.f12404c));
        if (4 >= bArr.length || (i8 = bArr[3]) <= 0) {
            return;
        }
        byte[] bArr2 = new byte[i8];
        this.f12405d = bArr2;
        System.arraycopy(bArr, 4, bArr2, 0, i8);
    }

    public void a(CRPAiCallback cRPAiCallback) {
        this.f12402a = cRPAiCallback;
        this.f12403b = false;
        this.f12404c = (byte) 0;
        this.f12405d = null;
    }

    public void a(byte[] bArr) {
        if (this.f12402a == null || this.f12403b || 3 >= bArr.length) {
            return;
        }
        this.f12403b = true;
        byte b8 = bArr[3];
        BleLog.d("aiCallback: " + ((int) b8));
        boolean z7 = 4 < bArr.length && 1 < bArr[4];
        if (this.f12405d == null) {
            if (b8 == 0) {
                this.f12405d = null;
            } else if (3 == b8) {
                this.f12405d = new byte[]{0, 1};
            } else {
                this.f12405d = new byte[]{(byte) (b8 - 1)};
            }
        }
        this.f12402a.onSupportAiFeature(this.f12404c, this.f12405d, z7);
    }
}
