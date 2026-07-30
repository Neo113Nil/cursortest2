package com.crrepa.q0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.compress.api.DecompressRet;
import com.compress.api.PicZipEventCallback;
import com.crrepa.ble.conn.listener.CRPPhotoWatchFaceTransListener;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.util.BleLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: i, reason: collision with root package name */
    private static final String f13683i = "crrepa";

    /* renamed from: j, reason: collision with root package name */
    private static final String f13684j = "wf";

    /* renamed from: k, reason: collision with root package name */
    private static final String f13685k = ".bin";

    /* renamed from: l, reason: collision with root package name */
    private static final String f13686l = "thumb.jpg";

    /* renamed from: b, reason: collision with root package name */
    private CRPPhotoWatchFaceTransListener f13688b;

    /* renamed from: c, reason: collision with root package name */
    private String f13689c;

    /* renamed from: d, reason: collision with root package name */
    private com.crrepa.s0.c f13690d;

    /* renamed from: a, reason: collision with root package name */
    private final List<File> f13687a = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f13691e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private int f13692f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f13693g = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13694h = false;

    class a implements PicZipEventCallback {
        a() {
        }

        @Override // com.compress.api.PicZipEventCallback
        public void compressRets(int i8, int i9, int i10, byte[] bArr) {
            BleLog.d("compressRets: " + bArr.length);
            File a8 = g.this.a();
            com.crrepa.g1.h.a(bArr, a8);
            g.this.a(a8);
        }

        @Override // com.compress.api.PicZipEventCallback
        public void deCompressRets(int i8, int i9, DecompressRet decompressRet) {
        }
    }

    class b implements CRPWatchFaceTransListener {
        b() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            BleLog.d("onError: " + i8);
            g.this.a(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPWatchFaceTransListener
        public void onInstallStateChange(boolean z7) {
            BleLog.d("onTransProgressStarting");
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            BleLog.d("onTransCompleted");
            g gVar = g.this;
            g.a(gVar, gVar.f13690d.a());
            g.this.e();
            g.this.f();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            BleLog.d("onTransProgressStarting: " + i8);
            g.this.b(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            BleLog.d("onTransProgressStarting");
        }
    }

    static /* synthetic */ int a(g gVar, long j8) {
        int i8 = (int) (gVar.f13693g + j8);
        gVar.f13693g = i8;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (TextUtils.isEmpty(this.f13689c)) {
            return;
        }
        this.f13691e.add(this.f13689c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f13687a.isEmpty()) {
            c();
            return;
        }
        File remove = this.f13687a.remove(0);
        if (remove == null || !remove.exists()) {
            f();
            return;
        }
        this.f13689c = remove.getName();
        com.crrepa.u0.c.a().a(BitmapFactory.decodeFile(remove.getAbsolutePath()));
    }

    protected File b() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.crrepa.g1.d.a().getCacheDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(f13683i);
        sb.append(str);
        sb.append("wf");
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(sb2, f13686l);
    }

    protected void c() {
        CRPPhotoWatchFaceTransListener cRPPhotoWatchFaceTransListener = this.f13688b;
        if (cRPPhotoWatchFaceTransListener != null) {
            cRPPhotoWatchFaceTransListener.onTransProgressChanged(100);
            this.f13688b.onTransCompleted();
        }
    }

    protected void d() {
        CRPPhotoWatchFaceTransListener cRPPhotoWatchFaceTransListener = this.f13688b;
        if (cRPPhotoWatchFaceTransListener != null) {
            cRPPhotoWatchFaceTransListener.onTransProgressStarting();
        }
    }

    private int a(List<File> list) {
        Iterator<File> it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Bitmap decodeFile = BitmapFactory.decodeFile(it.next().getAbsolutePath());
            i8 += com.crrepa.u0.a.a(decodeFile.getWidth(), decodeFile.getHeight());
        }
        return i8;
    }

    protected void b(int i8) {
        if (this.f13688b != null) {
            long a8 = this.f13690d.a() + this.f13693g;
            BleLog.i("onTransChanged percent: " + i8);
            BleLog.i("onTransChanged getTransIndex: " + this.f13690d.a());
            BleLog.i("onTransChanged transSize: " + a8);
            BleLog.i("onTransChanged totalFileSize: " + this.f13692f);
            int i9 = (int) ((a8 * 100) / ((long) this.f13692f));
            BleLog.i("onTransChanged: " + i9);
            this.f13688b.onTransProgressChanged(i9);
        }
    }

    protected File a() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.crrepa.g1.d.a().getCacheDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(f13683i);
        sb.append(str);
        sb.append("wf");
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (this.f13689c.contains(".")) {
            StringBuilder sb3 = new StringBuilder();
            String str2 = this.f13689c;
            sb3.append(str2.substring(0, str2.lastIndexOf(".")));
            sb3.append(f13685k);
            this.f13689c = sb3.toString();
        }
        return new File(sb2, this.f13689c);
    }

    protected void a(int i8) {
        this.f13694h = true;
        CRPPhotoWatchFaceTransListener cRPPhotoWatchFaceTransListener = this.f13688b;
        if (cRPPhotoWatchFaceTransListener != null) {
            cRPPhotoWatchFaceTransListener.onError(i8, this.f13691e);
        }
    }

    private void a(int i8, int i9) {
        byte[] bArr = new byte[6];
        bArr[0] = 1;
        byte[] b8 = com.crrepa.g1.c.b(i8);
        System.arraycopy(b8, 0, bArr, 1, b8.length);
        bArr[5] = (byte) i9;
        com.crrepa.m.f.e().c(com.crrepa.f.g.a(-76, bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file) {
        if (this.f13694h) {
            BleLog.e("the file trans aborted!");
        } else {
            this.f13690d.a(new b());
            this.f13690d.a(file);
        }
    }

    public void a(List<File> list, Bitmap bitmap, CRPPhotoWatchFaceTransListener cRPPhotoWatchFaceTransListener) {
        if (cRPPhotoWatchFaceTransListener == null) {
            return;
        }
        if (list == null || list.isEmpty() || bitmap == null) {
            a(1);
            return;
        }
        this.f13690d = com.crrepa.s0.d.a().a((byte) 11);
        this.f13688b = cRPPhotoWatchFaceTransListener;
        this.f13687a.clear();
        File b8 = b();
        com.crrepa.g1.a.a(bitmap, b8);
        this.f13687a.add(b8);
        this.f13687a.addAll(list);
        this.f13692f = a(this.f13687a);
        this.f13693g = 0;
        this.f13694h = false;
        BleLog.d("photo watchface totalFileSize: " + this.f13692f);
        a(this.f13692f, this.f13687a.size());
        com.crrepa.u0.c.a().a(new a());
        d();
        this.f13691e.clear();
        f();
    }
}
