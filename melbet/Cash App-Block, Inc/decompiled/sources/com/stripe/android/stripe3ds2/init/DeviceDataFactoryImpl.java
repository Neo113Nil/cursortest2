package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.LocaleListCompat;
import androidx.media3.extractor.mkv.Sniffer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class DeviceDataFactoryImpl {
    public final int apiVersion;
    public final Sniffer appInfoRepository;
    public final AudioManager audioManager;
    public final String dateTime;
    public final String defaultUserAgent;
    public final DisplayMetrics displayMetrics;
    public final String osName;
    public final PackageManager packageManager;
    public final int secureFRPMode;
    public final TelephonyManager telephonyManager;
    public final int timeZone;

    public DeviceDataFactoryImpl(Context context, Sniffer sniffer, MessageVersionRegistry messageVersionRegistry) {
        String str;
        int i;
        context.getClass();
        this.appInfoRepository = sniffer;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        this.displayMetrics = displayMetrics;
        this.defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        this.telephonyManager = (TelephonyManager) systemService;
        int i2 = 0;
        this.secureFRPMode = Settings.Secure.getInt(context.getContentResolver(), "secure_frp_mode", 0);
        Object systemService2 = context.getSystemService("audio");
        systemService2.getClass();
        this.audioManager = (AudioManager) systemService2;
        this.packageManager = context.getPackageManager();
        this.apiVersion = Build.VERSION.SDK_INT;
        this.dateTime = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(Calendar.getInstance().getTime());
        Field[] fields = Build.VERSION_CODES.class.getFields();
        fields.getClass();
        int length = fields.length;
        while (true) {
            if (i2 >= length) {
                str = null;
                break;
            }
            Field field = fields[i2];
            str = field.getName();
            str.getClass();
            try {
                i = field.getInt(new Object());
            } catch (IllegalAccessException | IllegalArgumentException | NullPointerException unused) {
                i = -1;
            }
            if (i == Build.VERSION.SDK_INT) {
                break;
            } else {
                i2++;
            }
        }
        str = str == null ? "UNKNOWN" : str;
        String str2 = Build.VERSION.RELEASE;
        int i3 = this.apiVersion;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Android ", str, " ", str2, " API ");
        m.append(i3);
        this.osName = m.toString();
        this.timeZone = (TimeZone.getDefault().getRawOffset() / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) / 60;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable create(String str, SdkTransactionId sdkTransactionId, ContinuationImpl continuationImpl) {
        DeviceDataFactoryImpl$create$1 deviceDataFactoryImpl$create$1;
        int i;
        Pair[] pairArr;
        String str2;
        int i2;
        SdkTransactionId sdkTransactionId2;
        String str3;
        Pair[] pairArr2;
        int i3;
        if (continuationImpl instanceof DeviceDataFactoryImpl$create$1) {
            deviceDataFactoryImpl$create$1 = (DeviceDataFactoryImpl$create$1) continuationImpl;
            int i4 = deviceDataFactoryImpl$create$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                deviceDataFactoryImpl$create$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = deviceDataFactoryImpl$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceDataFactoryImpl$create$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair[] pairArr3 = new Pair[13];
                    DeviceParam deviceParam = DeviceParam.PARAM_PLATFORM;
                    pairArr3[0] = new Pair("C001", "Android");
                    pairArr3[1] = new Pair("C002", Recorder$$ExternalSyntheticOutline2.m(Build.MANUFACTURER, "||", Build.MODEL));
                    pairArr3[2] = new Pair("C003", this.osName);
                    pairArr3[3] = new Pair("C004", Build.VERSION.RELEASE);
                    pairArr3[4] = new Pair("C005", LocaleListCompat.create(Locale.getDefault()).toLanguageTags());
                    pairArr3[5] = new Pair("C006", String.valueOf(this.timeZone));
                    Locale locale = Locale.ROOT;
                    DisplayMetrics displayMetrics = this.displayMetrics;
                    pairArr3[6] = new Pair("C008", String.format(locale, "%sx%s", Arrays.copyOf(new Object[]{new Integer(displayMetrics.heightPixels), new Integer(displayMetrics.widthPixels)}, 2)));
                    deviceDataFactoryImpl$create$1.L$0 = str;
                    deviceDataFactoryImpl$create$1.L$1 = sdkTransactionId;
                    deviceDataFactoryImpl$create$1.L$2 = pairArr3;
                    deviceDataFactoryImpl$create$1.L$3 = pairArr3;
                    deviceDataFactoryImpl$create$1.L$4 = "C014";
                    deviceDataFactoryImpl$create$1.I$0 = 7;
                    deviceDataFactoryImpl$create$1.label = 1;
                    Object obj2 = this.appInfoRepository.get(deviceDataFactoryImpl$create$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pairArr = pairArr3;
                    obj = obj2;
                    str2 = str;
                    i2 = 7;
                    sdkTransactionId2 = sdkTransactionId;
                    str3 = "C014";
                    pairArr2 = pairArr;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = deviceDataFactoryImpl$create$1.I$0;
                    str3 = deviceDataFactoryImpl$create$1.L$4;
                    pairArr = deviceDataFactoryImpl$create$1.L$3;
                    pairArr2 = deviceDataFactoryImpl$create$1.L$2;
                    sdkTransactionId2 = deviceDataFactoryImpl$create$1.L$1;
                    str2 = deviceDataFactoryImpl$create$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                pairArr[i2] = new Pair(str3, ((AppInfo) obj).sdkAppId);
                DeviceParam deviceParam2 = DeviceParam.PARAM_PLATFORM;
                pairArr2[8] = new Pair("C015", "2.2.0");
                pairArr2[9] = new Pair("C016", str2);
                pairArr2[10] = new Pair("C017", this.dateTime);
                pairArr2[11] = new Pair("C018", sdkTransactionId2.value);
                pairArr2[12] = new Pair("A137", this.defaultUserAgent);
                HashMap hashMapOf = MapsKt__MapsKt.hashMapOf(pairArr2);
                i3 = this.apiVersion;
                TelephonyManager telephonyManager = this.telephonyManager;
                if (i3 >= 28) {
                    hashMapOf.put("A138", String.valueOf(telephonyManager.getSimCarrierId()));
                    hashMapOf.put("A139", String.valueOf(telephonyManager.getSimCarrierIdName()));
                }
                if (i3 >= 29) {
                    hashMapOf.put("A141", String.valueOf(telephonyManager.getSimSpecificCarrierId()));
                    hashMapOf.put("A142", String.valueOf(telephonyManager.getSimSpecificCarrierIdName()));
                    if (this.packageManager.hasSystemFeature("android.hardware.telephony.ims")) {
                        hashMapOf.put("A150", String.valueOf(telephonyManager.isRttSupported()));
                    }
                }
                if (i3 >= 30) {
                    hashMapOf.put("A145", String.valueOf(telephonyManager.getSubscriptionId()));
                    hashMapOf.put("A151", this.secureFRPMode == 1 ? "true" : "false");
                }
                if (i3 >= 31) {
                    hashMapOf.put("A153", Build.SKU);
                    hashMapOf.put("A154", Build.SOC_MANUFACTURER);
                    hashMapOf.put("A155", Build.SOC_MODEL);
                }
                if (i3 >= 33) {
                    hashMapOf.put("A152", String.valueOf(this.audioManager.isRampingRingerEnabled()));
                }
                return hashMapOf;
            }
        }
        deviceDataFactoryImpl$create$1 = new DeviceDataFactoryImpl$create$1(this, continuationImpl);
        Object obj3 = deviceDataFactoryImpl$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceDataFactoryImpl$create$1.label;
        if (i != 0) {
        }
        pairArr[i2] = new Pair(str3, ((AppInfo) obj3).sdkAppId);
        DeviceParam deviceParam22 = DeviceParam.PARAM_PLATFORM;
        pairArr2[8] = new Pair("C015", "2.2.0");
        pairArr2[9] = new Pair("C016", str2);
        pairArr2[10] = new Pair("C017", this.dateTime);
        pairArr2[11] = new Pair("C018", sdkTransactionId2.value);
        pairArr2[12] = new Pair("A137", this.defaultUserAgent);
        HashMap hashMapOf2 = MapsKt__MapsKt.hashMapOf(pairArr2);
        i3 = this.apiVersion;
        TelephonyManager telephonyManager2 = this.telephonyManager;
        if (i3 >= 28) {
        }
        if (i3 >= 29) {
        }
        if (i3 >= 30) {
        }
        if (i3 >= 31) {
        }
        if (i3 >= 33) {
        }
        return hashMapOf2;
    }
}
