package com.margelo.nitro.rnstartiosdk;

import com.facebook.jni.HybridData;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.core.Promise;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridRNStartIoSdkSpec.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 (2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J-\u0010\u0014\u001a\u00020\u00052#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0016H&J\u0012\u0010\u001b\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u001cH\u0003J5\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00112\u0006\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\n2\b\u0010\"\u001a\u0004\u0018\u00010\nH'¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u000fH\u0016J\b\u0010%\u001a\u00020&H\u0014¨\u0006)"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoSdkSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "initializeSdk", "", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Lcom/margelo/nitro/rnstartiosdk/InitializeSdkParams;", "setUserConsent", "currentTimeMillis", "", "userConsent", "", "setIABUSPrivacyString", "iabusPrivacyString", "", "loadAd", "Lcom/margelo/nitro/core/Promise;", "adType", "Lcom/margelo/nitro/rnstartiosdk/AdType;", "showAd", "adResultCallback", "Lkotlin/Function1;", "Lcom/margelo/nitro/rnstartiosdk/AdResultType;", "Lkotlin/ParameterName;", "name", "adResult", "showAd_cxx", "Lcom/margelo/nitro/rnstartiosdk/Func_void_AdResultType;", "loadNativeAds", "", "Lcom/margelo/nitro/rnstartiosdk/NativeAdDetails;", "numberOfAds", "primaryImageSize", "secondaryImageSize", "(DLjava/lang/Double;Ljava/lang/Double;)Lcom/margelo/nitro/core/Promise;", "toString", "createCxxPart", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoSdkSpec$CxxPart;", "CxxPart", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class HybridRNStartIoSdkSpec extends HybridObject {
    protected static final String TAG = "HybridRNStartIoSdkSpec";

    public abstract void initializeSdk(InitializeSdkParams params);

    public abstract Promise<Unit> loadAd(AdType adType);

    public abstract Promise<NativeAdDetails[]> loadNativeAds(double numberOfAds, Double primaryImageSize, Double secondaryImageSize);

    public abstract void setIABUSPrivacyString(String iabusPrivacyString);

    public abstract void setUserConsent(double currentTimeMillis, boolean userConsent);

    public abstract void showAd(Function1<? super AdResultType, Unit> adResultCallback);

    private final void showAd_cxx(Func_void_AdResultType adResultCallback) {
        if (adResultCallback == null) {
            adResultCallback = null;
        }
        showAd(adResultCallback);
        Unit unit = Unit.INSTANCE;
    }

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject RNStartIoSdk]";
    }

    /* compiled from: HybridRNStartIoSdkSpec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoSdkSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoSdkSpec;", "<init>", "(Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoSdkSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridRNStartIoSdkSpec javaPart) {
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
