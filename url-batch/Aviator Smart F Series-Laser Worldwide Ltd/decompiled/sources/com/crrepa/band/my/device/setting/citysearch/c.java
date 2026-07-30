package com.crrepa.band.my.device.setting.citysearch;

import com.crrepa.band.my.device.watchface.model.BaseResponseBean;
import com.crrepa.band.my.model.net.CitySearchEntity;
import com.moyoung.dafit.module.common.baseui.f;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

/* loaded from: classes2.dex */
public class c implements f {
    private d netCitySearchView;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchCity$0(BaseResponseBean baseResponseBean) {
        showCityList((List) baseResponseBean.getData());
    }

    private void showCityList(List<CitySearchEntity> list) {
        this.netCitySearchView.renderSearchCityList(list);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.netCitySearchView = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void searchCity(String str) {
        com.crrepa.band.my.device.net.b.getInstance().getApiStores().getSearchCityList(str).subscribeOn(Schedulers.io()).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.setting.citysearch.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.this.lambda$searchCity$0((BaseResponseBean) obj);
            }
        });
    }

    public void setView(d dVar) {
        this.netCitySearchView = dVar;
    }
}
