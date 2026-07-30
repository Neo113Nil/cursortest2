package com.crrepa.band.my.model.band;

import android.widget.ImageView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.u;

/* loaded from: classes2.dex */
public class Fit740Model extends BaseBandModel {
    private static final String EPT_XYP_BP_MODEL = "NM";

    public Fit740Model(String str, String str2) {
        super(str, str2);
    }

    private int[] getBandScreens() {
        int[] iArr = new int[3];
        if (u.isZH()) {
            iArr[0] = 2131232312;
            iArr[1] = 2131232311;
        } else {
            iArr[0] = 2131232311;
            iArr[1] = 2131232313;
        }
        iArr[2] = 2131232314;
        return iArr;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public String getBandName() {
        return d.get().getString(R.string.band_fit740);
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public int getWechatPid() {
        return 21108;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasBloodOxygen() {
        return false;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasBloodPressure() {
        return true;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasCustomFunction() {
        return getFirmwareVersionCode() >= 145;
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
        imageView.setImageResource(R$drawable.img_xyband);
    }
}
