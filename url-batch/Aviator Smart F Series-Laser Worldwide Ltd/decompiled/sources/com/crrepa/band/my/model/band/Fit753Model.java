package com.crrepa.band.my.model.band;

import android.widget.ImageView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.moyoung.dafit.module.common.utils.d;

/* loaded from: classes2.dex */
public class Fit753Model extends BaseBandModel {
    private static final String EPT_MY_BP_MODEL = "NO";

    public Fit753Model(String str, String str2) {
        super(str, str2);
    }

    private int[] getBandScreens() {
        int[] iArr = new int[3];
        iArr[0] = 2131232307;
        iArr[1] = 2131232308;
        if (isAlertHomePager()) {
            iArr[2] = 2131232310;
        } else {
            iArr[2] = 2131232309;
        }
        return iArr;
    }

    private boolean isAlertHomePager() {
        return getFirmwareVersionCode() >= 151;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public String getBandName() {
        return d.get().getString(R.string.band_fit753);
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
        return true;
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
        imageView.setImageResource(R$drawable.img_fit751);
    }
}
