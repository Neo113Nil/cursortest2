package com.crrepa.band.my.model.band;

import android.widget.ImageView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.u;

/* loaded from: classes2.dex */
public class MYBandModel extends BaseBandModel {
    private static final String MY_MODEL = "NB";

    public MYBandModel(String str, String str2) {
        super(str, str2);
    }

    private int[] getBandScreens() {
        int[] iArr = new int[3];
        if (u.isZH()) {
            iArr[0] = 2131232303;
            iArr[1] = 2131232301;
            iArr[2] = 2131232305;
        } else {
            iArr[0] = 2131232304;
            iArr[1] = 2131232302;
            iArr[2] = 2131232306;
        }
        return iArr;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public String getBandName() {
        return d.get().getString(R.string.band_my_name);
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public int getWechatPid() {
        return 10131;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasBloodOxygen() {
        return false;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasBloodPressure() {
        return false;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasDynamicHeartRate() {
        return false;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public void loadAllBandWatchFace(ImageView... imageViewArr) {
        int[] bandScreens = getBandScreens();
        int length = bandScreens.length;
        for (int i8 = 0; i8 < imageViewArr.length; i8++) {
            imageViewArr[i8].setImageResource(bandScreens[i8 % length]);
        }
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public void setBandSnapshot(ImageView imageView) {
        imageView.setImageResource(R$drawable.img_myband);
    }
}
