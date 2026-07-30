package com.crrepa.q0;

import android.graphics.Bitmap;
import com.compress.api.DecompressRet;
import com.compress.api.PicZipEventCallback;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.q0;
import com.crrepa.s0.c;
import java.io.File;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f13679b = "thumb.bin";

    /* renamed from: c, reason: collision with root package name */
    private static int f13680c;

    /* renamed from: a, reason: collision with root package name */
    private final com.crrepa.s0.c f13681a = com.crrepa.s0.d.a().a((byte) 11);

    class a implements PicZipEventCallback {
        a() {
        }

        @Override // com.compress.api.PicZipEventCallback
        public void compressRets(int i8, int i9, int i10, byte[] bArr) {
            BleLog.d("compressRets: " + bArr.length);
            File file = new File(com.crrepa.g1.d.a().getCacheDir(), f.f13679b);
            com.crrepa.g1.h.a(bArr, file);
            f.this.f13681a.a(file);
        }

        @Override // com.compress.api.PicZipEventCallback
        public void deCompressRets(int i8, int i9, DecompressRet decompressRet) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a() {
        com.crrepa.m.f.e().c(q0.c(f13680c));
    }

    public void a(Bitmap bitmap, int i8) {
        f13680c = i8;
        if (bitmap == null) {
            this.f13681a.onTransFileNull();
            return;
        }
        com.crrepa.u0.c.a().a(new a());
        com.crrepa.u0.c.a().a(bitmap);
        this.f13681a.a(new c.a() { // from class: com.crrepa.q0.e
            @Override // com.crrepa.s0.c.a
            public final void a() {
                f.a();
            }
        });
    }

    public void a(CRPFileTransListener cRPFileTransListener) {
        this.f13681a.a(cRPFileTransListener);
    }
}
