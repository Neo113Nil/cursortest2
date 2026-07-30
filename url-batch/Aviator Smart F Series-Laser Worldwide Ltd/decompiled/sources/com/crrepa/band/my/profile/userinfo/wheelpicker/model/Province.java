package com.crrepa.band.my.profile.userinfo.wheelpicker.model;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class Province implements Serializable {
    public List<City> city;
    public String name;

    public List<City> getCity() {
        return this.city;
    }

    public String getName() {
        return this.name;
    }

    public void setCity(List<City> list) {
        this.city = list;
    }

    public void setName(String str) {
        this.name = str;
    }
}
