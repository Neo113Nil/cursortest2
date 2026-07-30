package com.crrepa.c1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.h;
import com.crrepa.g1.o;
import com.sifli.ezipmy.sifliEzipUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* loaded from: classes3.dex */
public class f extends com.crrepa.l0.b {

    /* renamed from: p, reason: collision with root package name */
    private static final String f12339p = "moy_ai_watch.bin";

    /* renamed from: q, reason: collision with root package name */
    private static final String f12340q = "moy_ai_watch_demo.bin";

    /* renamed from: n, reason: collision with root package name */
    private boolean f12341n;

    /* renamed from: o, reason: collision with root package name */
    private final com.crrepa.a1.c f12342o = new com.crrepa.a1.c();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.i();
            f fVar = f.this;
            byte[] b8 = fVar.b(((com.crrepa.l0.b) fVar).f13161h, ((com.crrepa.l0.b) f.this).f13162i);
            if (b8 == null) {
                f.this.f(1);
                return;
            }
            String d8 = f.this.d(b8);
            if (TextUtils.isEmpty(d8)) {
                f.this.f(1);
            } else {
                f.this.f12342o.a(((com.crrepa.l0.b) f.this).f13154a);
                f.this.f12342o.a(d8, 2);
            }
        }
    }

    public f(boolean z7) {
        this.f12341n = z7;
    }

    @Override // com.crrepa.l0.b
    public void l() {
        new Thread(new a()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(com.crrepa.g1.d.a().getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(com.crrepa.b1.g.f10873s);
        sb.append(str);
        sb.append(com.crrepa.b1.g.f10871q);
        sb.append(str);
        sb.append(com.crrepa.b1.g.f10872r);
        File file = new File(sb.toString());
        h.a(file);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, this.f12341n ? f12340q : f12339p);
        h.a(bArr, file2);
        BleLog.d("watchFaceFile: " + file2.getPath());
        String str2 = com.crrepa.g1.d.a().getFilesDir().getAbsolutePath() + str + com.crrepa.b1.g.f10873s + str + com.crrepa.b1.g.f10869o;
        try {
            o.a(file.getParent(), str2);
            return str2;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    @Override // com.crrepa.l0.b
    public byte[] b(boolean z7, Bitmap[] bitmapArr) {
        if (bitmapArr == null || bitmapArr.length < 1) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapArr[0].compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return sifliEzipUtil.a(byteArrayOutputStream.toByteArray(), com.crrepa.b1.g.f10877w, 0, 1, 1);
    }
}
