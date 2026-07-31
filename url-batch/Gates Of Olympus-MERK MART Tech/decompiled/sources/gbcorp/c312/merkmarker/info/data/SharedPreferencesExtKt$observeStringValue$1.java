package gbcorp.c312.merkmarker.info.data;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: SharedPreferencesExt.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000f\u0012\u000b\u0012\t\u0018\u00010\u0003¢\u0006\u0002\b\u00040\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lkotlin/jvm/internal/EnhancedNullability;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "gbcorp.c312.merkmarker.info.data.SharedPreferencesExtKt$observeStringValue$1", f = "SharedPreferencesExt.kt", i = {0, 0}, l = {18}, m = "invokeSuspend", n = {"$this$callbackFlow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, nl = {21}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes4.dex */
final class SharedPreferencesExtKt$observeStringValue$1 extends SuspendLambda implements Function2<ProducerScope<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $default;
    final /* synthetic */ String $key;
    final /* synthetic */ SharedPreferences $this_observeStringValue;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedPreferencesExtKt$observeStringValue$1(SharedPreferences sharedPreferences, String str, String str2, Continuation<? super SharedPreferencesExtKt$observeStringValue$1> continuation) {
        super(2, continuation);
        this.$this_observeStringValue = sharedPreferences;
        this.$key = str;
        this.$default = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SharedPreferencesExtKt$observeStringValue$1 sharedPreferencesExtKt$observeStringValue$1 = new SharedPreferencesExtKt$observeStringValue$1(this.$this_observeStringValue, this.$key, this.$default, continuation);
        sharedPreferencesExtKt$observeStringValue$1.L$0 = obj;
        return sharedPreferencesExtKt$observeStringValue$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super String> producerScope, Continuation<? super Unit> continuation) {
        return ((SharedPreferencesExtKt$observeStringValue$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final ProducerScope producerScope = (ProducerScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final String str = this.$key;
            final SharedPreferences sharedPreferences = this.$this_observeStringValue;
            final String str2 = this.$default;
            final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: gbcorp.c312.merkmarker.info.data.SharedPreferencesExtKt$observeStringValue$1$$ExternalSyntheticLambda0
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str3) {
                    SharedPreferencesExtKt$observeStringValue$1.invokeSuspend$lambda$0(str, producerScope, sharedPreferences, str2, sharedPreferences2, str3);
                }
            };
            this.$this_observeStringValue.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            producerScope.mo11095trySendJP2dKIU(this.$this_observeStringValue.getString(this.$key, this.$default));
            final SharedPreferences sharedPreferences2 = this.$this_observeStringValue;
            this.L$0 = SpillingKt.nullOutSpilledVariable(producerScope);
            this.L$1 = SpillingKt.nullOutSpilledVariable(onSharedPreferenceChangeListener);
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: gbcorp.c312.merkmarker.info.data.SharedPreferencesExtKt$observeStringValue$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$1;
                    invokeSuspend$lambda$1 = SharedPreferencesExtKt$observeStringValue$1.invokeSuspend$lambda$1(sharedPreferences2, onSharedPreferenceChangeListener);
                    return invokeSuspend$lambda$1;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(String str, ProducerScope producerScope, SharedPreferences sharedPreferences, String str2, SharedPreferences sharedPreferences2, String str3) {
        if (Intrinsics.areEqual(str3, str)) {
            producerScope.mo11095trySendJP2dKIU(sharedPreferences.getString(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return Unit.INSTANCE;
    }
}
