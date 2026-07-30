package com.crrepa.band.my.training.presenter;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.ble.conn.bean.CRPHisiliconEpoInfo;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.type.CRPEpoType;
import java.io.File;

/* loaded from: classes3.dex */
public class c {
    private static final int EPO_DOWNLOAD_COUNT = 3;
    private static final String[] EPO_URL_ARRAY = {"https://acdn1.moyoung.com/agps/ELPO_GR3_1.DAT", "https://acdn1.moyoung.com/agps/ELPO_GAL_3.DAT", "https://acdn1.moyoung.com/agps/ELPO_BDS_3.DAT", "https://acdn1.moyoung.com/agps/f1e1G3.pgl", "https://acdn1.moyoung.com/agps/f1e1C3.pgl", "https://acdn1.moyoung.com/agps/f1e1E3.pgl", "https://acdn1.moyoung.com/agps/f1e1J3.pgl"};
    private static final String HISILICON_EPO_URL = "https://acdn1.moyoung.com/epo/pgnss_data.zip";
    private static final String TEMP_EPO_FILE_NAME = "epo.DAT";
    private int downloadIndex = 0;
    private boolean epoUploading = false;
    CRPFileTransListener fileTransListener = new b();

    class a extends com.liulishuo.filedownloader.k {
        final /* synthetic */ File val$epoFile;
        final /* synthetic */ CRPEpoType val$epoType;
        final /* synthetic */ CRPHisiliconEpoInfo val$info;
        final /* synthetic */ String val$url;

        a(CRPEpoType cRPEpoType, CRPHisiliconEpoInfo cRPHisiliconEpoInfo, String str, File file) {
            this.val$epoType = cRPEpoType;
            this.val$info = cRPHisiliconEpoInfo;
            this.val$url = str;
            this.val$epoFile = file;
        }

        @Override // com.liulishuo.filedownloader.k
        protected void completed(com.liulishuo.filedownloader.a aVar) {
            i4.getInstance().sendEpoFile(new File(aVar.getPath()), this.val$epoType, this.val$info, c.this.fileTransListener);
        }

        @Override // com.liulishuo.filedownloader.k
        protected void error(com.liulishuo.filedownloader.a aVar, Throwable th) {
            th.printStackTrace();
            c.this.downloadEpoFile(this.val$epoType, this.val$url, this.val$epoFile, this.val$info);
        }

        @Override // com.liulishuo.filedownloader.k
        protected void paused(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void pending(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void progress(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void warn(com.liulishuo.filedownloader.a aVar) {
        }
    }

    class b implements CRPFileTransListener {
        b() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            com.orhanobut.logger.f.d("onError: " + i8);
            c.this.epoUploading = false;
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            com.orhanobut.logger.f.d("onTransCompleted");
            c.this.epoUploading = false;
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            com.orhanobut.logger.f.d("onTransProgressChanged: " + i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadEpoFile(CRPEpoType cRPEpoType, String str, File file, CRPHisiliconEpoInfo cRPHisiliconEpoInfo) {
        com.orhanobut.logger.f.d("epoUploading: " + this.epoUploading);
        if (this.epoUploading) {
            return;
        }
        com.orhanobut.logger.f.d("epoFile: " + file.getPath());
        int i8 = this.downloadIndex + 1;
        this.downloadIndex = i8;
        if (3 < i8) {
            this.epoUploading = false;
            com.orhanobut.logger.f.d("downloadEpoFile: Download failed, the maximum number of downloads has been reached");
        } else {
            if (file.exists()) {
                file.delete();
            }
            this.epoUploading = true;
            new com.moyoung.dafit.module.common.imageload.a().donwloadFile(str, file.getPath(), new a(cRPEpoType, cRPHisiliconEpoInfo, str, file));
        }
    }

    @Nullable
    private static File getEpoFile(String str) {
        File file = new File(com.crrepa.band.my.a.getEpoDirPath());
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file, str);
        if (file2.exists()) {
            file2.delete();
        }
        return file2;
    }

    private String getEpoUrl(CRPEpoType cRPEpoType) {
        byte value = cRPEpoType.getValue();
        if (value < 0) {
            return null;
        }
        String[] strArr = EPO_URL_ARRAY;
        if (value >= strArr.length) {
            return null;
        }
        return strArr[value];
    }

    public void sendEpoFile(CRPEpoType cRPEpoType) {
        File epoFile;
        String epoUrl = getEpoUrl(cRPEpoType);
        if (TextUtils.isEmpty(epoUrl) || (epoFile = getEpoFile(TEMP_EPO_FILE_NAME)) == null) {
            return;
        }
        this.downloadIndex = 0;
        downloadEpoFile(cRPEpoType, epoUrl, epoFile, null);
    }

    public void sendHisiliconEpoFile(CRPHisiliconEpoInfo cRPHisiliconEpoInfo) {
        com.orhanobut.logger.f.d("sendHisiliconEpoFile: " + cRPHisiliconEpoInfo);
        File epoFile = getEpoFile(HISILICON_EPO_URL.substring(30));
        if (epoFile != null) {
            this.downloadIndex = 0;
            downloadEpoFile(CRPEpoType.HISILICON_GPS, HISILICON_EPO_URL, epoFile, cRPHisiliconEpoInfo);
        }
    }
}
