package com.anythink.core.mg.api;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.v.t;

/* loaded from: classes.dex */
public class MgAdInfo {
    private ATAdConst.CURRENCY currency = ATAdConst.CURRENCY.USD;
    private double ecpm;

    public static boolean isMgAdInfoValid(MgAdInfo mgAdInfo) {
        return mgAdInfo != null && mgAdInfo.getEcpm() > 0.0d;
    }

    public ATAdConst.CURRENCY getCurrency() {
        return this.currency;
    }

    public double getEcpm() {
        return this.ecpm;
    }

    public double getUSDEcpm() {
        return getEcpm(ATAdConst.CURRENCY.USD);
    }

    public void setCurrency(ATAdConst.CURRENCY currency) {
        this.currency = currency;
    }

    public void setEcpm(double d2) {
        this.ecpm = d2;
    }

    public String toString() {
        return "MgAdInfo{ecpm=" + this.ecpm + ", currency=" + this.currency + '}';
    }

    public double getEcpm(ATAdConst.CURRENCY currency) {
        return t.a(this.ecpm, this.currency, currency);
    }
}
