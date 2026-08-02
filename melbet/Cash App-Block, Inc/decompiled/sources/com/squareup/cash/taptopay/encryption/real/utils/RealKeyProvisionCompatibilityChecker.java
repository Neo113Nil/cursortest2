package com.squareup.cash.taptopay.encryption.real.utils;

import android.os.Build;
import android.security.keystore.SecureKeyImportUnavailableException;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$KeystoreBlockedDevices;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.taptopay.encryption.api.HieroglyphKeyCompatibilityReport;
import com.squareup.cropview.Edge;
import com.squareup.protos.hieroglyph.AndroidKeystoreCompatibilityReport;
import com.squareup.scannerview.SizeMap;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealKeyProvisionCompatibilityChecker {
    public final zzb blockedDeviceManager;
    public final JCAContext keyStoreCipherUtils;
    public KeyPair wrappingKeyPair;
    public static final byte[] transportKeyBytes = new byte[32];
    public static final byte[] AESKeyBytes = new byte[16];

    public RealKeyProvisionCompatibilityChecker(zzb zzbVar, JCAContext jCAContext, Edge.Companion companion) {
        this.blockedDeviceManager = zzbVar;
        this.keyStoreCipherUtils = jCAContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb A[Catch: all -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0031, B:15:0x00ba, B:21:0x00cb), top: B:13:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #1 {all -> 0x004b, blocks: (B:32:0x0047, B:33:0x009e, B:39:0x0056, B:40:0x007f, B:44:0x008f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.squareup.cash.taptopay.encryption.api.HieroglyphKeyCompatibilityReport] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.squareup.cash.taptopay.encryption.real.utils.RealKeyProvisionCompatibilityChecker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generate(HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport, ContinuationImpl continuationImpl) {
        RealKeyProvisionCompatibilityChecker$generate$1 realKeyProvisionCompatibilityChecker$generate$1;
        Object obj;
        ?? r2;
        long j;
        long j2;
        HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport2;
        Object testAESKeyNoMinMACImport;
        boolean z;
        HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport3;
        try {
            if (continuationImpl instanceof RealKeyProvisionCompatibilityChecker$generate$1) {
                realKeyProvisionCompatibilityChecker$generate$1 = (RealKeyProvisionCompatibilityChecker$generate$1) continuationImpl;
                int i = realKeyProvisionCompatibilityChecker$generate$1.label;
                if ((i & PKIFailureInfo.systemUnavail) != 0) {
                    realKeyProvisionCompatibilityChecker$generate$1.label = i - PKIFailureInfo.systemUnavail;
                    obj = realKeyProvisionCompatibilityChecker$generate$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = realKeyProvisionCompatibilityChecker$generate$1.label;
                    if (r2 != 0) {
                        SafeTrace.throwOnFailure(obj);
                        j = System.currentTimeMillis();
                        try {
                            if (!testOSAndModel(hieroglyphKeyCompatibilityReport)) {
                                hieroglyphKeyCompatibilityReport.timeConsumption = System.currentTimeMillis() - j;
                                return hieroglyphKeyCompatibilityReport;
                            }
                            realKeyProvisionCompatibilityChecker$generate$1.L$0 = hieroglyphKeyCompatibilityReport;
                            realKeyProvisionCompatibilityChecker$generate$1.L$1 = hieroglyphKeyCompatibilityReport;
                            realKeyProvisionCompatibilityChecker$generate$1.J$0 = j;
                            realKeyProvisionCompatibilityChecker$generate$1.label = 1;
                            obj = testKeyGeneration(hieroglyphKeyCompatibilityReport, realKeyProvisionCompatibilityChecker$generate$1);
                            if (obj != coroutineSingletons) {
                                hieroglyphKeyCompatibilityReport2 = hieroglyphKeyCompatibilityReport;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th) {
                            th = th;
                            j2 = j;
                            hieroglyphKeyCompatibilityReport.timeConsumption = System.currentTimeMillis() - j2;
                            throw th;
                        }
                    }
                    if (r2 != 1) {
                        if (r2 == 2) {
                            j = realKeyProvisionCompatibilityChecker$generate$1.J$0;
                            hieroglyphKeyCompatibilityReport = realKeyProvisionCompatibilityChecker$generate$1.L$1;
                            HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport4 = realKeyProvisionCompatibilityChecker$generate$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            r2 = hieroglyphKeyCompatibilityReport4;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            realKeyProvisionCompatibilityChecker$generate$1.L$0 = r2;
                            realKeyProvisionCompatibilityChecker$generate$1.L$1 = hieroglyphKeyCompatibilityReport;
                            realKeyProvisionCompatibilityChecker$generate$1.J$0 = j;
                            realKeyProvisionCompatibilityChecker$generate$1.Z$0 = booleanValue;
                            realKeyProvisionCompatibilityChecker$generate$1.label = 3;
                            testAESKeyNoMinMACImport = testAESKeyNoMinMACImport(hieroglyphKeyCompatibilityReport, realKeyProvisionCompatibilityChecker$generate$1);
                            if (testAESKeyNoMinMACImport != coroutineSingletons) {
                                obj = testAESKeyNoMinMACImport;
                                z = booleanValue;
                                hieroglyphKeyCompatibilityReport3 = r2;
                                j2 = j;
                                if (z | ((Boolean) obj).booleanValue()) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (r2 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = realKeyProvisionCompatibilityChecker$generate$1.Z$0;
                        j2 = realKeyProvisionCompatibilityChecker$generate$1.J$0;
                        hieroglyphKeyCompatibilityReport = realKeyProvisionCompatibilityChecker$generate$1.L$1;
                        hieroglyphKeyCompatibilityReport3 = realKeyProvisionCompatibilityChecker$generate$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            if (z || ((Boolean) obj).booleanValue()) {
                                hieroglyphKeyCompatibilityReport3.timeConsumption = System.currentTimeMillis() - j2;
                                return hieroglyphKeyCompatibilityReport;
                            }
                            AndroidKeystoreCompatibilityReport.CompatibilityTest compatibilityTest = AndroidKeystoreCompatibilityReport.CompatibilityTest.HMAC_KEY_IMPORT_WITH_MIN_MAC;
                            hieroglyphKeyCompatibilityReport.getClass();
                            LinkedHashSet linkedHashSet = hieroglyphKeyCompatibilityReport.skippedChecks;
                            linkedHashSet.add(compatibilityTest);
                            linkedHashSet.add(AndroidKeystoreCompatibilityReport.CompatibilityTest.HMAC_KEY_IMPORT_NO_MIN_MAC);
                            linkedHashSet.add(AndroidKeystoreCompatibilityReport.CompatibilityTest.AES_KEY_ENCRYPTION);
                            linkedHashSet.add(AndroidKeystoreCompatibilityReport.CompatibilityTest.HMAC_KEY_SIGNING);
                            hieroglyphKeyCompatibilityReport3.passedChecks = true;
                            hieroglyphKeyCompatibilityReport3.timeConsumption = System.currentTimeMillis() - j2;
                            return hieroglyphKeyCompatibilityReport;
                        } catch (Throwable th2) {
                            th = th2;
                            hieroglyphKeyCompatibilityReport = hieroglyphKeyCompatibilityReport3;
                            hieroglyphKeyCompatibilityReport.timeConsumption = System.currentTimeMillis() - j2;
                            throw th;
                        }
                    }
                    j = realKeyProvisionCompatibilityChecker$generate$1.J$0;
                    hieroglyphKeyCompatibilityReport = realKeyProvisionCompatibilityChecker$generate$1.L$1;
                    HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport5 = realKeyProvisionCompatibilityChecker$generate$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    hieroglyphKeyCompatibilityReport2 = hieroglyphKeyCompatibilityReport5;
                    if (((Boolean) obj).booleanValue()) {
                        hieroglyphKeyCompatibilityReport2.timeConsumption = System.currentTimeMillis() - j;
                        return hieroglyphKeyCompatibilityReport;
                    }
                    realKeyProvisionCompatibilityChecker$generate$1.L$0 = hieroglyphKeyCompatibilityReport2;
                    realKeyProvisionCompatibilityChecker$generate$1.L$1 = hieroglyphKeyCompatibilityReport;
                    realKeyProvisionCompatibilityChecker$generate$1.J$0 = j;
                    realKeyProvisionCompatibilityChecker$generate$1.label = 2;
                    obj = testAESKeyWithMinMACImport(hieroglyphKeyCompatibilityReport, realKeyProvisionCompatibilityChecker$generate$1);
                    r2 = hieroglyphKeyCompatibilityReport2;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    realKeyProvisionCompatibilityChecker$generate$1.L$0 = r2;
                    realKeyProvisionCompatibilityChecker$generate$1.L$1 = hieroglyphKeyCompatibilityReport;
                    realKeyProvisionCompatibilityChecker$generate$1.J$0 = j;
                    realKeyProvisionCompatibilityChecker$generate$1.Z$0 = booleanValue2;
                    realKeyProvisionCompatibilityChecker$generate$1.label = 3;
                    testAESKeyNoMinMACImport = testAESKeyNoMinMACImport(hieroglyphKeyCompatibilityReport, realKeyProvisionCompatibilityChecker$generate$1);
                    if (testAESKeyNoMinMACImport != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            }
            if (r2 != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th3) {
            th = th3;
            hieroglyphKeyCompatibilityReport = r2;
        }
        realKeyProvisionCompatibilityChecker$generate$1 = new RealKeyProvisionCompatibilityChecker$generate$1(this, continuationImpl);
        obj = realKeyProvisionCompatibilityChecker$generate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = realKeyProvisionCompatibilityChecker$generate$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object testAESKeyNoMinMACImport(HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport, ContinuationImpl continuationImpl) {
        RealKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1 realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1;
        Object obj;
        int i;
        HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport2;
        if (continuationImpl instanceof RealKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1) {
            realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1 = (RealKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1) continuationImpl;
            int i2 = realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1 realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$12 = realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1;
                obj = realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$12.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SizeMap sizeMap = new SizeMap(EcrKeyType.AES_KEY_NO_MIN_MAC);
                    realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$12.L$0 = hieroglyphKeyCompatibilityReport;
                    realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$12.label = 1;
                    obj = testKeyImportImpl(hieroglyphKeyCompatibilityReport, sizeMap, "test-ecr-aes-no-min-mac", AESKeyBytes, realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                    hieroglyphKeyCompatibilityReport2 = hieroglyphKeyCompatibilityReport;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hieroglyphKeyCompatibilityReport2 = realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    AndroidKeystoreCompatibilityReport.CompatibilityTest compatibilityTest = AndroidKeystoreCompatibilityReport.CompatibilityTest.AES_KEY_IMPORT_NO_MIN_MAC;
                    hieroglyphKeyCompatibilityReport2.getClass();
                    hieroglyphKeyCompatibilityReport2.failedChecks.add(compatibilityTest);
                    z = false;
                } else {
                    AndroidKeystoreCompatibilityReport.CompatibilityTest compatibilityTest2 = AndroidKeystoreCompatibilityReport.CompatibilityTest.AES_KEY_IMPORT_NO_MIN_MAC;
                    hieroglyphKeyCompatibilityReport2.getClass();
                    hieroglyphKeyCompatibilityReport2.succeedChecks.add(compatibilityTest2);
                }
                return Boolean.valueOf(z);
            }
        }
        realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1 = new RealKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1(this, continuationImpl);
        RealKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1 realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$122 = realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$1;
        obj = realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realKeyProvisionCompatibilityChecker$testAESKeyNoMinMACImport$122.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object testAESKeyWithMinMACImport(HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport, ContinuationImpl continuationImpl) {
        RealKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1 realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1;
        Object obj;
        int i;
        HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport2;
        if (continuationImpl instanceof RealKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1) {
            realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1 = (RealKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1) continuationImpl;
            int i2 = realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1 realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$12 = realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1;
                obj = realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$12.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SizeMap sizeMap = new SizeMap(EcrKeyType.AES_KEY_WITH_MIN_MAC);
                    realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$12.L$0 = hieroglyphKeyCompatibilityReport;
                    realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$12.label = 1;
                    obj = testKeyImportImpl(hieroglyphKeyCompatibilityReport, sizeMap, "test-ecr-aes-with-min-mac", AESKeyBytes, realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                    hieroglyphKeyCompatibilityReport2 = hieroglyphKeyCompatibilityReport;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hieroglyphKeyCompatibilityReport2 = realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    AndroidKeystoreCompatibilityReport.CompatibilityTest compatibilityTest = AndroidKeystoreCompatibilityReport.CompatibilityTest.AES_KEY_IMPORT_WITH_MIN_MAC;
                    hieroglyphKeyCompatibilityReport2.getClass();
                    hieroglyphKeyCompatibilityReport2.failedChecks.add(compatibilityTest);
                    z = false;
                } else {
                    AndroidKeystoreCompatibilityReport.CompatibilityTest compatibilityTest2 = AndroidKeystoreCompatibilityReport.CompatibilityTest.AES_KEY_IMPORT_WITH_MIN_MAC;
                    hieroglyphKeyCompatibilityReport2.getClass();
                    hieroglyphKeyCompatibilityReport2.succeedChecks.add(compatibilityTest2);
                }
                return Boolean.valueOf(z);
            }
        }
        realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1 = new RealKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1(this, continuationImpl);
        RealKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1 realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$122 = realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$1;
        obj = realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realKeyProvisionCompatibilityChecker$testAESKeyWithMinMACImport$122.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r10 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object testKeyGeneration(HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport, ContinuationImpl continuationImpl) {
        RealKeyProvisionCompatibilityChecker$testKeyGeneration$1 realKeyProvisionCompatibilityChecker$testKeyGeneration$1;
        int i;
        int i2;
        Object generateKey;
        try {
            if (continuationImpl instanceof RealKeyProvisionCompatibilityChecker$testKeyGeneration$1) {
                realKeyProvisionCompatibilityChecker$testKeyGeneration$1 = (RealKeyProvisionCompatibilityChecker$testKeyGeneration$1) continuationImpl;
                int i3 = realKeyProvisionCompatibilityChecker$testKeyGeneration$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realKeyProvisionCompatibilityChecker$testKeyGeneration$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realKeyProvisionCompatibilityChecker$testKeyGeneration$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realKeyProvisionCompatibilityChecker$testKeyGeneration$1.label;
                    JCAContext jCAContext = this.keyStoreCipherUtils;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realKeyProvisionCompatibilityChecker$testKeyGeneration$1.L$0 = hieroglyphKeyCompatibilityReport;
                        realKeyProvisionCompatibilityChecker$testKeyGeneration$1.L$1 = this;
                        i2 = 0;
                        realKeyProvisionCompatibilityChecker$testKeyGeneration$1.I$0 = 0;
                        realKeyProvisionCompatibilityChecker$testKeyGeneration$1.label = 1;
                        generateKey = jCAContext.generateKey(2048, "provision-wrapping-key", realKeyProvisionCompatibilityChecker$testKeyGeneration$1);
                        if (generateKey == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hieroglyphKeyCompatibilityReport = realKeyProvisionCompatibilityChecker$testKeyGeneration$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            int intValue = ((Number) obj).intValue();
                            hieroglyphKeyCompatibilityReport.keymasterVersion = intValue;
                            if (intValue < 4) {
                                hieroglyphKeyCompatibilityReport.failedChecks.add(AndroidKeystoreCompatibilityReport.CompatibilityTest.KEYMINT_VERSION);
                                return Boolean.FALSE;
                            }
                            hieroglyphKeyCompatibilityReport.succeedChecks.add(AndroidKeystoreCompatibilityReport.CompatibilityTest.KEYMINT_VERSION);
                            return Boolean.TRUE;
                        }
                        int i4 = realKeyProvisionCompatibilityChecker$testKeyGeneration$1.I$0;
                        RealKeyProvisionCompatibilityChecker realKeyProvisionCompatibilityChecker = realKeyProvisionCompatibilityChecker$testKeyGeneration$1.L$1;
                        HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport2 = realKeyProvisionCompatibilityChecker$testKeyGeneration$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            i2 = i4;
                            this = realKeyProvisionCompatibilityChecker;
                            hieroglyphKeyCompatibilityReport = hieroglyphKeyCompatibilityReport2;
                            generateKey = obj;
                        } catch (Exception e) {
                            e = e;
                            hieroglyphKeyCompatibilityReport = hieroglyphKeyCompatibilityReport2;
                            if (!(e instanceof GeneralSecurityException) && !(e instanceof SecureKeyImportUnavailableException)) {
                                throw e;
                            }
                            hieroglyphKeyCompatibilityReport.getClass();
                            hieroglyphKeyCompatibilityReport.exceptions.add(e);
                            hieroglyphKeyCompatibilityReport.failedChecks.add(AndroidKeystoreCompatibilityReport.CompatibilityTest.KEY_GENERATION);
                            return Boolean.FALSE;
                        }
                    }
                    this.wrappingKeyPair = (KeyPair) generateKey;
                    AndroidKeystoreCompatibilityReport.CompatibilityTest compatibilityTest = AndroidKeystoreCompatibilityReport.CompatibilityTest.KEY_GENERATION;
                    hieroglyphKeyCompatibilityReport.getClass();
                    hieroglyphKeyCompatibilityReport.succeedChecks.add(compatibilityTest);
                    realKeyProvisionCompatibilityChecker$testKeyGeneration$1.L$0 = hieroglyphKeyCompatibilityReport;
                    realKeyProvisionCompatibilityChecker$testKeyGeneration$1.L$1 = null;
                    realKeyProvisionCompatibilityChecker$testKeyGeneration$1.I$0 = i2;
                    realKeyProvisionCompatibilityChecker$testKeyGeneration$1.label = 2;
                    obj = jCAContext.getKeyMasterVersion(realKeyProvisionCompatibilityChecker$testKeyGeneration$1);
                }
            }
            if (i != 0) {
            }
            this.wrappingKeyPair = (KeyPair) generateKey;
            AndroidKeystoreCompatibilityReport.CompatibilityTest compatibilityTest2 = AndroidKeystoreCompatibilityReport.CompatibilityTest.KEY_GENERATION;
            hieroglyphKeyCompatibilityReport.getClass();
            hieroglyphKeyCompatibilityReport.succeedChecks.add(compatibilityTest2);
            realKeyProvisionCompatibilityChecker$testKeyGeneration$1.L$0 = hieroglyphKeyCompatibilityReport;
            realKeyProvisionCompatibilityChecker$testKeyGeneration$1.L$1 = null;
            realKeyProvisionCompatibilityChecker$testKeyGeneration$1.I$0 = i2;
            realKeyProvisionCompatibilityChecker$testKeyGeneration$1.label = 2;
            obj = jCAContext.getKeyMasterVersion(realKeyProvisionCompatibilityChecker$testKeyGeneration$1);
        } catch (Exception e2) {
            e = e2;
        }
        realKeyProvisionCompatibilityChecker$testKeyGeneration$1 = new RealKeyProvisionCompatibilityChecker$testKeyGeneration$1(this, continuationImpl);
        Object obj2 = realKeyProvisionCompatibilityChecker$testKeyGeneration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realKeyProvisionCompatibilityChecker$testKeyGeneration$1.label;
        JCAContext jCAContext2 = this.keyStoreCipherUtils;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r6.importKey((byte[]) r11, r9, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object testKeyImportImpl(HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport, SizeMap sizeMap, String str, byte[] bArr, ContinuationImpl continuationImpl) {
        RealKeyProvisionCompatibilityChecker$testKeyImportImpl$1 realKeyProvisionCompatibilityChecker$testKeyImportImpl$1;
        int i;
        try {
            if (continuationImpl instanceof RealKeyProvisionCompatibilityChecker$testKeyImportImpl$1) {
                realKeyProvisionCompatibilityChecker$testKeyImportImpl$1 = (RealKeyProvisionCompatibilityChecker$testKeyImportImpl$1) continuationImpl;
                int i2 = realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        KeyPair keyPair = this.wrappingKeyPair;
                        if (keyPair == null) {
                            throw new GeneralSecurityException("Key pair missing");
                        }
                        byte[] bArr2 = transportKeyBytes;
                        realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.L$0 = hieroglyphKeyCompatibilityReport;
                        realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.L$2 = str;
                        realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.label = 1;
                        obj = JCAContext.wrapKey(keyPair, sizeMap, bArr2, bArr);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport2 = realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            return Boolean.TRUE;
                        }
                        str = realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.L$2;
                        hieroglyphKeyCompatibilityReport = realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    JCAContext jCAContext = this.keyStoreCipherUtils;
                    realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.L$0 = hieroglyphKeyCompatibilityReport;
                    realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.L$2 = null;
                    realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.label = 2;
                }
            }
            if (i != 0) {
            }
            JCAContext jCAContext2 = this.keyStoreCipherUtils;
            realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.L$0 = hieroglyphKeyCompatibilityReport;
            realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.L$2 = null;
            realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.label = 2;
        } catch (Exception e) {
            if (!(e instanceof GeneralSecurityException) && !(e instanceof IOException) && !(e instanceof SecureKeyImportUnavailableException)) {
                throw e;
            }
            hieroglyphKeyCompatibilityReport.getClass();
            hieroglyphKeyCompatibilityReport.exceptions.add(e);
            return Boolean.FALSE;
        }
        realKeyProvisionCompatibilityChecker$testKeyImportImpl$1 = new RealKeyProvisionCompatibilityChecker$testKeyImportImpl$1(this, continuationImpl);
        Object obj2 = realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realKeyProvisionCompatibilityChecker$testKeyImportImpl$1.label;
    }

    public final boolean testOSAndModel(HieroglyphKeyCompatibilityReport hieroglyphKeyCompatibilityReport) {
        List split$default;
        String str = Build.MODEL;
        str.getClass();
        String obj = StringsKt.trim(str).toString();
        split$default = StringsKt__StringsKt.split$default(((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) ((FeatureFlagManager) this.blockedDeviceManager.zza)).peekCurrentValue(LaunchDarklyFeatureFlags$KeystoreBlockedDevices.INSTANCE)).value, new String[]{","}, false, 0, 6, null);
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            if (StringsKt__StringsJVMKt.equals((String) it.next(), obj, true)) {
                AndroidKeystoreCompatibilityReport.CompatibilityTest compatibilityTest = AndroidKeystoreCompatibilityReport.CompatibilityTest.PHONE_MODEL;
                hieroglyphKeyCompatibilityReport.getClass();
                hieroglyphKeyCompatibilityReport.failedChecks.add(compatibilityTest);
                return false;
            }
        }
        AndroidKeystoreCompatibilityReport.CompatibilityTest compatibilityTest2 = AndroidKeystoreCompatibilityReport.CompatibilityTest.PHONE_MODEL;
        hieroglyphKeyCompatibilityReport.getClass();
        LinkedHashSet linkedHashSet = hieroglyphKeyCompatibilityReport.succeedChecks;
        linkedHashSet.add(compatibilityTest2);
        linkedHashSet.add(AndroidKeystoreCompatibilityReport.CompatibilityTest.OS_VERSION);
        return true;
    }
}
