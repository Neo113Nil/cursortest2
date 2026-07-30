package com.crrepa.s;

import com.crrepa.ble.conn.bean.CRPConnectKitMessage;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.spp.hisilicon.CRPHisiliconSPPManager;
import com.crrepa.ble.spp.hisilicon.CRPSPPConnectChangeListener;
import com.crrepa.ble.spp.hisilicon.write.CRPSPPFileTransListener;
import com.crrepa.ble.spp.hisilicon.write.HisiliconFileType;
import com.crrepa.ble.spp.hisilicon.write.SPPFileTransManager;
import com.crrepa.ble.spp.hisilicon.write.SPPMessage;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static final String f13761g = "internal://app";

    /* renamed from: h, reason: collision with root package name */
    private static final String f13762h = "/user/app/user/ace/data/";

    /* renamed from: a, reason: collision with root package name */
    private final List<CRPConnectKitMessage> f13763a;

    /* renamed from: b, reason: collision with root package name */
    private final List<CRPFileTransListener> f13764b;

    /* renamed from: c, reason: collision with root package name */
    private CRPConnectKitMessage f13765c;

    /* renamed from: d, reason: collision with root package name */
    private CRPFileTransListener f13766d;

    /* renamed from: e, reason: collision with root package name */
    private final CRPSPPFileTransListener f13767e;

    /* renamed from: f, reason: collision with root package name */
    private final CRPSPPConnectChangeListener f13768f;

    /* renamed from: com.crrepa.s.a$a, reason: collision with other inner class name */
    class C0242a implements CRPSPPFileTransListener {
        C0242a() {
        }

        @Override // com.crrepa.ble.spp.hisilicon.write.CRPSPPFileTransListener
        public void onComplete() {
            a.this.b(true);
        }

        @Override // com.crrepa.ble.spp.hisilicon.write.CRPSPPFileTransListener
        public void onError(int i8) {
            BleLog.d("connectkit spp file trans error: " + i8);
            a.this.b(false);
        }

        @Override // com.crrepa.ble.spp.hisilicon.write.CRPSPPFileTransListener
        public void onStart() {
            if (a.this.f13766d != null) {
                a.this.f13766d.onTransProgressStarting();
            }
        }

        @Override // com.crrepa.ble.spp.hisilicon.write.CRPSPPFileTransListener
        public void onTransProgress(int i8) {
            if (a.this.f13766d != null) {
                a.this.f13766d.onTransProgressChanged(i8);
            }
        }
    }

    class b implements CRPSPPConnectChangeListener {
        b() {
        }

        @Override // com.crrepa.ble.spp.hisilicon.CRPSPPConnectChangeListener
        public void onConnectionStateChanged(int i8) {
            BleLog.d("connectkit spp connection state: " + i8);
            if (i8 == 2) {
                a.this.c();
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final a f13771a = new a(null);

        private c() {
        }
    }

    private a() {
        this.f13763a = new ArrayList();
        this.f13764b = new ArrayList();
        this.f13767e = new C0242a();
        this.f13768f = new b();
    }

    public static a b() {
        return c.f13771a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        if (!this.f13763a.isEmpty() && !this.f13764b.isEmpty()) {
            this.f13765c = this.f13763a.remove(0);
            this.f13766d = this.f13764b.remove(0);
            String destPackageName = this.f13765c.getDestPackageName();
            File file = this.f13765c.getFile();
            String str = f13762h + destPackageName + this.f13765c.getDstFilePath() + file.getName();
            SPPMessage sPPMessage = new SPPMessage(file, HisiliconFileType.NORMAL, this.f13767e);
            sPPMessage.setUploadPath(str);
            CRPHisiliconSPPManager.getInstance().send(sPPMessage);
        }
    }

    /* synthetic */ a(C0242a c0242a) {
        this();
    }

    public void a() {
        SPPFileTransManager.getInstance().stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z7) {
        BleLog.d("connectkit spp file trans success: " + z7);
        if (z7) {
            this.f13765c.getDestPackageName();
            com.crrepa.s.b.a(this.f13765c, f13761g + this.f13765c.getDstFilePath() + this.f13765c.getFile().getName());
        } else {
            com.crrepa.s.c.a().a(this.f13765c);
        }
        a(z7);
        c();
    }

    public void a(CRPConnectKitMessage cRPConnectKitMessage, CRPFileTransListener cRPFileTransListener) {
        this.f13763a.add(cRPConnectKitMessage);
        this.f13764b.add(cRPFileTransListener);
        CRPHisiliconSPPManager.getInstance().connect(d.b(), this.f13768f);
    }

    private void a(boolean z7) {
        CRPFileTransListener cRPFileTransListener = this.f13766d;
        if (cRPFileTransListener != null) {
            if (z7) {
                cRPFileTransListener.onTransCompleted();
            } else {
                cRPFileTransListener.onError(4);
            }
        }
    }
}
