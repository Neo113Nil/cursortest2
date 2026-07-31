package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: SaveableStateHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberSaveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/saveable/SaveableStateHolder;", "runtime-saveable"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveableStateHolderKt {
    public static final SaveableStateHolder rememberSaveableStateHolder(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(15454635, i, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:57)");
        }
        composer.startReplaceGroup(1967008021);
        Object[] objArr = new Object[0];
        Saver saver = SaveableStateHolderImpl.INSTANCE.getSaver();
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    SaveableStateHolderImpl rememberSaveableStateHolder$lambda$1$lambda$0;
                    rememberSaveableStateHolder$lambda$1$lambda$0 = SaveableStateHolderKt.rememberSaveableStateHolder$lambda$1$lambda$0();
                    return rememberSaveableStateHolder$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.rememberSaveable(objArr, saver, (Function0) rememberedValue, composer, 384);
        saveableStateHolderImpl.setParentSaveableStateRegistry((SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry()));
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return saveableStateHolderImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaveableStateHolderImpl rememberSaveableStateHolder$lambda$1$lambda$0() {
        return new SaveableStateHolderImpl(null, 1, null);
    }
}
