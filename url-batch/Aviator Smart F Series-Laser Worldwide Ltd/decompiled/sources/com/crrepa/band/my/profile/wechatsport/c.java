package com.crrepa.band.my.profile.wechatsport;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public interface c {
    void renderWechatSportQrCode(Bitmap bitmap);

    void saveFail();

    void saveSuccess();

    void showNetError(int i8);

    void showNotBoundBand();

    void showQrCode();
}
