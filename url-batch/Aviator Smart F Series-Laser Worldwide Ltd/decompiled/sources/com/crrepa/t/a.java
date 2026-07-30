package com.crrepa.t;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.compress.api.DecompressRet;
import com.compress.api.PicZipEventCallback;
import com.crrepa.ble.conn.bean.CRPLocalNavigationInfo;
import com.crrepa.ble.spp.hisilicon.CRPHisiliconSPPManager;
import com.crrepa.ble.spp.hisilicon.CRPSPPConnectChangeListener;
import com.crrepa.ble.spp.hisilicon.write.CRPSPPFileTransListener;
import com.crrepa.ble.spp.hisilicon.write.HisiliconFileType;
import com.crrepa.ble.spp.hisilicon.write.SPPFileTransManager;
import com.crrepa.ble.spp.hisilicon.write.SPPMessage;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.v1;
import com.crrepa.g1.h;
import com.crrepa.m.f;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List<CRPLocalNavigationInfo> f13794a;

    /* renamed from: b, reason: collision with root package name */
    private CRPLocalNavigationInfo f13795b;

    /* renamed from: c, reason: collision with root package name */
    private String f13796c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13797d;

    /* renamed from: e, reason: collision with root package name */
    private final CRPSPPFileTransListener f13798e;

    /* renamed from: f, reason: collision with root package name */
    private final CRPSPPConnectChangeListener f13799f;

    /* renamed from: com.crrepa.t.a$a, reason: collision with other inner class name */
    class C0243a implements PicZipEventCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13800a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13801b;

        C0243a(String str, String str2) {
            this.f13800a = str;
            this.f13801b = str2;
        }

        @Override // com.compress.api.PicZipEventCallback
        public void compressRets(int i8, int i9, int i10, byte[] bArr) {
            File file = new File(com.crrepa.g1.d.a().getCacheDir(), this.f13800a);
            if (file.exists()) {
                file.delete();
            }
            h.a(bArr, file);
            SPPMessage sPPMessage = new SPPMessage(file, HisiliconFileType.NORMAL, a.this.f13798e);
            sPPMessage.setUploadPath(this.f13801b);
            CRPHisiliconSPPManager.getInstance().send(sPPMessage);
            a.this.f13796c = this.f13801b;
        }

        @Override // com.compress.api.PicZipEventCallback
        public void deCompressRets(int i8, int i9, DecompressRet decompressRet) {
        }
    }

    class b implements CRPSPPFileTransListener {
        b() {
        }

        @Override // com.crrepa.ble.spp.hisilicon.write.CRPSPPFileTransListener
        public void onComplete() {
            a.this.a(true);
        }

        @Override // com.crrepa.ble.spp.hisilicon.write.CRPSPPFileTransListener
        public void onError(int i8) {
            BleLog.d("navigation spp file trans error: " + i8);
            a.this.a(false);
        }

        @Override // com.crrepa.ble.spp.hisilicon.write.CRPSPPFileTransListener
        public void onStart() {
            BleLog.d("navigation spp file trans start");
        }

        @Override // com.crrepa.ble.spp.hisilicon.write.CRPSPPFileTransListener
        public void onTransProgress(int i8) {
            BleLog.d("navigation spp file trans progress: " + i8);
        }
    }

    class c implements CRPSPPConnectChangeListener {
        c() {
        }

        @Override // com.crrepa.ble.spp.hisilicon.CRPSPPConnectChangeListener
        public void onConnectionStateChanged(int i8) {
            BleLog.d("navigation spp connection state: " + i8);
            if (i8 == 2) {
                a.this.c();
            }
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final a f13805a = new a(null);

        private d() {
        }
    }

    private a() {
        this.f13794a = new ArrayList();
        this.f13797d = false;
        this.f13798e = new b();
        this.f13799f = new c();
    }

    private void b() {
        this.f13796c = "";
        this.f13794a.clear();
        this.f13795b = null;
        this.f13797d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        try {
            if (!this.f13797d && !this.f13794a.isEmpty()) {
                CRPLocalNavigationInfo remove = this.f13794a.remove(0);
                this.f13795b = remove;
                if (remove != null && !remove.isEmpty()) {
                    String destPath = this.f13795b.getDestPath();
                    if (!destPath.endsWith("/")) {
                        destPath = destPath + "/";
                    }
                    File iconFile = this.f13795b.getIconFile();
                    String str = destPath + iconFile.getName();
                    BleLog.d("navigation uploadPath: " + str);
                    this.f13795b.getNavigationBean().setIconPath(str);
                    this.f13797d = true;
                    if (TextUtils.equals(this.f13796c, str)) {
                        BleLog.d("navigation uploadPath is same");
                        a(true);
                    } else {
                        com.crrepa.u0.c.a().a(new C0243a(iconFile.getName(), str));
                        com.crrepa.u0.c.a().a(BitmapFactory.decodeFile(iconFile.getAbsolutePath()));
                    }
                    return;
                }
                BleLog.d("navigationInfo is null");
                a(false);
                return;
            }
            BleLog.d("navigation is sending or navigationInfoList is empty");
        } catch (Throwable th) {
            throw th;
        }
    }

    public void d() {
        b();
        CRPHisiliconSPPManager.getInstance().connect(com.crrepa.g1.d.b(), this.f13799f);
    }

    public void e() {
        b();
        SPPFileTransManager.getInstance().stop();
        CRPHisiliconSPPManager.getInstance().disconnect();
    }

    /* synthetic */ a(C0243a c0243a) {
        this();
    }

    public static a a() {
        return d.f13805a;
    }

    public void a(CRPLocalNavigationInfo cRPLocalNavigationInfo) {
        this.f13794a.add(cRPLocalNavigationInfo);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z7) {
        try {
            BleLog.d("navigation spp file trans success: " + z7);
            this.f13797d = false;
            if (z7) {
                f.e().c(v1.a(this.f13795b.getNavigationBean()));
            }
            c();
        } catch (Throwable th) {
            throw th;
        }
    }
}
