package com.withpersona.sdk2.inquiry.tracking;

import android.util.Base64;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000b\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"GCM_TAG_LENGTH_BITS", "", "GCM_IV_LENGTH_BYTES", "AES_KEY_LENGTH_BYTES", "TEST_OBFUSCATION_KEY", "", "obfuscatePayload", "Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;", "data", "publicKeyPem", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parsePublicKeyPem", "Ljava/security/PublicKey;", "pem", "tracking-events_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackingEventUtilsKt {
    private static final int AES_KEY_LENGTH_BYTES = 32;
    private static final int GCM_IV_LENGTH_BYTES = 12;
    private static final int GCM_TAG_LENGTH_BITS = 128;
    private static final String TEST_OBFUSCATION_KEY = "4ERbfREmnh82jvK5QaXOv8jZ3OQq9hKg5o/Hbb3l9bk=";

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object obfuscatePayload(String str, String str2, Continuation<? super ObfuscationResult> continuation) {
        TrackingEventUtilsKt$obfuscatePayload$1 trackingEventUtilsKt$obfuscatePayload$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        Object withContext;
        String str4;
        byte[] bArr4;
        try {
            if (continuation instanceof TrackingEventUtilsKt$obfuscatePayload$1) {
                trackingEventUtilsKt$obfuscatePayload$1 = (TrackingEventUtilsKt$obfuscatePayload$1) continuation;
                int i2 = trackingEventUtilsKt$obfuscatePayload$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventUtilsKt$obfuscatePayload$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventUtilsKt$obfuscatePayload$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventUtilsKt$obfuscatePayload$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Charset charset = StandardCharsets.UTF_8;
                        charset.getClass();
                        byte[] bytes = str.getBytes(charset);
                        bytes.getClass();
                        byte[] bArr5 = new byte[32];
                        new SecureRandom().nextBytes(bArr5);
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr5, "AES");
                        byte[] bArr6 = new byte[12];
                        new SecureRandom().nextBytes(bArr6);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        TrackingEventUtilsKt$obfuscatePayload$aesCipher$1 trackingEventUtilsKt$obfuscatePayload$aesCipher$1 = new TrackingEventUtilsKt$obfuscatePayload$aesCipher$1(secretKeySpec, bArr6, null);
                        str3 = str2;
                        trackingEventUtilsKt$obfuscatePayload$1.L$0 = str3;
                        trackingEventUtilsKt$obfuscatePayload$1.L$1 = bytes;
                        trackingEventUtilsKt$obfuscatePayload$1.L$2 = bArr5;
                        trackingEventUtilsKt$obfuscatePayload$1.L$3 = bArr6;
                        trackingEventUtilsKt$obfuscatePayload$1.label = 1;
                        Object withContext2 = JobKt.withContext(defaultIoScheduler, trackingEventUtilsKt$obfuscatePayload$aesCipher$1, trackingEventUtilsKt$obfuscatePayload$1);
                        if (withContext2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bArr = bArr5;
                        obj = withContext2;
                        bArr2 = bytes;
                        bArr3 = bArr6;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str4 = (String) trackingEventUtilsKt$obfuscatePayload$1.L$1;
                            bArr4 = (byte[]) trackingEventUtilsKt$obfuscatePayload$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            String encodeToString = Base64.encodeToString(((Cipher) obj).doFinal(bArr4), 2);
                            str4.getClass();
                            encodeToString.getClass();
                            return new ObfuscationResult(str4, encodeToString);
                        }
                        byte[] bArr7 = (byte[]) trackingEventUtilsKt$obfuscatePayload$1.L$3;
                        bArr = (byte[]) trackingEventUtilsKt$obfuscatePayload$1.L$2;
                        byte[] bArr8 = (byte[]) trackingEventUtilsKt$obfuscatePayload$1.L$1;
                        String str5 = (String) trackingEventUtilsKt$obfuscatePayload$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        bArr3 = bArr7;
                        str3 = str5;
                        bArr2 = bArr8;
                    }
                    byte[] doFinal = ((Cipher) obj).doFinal(bArr2);
                    byte[] bArr9 = new byte[doFinal.length + bArr3.length];
                    ArraysKt___ArraysJvmKt.copyInto$default(doFinal, bArr9, 0, 0, 0, 12);
                    ArraysKt___ArraysJvmKt.copyInto$default(bArr3, bArr9, doFinal.length, 0, 0, 12);
                    String encodeToString2 = Base64.encodeToString(bArr9, 2);
                    PublicKey parsePublicKeyPem = parsePublicKeyPem(str3);
                    DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
                    TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1 trackingEventUtilsKt$obfuscatePayload$rsaCipher$1 = new TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1(parsePublicKeyPem, null);
                    trackingEventUtilsKt$obfuscatePayload$1.L$0 = bArr;
                    trackingEventUtilsKt$obfuscatePayload$1.L$1 = encodeToString2;
                    trackingEventUtilsKt$obfuscatePayload$1.L$2 = null;
                    trackingEventUtilsKt$obfuscatePayload$1.L$3 = null;
                    trackingEventUtilsKt$obfuscatePayload$1.label = 2;
                    withContext = JobKt.withContext(defaultIoScheduler2, trackingEventUtilsKt$obfuscatePayload$rsaCipher$1, trackingEventUtilsKt$obfuscatePayload$1);
                    if (withContext != coroutineSingletons) {
                        str4 = encodeToString2;
                        obj = withContext;
                        bArr4 = bArr;
                        String encodeToString3 = Base64.encodeToString(((Cipher) obj).doFinal(bArr4), 2);
                        str4.getClass();
                        encodeToString3.getClass();
                        return new ObfuscationResult(str4, encodeToString3);
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            byte[] doFinal2 = ((Cipher) obj).doFinal(bArr2);
            byte[] bArr92 = new byte[doFinal2.length + bArr3.length];
            ArraysKt___ArraysJvmKt.copyInto$default(doFinal2, bArr92, 0, 0, 0, 12);
            ArraysKt___ArraysJvmKt.copyInto$default(bArr3, bArr92, doFinal2.length, 0, 0, 12);
            String encodeToString22 = Base64.encodeToString(bArr92, 2);
            PublicKey parsePublicKeyPem2 = parsePublicKeyPem(str3);
            DefaultScheduler defaultScheduler22 = Dispatchers.Default;
            DefaultIoScheduler defaultIoScheduler22 = DefaultIoScheduler.INSTANCE;
            TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1 trackingEventUtilsKt$obfuscatePayload$rsaCipher$12 = new TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1(parsePublicKeyPem2, null);
            trackingEventUtilsKt$obfuscatePayload$1.L$0 = bArr;
            trackingEventUtilsKt$obfuscatePayload$1.L$1 = encodeToString22;
            trackingEventUtilsKt$obfuscatePayload$1.L$2 = null;
            trackingEventUtilsKt$obfuscatePayload$1.L$3 = null;
            trackingEventUtilsKt$obfuscatePayload$1.label = 2;
            withContext = JobKt.withContext(defaultIoScheduler22, trackingEventUtilsKt$obfuscatePayload$rsaCipher$12, trackingEventUtilsKt$obfuscatePayload$1);
            if (withContext != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Exception e) {
            throw new TrackingEventsObfuscationException("Failed to encrypt payload", e);
        }
        trackingEventUtilsKt$obfuscatePayload$1 = new TrackingEventUtilsKt$obfuscatePayload$1(continuation);
        Object obj2 = trackingEventUtilsKt$obfuscatePayload$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventUtilsKt$obfuscatePayload$1.label;
    }

    private static final PublicKey parsePublicKeyPem(String str) {
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new Regex("\\s").replace(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str, "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), ""), 0)));
        generatePublic.getClass();
        return generatePublic;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object obfuscatePayload(String str, Continuation<? super String> continuation) {
        TrackingEventUtilsKt$obfuscatePayload$2 trackingEventUtilsKt$obfuscatePayload$2;
        int i;
        byte[] bArr;
        byte[] bArr2;
        try {
            if (continuation instanceof TrackingEventUtilsKt$obfuscatePayload$2) {
                trackingEventUtilsKt$obfuscatePayload$2 = (TrackingEventUtilsKt$obfuscatePayload$2) continuation;
                int i2 = trackingEventUtilsKt$obfuscatePayload$2.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventUtilsKt$obfuscatePayload$2.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventUtilsKt$obfuscatePayload$2.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventUtilsKt$obfuscatePayload$2.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Charset charset = StandardCharsets.UTF_8;
                        charset.getClass();
                        byte[] bytes = str.getBytes(charset);
                        bytes.getClass();
                        byte[] decode = Base64.decode(TEST_OBFUSCATION_KEY, 0);
                        decode.getClass();
                        if (decode.length != 0) {
                            SecretKeySpec secretKeySpec = new SecretKeySpec(decode, "AES");
                            byte[] bArr3 = new byte[12];
                            new SecureRandom().nextBytes(bArr3);
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                            TrackingEventUtilsKt$obfuscatePayload$cipher$1 trackingEventUtilsKt$obfuscatePayload$cipher$1 = new TrackingEventUtilsKt$obfuscatePayload$cipher$1(secretKeySpec, bArr3, null);
                            trackingEventUtilsKt$obfuscatePayload$2.L$0 = bytes;
                            trackingEventUtilsKt$obfuscatePayload$2.L$1 = bArr3;
                            trackingEventUtilsKt$obfuscatePayload$2.label = 1;
                            Object withContext = JobKt.withContext(defaultIoScheduler, trackingEventUtilsKt$obfuscatePayload$cipher$1, trackingEventUtilsKt$obfuscatePayload$2);
                            if (withContext == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            bArr = bArr3;
                            obj = withContext;
                            bArr2 = bytes;
                        } else {
                            throw new TrackingEventsObfuscationException("Invalid obfuscation key (empty after Base64 decode)", null, 2, null);
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        byte[] bArr4 = (byte[]) trackingEventUtilsKt$obfuscatePayload$2.L$1;
                        bArr2 = (byte[]) trackingEventUtilsKt$obfuscatePayload$2.L$0;
                        SafeTrace.throwOnFailure(obj);
                        bArr = bArr4;
                    }
                    byte[] doFinal = ((Cipher) obj).doFinal(bArr2);
                    byte[] bArr5 = new byte[doFinal.length + bArr.length];
                    ArraysKt___ArraysJvmKt.copyInto$default(doFinal, bArr5, 0, 0, 0, 12);
                    ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr5, doFinal.length, 0, 0, 12);
                    String encodeToString = Base64.encodeToString(bArr5, 2);
                    encodeToString.getClass();
                    return encodeToString;
                }
            }
            if (i != 0) {
            }
            byte[] doFinal2 = ((Cipher) obj).doFinal(bArr2);
            byte[] bArr52 = new byte[doFinal2.length + bArr.length];
            ArraysKt___ArraysJvmKt.copyInto$default(doFinal2, bArr52, 0, 0, 0, 12);
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr52, doFinal2.length, 0, 0, 12);
            String encodeToString2 = Base64.encodeToString(bArr52, 2);
            encodeToString2.getClass();
            return encodeToString2;
        } catch (Exception e) {
            throw new TrackingEventsObfuscationException("Failed to encrypt payload", e);
        }
        trackingEventUtilsKt$obfuscatePayload$2 = new TrackingEventUtilsKt$obfuscatePayload$2(continuation);
        Object obj2 = trackingEventUtilsKt$obfuscatePayload$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventUtilsKt$obfuscatePayload$2.label;
    }
}
