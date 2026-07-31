package com.onesignal.otel.attributes;

import com.onesignal.otel.IOtelPlatformProvider;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelFieldsTopLevel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onesignal/otel/attributes/OtelFieldsTopLevel;", "", "platformProvider", "Lcom/onesignal/otel/IOtelPlatformProvider;", "(Lcom/onesignal/otel/IOtelPlatformProvider;)V", "getAttributes", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelFieldsTopLevel {
    private final IOtelPlatformProvider platformProvider;

    public OtelFieldsTopLevel(IOtelPlatformProvider platformProvider) {
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        this.platformProvider = platformProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAttributes(Continuation<? super Map<String, String>> continuation) {
        OtelFieldsTopLevel$getAttributes$1 otelFieldsTopLevel$getAttributes$1;
        int i;
        Pair[] pairArr;
        String str;
        OtelFieldsTopLevel otelFieldsTopLevel;
        int i2;
        Pair[] pairArr2;
        if (continuation instanceof OtelFieldsTopLevel$getAttributes$1) {
            otelFieldsTopLevel$getAttributes$1 = (OtelFieldsTopLevel$getAttributes$1) continuation;
            if ((otelFieldsTopLevel$getAttributes$1.label & Integer.MIN_VALUE) != 0) {
                otelFieldsTopLevel$getAttributes$1.label -= Integer.MIN_VALUE;
                Object obj = otelFieldsTopLevel$getAttributes$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = otelFieldsTopLevel$getAttributes$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    pairArr = new Pair[10];
                    IOtelPlatformProvider iOtelPlatformProvider = this.platformProvider;
                    otelFieldsTopLevel$getAttributes$1.L$0 = this;
                    otelFieldsTopLevel$getAttributes$1.L$1 = pairArr;
                    otelFieldsTopLevel$getAttributes$1.L$2 = pairArr;
                    str = "ossdk.install_id";
                    otelFieldsTopLevel$getAttributes$1.L$3 = "ossdk.install_id";
                    otelFieldsTopLevel$getAttributes$1.I$0 = 0;
                    otelFieldsTopLevel$getAttributes$1.label = 1;
                    obj = iOtelPlatformProvider.getInstallId(otelFieldsTopLevel$getAttributes$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    otelFieldsTopLevel = this;
                    i2 = 0;
                    pairArr2 = pairArr;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = otelFieldsTopLevel$getAttributes$1.I$0;
                    str = (String) otelFieldsTopLevel$getAttributes$1.L$3;
                    pairArr = (Pair[]) otelFieldsTopLevel$getAttributes$1.L$2;
                    pairArr2 = (Pair[]) otelFieldsTopLevel$getAttributes$1.L$1;
                    otelFieldsTopLevel = (OtelFieldsTopLevel) otelFieldsTopLevel$getAttributes$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                pairArr[i2] = TuplesKt.to(str, obj);
                pairArr2[1] = TuplesKt.to("ossdk.sdk_base", otelFieldsTopLevel.platformProvider.getSdkBase());
                pairArr2[2] = TuplesKt.to("ossdk.sdk_base_version", otelFieldsTopLevel.platformProvider.getSdkBaseVersion());
                pairArr2[3] = TuplesKt.to("ossdk.app_package_id", otelFieldsTopLevel.platformProvider.getAppPackageId());
                pairArr2[4] = TuplesKt.to("ossdk.app_version", otelFieldsTopLevel.platformProvider.getAppVersion());
                pairArr2[5] = TuplesKt.to("device.manufacturer", otelFieldsTopLevel.platformProvider.getDeviceManufacturer());
                pairArr2[6] = TuplesKt.to("device.model.identifier", otelFieldsTopLevel.platformProvider.getDeviceModel());
                pairArr2[7] = TuplesKt.to("os.name", otelFieldsTopLevel.platformProvider.getOsName());
                pairArr2[8] = TuplesKt.to("os.version", otelFieldsTopLevel.platformProvider.getOsVersion());
                pairArr2[9] = TuplesKt.to("os.build_id", otelFieldsTopLevel.platformProvider.getOsBuildId());
                Map mutableMapOf = MapsKt.mutableMapOf(pairArr2);
                OtelFieldsTopLevelKt.putIfValueNotNull(OtelFieldsTopLevelKt.putIfValueNotNull(mutableMapOf, "ossdk.sdk_wrapper", otelFieldsTopLevel.platformProvider.getSdkWrapper()), "ossdk.sdk_wrapper_version", otelFieldsTopLevel.platformProvider.getSdkWrapperVersion());
                Map unmodifiableMap = Collections.unmodifiableMap(mutableMapOf);
                Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
                return unmodifiableMap;
            }
        }
        otelFieldsTopLevel$getAttributes$1 = new OtelFieldsTopLevel$getAttributes$1(this, continuation);
        Object obj2 = otelFieldsTopLevel$getAttributes$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = otelFieldsTopLevel$getAttributes$1.label;
        if (i != 0) {
        }
        pairArr[i2] = TuplesKt.to(str, obj2);
        pairArr2[1] = TuplesKt.to("ossdk.sdk_base", otelFieldsTopLevel.platformProvider.getSdkBase());
        pairArr2[2] = TuplesKt.to("ossdk.sdk_base_version", otelFieldsTopLevel.platformProvider.getSdkBaseVersion());
        pairArr2[3] = TuplesKt.to("ossdk.app_package_id", otelFieldsTopLevel.platformProvider.getAppPackageId());
        pairArr2[4] = TuplesKt.to("ossdk.app_version", otelFieldsTopLevel.platformProvider.getAppVersion());
        pairArr2[5] = TuplesKt.to("device.manufacturer", otelFieldsTopLevel.platformProvider.getDeviceManufacturer());
        pairArr2[6] = TuplesKt.to("device.model.identifier", otelFieldsTopLevel.platformProvider.getDeviceModel());
        pairArr2[7] = TuplesKt.to("os.name", otelFieldsTopLevel.platformProvider.getOsName());
        pairArr2[8] = TuplesKt.to("os.version", otelFieldsTopLevel.platformProvider.getOsVersion());
        pairArr2[9] = TuplesKt.to("os.build_id", otelFieldsTopLevel.platformProvider.getOsBuildId());
        Map mutableMapOf2 = MapsKt.mutableMapOf(pairArr2);
        OtelFieldsTopLevelKt.putIfValueNotNull(OtelFieldsTopLevelKt.putIfValueNotNull(mutableMapOf2, "ossdk.sdk_wrapper", otelFieldsTopLevel.platformProvider.getSdkWrapper()), "ossdk.sdk_wrapper_version", otelFieldsTopLevel.platformProvider.getSdkWrapperVersion());
        Map unmodifiableMap2 = Collections.unmodifiableMap(mutableMapOf2);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap2, "unmodifiableMap(...)");
        return unmodifiableMap2;
    }
}
