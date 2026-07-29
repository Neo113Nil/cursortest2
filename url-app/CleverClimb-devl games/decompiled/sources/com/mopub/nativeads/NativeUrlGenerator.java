package com.mopub.nativeads;

import android.content.Context;
import android.text.TextUtils;
import com.mopub.common.AdUrlGenerator;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Constants;
import com.mopub.common.MoPub;

/* loaded from: classes2.dex */
class NativeUrlGenerator extends AdUrlGenerator {
    private String mDesiredAssets;
    private String mSequenceNumber;

    NativeUrlGenerator(Context context) {
        super(context);
    }

    @Override // com.mopub.common.AdUrlGenerator
    public NativeUrlGenerator withAdUnitId(String str) {
        this.mAdUnitId = str;
        return this;
    }

    NativeUrlGenerator withRequest(RequestParameters requestParameters) {
        if (requestParameters != null) {
            boolean canCollectPersonalInformation = MoPub.canCollectPersonalInformation();
            this.mUserDataKeywords = canCollectPersonalInformation ? requestParameters.getUserDataKeywords() : null;
            this.mLocation = canCollectPersonalInformation ? requestParameters.getLocation() : null;
            this.mKeywords = requestParameters.getKeywords();
            this.mDesiredAssets = requestParameters.getDesiredAssets();
        }
        return this;
    }

    NativeUrlGenerator withSequenceNumber(int i) {
        this.mSequenceNumber = String.valueOf(i);
        return this;
    }

    @Override // com.mopub.common.BaseUrlGenerator
    public String generateUrlString(String str) {
        initUrlString(str, Constants.AD_HANDLER);
        addBaseParams(ClientMetadata.getInstance(this.mContext));
        setDesiredAssets();
        setSequenceNumber();
        return getFinalUrlString();
    }

    private void setSequenceNumber() {
        if (TextUtils.isEmpty(this.mSequenceNumber)) {
            return;
        }
        addParam("MAGIC_NO", this.mSequenceNumber);
    }

    private void setDesiredAssets() {
        if (TextUtils.isEmpty(this.mDesiredAssets)) {
            return;
        }
        addParam("assets", this.mDesiredAssets);
    }
}
