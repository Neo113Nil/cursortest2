package com.moyoung.dafit.module.common.network;

import io.reactivex.Observable;
import r7.t;

/* loaded from: classes4.dex */
public interface d {
    public static final String BASE_PHONE_URL = "https://www.sogou.com/";

    @r7.f("reventondc/inner/vrapi?type=json&callback=show")
    Observable<String> queryIncomingNumber(@t("number") String str);
}
