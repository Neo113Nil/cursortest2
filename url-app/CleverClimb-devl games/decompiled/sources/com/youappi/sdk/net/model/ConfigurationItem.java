package com.youappi.sdk.net.model;

import com.google.gson.a.c;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ConfigurationItem implements Serializable {

    @c(a = "appRequestIntervalMin")
    private int _appRequestIntervalMin;

    @c(a = "isRemoteLogging")
    @Deprecated
    private boolean _isRemoteLogging;

    @c(a = "logLevel")
    private String _logLevel;

    @c(a = "nextRequestIntervalSec")
    private long _nextRequestIntervalSec;

    @c(a = "numAdsPreload")
    private int _numAdsPreload;

    @c(a = "numDaysStoreServedCampaigns")
    private int _numDaysStoreServedCampaigns;

    @c(a = "numHoursAdsAvailable")
    @Deprecated
    private int _numHoursAdsAvailable;

    public int getAppRequestIntervalMin() {
        return this._appRequestIntervalMin;
    }

    public String getLogLevel() {
        return this._logLevel;
    }

    public long getNextRequestIntervalSec() {
        return this._nextRequestIntervalSec;
    }

    public int getNumAdsPreload() {
        return this._numAdsPreload;
    }

    public int getNumDaysStoreServedCampaigns() {
        return this._numDaysStoreServedCampaigns;
    }

    public int getNumHoursAdsAvailable() {
        return this._numHoursAdsAvailable;
    }

    public boolean isRemoteLogging() {
        return this._isRemoteLogging;
    }
}
