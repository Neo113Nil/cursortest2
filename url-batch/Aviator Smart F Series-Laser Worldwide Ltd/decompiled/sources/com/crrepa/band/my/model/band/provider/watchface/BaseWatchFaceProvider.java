package com.crrepa.band.my.model.band.provider.watchface;

import android.accounts.NetworkErrorException;
import android.text.TextUtils;
import com.crrepa.band.my.device.watchface.model.BaseResponseBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceDetailBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceListBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFacePreviewBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceTagBean;
import com.crrepa.band.my.model.WatchFaceModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.crrepa.band.my.model.band.provider.BandStorageProvider;
import com.crrepa.band.my.model.db.DownloadWatchFace;
import com.crrepa.band.my.model.db.SupportWatchFace;
import com.crrepa.band.my.model.db.proxy.DownloadWatchFaceDaoProxy;
import com.crrepa.band.my.model.db.proxy.SupportWatchFaceDaoProxy;
import com.crrepa.band.my.model.net.SifliWatchFaceEntity;
import com.crrepa.band.my.model.net.SupportWatchFaceEntity;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.List;
import w1.h;

/* loaded from: classes2.dex */
public abstract class BaseWatchFaceProvider {
    public static final String API_VER = "api_ver";
    public static final String API_VER_ALL = "api_ver_all";
    public static final int DEFAULT_PAGE_COUNT = 20;
    public static final String FUNC_VER = "func_ver";
    public static final String FV = "fv";
    public static final String LANG = "lang";
    public static final String MAX_SIZE = "max_size";
    protected static final int NULL_WATCH_FACE_ID = 65280;
    public static final String PAGE_INDEX = "p";
    public static final String PER_PAGE = "per_page";
    public static final String TAG_ID = "tag_id";
    public static final String TESTED = "tested";
    public static final String TPLS = "tpls";
    private static final int WATCH_FACE_CUSTOM_PHOTO_VALUE = 3;
    private static final int WATCH_FACE_EDITED_VALUE = 1;
    public static final String WATCH_FACE_ID = "id";
    private static final int WATCH_FACE_VIDEO_VALUE = 2;
    private List<Integer> watchFaceConfigList;
    protected List<String> watchFaceUrlList;
    protected String bandName = com.crrepa.band.my.ble.band.utils.a.getInstance().getName();
    protected SupportWatchFaceDaoProxy watchFaceDaoProxy = new SupportWatchFaceDaoProxy();
    protected DownloadWatchFaceDaoProxy downloadWatchFaceDaoProxy = new DownloadWatchFaceDaoProxy();

