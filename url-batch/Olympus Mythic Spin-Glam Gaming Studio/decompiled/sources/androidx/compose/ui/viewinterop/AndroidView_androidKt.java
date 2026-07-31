package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.os.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidView.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\"#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/Modifier;", "modifier", "", "update", "AndroidView", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "NoOpUpdate", "Lkotlin/jvm/functions/Function1;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AndroidView_androidKt {
    private static final Function1 NoOpUpdate = new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AndroidView(final Function1 factory, Modifier modifier, Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Function1 function12;
        Object rememberedValue;
        Composer.Companion companion;
        Object rememberedValue2;
        final SaveableStateRegistry saveableStateRegistry;
        Object rememberedValue3;
        final Function1 function13;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Composer startRestartGroup = composer.startRestartGroup(-1783766393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(factory) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changed(function12) ? 256 : 128;
                if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                    Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    Function1 function14 = i4 != 0 ? NoOpUpdate : function12;
                    final Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$noOpConnection$1$1
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt$AndroidView$noOpConnection$1$1 androidView_androidKt$AndroidView$noOpConnection$1$1 = (AndroidView_androidKt$AndroidView$noOpConnection$1$1) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new NestedScrollDispatcher();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    final NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) rememberedValue2;
                    Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, SemanticsModifierKt.semantics(modifier3.then(NestedScrollModifierKt.nestedScroll(Modifier.INSTANCE, androidView_androidKt$AndroidView$noOpConnection$1$1, nestedScrollDispatcher)), true, new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                        public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return Unit.INSTANCE;
                        }
                    }));
                    Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    final CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                    saveableStateRegistry = (SaveableStateRegistry) startRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
                    final String valueOf = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0));
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new Ref();
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceableGroup();
                    final Ref ref = (Ref) rememberedValue3;
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    Modifier modifier4 = modifier3;
                    final Function0 function0 = new Function0() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final LayoutNode mo4828invoke() {
                            View typedView$ui_release;
                            ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context, rememberCompositionContext, nestedScrollDispatcher);
                            viewFactoryHolder.setFactory(factory);
                            SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                            Object consumeRestored = saveableStateRegistry2 != null ? saveableStateRegistry2.consumeRestored(valueOf) : null;
                            SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
                            if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                                typedView$ui_release.restoreHierarchyState(sparseArray);
                            }
                            ref.setValue(viewFactoryHolder);
                            return viewFactoryHolder.getLayoutNode();
                        }
                    };
                    startRestartGroup.startReplaceableGroup(1886828752);
                    if (!(startRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(new Function0() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final LayoutNode mo4828invoke() {
                                return Function0.this.mo4828invoke();
                            }
                        });
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                    Updater.m1153setimpl(m1149constructorimpl, materialize, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((LayoutNode) obj, (Modifier) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Modifier it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            ((ViewFactoryHolder) value).setModifier(it);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl, density, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((LayoutNode) obj, (Density) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Density it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            ((ViewFactoryHolder) value).setDensity(it);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl, lifecycleOwner, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((LayoutNode) obj, (LifecycleOwner) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull LifecycleOwner it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            ((ViewFactoryHolder) value).setLifecycleOwner(it);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl, savedStateRegistryOwner, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((LayoutNode) obj, (SavedStateRegistryOwner) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull SavedStateRegistryOwner it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            ((ViewFactoryHolder) value).setSavedStateRegistryOwner(it);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl, function14, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((LayoutNode) obj, (Function1) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1 it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            ((ViewFactoryHolder) value).setUpdateBlock(it);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

                        /* compiled from: AndroidView.android.kt */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[LayoutDirection.values().length];
                                iArr[LayoutDirection.Ltr.ordinal()] = 1;
                                iArr[LayoutDirection.Rtl.ordinal()] = 2;
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((LayoutNode) obj, (LayoutDirection) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull LayoutDirection it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object value = ref.getValue();
                            Intrinsics.checkNotNull(value);
                            ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) value;
                            int i6 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
                            int i7 = 1;
                            if (i6 == 1) {
                                i7 = 0;
                            } else if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            viewFactoryHolder.setLayoutDirection(i7);
                        }
                    });
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    if (saveableStateRegistry != null) {
                        EffectsKt.DisposableEffect(saveableStateRegistry, valueOf, new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final Ref<ViewFactoryHolder<View>> ref2 = ref;
                                final SaveableStateRegistry.Entry registerProvider = SaveableStateRegistry.this.registerProvider(valueOf, new Function0() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    /* renamed from: invoke */
                                    public final SparseArray<Parcelable> mo4828invoke() {
                                        SparseArray<Parcelable> sparseArray = new SparseArray<>();
                                        Object value = ref2.getValue();
                                        Intrinsics.checkNotNull(value);
                                        View typedView$ui_release = ((ViewFactoryHolder) value).getTypedView$ui_release();
                                        if (typedView$ui_release != null) {
                                            typedView$ui_release.saveHierarchyState(sparseArray);
                                        }
                                        return sparseArray;
                                    }
                                });
                                return new DisposableEffectResult() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        SaveableStateRegistry.Entry.this.unregister();
                                    }
                                };
                            }
                        }, startRestartGroup, 8);
                    }
                    modifier2 = modifier4;
                    function13 = function14;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function13 = function12;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i6) {
                        AndroidView_androidKt.AndroidView(Function1.this, modifier2, function13, composer2, i | 1, i2);
                    }
                });
                return;
            }
            function12 = function1;
            if ((i3 & 731) == 146) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            final Context context2 = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            AndroidView_androidKt$AndroidView$noOpConnection$1$1 androidView_androidKt$AndroidView$noOpConnection$1$12 = (AndroidView_androidKt$AndroidView$noOpConnection$1$1) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final NestedScrollDispatcher nestedScrollDispatcher2 = (NestedScrollDispatcher) rememberedValue2;
            Modifier materialize2 = ComposedModifierKt.materialize(startRestartGroup, SemanticsModifierKt.semantics(modifier3.then(NestedScrollModifierKt.nestedScroll(Modifier.INSTANCE, androidView_androidKt$AndroidView$noOpConnection$1$12, nestedScrollDispatcher2)), true, new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
                public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return Unit.INSTANCE;
                }
            }));
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            final CompositionContext rememberCompositionContext2 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            saveableStateRegistry = (SaveableStateRegistry) startRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            final String valueOf2 = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0));
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final Ref<ViewFactoryHolder<View>> ref2 = (Ref) rememberedValue3;
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            SavedStateRegistryOwner savedStateRegistryOwner2 = (SavedStateRegistryOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            Modifier modifier42 = modifier3;
            final Function0 function02 = new Function0() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final LayoutNode mo4828invoke() {
                    View typedView$ui_release;
                    ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context2, rememberCompositionContext2, nestedScrollDispatcher2);
                    viewFactoryHolder.setFactory(factory);
                    SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    Object consumeRestored = saveableStateRegistry2 != null ? saveableStateRegistry2.consumeRestored(valueOf2) : null;
                    SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
                    if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                        typedView$ui_release.restoreHierarchyState(sparseArray);
                    }
                    ref2.setValue(viewFactoryHolder);
                    return viewFactoryHolder.getLayoutNode();
                }
            };
            startRestartGroup.startReplaceableGroup(1886828752);
            if (!(startRestartGroup.getApplier() instanceof UiApplier)) {
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
            }
            Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl2, materialize2, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((LayoutNode) obj, (Modifier) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutNode set, @NotNull Modifier it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    ((ViewFactoryHolder) value).setModifier(it);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl2, density2, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((LayoutNode) obj, (Density) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutNode set, @NotNull Density it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    ((ViewFactoryHolder) value).setDensity(it);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl2, lifecycleOwner2, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((LayoutNode) obj, (LifecycleOwner) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutNode set, @NotNull LifecycleOwner it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    ((ViewFactoryHolder) value).setLifecycleOwner(it);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl2, savedStateRegistryOwner2, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((LayoutNode) obj, (SavedStateRegistryOwner) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutNode set, @NotNull SavedStateRegistryOwner it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    ((ViewFactoryHolder) value).setSavedStateRegistryOwner(it);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl2, function14, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((LayoutNode) obj, (Function1) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutNode set, @NotNull Function1 it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    ((ViewFactoryHolder) value).setUpdateBlock(it);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

                /* compiled from: AndroidView.android.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[LayoutDirection.values().length];
                        iArr[LayoutDirection.Ltr.ordinal()] = 1;
                        iArr[LayoutDirection.Rtl.ordinal()] = 2;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((LayoutNode) obj, (LayoutDirection) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutNode set, @NotNull LayoutDirection it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object value = ref2.getValue();
                    Intrinsics.checkNotNull(value);
                    ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) value;
                    int i6 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
                    int i7 = 1;
                    if (i6 == 1) {
                        i7 = 0;
                    } else if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    viewFactoryHolder.setLayoutDirection(i7);
                }
            });
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (saveableStateRegistry != null) {
            }
            modifier2 = modifier42;
            function13 = function14;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        if ((i3 & 731) == 146) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        final Context context22 = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        AndroidView_androidKt$AndroidView$noOpConnection$1$1 androidView_androidKt$AndroidView$noOpConnection$1$122 = (AndroidView_androidKt$AndroidView$noOpConnection$1$1) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final NestedScrollDispatcher nestedScrollDispatcher22 = (NestedScrollDispatcher) rememberedValue2;
        Modifier materialize22 = ComposedModifierKt.materialize(startRestartGroup, SemanticsModifierKt.semantics(modifier3.then(NestedScrollModifierKt.nestedScroll(Modifier.INSTANCE, androidView_androidKt$AndroidView$noOpConnection$1$122, nestedScrollDispatcher22)), true, new Function1() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1
            public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }
        }));
        Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        final CompositionContext rememberCompositionContext22 = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        saveableStateRegistry = (SaveableStateRegistry) startRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        final String valueOf22 = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0));
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final Ref<ViewFactoryHolder<View>> ref22 = (Ref) rememberedValue3;
        LifecycleOwner lifecycleOwner22 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        SavedStateRegistryOwner savedStateRegistryOwner22 = (SavedStateRegistryOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
        Modifier modifier422 = modifier3;
        final Function0 function022 = new Function0() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final LayoutNode mo4828invoke() {
                View typedView$ui_release;
                ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(context22, rememberCompositionContext22, nestedScrollDispatcher22);
                viewFactoryHolder.setFactory(factory);
                SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                Object consumeRestored = saveableStateRegistry2 != null ? saveableStateRegistry2.consumeRestored(valueOf22) : null;
                SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
                if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
                    typedView$ui_release.restoreHierarchyState(sparseArray);
                }
                ref22.setValue(viewFactoryHolder);
                return viewFactoryHolder.getLayoutNode();
            }
        };
        startRestartGroup.startReplaceableGroup(1886828752);
        if (!(startRestartGroup.getApplier() instanceof UiApplier)) {
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
        }
        Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl22, materialize22, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (Modifier) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutNode set, @NotNull Modifier it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                Object value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                ((ViewFactoryHolder) value).setModifier(it);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl22, density22, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (Density) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutNode set, @NotNull Density it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                Object value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                ((ViewFactoryHolder) value).setDensity(it);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl22, lifecycleOwner22, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (LifecycleOwner) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutNode set, @NotNull LifecycleOwner it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                Object value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                ((ViewFactoryHolder) value).setLifecycleOwner(it);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl22, savedStateRegistryOwner22, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (SavedStateRegistryOwner) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutNode set, @NotNull SavedStateRegistryOwner it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                Object value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                ((ViewFactoryHolder) value).setSavedStateRegistryOwner(it);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl22, function14, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (Function1) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutNode set, @NotNull Function1 it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                Object value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                ((ViewFactoryHolder) value).setUpdateBlock(it);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, new Function2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6

            /* compiled from: AndroidView.android.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    iArr[LayoutDirection.Ltr.ordinal()] = 1;
                    iArr[LayoutDirection.Rtl.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LayoutNode) obj, (LayoutDirection) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutNode set, @NotNull LayoutDirection it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                Object value = ref22.getValue();
                Intrinsics.checkNotNull(value);
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) value;
                int i6 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
                int i7 = 1;
                if (i6 == 1) {
                    i7 = 0;
                } else if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                viewFactoryHolder.setLayoutDirection(i7);
            }
        });
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (saveableStateRegistry != null) {
        }
        modifier2 = modifier422;
        function13 = function14;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Function1 getNoOpUpdate() {
        return NoOpUpdate;
    }
}
