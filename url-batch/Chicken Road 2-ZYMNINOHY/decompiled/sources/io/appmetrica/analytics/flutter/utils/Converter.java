package io.appmetrica.analytics.flutter.utils;

import android.location.Location;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AdType;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.impl.InterfaceC0598eo;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import io.appmetrica.analytics.profile.Attribute;
import io.appmetrica.analytics.profile.BirthDateAttribute;
import io.appmetrica.analytics.profile.BooleanAttribute;
import io.appmetrica.analytics.profile.CounterAttribute;
import io.appmetrica.analytics.profile.GenderAttribute;
import io.appmetrica.analytics.profile.NameAttribute;
import io.appmetrica.analytics.profile.NotificationsEnabledAttribute;
import io.appmetrica.analytics.profile.NumberAttribute;
import io.appmetrica.analytics.profile.StringAttribute;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Converter {
    private static final Map<Pigeon.GenderPigeon, GenderAttribute.Gender> genderToNative = new HashMap<Pigeon.GenderPigeon, GenderAttribute.Gender>() { // from class: io.appmetrica.analytics.flutter.utils.Converter.1
        {
            put(Pigeon.GenderPigeon.MALE, GenderAttribute.Gender.MALE);
            put(Pigeon.GenderPigeon.FEMALE, GenderAttribute.Gender.FEMALE);
            put(Pigeon.GenderPigeon.OTHER, GenderAttribute.Gender.OTHER);
        }
    };
    private static final Map<Pigeon.AdTypePigeon, AdType> adTypeToNative = new HashMap<Pigeon.AdTypePigeon, AdType>() { // from class: io.appmetrica.analytics.flutter.utils.Converter.2
        {
            put(Pigeon.AdTypePigeon.UNKNOWN, null);
            put(Pigeon.AdTypePigeon.NATIVE, AdType.NATIVE);
            put(Pigeon.AdTypePigeon.BANNER, AdType.BANNER);
            put(Pigeon.AdTypePigeon.REWARDED, AdType.REWARDED);
            put(Pigeon.AdTypePigeon.INTERSTITIAL, AdType.INTERSTITIAL);
            put(Pigeon.AdTypePigeon.MREC, AdType.MREC);
            put(Pigeon.AdTypePigeon.APP_OPEN, AdType.APP_OPEN);
            put(Pigeon.AdTypePigeon.OTHER, AdType.OTHER);
        }
    };

    /* renamed from: io.appmetrica.analytics.flutter.utils.Converter$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error;
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error;
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus;
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType;

        static {
            int[] iArr = new int[DeferredDeeplinkParametersListener.Error.values().length];
            $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error = iArr;
            try {
                iArr[DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[DeferredDeeplinkParametersListener.Error.PARSE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[DeferredDeeplinkParametersListener.Error.NO_REFERRER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DeferredDeeplinkListener.Error.values().length];
            $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error = iArr2;
            try {
                iArr2[DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[DeferredDeeplinkListener.Error.PARSE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[DeferredDeeplinkListener.Error.NO_REFERRER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[StartupParamsItemStatus.values().length];
            $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus = iArr3;
            try {
                iArr3[StartupParamsItemStatus.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[StartupParamsItemStatus.PROVIDER_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[StartupParamsItemStatus.FEATURE_DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[Pigeon.UserProfileAttributeType.values().length];
            $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType = iArr4;
            try {
                iArr4[Pigeon.UserProfileAttributeType.BIRTH_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.COUNTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.GENDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.NOTIFICATION_ENABLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.PHONE_HASH.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.EMAIL_HASH.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[Pigeon.UserProfileAttributeType.TELEGRAM_LOGIN_HASH.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private static List<String> filterNonNull(List<String> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static Revenue toNative(Pigeon.RevenuePigeon revenuePigeon) {
        Revenue.Builder newBuilder = Revenue.newBuilder(new BigDecimal(revenuePigeon.getPrice()).multiply(new BigDecimal(1000000)).longValue(), Currency.getInstance(revenuePigeon.getCurrency()));
        String productId = revenuePigeon.getProductId();
        if (productId != null) {
            newBuilder.withProductID(productId);
        }
        String payload = revenuePigeon.getPayload();
        if (payload != null) {
            newBuilder.withPayload(payload);
        }
        Long quantity = revenuePigeon.getQuantity();
        if (quantity != null) {
            newBuilder.withQuantity(Integer.valueOf(quantity.intValue()));
        }
        Pigeon.ReceiptPigeon receipt = revenuePigeon.getReceipt();
        if (receipt != null) {
            Revenue.Receipt.Builder newBuilder2 = Revenue.Receipt.newBuilder();
            String data = receipt.getData();
            if (data != null) {
                newBuilder2.withData(data);
            }
            String signature = receipt.getSignature();
            if (signature != null) {
                newBuilder2.withSignature(signature);
            }
            newBuilder.withReceipt(newBuilder2.build());
        }
        return newBuilder.build();
    }

    public static Pigeon.StartupParamsItemStatusPigeon toPigeon(StartupParamsItemStatus startupParamsItemStatus) {
        int i4 = AnonymousClass4.$SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[startupParamsItemStatus.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? Pigeon.StartupParamsItemStatusPigeon.UNKNOWN_ERROR : Pigeon.StartupParamsItemStatusPigeon.FEATURE_DISABLED : Pigeon.StartupParamsItemStatusPigeon.INVALID_VALUE_FROM_PROVIDER : Pigeon.StartupParamsItemStatusPigeon.PROVIDER_UNAVAILABLE : Pigeon.StartupParamsItemStatusPigeon.OK;
    }

    public static Pigeon.StartupParamsItemPigeon toPigeon(StartupParamsItem startupParamsItem) {
        return new Pigeon.StartupParamsItemPigeon.Builder().setId(startupParamsItem.getId()).setStatus(toPigeon(startupParamsItem.getStatus())).setErrorDetails(startupParamsItem.getErrorDetails()).build();
    }

    public static Pigeon.StartupParamsResultPigeon toPigeon(StartupParamsCallback.Result result) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, StartupParamsItem> entry : result.parameters.entrySet()) {
            hashMap.put(entry.getKey(), toPigeon(entry.getValue()));
        }
        return new Pigeon.StartupParamsResultPigeon.Builder().setDeviceId(result.deviceId).setDeviceIdHash(result.deviceIdHash).setParameters(hashMap).setUuid(result.uuid).build();
    }

    public static AppMetricaConfig toNative(Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon) {
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfigPigeon.getApiKey());
        Boolean advIdentifiersTracking = appMetricaConfigPigeon.getAdvIdentifiersTracking();
        if (advIdentifiersTracking != null) {
            newConfigBuilder.withAdvIdentifiersTracking(advIdentifiersTracking.booleanValue());
        }
        Boolean anrMonitoring = appMetricaConfigPigeon.getAnrMonitoring();
        if (anrMonitoring != null) {
            newConfigBuilder.withAnrMonitoring(anrMonitoring.booleanValue());
        }
        Long anrMonitoringTimeout = appMetricaConfigPigeon.getAnrMonitoringTimeout();
        if (anrMonitoringTimeout != null) {
            newConfigBuilder.withAnrMonitoringTimeout(anrMonitoringTimeout.intValue());
        }
        Long appBuildNumber = appMetricaConfigPigeon.getAppBuildNumber();
        if (appBuildNumber != null) {
            newConfigBuilder.withAppBuildNumber(appBuildNumber.intValue());
        }
        Map<String, String> appEnvironment = appMetricaConfigPigeon.getAppEnvironment();
        if (appEnvironment != null) {
            for (Map.Entry<String, String> entry : appEnvironment.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    newConfigBuilder.withAppEnvironmentValue(key, value);
                }
            }
        }
        Boolean appOpenTrackingEnabled = appMetricaConfigPigeon.getAppOpenTrackingEnabled();
        if (appOpenTrackingEnabled != null) {
            newConfigBuilder.withAppOpenTrackingEnabled(appOpenTrackingEnabled.booleanValue());
        }
        String appVersion = appMetricaConfigPigeon.getAppVersion();
        if (appVersion != null) {
            newConfigBuilder.withAppVersion(appVersion);
        }
        Boolean crashReporting = appMetricaConfigPigeon.getCrashReporting();
        if (crashReporting != null) {
            newConfigBuilder.withCrashReporting(crashReporting.booleanValue());
        }
        List<String> customHosts = appMetricaConfigPigeon.getCustomHosts();
        if (customHosts != null) {
            newConfigBuilder.withCustomHosts(customHosts);
        }
        Boolean dataSendingEnabled = appMetricaConfigPigeon.getDataSendingEnabled();
        if (dataSendingEnabled != null) {
            newConfigBuilder.withDataSendingEnabled(dataSendingEnabled.booleanValue());
        }
        String deviceType = appMetricaConfigPigeon.getDeviceType();
        if (deviceType != null) {
            newConfigBuilder.withDeviceType(deviceType);
        }
        Long dispatchPeriodSeconds = appMetricaConfigPigeon.getDispatchPeriodSeconds();
        if (dispatchPeriodSeconds != null) {
            newConfigBuilder.withDispatchPeriodSeconds(dispatchPeriodSeconds.intValue());
        }
        Map<String, String> errorEnvironment = appMetricaConfigPigeon.getErrorEnvironment();
        if (errorEnvironment != null) {
            for (Map.Entry<String, String> entry2 : errorEnvironment.entrySet()) {
                String key2 = entry2.getKey();
                String value2 = entry2.getValue();
                if (key2 != null) {
                    newConfigBuilder.withErrorEnvironmentValue(key2, value2);
                }
            }
        }
        Boolean firstActivationAsUpdate = appMetricaConfigPigeon.getFirstActivationAsUpdate();
        if (firstActivationAsUpdate != null) {
            newConfigBuilder.handleFirstActivationAsUpdate(firstActivationAsUpdate.booleanValue());
        }
        Pigeon.LocationPigeon location = appMetricaConfigPigeon.getLocation();
        if (location != null) {
            newConfigBuilder.withLocation(toNative(location));
        }
        Boolean locationTracking = appMetricaConfigPigeon.getLocationTracking();
        if (locationTracking != null) {
            newConfigBuilder.withLocationTracking(locationTracking.booleanValue());
        }
        if (appMetricaConfigPigeon.getLogs() != null) {
            newConfigBuilder.withLogs();
        }
        Long maxReportsCount = appMetricaConfigPigeon.getMaxReportsCount();
        if (maxReportsCount != null) {
            newConfigBuilder.withMaxReportsCount(maxReportsCount.intValue());
        }
        Long maxReportsInDatabaseCount = appMetricaConfigPigeon.getMaxReportsInDatabaseCount();
        if (maxReportsInDatabaseCount != null) {
            newConfigBuilder.withMaxReportsInDatabaseCount(maxReportsInDatabaseCount.intValue());
        }
        Boolean nativeCrashReporting = appMetricaConfigPigeon.getNativeCrashReporting();
        if (nativeCrashReporting != null) {
            newConfigBuilder.withNativeCrashReporting(nativeCrashReporting.booleanValue());
        }
        Pigeon.PreloadInfoPigeon preloadInfo = appMetricaConfigPigeon.getPreloadInfo();
        if (preloadInfo != null) {
            newConfigBuilder.withPreloadInfo(toNative(preloadInfo));
        }
        Boolean revenueAutoTrackingEnabled = appMetricaConfigPigeon.getRevenueAutoTrackingEnabled();
        if (revenueAutoTrackingEnabled != null) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(revenueAutoTrackingEnabled.booleanValue());
        }
        Long sessionTimeout = appMetricaConfigPigeon.getSessionTimeout();
        if (sessionTimeout != null) {
            newConfigBuilder.withSessionTimeout(sessionTimeout.intValue());
        }
        Boolean sessionsAutoTrackingEnabled = appMetricaConfigPigeon.getSessionsAutoTrackingEnabled();
        if (sessionsAutoTrackingEnabled != null) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(sessionsAutoTrackingEnabled.booleanValue());
        }
        String userProfileID = appMetricaConfigPigeon.getUserProfileID();
        if (userProfileID != null) {
            newConfigBuilder.withUserProfileID(userProfileID);
        }
        return newConfigBuilder.build();
    }

    public static Pigeon.StartupParamsReasonPigeon toPigeon(StartupParamsCallback.Reason reason) {
        return new Pigeon.StartupParamsReasonPigeon.Builder().setValue(reason.value).build();
    }

    public static Pigeon.StartupParamsPigeon toPigeon(StartupParamsCallback.Result result, StartupParamsCallback.Reason reason) {
        if (reason == null) {
            return new Pigeon.StartupParamsPigeon.Builder().setResult(result != null ? toPigeon(result) : null).build();
        }
        return new Pigeon.StartupParamsPigeon.Builder().setResult(result != null ? toPigeon(result) : null).setReason(toPigeon(reason)).build();
    }

    public static Pigeon.AppMetricaDeferredDeeplinkPigeon toPigeon(String str, DeferredDeeplinkListener.Error error, String str2) {
        Pigeon.AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon;
        String str3;
        if (str != null) {
            return new Pigeon.AppMetricaDeferredDeeplinkPigeon.Builder().setDeeplink(str).build();
        }
        if (error != null) {
            int i4 = AnonymousClass4.$SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[error.ordinal()];
            if (i4 == 1) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NOT_A_FIRST_LAUNCH;
            } else if (i4 == 2) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.PARSE_ERROR;
            } else if (i4 != 3) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
            } else {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NO_REFERRER;
            }
        } else {
            appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
        }
        if (error != null) {
            str3 = error.getDescription();
        } else {
            str3 = "";
        }
        return new Pigeon.AppMetricaDeferredDeeplinkPigeon.Builder().setDeeplink(null).setError(new Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.Builder().setReason(appMetricaDeferredDeeplinkReasonPigeon).setMessage(str2).setErrorDescription(str3).build()).build();
    }

    public static Pigeon.AppMetricaDeferredDeeplinkParametersPigeon toPigeon(Map<String, String> map, DeferredDeeplinkParametersListener.Error error, String str) {
        Pigeon.AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon;
        String str2;
        if (map != null) {
            return new Pigeon.AppMetricaDeferredDeeplinkParametersPigeon.Builder().setParameters(map).build();
        }
        if (error != null) {
            int i4 = AnonymousClass4.$SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[error.ordinal()];
            if (i4 == 1) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NOT_A_FIRST_LAUNCH;
            } else if (i4 == 2) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.PARSE_ERROR;
            } else if (i4 != 3) {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
            } else {
                appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NO_REFERRER;
            }
        } else {
            appMetricaDeferredDeeplinkReasonPigeon = Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
        }
        if (error != null) {
            str2 = error.getDescription();
        } else {
            str2 = "";
        }
        return new Pigeon.AppMetricaDeferredDeeplinkParametersPigeon.Builder().setParameters(null).setError(new Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.Builder().setReason(appMetricaDeferredDeeplinkReasonPigeon).setMessage(str).setErrorDescription(str2).build()).build();
    }

    public static AppMetricaLibraryAdapterConfig toNative(Pigeon.AppMetricaLibraryAdapterConfigPigeon appMetricaLibraryAdapterConfigPigeon) {
        AppMetricaLibraryAdapterConfig.Builder newConfigBuilder = AppMetricaLibraryAdapterConfig.newConfigBuilder();
        Boolean advIdentifiersTracking = appMetricaLibraryAdapterConfigPigeon.getAdvIdentifiersTracking();
        if (advIdentifiersTracking != null) {
            newConfigBuilder.withAdvIdentifiersTracking(advIdentifiersTracking.booleanValue());
        }
        return newConfigBuilder.build();
    }

    public static ReporterConfig toNative(Pigeon.ReporterConfigPigeon reporterConfigPigeon) {
        ReporterConfig.Builder newConfigBuilder = ReporterConfig.newConfigBuilder(reporterConfigPigeon.getApiKey());
        Map<String, String> appEnvironment = reporterConfigPigeon.getAppEnvironment();
        if (appEnvironment != null) {
            for (Map.Entry<String, String> entry : appEnvironment.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    newConfigBuilder.withAppEnvironmentValue(key, value);
                }
            }
        }
        Boolean dataSendingEnabled = reporterConfigPigeon.getDataSendingEnabled();
        if (dataSendingEnabled != null) {
            newConfigBuilder.withDataSendingEnabled(dataSendingEnabled.booleanValue());
        }
        Long dispatchPeriodSeconds = reporterConfigPigeon.getDispatchPeriodSeconds();
        if (dispatchPeriodSeconds != null) {
            newConfigBuilder.withDispatchPeriodSeconds(dispatchPeriodSeconds.intValue());
        }
        if (reporterConfigPigeon.getLogs() != null) {
            newConfigBuilder.withLogs();
        }
        Long maxReportsCount = reporterConfigPigeon.getMaxReportsCount();
        if (maxReportsCount != null) {
            newConfigBuilder.withMaxReportsCount(maxReportsCount.intValue());
        }
        Long maxReportsInDatabaseCount = reporterConfigPigeon.getMaxReportsInDatabaseCount();
        if (maxReportsInDatabaseCount != null) {
            newConfigBuilder.withMaxReportsInDatabaseCount(maxReportsInDatabaseCount.intValue());
        }
        Long sessionTimeout = reporterConfigPigeon.getSessionTimeout();
        if (sessionTimeout != null) {
            newConfigBuilder.withSessionTimeout(sessionTimeout.intValue());
        }
        String userProfileID = reporterConfigPigeon.getUserProfileID();
        if (userProfileID != null) {
            newConfigBuilder.withUserProfileID(userProfileID);
        }
        return newConfigBuilder.build();
    }

    public static PreloadInfo toNative(Pigeon.PreloadInfoPigeon preloadInfoPigeon) {
        PreloadInfo.Builder newBuilder = PreloadInfo.newBuilder(preloadInfoPigeon.getTrackingId());
        Map<String, String> additionalInfo = preloadInfoPigeon.getAdditionalInfo();
        if (additionalInfo != null) {
            for (Map.Entry<String, String> entry : additionalInfo.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    newBuilder.setAdditionalParams(key, value);
                }
            }
        }
        return newBuilder.build();
    }

    public static Location toNative(Pigeon.LocationPigeon locationPigeon) {
        Location location = new Location(locationPigeon.getProvider());
        location.setLongitude(locationPigeon.getLongitude().doubleValue());
        location.setLatitude(locationPigeon.getLatitude().doubleValue());
        Double altitude = locationPigeon.getAltitude();
        if (altitude != null) {
            location.setAltitude(altitude.doubleValue());
        }
        Double course = locationPigeon.getCourse();
        if (course != null) {
            location.setBearing(course.floatValue());
        }
        Long timestamp = locationPigeon.getTimestamp();
        if (timestamp != null) {
            location.setTime(timestamp.longValue());
        }
        Double accuracy = locationPigeon.getAccuracy();
        if (accuracy != null) {
            location.setAccuracy(accuracy.floatValue());
        }
        Double speed = locationPigeon.getSpeed();
        if (speed != null) {
            location.setSpeed(speed.floatValue());
        }
        return location;
    }

    public static UserProfile toNative(Pigeon.UserProfilePigeon userProfilePigeon) {
        UserProfile.Builder newBuilder = UserProfile.newBuilder();
        List<Pigeon.UserProfileAttributePigeon> attributes = userProfilePigeon.getAttributes();
        ArrayList arrayList = new ArrayList();
        Iterator<Pigeon.UserProfileAttributePigeon> it = attributes.iterator();
        while (true) {
            int i4 = 0;
            if (it.hasNext()) {
                Pigeon.UserProfileAttributePigeon next = it.next();
                Pigeon.UserProfileAttributeType type = next.getType();
                if (type != null) {
                    switch (AnonymousClass4.$SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[type.ordinal()]) {
                        case 1:
                            BirthDateAttribute birthDate = Attribute.birthDate();
                            if (Boolean.TRUE.equals(next.getReset())) {
                                arrayList.add(birthDate.withValueReset());
                                break;
                            } else {
                                Long year = next.getYear();
                                Long month = next.getMonth();
                                Long day = next.getDay();
                                Long age = next.getAge();
                                if (year != null) {
                                    if (month != null) {
                                        if (day == null) {
                                            arrayList.add(birthDate.withBirthDate(year.intValue(), month.intValue()));
                                            break;
                                        } else {
                                            arrayList.add(birthDate.withBirthDate(year.intValue(), month.intValue(), day.intValue()));
                                            break;
                                        }
                                    } else {
                                        arrayList.add(birthDate.withBirthDate(year.intValue()));
                                        break;
                                    }
                                } else if (age == null) {
                                    break;
                                } else {
                                    arrayList.add(birthDate.withAge(age.intValue()));
                                    break;
                                }
                            }
                        case 2:
                            BooleanAttribute customBoolean = Attribute.customBoolean(next.getKey());
                            Boolean bool = Boolean.TRUE;
                            if (bool.equals(next.getReset())) {
                                arrayList.add(customBoolean.withValueReset());
                                break;
                            } else {
                                Boolean boolValue = next.getBoolValue();
                                boolean booleanValue = boolValue != null ? boolValue.booleanValue() : false;
                                if (bool.equals(next.getIfUndefined())) {
                                    arrayList.add(customBoolean.withValueIfUndefined(booleanValue));
                                    break;
                                } else {
                                    arrayList.add(customBoolean.withValue(booleanValue));
                                    break;
                                }
                            }
                        case 3:
                            CounterAttribute customCounter = Attribute.customCounter(next.getKey());
                            Double doubleValue = next.getDoubleValue();
                            arrayList.add(customCounter.withDelta(doubleValue != null ? doubleValue.doubleValue() : 0.0d));
                            break;
                        case 4:
                            GenderAttribute gender = Attribute.gender();
                            if (Boolean.TRUE.equals(next.getReset())) {
                                arrayList.add(gender.withValueReset());
                                break;
                            } else {
                                GenderAttribute.Gender gender2 = genderToNative.get(next.getGenderValue());
                                if (gender2 == null) {
                                    gender2 = GenderAttribute.Gender.OTHER;
                                }
                                arrayList.add(gender.withValue(gender2));
                                break;
                            }
                        case 5:
                            NameAttribute name = Attribute.name();
                            if (Boolean.TRUE.equals(next.getReset())) {
                                arrayList.add(name.withValueReset());
                                break;
                            } else {
                                String stringValue = next.getStringValue();
                                arrayList.add(name.withValue(stringValue != null ? stringValue : ""));
                                break;
                            }
                        case 6:
                            NotificationsEnabledAttribute notificationsEnabled = Attribute.notificationsEnabled();
                            if (Boolean.TRUE.equals(next.getReset())) {
                                arrayList.add(notificationsEnabled.withValueReset());
                                break;
                            } else {
                                Boolean boolValue2 = next.getBoolValue();
                                arrayList.add(notificationsEnabled.withValue(boolValue2 != null ? boolValue2.booleanValue() : false));
                                break;
                            }
                        case 7:
                            NumberAttribute customNumber = Attribute.customNumber(next.getKey());
                            Boolean bool2 = Boolean.TRUE;
                            if (bool2.equals(next.getReset())) {
                                arrayList.add(customNumber.withValueReset());
                                break;
                            } else {
                                Double doubleValue2 = next.getDoubleValue();
                                double doubleValue3 = doubleValue2 != null ? doubleValue2.doubleValue() : 0.0d;
                                if (bool2.equals(next.getIfUndefined())) {
                                    arrayList.add(customNumber.withValueIfUndefined(doubleValue3));
                                    break;
                                } else {
                                    arrayList.add(customNumber.withValue(doubleValue3));
                                    break;
                                }
                            }
                        case 8:
                            StringAttribute customString = Attribute.customString(next.getKey());
                            Boolean bool3 = Boolean.TRUE;
                            if (bool3.equals(next.getReset())) {
                                arrayList.add(customString.withValueReset());
                                break;
                            } else {
                                String stringValue2 = next.getStringValue();
                                String str = stringValue2 != null ? stringValue2 : "";
                                if (bool3.equals(next.getIfUndefined())) {
                                    arrayList.add(customString.withValueIfUndefined(str));
                                    break;
                                } else {
                                    arrayList.add(customString.withValue(str));
                                    break;
                                }
                            }
                        case 9:
                            arrayList.add(Attribute.phoneHash().withPhoneValues(filterNonNull(next.getStringValues())));
                            break;
                        case 10:
                            arrayList.add(Attribute.emailHash().withEmailValues(filterNonNull(next.getStringValues())));
                            break;
                        case 11:
                            arrayList.add(Attribute.telegramLoginHash().withTelegramLoginValues(filterNonNull(next.getStringValues())));
                            break;
                    }
                }
            } else {
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    UserProfileUpdate<? extends InterfaceC0598eo> userProfileUpdate = (UserProfileUpdate) obj;
                    if (userProfileUpdate != null) {
                        newBuilder.apply(userProfileUpdate);
                    }
                }
                return newBuilder.build();
            }
        }
    }

    public static StackTraceItem toNative(Pigeon.StackTraceElementPigeon stackTraceElementPigeon) {
        return new StackTraceItem.Builder().withFileName(stackTraceElementPigeon.getFileName()).withClassName(stackTraceElementPigeon.getClassName()).withMethodName(stackTraceElementPigeon.getMethodName()).withLine(Integer.valueOf(stackTraceElementPigeon.getLine().intValue())).withColumn(Integer.valueOf(stackTraceElementPigeon.getColumn().intValue())).build();
    }

    public static PluginErrorDetails toNative(Pigeon.ErrorDetailsPigeon errorDetailsPigeon) {
        PluginErrorDetails.Builder withVirtualMachineVersion = new PluginErrorDetails.Builder().withExceptionClass(errorDetailsPigeon.getExceptionClass()).withMessage(errorDetailsPigeon.getMessage()).withPlatform(PluginErrorDetails.Platform.FLUTTER).withVirtualMachineVersion(errorDetailsPigeon.getDartVersion());
        List<Pigeon.StackTraceElementPigeon> backtrace = errorDetailsPigeon.getBacktrace();
        if (backtrace != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Pigeon.StackTraceElementPigeon> it = backtrace.iterator();
            while (it.hasNext()) {
                arrayList.add(toNative(it.next()));
            }
            withVirtualMachineVersion.withStacktrace(arrayList);
        }
        return withVirtualMachineVersion.build();
    }

    public static AdRevenue toNative(Pigeon.AdRevenuePigeon adRevenuePigeon) {
        AdType adType;
        AdRevenue.Builder newBuilder = AdRevenue.newBuilder(new BigDecimal(adRevenuePigeon.getAdRevenue()), Currency.getInstance(adRevenuePigeon.getCurrency()));
        Pigeon.AdTypePigeon adType2 = adRevenuePigeon.getAdType();
        if (adType2 != null && (adType = adTypeToNative.get(adType2)) != null) {
            newBuilder.withAdType(adType);
        }
        String adNetwork = adRevenuePigeon.getAdNetwork();
        if (adNetwork != null) {
            newBuilder.withAdNetwork(adNetwork);
        }
        String adUnitId = adRevenuePigeon.getAdUnitId();
        if (adUnitId != null) {
            newBuilder.withAdUnitId(adUnitId);
        }
        String adUnitName = adRevenuePigeon.getAdUnitName();
        if (adUnitName != null) {
            newBuilder.withAdUnitName(adUnitName);
        }
        String adPlacementId = adRevenuePigeon.getAdPlacementId();
        if (adPlacementId != null) {
            newBuilder.withAdPlacementId(adPlacementId);
        }
        String adPlacementName = adRevenuePigeon.getAdPlacementName();
        if (adPlacementName != null) {
            newBuilder.withAdPlacementName(adPlacementName);
        }
        String precision = adRevenuePigeon.getPrecision();
        if (precision != null) {
            newBuilder.withPrecision(precision);
        }
        Map<String, String> payload = adRevenuePigeon.getPayload();
        if (payload != null) {
            newBuilder.withPayload(payload);
        }
        return newBuilder.build();
    }

    public static FlutterExternalAttribution toNative(Pigeon.ExternalAttributionPigeon externalAttributionPigeon) {
        return new FlutterExternalAttribution(new HashMap<String, Integer>() { // from class: io.appmetrica.analytics.flutter.utils.Converter.3
            {
                put("appsflyer", 1);
                put("adjust", 2);
                put("kochava", 3);
                put("tenjin", 4);
                put("airbridge", 5);
                put("singular", 6);
            }
        }.get(externalAttributionPigeon.getSource()).intValue(), new JSONObject(externalAttributionPigeon.getData()).toString());
    }
}
