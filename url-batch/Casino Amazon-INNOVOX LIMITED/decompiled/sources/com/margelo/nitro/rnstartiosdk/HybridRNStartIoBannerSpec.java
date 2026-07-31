package com.margelo.nitro.rnstartiosdk;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.ViewProps;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.views.HybridView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridRNStartIoBannerSpec.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 I2\u00020\u0001:\u0002HIB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010E\u001a\u00020\u000bH\u0016J\b\u0010F\u001a\u00020GH\u0014R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000b8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00188C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR7\u0010\u001e\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001fX¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u0004\u001a\u0004\u0018\u00010'8C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R(\u00100\u001a\u0004\u0018\u00010\u00182\b\u0010\u0004\u001a\u0004\u0018\u00010\u00188C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR \u00103\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017R(\u00106\u001a\u0004\u0018\u00010\u00182\b\u0010\u0004\u001a\u0004\u0018\u00010\u00188C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR \u00109\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R(\u0010<\u001a\u0004\u0018\u00010\u00182\b\u0010\u0004\u001a\u0004\u0018\u00010\u00188C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR \u0010?\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0015\"\u0004\bA\u0010\u0017R(\u0010B\u001a\u0004\u0018\u00010\u00182\b\u0010\u0004\u001a\u0004\u0018\u00010\u00188C@CX\u0082\u000e¢\u0006\f\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001d¨\u0006J"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoBannerSpec;", "Lcom/margelo/nitro/views/HybridView;", "<init>", "()V", "value", "Lcom/margelo/nitro/rnstartiosdk/BannerFormat;", "format", "getFormat", "()Lcom/margelo/nitro/rnstartiosdk/BannerFormat;", "setFormat", "(Lcom/margelo/nitro/rnstartiosdk/BannerFormat;)V", "", "adTag", "getAdTag", "()Ljava/lang/String;", "setAdTag", "(Ljava/lang/String;)V", "onDisappear", "Lkotlin/Function0;", "", "getOnDisappear", "()Lkotlin/jvm/functions/Function0;", "setOnDisappear", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/margelo/nitro/rnstartiosdk/Func_void;", "onDisappear_cxx", "getOnDisappear_cxx", "()Lcom/margelo/nitro/rnstartiosdk/Func_void;", "setOnDisappear_cxx", "(Lcom/margelo/nitro/rnstartiosdk/Func_void;)V", "onLoadError", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "message", "getOnLoadError", "()Lkotlin/jvm/functions/Function1;", "setOnLoadError", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/margelo/nitro/rnstartiosdk/Func_void_std__optional_std__string_;", "onLoadError_cxx", "getOnLoadError_cxx", "()Lcom/margelo/nitro/rnstartiosdk/Func_void_std__optional_std__string_;", "setOnLoadError_cxx", "(Lcom/margelo/nitro/rnstartiosdk/Func_void_std__optional_std__string_;)V", "onReceiveAd", "getOnReceiveAd", "setOnReceiveAd", "onReceiveAd_cxx", "getOnReceiveAd_cxx", "setOnReceiveAd_cxx", "onFailedToReceiveAd", "getOnFailedToReceiveAd", "setOnFailedToReceiveAd", "onFailedToReceiveAd_cxx", "getOnFailedToReceiveAd_cxx", "setOnFailedToReceiveAd_cxx", "onImpression", "getOnImpression", "setOnImpression", "onImpression_cxx", "getOnImpression_cxx", "setOnImpression_cxx", ViewProps.ON_CLICK, "getOnClick", "setOnClick", "onClick_cxx", "getOnClick_cxx", "setOnClick_cxx", "toString", "createCxxPart", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoBannerSpec$CxxPart;", "CxxPart", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class HybridRNStartIoBannerSpec extends HybridView {
    protected static final String TAG = "HybridRNStartIoBannerSpec";

    public abstract String getAdTag();

    public abstract BannerFormat getFormat();

    public abstract Function0<Unit> getOnClick();

    public abstract Function0<Unit> getOnDisappear();

    public abstract Function0<Unit> getOnFailedToReceiveAd();

    public abstract Function0<Unit> getOnImpression();

    public abstract Function1<String, Unit> getOnLoadError();

    public abstract Function0<Unit> getOnReceiveAd();

    public abstract void setAdTag(String str);

    public abstract void setFormat(BannerFormat bannerFormat);

    public abstract void setOnClick(Function0<Unit> function0);

    public abstract void setOnDisappear(Function0<Unit> function0);

    public abstract void setOnFailedToReceiveAd(Function0<Unit> function0);

    public abstract void setOnImpression(Function0<Unit> function0);

    public abstract void setOnLoadError(Function1<? super String, Unit> function1);

    public abstract void setOnReceiveAd(Function0<Unit> function0);

    private final Func_void getOnDisappear_cxx() {
        return new Func_void_java(getOnDisappear());
    }

    private final void setOnDisappear_cxx(Func_void func_void) {
        setOnDisappear(func_void);
    }

    private final Func_void_std__optional_std__string_ getOnLoadError_cxx() {
        Function1<String, Unit> onLoadError = getOnLoadError();
        return onLoadError != null ? new Func_void_std__optional_std__string__java(onLoadError) : null;
    }

    private final void setOnLoadError_cxx(Func_void_std__optional_std__string_ func_void_std__optional_std__string_) {
        if (func_void_std__optional_std__string_ == null) {
            func_void_std__optional_std__string_ = null;
        }
        setOnLoadError(func_void_std__optional_std__string_);
    }

    private final Func_void getOnReceiveAd_cxx() {
        Function0<Unit> onReceiveAd = getOnReceiveAd();
        return onReceiveAd != null ? new Func_void_java(onReceiveAd) : null;
    }

    private final void setOnReceiveAd_cxx(Func_void func_void) {
        if (func_void == null) {
            func_void = null;
        }
        setOnReceiveAd(func_void);
    }

    private final Func_void getOnFailedToReceiveAd_cxx() {
        Function0<Unit> onFailedToReceiveAd = getOnFailedToReceiveAd();
        return onFailedToReceiveAd != null ? new Func_void_java(onFailedToReceiveAd) : null;
    }

    private final void setOnFailedToReceiveAd_cxx(Func_void func_void) {
        if (func_void == null) {
            func_void = null;
        }
        setOnFailedToReceiveAd(func_void);
    }

    private final Func_void getOnImpression_cxx() {
        Function0<Unit> onImpression = getOnImpression();
        return onImpression != null ? new Func_void_java(onImpression) : null;
    }

    private final void setOnImpression_cxx(Func_void func_void) {
        if (func_void == null) {
            func_void = null;
        }
        setOnImpression(func_void);
    }

    private final Func_void getOnClick_cxx() {
        Function0<Unit> onClick = getOnClick();
        return onClick != null ? new Func_void_java(onClick) : null;
    }

    private final void setOnClick_cxx(Func_void func_void) {
        if (func_void == null) {
            func_void = null;
        }
        setOnClick(func_void);
    }

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject RNStartIoBanner]";
    }

    /* compiled from: HybridRNStartIoBannerSpec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoBannerSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoBannerSpec;", "<init>", "(Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoBannerSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridRNStartIoBannerSpec javaPart) {
            super(javaPart);
            Intrinsics.checkNotNullParameter(javaPart, "javaPart");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.margelo.nitro.core.HybridObject
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
