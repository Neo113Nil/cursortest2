package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.db.LocationCity;
import com.crrepa.band.my.model.db.proxy.LocationCityProxy;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandWeatherProvider {
    private static final boolean DEFAULT_STATE = true;

    private BandWeatherProvider() {
    }

    public static String getLocationCity() {
        LocationCity locationCity = new LocationCityProxy().get();
        if (locationCity == null) {
            return null;
        }
        return locationCity.getCity();
    }

    public static boolean getWeatherState() {
        return g.getInstance().getBoolean(BaseParamNames.SEND_WEATHER_STATE, true);
    }

    public static void saveWeatherState(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.SEND_WEATHER_STATE, z7);
    }
}
