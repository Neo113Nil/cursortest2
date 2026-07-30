package com.crrepa.band.my.device.scan.adapter;

import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.orhanobut.logger.f;
import java.util.List;

/* loaded from: classes2.dex */
public class BandScanAdapter extends BaseQuickAdapter<BaseBandModel, BaseViewHolder> {
    public BandScanAdapter() {
        super(R.layout.item_band_scan);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(@NonNull BaseBandModel baseBandModel) {
        f.d("addData address: " + baseBandModel.getAddress());
        f.d("addData rssi: " + baseBandModel.getRssi());
        List<BaseBandModel> data = getData();
        int size = data.size();
        int i8 = 0;
        while (true) {
            if (i8 >= data.size()) {
                break;
            }
            if (data.get(i8).getRssi() < baseBandModel.getRssi()) {
                size = i8;
                break;
            }
            i8++;
        }
        addData(size, (int) baseBandModel);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, BaseBandModel baseBandModel) {
        f.d("convert: " + baseBandModel.getClass().getSimpleName());
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_band_snapshot);
        imageView.setImageDrawable(null);
        baseBandModel.setBandSnapshot(imageView);
        baseViewHolder.setText(R.id.tv_band_name, baseBandModel.getBandName());
        baseViewHolder.setText(R.id.tv_band_address, baseBandModel.getAddress());
    }
}
