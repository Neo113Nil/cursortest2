package com.mopub.mobileads;

import android.content.Context;
import com.mopub.common.AdUrlGenerator;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Constants;
import com.mopub.common.ExternalViewabilitySessionManager;

/* loaded from: classes2.dex */
public class WebViewAdUrlGenerator extends AdUrlGenerator {
    private final boolean mIsStorePictureSupported;

    public WebViewAdUrlGenerator(Context context, boolean z) {
        super(context);
        this.mIsStorePictureSupported = z;
    }

    @Override // com.mopub.common.BaseUrlGenerator
    public String generateUrlString(String str) {
        initUrlString(str, Constants.AD_HANDLER);
        setApiVersion("6");
        addBaseParams(ClientMetadata.getInstance(this.mContext));
        setMraidFlag(true);
        setExternalStoragePermission(this.mIsStorePictureSupported);
        enableViewability(ExternalViewabilitySessionManager.ViewabilityVendor.getEnabledVendorKey());
        return getFinalUrlString();
    }
}
