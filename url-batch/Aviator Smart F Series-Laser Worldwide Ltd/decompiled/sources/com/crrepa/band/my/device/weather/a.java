package com.crrepa.band.my.device.weather;

import android.content.Context;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.health.bodytemperature.model.TemperatureUnitChangeEvent;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.crrepa.ble.conn.listener.CRPWeatherChangeListener;
import com.orhanobut.logger.f;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class a implements CRPWeatherChangeListener {
    private Context context;

    public a(Context context) {
        this.context = context;
    }

    private void sendWeather() {
        i4.getInstance().sendWeatherInfo(this.context);
    }

    @Override // com.crrepa.ble.conn.listener.CRPWeatherChangeListener
    public void onTempUnitChange(int i8) {
        f.d("onTempUnitChange: " + i8);
        if (i8 < 0 || 1 < i8) {
            return;
        }
        if (BandTempSystemProvider.getTempSystem() != i8) {
            sendWeather();
        }
        BandTempSystemProvider.setTempSystem(i8);
        c.getDefault().post(new TemperatureUnitChangeEvent(i8));
    }

    @Override // com.crrepa.ble.conn.listener.CRPWeatherChangeListener
    public void onUpdateWeather() {
        sendWeather();
    }
}
