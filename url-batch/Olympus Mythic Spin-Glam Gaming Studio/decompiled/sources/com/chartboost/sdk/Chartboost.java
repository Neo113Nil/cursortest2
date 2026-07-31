package com.chartboost.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.sdk.AppLovinEventTypes;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.b4;
import com.chartboost.sdk.impl.f4;
import com.chartboost.sdk.impl.fb;
import com.chartboost.sdk.impl.h4;
import com.chartboost.sdk.impl.k7;
import com.chartboost.sdk.impl.l5;
import com.chartboost.sdk.impl.xb;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J(\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/chartboost/sdk/Chartboost;", "", "()V", "INSTANCE_ID_KEY", "", "instanceId", "addDataUseConsent", "", "context", "Landroid/content/Context;", "dataUseConsent", "Lcom/chartboost/sdk/privacy/model/DataUseConsent;", "clearDataUseConsent", "privacyStandard", "getBidderToken", "getDataUseConsent", "getInstanceId", "getInstanceId$ChartboostMonetization_9_12_1_productionRelease", "getSDKVersion", "initContainer", "isSdkStarted", "", "loadInstanceId", "setLoggingLevel", AppLovinEventTypes.USER_COMPLETED_LEVEL, "Lcom/chartboost/sdk/LoggingLevel;", "startWithAppId", "appId", "appSignature", "onStarted", "Lcom/chartboost/sdk/callbacks/StartCallback;", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Chartboost {

    @NotNull
    public static final Chartboost INSTANCE = new Chartboost();

    @NotNull
    private static final String INSTANCE_ID_KEY = "ChartboostInstanceId";

    @Nullable
    private static String instanceId;

    private Chartboost() {
    }

    public static final void addDataUseConsent(@NotNull Context context, @NotNull DataUseConsent dataUseConsent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataUseConsent, "dataUseConsent");
        INSTANCE.initContainer(context);
        if (h4.b.d()) {
            f4.b.h().a().a(dataUseConsent);
        }
    }

    public static final void clearDataUseConsent(@NotNull Context context, @NotNull String privacyStandard) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(privacyStandard, "privacyStandard");
        INSTANCE.initContainer(context);
        if (h4.b.d()) {
            f4.b.h().a().b(privacyStandard);
        }
    }

    @Nullable
    public static final String getBidderToken() {
        if (isSdkStarted()) {
            return f4.b.j().c().a();
        }
        xb.b("Chartboost getBidderToken failed due to SDK not being initialized.", (Throwable) null, 2, (Object) null);
        return null;
    }

    @Nullable
    public static final DataUseConsent getDataUseConsent(@NotNull Context context, @NotNull String privacyStandard) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(privacyStandard, "privacyStandard");
        INSTANCE.initContainer(context);
        if (h4.b.d()) {
            return f4.b.h().a().a(privacyStandard);
        }
        return null;
    }

    @NotNull
    public static final String getSDKVersion() {
        return "9.12.1";
    }

    private final void initContainer(final Context context) {
        h4 h4Var = h4.b;
        if (h4Var.d()) {
            return;
        }
        h4Var.a(context);
        f4.b.e().b().execute(new Runnable() { // from class: com.chartboost.sdk.Chartboost$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Chartboost.initContainer$lambda$0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initContainer$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        INSTANCE.loadInstanceId(context);
    }

    public static final boolean isSdkStarted() {
        h4 h4Var = h4.b;
        if (h4Var.d() && h4Var.e()) {
            try {
                return f4.b.j().b().a();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private final void loadInstanceId(Context context) {
        synchronized (this) {
            try {
                if (instanceId == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
                    String string = sharedPreferences.getString(INSTANCE_ID_KEY, null);
                    if (string != null) {
                        if (string.length() == 0) {
                        }
                        instanceId = string;
                    }
                    string = UUID.randomUUID().toString();
                    Intrinsics.checkNotNull(sharedPreferences);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString(INSTANCE_ID_KEY, string);
                    edit.apply();
                    instanceId = string;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void setLoggingLevel(@NotNull LoggingLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        xb.b = level;
    }

    public static final synchronized void startWithAppId(@NotNull Context context, @NotNull String appId, @NotNull String appSignature, @NotNull StartCallback onStarted) {
        synchronized (Chartboost.class) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(appSignature, "appSignature");
            Intrinsics.checkNotNullParameter(onStarted, "onStarted");
            if (isSdkStarted()) {
                xb.c("Chartboost startWithAppId skipped due to SDK already being initialized. This method only needs to be called once per app session.", null, 2, null);
                onStarted.onStartCompleted(null);
                return;
            }
            INSTANCE.initContainer(context);
            Object a = new fb().a();
            if (Result.m8028isFailureimpl(a)) {
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a);
                ChartboostError chartboostError = m8026exceptionOrNullimpl instanceof ChartboostError ? (ChartboostError) m8026exceptionOrNullimpl : null;
                if (chartboostError == null) {
                    chartboostError = new ChartboostError.Initialization.Unknown("Precondition check failed.", null);
                }
                xb.b("Chartboost startWithAppId failed due to preconditions not being met. Check the logs for more information.", (Throwable) null, 2, (Object) null);
                f4.b.j().c().a(appId, appSignature, onStarted, chartboostError);
                return;
            }
            l5.a.a(context);
            h4 h4Var = h4.b;
            if (h4Var.d()) {
                if (!isSdkStarted()) {
                    h4Var.a(appId, appSignature);
                    k7 k7Var = k7.a;
                    f4 f4Var = f4.b;
                    k7Var.a(f4Var.d().g(), f4Var.d().j());
                }
                f4 f4Var2 = f4.b;
                f4Var2.b().a();
                b4.a(f4Var2.j().c(), appId, appSignature, onStarted, null, 8, null);
            } else {
                f4.b.j().c().a(appId, appSignature, onStarted, new ChartboostError.Initialization.Internal("Dependency Injection container not initialized.", null));
            }
        }
    }
}
