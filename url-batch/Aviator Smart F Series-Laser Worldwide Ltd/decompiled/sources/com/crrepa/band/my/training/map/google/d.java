package com.crrepa.band.my.training.map.google;

import a1.e;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.crrepa.band.my.training.model.LocationCityInfo;
import com.orhanobut.logger.f;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public class d implements Function {
    private LocationCityInfo getLocality(double d8, double d9) {
        try {
            List<Address> fromLocation = new Geocoder(com.moyoung.dafit.module.common.utils.d.get()).getFromLocation(d8, d9, 1);
            if (fromLocation != null && !fromLocation.isEmpty()) {
                Address address = fromLocation.get(0);
                f.d("address: " + address.toString());
                String locality = address.getLocality();
                f.d("locality: " + locality);
                LocationCityInfo locationCityInfo = new LocationCityInfo(2);
                locationCityInfo.setCity(locality);
                String countryCode = address.getCountryCode();
                locationCityInfo.setCountry(countryCode);
                locationCityInfo.setLongitude(address.getLongitude());
                locationCityInfo.setLatitude(address.getLatitude());
                e.saveLastLocationCountryCode(countryCode);
                return locationCityInfo;
            }
            return null;
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    @Override // io.reactivex.functions.Function
    public LocationCityInfo apply(Location location) {
        if (location == null) {
            return null;
        }
        return getLocality(location.getLatitude(), location.getLongitude());
    }
}
