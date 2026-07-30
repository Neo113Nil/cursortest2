package com.crrepa.band.my.profile.appupgrade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandDisplayLanguageProvider;
import com.crrepa.band.my.model.db.proxy.LanguageDaoProxy;
import com.crrepa.band.my.model.net.NewAppEntity;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.liulishuo.filedownloader.k;
import com.liulishuo.filedownloader.s;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.q;
import com.orhanobut.logger.f;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class b {
    private static final String APK_FILE_PROVIDER = "com.crrepa.band.dafit.fileProvider";
    private static final String APK_TYPE = "application/vnd.android.package-archive";
    private static final String CHANNEL_GOOGLE = "google";
    private static final String CHANNEL_HUAWEI = "huawei";
    private static final String CHANNEL_INTERNAL = "internal";
    public static final String DEFAULT_CHANNEL_NAME = "debug";
    private final C0207b downloadListener;
    private NewAppEntity.DataBean newVersionInfo;
    private d newVersionListener;

    /* renamed from: com.crrepa.band.my.profile.appupgrade.b$b, reason: collision with other inner class name */
    static class C0207b extends k {
        private WeakReference<b> weakReference;

        public C0207b(b bVar) {
            this.weakReference = new WeakReference<>(bVar);
        }

        private void downloadFailed() {
            Context context = com.moyoung.dafit.module.common.utils.d.get();
            m1.a.showDownloadFailNotification(context, context.getString(R.string.app_download_failure));
        }

        @Override // com.liulishuo.filedownloader.k
        protected void completed(com.liulishuo.filedownloader.a aVar) {
            File file = new File(aVar.getPath());
            if (!file.exists()) {
                downloadFailed();
                return;
            }
            Context context = com.moyoung.dafit.module.common.utils.d.get();
            m1.a.hideDownloadFileNotification(context);
            b bVar = this.weakReference.get();
            if (bVar != null) {
                bVar.installApk(context, file);
            }
        }

        @Override // com.liulishuo.filedownloader.k
        protected void error(com.liulishuo.filedownloader.a aVar, Throwable th) {
            downloadFailed();
        }

        @Override // com.liulishuo.filedownloader.k
        protected void paused(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void pending(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void progress(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
            int i10 = (int) ((i8 / i9) * 100.0d);
            Context context = com.moyoung.dafit.module.common.utils.d.get();
            m1.a.showDownloadFileProgressNotification(context, String.format(context.getString(R.string.app_download_progress), Integer.valueOf(i10)));
        }

        @Override // com.liulishuo.filedownloader.k
        protected void warn(com.liulishuo.filedownloader.a aVar) {
        }
    }

    private static class c {
        private static final b INSTANCE = new b();

        private c() {
        }
    }

    public interface d {
        void onNewVersion(boolean z7, String str, String str2);
    }

    private String getChannelName(Context context) {
        return CHANNEL_GOOGLE;
    }

    private String getChannelUrl(String str) {
        str.hashCode();
        switch (str) {
            case "google":
                return "https://play.google.com/store/apps/details?id=%s";
            case "huawei":
                return "https://appgallery.huawei.com/app/C100316723";
            case "internal":
                return "https://sj.qq.com/appdetail/%s";
            default:
                return null;
        }
    }

    public static b getInstance() {
        return c.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void installApk(Context context, File file) {
        if (file.exists()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 24) {
                Uri uriForFile = FileProvider.getUriForFile(context, APK_FILE_PROVIDER, file);
                intent.addFlags(1);
                intent.setDataAndType(uriForFile, APK_TYPE);
            } else {
                intent.setDataAndType(Uri.fromFile(file), APK_TYPE);
            }
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkAppVersion$0(NewAppEntity newAppEntity) {
        f.d("newAppEntity: " + newAppEntity);
        g.getInstance().putLong(BaseParamNames.CHECK_APP_VERSION_TIME, System.currentTimeMillis());
        if (newAppEntity.getCode().intValue() != 0) {
            return;
        }
        NewAppEntity.DataBean data = newAppEntity.getData();
        if (data == null) {
            com.crrepa.band.my.profile.appupgrade.c.delete();
        } else if (data.getUpdate_type().intValue() != 2) {
            saveNewAppInfo(data);
            showUpgradeInfo(data);
        }
    }

    private void saveNewAppInfo(NewAppEntity.DataBean dataBean) {
        this.newVersionInfo = dataBean;
        com.crrepa.band.my.profile.appupgrade.c.saveUpdateType(dataBean.getUpdate_type().intValue());
        com.crrepa.band.my.profile.appupgrade.c.saveNewAppVersionCode(dataBean.getVersion_code().intValue());
    }

    private void showUpgradeInfo(NewAppEntity.DataBean dataBean) {
        d dVar;
        if (com.crrepa.band.my.profile.appupgrade.c.getIgnoreVersion() == dataBean.getVersion_code().intValue() || (dVar = this.newVersionListener) == null) {
            return;
        }
        dVar.onNewVersion(dataBean.getUpdate_type().intValue() == 1, dataBean.getVersion_name(), dataBean.getDetail());
    }

    private void startDownloadAppFile(Context context, String str) {
        File file = new File(com.crrepa.band.my.a.getAppPath());
        File file2 = new File(file, str.substring(str.lastIndexOf("/")));
        if (file2.exists()) {
            installApk(context, file2);
            return;
        }
        q.deleteAllFiles(file);
        s fileDownloader = com.moyoung.dafit.module.common.imageload.b.getInstance().getFileDownloader();
        fileDownloader.bindService();
        fileDownloader.create(str).setPath(file2.getPath()).setCallbackProgressTimes(200).setMinIntervalUpdateSpeed(200).setListener(this.downloadListener).start();
    }

    @SuppressLint({"CheckResult"})
    public void checkAppVersion(Context context) {
        if (com.crrepa.band.my.profile.appupgrade.c.isCheckNewVersion()) {
            try {
                String packageName = context.getPackageName();
                String valueOf = String.valueOf(context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
                String languageCode = new LanguageDaoProxy().getLanguageCode(BandDisplayLanguageProvider.getDisplayLanguage());
                String channelName = getChannelName(context);
                if (!TextUtils.isEmpty(packageName) && !TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(languageCode) && !TextUtils.isEmpty(channelName)) {
                    com.crrepa.band.my.profile.b.getInstance().getApiStores().checkAppVersion("dafit", packageName, valueOf, languageCode, channelName).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.profile.appupgrade.a
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            b.this.lambda$checkAppVersion$0((NewAppEntity) obj);
                        }
                    }, new com.crrepa.band.my.ble.band.config.b());
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public void ignoreVersion() {
        NewAppEntity.DataBean dataBean = this.newVersionInfo;
        if (dataBean != null) {
            com.crrepa.band.my.profile.appupgrade.c.saveIgnoreVersion(dataBean.getVersion_code().intValue());
        }
    }

    public void setNewVersionListener(d dVar) {
        this.newVersionListener = dVar;
    }

    public void startUpdate(Context context) {
        NewAppEntity.DataBean dataBean = this.newVersionInfo;
        if (dataBean == null) {
            return;
        }
        Integer intent_type = dataBean.getIntent_type();
        String android_url = this.newVersionInfo.getAndroid_url();
        if (intent_type == null || TextUtils.isEmpty(android_url)) {
            return;
        }
        if (intent_type.intValue() == 1) {
            startDownloadAppFile(context, android_url);
            return;
        }
        if (intent_type.intValue() == 2) {
            android_url = getChannelUrl(getChannelName(context));
        }
        if (TextUtils.isEmpty(android_url)) {
            return;
        }
        String format = String.format(android_url, context.getPackageName());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(format));
        context.startActivity(intent);
    }

    private b() {
        this.downloadListener = new C0207b(this);
    }
}
