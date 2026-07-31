package com.margelo.nitro.rnstartiosdk;

import com.facebook.jni.HybridData;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.views.HybridView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridRNStartIoNativeAdTouchAreaSpec.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0014R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdTouchAreaSpec;", "Lcom/margelo/nitro/views/HybridView;", "<init>", "()V", "value", "", "adIndex", "getAdIndex", "()D", "setAdIndex", "(D)V", "toString", "", "createCxxPart", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdTouchAreaSpec$CxxPart;", "CxxPart", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class HybridRNStartIoNativeAdTouchAreaSpec extends HybridView {
    protected static final String TAG = "HybridRNStartIoNativeAdTouchAreaSpec";

    public abstract double getAdIndex();

    public abstract void setAdIndex(double d);

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject RNStartIoNativeAdTouchArea]";
    }

    /* compiled from: HybridRNStartIoNativeAdTouchAreaSpec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdTouchAreaSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdTouchAreaSpec;", "<init>", "(Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdTouchAreaSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridRNStartIoNativeAdTouchAreaSpec javaPart) {
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
