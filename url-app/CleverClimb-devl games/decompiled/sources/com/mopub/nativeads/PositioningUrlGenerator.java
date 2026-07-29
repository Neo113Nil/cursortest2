package com.mopub.nativeads;

import android.content.Context;
import com.mopub.common.BaseUrlGenerator;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Constants;

/* loaded from: classes2.dex */
class PositioningUrlGenerator extends BaseUrlGenerator {
    private static final String POSITIONING_API_VERSION = "1";
    private String mAdUnitId;
    private final Context mContext;

    public PositioningUrlGenerator(Context context) {
        this.mContext = context;
    }

    public PositioningUrlGenerator withAdUnitId(String str) {
        this.mAdUnitId = str;
        return this;
    }

    @Override // com.mopub.common.BaseUrlGenerator
    public String generateUrlString(String str) {
        initUrlString(str, Constants.POSITIONING_HANDLER);
        setAdUnitId(this.mAdUnitId);
        setApiVersion("1");
        ClientMetadata clientMetadata = ClientMetadata.getInstance(this.mContext);
        setSdkVersion(clientMetadata.getSdkVersion());
        setDeviceInfo(clientMetadata.getDeviceManufacturer(), clientMetadata.getDeviceModel(), clientMetadata.getDeviceProduct());
        setAppVersion(clientMetadata.getAppVersion());
        appendAdvertisingInfoTemplates();
        return getFinalUrlString();
    }

    private void setAdUnitId(String str) {
        addParam("id", str);
    }

    private void setSdkVersion(String str) {
        addParam("nv", str);
    }
}
