package com.crrepa.band.my.device.weather.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.net.CitySearchEntity;

/* loaded from: classes2.dex */
public class NetCitySearchAdapter extends BaseQuickAdapter<CitySearchEntity, BaseViewHolder> {
    private static final String CN = ", CN";
    private static final String HK = "HK";
    private static final String MO = "MO";
    private static final String TW = "TW";
    private String searchName;

    public NetCitySearchAdapter() {
        super(R.layout.item_net_city_search);
    }

    public void setSearchName(String str) {
        this.searchName = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, CitySearchEntity citySearchEntity) {
        int i8;
        String qualifiedName = citySearchEntity.getQualifiedName();
        if (qualifiedName.endsWith(HK) || qualifiedName.endsWith(TW) || qualifiedName.endsWith(MO)) {
            qualifiedName = qualifiedName + CN;
        }
        boolean z7 = false;
        if (qualifiedName.toLowerCase().contains(this.searchName.toLowerCase())) {
            i8 = this.searchName.length();
            baseViewHolder.setText(R.id.tv_city_search_name, qualifiedName.substring(0, i8));
            z7 = true;
        } else {
            i8 = 0;
        }
        baseViewHolder.setGone(R.id.tv_city_search_name, true ^ z7);
        baseViewHolder.setText(R.id.tv_city_after_name, qualifiedName.substring(i8));
    }
}
