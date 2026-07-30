package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.up2;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InstallReferrerUtil {
    public static final InstallReferrerUtil INSTANCE = new InstallReferrerUtil();
    private static final String IS_REFERRER_UPDATED = "is_referrer_updated";
    private static final long REFERRER_FETCH_TIMEOUT = 5;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface Callback {
        void onReceiveReferrerUrl(String str);
    }

    private InstallReferrerUtil() {
    }

    private final boolean isUpdated() {
        return FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).getBoolean(IS_REFERRER_UPDATED, false);
    }

    private final void tryConnectReferrerInfo(final Callback callback, final CountDownLatch countDownLatch) {
        final InstallReferrerClient build = InstallReferrerClient.newBuilder(FacebookSdk.getApplicationContext()).build();
        try {
            build.startConnection(new InstallReferrerStateListener() { // from class: com.facebook.internal.InstallReferrerUtil$tryConnectReferrerInfo$installReferrerStateListener$1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    CountDownLatch countDownLatch2 = countDownLatch;
                    if (countDownLatch2 != null) {
                        countDownLatch2.countDown();
                    }
                }

                /* JADX WARN: Finally extract failed */
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int i) {
                    CountDownLatch countDownLatch2;
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        try {
                            if (i == 0) {
                                try {
                                    ReferrerDetails installReferrer = InstallReferrerClient.this.getInstallReferrer();
                                    installReferrer.getClass();
                                    String installReferrer2 = installReferrer.getInstallReferrer();
                                    if (installReferrer2 != null && (up2.q(installReferrer2, "fb") || up2.q(installReferrer2, AccessToken.DEFAULT_GRAPH_DOMAIN))) {
                                        callback.onReceiveReferrerUrl(installReferrer2);
                                    }
                                    InstallReferrerUtil.INSTANCE.updateReferrer();
                                } catch (RemoteException unused) {
                                    countDownLatch2 = countDownLatch;
                                    if (countDownLatch2 == null) {
                                        return;
                                    }
                                }
                            } else if (i == 2) {
                                InstallReferrerUtil.INSTANCE.updateReferrer();
                            }
                            try {
                                InstallReferrerClient.this.endConnection();
                            } catch (Exception unused2) {
                            }
                            countDownLatch2 = countDownLatch;
                            if (countDownLatch2 == null) {
                                return;
                            }
                            countDownLatch2.countDown();
                        } catch (Throwable th) {
                            CountDownLatch countDownLatch3 = countDownLatch;
                            if (countDownLatch3 != null) {
                                countDownLatch3.countDown();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        CrashShieldHandler.handleThrowable(th2, this);
                    }
                }
            });
        } catch (Exception unused) {
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    public static /* synthetic */ void tryConnectReferrerInfo$default(InstallReferrerUtil installReferrerUtil, Callback callback, CountDownLatch countDownLatch, int i, Object obj) {
        if ((i & 2) != 0) {
            countDownLatch = null;
        }
        installReferrerUtil.tryConnectReferrerInfo(callback, countDownLatch);
    }

    public static final void tryUpdateReferrerInfo(Callback callback) {
        callback.getClass();
        InstallReferrerUtil installReferrerUtil = INSTANCE;
        if (installReferrerUtil.isUpdated()) {
            return;
        }
        tryConnectReferrerInfo$default(installReferrerUtil, callback, null, 2, null);
    }

    public static final void tryUpdateReferrerInfoBlocking(Callback callback) {
        callback.getClass();
        InstallReferrerUtil installReferrerUtil = INSTANCE;
        if (installReferrerUtil.isUpdated()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        installReferrerUtil.tryConnectReferrerInfo(callback, countDownLatch);
        try {
            countDownLatch.await(REFERRER_FETCH_TIMEOUT, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateReferrer() {
        FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putBoolean(IS_REFERRER_UPDATED, true).apply();
    }
}
