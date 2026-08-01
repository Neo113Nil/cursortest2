package expo.modules.updates;

import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.events.IUpdatesEventManager;
import expo.modules.updates.loader.LoaderTask;
import expo.modules.updates.manifest.Update;
import expo.modules.updates.reloadscreen.ReloadScreenManager;
import expo.modules.updates.statemachine.UpdatesStateContext;
import java.io.File;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;

/* compiled from: IUpdatesController.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u000389:J\b\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\"\u001a\u00020\u0015H&J\b\u0010#\u001a\u00020$H&J\u000e\u0010%\u001a\u00020\u0015H¦@¢\u0006\u0002\u0010&J\u000e\u0010'\u001a\u00020(H¦@¢\u0006\u0002\u0010&J\u000e\u0010)\u001a\u00020*H¦@¢\u0006\u0002\u0010&J\u000e\u0010+\u001a\u00020,H¦@¢\u0006\u0002\u0010&J \u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u00100J\u0012\u00101\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000103H&J\u001e\u00104\u001a\u00020\u00152\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u000106H&J\b\u00107\u001a\u00020\u0015H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010!¨\u0006;"}, d2 = {"Lexpo/modules/updates/IUpdatesController;", "", "launchAssetFile", "", "getLaunchAssetFile", "()Ljava/lang/String;", "bundleAssetName", "getBundleAssetName", "reloadScreenManager", "Lexpo/modules/updates/reloadscreen/ReloadScreenManager;", "getReloadScreenManager", "()Lexpo/modules/updates/reloadscreen/ReloadScreenManager;", "updatesDirectory", "Ljava/io/File;", "getUpdatesDirectory", "()Ljava/io/File;", "eventManager", "Lexpo/modules/updates/events/IUpdatesEventManager;", "getEventManager", "()Lexpo/modules/updates/events/IUpdatesEventManager;", "onEventListenerStartObserving", "", "onDidCreateDevSupportManager", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "onDidCreateReactInstance", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "onReactInstanceException", "exception", "Ljava/lang/Exception;", "isActiveController", "", "()Z", ViewProps.START, "getConstantsForModule", "Lexpo/modules/updates/IUpdatesController$UpdatesModuleConstants;", "relaunchReactApplicationForModule", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkForUpdate", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult;", "fetchUpdate", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult;", "getExtraParams", "Landroid/os/Bundle;", "setExtraParam", "key", "value", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUpdateURLAndRequestHeadersOverride", "configOverride", "Lexpo/modules/updates/UpdatesConfigurationOverride;", "setUpdateRequestHeadersOverride", UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY, "", "shutdown", "UpdatesModuleConstants", "CheckForUpdateResult", "FetchUpdateResult", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface IUpdatesController {
    Object checkForUpdate(Continuation<? super CheckForUpdateResult> continuation);

    Object fetchUpdate(Continuation<? super FetchUpdateResult> continuation);

    String getBundleAssetName();

    UpdatesModuleConstants getConstantsForModule();

    IUpdatesEventManager getEventManager();

    Object getExtraParams(Continuation<? super Bundle> continuation);

    String getLaunchAssetFile();

    ReloadScreenManager getReloadScreenManager();

    File getUpdatesDirectory();

    /* renamed from: isActiveController */
    boolean getIsActiveController();

    void onDidCreateDevSupportManager(DevSupportManager devSupportManager);

    void onDidCreateReactInstance(ReactContext reactContext);

    void onEventListenerStartObserving();

    void onReactInstanceException(Exception exception);

    Object relaunchReactApplicationForModule(Continuation<? super Unit> continuation);

    Object setExtraParam(String str, String str2, Continuation<? super Unit> continuation);

    void setUpdateRequestHeadersOverride(Map<String, String> requestHeaders);

    void setUpdateURLAndRequestHeadersOverride(UpdatesConfigurationOverride configOverride);

    void shutdown();

    void start();

    /* compiled from: IUpdatesController.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b/J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\u0015\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0012HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012HÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\u0017HÆ\u0003J°\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\b;J\u0013\u0010<\u001a\u00020\u000b2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010!R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006A"}, d2 = {"Lexpo/modules/updates/IUpdatesController$UpdatesModuleConstants;", "", "launchedUpdate", "Lexpo/modules/updates/db/entity/UpdateEntity;", "launchDuration", "Lkotlin/time/Duration;", "embeddedUpdate", "emergencyLaunchException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isEnabled", "", "isUsingEmbeddedAssets", UpdatesConfiguration.UPDATES_CONFIGURATION_RUNTIME_VERSION_KEY, "", UpdatesConfiguration.UPDATES_CONFIGURATION_CHECK_ON_LAUNCH_KEY, "Lexpo/modules/updates/UpdatesConfiguration$CheckAutomaticallyConfiguration;", UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY, "", "localAssetFiles", "Lexpo/modules/updates/db/entity/AssetEntity;", "shouldDeferToNativeForAPIMethodAvailabilityInDevelopment", "initialContext", "Lexpo/modules/updates/statemachine/UpdatesStateContext;", "<init>", "(Lexpo/modules/updates/db/entity/UpdateEntity;Lkotlin/time/Duration;Lexpo/modules/updates/db/entity/UpdateEntity;Ljava/lang/Exception;ZZLjava/lang/String;Lexpo/modules/updates/UpdatesConfiguration$CheckAutomaticallyConfiguration;Ljava/util/Map;Ljava/util/Map;ZLexpo/modules/updates/statemachine/UpdatesStateContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLaunchedUpdate", "()Lexpo/modules/updates/db/entity/UpdateEntity;", "getLaunchDuration-FghU774", "()Lkotlin/time/Duration;", "getEmbeddedUpdate", "getEmergencyLaunchException", "()Ljava/lang/Exception;", "()Z", "getRuntimeVersion", "()Ljava/lang/String;", "getCheckOnLaunch", "()Lexpo/modules/updates/UpdatesConfiguration$CheckAutomaticallyConfiguration;", "getRequestHeaders", "()Ljava/util/Map;", "getLocalAssetFiles", "getShouldDeferToNativeForAPIMethodAvailabilityInDevelopment", "getInitialContext", "()Lexpo/modules/updates/statemachine/UpdatesStateContext;", "toModuleConstantsMap", "component1", "component2", "component2-FghU774", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "copy-IHjstsk", "equals", "other", "hashCode", "", "toString", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatesModuleConstants {
        private final UpdatesConfiguration.CheckAutomaticallyConfiguration checkOnLaunch;
        private final UpdateEntity embeddedUpdate;
        private final Exception emergencyLaunchException;
        private final UpdatesStateContext initialContext;
        private final boolean isEnabled;
        private final boolean isUsingEmbeddedAssets;
        private final Duration launchDuration;
        private final UpdateEntity launchedUpdate;
        private final Map<AssetEntity, String> localAssetFiles;
        private final Map<String, String> requestHeaders;
        private final String runtimeVersion;
        private final boolean shouldDeferToNativeForAPIMethodAvailabilityInDevelopment;

        public /* synthetic */ UpdatesModuleConstants(UpdateEntity updateEntity, Duration duration, UpdateEntity updateEntity2, Exception exc, boolean z, boolean z2, String str, UpdatesConfiguration.CheckAutomaticallyConfiguration checkAutomaticallyConfiguration, Map map, Map map2, boolean z3, UpdatesStateContext updatesStateContext, DefaultConstructorMarker defaultConstructorMarker) {
            this(updateEntity, duration, updateEntity2, exc, z, z2, str, checkAutomaticallyConfiguration, map, map2, z3, updatesStateContext);
        }

        /* renamed from: copy-IHjstsk$default, reason: not valid java name */
        public static /* synthetic */ UpdatesModuleConstants m757copyIHjstsk$default(UpdatesModuleConstants updatesModuleConstants, UpdateEntity updateEntity, Duration duration, UpdateEntity updateEntity2, Exception exc, boolean z, boolean z2, String str, UpdatesConfiguration.CheckAutomaticallyConfiguration checkAutomaticallyConfiguration, Map map, Map map2, boolean z3, UpdatesStateContext updatesStateContext, int i, Object obj) {
            if ((i & 1) != 0) {
                updateEntity = updatesModuleConstants.launchedUpdate;
            }
            if ((i & 2) != 0) {
                duration = updatesModuleConstants.launchDuration;
            }
            if ((i & 4) != 0) {
                updateEntity2 = updatesModuleConstants.embeddedUpdate;
            }
            if ((i & 8) != 0) {
                exc = updatesModuleConstants.emergencyLaunchException;
            }
            if ((i & 16) != 0) {
                z = updatesModuleConstants.isEnabled;
            }
            if ((i & 32) != 0) {
                z2 = updatesModuleConstants.isUsingEmbeddedAssets;
            }
            if ((i & 64) != 0) {
                str = updatesModuleConstants.runtimeVersion;
            }
            if ((i & 128) != 0) {
                checkAutomaticallyConfiguration = updatesModuleConstants.checkOnLaunch;
            }
            if ((i & 256) != 0) {
                map = updatesModuleConstants.requestHeaders;
            }
            if ((i & 512) != 0) {
                map2 = updatesModuleConstants.localAssetFiles;
            }
            if ((i & 1024) != 0) {
                z3 = updatesModuleConstants.shouldDeferToNativeForAPIMethodAvailabilityInDevelopment;
            }
            if ((i & 2048) != 0) {
                updatesStateContext = updatesModuleConstants.initialContext;
            }
            boolean z4 = z3;
            UpdatesStateContext updatesStateContext2 = updatesStateContext;
            Map map3 = map;
            Map map4 = map2;
            String str2 = str;
            UpdatesConfiguration.CheckAutomaticallyConfiguration checkAutomaticallyConfiguration2 = checkAutomaticallyConfiguration;
            boolean z5 = z;
            boolean z6 = z2;
            return updatesModuleConstants.m759copyIHjstsk(updateEntity, duration, updateEntity2, exc, z5, z6, str2, checkAutomaticallyConfiguration2, map3, map4, z4, updatesStateContext2);
        }

        /* renamed from: component1, reason: from getter */
        public final UpdateEntity getLaunchedUpdate() {
            return this.launchedUpdate;
        }

        public final Map<AssetEntity, String> component10() {
            return this.localAssetFiles;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getShouldDeferToNativeForAPIMethodAvailabilityInDevelopment() {
            return this.shouldDeferToNativeForAPIMethodAvailabilityInDevelopment;
        }

        /* renamed from: component12, reason: from getter */
        public final UpdatesStateContext getInitialContext() {
            return this.initialContext;
        }

        /* renamed from: component2-FghU774, reason: not valid java name and from getter */
        public final Duration getLaunchDuration() {
            return this.launchDuration;
        }

        /* renamed from: component3, reason: from getter */
        public final UpdateEntity getEmbeddedUpdate() {
            return this.embeddedUpdate;
        }

        /* renamed from: component4, reason: from getter */
        public final Exception getEmergencyLaunchException() {
            return this.emergencyLaunchException;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsUsingEmbeddedAssets() {
            return this.isUsingEmbeddedAssets;
        }

        /* renamed from: component7, reason: from getter */
        public final String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        /* renamed from: component8, reason: from getter */
        public final UpdatesConfiguration.CheckAutomaticallyConfiguration getCheckOnLaunch() {
            return this.checkOnLaunch;
        }

        public final Map<String, String> component9() {
            return this.requestHeaders;
        }

        /* renamed from: copy-IHjstsk, reason: not valid java name */
        public final UpdatesModuleConstants m759copyIHjstsk(UpdateEntity launchedUpdate, Duration launchDuration, UpdateEntity embeddedUpdate, Exception emergencyLaunchException, boolean isEnabled, boolean isUsingEmbeddedAssets, String runtimeVersion, UpdatesConfiguration.CheckAutomaticallyConfiguration checkOnLaunch, Map<String, String> requestHeaders, Map<AssetEntity, String> localAssetFiles, boolean shouldDeferToNativeForAPIMethodAvailabilityInDevelopment, UpdatesStateContext initialContext) {
            Intrinsics.checkNotNullParameter(checkOnLaunch, "checkOnLaunch");
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            Intrinsics.checkNotNullParameter(initialContext, "initialContext");
            return new UpdatesModuleConstants(launchedUpdate, launchDuration, embeddedUpdate, emergencyLaunchException, isEnabled, isUsingEmbeddedAssets, runtimeVersion, checkOnLaunch, requestHeaders, localAssetFiles, shouldDeferToNativeForAPIMethodAvailabilityInDevelopment, initialContext, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatesModuleConstants)) {
                return false;
            }
            UpdatesModuleConstants updatesModuleConstants = (UpdatesModuleConstants) other;
            return Intrinsics.areEqual(this.launchedUpdate, updatesModuleConstants.launchedUpdate) && Intrinsics.areEqual(this.launchDuration, updatesModuleConstants.launchDuration) && Intrinsics.areEqual(this.embeddedUpdate, updatesModuleConstants.embeddedUpdate) && Intrinsics.areEqual(this.emergencyLaunchException, updatesModuleConstants.emergencyLaunchException) && this.isEnabled == updatesModuleConstants.isEnabled && this.isUsingEmbeddedAssets == updatesModuleConstants.isUsingEmbeddedAssets && Intrinsics.areEqual(this.runtimeVersion, updatesModuleConstants.runtimeVersion) && this.checkOnLaunch == updatesModuleConstants.checkOnLaunch && Intrinsics.areEqual(this.requestHeaders, updatesModuleConstants.requestHeaders) && Intrinsics.areEqual(this.localAssetFiles, updatesModuleConstants.localAssetFiles) && this.shouldDeferToNativeForAPIMethodAvailabilityInDevelopment == updatesModuleConstants.shouldDeferToNativeForAPIMethodAvailabilityInDevelopment && Intrinsics.areEqual(this.initialContext, updatesModuleConstants.initialContext);
        }

        public int hashCode() {
            UpdateEntity updateEntity = this.launchedUpdate;
            int hashCode = (updateEntity == null ? 0 : updateEntity.hashCode()) * 31;
            Duration duration = this.launchDuration;
            int m2171hashCodeimpl = (hashCode + (duration == null ? 0 : Duration.m2171hashCodeimpl(duration.getRawValue()))) * 31;
            UpdateEntity updateEntity2 = this.embeddedUpdate;
            int hashCode2 = (m2171hashCodeimpl + (updateEntity2 == null ? 0 : updateEntity2.hashCode())) * 31;
            Exception exc = this.emergencyLaunchException;
            int hashCode3 = (((((hashCode2 + (exc == null ? 0 : exc.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isUsingEmbeddedAssets)) * 31;
            String str = this.runtimeVersion;
            int hashCode4 = (((((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.checkOnLaunch.hashCode()) * 31) + this.requestHeaders.hashCode()) * 31;
            Map<AssetEntity, String> map = this.localAssetFiles;
            return ((((hashCode4 + (map != null ? map.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldDeferToNativeForAPIMethodAvailabilityInDevelopment)) * 31) + this.initialContext.hashCode();
        }

        public String toString() {
            return "UpdatesModuleConstants(launchedUpdate=" + this.launchedUpdate + ", launchDuration=" + this.launchDuration + ", embeddedUpdate=" + this.embeddedUpdate + ", emergencyLaunchException=" + this.emergencyLaunchException + ", isEnabled=" + this.isEnabled + ", isUsingEmbeddedAssets=" + this.isUsingEmbeddedAssets + ", runtimeVersion=" + this.runtimeVersion + ", checkOnLaunch=" + this.checkOnLaunch + ", requestHeaders=" + this.requestHeaders + ", localAssetFiles=" + this.localAssetFiles + ", shouldDeferToNativeForAPIMethodAvailabilityInDevelopment=" + this.shouldDeferToNativeForAPIMethodAvailabilityInDevelopment + ", initialContext=" + this.initialContext + ")";
        }

        private UpdatesModuleConstants(UpdateEntity updateEntity, Duration duration, UpdateEntity updateEntity2, Exception exc, boolean z, boolean z2, String str, UpdatesConfiguration.CheckAutomaticallyConfiguration checkOnLaunch, Map<String, String> requestHeaders, Map<AssetEntity, String> map, boolean z3, UpdatesStateContext initialContext) {
            Intrinsics.checkNotNullParameter(checkOnLaunch, "checkOnLaunch");
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            Intrinsics.checkNotNullParameter(initialContext, "initialContext");
            this.launchedUpdate = updateEntity;
            this.launchDuration = duration;
            this.embeddedUpdate = updateEntity2;
            this.emergencyLaunchException = exc;
            this.isEnabled = z;
            this.isUsingEmbeddedAssets = z2;
            this.runtimeVersion = str;
            this.checkOnLaunch = checkOnLaunch;
            this.requestHeaders = requestHeaders;
            this.localAssetFiles = map;
            this.shouldDeferToNativeForAPIMethodAvailabilityInDevelopment = z3;
            this.initialContext = initialContext;
        }

        public final UpdateEntity getLaunchedUpdate() {
            return this.launchedUpdate;
        }

        /* renamed from: getLaunchDuration-FghU774, reason: not valid java name */
        public final Duration m760getLaunchDurationFghU774() {
            return this.launchDuration;
        }

        public final UpdateEntity getEmbeddedUpdate() {
            return this.embeddedUpdate;
        }

        public final Exception getEmergencyLaunchException() {
            return this.emergencyLaunchException;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final boolean isUsingEmbeddedAssets() {
            return this.isUsingEmbeddedAssets;
        }

        public final String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public final UpdatesConfiguration.CheckAutomaticallyConfiguration getCheckOnLaunch() {
            return this.checkOnLaunch;
        }

        public final Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public final Map<AssetEntity, String> getLocalAssetFiles() {
            return this.localAssetFiles;
        }

        public final boolean getShouldDeferToNativeForAPIMethodAvailabilityInDevelopment() {
            return this.shouldDeferToNativeForAPIMethodAvailabilityInDevelopment;
        }

        public final UpdatesStateContext getInitialContext() {
            return this.initialContext;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Map<String, Object> toModuleConstantsMap() {
            boolean z;
            String str;
            UpdateEntity updateEntity;
            Map<AssetEntity, String> map;
            UUID id;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z2 = true;
            linkedHashMap.put("isEmergencyLaunch", Boolean.valueOf(this.emergencyLaunchException != null));
            Exception exc = this.emergencyLaunchException;
            linkedHashMap.put("emergencyLaunchReason", exc != null ? exc.getMessage() : null);
            if (this.embeddedUpdate != null) {
                UpdateEntity updateEntity2 = this.launchedUpdate;
                if ((updateEntity2 == null || (id = updateEntity2.getId()) == null) ? false : id.equals(this.embeddedUpdate.getId())) {
                    z = true;
                    linkedHashMap.put("isEmbeddedLaunch", Boolean.valueOf(z));
                    linkedHashMap.put("isEnabled", Boolean.valueOf(this.isEnabled));
                    Duration duration = this.launchDuration;
                    linkedHashMap.put("launchDuration", duration != null ? Long.valueOf(Duration.m2189toLongimpl(duration.getRawValue(), DurationUnit.MILLISECONDS)) : null);
                    linkedHashMap.put("isUsingEmbeddedAssets", Boolean.valueOf(this.isUsingEmbeddedAssets));
                    str = this.runtimeVersion;
                    if (str == null) {
                        str = "";
                    }
                    linkedHashMap.put(UpdatesConfiguration.UPDATES_CONFIGURATION_RUNTIME_VERSION_KEY, str);
                    linkedHashMap.put("checkAutomatically", this.checkOnLaunch.toJSString());
                    String str2 = this.requestHeaders.get("expo-channel-name");
                    linkedHashMap.put("channel", str2 != null ? str2 : "");
                    if (!this.shouldDeferToNativeForAPIMethodAvailabilityInDevelopment && !UpdatesPackage.INSTANCE.isUsingNativeDebug()) {
                        z2 = false;
                    }
                    linkedHashMap.put("shouldDeferToNativeForAPIMethodAvailabilityInDevelopment", Boolean.valueOf(z2));
                    linkedHashMap.put("initialContext", this.initialContext.getBundle());
                    updateEntity = this.launchedUpdate;
                    if (updateEntity != null) {
                        linkedHashMap.put("updateId", updateEntity.getId().toString());
                        linkedHashMap.put("commitTime", Long.valueOf(this.launchedUpdate.getCommitTime().getTime()));
                        linkedHashMap.put("manifestString", this.launchedUpdate.getManifest().toString());
                    }
                    map = this.localAssetFiles;
                    if (map != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (AssetEntity assetEntity : map.keySet()) {
                            if (assetEntity.getKey() != null) {
                                String key = assetEntity.getKey();
                                Intrinsics.checkNotNull(key);
                                String str3 = map.get(assetEntity);
                                Intrinsics.checkNotNull(str3);
                                linkedHashMap2.put(key, str3);
                            }
                        }
                        linkedHashMap.put("localAssets", linkedHashMap2);
                    }
                    return linkedHashMap;
                }
            }
            z = false;
            linkedHashMap.put("isEmbeddedLaunch", Boolean.valueOf(z));
            linkedHashMap.put("isEnabled", Boolean.valueOf(this.isEnabled));
            Duration duration2 = this.launchDuration;
            linkedHashMap.put("launchDuration", duration2 != null ? Long.valueOf(Duration.m2189toLongimpl(duration2.getRawValue(), DurationUnit.MILLISECONDS)) : null);
            linkedHashMap.put("isUsingEmbeddedAssets", Boolean.valueOf(this.isUsingEmbeddedAssets));
            str = this.runtimeVersion;
            if (str == null) {
            }
            linkedHashMap.put(UpdatesConfiguration.UPDATES_CONFIGURATION_RUNTIME_VERSION_KEY, str);
            linkedHashMap.put("checkAutomatically", this.checkOnLaunch.toJSString());
            String str22 = this.requestHeaders.get("expo-channel-name");
            linkedHashMap.put("channel", str22 != null ? str22 : "");
            if (!this.shouldDeferToNativeForAPIMethodAvailabilityInDevelopment) {
                z2 = false;
            }
            linkedHashMap.put("shouldDeferToNativeForAPIMethodAvailabilityInDevelopment", Boolean.valueOf(z2));
            linkedHashMap.put("initialContext", this.initialContext.getBundle());
            updateEntity = this.launchedUpdate;
            if (updateEntity != null) {
            }
            map = this.localAssetFiles;
            if (map != null) {
            }
            return linkedHashMap;
        }
    }

    /* compiled from: IUpdatesController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult;", "", "status", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult$Status;", "<init>", "(Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult$Status;)V", "Status", "NoUpdateAvailable", "UpdateAvailable", "RollBackToEmbedded", "ErrorResult", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult$ErrorResult;", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult$NoUpdateAvailable;", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult$RollBackToEmbedded;", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult$UpdateAvailable;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class CheckForUpdateResult {
        private final Status status;

        public /* synthetic */ CheckForUpdateResult(Status status, DefaultConstructorMarker defaultConstructorMarker) {
            this(status);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: IUpdatesController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult$Status;", "", "<init>", "(Ljava/lang/String;I)V", "NO_UPDATE_AVAILABLE", "UPDATE_AVAILABLE", "ROLL_BACK_TO_EMBEDDED", "ERROR", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Status {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status NO_UPDATE_AVAILABLE = new Status("NO_UPDATE_AVAILABLE", 0);
            public static final Status UPDATE_AVAILABLE = new Status("UPDATE_AVAILABLE", 1);
            public static final Status ROLL_BACK_TO_EMBEDDED = new Status("ROLL_BACK_TO_EMBEDDED", 2);
            public static final Status ERROR = new Status("ERROR", 3);

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{NO_UPDATE_AVAILABLE, UPDATE_AVAILABLE, ROLL_BACK_TO_EMBEDDED, ERROR};
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i) {
            }

            static {
                Status[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        private CheckForUpdateResult(Status status) {
            this.status = status;
        }

        /* compiled from: IUpdatesController.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult$NoUpdateAvailable;", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult;", "reason", "Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResultNotAvailableReason;", "<init>", "(Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResultNotAvailableReason;)V", "getReason", "()Lexpo/modules/updates/loader/LoaderTask$RemoteCheckResultNotAvailableReason;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NoUpdateAvailable extends CheckForUpdateResult {
            private final LoaderTask.RemoteCheckResultNotAvailableReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoUpdateAvailable(LoaderTask.RemoteCheckResultNotAvailableReason reason) {
                super(Status.NO_UPDATE_AVAILABLE, null);
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.reason = reason;
            }

            public final LoaderTask.RemoteCheckResultNotAvailableReason getReason() {
                return this.reason;
            }
        }

        /* compiled from: IUpdatesController.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult$UpdateAvailable;", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult;", "update", "Lexpo/modules/updates/manifest/Update;", "<init>", "(Lexpo/modules/updates/manifest/Update;)V", "getUpdate", "()Lexpo/modules/updates/manifest/Update;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class UpdateAvailable extends CheckForUpdateResult {
            private final Update update;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateAvailable(Update update) {
                super(Status.UPDATE_AVAILABLE, null);
                Intrinsics.checkNotNullParameter(update, "update");
                this.update = update;
            }

            public final Update getUpdate() {
                return this.update;
            }
        }

        /* compiled from: IUpdatesController.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult$RollBackToEmbedded;", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult;", "commitTime", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getCommitTime", "()Ljava/util/Date;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RollBackToEmbedded extends CheckForUpdateResult {
            private final Date commitTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RollBackToEmbedded(Date commitTime) {
                super(Status.ROLL_BACK_TO_EMBEDDED, null);
                Intrinsics.checkNotNullParameter(commitTime, "commitTime");
                this.commitTime = commitTime;
            }

            public final Date getCommitTime() {
                return this.commitTime;
            }
        }

        /* compiled from: IUpdatesController.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult$ErrorResult;", "Lexpo/modules/updates/IUpdatesController$CheckForUpdateResult;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ErrorResult extends CheckForUpdateResult {
            private final Exception error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorResult(Exception error) {
                super(Status.ERROR, null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Exception getError() {
                return this.error;
            }
        }
    }

    /* compiled from: IUpdatesController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/updates/IUpdatesController$FetchUpdateResult;", "", "status", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult$Status;", "<init>", "(Lexpo/modules/updates/IUpdatesController$FetchUpdateResult$Status;)V", "Status", "Success", "Failure", "RollBackToEmbedded", "ErrorResult", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult$ErrorResult;", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult$Failure;", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult$RollBackToEmbedded;", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult$Success;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class FetchUpdateResult {
        private final Status status;

        public /* synthetic */ FetchUpdateResult(Status status, DefaultConstructorMarker defaultConstructorMarker) {
            this(status);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: IUpdatesController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/IUpdatesController$FetchUpdateResult$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE", "ROLL_BACK_TO_EMBEDDED", "ERROR", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Status {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status SUCCESS = new Status("SUCCESS", 0);
            public static final Status FAILURE = new Status("FAILURE", 1);
            public static final Status ROLL_BACK_TO_EMBEDDED = new Status("ROLL_BACK_TO_EMBEDDED", 2);
            public static final Status ERROR = new Status("ERROR", 3);

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{SUCCESS, FAILURE, ROLL_BACK_TO_EMBEDDED, ERROR};
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i) {
            }

            static {
                Status[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        private FetchUpdateResult(Status status) {
            this.status = status;
        }

        /* compiled from: IUpdatesController.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/IUpdatesController$FetchUpdateResult$Success;", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult;", "update", "Lexpo/modules/updates/db/entity/UpdateEntity;", "<init>", "(Lexpo/modules/updates/db/entity/UpdateEntity;)V", "getUpdate", "()Lexpo/modules/updates/db/entity/UpdateEntity;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Success extends FetchUpdateResult {
            private final UpdateEntity update;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(UpdateEntity update) {
                super(Status.SUCCESS, null);
                Intrinsics.checkNotNullParameter(update, "update");
                this.update = update;
            }

            public final UpdateEntity getUpdate() {
                return this.update;
            }
        }

        /* compiled from: IUpdatesController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/updates/IUpdatesController$FetchUpdateResult$Failure;", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult;", "<init>", "()V", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failure extends FetchUpdateResult {
            public Failure() {
                super(Status.FAILURE, null);
            }
        }

        /* compiled from: IUpdatesController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/updates/IUpdatesController$FetchUpdateResult$RollBackToEmbedded;", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult;", "<init>", "()V", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RollBackToEmbedded extends FetchUpdateResult {
            public RollBackToEmbedded() {
                super(Status.ROLL_BACK_TO_EMBEDDED, null);
            }
        }

        /* compiled from: IUpdatesController.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/updates/IUpdatesController$FetchUpdateResult$ErrorResult;", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ErrorResult extends FetchUpdateResult {
            private final Exception error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorResult(Exception error) {
                super(Status.ERROR, null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Exception getError() {
                return this.error;
            }
        }
    }
}