    public BaseWatchFaceProvider() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand instanceof CustomizeBandModel) {
            CustomizeBandModel customizeBandModel = (CustomizeBandModel) connectBand;
            this.watchFaceUrlList = customizeBandModel.getBandWatchFaceUrls();
            com.orhanobut.logger.f.d("firmwareType:" + customizeBandModel.getFirmwareType() + ",watchFaceUrlList:" + this.watchFaceUrlList);
            this.watchFaceConfigList = customizeBandModel.getWatchFaceConfigList();
        }
    }

    private DownloadWatchFace getDownloadWatchFace(List<DownloadWatchFace> list, int i8) {
        if (list != null && !list.isEmpty()) {
            for (DownloadWatchFace downloadWatchFace : list) {
                if (downloadWatchFace.getWatchFaceId().longValue() == i8) {
                    return downloadWatchFace;
                }
            }
        }
        return null;
    }

    private static boolean hasApiAndFeature(com.crrepa.band.my.ble.band.utils.a aVar) {
        return aVar.isJieli() || aVar.isBluetrum() || aVar.isHisilicon();
    }

    private static boolean isNewWatchFaceStore(com.crrepa.band.my.ble.band.utils.a aVar) {
        return aVar.isJieli() || aVar.isRealtek8773() || aVar.isBluetrum() || aVar.isHisilicon();
    }

    private boolean isSameDownloadWatchFaceList(List<DownloadWatchFace> list, List<Integer> list2) {
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (list.get(i8).getWatchFaceId().intValue() != list2.get(i8).intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getWatchFacePreview$0(StoreWatchFacePreviewBean storeWatchFacePreviewBean) {
        return (storeWatchFacePreviewBean == null || storeWatchFacePreviewBean.getCode().intValue() != 0) ? "" : storeWatchFacePreviewBean.getPreview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getWatchFacePreview$1(SifliWatchFaceEntity sifliWatchFaceEntity) {
        return (sifliWatchFaceEntity == null || sifliWatchFaceEntity.getCode() != 0) ? "" : sifliWatchFaceEntity.getData().getPreview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getWatchFacePreview$2(SupportWatchFaceEntity supportWatchFaceEntity) {
        return (supportWatchFaceEntity == null || supportWatchFaceEntity.getCode() != 0) ? "" : supportWatchFaceEntity.getPreview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$pushDownloadsV3$3(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$pushDownloadsV3$4(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$pushDownloadsV3$5(String str) {
        return str;
    }

    public void deleteAllDownlaodWatchFace() {
        this.downloadWatchFaceDaoProxy.deleteAll();
    }

    public void deleteDownloadWatchFace(int... iArr) {
        this.downloadWatchFaceDaoProxy.delete(iArr);
    }

    public abstract List<WatchFaceModel> getAllWatchFace();

    public abstract List<WatchFaceModel> getDownloadWatchFace();

    public abstract int getDownloadWatchFaceIndex(boolean z7);

    public SupportWatchFace getSavedWatchFace() {
        if (TextUtils.isEmpty(this.bandName)) {
            return null;
        }
        return this.watchFaceDaoProxy.get(this.bandName);
    }

    public Observable<StoreWatchFaceDetailBean> getStoreWatchFaceDetailV3(int i8, String str, String str2, String str3) {
        com.crrepa.band.my.profile.a apiStores = com.crrepa.band.my.profile.b.getInstance().getApiStores();
        int maxStorage = BandStorageProvider.getMaxStorage();
        com.crrepa.band.my.ble.band.utils.a aVar = com.crrepa.band.my.ble.band.utils.a.getInstance();
        if (!isNewWatchFaceStore(aVar)) {
            return com.crrepa.band.my.ble.band.utils.a.getInstance().isSifli() ? apiStores.getSifliWatchFaceDetail(i8, str).map(new Function<BaseResponseBean<StoreWatchFaceDetailBean>, StoreWatchFaceDetailBean>() { // from class: com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider.8
                @Override // io.reactivex.functions.Function
                public StoreWatchFaceDetailBean apply(BaseResponseBean<StoreWatchFaceDetailBean> baseResponseBean) {
                    if (baseResponseBean == null || baseResponseBean.getCode() != 0) {
                        throw new NetworkErrorException("net error");
                    }
                    return baseResponseBean.getData();
                }
            }) : apiStores.getStoreWatchFaceDetailV3(i8, str, str2, str3, maxStorage).map(new Function<BaseResponseBean<StoreWatchFaceDetailBean>, StoreWatchFaceDetailBean>() { // from class: com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider.9
                @Override // io.reactivex.functions.Function
                public StoreWatchFaceDetailBean apply(BaseResponseBean<StoreWatchFaceDetailBean> baseResponseBean) {
                    if (baseResponseBean == null || baseResponseBean.getCode() != 0) {
                        throw new NetworkErrorException("net error");
                    }
                    return baseResponseBean.getData();
                }
            });
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LANG, str);
        hashMap.put(FV, str2);
        hashMap.put(MAX_SIZE, String.valueOf(maxStorage));
        hashMap.put("id", String.valueOf(i8));
        if (hasApiAndFeature(aVar)) {
            hashMap.put(API_VER, String.valueOf(JieliWatchFaceProvider.getWatchFaceApi()));
            hashMap.put(FUNC_VER, String.valueOf(JieliWatchFaceProvider.getWatchFaceFeature()));
        }
        return apiStores.getNewWatchFaceDetail(hashMap).map(new Function<BaseResponseBean<StoreWatchFaceDetailBean>, StoreWatchFaceDetailBean>() { // from class: com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider.7
            @Override // io.reactivex.functions.Function
            public StoreWatchFaceDetailBean apply(BaseResponseBean<StoreWatchFaceDetailBean> baseResponseBean) {
                if (baseResponseBean == null || baseResponseBean.getCode() != 0) {
                    throw new NetworkErrorException("net error");
                }
                return baseResponseBean.getData();
            }
        });
    }

    public Observable<List<StoreWatchFaceBean>> getStoreWatchFaceListV3(String str, int i8, String str2, String str3, int i9, String str4, String str5) {
        com.crrepa.band.my.profile.a apiStores = com.crrepa.band.my.profile.b.getInstance().getApiStores();
        int maxStorage = BandStorageProvider.getMaxStorage();
        com.crrepa.band.my.ble.band.utils.a aVar = com.crrepa.band.my.ble.band.utils.a.getInstance();
        if (!isNewWatchFaceStore(aVar)) {
            return com.crrepa.band.my.ble.band.utils.a.getInstance().isSifli() ? apiStores.getStoreSifliWatchFaceList(str, "", str2, i8, str3, 20, i9, maxStorage, str4, str5).map(new Function<BaseResponseBean<List<StoreWatchFaceBean>>, List<StoreWatchFaceBean>>() { // from class: com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider.5
                @Override // io.reactivex.functions.Function
                public List<StoreWatchFaceBean> apply(BaseResponseBean<List<StoreWatchFaceBean>> baseResponseBean) {
                    if (baseResponseBean == null || baseResponseBean.getFaces() == null || baseResponseBean.getCode() != 0) {
                        throw new NetworkErrorException("net error");
                    }
                    return baseResponseBean.getFaces();
                }
            }) : apiStores.getStoreWatchFaceListV3(str, i8, str2, str3, 20, i9, maxStorage, str4, str5).map(new Function<BaseResponseBean<StoreWatchFaceListBean>, List<StoreWatchFaceBean>>() { // from class: com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider.6
                @Override // io.reactivex.functions.Function
                public List<StoreWatchFaceBean> apply(BaseResponseBean<StoreWatchFaceListBean> baseResponseBean) {
                    if (baseResponseBean == null || baseResponseBean.getData() == null || baseResponseBean.getCode() != 0) {
                        throw new NetworkErrorException("net error");
                    }
                    return baseResponseBean.getData().getFaces();
                }
            });
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LANG, str5);
        hashMap.put(TPLS, str);
        hashMap.put(FV, str3);
        hashMap.put(MAX_SIZE, String.valueOf(maxStorage));
        hashMap.put("p", String.valueOf(i9));
        hashMap.put(PER_PAGE, String.valueOf(20));
        hashMap.put(TAG_ID, String.valueOf(i8));
        hashMap.put(TESTED, str2);
        if (hasApiAndFeature(aVar)) {
            hashMap.put(API_VER, String.valueOf(JieliWatchFaceProvider.getWatchFaceApi()));
            hashMap.put(FUNC_VER, String.valueOf(JieliWatchFaceProvider.getWatchFaceFeature()));
        }
        if (aVar.isBluetrum()) {
            hashMap.put(API_VER_ALL, JieliWatchFaceProvider.getWatchFaceConfig());
        }
        return apiStores.getStoreJieliWatchFaceListV3(hashMap).map(new Function<BaseResponseBean<List<StoreWatchFaceBean>>, List<StoreWatchFaceBean>>() { // from class: com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider.4
            @Override // io.reactivex.functions.Function
            public List<StoreWatchFaceBean> apply(BaseResponseBean<List<StoreWatchFaceBean>> baseResponseBean) {
                if (baseResponseBean == null || baseResponseBean.getData() == null || baseResponseBean.getCode() != 0) {
                    throw new NetworkErrorException("net error");
                }
                return baseResponseBean.getData();
            }
        });
    }

    public Observable<List<StoreWatchFaceTagBean>> getStoreWatchFaceTagListV3(String str, String str2, String str3, int i8) {
        com.crrepa.band.my.profile.a apiStores = com.crrepa.band.my.profile.b.getInstance().getApiStores();
        int maxStorage = BandStorageProvider.getMaxStorage();
        com.crrepa.band.my.ble.band.utils.a aVar = com.crrepa.band.my.ble.band.utils.a.getInstance();
        if (!isNewWatchFaceStore(aVar)) {
            return com.crrepa.band.my.ble.band.utils.a.getInstance().isSifli() ? apiStores.getStoreSifliWatchFaceTagListV3(str, str2, str3, 20, i8, "yes", maxStorage).map(new Function<BaseResponseBean<List<StoreWatchFaceTagBean>>, List<StoreWatchFaceTagBean>>() { // from class: com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider.2
                @Override // io.reactivex.functions.Function
                public List<StoreWatchFaceTagBean> apply(BaseResponseBean<List<StoreWatchFaceTagBean>> baseResponseBean) {
                    if (baseResponseBean == null || baseResponseBean.getCode() != 0) {
                        throw new NetworkErrorException("net error");
                    }
                    return baseResponseBean.getData();
                }
            }) : apiStores.getStoreWatchFaceTagListV3(str, str2, str3, 20, i8, "yes", "", maxStorage).map(new Function<BaseResponseBean<List<StoreWatchFaceTagBean>>, List<StoreWatchFaceTagBean>>() { // from class: com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider.3
                @Override // io.reactivex.functions.Function
                public List<StoreWatchFaceTagBean> apply(BaseResponseBean<List<StoreWatchFaceTagBean>> baseResponseBean) {
                    if (baseResponseBean == null || baseResponseBean.getCode() != 0) {
                        throw new NetworkErrorException("net error");
                    }
                    return baseResponseBean.getData();
                }
            });
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LANG, str);
        hashMap.put(TPLS, str2);
        hashMap.put(FV, str3);
        hashMap.put(MAX_SIZE, String.valueOf(maxStorage));
        hashMap.put("p", String.valueOf(i8));
        hashMap.put(PER_PAGE, String.valueOf(20));
        if (hasApiAndFeature(aVar)) {
            hashMap.put(API_VER, String.valueOf(JieliWatchFaceProvider.getWatchFaceApi()));
            hashMap.put(FUNC_VER, String.valueOf(JieliWatchFaceProvider.getWatchFaceFeature()));
        }
        if (aVar.isBluetrum() || aVar.isHisilicon()) {
            hashMap.put(API_VER_ALL, JieliWatchFaceProvider.getWatchFaceConfig());
        }
        return apiStores.getStoreNewWatchFaceTagListV3(hashMap).map(new Function<BaseResponseBean<List<StoreWatchFaceTagBean>>, List<StoreWatchFaceTagBean>>() { // from class: com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider.1
            @Override // io.reactivex.functions.Function
            public List<StoreWatchFaceTagBean> apply(BaseResponseBean<List<StoreWatchFaceTagBean>> baseResponseBean) {
                if (baseResponseBean == null || baseResponseBean.getCode() != 0) {
                    throw new NetworkErrorException("net error");
                }
                return baseResponseBean.getData();
            }
        });
    }

    public Observable<String> getWatchFacePreview(int i8) {
        com.orhanobut.logger.f.d("getWatchFacePreview: " + i8);
        if (i8 == 65535) {
            return Observable.just("");
        }
        com.crrepa.band.my.profile.a apiStores = com.crrepa.band.my.profile.b.getInstance().getApiStores();
        com.crrepa.band.my.ble.band.utils.a aVar = com.crrepa.band.my.ble.band.utils.a.getInstance();
        return isNewWatchFaceStore(aVar) ? apiStores.getNewWatchFaceDetail(i8).map(new Function() { // from class: com.crrepa.band.my.model.band.provider.watchface.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String lambda$getWatchFacePreview$0;
                lambda$getWatchFacePreview$0 = BaseWatchFaceProvider.lambda$getWatchFacePreview$0((StoreWatchFacePreviewBean) obj);
                return lambda$getWatchFacePreview$0;
            }
        }) : aVar.isSifli() ? apiStores.getSifliWatchFace(i8).map(new Function() { // from class: com.crrepa.band.my.model.band.provider.watchface.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String lambda$getWatchFacePreview$1;
                lambda$getWatchFacePreview$1 = BaseWatchFaceProvider.lambda$getWatchFacePreview$1((SifliWatchFaceEntity) obj);
                return lambda$getWatchFacePreview$1;
            }
        }) : apiStores.getWatchFace(i8).map(new Function() { // from class: com.crrepa.band.my.model.band.provider.watchface.f
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String lambda$getWatchFacePreview$2;
                lambda$getWatchFacePreview$2 = BaseWatchFaceProvider.lambda$getWatchFacePreview$2((SupportWatchFaceEntity) obj);
                return lambda$getWatchFacePreview$2;
            }
        });
    }

    protected WatchFaceModel.WatchFaceType getWatchFaceType(int i8) {
        return isVideoWatchFace(i8) ? WatchFaceModel.WatchFaceType.WATCH_FACE_VIDEO : isCustomPhotoWatchFace(i8) ? WatchFaceModel.WatchFaceType.WATCH_FACE_PHOTO : WatchFaceModel.WatchFaceType.WATCH_FACE_DEFAULT;
    }

    public boolean hasWatchFaceStore() {
        return com.crrepa.band.my.ble.band.utils.a.getInstance().hasWatchFaceStore();
    }

    protected boolean isCustomPhotoWatchFace(int i8) {
        return isSpecialWatchFace(3, i8);
    }

    protected boolean isCustomizeWatchFace(int i8) {
        return isSpecialWatchFace(1, i8);
    }

    protected boolean isSpecialWatchFace(int i8, int i9) {
        List<Integer> list = this.watchFaceConfigList;
        if (list == null) {
            return false;
        }
        return (i9 < list.size() ? this.watchFaceConfigList.get(i9).intValue() : 0) == i8;
    }

    protected boolean isVideoWatchFace(int i8) {
        return isSpecialWatchFace(2, i8);
    }

    public Observable<String> pushDownloadsV3(int i8, String str) {
        com.crrepa.band.my.profile.a apiStores = com.crrepa.band.my.profile.b.getInstance().getApiStores();
        com.crrepa.band.my.ble.band.utils.a aVar = com.crrepa.band.my.ble.band.utils.a.getInstance();
        return isNewWatchFaceStore(aVar) ? apiStores.pushNewDownloadsV3(i8, str).map(new Function() { // from class: com.crrepa.band.my.model.band.provider.watchface.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String lambda$pushDownloadsV3$3;
                lambda$pushDownloadsV3$3 = BaseWatchFaceProvider.lambda$pushDownloadsV3$3((String) obj);
                return lambda$pushDownloadsV3$3;
            }
        }) : aVar.isSifli() ? apiStores.pushSifliDownloadsV3(i8, str).map(new Function() { // from class: com.crrepa.band.my.model.band.provider.watchface.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String lambda$pushDownloadsV3$4;
                lambda$pushDownloadsV3$4 = BaseWatchFaceProvider.lambda$pushDownloadsV3$4((String) obj);
                return lambda$pushDownloadsV3$4;
            }
        }) : apiStores.pushDownloadsV3(i8, str).map(new Function() { // from class: com.crrepa.band.my.model.band.provider.watchface.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String lambda$pushDownloadsV3$5;
                lambda$pushDownloadsV3$5 = BaseWatchFaceProvider.lambda$pushDownloadsV3$5((String) obj);
                return lambda$pushDownloadsV3$5;
            }
        });
    }

    public void saveDownloadWatchFace(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            this.downloadWatchFaceDaoProxy.deleteAll();
            return;
        }
        List<DownloadWatchFace> all = this.downloadWatchFaceDaoProxy.getAll();
        if (isSameDownloadWatchFaceList(all, list)) {
            return;
        }
        this.downloadWatchFaceDaoProxy.deleteAll();
        for (int i8 = 0; i8 < list.size(); i8++) {
            int intValue = list.get(i8).intValue();
            if (intValue != 65535) {
                DownloadWatchFace downloadWatchFace = getDownloadWatchFace(all, intValue);
                if (downloadWatchFace == null) {
                    com.orhanobut.logger.f.d("save download watch face: " + intValue);
                    downloadWatchFace = new DownloadWatchFace();
                    downloadWatchFace.setWatchFaceId(Long.valueOf((long) intValue));
                }
                downloadWatchFace.setId(Long.valueOf(i8 + 1));
                this.downloadWatchFaceDaoProxy.insert(downloadWatchFace);
            }
        }
    }

    public abstract void saveWatchFacePreview(int i8, String str);

    public void saveWatchFaceStoreInfo(List<Integer> list) {
        SupportWatchFace savedWatchFace = getSavedWatchFace();
        if (savedWatchFace == null) {
            savedWatchFace = new SupportWatchFace();
            savedWatchFace.setBroadcastName(this.bandName);
        }
        String tplString = h.toTplString(list);
        com.orhanobut.logger.f.d("support watch face type: " + tplString);
        savedWatchFace.setTpls(tplString);
        this.watchFaceDaoProxy.save(savedWatchFace);
    }
}
