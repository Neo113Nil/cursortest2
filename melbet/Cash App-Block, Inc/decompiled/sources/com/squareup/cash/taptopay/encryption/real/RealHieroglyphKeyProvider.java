package com.squareup.cash.taptopay.encryption.real;

import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.WrappedKeyEntry;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.api.ApiResult;
import app.cash.local.backend.real.RealCartBuilderManager$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import app.cash.trifle.protos.api.alpha.SignedData;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.squareup.cash.biometrics.AndroidSecureStore;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.biometrics.AndroidSecureValue;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$HieroglyphKeyCompatibilityReport_2;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealKeyStoreProvider$getKey$2;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.mri.android.MRIUseCase;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.cash.taptopay.encryption.api.HieroglyphKeyCompatibilityReport;
import com.squareup.cash.taptopay.encryption.api.HieroglyphKeyError;
import com.squareup.cash.taptopay.encryption.api.HieroglyphKeyProvider$KeyType;
import com.squareup.cash.taptopay.encryption.api.HieroglyphKeyResult;
import com.squareup.cash.taptopay.encryption.real.utils.RealKeyProvisionCompatibilityChecker;
import com.squareup.cash.util.clock.AccurateClock$AccurateTimestamp;
import com.squareup.cash.util.clock.AndroidAccurateClock;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CashBusinessPaymentsClientService;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.hieroglyph.AndroidKeystoreCompatibilityReport;
import com.squareup.protos.hieroglyph.ClientPublicKey;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.hieroglyph.PublicKeyConfig;
import com.squareup.protos.hieroglyph.WrappedKey;
import com.squareup.protos.hieroglyph.service.ProvisionKeysRequest;
import com.squareup.protos.hieroglyph.service.ProvisionKeysResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.time.Instant;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealHieroglyphKeyProvider {
    public final AndroidAccurateClock accurateClock;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final AndroidSecureStore importKeyExpirationSecureStore;
    public final RealKeyProvisionCompatibilityChecker keyCompatibilityChecker;
    public final RealKeyStoreProvider keyStore;
    public final RealMRIFactory mriFactory;
    public final CashBusinessPaymentsClientService service;
    public final SessionManager sessionManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyScope.values().length];
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KeyScope.Companion companion = KeyScope.Companion;
                iArr[8] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HieroglyphKeyProvider$KeyType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                HieroglyphKeyProvider$KeyType hieroglyphKeyProvider$KeyType = HieroglyphKeyProvider$KeyType.TTP_PAN_KEY;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public RealHieroglyphKeyProvider(AndroidAccurateClock androidAccurateClock, ErrorReporter errorReporter, FeatureFlagManager featureFlagManager, AndroidSecureStore androidSecureStore, RealKeyProvisionCompatibilityChecker realKeyProvisionCompatibilityChecker, RealKeyStoreProvider realKeyStoreProvider, CashBusinessPaymentsClientService cashBusinessPaymentsClientService, SessionManager sessionManager, RealMRIFactory realMRIFactory, CardProduct.Companion companion, Op.Companion companion2) {
        this.accurateClock = androidAccurateClock;
        this.errorReporter = errorReporter;
        this.featureFlagManager = featureFlagManager;
        this.importKeyExpirationSecureStore = androidSecureStore;
        this.keyCompatibilityChecker = realKeyProvisionCompatibilityChecker;
        this.keyStore = realKeyStoreProvider;
        this.service = cashBusinessPaymentsClientService;
        this.sessionManager = sessionManager;
        this.mriFactory = realMRIFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object encodeExpirationTimestamp(long j, ContinuationImpl continuationImpl) {
        RealHieroglyphKeyProvider$encodeExpirationTimestamp$1 realHieroglyphKeyProvider$encodeExpirationTimestamp$1;
        int i;
        ByteString.Companion companion;
        if (continuationImpl instanceof RealHieroglyphKeyProvider$encodeExpirationTimestamp$1) {
            realHieroglyphKeyProvider$encodeExpirationTimestamp$1 = (RealHieroglyphKeyProvider$encodeExpirationTimestamp$1) continuationImpl;
            int i2 = realHieroglyphKeyProvider$encodeExpirationTimestamp$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realHieroglyphKeyProvider$encodeExpirationTimestamp$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realHieroglyphKeyProvider$encodeExpirationTimestamp$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realHieroglyphKeyProvider$encodeExpirationTimestamp$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ByteString.Companion companion2 = ByteString.Companion;
                    realHieroglyphKeyProvider$encodeExpirationTimestamp$1.L$0 = companion2;
                    realHieroglyphKeyProvider$encodeExpirationTimestamp$1.J$0 = j;
                    realHieroglyphKeyProvider$encodeExpirationTimestamp$1.label = 1;
                    Object currentInstant = getCurrentInstant(realHieroglyphKeyProvider$encodeExpirationTimestamp$1);
                    if (currentInstant == obj2) {
                        return obj2;
                    }
                    obj = currentInstant;
                    companion = companion2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = realHieroglyphKeyProvider$encodeExpirationTimestamp$1.J$0;
                    companion = realHieroglyphKeyProvider$encodeExpirationTimestamp$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                String instant = ((Instant) obj).plusMillis(j).toString();
                instant.getClass();
                companion.getClass();
                return ByteString.Companion.encodeUtf8(instant);
            }
        }
        realHieroglyphKeyProvider$encodeExpirationTimestamp$1 = new RealHieroglyphKeyProvider$encodeExpirationTimestamp$1(this, continuationImpl);
        Object obj3 = realHieroglyphKeyProvider$encodeExpirationTimestamp$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realHieroglyphKeyProvider$encodeExpirationTimestamp$1.label;
        if (i != 0) {
        }
        String instant2 = ((Instant) obj3).plusMillis(j).toString();
        instant2.getClass();
        companion.getClass();
        return ByteString.Companion.encodeUtf8(instant2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCurrentInstant(ContinuationImpl continuationImpl) {
        RealHieroglyphKeyProvider$getCurrentInstant$1 realHieroglyphKeyProvider$getCurrentInstant$1;
        int i;
        AccurateClock$AccurateTimestamp accurateClock$AccurateTimestamp;
        if (continuationImpl instanceof RealHieroglyphKeyProvider$getCurrentInstant$1) {
            realHieroglyphKeyProvider$getCurrentInstant$1 = (RealHieroglyphKeyProvider$getCurrentInstant$1) continuationImpl;
            int i2 = realHieroglyphKeyProvider$getCurrentInstant$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realHieroglyphKeyProvider$getCurrentInstant$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realHieroglyphKeyProvider$getCurrentInstant$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realHieroglyphKeyProvider$getCurrentInstant$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realHieroglyphKeyProvider$getCurrentInstant$1.label = 1;
                    obj = this.accurateClock.m3789accurateTimestampOrNull_x8W85U(realHieroglyphKeyProvider$getCurrentInstant$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                accurateClock$AccurateTimestamp = (AccurateClock$AccurateTimestamp) obj;
                if (accurateClock$AccurateTimestamp == null) {
                    Instant ofEpochMilli = Instant.ofEpochMilli(accurateClock$AccurateTimestamp.millis);
                    ofEpochMilli.getClass();
                    return ofEpochMilli;
                }
                Instant ofEpochMilli2 = Instant.ofEpochMilli(System.currentTimeMillis());
                ofEpochMilli2.getClass();
                return ofEpochMilli2;
            }
        }
        realHieroglyphKeyProvider$getCurrentInstant$1 = new RealHieroglyphKeyProvider$getCurrentInstant$1(this, continuationImpl);
        Object obj2 = realHieroglyphKeyProvider$getCurrentInstant$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realHieroglyphKeyProvider$getCurrentInstant$1.label;
        if (i != 0) {
        }
        accurateClock$AccurateTimestamp = (AccurateClock$AccurateTimestamp) obj2;
        if (accurateClock$AccurateTimestamp == null) {
        }
    }

    public final String getKeyAliasFromType$real(HieroglyphKeyProvider$KeyType hieroglyphKeyProvider$KeyType) {
        hieroglyphKeyProvider$KeyType.getClass();
        String activeAccountToken = PlatformKt.activeAccountToken(this.sessionManager);
        int ordinal = hieroglyphKeyProvider$KeyType.ordinal();
        if (ordinal == 0) {
            return "TTP-pan-key-".concat(activeAccountToken);
        }
        if (ordinal == 1) {
            return "TTP-hmac-pan-key-".concat(activeAccountToken);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable getSecretKey(HieroglyphKeyProvider$KeyType hieroglyphKeyProvider$KeyType, ContinuationImpl continuationImpl) {
        RealHieroglyphKeyProvider$getSecretKey$1 realHieroglyphKeyProvider$getSecretKey$1;
        int i;
        try {
            if (continuationImpl instanceof RealHieroglyphKeyProvider$getSecretKey$1) {
                realHieroglyphKeyProvider$getSecretKey$1 = (RealHieroglyphKeyProvider$getSecretKey$1) continuationImpl;
                int i2 = realHieroglyphKeyProvider$getSecretKey$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realHieroglyphKeyProvider$getSecretKey$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realHieroglyphKeyProvider$getSecretKey$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realHieroglyphKeyProvider$getSecretKey$1.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        String keyAliasFromType$real = getKeyAliasFromType$real(hieroglyphKeyProvider$KeyType);
                        RealKeyStoreProvider realKeyStoreProvider = this.keyStore;
                        realHieroglyphKeyProvider$getSecretKey$1.label = 1;
                        obj = JobKt.withContext(realKeyStoreProvider.ioContext, new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, keyAliasFromType$real, continuation, 4), realHieroglyphKeyProvider$getSecretKey$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    obj.getClass();
                    return ((KeyStore.SecretKeyEntry) obj).getSecretKey();
                }
            }
            if (i != 0) {
            }
            obj.getClass();
            return ((KeyStore.SecretKeyEntry) obj).getSecretKey();
        } catch (Exception e) {
            ((SharedPreferences) this.importKeyExpirationSecureStore.storage.delegate).edit().clear().apply();
            if (!(e instanceof UnrecoverableEntryException) && !(e instanceof NoSuchAlgorithmException) && !(e instanceof KeyStoreException)) {
                throw e;
            }
            this.errorReporter.report(new HieroglyphKeyError(Recorder$$ExternalSyntheticOutline2.m("Common KeyStore Error :", e.getMessage())), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return null;
        }
        realHieroglyphKeyProvider$getSecretKey$1 = new RealHieroglyphKeyProvider$getSecretKey$1(this, continuationImpl);
        Object obj2 = realHieroglyphKeyProvider$getSecretKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realHieroglyphKeyProvider$getSecretKey$1.label;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r9.generateRSAKey(r10, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r9.deleteEntry("TTP-wrapping-key", r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getWrappingKeyPairCertificate(ContinuationImpl continuationImpl) {
        RealHieroglyphKeyProvider$getWrappingKeyPairCertificate$1 realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1;
        Object obj;
        int i;
        if (continuationImpl instanceof RealHieroglyphKeyProvider$getWrappingKeyPairCertificate$1) {
            realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1 = (RealHieroglyphKeyProvider$getWrappingKeyPairCertificate$1) continuationImpl;
            int i2 = realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.label;
                Continuation continuation = null;
                int i3 = 1;
                RealKeyStoreProvider realKeyStoreProvider = this.keyStore;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.label = 1;
                    obj = realKeyStoreProvider.containsAlias("TTP-wrapping-key", realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1);
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.label = 4;
                            Object withContext = JobKt.withContext(realKeyStoreProvider.ioContext, new InviteErrorPresenter$models$1$1(realKeyStoreProvider, continuation, i3), realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1);
                            return withContext == coroutineSingletons ? coroutineSingletons : withContext;
                        }
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    KeyGenParameterSpec build = CardProduct.Companion.build();
                    realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.label = 3;
                }
                if (((Boolean) obj).booleanValue()) {
                    realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.label = 2;
                }
                KeyGenParameterSpec build2 = CardProduct.Companion.build();
                realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.label = 3;
            }
        }
        realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1 = new RealHieroglyphKeyProvider$getWrappingKeyPairCertificate$1(this, continuationImpl);
        obj = realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.label;
        Continuation continuation2 = null;
        int i32 = 1;
        RealKeyStoreProvider realKeyStoreProvider2 = this.keyStore;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        KeyGenParameterSpec build22 = CardProduct.Companion.build();
        realHieroglyphKeyProvider$getWrappingKeyPairCertificate$1.label = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object haveValidKeys(ContinuationImpl continuationImpl) {
        RealHieroglyphKeyProvider$haveValidKeys$1 realHieroglyphKeyProvider$haveValidKeys$1;
        Object obj;
        int i;
        if (continuationImpl instanceof RealHieroglyphKeyProvider$haveValidKeys$1) {
            realHieroglyphKeyProvider$haveValidKeys$1 = (RealHieroglyphKeyProvider$haveValidKeys$1) continuationImpl;
            int i2 = realHieroglyphKeyProvider$haveValidKeys$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realHieroglyphKeyProvider$haveValidKeys$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realHieroglyphKeyProvider$haveValidKeys$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realHieroglyphKeyProvider$haveValidKeys$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String keyAliasFromType$real = getKeyAliasFromType$real(HieroglyphKeyProvider$KeyType.TTP_PAN_KEY);
                    realHieroglyphKeyProvider$haveValidKeys$1.label = 1;
                    obj = isValid(keyAliasFromType$real, realHieroglyphKeyProvider$haveValidKeys$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                String keyAliasFromType$real2 = getKeyAliasFromType$real(HieroglyphKeyProvider$KeyType.TTP_HMAC_PAN_KEY);
                realHieroglyphKeyProvider$haveValidKeys$1.label = 2;
                Object isValid = isValid(keyAliasFromType$real2, realHieroglyphKeyProvider$haveValidKeys$1);
                return isValid == obj2 ? obj2 : isValid;
            }
        }
        realHieroglyphKeyProvider$haveValidKeys$1 = new RealHieroglyphKeyProvider$haveValidKeys$1(this, continuationImpl);
        obj = realHieroglyphKeyProvider$haveValidKeys$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realHieroglyphKeyProvider$haveValidKeys$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.squareup.cash.biometrics.AndroidSecureStore, java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x018c -> B:15:0x0192). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object importEncryptedHieroglyphKey(ProvisionKeysResponse provisionKeysResponse, ContinuationImpl continuationImpl) {
        RealHieroglyphKeyProvider$importEncryptedHieroglyphKey$1 realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1;
        int i;
        KeyGenParameterSpec build;
        Iterator it;
        int i2;
        String str;
        String str2;
        String str3;
        Object obj;
        ?? r14;
        AndroidSecureStore androidSecureStore;
        KeyGenParameterSpec keyGenParameterSpec;
        long j;
        Iterator it2;
        int i3;
        int i4;
        KeyGenParameterSpec keyGenParameterSpec2;
        boolean z;
        KeyGenParameterSpec keyGenParameterSpec3;
        Iterator it3;
        int i5;
        int i6;
        String keyAliasFromType$real;
        String str4;
        if (continuationImpl instanceof RealHieroglyphKeyProvider$importEncryptedHieroglyphKey$1) {
            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1 = (RealHieroglyphKeyProvider$importEncryptedHieroglyphKey$1) continuationImpl;
            int i7 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.label;
            if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.label = i7 - PKIFailureInfo.systemUnavail;
                Object obj2 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (provisionKeysResponse.keys.isEmpty()) {
                        return new HieroglyphKeyResult.KeyImportFailure("Empty keys");
                    }
                    build = CardProduct.Companion.build();
                    it = provisionKeysResponse.keys.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    j = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.J$0;
                    i6 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$1;
                    int i8 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$0;
                    str2 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$8;
                    it3 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$3;
                    keyGenParameterSpec3 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$1;
                    try {
                        SafeTrace.throwOnFailure(obj2);
                        i5 = i8;
                        str = str2;
                        z = false;
                        AndroidSecureStore androidSecureStore2 = this.importKeyExpirationSecureStore;
                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$1 = keyGenParameterSpec3;
                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$3 = it3;
                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$8 = str;
                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$9 = str;
                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$10 = androidSecureStore2;
                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$0 = i5;
                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$1 = i6;
                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.J$0 = j;
                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.label = 2;
                        obj = encodeExpirationTimestamp(j, realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1);
                        if (obj == obj3) {
                        }
                    } catch (KeyStoreException unused) {
                        str = str2;
                        return new HieroglyphKeyResult.KeyImportFailure(str);
                    }
                } else {
                    if (i == 2) {
                        j = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.J$0;
                        int i9 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$1;
                        int i10 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$0;
                        AndroidSecureStore androidSecureStore3 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$10;
                        String str5 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$9;
                        String str6 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$8;
                        Iterator it4 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$3;
                        KeyGenParameterSpec keyGenParameterSpec4 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            i3 = i9;
                            i4 = i10;
                            str = str6;
                            obj = obj2;
                            str3 = str5;
                            androidSecureStore = androidSecureStore3;
                            keyGenParameterSpec = keyGenParameterSpec4;
                            it2 = it4;
                            r14 = 0;
                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$1 = keyGenParameterSpec;
                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$3 = it2;
                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$8 = str;
                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$9 = r14;
                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$10 = r14;
                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$0 = i4;
                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$1 = i3;
                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.J$0 = j;
                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.label = 3;
                            keyGenParameterSpec2 = keyGenParameterSpec;
                            obj2 = JobKt.withContext(androidSecureStore.ioDispatcher, new EngineInterceptor$intercept$2(androidSecureStore, (ByteString) obj, str3, r14, 14), realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1);
                            if (obj2 != obj3) {
                            }
                            return obj3;
                        } catch (KeyStoreException unused2) {
                            str = str6;
                            return new HieroglyphKeyResult.KeyImportFailure(str);
                        }
                    }
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i11 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$0;
                    str = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$8;
                    Iterator it5 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$3;
                    KeyGenParameterSpec keyGenParameterSpec5 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$1;
                    try {
                        SafeTrace.throwOnFailure(obj2);
                        str2 = str;
                        keyGenParameterSpec2 = keyGenParameterSpec5;
                        i2 = i11;
                        it = it5;
                        build = keyGenParameterSpec2;
                        if (it.hasNext()) {
                            try {
                                try {
                                    WrappedKey wrappedKey = (WrappedKey) it.next();
                                    Long l = wrappedKey.key_ttl_millis;
                                    KeyScope keyScope = wrappedKey.key_scope;
                                    l.getClass();
                                    long longValue = l.longValue();
                                    ByteString byteString = wrappedKey.key_ciphertext;
                                    byteString.getClass();
                                    byte[] byteArray = byteString.toByteArray();
                                    build.getClass();
                                    WrappedKeyEntry wrappedKeyEntry = new WrappedKeyEntry(byteArray, "TTP-wrapping-key", "RSA/ECB/OAEPPadding", build);
                                    int i12 = keyScope == null ? -1 : WhenMappings.$EnumSwitchMapping$0[keyScope.ordinal()];
                                    if (i12 == 1) {
                                        keyAliasFromType$real = getKeyAliasFromType$real(HieroglyphKeyProvider$KeyType.TTP_PAN_KEY);
                                    } else {
                                        if (i12 != 2) {
                                            return new HieroglyphKeyResult.KeyImportFailure("Unsupported key alias: " + keyScope);
                                        }
                                        keyAliasFromType$real = getKeyAliasFromType$real(HieroglyphKeyProvider$KeyType.TTP_HMAC_PAN_KEY);
                                    }
                                    RealKeyStoreProvider realKeyStoreProvider = this.keyStore;
                                    realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$1 = build;
                                    realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$3 = it;
                                    realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$8 = keyAliasFromType$real;
                                    realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$0 = i2;
                                    realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$1 = 0;
                                    realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.J$0 = longValue;
                                    realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.label = 1;
                                    Object withContext = JobKt.withContext(realKeyStoreProvider.ioContext, new RealKeyStoreProvider$setEntry$2((Object) realKeyStoreProvider, (Object) str4, (Object) wrappedKeyEntry, (Continuation) (false ? 1 : 0), 0), realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1);
                                    if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        withContext = Unit.INSTANCE;
                                    }
                                    if (withContext != obj3) {
                                        keyGenParameterSpec3 = build;
                                        i5 = i2;
                                        str = str4;
                                        j = longValue;
                                        it3 = it;
                                        i6 = 0;
                                        AndroidSecureStore androidSecureStore22 = this.importKeyExpirationSecureStore;
                                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$1 = keyGenParameterSpec3;
                                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$3 = it3;
                                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$8 = str;
                                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$9 = str;
                                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$10 = androidSecureStore22;
                                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$0 = i5;
                                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$1 = i6;
                                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.J$0 = j;
                                        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.label = 2;
                                        obj = encodeExpirationTimestamp(j, realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1);
                                        if (obj == obj3) {
                                            int i13 = i5;
                                            i3 = i6;
                                            i4 = i13;
                                            KeyGenParameterSpec keyGenParameterSpec6 = keyGenParameterSpec3;
                                            androidSecureStore = androidSecureStore22;
                                            it2 = it3;
                                            keyGenParameterSpec = keyGenParameterSpec6;
                                            str3 = str;
                                            r14 = z;
                                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$1 = keyGenParameterSpec;
                                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$3 = it2;
                                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$8 = str;
                                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$9 = r14;
                                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.L$10 = r14;
                                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$0 = i4;
                                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.I$1 = i3;
                                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.J$0 = j;
                                            realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.label = 3;
                                            keyGenParameterSpec2 = keyGenParameterSpec;
                                            obj2 = JobKt.withContext(androidSecureStore.ioDispatcher, new EngineInterceptor$intercept$2(androidSecureStore, (ByteString) obj, str3, r14, 14), realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1);
                                            if (obj2 != obj3) {
                                                String str7 = str;
                                                i2 = i4;
                                                it = it2;
                                                str2 = str7;
                                                build = keyGenParameterSpec2;
                                                if (it.hasNext()) {
                                                    return HieroglyphKeyResult.Success.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                    return obj3;
                                } catch (KeyStoreException unused3) {
                                    str = str4;
                                    return new HieroglyphKeyResult.KeyImportFailure(str);
                                }
                                str4 = keyAliasFromType$real;
                                z = false;
                            } catch (KeyStoreException unused4) {
                                str4 = keyAliasFromType$real;
                            }
                        }
                    } catch (KeyStoreException unused5) {
                        return new HieroglyphKeyResult.KeyImportFailure(str);
                    }
                }
            }
        }
        realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1 = new RealHieroglyphKeyProvider$importEncryptedHieroglyphKey$1(this, continuationImpl);
        Object obj22 = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realHieroglyphKeyProvider$importEncryptedHieroglyphKey$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|32|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        timber.log.Timber.Forest.w(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r5 instanceof java.security.KeyStoreException) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object init(ContinuationImpl continuationImpl) {
        RealHieroglyphKeyProvider$init$1 realHieroglyphKeyProvider$init$1;
        int i;
        if (continuationImpl instanceof RealHieroglyphKeyProvider$init$1) {
            realHieroglyphKeyProvider$init$1 = (RealHieroglyphKeyProvider$init$1) continuationImpl;
            int i2 = realHieroglyphKeyProvider$init$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realHieroglyphKeyProvider$init$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realHieroglyphKeyProvider$init$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realHieroglyphKeyProvider$init$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealKeyStoreProvider realKeyStoreProvider = this.keyStore;
                    realHieroglyphKeyProvider$init$1.label = 1;
                    if (JobKt.withContext(realKeyStoreProvider.ioContext, new RealKeyStoreProvider$load$2(realKeyStoreProvider, continuation, 0), realHieroglyphKeyProvider$init$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        realHieroglyphKeyProvider$init$1 = new RealHieroglyphKeyProvider$init$1(this, continuationImpl);
        Object obj2 = realHieroglyphKeyProvider$init$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realHieroglyphKeyProvider$init$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0056, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isValid(String str, ContinuationImpl continuationImpl) {
        RealHieroglyphKeyProvider$isValid$1 realHieroglyphKeyProvider$isValid$1;
        int i;
        AndroidSecureValue androidSecureValue;
        ByteString byteString;
        String str2;
        Instant instant;
        if (continuationImpl instanceof RealHieroglyphKeyProvider$isValid$1) {
            realHieroglyphKeyProvider$isValid$1 = (RealHieroglyphKeyProvider$isValid$1) continuationImpl;
            int i2 = realHieroglyphKeyProvider$isValid$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realHieroglyphKeyProvider$isValid$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realHieroglyphKeyProvider$isValid$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realHieroglyphKeyProvider$isValid$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realHieroglyphKeyProvider$isValid$1.L$0 = str;
                    realHieroglyphKeyProvider$isValid$1.label = 1;
                    AndroidSecureStore androidSecureStore = this.importKeyExpirationSecureStore;
                    obj = JobKt.withContext(androidSecureStore.ioDispatcher, new AndroidSecureStore$read$2(androidSecureStore, str, null), realHieroglyphKeyProvider$isValid$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        instant = realHieroglyphKeyProvider$isValid$1.L$1;
                        str2 = realHieroglyphKeyProvider$isValid$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (((Instant) obj).isBefore(instant)) {
                            return Boolean.FALSE;
                        }
                        realHieroglyphKeyProvider$isValid$1.L$0 = null;
                        realHieroglyphKeyProvider$isValid$1.L$1 = null;
                        realHieroglyphKeyProvider$isValid$1.label = 3;
                        Object containsAlias = this.keyStore.containsAlias(str2, realHieroglyphKeyProvider$isValid$1);
                        return containsAlias == obj2 ? obj2 : containsAlias;
                    }
                    str = realHieroglyphKeyProvider$isValid$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                androidSecureValue = (AndroidSecureValue) obj;
                if (androidSecureValue != null) {
                    try {
                        byteString = androidSecureValue.decryptThrowing();
                    } catch (Exception e) {
                        Timber.Forest.e(e);
                        byteString = null;
                    }
                    if (byteString != null) {
                        Instant parse = Instant.parse(byteString.utf8());
                        realHieroglyphKeyProvider$isValid$1.L$0 = str;
                        realHieroglyphKeyProvider$isValid$1.L$1 = parse;
                        realHieroglyphKeyProvider$isValid$1.label = 2;
                        Object currentInstant = getCurrentInstant(realHieroglyphKeyProvider$isValid$1);
                        if (currentInstant != obj2) {
                            str2 = str;
                            instant = parse;
                            obj = currentInstant;
                            if (((Instant) obj).isBefore(instant)) {
                            }
                        }
                    }
                }
                return Boolean.FALSE;
            }
        }
        realHieroglyphKeyProvider$isValid$1 = new RealHieroglyphKeyProvider$isValid$1(this, continuationImpl);
        Object obj3 = realHieroglyphKeyProvider$isValid$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realHieroglyphKeyProvider$isValid$1.label;
        if (i != 0) {
        }
        androidSecureValue = (AndroidSecureValue) obj3;
        if (androidSecureValue != null) {
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x021d, code lost:
    
        if (r1 == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x021f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0201, code lost:
    
        if (r1 == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01e1, code lost:
    
        if (r1 == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:
    
        if (r1 != r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        if (r1 == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0088, code lost:
    
        if (r1 == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0072, code lost:
    
        if (r1 == r3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object provisionKeys(ContinuationImpl continuationImpl) {
        RealHieroglyphKeyProvider$provisionKeys$1 realHieroglyphKeyProvider$provisionKeys$1;
        ByteString byteString;
        ByteString byteString2;
        HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport;
        ClientPublicKey clientPublicKey;
        List listOf;
        AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport;
        CashBusinessPaymentsClientService cashBusinessPaymentsClientService;
        if (continuationImpl instanceof RealHieroglyphKeyProvider$provisionKeys$1) {
            realHieroglyphKeyProvider$provisionKeys$1 = (RealHieroglyphKeyProvider$provisionKeys$1) continuationImpl;
            int i = realHieroglyphKeyProvider$provisionKeys$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                realHieroglyphKeyProvider$provisionKeys$1.label = i - PKIFailureInfo.systemUnavail;
                Object obj = realHieroglyphKeyProvider$provisionKeys$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = 3;
                Continuation continuation = null;
                switch (realHieroglyphKeyProvider$provisionKeys$1.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        realHieroglyphKeyProvider$provisionKeys$1.label = 1;
                        obj = haveValidKeys(realHieroglyphKeyProvider$provisionKeys$1);
                        break;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            realHieroglyphKeyProvider$provisionKeys$1.label = 2;
                            obj = getWrappingKeyPairCertificate(realHieroglyphKeyProvider$provisionKeys$1);
                            break;
                        } else {
                            return HieroglyphKeyResult.Success.INSTANCE;
                        }
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        ByteString.Companion companion = ByteString.Companion;
                        byte[] encoded = ((Certificate) obj).getPublicKey().getEncoded();
                        byte[] copyOf = Arrays.copyOf(encoded, encoded.length);
                        byteString = new ByteString(Arrays.copyOf(copyOf, copyOf.length));
                        if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$HieroglyphKeyCompatibilityReport_2.INSTANCE)).enabled()) {
                            byteString2 = byteString;
                            hieroglyphKeyCompatibilityReport = null;
                            realHieroglyphKeyProvider$provisionKeys$1.L$1 = byteString2;
                            realHieroglyphKeyProvider$provisionKeys$1.L$2 = hieroglyphKeyCompatibilityReport;
                            realHieroglyphKeyProvider$provisionKeys$1.label = 4;
                            RealKeyStoreProvider realKeyStoreProvider = this.keyStore;
                            obj = JobKt.withContext(realKeyStoreProvider.ioContext, new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, "TTP-wrapping-key", continuation, i2), realHieroglyphKeyProvider$provisionKeys$1);
                            break;
                        } else {
                            realHieroglyphKeyProvider$provisionKeys$1.L$1 = byteString;
                            realHieroglyphKeyProvider$provisionKeys$1.label = 3;
                            HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport2 = new HieroglyphKeyCompatibilityReport();
                            String str = Build.HARDWARE;
                            str.getClass();
                            hieroglyphKeyCompatibilityReport2.chipSet = str;
                            String str2 = Build.FINGERPRINT;
                            str2.getClass();
                            hieroglyphKeyCompatibilityReport2.fingerprint = str2;
                            String str3 = Build.VERSION.SECURITY_PATCH;
                            str3.getClass();
                            hieroglyphKeyCompatibilityReport2.securityPatchLevel = str3;
                            hieroglyphKeyCompatibilityReport2.passedChecks = false;
                            obj = this.keyCompatibilityChecker.generate(hieroglyphKeyCompatibilityReport2, realHieroglyphKeyProvider$provisionKeys$1);
                            break;
                        }
                    case 3:
                        byteString = realHieroglyphKeyProvider$provisionKeys$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        byteString2 = byteString;
                        hieroglyphKeyCompatibilityReport = (HieroglyphKeyCompatibilityReport) obj;
                        realHieroglyphKeyProvider$provisionKeys$1.L$1 = byteString2;
                        realHieroglyphKeyProvider$provisionKeys$1.L$2 = hieroglyphKeyCompatibilityReport;
                        realHieroglyphKeyProvider$provisionKeys$1.label = 4;
                        RealKeyStoreProvider realKeyStoreProvider2 = this.keyStore;
                        obj = JobKt.withContext(realKeyStoreProvider2.ioContext, new RealKeyStoreProvider$getKey$2(realKeyStoreProvider2, "TTP-wrapping-key", continuation, i2), realHieroglyphKeyProvider$provisionKeys$1);
                        break;
                    case 4:
                        hieroglyphKeyCompatibilityReport = realHieroglyphKeyProvider$provisionKeys$1.L$2;
                        byteString2 = realHieroglyphKeyProvider$provisionKeys$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        List list = (List) obj;
                        List list2 = list != null ? (List) Arrays.stream(list.toArray(new X509Certificate[0])).map(new RealCartBuilderManager$$ExternalSyntheticLambda1(i2, new TabToolbarsKt$$ExternalSyntheticLambda28(26))).collect(Collectors.toList()) : EmptyList.INSTANCE;
                        SignedData.Builder builder = new SignedData.Builder();
                        builder.enveloped_data = byteString2;
                        list2.getClass();
                        TransactorKt.checkElementsNotNull(list2);
                        builder.certificates = list2;
                        clientPublicKey = new ClientPublicKey(builder.certificates, builder.enveloped_data, builder.signature, builder.buildUnknownFields());
                        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new KeyScope[]{KeyScope.TTP_PAN, KeyScope.TTP_PAN_HMAC});
                        if (hieroglyphKeyCompatibilityReport != null) {
                            UiPublicProfile.Builder builder2 = new UiPublicProfile.Builder(14);
                            builder2.full_name = hieroglyphKeyCompatibilityReport.chipSet;
                            builder2.photo_url = Long.valueOf(hieroglyphKeyCompatibilityReport.keymasterVersion);
                            List list3 = CollectionsKt.toList(hieroglyphKeyCompatibilityReport.succeedChecks);
                            list3.getClass();
                            TransactorKt.checkElementsNotNull(list3);
                            builder2.full_cashtag = list3;
                            List list4 = CollectionsKt.toList(hieroglyphKeyCompatibilityReport.failedChecks);
                            list4.getClass();
                            TransactorKt.checkElementsNotNull(list4);
                            builder2.synopsis = list4;
                            List list5 = CollectionsKt.toList(hieroglyphKeyCompatibilityReport.skippedChecks);
                            list5.getClass();
                            TransactorKt.checkElementsNotNull(list5);
                            builder2.cashtag_url_enabled = list5;
                            androidKeystoreCompatibilityReport = new AndroidKeystoreCompatibilityReport((String) builder2.full_name, (Long) builder2.photo_url, (List) builder2.synopsis, (List) builder2.full_cashtag, (List) builder2.cashtag_url_enabled, (PublicKeyConfig) builder2.is_verified_account, builder2.buildUnknownFields());
                        } else {
                            androidKeystoreCompatibilityReport = null;
                        }
                        MRIUseCase mRIUseCase = MRIUseCase.TTP;
                        realHieroglyphKeyProvider$provisionKeys$1.L$1 = null;
                        realHieroglyphKeyProvider$provisionKeys$1.L$2 = null;
                        cashBusinessPaymentsClientService = this.service;
                        realHieroglyphKeyProvider$provisionKeys$1.L$5 = cashBusinessPaymentsClientService;
                        realHieroglyphKeyProvider$provisionKeys$1.L$6 = clientPublicKey;
                        realHieroglyphKeyProvider$provisionKeys$1.L$7 = listOf;
                        realHieroglyphKeyProvider$provisionKeys$1.L$8 = androidKeystoreCompatibilityReport;
                        realHieroglyphKeyProvider$provisionKeys$1.label = 5;
                        obj = RealMRIFactory.buildSignedSerializedMRIContext$default(this.mriFactory, mRIUseCase, null, realHieroglyphKeyProvider$provisionKeys$1, 6);
                        break;
                    case 5:
                        androidKeystoreCompatibilityReport = realHieroglyphKeyProvider$provisionKeys$1.L$8;
                        listOf = realHieroglyphKeyProvider$provisionKeys$1.L$7;
                        clientPublicKey = realHieroglyphKeyProvider$provisionKeys$1.L$6;
                        cashBusinessPaymentsClientService = realHieroglyphKeyProvider$provisionKeys$1.L$5;
                        SafeTrace.throwOnFailure(obj);
                        AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport2 = androidKeystoreCompatibilityReport;
                        CashBusinessPaymentsClientService cashBusinessPaymentsClientService2 = cashBusinessPaymentsClientService;
                        ProvisionKeysRequest provisionKeysRequest = new ProvisionKeysRequest(clientPublicKey, listOf, null, androidKeystoreCompatibilityReport2, (SignedSerializedMRIContext) obj, ByteString.EMPTY);
                        realHieroglyphKeyProvider$provisionKeys$1.L$1 = null;
                        realHieroglyphKeyProvider$provisionKeys$1.L$2 = null;
                        realHieroglyphKeyProvider$provisionKeys$1.L$5 = null;
                        realHieroglyphKeyProvider$provisionKeys$1.L$6 = null;
                        realHieroglyphKeyProvider$provisionKeys$1.L$7 = null;
                        realHieroglyphKeyProvider$provisionKeys$1.L$8 = null;
                        realHieroglyphKeyProvider$provisionKeys$1.label = 6;
                        obj = cashBusinessPaymentsClientService2.provisionKeys(provisionKeysRequest, realHieroglyphKeyProvider$provisionKeys$1);
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult = (ApiResult) obj;
                        if (!(apiResult instanceof ApiResult.Success)) {
                            return new HieroglyphKeyResult.ProvisioningFailure();
                        }
                        ProvisionKeysResponse provisionKeysResponse = (ProvisionKeysResponse) ((ApiResult.Success) apiResult).response;
                        realHieroglyphKeyProvider$provisionKeys$1.L$1 = null;
                        realHieroglyphKeyProvider$provisionKeys$1.L$2 = null;
                        realHieroglyphKeyProvider$provisionKeys$1.L$5 = null;
                        realHieroglyphKeyProvider$provisionKeys$1.label = 7;
                        obj = importEncryptedHieroglyphKey(provisionKeysResponse, realHieroglyphKeyProvider$provisionKeys$1);
                        break;
                    case 7:
                        SafeTrace.throwOnFailure(obj);
                        return (HieroglyphKeyResult) obj;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realHieroglyphKeyProvider$provisionKeys$1 = new RealHieroglyphKeyProvider$provisionKeys$1(this, continuationImpl);
        Object obj3 = realHieroglyphKeyProvider$provisionKeys$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i22 = 3;
        Continuation continuation2 = null;
        switch (realHieroglyphKeyProvider$provisionKeys$1.label) {
        }
    }
}
