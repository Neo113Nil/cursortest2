package com.crrepa.ble.trans.tp;

import android.text.TextUtils;
import com.crrepa.ble.conn.listener.CRPTransListener;
import com.crrepa.ble.trans.upgrade.bean.FirmwareVersionInfo;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.h;
import com.crrepa.g1.j;
import com.crrepa.l.b;
import com.crrepa.w0.d;
import com.crrepa.y.c;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public class TPFileDownloader {
    /* JADX INFO: Access modifiers changed from: private */
    public void onDownloadError(CRPTransListener cRPTransListener, int i8) {
        cRPTransListener.onError(i8);
    }

    private void startDownloadFile(final CRPTransListener cRPTransListener, final m4.a aVar, FirmwareVersionInfo firmwareVersionInfo) {
        final String tp_bin_md5 = firmwareVersionInfo.getTp_bin_md5();
        String tp_bin_path = firmwareVersionInfo.getTp_bin_path();
        com.crrepa.x.a.a(tp_bin_path, new c(d.f13974b, tp_bin_path.substring(tp_bin_path.lastIndexOf("/"))) { // from class: com.crrepa.ble.trans.tp.TPFileDownloader.1
            @Override // com.crrepa.y.a
            public void onFailure(int i8, String str) {
                BleLog.i(str);
                TPFileDownloader.this.onDownloadError(cRPTransListener, 3);
            }

            @Override // com.crrepa.y.a
            public void onResponse(Object obj) {
                if (obj instanceof File) {
                    File file = (File) obj;
                    if (j.a(tp_bin_md5, file)) {
                        aVar.onComplete(file.getPath());
                        return;
                    }
                }
                TPFileDownloader.this.onDownloadError(cRPTransListener, 3);
            }
        });
    }

    public void downloadFile(CRPTransListener cRPTransListener, m4.a aVar) {
        FirmwareVersionInfo a8 = b.b().a();
        if (a8 == null || TextUtils.isEmpty(a8.getTp_bin_path()) || TextUtils.isEmpty(a8.getTp_bin_md5())) {
            onDownloadError(cRPTransListener, 1);
            return;
        }
        String tp_bin_md5 = a8.getTp_bin_md5();
        File file = new File(d.f13974b);
        try {
            File a9 = h.a(file, tp_bin_md5);
            if (a9 != null) {
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
        startDownloadFile(cRPTransListener, aVar, a8);
    }
}
