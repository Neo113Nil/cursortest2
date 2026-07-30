package com.crrepa.b1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.h;
import com.crrepa.g1.o;
import com.sifli.ezipmy.sifliEzipUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* loaded from: classes2.dex */
public class g extends com.crrepa.l0.b {

    /* renamed from: o, reason: collision with root package name */
    public static final String f10869o = "images_fs.zip";

    /* renamed from: p, reason: collision with root package name */
    private static final String f10870p = "moy_user_bg.bin";

    /* renamed from: q, reason: collision with root package name */
    public static final String f10871q = "images_fs";

    /* renamed from: r, reason: collision with root package name */
    public static final String f10872r = "dynamic_bg";

    /* renamed from: s, reason: collision with root package name */
    public static final String f10873s = "wf";

    /* renamed from: t, reason: collision with root package name */
    public static final byte f10874t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final byte f10875u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final byte f10876v = 5;

    /* renamed from: w, reason: collision with root package name */
    public static final String f10877w = "rgb565";

    /* renamed from: x, reason: collision with root package name */
    private static final int f10878x = 8192;

    /* renamed from: n, reason: collision with root package name */
    com.crrepa.a1.c f10879n = new com.crrepa.a1.c();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.i();
            g gVar = g.this;
            byte[] b8 = gVar.b(((com.crrepa.l0.b) gVar).f13161h, ((com.crrepa.l0.b) g.this).f13162i);
            if (b8 == null) {
                g.this.f(1);
                return;
            }
            String d8 = g.this.d(b8);
            if (TextUtils.isEmpty(d8)) {
                g.this.f(1);
                return;
            }
            g gVar2 = g.this;
            gVar2.f10879n.a(((com.crrepa.l0.b) gVar2).f13154a);
            g.this.f10879n.a(d8, 2);
        }
    }

    public g() {
        this.f13157d = 8192;
    }

    @Override // com.crrepa.l0.b
    protected int c(int i8) {
        return i8;
    }

    @Override // com.crrepa.l0.b
    protected void e(int i8) {
        if (this.f13154a == null) {
            return;
        }
        this.f13154a.onTransProgressChanged((i8 * 100) / c().length);
    }

    @Override // com.crrepa.l0.b
    protected void i(int i8) {
        BleLog.d("sendBitmapSize: " + i8);
        byte[] bArr = new byte[6];
        bArr[0] = 0;
        bArr[1] = 1;
        byte[] b8 = com.crrepa.g1.c.b(i8);
        System.arraycopy(b8, 0, bArr, 2, b8.length);
        a(com.crrepa.f.g.a(-73, bArr));
    }

    @Override // com.crrepa.l0.b
    public void l() {
        if (com.crrepa.q.a.b()) {
            new Thread(new a()).start();
        } else {
            super.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(com.crrepa.g1.d.a().getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(f10873s);
        sb.append(str);
        sb.append(f10871q);
        sb.append(str);
        sb.append(f10872r);
        File file = new File(sb.toString());
        h.a(file);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, f10870p);
        h.a(bArr, file2);
        BleLog.d("watchFaceFile: " + file2.getPath());
        String str2 = com.crrepa.g1.d.a().getFilesDir().getAbsolutePath() + str + f10873s + str + f10869o;
        try {
            o.a(file.getParent(), str2);
            return str2;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    @Override // com.crrepa.l0.b
    public void a() {
        j();
        a(com.crrepa.f.g.a(-73, new byte[]{5}));
    }

    @Override // com.crrepa.l0.b
    protected void b(boolean z7) {
        byte[] bArr = new byte[1];
        if (z7) {
            bArr[0] = 3;
        } else {
            bArr[0] = 4;
        }
        a(com.crrepa.f.g.a(-73, bArr));
    }

    @Override // com.crrepa.l0.b
    public byte[] b(boolean z7, Bitmap[] bitmapArr) {
        if (bitmapArr == null || bitmapArr.length < 1) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapArr[0].compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return sifliEzipUtil.a(byteArrayOutputStream.toByteArray(), f10877w, 0, 1, 1);
    }
}
