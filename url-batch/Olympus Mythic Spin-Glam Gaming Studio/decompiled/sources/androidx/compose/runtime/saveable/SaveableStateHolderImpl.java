package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.os.compose.LocalSavedStateRegistryOwnerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SaveableStateHolder.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B1\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u0010\u001a\u00020\u000f*\u00020\f2&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00032\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0012¢\u0006\u0002\b\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R4\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "", "", "", "", "", "savedStates", "<init>", "(Ljava/util/Map;)V", "saveAll", "()Ljava/util/Map;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "map", "key", "", "saveTo", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/util/Map;Ljava/lang/Object;)V", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "SaveableStateProvider", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Ljava/util/Map;", "Landroidx/collection/MutableScatterMap;", "registries", "Landroidx/collection/MutableScatterMap;", "parentSaveableStateRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getParentSaveableStateRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "setParentSaveableStateRegistry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "Lkotlin/Function1;", "", "canBeSaved", "Lkotlin/jvm/functions/Function1;", "Companion", "runtime-saveable"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SaveableStateHolderImpl implements SaveableStateHolder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver Saver = SaverKt.Saver(new Function2() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Map Saver$lambda$11;
            Saver$lambda$11 = SaveableStateHolderImpl.Saver$lambda$11((SaverScope) obj, (SaveableStateHolderImpl) obj2);
            return Saver$lambda$11;
        }
    }, new Function1() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            SaveableStateHolderImpl Saver$lambda$12;
            Saver$lambda$12 = SaveableStateHolderImpl.Saver$lambda$12((Map) obj);
            return Saver$lambda$12;
        }
    });
    private final Function1 canBeSaved;
    private SaveableStateRegistry parentSaveableStateRegistry;
    private final MutableScatterMap registries;
    private final Map savedStates;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveableStateProvider$lambda$8(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, Function2 function2, int i, Composer composer, int i2) {
        saveableStateHolderImpl.SaveableStateProvider(obj, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public SaveableStateHolderImpl(Map map) {
        this.savedStates = map;
        this.registries = ScatterMapKt.mutableScatterMapOf();
        this.canBeSaved = new Function1() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean canBeSaved$lambda$0;
                canBeSaved$lambda$0 = SaveableStateHolderImpl.canBeSaved$lambda$0(SaveableStateHolderImpl.this, obj);
                return Boolean.valueOf(canBeSaved$lambda$0);
            }
        };
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }

    public final void setParentSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSaved$lambda$0(SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
        SaveableStateRegistry saveableStateRegistry = saveableStateHolderImpl.parentSaveableStateRegistry;
        if (saveableStateRegistry != null) {
            return saveableStateRegistry.canBeSaved(obj);
        }
        return true;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object obj, final Function2 function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(533563200);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(533563200, i2, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            startRestartGroup.startReusableGroup(207, obj);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
                if (!((Boolean) this.canBeSaved.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                rememberedValue = new SaveableStateRegistryWrapper(SaveableStateRegistryKt.SaveableStateRegistry((Map) this.savedStates.get(obj), this.canBeSaved));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final SaveableStateRegistryWrapper saveableStateRegistryWrapper = (SaveableStateRegistryWrapper) rememberedValue;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(saveableStateRegistryWrapper), LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner().provides(saveableStateRegistryWrapper)}, function2, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(this) | startRestartGroup.changedInstance(obj) | startRestartGroup.changedInstance(saveableStateRegistryWrapper);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DisposableEffectResult SaveableStateProvider$lambda$7$lambda$6$lambda$5;
                        SaveableStateProvider$lambda$7$lambda$6$lambda$5 = SaveableStateHolderImpl.SaveableStateProvider$lambda$7$lambda$6$lambda$5(SaveableStateHolderImpl.this, obj, saveableStateRegistryWrapper, (DisposableEffectScope) obj2);
                        return SaveableStateProvider$lambda$7$lambda$6$lambda$5;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.DisposableEffect(unit, (Function1) rememberedValue2, startRestartGroup, 6);
            startRestartGroup.endReusableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit SaveableStateProvider$lambda$8;
                    SaveableStateProvider$lambda$8 = SaveableStateHolderImpl.SaveableStateProvider$lambda$8(SaveableStateHolderImpl.this, obj, function2, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return SaveableStateProvider$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SaveableStateProvider$lambda$7$lambda$6$lambda$5(final SaveableStateHolderImpl saveableStateHolderImpl, final Object obj, final SaveableStateRegistryWrapper saveableStateRegistryWrapper, DisposableEffectScope disposableEffectScope) {
        if (saveableStateHolderImpl.registries.contains(obj)) {
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
        saveableStateHolderImpl.savedStates.remove(obj);
        saveableStateHolderImpl.registries.set(obj, saveableStateRegistryWrapper);
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$lambda$7$lambda$6$lambda$5$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableScatterMap mutableScatterMap;
                Map map;
                mutableScatterMap = SaveableStateHolderImpl.this.registries;
                Object remove = mutableScatterMap.remove(obj);
                SaveableStateRegistryWrapper saveableStateRegistryWrapper2 = saveableStateRegistryWrapper;
                if (remove == saveableStateRegistryWrapper2) {
                    SaveableStateHolderImpl saveableStateHolderImpl2 = SaveableStateHolderImpl.this;
                    map = saveableStateHolderImpl2.savedStates;
                    saveableStateHolderImpl2.saveTo(saveableStateRegistryWrapper2, map, obj);
                }
            }
        };
    }

    private final Map saveAll() {
        Map map = this.savedStates;
        MutableScatterMap mutableScatterMap = this.registries;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            saveTo((SaveableStateRegistry) objArr2[i4], map, objArr[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveTo(SaveableStateRegistry saveableStateRegistry, Map map, Object obj) {
        Map performSave = saveableStateRegistry.performSave();
        if (performSave.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, performSave);
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver getSaver() {
            return SaveableStateHolderImpl.Saver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map Saver$lambda$11(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
        return saveableStateHolderImpl.saveAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaveableStateHolderImpl Saver$lambda$12(Map map) {
        return new SaveableStateHolderImpl(map);
    }
}
