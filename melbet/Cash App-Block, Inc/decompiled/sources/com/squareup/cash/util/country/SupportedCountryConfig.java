package com.squareup.cash.util.country;

import com.squareup.cash.R;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;

/* loaded from: classes.dex */
public enum SupportedCountryConfig implements CountryConfig {
    US(Region.USA, Country.US, R.drawable.flag_united_states),
    GB(Region.GBR, Country.GB, R.drawable.flag_great_britain),
    CA(Region.CAN, Country.CA, R.drawable.flag_canada),
    AU(Region.AUS, Country.AU, R.drawable.flag_australia),
    IE(Region.XXL, Country.IE, R.drawable.flag_ireland),
    SV(Region.SLV, Country.SV, R.drawable.flag_elsalvador),
    AR(Region.ARG, Country.AR, R.drawable.flag_argentina),
    MX(Region.MEX, Country.MX, R.drawable.flag_mexico),
    CR(Region.CRI, Country.CR, R.drawable.flag_costa_rica),
    GT(Region.GTM, Country.GT, R.drawable.flag_guatemala),
    BM(Region.BMU, Country.BM, R.drawable.flag_bermuda),
    KE(Region.KEN, Country.KE, R.drawable.flag_kenya),
    BD(Region.BGD, Country.BG, R.drawable.flag_bangladesh),
    NG(Region.NGA, Country.NG, R.drawable.flag_nigeria);

    public final Country country;
    public final int flag;
    public final Region region;

    SupportedCountryConfig(Region region, Country country, int i) {
        this.region = region;
        this.country = country;
        this.flag = i;
    }

    @Override // com.squareup.cash.util.country.CountryConfig
    public final Country getCountry() {
        return this.country;
    }

    @Override // com.squareup.cash.util.country.CountryConfig
    public final Region getRegion() {
        return this.region;
    }
}
