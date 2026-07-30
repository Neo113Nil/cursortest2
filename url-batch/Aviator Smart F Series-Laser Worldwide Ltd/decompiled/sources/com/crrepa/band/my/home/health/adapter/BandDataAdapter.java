package com.crrepa.band.my.home.health.adapter;

import android.content.Context;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.home.health.b;
import com.crrepa.band.my.model.BandDataTypeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q3.a;

/* loaded from: classes2.dex */
public class BandDataAdapter extends BaseMultiItemQuickAdapter<BandDataTypeModel, BaseViewHolder> {
    private Context context;
    private List<Integer> typeList;

    public BandDataAdapter(Context context, List<BandDataTypeModel> list) {
        super(list);
        this.typeList = new ArrayList();
        this.context = context;
        addItem(0, R.layout.item_today_date);
        addItem(1, R.layout.item_add_band);
        addItem(2, R.layout.item_band_step);
        addItem(3, R.layout.item_band_sleep);
        addItem(16, R.layout.item_band_active_heart_rate);
        addItem(4, R.layout.item_band_blood_pressure);
        addItem(5, R.layout.item_band_blood_oxygen);
        addItem(6, R.layout.item_band_ecg);
        addItem(17, R.layout.item_band_24_hours_heart_rate);
        addItem(18, R.layout.item_band_once_heart_rate);
        addItem(19, R.layout.item_band_24_hours_heart_rate);
        addItem(20, R.layout.item_band_timing_temp);
        addItem(21, R.layout.item_band_once_temp);
        addItem(22, R.layout.item_band_24_hours_heart_rate);
        addItem(23, R.layout.item_band_24_hours_heart_rate);
        addItem(25, R.layout.item_band_timing_stress);
        addItem(35, R.layout.item_band_physiological_cycle);
        addItem(34, R.layout.item_band_weight);
        addItem(36, R.layout.item_band_water);
        addItem(37, R.layout.item_band_training_record_sync);
        addItem(38, R.layout.item_band_exercise_capacity);
        addItem(39, R.layout.item_band_training_analysis);
        addItem(40, R.layout.item_band_training_recovery);
        addChildClickViewIds(R.id.btn_add_band, R.id.tv_not_display, R.id.iv_hide);
    }

    private void addItem(int i8, @LayoutRes int i9) {
        addItemType(i8, i9);
        this.typeList.add(Integer.valueOf(i8));
    }

    public void addBandDataItem(int i8) {
        Iterator it = getData().iterator();
        while (it.hasNext()) {
            if (((BandDataTypeModel) it.next()).getItemType() == i8) {
                return;
            }
        }
        if (this.typeList.contains(Integer.valueOf(i8))) {
            addData((BandDataAdapter) new BandDataTypeModel(i8));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setNewData(@Nullable List<BandDataTypeModel> list) {
        ArrayList arrayList = new ArrayList();
        for (BandDataTypeModel bandDataTypeModel : list) {
            if (this.typeList.contains(Integer.valueOf(bandDataTypeModel.getItemType()))) {
                arrayList.add(bandDataTypeModel);
            }
        }
        super.setNewData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, BandDataTypeModel bandDataTypeModel) {
        b create = a.create(this.context, baseViewHolder, bandDataTypeModel.getItemType());
        if (create != null) {
            create.bindViewHolder();
        }
    }
}
