package com.squareup.cash.treehouse.android.configuration;

import androidx.core.os.BundleKt;
import androidx.navigation.NavOptionsBuilderKt;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.Badger$collect$$inlined$combine$2$3;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.zipline.loader.ZiplineHttpClient;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.badging.db.BadgeCountQueries$ForGroupQuery;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.TreehouseAppConfig;
import com.squareup.cash.db2.TreehouseAppConfigQueries$forAppName$2;
import com.squareup.cash.db2.TreehouseAppConfigQueries$selectAll$2;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.MetadataSection$TreehouseSection;
import com.squareup.cash.treehouse.appmetadata.AppMetadata;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.KeyValue;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okhttp3.HttpUrl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealTreehouseConfigurationStore {
    public final AppConfigManager appConfig;
    public final BugsnagClient bugsnagClient;
    public final AndroidClock clock;
    public final CoroutineContext ioDispatcher;
    public final KeyValue localDevelopmentHost;
    public final RealObservabilityManager observabilityManager;
    public final SessionQueries treehouseAppConfigQueries;
    public final GpsConfigQueries treehouseAppConfigurationsQueries;
    public final ZiplineHttpClient ziplineHttpClient;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EndpointType.values().length];
            try {
                EndpointType endpointType = EndpointType.FROM_SERVER;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealTreehouseConfigurationStore(AndroidClock androidClock, AppConfigManager appConfigManager, ZiplineHttpClient ziplineHttpClient, CoroutineContext coroutineContext, CashAccountDatabaseImpl cashAccountDatabaseImpl, KeyValue keyValue, BugsnagClient bugsnagClient, RealObservabilityManager realObservabilityManager) {
        this.clock = androidClock;
        this.appConfig = appConfigManager;
        this.ziplineHttpClient = ziplineHttpClient;
        this.ioDispatcher = coroutineContext;
        this.localDevelopmentHost = keyValue;
        this.bugsnagClient = bugsnagClient;
        this.observabilityManager = realObservabilityManager;
        this.treehouseAppConfigurationsQueries = cashAccountDatabaseImpl.treehouseAppConfigurationsQueries;
        this.treehouseAppConfigQueries = cashAccountDatabaseImpl.treehouseAppConfigQueries;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
    
        if (r16.clock.millis() >= (kotlin.time.Duration.m4167getInWholeMillisecondsimpl(kotlin.time.DurationKt.toDuration(12, kotlin.time.DurationUnit.HOURS)) + r1)) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$toModel(RealTreehouseConfigurationStore realTreehouseConfigurationStore, String str, TreehouseAppConfigurations treehouseAppConfigurations, TreehouseAppConfig treehouseAppConfig, ContinuationImpl continuationImpl) {
        RealTreehouseConfigurationStore$toModel$1 realTreehouseConfigurationStore$toModel$1;
        int i;
        Object obj;
        TreehouseAppConfigurations treehouseAppConfigurations2;
        TreehouseAppConfig treehouseAppConfig2;
        String str2;
        int i2;
        EndpointType endpointType;
        EndpointType endpointType2;
        String str3;
        String str4;
        if (continuationImpl instanceof RealTreehouseConfigurationStore$toModel$1) {
            realTreehouseConfigurationStore$toModel$1 = (RealTreehouseConfigurationStore$toModel$1) continuationImpl;
            int i3 = realTreehouseConfigurationStore$toModel$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realTreehouseConfigurationStore$toModel$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = realTreehouseConfigurationStore$toModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTreehouseConfigurationStore$toModel$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    List list = AppMetadata.all;
                    Iterator it = NavOptionsBuilderKt.getAll().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(str, ((AppMetadata) obj).getName())) {
                            break;
                        }
                    }
                    AppMetadata appMetadata = (AppMetadata) obj;
                    int localDevelopmentPort = appMetadata != null ? appMetadata.getLocalDevelopmentPort() : 8080;
                    KeyValue keyValue = realTreehouseConfigurationStore.localDevelopmentHost;
                    realTreehouseConfigurationStore$toModel$1.L$0 = str;
                    realTreehouseConfigurationStore$toModel$1.L$1 = treehouseAppConfigurations;
                    realTreehouseConfigurationStore$toModel$1.L$2 = treehouseAppConfig;
                    realTreehouseConfigurationStore$toModel$1.I$0 = localDevelopmentPort;
                    realTreehouseConfigurationStore$toModel$1.label = 1;
                    Object obj3 = keyValue.get(realTreehouseConfigurationStore$toModel$1);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    treehouseAppConfigurations2 = treehouseAppConfigurations;
                    treehouseAppConfig2 = treehouseAppConfig;
                    str2 = str;
                    i2 = localDevelopmentPort;
                    obj2 = obj3;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = realTreehouseConfigurationStore$toModel$1.I$0;
                    treehouseAppConfig2 = realTreehouseConfigurationStore$toModel$1.L$2;
                    treehouseAppConfigurations2 = realTreehouseConfigurationStore$toModel$1.L$1;
                    String str5 = realTreehouseConfigurationStore$toModel$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    str2 = str5;
                }
                HttpUrl httpUrl = BundleKt.toHttpUrl("http://" + ((String) obj2) + ":" + i2 + "/manifest.zipline.json");
                if ((treehouseAppConfigurations2 == null ? treehouseAppConfigurations2.endpoint_type : null) != null) {
                    if (treehouseAppConfigurations2.endpoint_type == EndpointType.QR_CODE) {
                        Long l = treehouseAppConfigurations2.last_qr_code_scanned_at;
                        l.getClass();
                        long longValue = l.longValue();
                        Duration.Companion companion = Duration.Companion;
                    }
                    endpointType = treehouseAppConfigurations2.endpoint_type;
                    endpointType.getClass();
                    endpointType2 = endpointType;
                    if (endpointType2 == EndpointType.LOCAL_DEVELOPMENT) {
                        realTreehouseConfigurationStore.bugsnagClient.addMetadata(MetadataSection$TreehouseSection.INSTANCE, new MetadataSection$TreehouseSection.VersionKey(str2), "local");
                        realTreehouseConfigurationStore.observabilityManager.addCustomAttributeToRumMonitoring(CollectionsKt__CollectionsJVMKt.listOf(new Pair(new MetadataSection$TreehouseSection.VersionKey(str2), "local")));
                    }
                    return new TreehouseAppConfiguration(str2, endpointType2, (treehouseAppConfig2 != null || (str4 = treehouseAppConfig2.url) == null) ? null : BundleKt.toHttpUrl(str4), httpUrl, (treehouseAppConfigurations2 != null || (str3 = treehouseAppConfigurations2.last_qr_code_manifest_url) == null) ? null : BundleKt.toHttpUrl(str3), treehouseAppConfigurations2 != null ? treehouseAppConfigurations2.last_qr_code_scanned_at : null, treehouseAppConfig2 != null ? treehouseAppConfig2.minimal_commit_timestamp : null);
                }
                endpointType = EndpointType.FROM_SERVER;
                endpointType2 = endpointType;
                if (endpointType2 == EndpointType.LOCAL_DEVELOPMENT) {
                }
                return new TreehouseAppConfiguration(str2, endpointType2, (treehouseAppConfig2 != null || (str4 = treehouseAppConfig2.url) == null) ? null : BundleKt.toHttpUrl(str4), httpUrl, (treehouseAppConfigurations2 != null || (str3 = treehouseAppConfigurations2.last_qr_code_manifest_url) == null) ? null : BundleKt.toHttpUrl(str3), treehouseAppConfigurations2 != null ? treehouseAppConfigurations2.last_qr_code_scanned_at : null, treehouseAppConfig2 != null ? treehouseAppConfig2.minimal_commit_timestamp : null);
            }
        }
        realTreehouseConfigurationStore$toModel$1 = new RealTreehouseConfigurationStore$toModel$1(realTreehouseConfigurationStore, continuationImpl);
        Object obj22 = realTreehouseConfigurationStore$toModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTreehouseConfigurationStore$toModel$1.label;
        if (i != 0) {
        }
        HttpUrl httpUrl2 = BundleKt.toHttpUrl("http://" + ((String) obj22) + ":" + i2 + "/manifest.zipline.json");
        if ((treehouseAppConfigurations2 == null ? treehouseAppConfigurations2.endpoint_type : null) != null) {
        }
        endpointType = EndpointType.FROM_SERVER;
        endpointType2 = endpointType;
        if (endpointType2 == EndpointType.LOCAL_DEVELOPMENT) {
        }
        return new TreehouseAppConfiguration(str2, endpointType2, (treehouseAppConfig2 != null || (str4 = treehouseAppConfig2.url) == null) ? null : BundleKt.toHttpUrl(str4), httpUrl2, (treehouseAppConfigurations2 != null || (str3 = treehouseAppConfigurations2.last_qr_code_manifest_url) == null) ? null : BundleKt.toHttpUrl(str3), treehouseAppConfigurations2 != null ? treehouseAppConfigurations2.last_qr_code_scanned_at : null, treehouseAppConfig2 != null ? treehouseAppConfig2.minimal_commit_timestamp : null);
    }

    public final ChannelFlowTransformLatest manifestUrlFlow(String str) {
        GpsConfigQueries gpsConfigQueries = this.treehouseAppConfigurationsQueries;
        gpsConfigQueries.getClass();
        TreehouseAppConfigurationsQueries$forId$2 treehouseAppConfigurationsQueries$forId$2 = TreehouseAppConfigurationsQueries$forId$2.INSTANCE;
        byte b = 0;
        FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(new BadgeCountQueries$ForGroupQuery(gpsConfigQueries, str, new StorageLinkQueries$$ExternalSyntheticLambda8(gpsConfigQueries, b), 3)), this.ioDispatcher);
        RealAppConfigManager realAppConfigManager = (RealAppConfigManager) this.appConfig;
        SessionQueries sessionQueries = realAppConfigManager.treehouseAppConfigQueries;
        sessionQueries.getClass();
        int i = TreehouseAppConfigQueries$selectAll$2.$r8$clinit;
        SqlDriver sqlDriver = sessionQueries.driver;
        WebLoginConfigQueries$$ExternalSyntheticLambda0 webLoginConfigQueries$$ExternalSyntheticLambda0 = new WebLoginConfigQueries$$ExternalSyntheticLambda0(1);
        sqlDriver.getClass();
        Continuation continuation = null;
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(mapToOneOrNull, DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(860847422, new String[]{"treehouseAppConfig"}, sqlDriver, "TreehouseAppConfig.sq", "selectAll", "SELECT treehouseAppConfig.app_name, treehouseAppConfig.path, treehouseAppConfig.url, treehouseAppConfig.minimal_commit_timestamp FROM treehouseAppConfig", webLoginConfigQueries$$ExternalSyntheticLambda0)), realAppConfigManager.ioDispatcher), new FlowKt__ZipKt$combine$1$1(this, str, continuation, 2), b)), new Badger$collect$$inlined$combine$2$3(continuation, this, 8));
    }

    public final String minimalCommitTimestamp(String str) {
        SessionQueries sessionQueries = this.treehouseAppConfigQueries;
        sessionQueries.getClass();
        int i = TreehouseAppConfigQueries$forAppName$2.$r8$clinit;
        TreehouseAppConfig treehouseAppConfig = (TreehouseAppConfig) new RewardQueries.ForIdsQuery(sessionQueries, str, new InstrumentQueries$$ExternalSyntheticLambda2(26), 18).executeAsOneOrNull();
        if (treehouseAppConfig != null) {
            return treehouseAppConfig.minimal_commit_timestamp;
        }
        return null;
    }
}
