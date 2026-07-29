package com.mopub.common.privacy;

import android.content.Context;
import com.mopub.common.BaseUrlGenerator;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Constants;
import com.mopub.common.Preconditions;

/* loaded from: classes2.dex */
public class ConsentDialogUrlGenerator extends BaseUrlGenerator {
    private static final String LANGUAGE_KEY = "language";
    private final String mAdUnitId;
    private final Context mContext;

    ConsentDialogUrlGenerator(Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        this.mContext = context.getApplicationContext();
        this.mAdUnitId = str;
    }

    @Override // com.mopub.common.BaseUrlGenerator
    public String generateUrlString(String str) {
        initUrlString(str, Constants.GDPR_CONSENT_HANDLER);
        addParam("id", this.mAdUnitId);
        addParam("nv", "5.0.0");
        addParam("language", ClientMetadata.getCurrentLanguage(this.mContext));
        return getFinalUrlString();
    }
}
