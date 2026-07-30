package com.crrepa.band.my.device.setting.citysearch;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityCitySearchBinding;
import com.crrepa.band.my.device.weather.adapter.NetCitySearchAdapter;
import com.crrepa.band.my.model.db.LocationCity;
import com.crrepa.band.my.model.db.proxy.LocationCityProxy;
import com.crrepa.band.my.model.net.CitySearchEntity;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.s0;
import com.orhanobut.logger.f;
import java.util.List;

/* loaded from: classes2.dex */
public class NetCitySearchActivity extends BaseVBActivity<ActivityCitySearchBinding> implements d, OnItemClickListener {
    private final c netCitySearchPresenter = new c();
    private NetCitySearchAdapter citySearchAdapter = new NetCitySearchAdapter();

    class a implements SearchView.OnQueryTextListener {
        a() {
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            NetCitySearchActivity.this.searchCity(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) NetCitySearchActivity.class);
    }

    private String getCountyName(String str, String str2) {
        String[] split;
        String str3 = (TextUtils.isEmpty(str) || (split = str.split(", ")) == null || split.length <= 0) ? null : split[split.length - 1];
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    private void initCityList() {
        ((ActivityCitySearchBinding) this.binding).rcvCityList.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityCitySearchBinding) this.binding).rcvCityList.setHasFixedSize(true);
        ((ActivityCitySearchBinding) this.binding).rcvCityList.setAdapter(this.citySearchAdapter);
        this.citySearchAdapter.setOnItemClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    private void saveLocationCity(CitySearchEntity citySearchEntity) {
        LocationCityProxy locationCityProxy = new LocationCityProxy();
        LocationCity locationCity = locationCityProxy.get();
        if (locationCity == null) {
            locationCity = new LocationCity();
        }
        locationCity.setType(2);
        locationCity.setCity(citySearchEntity.getCity());
        locationCity.setCountry(getCountyName(citySearchEntity.getQualifiedName(), citySearchEntity.getCountry()));
        locationCity.setLatitude(Double.valueOf(citySearchEntity.getLat()));
        locationCity.setLongitude(Double.valueOf(citySearchEntity.getLon()));
        locationCity.setWoeid(Integer.valueOf(citySearchEntity.getWoeid()));
        locationCityProxy.insert(locationCity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void searchCity(String str) {
        f.d("city: " + str);
        if (TextUtils.isEmpty(str)) {
            this.citySearchAdapter.setNewData(null);
        } else {
            this.netCitySearchPresenter.searchCity(str);
            this.citySearchAdapter.setSearchName(str);
        }
    }

    private void setSearchViewTextListener() {
        ((ActivityCitySearchBinding) this.binding).searchview.setOnQueryTextListener(new a());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.netCitySearchPresenter.setView(this);
        k0.setColorNoTranslucent(this, -1);
        k0.setLightMode(this);
        initCityList();
        setSearchViewTextListener();
        ((EditText) ((ActivityCitySearchBinding) this.binding).searchview.findViewById(R.id.search_src_text)).setTextColor(ContextCompat.getColor(this, R.color.black));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityCitySearchBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.setting.citysearch.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NetCitySearchActivity.this.lambda$initOnClickListener$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.netCitySearchPresenter.destroy();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        saveLocationCity((CitySearchEntity) baseQuickAdapter.getData().get(i8));
        setResult(-1);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.netCitySearchPresenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.netCitySearchPresenter.resume();
        s0.logPage(getClass(), "城市列表页");
    }

    @Override // com.crrepa.band.my.device.setting.citysearch.d
    public void renderSearchCityList(List<CitySearchEntity> list) {
        this.citySearchAdapter.setNewData(list);
    }
}
