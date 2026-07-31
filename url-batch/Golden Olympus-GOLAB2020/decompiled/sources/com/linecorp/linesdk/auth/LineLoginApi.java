package com.linecorp.linesdk.auth;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import com.linecorp.linesdk.internal.EncryptorHolder;

/* loaded from: classes2.dex */
public class LineLoginApi {
    private LineLoginApi() {
    }

    @NonNull
    public static Intent getLoginIntent(@NonNull Context context, @NonNull String str, @NonNull LineAuthenticationParams lineAuthenticationParams) {
        return getLoginIntent(context, new LineAuthenticationConfig.Builder(str, context).build(), lineAuthenticationParams);
    }

    @NonNull
    public static Intent getLoginIntentWithoutLineAppAuth(@NonNull Context context, @NonNull String str, @NonNull LineAuthenticationParams lineAuthenticationParams) {
        return getLoginIntent(context, new LineAuthenticationConfig.Builder(str, context).disableLineAppAuthentication().build(), lineAuthenticationParams);
    }

    @NonNull
    public static LineLoginResult getLoginResultFromIntent(Intent intent) {
        return intent == null ? LineLoginResult.internalError("Callback intent is null") : LineAuthenticationActivity.getResultFromIntent(intent);
    }

    @NonNull
    public static Intent getLoginIntent(@NonNull Context context, @NonNull LineAuthenticationConfig lineAuthenticationConfig, @NonNull LineAuthenticationParams lineAuthenticationParams) {
        if (!lineAuthenticationConfig.isEncryptorPreparationDisabled()) {
            EncryptorHolder.initializeOnWorkerThread(context);
        }
        return LineAuthenticationActivity.getLoginIntent(context, lineAuthenticationConfig, lineAuthenticationParams);
    }
}
