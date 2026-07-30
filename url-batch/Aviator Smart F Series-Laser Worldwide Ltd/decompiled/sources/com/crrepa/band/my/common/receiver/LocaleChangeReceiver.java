package com.crrepa.band.my.common.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.ble.band.model.LocaleChangedEvent;
import com.crrepa.band.my.home.training.model.LanguageSwitchedEvent;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class LocaleChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        f.d("onReceive: " + intent.getAction());
        org.greenrobot.eventbus.c.getDefault().post(new LocaleChangedEvent());
        com.crrepa.band.my.ble.band.connect.a.connect();
        BandUnitSystemProvider.setUnitSystemOfLocale();
        BandTempSystemProvider.setBandTempSystemOfLocale();
        i4.getInstance().sendTempSystem(BandTempSystemProvider.getTempSystem());
        i4.getInstance().sendWeatherInfo(context);
        i4.getInstance().sendBandLanguage();
        org.greenrobot.eventbus.c.getDefault().post(new LanguageSwitchedEvent());
        i4.getInstance().sendWorldClockList();
    }
}
