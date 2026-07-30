package com.anythink.core.api;

import com.anythink.core.api.ATAdConst;
import java.util.Map;

/* loaded from: classes.dex */
public interface ATBiddingNotice {
    public static final String ADN_BID_LISTENER_OBJECT = "adn_bid_listener_object";
    public static final String ADN_EXTRA_NATIVE_MATERIAL_INFO = "adn_extra_native_material_info";
    public static final String ADN_EXTRA_NW_FIRM_ID = "adn_extra_nw_firm_id";
    public static final String ADN_ID = "adn_id";
    public static final String ADN_REQUEST_ID = "adn_request_id";
    public static final String ADN_REQUEST_IS_CLICK = "adn_is_click";
    public static final String ADN_REQUEST_IS_SHOW = "adn_is_show";
    public static final String ADN_TYPE = "adn_type";

    ATAdConst.CURRENCY getNoticePriceCurrency();

    void notifyBidDisplay(boolean z8, double d2);

    void notifyBidLoss(String str, double d2, Map<String, Object> map);

    void notifyBidWin(double d2, double d3, Map<String, Object> map);
}
