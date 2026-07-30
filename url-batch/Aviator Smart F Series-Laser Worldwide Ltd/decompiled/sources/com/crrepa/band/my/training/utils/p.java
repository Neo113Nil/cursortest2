package com.crrepa.band.my.training.utils;

import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.BaseBandModel;

/* loaded from: classes3.dex */
public class p {
    private p() {
    }

    public static int getStartTrainingHeartRateText() {
        return hasTrainingHeartRate() ? R.string.start_training : R.string.click_to_start_measure;
    }

    public static int getStopTrainingHeartRateText() {
        return hasTrainingHeartRate() ? R.string.stop_training : R.string.click_to_stop_measure;
    }

    public static int getTrainingHeartRateDataText() {
        return hasTrainingHeartRate() ? R.string.training_data : R.string.active_heart_rate;
    }

    public static int getTrainingHeartRateText() {
        return hasTrainingHeartRate() ? R.string.training : R.string.active_heart_rate;
    }

    private static boolean hasTrainingHeartRate() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.hasTrainingHeartRate();
    }
}
