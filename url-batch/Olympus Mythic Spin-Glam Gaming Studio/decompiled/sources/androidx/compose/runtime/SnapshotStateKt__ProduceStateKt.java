package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ProduceState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aa\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001ae\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\r\"\u0004\u0018\u00010\u00022(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "initialValue", "", "key1", "key2", "Lkotlin/Function2;", "Landroidx/compose/runtime/ProduceStateScope;", "Lkotlin/coroutines/Continuation;", "", "producer", "Landroidx/compose/runtime/State;", "produceState", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "keys", "(Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "runtime"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes14.dex */
final /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    public static final State produceState(Object obj, Object obj2, Object obj3, Function2 function2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703169085, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:138)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(function2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(function2, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(obj2, obj3, (Function2) rememberedValue2, composer, (i >> 3) & 126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final State produceState(Object obj, Object[] objArr, Function2 function2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(490154582, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:200)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean changedInstance = composer.changedInstance(function2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(function2, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(copyOf, (Function2) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
