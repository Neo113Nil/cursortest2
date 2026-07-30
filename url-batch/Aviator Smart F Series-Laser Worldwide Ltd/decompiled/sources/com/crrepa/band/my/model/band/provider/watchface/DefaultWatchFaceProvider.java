package com.crrepa.band.my.model.band.provider.watchface;

import android.text.TextUtils;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.picture.model.AIPictureModel;
import com.crrepa.band.my.model.WatchFaceModel;
import com.crrepa.band.my.model.db.DownloadWatchFace;
import com.crrepa.band.my.model.db.WatchFace;
import com.crrepa.band.my.model.db.proxy.DownloadWatchFaceDaoProxy;
import com.crrepa.band.my.model.db.proxy.WatchFaceDaoProxy;
import com.moyoung.dafit.module.common.network.provider.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DefaultWatchFaceProvider extends BaseWatchFaceProvider {
    public static WatchFace getWatchFace() {
        return new WatchFaceDaoProxy().getWatchFace(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
    }

    public static int getWatchFaceHeight() {
        WatchFace watchFace = getWatchFace();
        if (watchFace == null || watchFace.getHeight() == null) {
            return 240;
        }
        return watchFace.getHeight().intValue();
    }

    public static int getWatchFaceWidth() {
        WatchFace watchFace = getWatchFace();
        if (watchFace == null || watchFace.getWidth() == null) {
            return 240;
        }
        return watchFace.getWidth().intValue();
    }

    public static boolean isEmptyWatchFace(int i8) {
        return 65280 <= i8;
    }

    @Override // com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider
    public List<WatchFaceModel> getAllWatchFace() {
        ArrayList arrayList = new ArrayList();
        int i8 = 1;
        if (AIProvider.isSupportAIWatchFace()) {
            WatchFaceModel watchFaceModel = new WatchFaceModel(1, -1, WatchFaceModel.WatchFaceType.WATCH_FACE_AI, false);
            watchFaceModel.setUrl(g.getInstance().getString(AIPictureModel.SENT_AI_PICTURE_PATH, ""));
            arrayList.add(watchFaceModel);
            i8 = 2;
        }
        int defaultWatchFaceSize = getDefaultWatchFaceSize();
        for (int i9 = 0; i9 < defaultWatchFaceSize; i9++) {
            arrayList.add(new WatchFaceModel(i9 + i8, i9, getWatchFaceType(i9), isCustomizeWatchFace(i9)));
        }
        List<WatchFaceModel> downloadWatchFace = getDownloadWatchFace();
        if (downloadWatchFace != null && !downloadWatchFace.isEmpty()) {
            arrayList.addAll(downloadWatchFace);
        }
        com.orhanobut.logger.f.d("downloadWatchFaceList: " + downloadWatchFace);
        String watchFaceTpls = com.crrepa.band.my.device.watchface.presenter.g.getWatchFaceTpls();
        com.orhanobut.logger.f.d("tpls: " + watchFaceTpls);
        if (!TextUtils.isEmpty(watchFaceTpls) && (com.crrepa.band.my.ble.band.utils.a.getInstance().isMultipleDownloadWatchFace() || downloadWatchFace == null || downloadWatchFace.isEmpty())) {
            arrayList.add(new WatchFaceModel(-1, 65535, WatchFaceModel.WatchFaceType.WATCH_FACE_STORE, false));
        }
        return arrayList;
    }

    public int getDefaultWatchFaceSize() {
        List<String> list = this.watchFaceUrlList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider
    public List<WatchFaceModel> getDownloadWatchFace() {
        int i8 = AIProvider.isSupportAIWatchFace() ? 2 : 1;
        List<DownloadWatchFace> all = new DownloadWatchFaceDaoProxy().getAll();
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < all.size(); i9++) {
            DownloadWatchFace downloadWatchFace = all.get(i9);
            WatchFaceModel watchFaceModel = new WatchFaceModel(getDefaultWatchFaceSize() + i8 + i9, downloadWatchFace.getWatchFaceId().intValue(), WatchFaceModel.WatchFaceType.WATCH_FACE_STORE, false);
            watchFaceModel.setUrl(downloadWatchFace.getUrl());
            arrayList.add(watchFaceModel);
        }
        return arrayList;
    }

    @Override // com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider
    public int getDownloadWatchFaceIndex(boolean z7) {
        List<WatchFaceModel> downloadWatchFace;
        int defaultWatchFaceSize = getDefaultWatchFaceSize();
        int i8 = defaultWatchFaceSize + 1;
        if (AIProvider.isSupportAIWatchFace()) {
            i8 = defaultWatchFaceSize + 2;
        }
        return (!z7 || (downloadWatchFace = getDownloadWatchFace()) == null || downloadWatchFace.isEmpty()) ? i8 : i8 + downloadWatchFace.size();
    }

    @Override // com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider
    public void saveWatchFacePreview(int i8, String str) {
        long j8 = i8;
        DownloadWatchFace downloadWatchFace = this.downloadWatchFaceDaoProxy.get(j8);
        if (downloadWatchFace == null) {
            downloadWatchFace = new DownloadWatchFace();
            downloadWatchFace.setWatchFaceId(Long.valueOf(j8));
        }
        downloadWatchFace.setUrl(str);
        com.orhanobut.logger.f.d("savedId: " + this.downloadWatchFaceDaoProxy.insert(downloadWatchFace));
    }
}
