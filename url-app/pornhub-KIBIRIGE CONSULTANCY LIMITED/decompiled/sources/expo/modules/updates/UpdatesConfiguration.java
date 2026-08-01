package expo.modules.updates;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import expo.modules.core.errors.InvalidArgumentException;
import expo.modules.updates.codesigning.CodeSigningConfiguration;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: UpdatesConfiguration.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u0000 X2\u00020\u0001:\u0002WXBÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u001bB)\b\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u001fB;\b\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\b\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001a\u0010\"J\u0006\u0010?\u001a\u00020\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\tHÆ\u0003J\t\u0010E\u001a\u00020\u000bHÆ\u0003J\t\u0010F\u001a\u00020\rHÆ\u0003J\t\u0010G\u001a\u00020\rHÆ\u0003J\u0015\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010HÆ\u0003J\u0015\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\t\u0010L\u001a\u00020\rHÆ\u0003J\t\u0010M\u001a\u00020\rHÂ\u0003J\t\u0010N\u001a\u00020\rHÆ\u0003J\t\u0010O\u001a\u00020\rHÆ\u0003J\t\u0010P\u001a\u00020\rHÆ\u0003J\u0017\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010HÂ\u0003Jõ\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010HÆ\u0001J\u0013\u0010S\u001a\u00020\r2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\tHÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u0011\u0010\u0017\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0011\u0010\u0018\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00109\u001a\u0004\u0018\u00010:8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b;\u0010<¨\u0006Y"}, d2 = {"Lexpo/modules/updates/UpdatesConfiguration;", "", UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY, "", UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY, "Landroid/net/Uri;", "originalEmbeddedUpdateUrl", "runtimeVersionRaw", UpdatesConfiguration.UPDATES_CONFIGURATION_LAUNCH_WAIT_MS_KEY, "", UpdatesConfiguration.UPDATES_CONFIGURATION_CHECK_ON_LAUNCH_KEY, "Lexpo/modules/updates/UpdatesConfiguration$CheckAutomaticallyConfiguration;", UpdatesConfiguration.UPDATES_CONFIGURATION_HAS_EMBEDDED_UPDATE_KEY, "", "originalHasEmbeddedUpdate", UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY, "", "originalEmbeddedRequestHeaders", UpdatesConfiguration.UPDATES_CONFIGURATION_CODE_SIGNING_CERTIFICATE, UpdatesConfiguration.UPDATES_CONFIGURATION_CODE_SIGNING_METADATA, UpdatesConfiguration.UPDATES_CONFIGURATION_CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN, UpdatesConfiguration.UPDATES_CONFIGURATION_CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS, "enableExpoUpdatesProtocolV0CompatibilityMode", UpdatesConfiguration.UPDATES_CONFIGURATION_DISABLE_ANTI_BRICKING_MEASURES, "hasUpdatesOverride", "cachedOverrideMap", "<init>", "(Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;ILexpo/modules/updates/UpdatesConfiguration$CheckAutomaticallyConfiguration;ZZLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ZZZZZLjava/util/Map;)V", "context", "Landroid/content/Context;", "overrideMap", "(Landroid/content/Context;Ljava/util/Map;)V", "configOverride", "Lexpo/modules/updates/UpdatesConfigurationOverride;", "(Landroid/content/Context;Ljava/util/Map;ZLexpo/modules/updates/UpdatesConfigurationOverride;)V", "getScopeKey", "()Ljava/lang/String;", "getUpdateUrl", "()Landroid/net/Uri;", "getOriginalEmbeddedUpdateUrl", "getRuntimeVersionRaw", "getLaunchWaitMs", "()I", "getCheckOnLaunch", "()Lexpo/modules/updates/UpdatesConfiguration$CheckAutomaticallyConfiguration;", "getHasEmbeddedUpdate", "()Z", "getOriginalHasEmbeddedUpdate", "getRequestHeaders", "()Ljava/util/Map;", "getOriginalEmbeddedRequestHeaders", "getCodeSigningCertificate", "getCodeSigningMetadata", "getCodeSigningIncludeManifestResponseCertificateChain", "getEnableExpoUpdatesProtocolV0CompatibilityMode", "getDisableAntiBrickingMeasures", "getHasUpdatesOverride", "codeSigningConfiguration", "Lexpo/modules/updates/codesigning/CodeSigningConfiguration;", "getCodeSigningConfiguration", "()Lexpo/modules/updates/codesigning/CodeSigningConfiguration;", "codeSigningConfiguration$delegate", "Lkotlin/Lazy;", "getRuntimeVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "toString", "CheckAutomaticallyConfiguration", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UpdatesConfiguration {
    private static final String FINGERPRINT_FILE_NAME = "fingerprint";
    public static final String UPDATES_CONFIGURATION_CHECK_ON_LAUNCH_KEY = "checkOnLaunch";
    public static final String UPDATES_CONFIGURATION_CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS = "codeSigningAllowUnsignedManifests";
    public static final String UPDATES_CONFIGURATION_CODE_SIGNING_CERTIFICATE = "codeSigningCertificate";
    public static final String UPDATES_CONFIGURATION_CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN = "codeSigningIncludeManifestResponseCertificateChain";
    public static final String UPDATES_CONFIGURATION_CODE_SIGNING_METADATA = "codeSigningMetadata";
    public static final String UPDATES_CONFIGURATION_DISABLE_ANTI_BRICKING_MEASURES = "disableAntiBrickingMeasures";
    public static final String UPDATES_CONFIGURATION_ENABLED_KEY = "enabled";
    public static final String UPDATES_CONFIGURATION_ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE = "enableExpoUpdatesProtocolCompatibilityMode";
    public static final String UPDATES_CONFIGURATION_HAS_EMBEDDED_UPDATE_KEY = "hasEmbeddedUpdate";
    private static final int UPDATES_CONFIGURATION_LAUNCH_WAIT_MS_DEFAULT_VALUE = 0;
    public static final String UPDATES_CONFIGURATION_LAUNCH_WAIT_MS_KEY = "launchWaitMs";
    public static final String UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY = "requestHeaders";
    public static final String UPDATES_CONFIGURATION_RUNTIME_VERSION_KEY = "runtimeVersion";
    public static final String UPDATES_CONFIGURATION_RUNTIME_VERSION_READ_FINGERPRINT_FILE_SENTINEL = "file:fingerprint";
    public static final String UPDATES_CONFIGURATION_SCOPE_KEY_KEY = "scopeKey";
    public static final String UPDATES_CONFIGURATION_UPDATE_URL_KEY = "updateUrl";
    private final Map<String, Object> cachedOverrideMap;
    private final CheckAutomaticallyConfiguration checkOnLaunch;
    private final boolean codeSigningAllowUnsignedManifests;
    private final String codeSigningCertificate;

    /* renamed from: codeSigningConfiguration$delegate, reason: from kotlin metadata */
    private final Lazy codeSigningConfiguration;
    private final boolean codeSigningIncludeManifestResponseCertificateChain;
    private final Map<String, String> codeSigningMetadata;
    private final boolean disableAntiBrickingMeasures;
    private final boolean enableExpoUpdatesProtocolV0CompatibilityMode;
    private final boolean hasEmbeddedUpdate;
    private final boolean hasUpdatesOverride;
    private final int launchWaitMs;
    private final Map<String, String> originalEmbeddedRequestHeaders;
    private final Uri originalEmbeddedUpdateUrl;
    private final boolean originalHasEmbeddedUpdate;
    private final Map<String, String> requestHeaders;
    private final String runtimeVersionRaw;
    private final String scopeKey;
    private final Uri updateUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "UpdatesConfiguration";

    /* renamed from: component14, reason: from getter */
    private final boolean getCodeSigningAllowUnsignedManifests() {
        return this.codeSigningAllowUnsignedManifests;
    }

    private final Map<String, Object> component18() {
        return this.cachedOverrideMap;
    }

    public static /* synthetic */ UpdatesConfiguration copy$default(UpdatesConfiguration updatesConfiguration, String str, Uri uri, Uri uri2, String str2, int i, CheckAutomaticallyConfiguration checkAutomaticallyConfiguration, boolean z, boolean z2, Map map, Map map2, String str3, Map map3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Map map4, int i2, Object obj) {
        Map map5;
        boolean z8;
        String str4 = (i2 & 1) != 0 ? updatesConfiguration.scopeKey : str;
        Uri uri3 = (i2 & 2) != 0 ? updatesConfiguration.updateUrl : uri;
        Uri uri4 = (i2 & 4) != 0 ? updatesConfiguration.originalEmbeddedUpdateUrl : uri2;
        String str5 = (i2 & 8) != 0 ? updatesConfiguration.runtimeVersionRaw : str2;
        int i3 = (i2 & 16) != 0 ? updatesConfiguration.launchWaitMs : i;
        CheckAutomaticallyConfiguration checkAutomaticallyConfiguration2 = (i2 & 32) != 0 ? updatesConfiguration.checkOnLaunch : checkAutomaticallyConfiguration;
        boolean z9 = (i2 & 64) != 0 ? updatesConfiguration.hasEmbeddedUpdate : z;
        boolean z10 = (i2 & 128) != 0 ? updatesConfiguration.originalHasEmbeddedUpdate : z2;
        Map map6 = (i2 & 256) != 0 ? updatesConfiguration.requestHeaders : map;
        Map map7 = (i2 & 512) != 0 ? updatesConfiguration.originalEmbeddedRequestHeaders : map2;
        String str6 = (i2 & 1024) != 0 ? updatesConfiguration.codeSigningCertificate : str3;
        Map map8 = (i2 & 2048) != 0 ? updatesConfiguration.codeSigningMetadata : map3;
        boolean z11 = (i2 & 4096) != 0 ? updatesConfiguration.codeSigningIncludeManifestResponseCertificateChain : z3;
        boolean z12 = (i2 & 8192) != 0 ? updatesConfiguration.codeSigningAllowUnsignedManifests : z4;
        String str7 = str4;
        boolean z13 = (i2 & 16384) != 0 ? updatesConfiguration.enableExpoUpdatesProtocolV0CompatibilityMode : z5;
        boolean z14 = (i2 & 32768) != 0 ? updatesConfiguration.disableAntiBrickingMeasures : z6;
        boolean z15 = (i2 & 65536) != 0 ? updatesConfiguration.hasUpdatesOverride : z7;
        if ((i2 & 131072) != 0) {
            z8 = z15;
            map5 = updatesConfiguration.cachedOverrideMap;
        } else {
            map5 = map4;
            z8 = z15;
        }
        return updatesConfiguration.copy(str7, uri3, uri4, str5, i3, checkAutomaticallyConfiguration2, z9, z10, map6, map7, str6, map8, z11, z12, z13, z14, z8, map5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScopeKey() {
        return this.scopeKey;
    }

    public final Map<String, String> component10() {
        return this.originalEmbeddedRequestHeaders;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCodeSigningCertificate() {
        return this.codeSigningCertificate;
    }

    public final Map<String, String> component12() {
        return this.codeSigningMetadata;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getCodeSigningIncludeManifestResponseCertificateChain() {
        return this.codeSigningIncludeManifestResponseCertificateChain;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getEnableExpoUpdatesProtocolV0CompatibilityMode() {
        return this.enableExpoUpdatesProtocolV0CompatibilityMode;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getDisableAntiBrickingMeasures() {
        return this.disableAntiBrickingMeasures;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getHasUpdatesOverride() {
        return this.hasUpdatesOverride;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getUpdateUrl() {
        return this.updateUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final Uri getOriginalEmbeddedUpdateUrl() {
        return this.originalEmbeddedUpdateUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRuntimeVersionRaw() {
        return this.runtimeVersionRaw;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLaunchWaitMs() {
        return this.launchWaitMs;
    }

    /* renamed from: component6, reason: from getter */
    public final CheckAutomaticallyConfiguration getCheckOnLaunch() {
        return this.checkOnLaunch;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasEmbeddedUpdate() {
        return this.hasEmbeddedUpdate;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getOriginalHasEmbeddedUpdate() {
        return this.originalHasEmbeddedUpdate;
    }

    public final Map<String, String> component9() {
        return this.requestHeaders;
    }

    public final UpdatesConfiguration copy(String scopeKey, Uri updateUrl, Uri originalEmbeddedUpdateUrl, String runtimeVersionRaw, int launchWaitMs, CheckAutomaticallyConfiguration checkOnLaunch, boolean hasEmbeddedUpdate, boolean originalHasEmbeddedUpdate, Map<String, String> requestHeaders, Map<String, String> originalEmbeddedRequestHeaders, String codeSigningCertificate, Map<String, String> codeSigningMetadata, boolean codeSigningIncludeManifestResponseCertificateChain, boolean codeSigningAllowUnsignedManifests, boolean enableExpoUpdatesProtocolV0CompatibilityMode, boolean disableAntiBrickingMeasures, boolean hasUpdatesOverride, Map<String, ? extends Object> cachedOverrideMap) {
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        Intrinsics.checkNotNullParameter(updateUrl, "updateUrl");
        Intrinsics.checkNotNullParameter(originalEmbeddedUpdateUrl, "originalEmbeddedUpdateUrl");
        Intrinsics.checkNotNullParameter(checkOnLaunch, "checkOnLaunch");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(originalEmbeddedRequestHeaders, "originalEmbeddedRequestHeaders");
        return new UpdatesConfiguration(scopeKey, updateUrl, originalEmbeddedUpdateUrl, runtimeVersionRaw, launchWaitMs, checkOnLaunch, hasEmbeddedUpdate, originalHasEmbeddedUpdate, requestHeaders, originalEmbeddedRequestHeaders, codeSigningCertificate, codeSigningMetadata, codeSigningIncludeManifestResponseCertificateChain, codeSigningAllowUnsignedManifests, enableExpoUpdatesProtocolV0CompatibilityMode, disableAntiBrickingMeasures, hasUpdatesOverride, cachedOverrideMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatesConfiguration)) {
            return false;
        }
        UpdatesConfiguration updatesConfiguration = (UpdatesConfiguration) other;
        return Intrinsics.areEqual(this.scopeKey, updatesConfiguration.scopeKey) && Intrinsics.areEqual(this.updateUrl, updatesConfiguration.updateUrl) && Intrinsics.areEqual(this.originalEmbeddedUpdateUrl, updatesConfiguration.originalEmbeddedUpdateUrl) && Intrinsics.areEqual(this.runtimeVersionRaw, updatesConfiguration.runtimeVersionRaw) && this.launchWaitMs == updatesConfiguration.launchWaitMs && this.checkOnLaunch == updatesConfiguration.checkOnLaunch && this.hasEmbeddedUpdate == updatesConfiguration.hasEmbeddedUpdate && this.originalHasEmbeddedUpdate == updatesConfiguration.originalHasEmbeddedUpdate && Intrinsics.areEqual(this.requestHeaders, updatesConfiguration.requestHeaders) && Intrinsics.areEqual(this.originalEmbeddedRequestHeaders, updatesConfiguration.originalEmbeddedRequestHeaders) && Intrinsics.areEqual(this.codeSigningCertificate, updatesConfiguration.codeSigningCertificate) && Intrinsics.areEqual(this.codeSigningMetadata, updatesConfiguration.codeSigningMetadata) && this.codeSigningIncludeManifestResponseCertificateChain == updatesConfiguration.codeSigningIncludeManifestResponseCertificateChain && this.codeSigningAllowUnsignedManifests == updatesConfiguration.codeSigningAllowUnsignedManifests && this.enableExpoUpdatesProtocolV0CompatibilityMode == updatesConfiguration.enableExpoUpdatesProtocolV0CompatibilityMode && this.disableAntiBrickingMeasures == updatesConfiguration.disableAntiBrickingMeasures && this.hasUpdatesOverride == updatesConfiguration.hasUpdatesOverride && Intrinsics.areEqual(this.cachedOverrideMap, updatesConfiguration.cachedOverrideMap);
    }

    public int hashCode() {
        int hashCode = ((((this.scopeKey.hashCode() * 31) + this.updateUrl.hashCode()) * 31) + this.originalEmbeddedUpdateUrl.hashCode()) * 31;
        String str = this.runtimeVersionRaw;
        int hashCode2 = (((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.launchWaitMs)) * 31) + this.checkOnLaunch.hashCode()) * 31) + Boolean.hashCode(this.hasEmbeddedUpdate)) * 31) + Boolean.hashCode(this.originalHasEmbeddedUpdate)) * 31) + this.requestHeaders.hashCode()) * 31) + this.originalEmbeddedRequestHeaders.hashCode()) * 31;
        String str2 = this.codeSigningCertificate;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.codeSigningMetadata;
        int hashCode4 = (((((((((((hashCode3 + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.codeSigningIncludeManifestResponseCertificateChain)) * 31) + Boolean.hashCode(this.codeSigningAllowUnsignedManifests)) * 31) + Boolean.hashCode(this.enableExpoUpdatesProtocolV0CompatibilityMode)) * 31) + Boolean.hashCode(this.disableAntiBrickingMeasures)) * 31) + Boolean.hashCode(this.hasUpdatesOverride)) * 31;
        Map<String, Object> map2 = this.cachedOverrideMap;
        return hashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "UpdatesConfiguration(scopeKey=" + this.scopeKey + ", updateUrl=" + this.updateUrl + ", originalEmbeddedUpdateUrl=" + this.originalEmbeddedUpdateUrl + ", runtimeVersionRaw=" + this.runtimeVersionRaw + ", launchWaitMs=" + this.launchWaitMs + ", checkOnLaunch=" + this.checkOnLaunch + ", hasEmbeddedUpdate=" + this.hasEmbeddedUpdate + ", originalHasEmbeddedUpdate=" + this.originalHasEmbeddedUpdate + ", requestHeaders=" + this.requestHeaders + ", originalEmbeddedRequestHeaders=" + this.originalEmbeddedRequestHeaders + ", codeSigningCertificate=" + this.codeSigningCertificate + ", codeSigningMetadata=" + this.codeSigningMetadata + ", codeSigningIncludeManifestResponseCertificateChain=" + this.codeSigningIncludeManifestResponseCertificateChain + ", codeSigningAllowUnsignedManifests=" + this.codeSigningAllowUnsignedManifests + ", enableExpoUpdatesProtocolV0CompatibilityMode=" + this.enableExpoUpdatesProtocolV0CompatibilityMode + ", disableAntiBrickingMeasures=" + this.disableAntiBrickingMeasures + ", hasUpdatesOverride=" + this.hasUpdatesOverride + ", cachedOverrideMap=" + this.cachedOverrideMap + ")";
    }

    public UpdatesConfiguration(String scopeKey, Uri updateUrl, Uri originalEmbeddedUpdateUrl, String str, int i, CheckAutomaticallyConfiguration checkOnLaunch, boolean z, boolean z2, Map<String, String> requestHeaders, Map<String, String> originalEmbeddedRequestHeaders, String str2, Map<String, String> map, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Map<String, ? extends Object> map2) {
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        Intrinsics.checkNotNullParameter(updateUrl, "updateUrl");
        Intrinsics.checkNotNullParameter(originalEmbeddedUpdateUrl, "originalEmbeddedUpdateUrl");
        Intrinsics.checkNotNullParameter(checkOnLaunch, "checkOnLaunch");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(originalEmbeddedRequestHeaders, "originalEmbeddedRequestHeaders");
        this.scopeKey = scopeKey;
        this.updateUrl = updateUrl;
        this.originalEmbeddedUpdateUrl = originalEmbeddedUpdateUrl;
        this.runtimeVersionRaw = str;
        this.launchWaitMs = i;
        this.checkOnLaunch = checkOnLaunch;
        this.hasEmbeddedUpdate = z;
        this.originalHasEmbeddedUpdate = z2;
        this.requestHeaders = requestHeaders;
        this.originalEmbeddedRequestHeaders = originalEmbeddedRequestHeaders;
        this.codeSigningCertificate = str2;
        this.codeSigningMetadata = map;
        this.codeSigningIncludeManifestResponseCertificateChain = z3;
        this.codeSigningAllowUnsignedManifests = z4;
        this.enableExpoUpdatesProtocolV0CompatibilityMode = z5;
        this.disableAntiBrickingMeasures = z6;
        this.hasUpdatesOverride = z7;
        this.cachedOverrideMap = map2;
        this.codeSigningConfiguration = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.UpdatesConfiguration$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CodeSigningConfiguration codeSigningConfiguration_delegate$lambda$5;
                codeSigningConfiguration_delegate$lambda$5 = UpdatesConfiguration.codeSigningConfiguration_delegate$lambda$5(UpdatesConfiguration.this);
                return codeSigningConfiguration_delegate$lambda$5;
            }
        });
    }

    public final String getScopeKey() {
        return this.scopeKey;
    }

    public final Uri getUpdateUrl() {
        return this.updateUrl;
    }

    public final Uri getOriginalEmbeddedUpdateUrl() {
        return this.originalEmbeddedUpdateUrl;
    }

    public final String getRuntimeVersionRaw() {
        return this.runtimeVersionRaw;
    }

    public final int getLaunchWaitMs() {
        return this.launchWaitMs;
    }

    public final CheckAutomaticallyConfiguration getCheckOnLaunch() {
        return this.checkOnLaunch;
    }

    public final boolean getHasEmbeddedUpdate() {
        return this.hasEmbeddedUpdate;
    }

    public final boolean getOriginalHasEmbeddedUpdate() {
        return this.originalHasEmbeddedUpdate;
    }

    public final Map<String, String> getRequestHeaders() {
        return this.requestHeaders;
    }

    public final Map<String, String> getOriginalEmbeddedRequestHeaders() {
        return this.originalEmbeddedRequestHeaders;
    }

    public final String getCodeSigningCertificate() {
        return this.codeSigningCertificate;
    }

    public final Map<String, String> getCodeSigningMetadata() {
        return this.codeSigningMetadata;
    }

    public final boolean getCodeSigningIncludeManifestResponseCertificateChain() {
        return this.codeSigningIncludeManifestResponseCertificateChain;
    }

    public final boolean getEnableExpoUpdatesProtocolV0CompatibilityMode() {
        return this.enableExpoUpdatesProtocolV0CompatibilityMode;
    }

    public final boolean getDisableAntiBrickingMeasures() {
        return this.disableAntiBrickingMeasures;
    }

    public final boolean getHasUpdatesOverride() {
        return this.hasUpdatesOverride;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UpdatesConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/updates/UpdatesConfiguration$CheckAutomaticallyConfiguration;", "", "<init>", "(Ljava/lang/String;I)V", "NEVER", "ERROR_RECOVERY_ONLY", "WIFI_ONLY", "ALWAYS", "toJSString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckAutomaticallyConfiguration {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckAutomaticallyConfiguration[] $VALUES;
        public static final CheckAutomaticallyConfiguration NEVER = new NEVER("NEVER", 0);
        public static final CheckAutomaticallyConfiguration ERROR_RECOVERY_ONLY = new ERROR_RECOVERY_ONLY("ERROR_RECOVERY_ONLY", 1);
        public static final CheckAutomaticallyConfiguration WIFI_ONLY = new WIFI_ONLY("WIFI_ONLY", 2);
        public static final CheckAutomaticallyConfiguration ALWAYS = new ALWAYS("ALWAYS", 3);

        private static final /* synthetic */ CheckAutomaticallyConfiguration[] $values() {
            return new CheckAutomaticallyConfiguration[]{NEVER, ERROR_RECOVERY_ONLY, WIFI_ONLY, ALWAYS};
        }

        public /* synthetic */ CheckAutomaticallyConfiguration(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CheckAutomaticallyConfiguration> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: UpdatesConfiguration.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"expo/modules/updates/UpdatesConfiguration.CheckAutomaticallyConfiguration.NEVER", "Lexpo/modules/updates/UpdatesConfiguration$CheckAutomaticallyConfiguration;", "toJSString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class NEVER extends CheckAutomaticallyConfiguration {
            NEVER(String str, int i) {
                super(str, i, null);
            }

            @Override // expo.modules.updates.UpdatesConfiguration.CheckAutomaticallyConfiguration
            public String toJSString() {
                return "NEVER";
            }
        }

        private CheckAutomaticallyConfiguration(String str, int i) {
        }

        static {
            CheckAutomaticallyConfiguration[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        /* compiled from: UpdatesConfiguration.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"expo/modules/updates/UpdatesConfiguration.CheckAutomaticallyConfiguration.ERROR_RECOVERY_ONLY", "Lexpo/modules/updates/UpdatesConfiguration$CheckAutomaticallyConfiguration;", "toJSString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class ERROR_RECOVERY_ONLY extends CheckAutomaticallyConfiguration {
            ERROR_RECOVERY_ONLY(String str, int i) {
                super(str, i, null);
            }

            @Override // expo.modules.updates.UpdatesConfiguration.CheckAutomaticallyConfiguration
            public String toJSString() {
                return "ERROR_RECOVERY_ONLY";
            }
        }

        /* compiled from: UpdatesConfiguration.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"expo/modules/updates/UpdatesConfiguration.CheckAutomaticallyConfiguration.WIFI_ONLY", "Lexpo/modules/updates/UpdatesConfiguration$CheckAutomaticallyConfiguration;", "toJSString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class WIFI_ONLY extends CheckAutomaticallyConfiguration {
            WIFI_ONLY(String str, int i) {
                super(str, i, null);
            }

            @Override // expo.modules.updates.UpdatesConfiguration.CheckAutomaticallyConfiguration
            public String toJSString() {
                return "WIFI_ONLY";
            }
        }

        /* compiled from: UpdatesConfiguration.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"expo/modules/updates/UpdatesConfiguration.CheckAutomaticallyConfiguration.ALWAYS", "Lexpo/modules/updates/UpdatesConfiguration$CheckAutomaticallyConfiguration;", "toJSString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class ALWAYS extends CheckAutomaticallyConfiguration {
            ALWAYS(String str, int i) {
                super(str, i, null);
            }

            @Override // expo.modules.updates.UpdatesConfiguration.CheckAutomaticallyConfiguration
            public String toJSString() {
                return "ALWAYS";
            }
        }

        public String toJSString() {
            throw new InvalidArgumentException("Unsupported CheckAutomaticallyConfiguration value");
        }

        public static CheckAutomaticallyConfiguration valueOf(String str) {
            return (CheckAutomaticallyConfiguration) Enum.valueOf(CheckAutomaticallyConfiguration.class, str);
        }

        public static CheckAutomaticallyConfiguration[] values() {
            return (CheckAutomaticallyConfiguration[]) $VALUES.clone();
        }
    }

    public UpdatesConfiguration(Context context, Map<String, ? extends Object> map) {
        this(context, map, INSTANCE.getDisableAntiBrickingMeasures(context, map), context != null ? UpdatesConfigurationOverride.INSTANCE.load$expo_updates_release(context) : null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:0|1|(3:3|(1:5)(2:222|(2:224|225))|6)|(2:227|(38:229|(1:231)(2:232|(1:234)(2:235|(1:237)(1:238)))|8|(3:10|(1:12)(2:202|(2:204|205))|13)|(2:207|(34:209|(1:211)(2:214|(1:216)(2:217|(1:219)(1:220)))|(31:213|(4:17|(1:19)(2:177|(2:179|180))|20|(2:22|23))|(2:182|(1:184)(2:191|(1:193)(2:194|(1:196)(2:197|(1:199)(1:200)))))|201|186|187|188|25|(4:27|(1:29)(2:154|(2:156|157))|30|(21:32|(4:34|(1:36)(2:132|(2:134|135))|37|(17:39|(4:41|(1:43)(2:111|(2:113|114))|44|(13:46|(4:48|(1:50)(2:90|(2:92|93))|51|(9:53|(4:55|(1:57)(2:68|(2:70|71))|58|(5:60|61|(1:63)(1:67)|64|65))|(2:73|(8:75|(1:77)(2:82|(1:84)(2:85|(1:87)(1:88)))|78|(1:80)(1:81)|61|(0)(0)|64|65))|89|(0)(0)|61|(0)(0)|64|65))|(2:95|(11:97|(1:99)(2:103|(1:105)(2:106|(1:108)(1:109)))|(1:101)(1:102)|(0)|(0)|89|(0)(0)|61|(0)(0)|64|65))|110|(0)(0)|(0)|(0)|89|(0)(0)|61|(0)(0)|64|65))|(2:116|(15:118|(1:120)(2:124|(1:126)(2:127|(1:129)(1:130)))|(1:122)(1:123)|(0)|(0)|110|(0)(0)|(0)|(0)|89|(0)(0)|61|(0)(0)|64|65))|131|(0)(0)|(0)|(0)|110|(0)(0)|(0)|(0)|89|(0)(0)|61|(0)(0)|64|65))|(2:137|(1:139)(2:143|(1:145)(2:146|(1:148)(2:149|(1:151)(1:152)))))(1:153)|142|141|(0)|(0)|131|(0)(0)|(0)|(0)|110|(0)(0)|(0)|(0)|89|(0)(0)|61|(0)(0)|64|65))|(2:159|(23:161|(1:163)(2:165|(1:167)(2:168|(1:170)(1:171)))|164|(0)|(0)(0)|142|141|(0)|(0)|131|(0)(0)|(0)|(0)|110|(0)(0)|(0)|(0)|89|(0)(0)|61|(0)(0)|64|65))(1:173)|172|(0)|(0)(0)|142|141|(0)|(0)|131|(0)(0)|(0)|(0)|110|(0)(0)|(0)|(0)|89|(0)(0)|61|(0)(0)|64|65)|15|(0)|(0)|201|186|187|188|25|(0)|(0)(0)|172|(0)|(0)(0)|142|141|(0)|(0)|131|(0)(0)|(0)|(0)|110|(0)(0)|(0)|(0)|89|(0)(0)|61|(0)(0)|64|65))|221|(0)|15|(0)|(0)|201|186|187|188|25|(0)|(0)(0)|172|(0)|(0)(0)|142|141|(0)|(0)|131|(0)(0)|(0)|(0)|110|(0)(0)|(0)|(0)|89|(0)(0)|61|(0)(0)|64|65))|239|8|(0)|(0)|221|(0)|15|(0)|(0)|201|186|187|188|25|(0)|(0)(0)|172|(0)|(0)(0)|142|141|(0)|(0)|131|(0)(0)|(0)|(0)|110|(0)(0)|(0)|(0)|89|(0)(0)|61|(0)(0)|64|65|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03da, code lost:
    
        if (r2 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e4, code lost:
    
        if (r12 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x023d, code lost:
    
        if (r6 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0247, code lost:
    
        android.util.Log.e(expo.modules.updates.UpdatesConfiguration.TAG, "Invalid value " + r6 + " for expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH in AndroidManifest; defaulting to ALWAYS");
        r6 = expo.modules.updates.UpdatesConfiguration.CheckAutomaticallyConfiguration.ALWAYS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0196, code lost:
    
        if (r13 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r7 == null) goto L14;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UpdatesConfiguration(Context context, Map<String, ? extends Object> map, boolean z, UpdatesConfigurationOverride updatesConfigurationOverride) {
        this(r7, r9, r20, r8, r12, r21, r7, r8, r27, r10, r11, r22, r23, r2, r3, r13.getDisableAntiBrickingMeasures(context, map), updatesConfigurationOverride != null, map);
        String str;
        String maybeGetDefaultScopeKey;
        Integer num;
        int i;
        String str2;
        CheckAutomaticallyConfiguration checkAutomaticallyConfiguration;
        Map map2;
        Uri uri;
        String str3;
        String str4;
        CheckAutomaticallyConfiguration checkAutomaticallyConfiguration2;
        String str5;
        Map<String, String> mapFromJSONString;
        Map<String, String> map3;
        Boolean bool;
        boolean booleanValue;
        boolean z2;
        Boolean bool2;
        boolean booleanValue2;
        Boolean bool3;
        boolean booleanValue3;
        Boolean valueOf;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        if (map != null) {
            if (map.containsKey(UPDATES_CONFIGURATION_SCOPE_KEY_KEY)) {
                obj8 = map.get(UPDATES_CONFIGURATION_SCOPE_KEY_KEY);
                if (!(obj8 instanceof String)) {
                    Intrinsics.checkNotNull(obj8);
                    throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj8.getClass().getSimpleName() + " provided for key scopeKey");
                }
            } else {
                obj8 = null;
            }
            str = (String) obj8;
        }
        if (context != null) {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle.containsKey("expo.modules.updates.EXPO_SCOPE_KEY")) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    str = bundle.getString("expo.modules.updates.EXPO_SCOPE_KEY");
                } else {
                    str = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? (String) Boolean.valueOf(bundle.getBoolean("expo.modules.updates.EXPO_SCOPE_KEY")) : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (String) Integer.valueOf(bundle.getInt("expo.modules.updates.EXPO_SCOPE_KEY")) : (String) bundle.get("expo.modules.updates.EXPO_SCOPE_KEY");
                }
                Companion companion = INSTANCE;
                Uri updateUrl = companion.getUpdateUrl(context, map, z, updatesConfigurationOverride);
                Intrinsics.checkNotNull(updateUrl);
                maybeGetDefaultScopeKey = UpdatesConfigurationKt.maybeGetDefaultScopeKey(str, updateUrl);
                Uri updateUrl2 = companion.getUpdateUrl(context, map, z, updatesConfigurationOverride);
                Intrinsics.checkNotNull(updateUrl2);
                Uri originalEmbeddedUpdateUrl = companion.getOriginalEmbeddedUpdateUrl(context, map);
                Intrinsics.checkNotNull(originalEmbeddedUpdateUrl);
                String runtimeVersion = companion.getRuntimeVersion(context, map);
                if (map != null) {
                    if (map.containsKey(UPDATES_CONFIGURATION_LAUNCH_WAIT_MS_KEY)) {
                        obj7 = map.get(UPDATES_CONFIGURATION_LAUNCH_WAIT_MS_KEY);
                        if (!(obj7 instanceof Integer)) {
                            Intrinsics.checkNotNull(obj7);
                            throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj7.getClass().getSimpleName() + " provided for key launchWaitMs");
                        }
                    } else {
                        obj7 = null;
                    }
                    num = (Integer) obj7;
                }
                if (context != null) {
                    Bundle bundle2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle2.containsKey("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS")) {
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Integer.class);
                        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                            num = (Integer) bundle2.getString("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS");
                        } else {
                            num = Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? (Integer) Boolean.valueOf(bundle2.getBoolean("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS")) : Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? Integer.valueOf(bundle2.getInt("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS")) : (Integer) bundle2.get("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS");
                        }
                        if (num == null) {
                            i = 0;
                            if (map != null) {
                                if (map.containsKey(UPDATES_CONFIGURATION_CHECK_ON_LAUNCH_KEY)) {
                                    obj6 = map.get(UPDATES_CONFIGURATION_CHECK_ON_LAUNCH_KEY);
                                    if (!(obj6 instanceof String)) {
                                        Intrinsics.checkNotNull(obj6);
                                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj6.getClass().getSimpleName() + " provided for key checkOnLaunch");
                                    }
                                } else {
                                    obj6 = null;
                                }
                                String str6 = (String) obj6;
                                if (str6 != null) {
                                    try {
                                        checkAutomaticallyConfiguration = CheckAutomaticallyConfiguration.valueOf(str6);
                                    } catch (IllegalArgumentException unused) {
                                        throw new AssertionError("UpdatesConfiguration failed to initialize: invalid value " + str6 + " provided for checkOnLaunch");
                                    }
                                }
                            }
                            if (context != null) {
                                Bundle bundle3 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                                if (bundle3.containsKey("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH")) {
                                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(String.class);
                                    if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(String.class))) {
                                        str2 = bundle3.getString("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH");
                                    } else {
                                        str2 = Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? (String) Boolean.valueOf(bundle3.getBoolean("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH")) : Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (String) Integer.valueOf(bundle3.getInt("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH")) : (String) bundle3.get("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH");
                                    }
                                } else {
                                    str2 = null;
                                }
                            }
                            str2 = "ALWAYS";
                            CheckAutomaticallyConfiguration checkAutomaticallyConfiguration3 = CheckAutomaticallyConfiguration.valueOf(str2);
                            checkAutomaticallyConfiguration = checkAutomaticallyConfiguration3;
                            CheckAutomaticallyConfiguration checkAutomaticallyConfiguration4 = checkAutomaticallyConfiguration;
                            Companion companion2 = INSTANCE;
                            boolean hasEmbeddedUpdate = companion2.getHasEmbeddedUpdate(context, map, z, updatesConfigurationOverride);
                            boolean originalHasEmbeddedUpdate = companion2.getOriginalHasEmbeddedUpdate(context, map);
                            Map requestHeaders = companion2.getRequestHeaders(context, map, z, updatesConfigurationOverride);
                            Map originalEmbeddedRequestHeaders = companion2.getOriginalEmbeddedRequestHeaders(context, map);
                            if (map != null) {
                                if (map.containsKey(UPDATES_CONFIGURATION_CODE_SIGNING_CERTIFICATE)) {
                                    obj5 = map.get(UPDATES_CONFIGURATION_CODE_SIGNING_CERTIFICATE);
                                    if (!(obj5 instanceof String)) {
                                        Intrinsics.checkNotNull(obj5);
                                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj5.getClass().getSimpleName() + " provided for key codeSigningCertificate");
                                    }
                                } else {
                                    obj5 = null;
                                }
                                str3 = (String) obj5;
                                if (str3 != null) {
                                    map2 = requestHeaders;
                                    uri = originalEmbeddedUpdateUrl;
                                    if (map != null) {
                                        if (map.containsKey(UPDATES_CONFIGURATION_CODE_SIGNING_METADATA)) {
                                            obj4 = map.get(UPDATES_CONFIGURATION_CODE_SIGNING_METADATA);
                                            if (!(obj4 instanceof Map)) {
                                                Intrinsics.checkNotNull(obj4);
                                                throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj4.getClass().getSimpleName() + " provided for key codeSigningMetadata");
                                            }
                                        } else {
                                            obj4 = null;
                                        }
                                        mapFromJSONString = (Map) obj4;
                                        if (mapFromJSONString != null) {
                                            checkAutomaticallyConfiguration2 = checkAutomaticallyConfiguration4;
                                            if (map != null) {
                                                if (map.containsKey(UPDATES_CONFIGURATION_CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN)) {
                                                    obj3 = map.get(UPDATES_CONFIGURATION_CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN);
                                                    if (!(obj3 instanceof Boolean)) {
                                                        Intrinsics.checkNotNull(obj3);
                                                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj3.getClass().getSimpleName() + " provided for key codeSigningIncludeManifestResponseCertificateChain");
                                                    }
                                                } else {
                                                    obj3 = null;
                                                }
                                                Boolean bool4 = (Boolean) obj3;
                                                if (bool4 != null) {
                                                    booleanValue = bool4.booleanValue();
                                                    map3 = mapFromJSONString;
                                                    if (map != null) {
                                                        if (map.containsKey(UPDATES_CONFIGURATION_CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS)) {
                                                            obj2 = map.get(UPDATES_CONFIGURATION_CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS);
                                                            if (!(obj2 instanceof Boolean)) {
                                                                Intrinsics.checkNotNull(obj2);
                                                                throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj2.getClass().getSimpleName() + " provided for key codeSigningAllowUnsignedManifests");
                                                            }
                                                        } else {
                                                            obj2 = null;
                                                        }
                                                        Boolean bool5 = (Boolean) obj2;
                                                        if (bool5 != null) {
                                                            booleanValue2 = bool5.booleanValue();
                                                            z2 = booleanValue;
                                                            if (map != null) {
                                                                if (map.containsKey(UPDATES_CONFIGURATION_ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE)) {
                                                                    obj = map.get(UPDATES_CONFIGURATION_ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE);
                                                                    if (!(obj instanceof Boolean)) {
                                                                        Intrinsics.checkNotNull(obj);
                                                                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key enableExpoUpdatesProtocolCompatibilityMode");
                                                                    }
                                                                } else {
                                                                    obj = null;
                                                                }
                                                                Boolean bool6 = (Boolean) obj;
                                                                if (bool6 != null) {
                                                                    booleanValue3 = bool6.booleanValue();
                                                                }
                                                            }
                                                            if (context != null) {
                                                                Bundle bundle4 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                                                                if (bundle4.containsKey("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE")) {
                                                                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Boolean.class);
                                                                    if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(String.class))) {
                                                                        valueOf = (Boolean) bundle4.getString("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                                                                    } else {
                                                                        valueOf = Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? Boolean.valueOf(bundle4.getBoolean("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE")) : Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle4.getInt("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE")) : (Boolean) bundle4.get("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                                                                    }
                                                                    bool3 = valueOf;
                                                                    booleanValue3 = bool3 == null ? bool3.booleanValue() : false;
                                                                }
                                                            }
                                                            bool3 = null;
                                                            if (bool3 == null) {
                                                            }
                                                        }
                                                    }
                                                    if (context != null) {
                                                        Bundle bundle5 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                                                        if (bundle5.containsKey("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS")) {
                                                            KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Boolean.class);
                                                            z2 = booleanValue;
                                                            if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(String.class))) {
                                                                bool2 = (Boolean) bundle5.getString("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                                                            } else {
                                                                bool2 = Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? Boolean.valueOf(bundle5.getBoolean("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS")) : Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle5.getInt("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS")) : (Boolean) bundle5.get("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                                                            }
                                                            booleanValue2 = bool2 == null ? bool2.booleanValue() : false;
                                                            if (map != null) {
                                                            }
                                                            if (context != null) {
                                                            }
                                                            bool3 = null;
                                                            if (bool3 == null) {
                                                            }
                                                        }
                                                    }
                                                    z2 = booleanValue;
                                                    bool2 = null;
                                                    if (bool2 == null) {
                                                    }
                                                    if (map != null) {
                                                    }
                                                    if (context != null) {
                                                    }
                                                    bool3 = null;
                                                    if (bool3 == null) {
                                                    }
                                                }
                                            }
                                            if (context != null) {
                                                Bundle bundle6 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                                                if (bundle6.containsKey("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN")) {
                                                    KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Boolean.class);
                                                    map3 = mapFromJSONString;
                                                    if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(String.class))) {
                                                        bool = (Boolean) bundle6.getString("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN");
                                                    } else {
                                                        bool = Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? Boolean.valueOf(bundle6.getBoolean("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN")) : Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle6.getInt("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN")) : (Boolean) bundle6.get("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN");
                                                    }
                                                    booleanValue = bool == null ? bool.booleanValue() : false;
                                                    if (map != null) {
                                                    }
                                                    if (context != null) {
                                                    }
                                                    z2 = booleanValue;
                                                    bool2 = null;
                                                    if (bool2 == null) {
                                                    }
                                                    if (map != null) {
                                                    }
                                                    if (context != null) {
                                                    }
                                                    bool3 = null;
                                                    if (bool3 == null) {
                                                    }
                                                }
                                            }
                                            map3 = mapFromJSONString;
                                            bool = null;
                                            if (bool == null) {
                                            }
                                            if (map != null) {
                                            }
                                            if (context != null) {
                                            }
                                            z2 = booleanValue;
                                            bool2 = null;
                                            if (bool2 == null) {
                                            }
                                            if (map != null) {
                                            }
                                            if (context != null) {
                                            }
                                            bool3 = null;
                                            if (bool3 == null) {
                                            }
                                        }
                                    }
                                    if (context == null) {
                                        Bundle bundle7 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                                        if (bundle7.containsKey("expo.modules.updates.CODE_SIGNING_METADATA")) {
                                            KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(String.class);
                                            checkAutomaticallyConfiguration2 = checkAutomaticallyConfiguration4;
                                            if (Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(String.class))) {
                                                str5 = bundle7.getString("expo.modules.updates.CODE_SIGNING_METADATA");
                                            } else {
                                                str5 = Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? (String) Boolean.valueOf(bundle7.getBoolean("expo.modules.updates.CODE_SIGNING_METADATA")) : Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (String) Integer.valueOf(bundle7.getInt("expo.modules.updates.CODE_SIGNING_METADATA")) : (String) bundle7.get("expo.modules.updates.CODE_SIGNING_METADATA");
                                            }
                                        } else {
                                            checkAutomaticallyConfiguration2 = checkAutomaticallyConfiguration4;
                                            str5 = null;
                                        }
                                    } else {
                                        checkAutomaticallyConfiguration2 = checkAutomaticallyConfiguration4;
                                    }
                                    str5 = "{}";
                                    mapFromJSONString = UpdatesUtils.INSTANCE.getMapFromJSONString(str5);
                                    if (map != null) {
                                    }
                                    if (context != null) {
                                    }
                                    map3 = mapFromJSONString;
                                    bool = null;
                                    if (bool == null) {
                                    }
                                    if (map != null) {
                                    }
                                    if (context != null) {
                                    }
                                    z2 = booleanValue;
                                    bool2 = null;
                                    if (bool2 == null) {
                                    }
                                    if (map != null) {
                                    }
                                    if (context != null) {
                                    }
                                    bool3 = null;
                                    if (bool3 == null) {
                                    }
                                }
                            }
                            if (context == null) {
                                map2 = requestHeaders;
                                Bundle bundle8 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                                if (bundle8.containsKey("expo.modules.updates.CODE_SIGNING_CERTIFICATE")) {
                                    KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(String.class);
                                    uri = originalEmbeddedUpdateUrl;
                                    if (Intrinsics.areEqual(orCreateKotlinClass8, Reflection.getOrCreateKotlinClass(String.class))) {
                                        str4 = bundle8.getString("expo.modules.updates.CODE_SIGNING_CERTIFICATE");
                                    } else {
                                        str4 = Intrinsics.areEqual(orCreateKotlinClass8, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? (String) Boolean.valueOf(bundle8.getBoolean("expo.modules.updates.CODE_SIGNING_CERTIFICATE")) : Intrinsics.areEqual(orCreateKotlinClass8, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (String) Integer.valueOf(bundle8.getInt("expo.modules.updates.CODE_SIGNING_CERTIFICATE")) : (String) bundle8.get("expo.modules.updates.CODE_SIGNING_CERTIFICATE");
                                    }
                                    str3 = str4;
                                    if (map != null) {
                                    }
                                    if (context == null) {
                                    }
                                    str5 = "{}";
                                    mapFromJSONString = UpdatesUtils.INSTANCE.getMapFromJSONString(str5);
                                    if (map != null) {
                                    }
                                    if (context != null) {
                                    }
                                    map3 = mapFromJSONString;
                                    bool = null;
                                    if (bool == null) {
                                    }
                                    if (map != null) {
                                    }
                                    if (context != null) {
                                    }
                                    z2 = booleanValue;
                                    bool2 = null;
                                    if (bool2 == null) {
                                    }
                                    if (map != null) {
                                    }
                                    if (context != null) {
                                    }
                                    bool3 = null;
                                    if (bool3 == null) {
                                    }
                                }
                            } else {
                                map2 = requestHeaders;
                            }
                            uri = originalEmbeddedUpdateUrl;
                            str3 = null;
                            if (map != null) {
                            }
                            if (context == null) {
                            }
                            str5 = "{}";
                            mapFromJSONString = UpdatesUtils.INSTANCE.getMapFromJSONString(str5);
                            if (map != null) {
                            }
                            if (context != null) {
                            }
                            map3 = mapFromJSONString;
                            bool = null;
                            if (bool == null) {
                            }
                            if (map != null) {
                            }
                            if (context != null) {
                            }
                            z2 = booleanValue;
                            bool2 = null;
                            if (bool2 == null) {
                            }
                            if (map != null) {
                            }
                            if (context != null) {
                            }
                            bool3 = null;
                            if (bool3 == null) {
                            }
                        }
                        i = num.intValue();
                        if (map != null) {
                        }
                        if (context != null) {
                        }
                        str2 = "ALWAYS";
                        CheckAutomaticallyConfiguration checkAutomaticallyConfiguration32 = CheckAutomaticallyConfiguration.valueOf(str2);
                        checkAutomaticallyConfiguration = checkAutomaticallyConfiguration32;
                        CheckAutomaticallyConfiguration checkAutomaticallyConfiguration42 = checkAutomaticallyConfiguration;
                        Companion companion22 = INSTANCE;
                        boolean hasEmbeddedUpdate2 = companion22.getHasEmbeddedUpdate(context, map, z, updatesConfigurationOverride);
                        boolean originalHasEmbeddedUpdate2 = companion22.getOriginalHasEmbeddedUpdate(context, map);
                        Map requestHeaders2 = companion22.getRequestHeaders(context, map, z, updatesConfigurationOverride);
                        Map originalEmbeddedRequestHeaders2 = companion22.getOriginalEmbeddedRequestHeaders(context, map);
                        if (map != null) {
                        }
                        if (context == null) {
                        }
                        uri = originalEmbeddedUpdateUrl;
                        str3 = null;
                        if (map != null) {
                        }
                        if (context == null) {
                        }
                        str5 = "{}";
                        mapFromJSONString = UpdatesUtils.INSTANCE.getMapFromJSONString(str5);
                        if (map != null) {
                        }
                        if (context != null) {
                        }
                        map3 = mapFromJSONString;
                        bool = null;
                        if (bool == null) {
                        }
                        if (map != null) {
                        }
                        if (context != null) {
                        }
                        z2 = booleanValue;
                        bool2 = null;
                        if (bool2 == null) {
                        }
                        if (map != null) {
                        }
                        if (context != null) {
                        }
                        bool3 = null;
                        if (bool3 == null) {
                        }
                    }
                }
                num = null;
                if (num == null) {
                }
                i = num.intValue();
                if (map != null) {
                }
                if (context != null) {
                }
                str2 = "ALWAYS";
                CheckAutomaticallyConfiguration checkAutomaticallyConfiguration322 = CheckAutomaticallyConfiguration.valueOf(str2);
                checkAutomaticallyConfiguration = checkAutomaticallyConfiguration322;
                CheckAutomaticallyConfiguration checkAutomaticallyConfiguration422 = checkAutomaticallyConfiguration;
                Companion companion222 = INSTANCE;
                boolean hasEmbeddedUpdate22 = companion222.getHasEmbeddedUpdate(context, map, z, updatesConfigurationOverride);
                boolean originalHasEmbeddedUpdate22 = companion222.getOriginalHasEmbeddedUpdate(context, map);
                Map requestHeaders22 = companion222.getRequestHeaders(context, map, z, updatesConfigurationOverride);
                Map originalEmbeddedRequestHeaders22 = companion222.getOriginalEmbeddedRequestHeaders(context, map);
                if (map != null) {
                }
                if (context == null) {
                }
                uri = originalEmbeddedUpdateUrl;
                str3 = null;
                if (map != null) {
                }
                if (context == null) {
                }
                str5 = "{}";
                mapFromJSONString = UpdatesUtils.INSTANCE.getMapFromJSONString(str5);
                if (map != null) {
                }
                if (context != null) {
                }
                map3 = mapFromJSONString;
                bool = null;
                if (bool == null) {
                }
                if (map != null) {
                }
                if (context != null) {
                }
                z2 = booleanValue;
                bool2 = null;
                if (bool2 == null) {
                }
                if (map != null) {
                }
                if (context != null) {
                }
                bool3 = null;
                if (bool3 == null) {
                }
            }
        }
        str = null;
        Companion companion3 = INSTANCE;
        Uri updateUrl3 = companion3.getUpdateUrl(context, map, z, updatesConfigurationOverride);
        Intrinsics.checkNotNull(updateUrl3);
        maybeGetDefaultScopeKey = UpdatesConfigurationKt.maybeGetDefaultScopeKey(str, updateUrl3);
        Uri updateUrl22 = companion3.getUpdateUrl(context, map, z, updatesConfigurationOverride);
        Intrinsics.checkNotNull(updateUrl22);
        Uri originalEmbeddedUpdateUrl2 = companion3.getOriginalEmbeddedUpdateUrl(context, map);
        Intrinsics.checkNotNull(originalEmbeddedUpdateUrl2);
        String runtimeVersion2 = companion3.getRuntimeVersion(context, map);
        if (map != null) {
        }
        if (context != null) {
        }
        num = null;
        if (num == null) {
        }
        i = num.intValue();
        if (map != null) {
        }
        if (context != null) {
        }
        str2 = "ALWAYS";
        CheckAutomaticallyConfiguration checkAutomaticallyConfiguration3222 = CheckAutomaticallyConfiguration.valueOf(str2);
        checkAutomaticallyConfiguration = checkAutomaticallyConfiguration3222;
        CheckAutomaticallyConfiguration checkAutomaticallyConfiguration4222 = checkAutomaticallyConfiguration;
        Companion companion2222 = INSTANCE;
        boolean hasEmbeddedUpdate222 = companion2222.getHasEmbeddedUpdate(context, map, z, updatesConfigurationOverride);
        boolean originalHasEmbeddedUpdate222 = companion2222.getOriginalHasEmbeddedUpdate(context, map);
        Map requestHeaders222 = companion2222.getRequestHeaders(context, map, z, updatesConfigurationOverride);
        Map originalEmbeddedRequestHeaders222 = companion2222.getOriginalEmbeddedRequestHeaders(context, map);
        if (map != null) {
        }
        if (context == null) {
        }
        uri = originalEmbeddedUpdateUrl2;
        str3 = null;
        if (map != null) {
        }
        if (context == null) {
        }
        str5 = "{}";
        mapFromJSONString = UpdatesUtils.INSTANCE.getMapFromJSONString(str5);
        if (map != null) {
        }
        if (context != null) {
        }
        map3 = mapFromJSONString;
        bool = null;
        if (bool == null) {
        }
        if (map != null) {
        }
        if (context != null) {
        }
        z2 = booleanValue;
        bool2 = null;
        if (bool2 == null) {
        }
        if (map != null) {
        }
        if (context != null) {
        }
        bool3 = null;
        if (bool3 == null) {
        }
    }

    public final CodeSigningConfiguration getCodeSigningConfiguration() {
        return (CodeSigningConfiguration) this.codeSigningConfiguration.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CodeSigningConfiguration codeSigningConfiguration_delegate$lambda$5(UpdatesConfiguration updatesConfiguration) {
        String str = updatesConfiguration.codeSigningCertificate;
        if (str != null) {
            return new CodeSigningConfiguration(str, updatesConfiguration.codeSigningMetadata, updatesConfiguration.codeSigningIncludeManifestResponseCertificateChain, updatesConfiguration.codeSigningAllowUnsignedManifests);
        }
        return null;
    }

    public final String getRuntimeVersion() {
        String str = this.runtimeVersionRaw;
        if (str != null && str.length() != 0) {
            return this.runtimeVersionRaw;
        }
        throw new Exception("No runtime version provided in configuration");
    }

    /* compiled from: UpdatesConfiguration.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001eH\u0002J:\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J(\u0010#\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001eH\u0002J<\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J*\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001eH\u0002JF\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J7\u0010(\u001a\u00020\u001a2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001e2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001eH\u0000¢\u0006\u0002\b+J>\u0010(\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001eH\u0002J4\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001eH\u0002J(\u0010-\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001eH\u0002J*\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001eH\u0002J&\u0010/\u001a\u0002002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001eJ \u00101\u001a\u0002022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00103\u001a\u0002022\b\u0010!\u001a\u0004\u0018\u00010\"R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lexpo/modules/updates/UpdatesConfiguration$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "UPDATES_CONFIGURATION_ENABLED_KEY", "UPDATES_CONFIGURATION_SCOPE_KEY_KEY", "UPDATES_CONFIGURATION_UPDATE_URL_KEY", "UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY", "UPDATES_CONFIGURATION_RUNTIME_VERSION_KEY", "UPDATES_CONFIGURATION_CHECK_ON_LAUNCH_KEY", "UPDATES_CONFIGURATION_LAUNCH_WAIT_MS_KEY", "UPDATES_CONFIGURATION_HAS_EMBEDDED_UPDATE_KEY", "UPDATES_CONFIGURATION_ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE", "UPDATES_CONFIGURATION_DISABLE_ANTI_BRICKING_MEASURES", "UPDATES_CONFIGURATION_CODE_SIGNING_CERTIFICATE", "UPDATES_CONFIGURATION_CODE_SIGNING_METADATA", "UPDATES_CONFIGURATION_CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN", "UPDATES_CONFIGURATION_CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS", "UPDATES_CONFIGURATION_LAUNCH_WAIT_MS_DEFAULT_VALUE", "", "UPDATES_CONFIGURATION_RUNTIME_VERSION_READ_FINGERPRINT_FILE_SENTINEL", "FINGERPRINT_FILE_NAME", "getDisableAntiBrickingMeasures", "", "context", "Landroid/content/Context;", "overrideMap", "", "getHasEmbeddedUpdate", UpdatesConfiguration.UPDATES_CONFIGURATION_DISABLE_ANTI_BRICKING_MEASURES, "configOverride", "Lexpo/modules/updates/UpdatesConfigurationOverride;", "getOriginalHasEmbeddedUpdate", "getUpdateUrl", "Landroid/net/Uri;", "getOriginalEmbeddedUpdateUrl", "getRequestHeaders", "isValidRequestHeadersOverride", "originalEmbeddedRequestHeaders", "requestHeadersOverride", "isValidRequestHeadersOverride$expo_updates_release", "getOriginalEmbeddedRequestHeaders", "getIsEnabled", "getRuntimeVersion", "getUpdatesConfigurationValidationResult", "Lexpo/modules/updates/UpdatesConfigurationValidationResult;", "create", "Lexpo/modules/updates/UpdatesConfiguration;", "config", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getHasEmbeddedUpdate(Context context, Map<String, ? extends Object> overrideMap, boolean disableAntiBrickingMeasures, UpdatesConfigurationOverride configOverride) {
            if (!disableAntiBrickingMeasures || configOverride == null) {
                return getOriginalHasEmbeddedUpdate(context, overrideMap);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Uri getUpdateUrl(Context context, Map<String, ? extends Object> overrideMap, boolean disableAntiBrickingMeasures, UpdatesConfigurationOverride configOverride) {
            if (disableAntiBrickingMeasures && configOverride != null) {
                return configOverride.getUpdateUrl();
            }
            return getOriginalEmbeddedUpdateUrl(context, overrideMap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, String> getRequestHeaders(Context context, Map<String, ? extends Object> overrideMap, boolean disableAntiBrickingMeasures, UpdatesConfigurationOverride configOverride) {
            Map<String, String> requestHeaders;
            if (configOverride != null && (requestHeaders = configOverride.getRequestHeaders()) != null) {
                if (UpdatesConfiguration.INSTANCE.isValidRequestHeadersOverride(context, overrideMap, requestHeaders) || disableAntiBrickingMeasures) {
                    return requestHeaders;
                }
                Log.w(UpdatesConfiguration.TAG, "Invalid update requestHeaders override, falling back to embedded requestHeaders - override requestHeaders: " + requestHeaders);
            }
            return getOriginalEmbeddedRequestHeaders(context, overrideMap);
        }

        public final boolean isValidRequestHeadersOverride$expo_updates_release(Map<String, String> originalEmbeddedRequestHeaders, Map<String, String> requestHeadersOverride) {
            Intrinsics.checkNotNullParameter(originalEmbeddedRequestHeaders, "originalEmbeddedRequestHeaders");
            if (requestHeadersOverride == null) {
                return true;
            }
            Set<String> keySet = originalEmbeddedRequestHeaders.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                arrayList.add(StringsKt.trim((CharSequence) lowerCase).toString());
            }
            Set set = CollectionsKt.toSet(arrayList);
            Set of = SetsKt.setOf("host");
            Set<String> keySet2 = requestHeadersOverride.keySet();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet2, 10));
            Iterator<T> it2 = keySet2.iterator();
            while (it2.hasNext()) {
                String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                arrayList2.add(StringsKt.trim((CharSequence) lowerCase2).toString());
            }
            ArrayList arrayList3 = arrayList2;
            boolean z = arrayList3 instanceof Collection;
            if (!z || !arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (of.contains((String) it3.next())) {
                        return false;
                    }
                }
            }
            if (!z || !arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    if (!set.contains((String) it4.next())) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final boolean isValidRequestHeadersOverride(Context context, Map<String, ? extends Object> overrideMap, Map<String, String> requestHeadersOverride) {
            return isValidRequestHeadersOverride$expo_updates_release(getOriginalEmbeddedRequestHeaders(context, overrideMap), requestHeadersOverride);
        }

        public final UpdatesConfigurationValidationResult getUpdatesConfigurationValidationResult(Context context, Map<String, ? extends Object> overrideMap) {
            if (!getIsEnabled(context, overrideMap)) {
                return UpdatesConfigurationValidationResult.INVALID_NOT_ENABLED;
            }
            if (getUpdateUrl(context, overrideMap, getDisableAntiBrickingMeasures(context, overrideMap), context != null ? UpdatesConfigurationOverride.INSTANCE.load$expo_updates_release(context) : null) == null) {
                return UpdatesConfigurationValidationResult.INVALID_MISSING_URL;
            }
            String runtimeVersion = getRuntimeVersion(context, overrideMap);
            if (runtimeVersion == null || runtimeVersion.length() == 0) {
                return UpdatesConfigurationValidationResult.INVALID_MISSING_RUNTIME_VERSION;
            }
            return UpdatesConfigurationValidationResult.VALID;
        }

        public final UpdatesConfiguration create(Context context, UpdatesConfiguration config, UpdatesConfigurationOverride configOverride) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Map<String, ? extends Object> map = config.cachedOverrideMap;
            return new UpdatesConfiguration(context, map, getDisableAntiBrickingMeasures(context, map), configOverride);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getDisableAntiBrickingMeasures(Context context, Map<String, ? extends Object> overrideMap) {
            Boolean valueOf;
            Object obj;
            Boolean bool = null;
            if (overrideMap != null) {
                if (overrideMap.containsKey(UpdatesConfiguration.UPDATES_CONFIGURATION_DISABLE_ANTI_BRICKING_MEASURES)) {
                    obj = overrideMap.get(UpdatesConfiguration.UPDATES_CONFIGURATION_DISABLE_ANTI_BRICKING_MEASURES);
                    if (!(obj instanceof Boolean)) {
                        Intrinsics.checkNotNull(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key disableAntiBrickingMeasures");
                    }
                } else {
                    obj = null;
                }
                Boolean bool2 = (Boolean) obj;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES")) {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                        valueOf = (Boolean) bundle.getString("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES");
                    } else {
                        valueOf = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? Boolean.valueOf(bundle.getBoolean("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES")) : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle.getInt("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES")) : (Boolean) bundle.get("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES");
                    }
                    bool = valueOf;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getOriginalHasEmbeddedUpdate(Context context, Map<String, ? extends Object> overrideMap) {
            Boolean valueOf;
            Object obj;
            Boolean bool = null;
            if (overrideMap != null) {
                if (overrideMap.containsKey(UpdatesConfiguration.UPDATES_CONFIGURATION_HAS_EMBEDDED_UPDATE_KEY)) {
                    obj = overrideMap.get(UpdatesConfiguration.UPDATES_CONFIGURATION_HAS_EMBEDDED_UPDATE_KEY);
                    if (!(obj instanceof Boolean)) {
                        Intrinsics.checkNotNull(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key hasEmbeddedUpdate");
                    }
                } else {
                    obj = null;
                }
                Boolean bool2 = (Boolean) obj;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.HAS_EMBEDDED_UPDATE")) {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                        valueOf = (Boolean) bundle.getString("expo.modules.updates.HAS_EMBEDDED_UPDATE");
                    } else {
                        valueOf = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? Boolean.valueOf(bundle.getBoolean("expo.modules.updates.HAS_EMBEDDED_UPDATE")) : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle.getInt("expo.modules.updates.HAS_EMBEDDED_UPDATE")) : (Boolean) bundle.get("expo.modules.updates.HAS_EMBEDDED_UPDATE");
                    }
                    bool = valueOf;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Uri getOriginalEmbeddedUpdateUrl(Context context, Map<String, ? extends Object> overrideMap) {
            String str;
            Object obj;
            if (overrideMap != null) {
                if (overrideMap.containsKey(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY)) {
                    obj = overrideMap.get(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY);
                    if (!(obj instanceof Uri)) {
                        Intrinsics.checkNotNull(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key updateUrl");
                    }
                } else {
                    obj = null;
                }
                Uri uri = (Uri) obj;
                if (uri != null) {
                    return uri;
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.EXPO_UPDATE_URL")) {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                        str = bundle.getString("expo.modules.updates.EXPO_UPDATE_URL");
                    } else {
                        str = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? (String) Boolean.valueOf(bundle.getBoolean("expo.modules.updates.EXPO_UPDATE_URL")) : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (String) Integer.valueOf(bundle.getInt("expo.modules.updates.EXPO_UPDATE_URL")) : (String) bundle.get("expo.modules.updates.EXPO_UPDATE_URL");
                    }
                } else {
                    str = null;
                }
                if (str != null) {
                    return Uri.parse(str);
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
        
            if (r0 == null) goto L31;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Map<String, String> getOriginalEmbeddedRequestHeaders(Context context, Map<String, ? extends Object> overrideMap) {
            String str;
            Object obj;
            String str2 = null;
            if (overrideMap != null) {
                if (overrideMap.containsKey(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY)) {
                    obj = overrideMap.get(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY);
                    if (!(obj instanceof Map)) {
                        Intrinsics.checkNotNull(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key requestHeaders");
                    }
                } else {
                    obj = null;
                }
                Map<String, String> map = (Map) obj;
                if (map != null) {
                    return map;
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY")) {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                        str = bundle.getString("expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY");
                    } else {
                        str = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? (String) Boolean.valueOf(bundle.getBoolean("expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY")) : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (String) Integer.valueOf(bundle.getInt("expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY")) : (String) bundle.get("expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY");
                    }
                    str2 = str;
                }
            }
            str2 = "{}";
            return UpdatesUtils.INSTANCE.getMapFromJSONString(str2);
        }

        private final boolean getIsEnabled(Context context, Map<String, ? extends Object> overrideMap) {
            Boolean valueOf;
            Object obj;
            Boolean bool = null;
            if (overrideMap != null) {
                if (overrideMap.containsKey("enabled")) {
                    obj = overrideMap.get("enabled");
                    if (!(obj instanceof Boolean)) {
                        Intrinsics.checkNotNull(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key enabled");
                    }
                } else {
                    obj = null;
                }
                Boolean bool2 = (Boolean) obj;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.ENABLED")) {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                        valueOf = (Boolean) bundle.getString("expo.modules.updates.ENABLED");
                    } else {
                        valueOf = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? Boolean.valueOf(bundle.getBoolean("expo.modules.updates.ENABLED")) : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle.getInt("expo.modules.updates.ENABLED")) : (Boolean) bundle.get("expo.modules.updates.ENABLED");
                    }
                    bool = valueOf;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r6 == null) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String getRuntimeVersion(Context context, Map<String, ? extends Object> overrideMap) {
            String str;
            Integer valueOf;
            String obj;
            Object obj2;
            if (overrideMap != null) {
                if (overrideMap.containsKey(UpdatesConfiguration.UPDATES_CONFIGURATION_RUNTIME_VERSION_KEY)) {
                    obj2 = overrideMap.get(UpdatesConfiguration.UPDATES_CONFIGURATION_RUNTIME_VERSION_KEY);
                    if (!(obj2 instanceof String)) {
                        Intrinsics.checkNotNull(obj2);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj2.getClass().getSimpleName() + " provided for key runtimeVersion");
                    }
                } else {
                    obj2 = null;
                }
                str = (String) obj2;
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.EXPO_RUNTIME_VERSION")) {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                        valueOf = bundle.getString("expo.modules.updates.EXPO_RUNTIME_VERSION");
                    } else {
                        valueOf = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? Boolean.valueOf(bundle.getBoolean("expo.modules.updates.EXPO_RUNTIME_VERSION")) : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? Integer.valueOf(bundle.getInt("expo.modules.updates.EXPO_RUNTIME_VERSION")) : bundle.get("expo.modules.updates.EXPO_RUNTIME_VERSION");
                    }
                } else {
                    valueOf = null;
                }
                if (valueOf != null && (obj = valueOf.toString()) != null) {
                    str = new Regex("^string:").replaceFirst(obj, "");
                    if (context != null || !Intrinsics.areEqual(str, UpdatesConfiguration.UPDATES_CONFIGURATION_RUNTIME_VERSION_READ_FINGERPRINT_FILE_SENTINEL)) {
                        return str;
                    }
                    BufferedReader open = context.getAssets().open(UpdatesConfiguration.FINGERPRINT_FILE_NAME);
                    try {
                        InputStream inputStream = open;
                        Intrinsics.checkNotNull(inputStream);
                        Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                        open = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                        try {
                            String readText = TextStreamsKt.readText(open);
                            CloseableKt.closeFinally(open, null);
                            CloseableKt.closeFinally(open, null);
                            return readText;
                        } finally {
                        }
                    } finally {
                    }
                }
            }
            str = null;
            if (context != null) {
            }
            return str;
        }
    }
}
