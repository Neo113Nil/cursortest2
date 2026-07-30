package com.crrepa.band.my.profile.userinfo.wheelpicker.widgets;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.crrepa.band.my.profile.userinfo.wheelpicker.model.City;
import com.crrepa.band.my.profile.userinfo.wheelpicker.model.Province;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class WheelAreaPicker extends LinearLayout implements com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.a {
    private static final float ITEM_TEXT_SIZE = 18.0f;
    private static final int PROVINCE_INITIAL_INDEX = 0;
    private static final String SELECTED_ITEM_COLOR = "#353535";
    private AssetManager mAssetManager;
    private List<City> mCityList;
    private List<String> mCityName;
    private Context mContext;
    private LinearLayout.LayoutParams mLayoutParams;
    private List<Province> mProvinceList;
    private List<String> mProvinceName;
    private WheelPicker mWPArea;
    private WheelPicker mWPCity;
    private WheelPicker mWPProvince;

    class a implements WheelPicker.a {
        a() {
        }

        @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
        public void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
            WheelAreaPicker wheelAreaPicker = WheelAreaPicker.this;
            wheelAreaPicker.mCityList = ((Province) wheelAreaPicker.mProvinceList.get(i8)).getCity();
            WheelAreaPicker.this.setCityAndAreaData(i8);
        }
    }

    class b implements WheelPicker.a {
        b() {
        }

        @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
        public void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
            WheelAreaPicker.this.mWPArea.setData(((City) WheelAreaPicker.this.mCityList.get(i8)).getArea());
        }
    }

    public WheelAreaPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initLayoutParams();
        initView(context);
        this.mProvinceList = getJsonDataFromAssets(this.mAssetManager);
        obtainProvinceData();
        addListenerToWheelPicker();
    }

    private void addListenerToWheelPicker() {
        this.mWPProvince.setOnItemSelectedListener(new a());
        this.mWPCity.setOnItemSelectedListener(new b());
    }

    private int dip2px(Context context, float f8) {
        return (int) ((f8 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private List<Province> getJsonDataFromAssets(AssetManager assetManager) {
        Exception e8;
        List<Province> list;
        ObjectInputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(assetManager.open("RegionJsonData.dat"));
            list = (List) objectInputStream.readObject();
        } catch (Exception e9) {
            e8 = e9;
            list = null;
        }
        try {
            objectInputStream.close();
        } catch (Exception e10) {
            e8 = e10;
            e8.printStackTrace();
            return list;
        }
        return list;
    }

    private void initLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mLayoutParams = layoutParams;
        layoutParams.setMargins(5, 5, 5, 5);
        this.mLayoutParams.width = 0;
    }

    private void initView(Context context) {
        setOrientation(0);
        this.mContext = context;
        this.mAssetManager = context.getAssets();
        this.mProvinceName = new ArrayList();
        this.mCityName = new ArrayList();
        this.mWPProvince = new WheelPicker(context);
        this.mWPCity = new WheelPicker(context);
        this.mWPArea = new WheelPicker(context);
        initWheelPicker(this.mWPProvince, 1.0f);
        initWheelPicker(this.mWPCity, 1.5f);
        initWheelPicker(this.mWPArea, 1.5f);
    }

    private void initWheelPicker(WheelPicker wheelPicker, float f8) {
        this.mLayoutParams.weight = f8;
        wheelPicker.setItemTextSize(dip2px(this.mContext, ITEM_TEXT_SIZE));
        wheelPicker.setSelectedItemTextColor(Color.parseColor(SELECTED_ITEM_COLOR));
        wheelPicker.setCurved(true);
        wheelPicker.setLayoutParams(this.mLayoutParams);
        addView(wheelPicker);
    }

    private void obtainProvinceData() {
        Iterator<Province> it = this.mProvinceList.iterator();
        while (it.hasNext()) {
            this.mProvinceName.add(it.next().getName());
        }
        this.mWPProvince.setData(this.mProvinceName);
        setCityAndAreaData(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityAndAreaData(int i8) {
        this.mCityList = this.mProvinceList.get(i8).getCity();
        this.mCityName.clear();
        Iterator<City> it = this.mCityList.iterator();
        while (it.hasNext()) {
            this.mCityName.add(it.next().getName());
        }
        this.mWPCity.setData(this.mCityName);
        this.mWPCity.setSelectedItemPosition(0);
        this.mWPArea.setData(this.mCityList.get(0).getArea());
        this.mWPArea.setSelectedItemPosition(0);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.a
    public String getArea() {
        return this.mCityList.get(this.mWPCity.getCurrentItemPosition()).getArea().get(this.mWPArea.getCurrentItemPosition());
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.a
    public String getCity() {
        return this.mCityList.get(this.mWPCity.getCurrentItemPosition()).getName();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.a
    public String getProvince() {
        return this.mProvinceList.get(this.mWPProvince.getCurrentItemPosition()).getName();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.a
    public void hideArea() {
        removeViewAt(2);
    }
}
