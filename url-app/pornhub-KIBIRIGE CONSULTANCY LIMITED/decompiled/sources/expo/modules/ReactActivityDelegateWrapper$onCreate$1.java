package expo.modules;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactDelegate;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactRootView;
import expo.modules.core.interfaces.ReactActivityHandler;
import expo.modules.rncompatibility.ReactNativeFeatureFlags;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReactActivityDelegateWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.ReactActivityDelegateWrapper$onCreate$1", f = "ReactActivityDelegateWrapper.kt", i = {}, l = {152, 191}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ReactActivityDelegateWrapper$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReactActivityDelegateWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactActivityDelegateWrapper$onCreate$1(ReactActivityDelegateWrapper reactActivityDelegateWrapper, Continuation<? super ReactActivityDelegateWrapper$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = reactActivityDelegateWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactActivityDelegateWrapper$onCreate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReactActivityDelegateWrapper$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(1:(1:(3:5|6|7)(2:9|10))(1:11))(1:60)|12|(1:16)|17|18|19|(1:21)|22|23|(1:25)|26|(1:28)|29|(1:31)(1:56)|(8:33|34|35|(1:37)(1:44)|38|39|(1:41)|42)|47|(1:49)(1:55)|50|(1:52)|6|7) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e8, code lost:
    
        if (r14 == r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ea, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b1, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r14 = kotlin.Result.m788constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0033, code lost:
    
        if (r14 == r2) goto L58;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler;
        Object awaitDelayLoadAppWhenReady;
        CompletableDeferred completableDeferred;
        ReactDelegate reactDelegate;
        Object loadAppImpl;
        Object m788constructorimpl;
        ReactActivity reactActivity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ReactActivityDelegateWrapper reactActivityDelegateWrapper = this.this$0;
            delayLoadAppHandler = reactActivityDelegateWrapper.getDelayLoadAppHandler();
            this.label = 1;
            awaitDelayLoadAppWhenReady = reactActivityDelegateWrapper.awaitDelayLoadAppWhenReady(delayLoadAppHandler, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        completableDeferred = this.this$0.loadAppReady;
        completableDeferred.complete(Unit.INSTANCE);
        if (Build.VERSION.SDK_INT >= 26 && this.this$0.isWideColorGamutEnabled()) {
            reactActivity = this.this$0.activity;
            reactActivity.getWindow().setColorMode(1);
        }
        Pair[] pairArr = new Pair[0];
        Object obj2 = null;
        Result.Companion companion = Result.INSTANCE;
        Class<?> cls = Class.forName("com.facebook.react.views.view.WindowUtilKt");
        Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
        Object[] array = new ArrayList(0).toArray(new Object[0]);
        Method declaredMethod = cls.getDeclaredMethod("isEdgeToEdgeFeatureFlagOn", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        declaredMethod.setAccessible(true);
        Object invoke = declaredMethod.invoke(null, Arrays.copyOf(array, array.length));
        if (!(invoke instanceof Boolean)) {
            invoke = null;
        }
        Object m788constructorimpl2 = Result.m788constructorimpl((Boolean) invoke);
        Throwable m791exceptionOrNullimpl = Result.m791exceptionOrNullimpl(m788constructorimpl2);
        if (m791exceptionOrNullimpl != null) {
            Log.e(ReactActivityDelegateWrapper.TAG, "Failed to invoke 'isEdgeToEdgeFeatureFlagOn' on com.facebook.react.views.view.WindowUtilKt", m791exceptionOrNullimpl);
        }
        if (Result.m794isFailureimpl(m788constructorimpl2)) {
            m788constructorimpl2 = null;
        }
        Boolean bool = (Boolean) m788constructorimpl2;
        if (bool != null ? bool.booleanValue() : true) {
            Pair[] pairArr2 = {new Pair(Window.class, this.this$0.getPlainActivity().getWindow())};
            try {
                Result.Companion companion2 = Result.INSTANCE;
                Class<?> cls2 = Class.forName("com.facebook.react.views.view.WindowUtilKt");
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((Class) pairArr2[0].getFirst());
                Class[] clsArr2 = (Class[]) arrayList.toArray(new Class[0]);
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(pairArr2[0].getSecond());
                Object[] array2 = arrayList2.toArray(new Object[0]);
                Method declaredMethod2 = cls2.getDeclaredMethod("enableEdgeToEdge", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                declaredMethod2.setAccessible(true);
                Object invoke2 = declaredMethod2.invoke(null, Arrays.copyOf(array2, array2.length));
                if (invoke2 instanceof Unit) {
                    obj2 = invoke2;
                }
                m788constructorimpl = Result.m788constructorimpl((Unit) obj2);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                m788constructorimpl = Result.m788constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m791exceptionOrNullimpl2 = Result.m791exceptionOrNullimpl(m788constructorimpl);
            if (m791exceptionOrNullimpl2 != null) {
                Log.e(ReactActivityDelegateWrapper.TAG, "Failed to invoke 'enableEdgeToEdge' on com.facebook.react.views.view.WindowUtilKt", m791exceptionOrNullimpl2);
            }
            Result.m794isFailureimpl(m788constructorimpl);
        }
        Bundle composeLaunchOptions = this.this$0.composeLaunchOptions();
        if (ReactNativeFeatureFlags.INSTANCE.getEnableBridgelessArchitecture()) {
            reactDelegate = new ReactDelegate(this.this$0.getPlainActivity(), this.this$0.getReactHost(), this.this$0.getMainComponentName(), composeLaunchOptions);
        } else {
            Activity plainActivity = this.this$0.getPlainActivity();
            ReactNativeHost reactNativeHost = this.this$0.getReactNativeHost();
            String mainComponentName = this.this$0.getMainComponentName();
            boolean fabricEnabled = this.this$0.getFabricEnabled();
            final ReactActivityDelegateWrapper reactActivityDelegateWrapper2 = this.this$0;
            reactDelegate = new ReactDelegate(composeLaunchOptions, plainActivity, reactNativeHost, mainComponentName, fabricEnabled) { // from class: expo.modules.ReactActivityDelegateWrapper$onCreate$1.1
                @Override // com.facebook.react.ReactDelegate
                protected ReactRootView createRootView() {
                    ReactRootView createRootView = reactActivityDelegateWrapper2.createRootView();
                    return createRootView == null ? super.createRootView() : createRootView;
                }
            };
        }
        Field declaredField = ReactActivityDelegate.class.getDeclaredField("mReactDelegate");
        declaredField.setAccessible(true);
        declaredField.set(this.this$0.getDelegate(), reactDelegate);
        if (this.this$0.getMainComponentName() != null) {
            ReactActivityDelegateWrapper reactActivityDelegateWrapper3 = this.this$0;
            this.label = 2;
            loadAppImpl = reactActivityDelegateWrapper3.loadAppImpl(reactActivityDelegateWrapper3.getMainComponentName(), false, this);
        }
        return Unit.INSTANCE;
    }
}
