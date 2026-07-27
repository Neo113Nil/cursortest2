package com.onesignal.otel.attributes;

import com.onesignal.otel.IOtelPlatformProvider;
import e5.g;
import f4.C0430g;
import g4.AbstractC0476u;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class OtelFieldsTopLevel {
    private final IOtelPlatformProvider platformProvider;

    public OtelFieldsTopLevel(IOtelPlatformProvider platformProvider) {
        i.e(platformProvider, "platformProvider");
        this.platformProvider = platformProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAttributes(InterfaceC1218d interfaceC1218d) {
        OtelFieldsTopLevel$getAttributes$1 otelFieldsTopLevel$getAttributes$1;
        int i2;
        C0430g[] c0430gArr;
        String str;
        OtelFieldsTopLevel otelFieldsTopLevel;
        int i3;
        C0430g[] c0430gArr2;
        if (interfaceC1218d instanceof OtelFieldsTopLevel$getAttributes$1) {
            otelFieldsTopLevel$getAttributes$1 = (OtelFieldsTopLevel$getAttributes$1) interfaceC1218d;
            int i6 = otelFieldsTopLevel$getAttributes$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                otelFieldsTopLevel$getAttributes$1.label = i6 - Integer.MIN_VALUE;
                Object obj = otelFieldsTopLevel$getAttributes$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = otelFieldsTopLevel$getAttributes$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    c0430gArr = new C0430g[10];
                    IOtelPlatformProvider iOtelPlatformProvider = this.platformProvider;
                    otelFieldsTopLevel$getAttributes$1.L$0 = this;
                    otelFieldsTopLevel$getAttributes$1.L$1 = c0430gArr;
                    otelFieldsTopLevel$getAttributes$1.L$2 = c0430gArr;
                    str = "ossdk.install_id";
                    otelFieldsTopLevel$getAttributes$1.L$3 = "ossdk.install_id";
                    otelFieldsTopLevel$getAttributes$1.I$0 = 0;
                    otelFieldsTopLevel$getAttributes$1.label = 1;
                    obj = iOtelPlatformProvider.getInstallId(otelFieldsTopLevel$getAttributes$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    otelFieldsTopLevel = this;
                    i3 = 0;
                    c0430gArr2 = c0430gArr;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = otelFieldsTopLevel$getAttributes$1.I$0;
                    str = (String) otelFieldsTopLevel$getAttributes$1.L$3;
                    c0430gArr = (C0430g[]) otelFieldsTopLevel$getAttributes$1.L$2;
                    c0430gArr2 = (C0430g[]) otelFieldsTopLevel$getAttributes$1.L$1;
                    otelFieldsTopLevel = (OtelFieldsTopLevel) otelFieldsTopLevel$getAttributes$1.L$0;
                    g.y(obj);
                }
                c0430gArr[i3] = new C0430g(str, obj);
                c0430gArr2[1] = new C0430g("ossdk.sdk_base", otelFieldsTopLevel.platformProvider.getSdkBase());
                c0430gArr2[2] = new C0430g("ossdk.sdk_base_version", otelFieldsTopLevel.platformProvider.getSdkBaseVersion());
                c0430gArr2[3] = new C0430g("ossdk.app_package_id", otelFieldsTopLevel.platformProvider.getAppPackageId());
                c0430gArr2[4] = new C0430g("ossdk.app_version", otelFieldsTopLevel.platformProvider.getAppVersion());
                c0430gArr2[5] = new C0430g("device.manufacturer", otelFieldsTopLevel.platformProvider.getDeviceManufacturer());
                c0430gArr2[6] = new C0430g("device.model.identifier", otelFieldsTopLevel.platformProvider.getDeviceModel());
                c0430gArr2[7] = new C0430g("os.name", otelFieldsTopLevel.platformProvider.getOsName());
                c0430gArr2[8] = new C0430g("os.version", otelFieldsTopLevel.platformProvider.getOsVersion());
                c0430gArr2[9] = new C0430g("os.build_id", otelFieldsTopLevel.platformProvider.getOsBuildId());
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0476u.W(c0430gArr2.length));
                AbstractC0476u.a0(linkedHashMap, c0430gArr2);
                OtelFieldsTopLevelKt.putIfValueNotNull(OtelFieldsTopLevelKt.putIfValueNotNull(linkedHashMap, "ossdk.sdk_wrapper", otelFieldsTopLevel.platformProvider.getSdkWrapper()), "ossdk.sdk_wrapper_version", otelFieldsTopLevel.platformProvider.getSdkWrapperVersion());
                Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                i.d(unmodifiableMap, "unmodifiableMap(...)");
                return unmodifiableMap;
            }
        }
        otelFieldsTopLevel$getAttributes$1 = new OtelFieldsTopLevel$getAttributes$1(this, interfaceC1218d);
        Object obj2 = otelFieldsTopLevel$getAttributes$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = otelFieldsTopLevel$getAttributes$1.label;
        if (i2 != 0) {
        }
        c0430gArr[i3] = new C0430g(str, obj2);
        c0430gArr2[1] = new C0430g("ossdk.sdk_base", otelFieldsTopLevel.platformProvider.getSdkBase());
        c0430gArr2[2] = new C0430g("ossdk.sdk_base_version", otelFieldsTopLevel.platformProvider.getSdkBaseVersion());
        c0430gArr2[3] = new C0430g("ossdk.app_package_id", otelFieldsTopLevel.platformProvider.getAppPackageId());
        c0430gArr2[4] = new C0430g("ossdk.app_version", otelFieldsTopLevel.platformProvider.getAppVersion());
        c0430gArr2[5] = new C0430g("device.manufacturer", otelFieldsTopLevel.platformProvider.getDeviceManufacturer());
        c0430gArr2[6] = new C0430g("device.model.identifier", otelFieldsTopLevel.platformProvider.getDeviceModel());
        c0430gArr2[7] = new C0430g("os.name", otelFieldsTopLevel.platformProvider.getOsName());
        c0430gArr2[8] = new C0430g("os.version", otelFieldsTopLevel.platformProvider.getOsVersion());
        c0430gArr2[9] = new C0430g("os.build_id", otelFieldsTopLevel.platformProvider.getOsBuildId());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC0476u.W(c0430gArr2.length));
        AbstractC0476u.a0(linkedHashMap2, c0430gArr2);
        OtelFieldsTopLevelKt.putIfValueNotNull(OtelFieldsTopLevelKt.putIfValueNotNull(linkedHashMap2, "ossdk.sdk_wrapper", otelFieldsTopLevel.platformProvider.getSdkWrapper()), "ossdk.sdk_wrapper_version", otelFieldsTopLevel.platformProvider.getSdkWrapperVersion());
        Map unmodifiableMap2 = Collections.unmodifiableMap(linkedHashMap2);
        i.d(unmodifiableMap2, "unmodifiableMap(...)");
        return unmodifiableMap2;
    }
}
