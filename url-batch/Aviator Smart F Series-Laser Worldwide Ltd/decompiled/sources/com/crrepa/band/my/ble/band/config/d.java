package com.crrepa.band.my.ble.band.config;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.crrepa.band.my.model.db.BandConfig;
import com.crrepa.band.my.model.db.Language;
import com.crrepa.band.my.model.db.proxy.BandConfigDaoProxy;
import com.crrepa.band.my.model.db.proxy.LanguageDaoProxy;
import com.crrepa.band.my.model.net.BandConfigEntity;
import com.crrepa.band.my.model.net.BandLanguageEntity;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.ServerLanguageUtil;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.s;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

/* loaded from: classes2.dex */
public class d {
    private static final int BAND_SUPPORT_FUNCTION = 1;
    private static final int DEFAULT_CONFIG_VERSION = 0;
    private LanguageDaoProxy languageDaoProxy = new LanguageDaoProxy();
    private BandConfigDaoProxy bandConfigDaoProxy = new BandConfigDaoProxy();

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(BandLanguageEntity bandLanguageEntity) {
            if (bandLanguageEntity == null || bandLanguageEntity.getCode() != 0) {
                return;
            }
            d.this.saveBandLanguage(bandLanguageEntity.getLangs());
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
        }
    }

    class c implements Action {
        final /* synthetic */ boolean val$localConfig;

        c(boolean z7) {
            this.val$localConfig = z7;
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            if (this.val$localConfig) {
                d.this.getNetBandLanguage();
            }
        }
    }

    @NonNull
    private String buildUrl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str + str2;
    }

    private void deleteBandConfig(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Integer num : list) {
            com.orhanobut.logger.f.d("delete config id: " + num);
            this.bandConfigDaoProxy.delete(num.intValue());
        }
    }

    private void getNetBandConfig() {
        int i8 = g.getInstance().getInt(BaseParamNames.BAND_CONFIG_VERSION, 0);
        com.orhanobut.logger.f.d("config version: " + i8);
        subscribeBandConfig(com.crrepa.band.my.device.net.b.getInstance().getApiStores().getBandConfig(i8), false);
        System.gc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getNetBandLanguage() {
        subscribeBandLanguage(com.crrepa.band.my.device.net.b.getInstance().getApiStores().getAllLanguage(), false);
    }

    private BandConfig getSavedBandConfig(List<BandConfig> list, int i8) {
        for (BandConfig bandConfig : list) {
            if (bandConfig.getBandId().intValue() == i8) {
                return bandConfig;
            }
        }
        return null;
    }

    private boolean hasBandConfigUpdate(BandConfigEntity.ListBean listBean, BandConfig bandConfig) {
        return bandConfig.getUpdateTime().intValue() < listBean.getUpdated_at() || TextUtils.isEmpty(bandConfig.getLanguages()) || bandConfig.getEnable() == null || bandConfig.getSportsMode() == null || bandConfig.getScreensConfig() == null || bandConfig.getLcm() == null || bandConfig.getEcg() == null || bandConfig.getMcu() == null || bandConfig.getWatchFaceStore() == null || bandConfig.getExtendMenu() == null || bandConfig.getMcuPlatform() == null || bandConfig.getShape() == null || bandConfig.getFaceNumber() == null;
    }

    private boolean isFunctionEnable(int i8) {
        return i8 == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribeBandConfig$0(BandConfigEntity bandConfigEntity) {
        if (bandConfigEntity == null || bandConfigEntity.getCode() != 0) {
            return;
        }
        saveBandConfig(bandConfigEntity);
        saveBandConfigVersion(bandConfigEntity.getV());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribeBandConfig$1(boolean z7) {
        if (z7) {
            com.orhanobut.logger.f.d("readBandConfig endtime: " + System.currentTimeMillis());
            getNetBandConfig();
            g.getInstance().putBoolean(BaseParamNames.LOAD_LOCAL_BAND_CONFIG, true);
        }
    }

    private void saveBandConfig(BandConfigEntity bandConfigEntity) {
        List<BandConfigEntity.ListBean> list = bandConfigEntity.getList();
        if (list != null && !list.isEmpty()) {
            List<BandConfig> all = this.bandConfigDaoProxy.getAll();
            com.orhanobut.logger.f.d("netBandConfigList: " + list.size());
            com.orhanobut.logger.f.d("savedBandConfigList: " + all.size());
            String url = bandConfigEntity.getUrl();
            com.orhanobut.logger.f.d("url urlPrefix: " + url);
            for (BandConfigEntity.ListBean listBean : list) {
                BandConfig savedBandConfig = getSavedBandConfig(all, listBean.getId());
                if (savedBandConfig == null || hasBandConfigUpdate(listBean, savedBandConfig)) {
                    try {
                        updateBandConfig(listBean, savedBandConfig, url);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
        deleteBandConfig(bandConfigEntity.getDeleted());
    }

    private void saveBandConfigVersion(int i8) {
        com.orhanobut.logger.f.d("save config version: " + i8);
        g.getInstance().putInt(BaseParamNames.BAND_CONFIG_VERSION, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveBandLanguage(List<BandLanguageEntity.LangsBean> list) {
        if (list == null) {
            return;
        }
        com.orhanobut.logger.f.d("language list size: " + list.size());
        for (BandLanguageEntity.LangsBean langsBean : list) {
            this.languageDaoProxy.insert(new Language(langsBean.getCode(), langsBean.getText(), Long.valueOf(langsBean.getCmd())));
        }
        g.getInstance().putString(ServerLanguageUtil.KEY_SERVER_LANGUAGE_CODE_JSON, new Gson().toJson(list));
    }

    private void subscribeBandConfig(Observable<BandConfigEntity> observable, final boolean z7) {
        if (observable == null) {
            return;
        }
        observable.subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.crrepa.band.my.ble.band.config.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                d.this.lambda$subscribeBandConfig$0((BandConfigEntity) obj);
            }
        }, new com.crrepa.band.my.ble.band.config.b(), new Action() { // from class: com.crrepa.band.my.ble.band.config.c
            @Override // io.reactivex.functions.Action
            public final void run() {
                d.this.lambda$subscribeBandConfig$1(z7);
            }
        });
    }

    private void subscribeBandLanguage(Observable<BandLanguageEntity> observable, boolean z7) {
        observable.subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new a(), new b(), new c(z7));
    }

    private void updateBandConfig(BandConfigEntity.ListBean listBean, BandConfig bandConfig, String str) {
        if (bandConfig == null) {
            bandConfig = new BandConfig();
        }
        bandConfig.setBandId(Integer.valueOf(listBean.getId()));
        bandConfig.setBroadcastName(listBean.getName());
        bandConfig.setFirmwareType(listBean.getVersion());
        bandConfig.setIcon(buildUrl(str, listBean.getLogo()));
        List<String> screens = listBean.getScreens();
        for (int i8 = 0; i8 < screens.size(); i8++) {
            screens.set(i8, buildUrl(str, screens.get(i8)));
        }
        bandConfig.setScreens(s.bean2Json(screens));
        bandConfig.setPid(Integer.valueOf(listBean.getPid()));
        bandConfig.setDyHeart(Boolean.valueOf(isFunctionEnable(listBean.getIs_dyheart())));
        bandConfig.setAllDayHeart(Boolean.valueOf(isFunctionEnable(listBean.getIs_24heart())));
        bandConfig.setOnceHeart(Boolean.valueOf(isFunctionEnable(listBean.getIs_heart())));
        bandConfig.setSportsMode(Integer.valueOf(listBean.getIs_sport()));
        bandConfig.setBp(Boolean.valueOf(isFunctionEnable(listBean.getIs_bp())));
        bandConfig.setBo(Boolean.valueOf(isFunctionEnable(listBean.getIs_bo())));
        bandConfig.setScreenSwitch(Boolean.valueOf(isFunctionEnable(listBean.getIs_screen())));
        bandConfig.setFunction(Boolean.valueOf(isFunctionEnable(listBean.getIs_func())));
        bandConfig.setGuide(Boolean.valueOf(isFunctionEnable(listBean.getIs_guide())));
        bandConfig.setWeather(Boolean.valueOf(isFunctionEnable(listBean.getIs_weather())));
        bandConfig.setEnable(Boolean.valueOf(isFunctionEnable(listBean.getStatus())));
        bandConfig.setUpdateTime(Long.valueOf(listBean.getUpdated_at()));
        bandConfig.setScreensConfig(s.bean2Json(listBean.getScreens_config()));
        bandConfig.setLcm(Integer.valueOf(listBean.getLcm()));
        bandConfig.setMcu(Integer.valueOf(listBean.getMcu()));
        bandConfig.setMcuPlatform(listBean.getChip());
        bandConfig.setWatchFaceStore(Boolean.valueOf(isFunctionEnable(listBean.getIs_faces())));
        bandConfig.setLanguages(s.bean2Json(listBean.getLanguages()));
        bandConfig.setEcg(Integer.valueOf(listBean.getIs_ecg()));
        bandConfig.setShape(Integer.valueOf(listBean.getShape()));
        bandConfig.setFaceNumber(Integer.valueOf(listBean.getFace_number()));
        bandConfig.setExtendMenu(s.bean2Json(listBean.getExtend_menu()));
        this.bandConfigDaoProxy.save(bandConfig);
    }

    public void setup(Context context) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() != null) {
            return;
        }
        if (g.getInstance().getBoolean(BaseParamNames.LOAD_LOCAL_BAND_CONFIG, false)) {
            if (a0.isNetworkConnected(context)) {
                getNetBandConfig();
                getNetBandLanguage();
                return;
            }
            return;
        }
        com.orhanobut.logger.f.e("Read the local configuration file.", new Object[0]);
        this.bandConfigDaoProxy.deleteAll();
        f fVar = new f();
        com.orhanobut.logger.f.d("readBandConfig starttime: " + System.currentTimeMillis());
        subscribeBandConfig(fVar.readBandConfig(context), true);
        subscribeBandLanguage(fVar.readBandLanguage(context), true);
    }
}
