package com.margelo.nitro.rnstartiosdk;

import com.facebook.jni.HybridData;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.views.HybridView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridRNStartIoNativeAdSpec.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 %2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020#H\u0014R3\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R5\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001b8C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdSpec;", "Lcom/margelo/nitro/views/HybridView;", "<init>", "()V", "onLoadAd", "Lkotlin/Function1;", "Lcom/margelo/nitro/rnstartiosdk/NativeAdDetails;", "Lkotlin/ParameterName;", "name", "adData", "", "getOnLoadAd", "()Lkotlin/jvm/functions/Function1;", "setOnLoadAd", "(Lkotlin/jvm/functions/Function1;)V", "value", "Lcom/margelo/nitro/rnstartiosdk/Func_void_NativeAdDetails;", "onLoadAd_cxx", "getOnLoadAd_cxx", "()Lcom/margelo/nitro/rnstartiosdk/Func_void_NativeAdDetails;", "setOnLoadAd_cxx", "(Lcom/margelo/nitro/rnstartiosdk/Func_void_NativeAdDetails;)V", "onLoadError", "", "message", "getOnLoadError", "setOnLoadError", "Lcom/margelo/nitro/rnstartiosdk/Func_void_std__string;", "onLoadError_cxx", "getOnLoadError_cxx", "()Lcom/margelo/nitro/rnstartiosdk/Func_void_std__string;", "setOnLoadError_cxx", "(Lcom/margelo/nitro/rnstartiosdk/Func_void_std__string;)V", "toString", "createCxxPart", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdSpec$CxxPart;", "CxxPart", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class HybridRNStartIoNativeAdSpec extends HybridView {
    protected static final String TAG = "HybridRNStartIoNativeAdSpec";

    public abstract Function1<NativeAdDetails, Unit> getOnLoadAd();

    public abstract Function1<String, Unit> getOnLoadError();

    public abstract void setOnLoadAd(Function1<? super NativeAdDetails, Unit> function1);

    public abstract void setOnLoadError(Function1<? super String, Unit> function1);

    private final Func_void_NativeAdDetails getOnLoadAd_cxx() {
        return new Func_void_NativeAdDetails_java(getOnLoadAd());
    }

    private final void setOnLoadAd_cxx(Func_void_NativeAdDetails func_void_NativeAdDetails) {
        setOnLoadAd(func_void_NativeAdDetails);
    }

    private final Func_void_std__string getOnLoadError_cxx() {
        Function1<String, Unit> onLoadError = getOnLoadError();
        return onLoadError != null ? new Func_void_std__string_java(onLoadError) : null;
    }

    private final void setOnLoadError_cxx(Func_void_std__string func_void_std__string) {
        if (func_void_std__string == null) {
            func_void_std__string = null;
        }
        setOnLoadError(func_void_std__string);
    }

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject RNStartIoNativeAd]";
    }

    /* compiled from: HybridRNStartIoNativeAdSpec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdSpec;", "<init>", "(Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridRNStartIoNativeAdSpec javaPart) {
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
