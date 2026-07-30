package com.crrepa.ble.trans.upgrade.presenter;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.baidu.ar.constants.HttpConstants;
import com.crrepa.ble.conn.bean.CRPFirmwareVersionInfo;
import com.crrepa.ble.conn.callback.CRPDeviceNewFirmwareVersionCallback;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.trans.upgrade.bean.FirmwareVersionInfo;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.h;
import com.crrepa.g1.i;
import com.crrepa.g1.j;
import com.crrepa.g1.k;
import com.crrepa.g1.m;
import com.crrepa.y.d;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class FirmwareUpgradePresenter {
    private static final String DEFAULT_APP_VERSION = "1.0.2";

    class a extends d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CRPDeviceNewFirmwareVersionCallback f12316a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12317b;

        a(CRPDeviceNewFirmwareVersionCallback cRPDeviceNewFirmwareVersionCallback, String str) {
            this.f12316a = cRPDeviceNewFirmwareVersionCallback;
            this.f12317b = str;
        }

        @Override // com.crrepa.y.a
        public void onFailure(int i8, String str) {
            BleLog.i("errorMessage: " + str);
            this.f12316a.onLatestVersion();
        }

        @Override // com.crrepa.y.a
        public void onResponse(Object obj) {
            try {
                if (obj instanceof String) {
                    String str = (String) obj;
                    BleLog.i("response: " + str);
                    FirmwareVersionInfo firmwareVersionInfo = (FirmwareVersionInfo) k.a(str, FirmwareVersionInfo.class);
                    if (firmwareVersionInfo != null && firmwareVersionInfo.getCode() == 0 && TextUtils.equals(i.a(this.f12317b), i.a(firmwareVersionInfo.getVersion()))) {
                        CRPFirmwareVersionInfo firmwareVersionInfo2 = FirmwareUpgradePresenter.this.getFirmwareVersionInfo(firmwareVersionInfo);
                        FirmwareUpgradePresenter.this.saveFirmwareInfo(firmwareVersionInfo);
                        this.f12316a.onNewFirmwareVersion(firmwareVersionInfo2);
                    }
                }
                this.f12316a.onLatestVersion();
            } catch (Exception e8) {
                e8.printStackTrace();
                this.f12316a.onLatestVersion();
            }
        }
    }

    class b extends com.crrepa.y.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CRPBleFirmwareUpgradeListener f12319a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12320b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m4.a f12321c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener, String str3, m4.a aVar) {
            super(str, str2);
            this.f12319a = cRPBleFirmwareUpgradeListener;
            this.f12320b = str3;
            this.f12321c = aVar;
        }

        @Override // com.crrepa.y.a
        public void onFailure(int i8, String str) {
            BleLog.i(str);
            FirmwareUpgradePresenter.this.onNetError(this.f12319a, 17, "Firmware download failed!");
        }

        @Override // com.crrepa.y.a
        public void onResponse(Object obj) {
            if (obj instanceof File) {
                File file = (File) obj;
                if (j.a(this.f12320b, file)) {
                    this.f12319a.onFirmwareDownloadComplete();
                    this.f12321c.onComplete(file.getPath());
                    return;
                }
            }
            FirmwareUpgradePresenter.this.onNetError(this.f12319a, 17, "Firmware download failed!");
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final FirmwareUpgradePresenter f12323a = new FirmwareUpgradePresenter(null);

        private c() {
        }
    }

    private FirmwareUpgradePresenter() {
    }

    /* synthetic */ FirmwareUpgradePresenter(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public CRPFirmwareVersionInfo getFirmwareVersionInfo(FirmwareVersionInfo firmwareVersionInfo) {
        return new CRPFirmwareVersionInfo(firmwareVersionInfo.getVersion(), firmwareVersionInfo.getLog(), firmwareVersionInfo.getLog_en(), firmwareVersionInfo.getType(), firmwareVersionInfo.getMcu(), firmwareVersionInfo.getTp_bin() > 0);
    }

    public static FirmwareUpgradePresenter getInstance() {
        return c.f12323a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNetError(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener, int i8, String str) {
        cRPBleFirmwareUpgradeListener.onError(i8, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveFirmwareInfo(FirmwareVersionInfo firmwareVersionInfo) {
        com.crrepa.l.b.b().a(firmwareVersionInfo);
    }

    private void startDownloadFirmwareFile(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener, m4.a aVar, FirmwareVersionInfo firmwareVersionInfo) {
        String md5 = firmwareVersionInfo.getMd5();
        String url = firmwareVersionInfo.getUrl();
        String substring = url.substring(url.lastIndexOf("/"));
        cRPBleFirmwareUpgradeListener.onFirmwareDownloadStarting();
        com.crrepa.x.a.a(url, new b(com.crrepa.w0.d.f13973a, substring, cRPBleFirmwareUpgradeListener, md5, aVar));
    }

    public void checkFirmwareVersion(String str, int i8, CRPDeviceNewFirmwareVersionCallback cRPDeviceNewFirmwareVersionCallback) {
        if (TextUtils.isEmpty(str) || !m.a()) {
            return;
        }
        String b8 = com.crrepa.g1.d.b();
        HashMap hashMap = new HashMap();
        hashMap.put("version", str);
        hashMap.put("mac", b8);
        hashMap.put(HttpConstants.APP_VERSION, DEFAULT_APP_VERSION);
        com.crrepa.x.a.b(i8 == 1 ? "https://api.moyoung.com/v2/upgrade/beta" : "https://api.moyoung.com/v2/upgrade/factory", hashMap, new a(cRPDeviceNewFirmwareVersionCallback, str));
    }

    public void downloadNewFirmware(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener, m4.a aVar) {
        FirmwareVersionInfo a8 = com.crrepa.l.b.b().a();
        if (a8 == null || TextUtils.isEmpty(a8.getUrl()) || TextUtils.isEmpty(a8.getMd5())) {
            onNetError(cRPBleFirmwareUpgradeListener, 21, "Already the latest firmware version!");
            return;
        }
        String md5 = a8.getMd5();
        File file = new File(com.crrepa.w0.d.f13973a);
        try {
            File a9 = h.a(file, md5);
            if (a9 != null) {
                cRPBleFirmwareUpgradeListener.onFirmwareDownloadComplete();
                aVar.onComplete(a9.getPath());
                return;
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        h.a(file);
        if (!file.exists()) {
            file.mkdir();
        }
        startDownloadFirmwareFile(cRPBleFirmwareUpgradeListener, aVar, a8);
    }
}
