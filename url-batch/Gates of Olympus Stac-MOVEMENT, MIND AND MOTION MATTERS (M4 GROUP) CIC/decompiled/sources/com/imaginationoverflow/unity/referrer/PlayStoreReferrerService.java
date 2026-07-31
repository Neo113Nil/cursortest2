package com.imaginationoverflow.unity.referrer;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* loaded from: classes.dex */
public class PlayStoreReferrerService {
    public static final String TAG = "IODroidReferrerPlugin";

    public void StartFetchingReferrerInformation(Context context, final ReferrerCallback referrerCallback) {
        final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
        build.startConnection(new InstallReferrerStateListener() { // from class: com.imaginationoverflow.unity.referrer.PlayStoreReferrerService.1
            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerServiceDisconnected() {
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerSetupFinished(int i) {
                if (i == -1) {
                    PlayStoreReferrerService.this.SendError(referrerCallback, "SERVICE_DISCONNECTED");
                } else if (i == 0) {
                    Log.d(PlayStoreReferrerService.TAG, "InstallReferrerResponse.OK:");
                    try {
                        ReferrerDetails installReferrer = build.getInstallReferrer();
                        Log.d(PlayStoreReferrerService.TAG, "ReferrerDetails OK");
                        referrerCallback.SuccessResponse(installReferrer.getInstallReferrer(), installReferrer.getGooglePlayInstantParam(), installReferrer.getInstallBeginTimestampSeconds(), installReferrer.getReferrerClickTimestampSeconds());
                        Log.d(PlayStoreReferrerService.TAG, installReferrer.getInstallReferrer());
                        Log.d(PlayStoreReferrerService.TAG, Long.toString(installReferrer.getInstallBeginTimestampSeconds()));
                        Log.d(PlayStoreReferrerService.TAG, Long.toString(installReferrer.getReferrerClickTimestampSeconds()));
                        Log.d(PlayStoreReferrerService.TAG, installReferrer.getInstallReferrer());
                        Log.d(PlayStoreReferrerService.TAG, installReferrer.getGooglePlayInstantParam() ? "TRUE" : "FALSE");
                    } catch (RemoteException e) {
                        Log.d(PlayStoreReferrerService.TAG, "ERROR" + e);
                        referrerCallback.Error(e.toString(), true);
                    }
                } else if (i == 1) {
                    PlayStoreReferrerService.this.SendError(referrerCallback, "SERVICE_UNAVAILABLE");
                } else if (i == 2) {
                    PlayStoreReferrerService.this.SendError(referrerCallback, "FEATURE_NOT_SUPPORTED");
                } else if (i == 3) {
                    PlayStoreReferrerService.this.SendError(referrerCallback, "DEVELOPER_ERROR");
                }
                try {
                    build.endConnection();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void SendError(ReferrerCallback referrerCallback, String str) {
        Log.d(TAG, str);
        referrerCallback.Error("error", false);
    }
}
