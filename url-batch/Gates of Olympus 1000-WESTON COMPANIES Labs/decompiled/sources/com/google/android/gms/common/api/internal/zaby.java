package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.9.0 */
/* loaded from: classes.dex */
final class zaby implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    zaby(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }

    static zaby zaa(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        boolean z;
        if (!googleApiManager.zam()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            z = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            z = config.getMethodTimingTelemetryEnabled();
            zabk zag = googleApiManager.zag(apiKey);
            if (zag != null) {
                if (!(zag.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zag.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab = zab(zag, baseGmsClient, i);
                    if (zab == null) {
                        return null;
                    }
                    zag.zas();
                    z = zab.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new zaby(googleApiManager, i, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static ConnectionTelemetryConfiguration zab(zabk zabkVar, BaseGmsClient baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zabkVar.zar() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zabk zag;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2;
        long j3;
        int i7;
        GoogleApiManager googleApiManager = this.zaa;
        if (googleApiManager.zam()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zag = googleApiManager.zag(this.zac)) != null && (zag.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zag.zaf();
                long j4 = this.zad;
                boolean z = j4 > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    z &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    int version = config.getVersion();
                    if (!baseGmsClient.hasConnectionInfo() || baseGmsClient.isConnecting()) {
                        i = version;
                        j = j4;
                    } else {
                        ConnectionTelemetryConfiguration zab = zab(zag, baseGmsClient, this.zab);
                        if (zab == null) {
                            return;
                        }
                        boolean z2 = zab.getMethodTimingTelemetryEnabled() && j4 > 0;
                        maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                        i = version;
                        j = j4;
                        z = z2;
                    }
                    i3 = batchPeriodMillis;
                    i2 = maxMethodInvocationsInBatch;
                } else {
                    j = j4;
                    i = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                if (task.isSuccessful()) {
                    i6 = 0;
                    i5 = 0;
                } else if (task.isCanceled()) {
                    i5 = -1;
                    i6 = 100;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof ApiException) {
                        Status status = ((ApiException) exception).getStatus();
                        i4 = status.getStatusCode();
                        ConnectionResult connectionResult = status.getConnectionResult();
                        if (connectionResult != null) {
                            i5 = connectionResult.getErrorCode();
                            i6 = i4;
                        }
                    } else {
                        i4 = TypedValues.TYPE_TARGET;
                    }
                    i5 = -1;
                    i6 = i4;
                }
                if (z) {
                    long j5 = this.zae;
                    long currentTimeMillis = System.currentTimeMillis();
                    j2 = j;
                    i7 = (int) (SystemClock.elapsedRealtime() - j5);
                    j3 = currentTimeMillis;
                } else {
                    j2 = 0;
                    j3 = 0;
                    i7 = -1;
                }
                googleApiManager.zar(new MethodInvocation(this.zab, i6, i5, j2, j3, null, null, gCoreServiceId, i7), i, i3, i2);
            }
        }
    }
}
