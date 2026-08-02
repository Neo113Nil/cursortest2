package com.squareup.cash.verification;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.cdf.cashapppay.CashAppPayAppVerificationFailed;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.util.android.AndroidPackageManager;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class AppVerification {
    public static final Map appActionMap = MapsKt__MapsJVMKt.mapOf(new Pair("com.google.android.payments.standard.AUTHENTICATE_V1", CollectionsKt__CollectionsJVMKt.listOf("app.cash.paykit.devapp")));
    public static final Map appSignaturesMap = Thread$State$EnumUnboxingLocalUtility.m("app.cash.paykit.devapp", "308202e4308201cc020101300d06092a864886f70d010105050030373116301406035504030c0d416e64726f69642044656275673110300e060355040a0c07416e64726f6964310b30090603550406130255533020170d3232313130343230353730335a180f32303532313032373230353730335a30373116301406035504030c0d416e64726f69642044656275673110300e060355040a0c07416e64726f6964310b300906035504061302555330820122300d06092a864886f70d01010105000382010f003082010a0282010100c279382e21c14207b7fdf47a955bcc8443953a27249fad3da75ee1f42b9ed3213da1a80abc6b29cfe32ebe5e7ac9861a6623552be0fe1196f6f0abb52f2111bc0872342b36c12aed44b7229b4b37dcd2e51655530a5a087db8a7dbfd174537cc1fb1a8e194076c18105dbeb910fe97dfe2851b7f83f9a474de822844e92e86191294e7034de80adc392047c70f548b582bfb1243fc384f0bd953508457f5968f66a78033d2c5d8c09beec2be17d0a465bef412791fe7f67eeb3400a23b63db7d1e5bc068d59fcb5446cacad4d84a2583968624f2e04c55354b02c9b500e14128968b4ae0ece1bab4206b532556436e2cb4d7d9844cf3a0b1dbe70687b070ec7b0203010001300d06092a864886f70d0101050500038201010071e324acf1102c1f87130fd6a0a1db80bdb0bd62e9928d5470d1dfd562a5373c0eb46717a870b7837417be6dee636f405304dd71c00582c72c34ab81cd2e35dacc524c285c8a297d0ac6acfce7f3094f3b49a43282043ac72ede95e7d3b384b1dc9cd256350dfb64bdbb350a31d262df467b3d62755a4d8c3b8aa4487ff6c4d74b98ef18a9b2de8fec2a7548a064be58fa3d26e643023bc33a1baa878b475b0d48b26a8d351398b586b5e0b42a4eb3dc6f284972866ed6b74bc9546d9f4c1b0138cfd928563dbedd40c51d09c4f5c062b72aa3abe22e91b3b51653f860583aeea90713d77ea79091b6a4476bcd4598922c9b050ff88387036a8e9c578f8192a0");
    public final Analytics analytics;
    public final ErrorReporter errorReporter;

    public AppVerification(Analytics analytics, ErrorReporter errorReporter) {
        this.analytics = analytics;
        this.errorReporter = errorReporter;
    }

    public final void recordAppVerificationFailed(String str, Signature signature) {
        this.analytics.track(new CashAppPayAppVerificationFailed(str, signature != null ? signature.toCharsString() : null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean validateAppSignature(Intent intent, ComponentName componentName, AndroidPackageManager androidPackageManager) {
        Signature[] signatureArr;
        Signature signature;
        Signature[] signatureArr2;
        intent.getClass();
        String action = intent.getAction();
        String packageName = componentName != null ? componentName.getPackageName() : null;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        ErrorReporter errorReporter = this.errorReporter;
        if (packageName != null) {
            try {
                PackageInfo packageInfo = androidPackageManager.context.getPackageManager().getPackageInfo(packageName, 134217728);
                packageInfo.getClass();
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo != null ? signingInfo.hasMultipleSigners() : false) {
                    if (signingInfo == null || (signatureArr2 = signingInfo.getApkContentsSigners()) == null) {
                        signatureArr2 = new Signature[0];
                    }
                    signature = (Signature) ArraysKt___ArraysKt.firstOrNull(signatureArr2);
                } else {
                    if (signingInfo == null || (signatureArr = signingInfo.getSigningCertificateHistory()) == null) {
                        signatureArr = new Signature[0];
                    }
                    signature = (Signature) ArraysKt___ArraysKt.firstOrNull(signatureArr);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                errorReporter.report(new AppVerificationError("Failed to retrieve package info for ".concat(packageName), null, 6), defaultSamplingStrategy);
            }
            if (Intrinsics.areEqual(action, "com.google.android.payments.standard.AUTHENTICATE_V1")) {
                errorReporter.report(new AppVerificationError("Couldn't match Action with a known payments action.", packageName, 4), defaultSamplingStrategy);
                recordAppVerificationFailed(packageName, signature);
                return false;
            }
            Timber.Forest forest = Timber.Forest;
            forest.tag("AppVerification");
            forest.i("Going to attempt to validate signature for Google Payments Action.", new Object[0]);
            if (packageName == null) {
                errorReporter.report(new AppVerificationError("Could not retrieve the calling package name.", null, 6), defaultSamplingStrategy);
                recordAppVerificationFailed(packageName, signature);
                return false;
            }
            forest.tag("AppVerification");
            forest.i("Calling package name: %s", packageName);
            if (signature == null) {
                errorReporter.report(new AppVerificationError("Failed to retrieve the signature of the calling package.", packageName, 4), defaultSamplingStrategy);
                recordAppVerificationFailed(packageName, signature);
                return false;
            }
            forest.tag("AppVerification");
            forest.i("Caller App Signature: %s", signature.toCharsString());
            if (Intrinsics.areEqual(signature.toCharsString(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a")) {
                return true;
            }
            List list = (List) appActionMap.get(action);
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            if (!list.contains(packageName)) {
                errorReporter.report(new AppVerificationError("Calling package name is not allowed for the calling action.", packageName, 4), defaultSamplingStrategy);
                recordAppVerificationFailed(packageName, signature);
                return false;
            }
            if (Intrinsics.areEqual((String) appSignaturesMap.get(packageName), signature.toCharsString())) {
                return true;
            }
            errorReporter.report(new AppVerificationError("Signature of the calling package does not match the expected signature.", packageName, 4), defaultSamplingStrategy);
            recordAppVerificationFailed(packageName, signature);
            return false;
        }
        signature = null;
        if (Intrinsics.areEqual(action, "com.google.android.payments.standard.AUTHENTICATE_V1")) {
        }
    }
}
