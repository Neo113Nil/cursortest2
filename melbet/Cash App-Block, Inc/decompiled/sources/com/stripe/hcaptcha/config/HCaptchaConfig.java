package com.stripe.hcaptcha.config;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Serializable
/* loaded from: classes8.dex */
public final class HCaptchaConfig implements java.io.Serializable {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String assethost;
    public final String customTheme;
    public final boolean disableHardwareAcceleration;
    public final String endpoint;
    public final boolean hideDialog;
    public final String host;
    public final String imghost;
    public final String jsSrc;
    public final boolean loading;
    public final String locale;
    public final HCaptchaOrientation orientation;
    public final String reportapi;
    public final Function2 retryPredicate;
    public final String rqdata;
    public final boolean sentry;
    public final String siteKey;
    public final HCaptchaSize size;
    public final HCaptchaTheme theme;
    public final long tokenExpiration;

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/hcaptcha/config/HCaptchaConfig$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "serialVersionUID", "J", "hcaptcha_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return HCaptchaConfig$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(27)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(28)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(29)), null, null, null, null};
    }

    public /* synthetic */ HCaptchaConfig(int i, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, Duration duration, boolean z4) {
        long j;
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, HCaptchaConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.siteKey = str;
        if ((i & 2) == 0) {
            this.sentry = true;
        } else {
            this.sentry = z;
        }
        if ((i & 4) == 0) {
            this.loading = true;
        } else {
            this.loading = z2;
        }
        if ((i & 8) == 0) {
            this.hideDialog = false;
        } else {
            this.hideDialog = z3;
        }
        if ((i & 16) == 0) {
            this.rqdata = null;
        } else {
            this.rqdata = str2;
        }
        if ((i & 32) == 0) {
            this.jsSrc = "https://js.hcaptcha.com/1/api.js";
        } else {
            this.jsSrc = str3;
        }
        if ((i & 64) == 0) {
            this.endpoint = null;
        } else {
            this.endpoint = str4;
        }
        if ((i & 128) == 0) {
            this.reportapi = null;
        } else {
            this.reportapi = str5;
        }
        if ((i & 256) == 0) {
            this.assethost = null;
        } else {
            this.assethost = str6;
        }
        if ((i & 512) == 0) {
            this.imghost = null;
        } else {
            this.imghost = str7;
        }
        if ((i & 1024) == 0) {
            String language = Locale.getDefault().getLanguage();
            language.getClass();
            this.locale = language;
        } else {
            this.locale = str8;
        }
        this.size = (i & 2048) == 0 ? HCaptchaSize.INVISIBLE : hCaptchaSize;
        this.orientation = (i & 4096) == 0 ? HCaptchaOrientation.PORTRAIT : hCaptchaOrientation;
        this.theme = (i & PKIFailureInfo.certRevoked) == 0 ? HCaptchaTheme.LIGHT : hCaptchaTheme;
        if ((i & 16384) == 0) {
            this.host = null;
        } else {
            this.host = str9;
        }
        if ((32768 & i) == 0) {
            this.customTheme = null;
        } else {
            this.customTheme = str10;
        }
        this.retryPredicate = null;
        if ((65536 & i) == 0) {
            Duration.Companion companion = Duration.Companion;
            j = DurationKt.toDuration(120, DurationUnit.SECONDS);
        } else {
            j = duration.rawValue;
        }
        this.tokenExpiration = j;
        if ((i & PKIFailureInfo.unsupportedVersion) == 0) {
            this.disableHardwareAcceleration = true;
        } else {
            this.disableHardwareAcceleration = z4;
        }
    }

    /* renamed from: copy-ZIzw2bI$default, reason: not valid java name */
    public static HCaptchaConfig m4082copyZIzw2bI$default(HCaptchaConfig hCaptchaConfig) {
        HCaptchaSize hCaptchaSize = HCaptchaSize.INVISIBLE;
        String str = hCaptchaConfig.siteKey;
        boolean z = hCaptchaConfig.sentry;
        boolean z2 = hCaptchaConfig.hideDialog;
        String str2 = hCaptchaConfig.rqdata;
        String str3 = hCaptchaConfig.jsSrc;
        String str4 = hCaptchaConfig.endpoint;
        String str5 = hCaptchaConfig.reportapi;
        String str6 = hCaptchaConfig.assethost;
        String str7 = hCaptchaConfig.imghost;
        String str8 = hCaptchaConfig.locale;
        HCaptchaOrientation hCaptchaOrientation = hCaptchaConfig.orientation;
        HCaptchaTheme hCaptchaTheme = hCaptchaConfig.theme;
        String str9 = hCaptchaConfig.host;
        String str10 = hCaptchaConfig.customTheme;
        Function2 function2 = hCaptchaConfig.retryPredicate;
        long j = hCaptchaConfig.tokenExpiration;
        boolean z3 = hCaptchaConfig.disableHardwareAcceleration;
        str.getClass();
        str3.getClass();
        str8.getClass();
        hCaptchaOrientation.getClass();
        hCaptchaTheme.getClass();
        return new HCaptchaConfig(str, z, false, z2, str2, str3, str4, str5, str6, str7, str8, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, str9, str10, function2, j, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HCaptchaConfig)) {
            return false;
        }
        HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) obj;
        return Intrinsics.areEqual(this.siteKey, hCaptchaConfig.siteKey) && this.sentry == hCaptchaConfig.sentry && this.loading == hCaptchaConfig.loading && this.hideDialog == hCaptchaConfig.hideDialog && Intrinsics.areEqual(this.rqdata, hCaptchaConfig.rqdata) && Intrinsics.areEqual(this.jsSrc, hCaptchaConfig.jsSrc) && Intrinsics.areEqual(this.endpoint, hCaptchaConfig.endpoint) && Intrinsics.areEqual(this.reportapi, hCaptchaConfig.reportapi) && Intrinsics.areEqual(this.assethost, hCaptchaConfig.assethost) && Intrinsics.areEqual(this.imghost, hCaptchaConfig.imghost) && Intrinsics.areEqual(this.locale, hCaptchaConfig.locale) && this.size == hCaptchaConfig.size && this.orientation == hCaptchaConfig.orientation && this.theme == hCaptchaConfig.theme && Intrinsics.areEqual(this.host, hCaptchaConfig.host) && Intrinsics.areEqual(this.customTheme, hCaptchaConfig.customTheme) && Intrinsics.areEqual(this.retryPredicate, hCaptchaConfig.retryPredicate) && Duration.m4166equalsimpl0(this.tokenExpiration, hCaptchaConfig.tokenExpiration) && this.disableHardwareAcceleration == hCaptchaConfig.disableHardwareAcceleration;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.siteKey.hashCode() * 31, 31, this.sentry), 31, this.loading), 31, this.hideDialog);
        String str = this.rqdata;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.jsSrc);
        String str2 = this.endpoint;
        int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reportapi;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.assethost;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imghost;
        int hashCode4 = (this.theme.hashCode() + ((this.orientation.hashCode() + ((this.size.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.locale)) * 31)) * 31)) * 31;
        String str6 = this.host;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.customTheme;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Function2 function2 = this.retryPredicate;
        int hashCode7 = function2 != null ? function2.hashCode() : 0;
        Duration.Companion companion = Duration.Companion;
        return Boolean.hashCode(this.disableHardwareAcceleration) + Recorder$$ExternalSyntheticOutline2.m((hashCode6 + hashCode7) * 31, 31, this.tokenExpiration);
    }

    public final String toString() {
        String m4177toStringimpl = Duration.m4177toStringimpl(this.tokenExpiration);
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("HCaptchaConfig(siteKey=", this.siteKey, ", sentry=", ", loading=", this.sentry);
        re$$ExternalSyntheticOutline0.m(m1540m, this.loading, ", hideDialog=", this.hideDialog, ", rqdata=");
        Boxes$$ExternalSyntheticOutline1.m(m1540m, this.rqdata, ", jsSrc=", this.jsSrc, ", endpoint=");
        Boxes$$ExternalSyntheticOutline1.m(m1540m, this.endpoint, ", reportapi=", this.reportapi, ", assethost=");
        Boxes$$ExternalSyntheticOutline1.m(m1540m, this.assethost, ", imghost=", this.imghost, ", locale=");
        m1540m.append(this.locale);
        m1540m.append(", size=");
        m1540m.append(this.size);
        m1540m.append(", orientation=");
        m1540m.append(this.orientation);
        m1540m.append(", theme=");
        m1540m.append(this.theme);
        m1540m.append(", host=");
        Boxes$$ExternalSyntheticOutline1.m(m1540m, this.host, ", customTheme=", this.customTheme, ", retryPredicate=");
        m1540m.append(this.retryPredicate);
        m1540m.append(", tokenExpiration=");
        m1540m.append(m4177toStringimpl);
        m1540m.append(", disableHardwareAcceleration=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m1540m, this.disableHardwareAcceleration, ")");
    }

    public HCaptchaConfig(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, Function2 function2, long j, boolean z4) {
        str.getClass();
        hCaptchaSize.getClass();
        hCaptchaOrientation.getClass();
        hCaptchaTheme.getClass();
        this.siteKey = str;
        this.sentry = z;
        this.loading = z2;
        this.hideDialog = z3;
        this.rqdata = str2;
        this.jsSrc = str3;
        this.endpoint = str4;
        this.reportapi = str5;
        this.assethost = str6;
        this.imghost = str7;
        this.locale = str8;
        this.size = hCaptchaSize;
        this.orientation = hCaptchaOrientation;
        this.theme = hCaptchaTheme;
        this.host = str9;
        this.customTheme = str10;
        this.retryPredicate = function2;
        this.tokenExpiration = j;
        this.disableHardwareAcceleration = z4;
    }
}
