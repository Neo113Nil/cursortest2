package androidx.compose.ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierLocal;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComposedModifier.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\"%\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"%\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "Landroidx/compose/runtime/Composable;", "factory", "composed", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composer;", "modifier", "materialize", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusEventModifier;", "WrapFocusEventModifier", "Lkotlin/jvm/functions/Function3;", "Landroidx/compose/ui/focus/FocusRequesterModifier;", "WrapFocusRequesterModifier", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposedModifierKt {
    private static final Function3 WrapFocusEventModifier = new Function3() { // from class: androidx.compose.ui.ComposedModifierKt$WrapFocusEventModifier$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((FocusEventModifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        @Composable
        @NotNull
        public final FocusEventModifierLocal invoke(@NotNull FocusEventModifier mod, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(mod, "mod");
            composer.startReplaceableGroup(-1790596922);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(mod);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FocusEventModifierLocal(new ComposedModifierKt$WrapFocusEventModifier$1$modifier$1$1(mod));
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            final FocusEventModifierLocal focusEventModifierLocal = (FocusEventModifierLocal) rememberedValue;
            EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.ui.ComposedModifierKt$WrapFocusEventModifier$1.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m1229invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m1229invoke() {
                    FocusEventModifierLocal.this.notifyIfNoFocusModifiers();
                }
            }, composer, 0);
            composer.endReplaceableGroup();
            return focusEventModifierLocal;
        }
    };
    private static final Function3 WrapFocusRequesterModifier = new Function3() { // from class: androidx.compose.ui.ComposedModifierKt$WrapFocusRequesterModifier$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((FocusRequesterModifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        @Composable
        @NotNull
        public final FocusRequesterModifierLocal invoke(@NotNull FocusRequesterModifier mod, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(mod, "mod");
            composer.startReplaceableGroup(945678692);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(mod);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FocusRequesterModifierLocal(mod.getFocusRequester());
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            FocusRequesterModifierLocal focusRequesterModifierLocal = (FocusRequesterModifierLocal) rememberedValue;
            composer.endReplaceableGroup();
            return focusRequesterModifierLocal;
        }
    };

    public static /* synthetic */ Modifier composed$default(Modifier modifier, Function1 function1, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, function1, function3);
    }

    public static final Modifier composed(Modifier modifier, Function1 inspectorInfo, Function3 factory) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return modifier.then(new ComposedModifier(inspectorInfo, factory));
    }

    public static final Modifier materialize(final Composer composer, Modifier modifier) {
        Intrinsics.checkNotNullParameter(composer, "<this>");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        if (modifier.all(new Function1() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Modifier.Element it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(((it instanceof ComposedModifier) || (it instanceof FocusEventModifier) || (it instanceof FocusRequesterModifier)) ? false : true);
            }
        })) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.INSTANCE, new Function2() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$result$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Modifier invoke(@NotNull Modifier acc, @NotNull Modifier.Element element) {
                Modifier modifier3;
                Modifier modifier4;
                Function3 function3;
                Function3 function32;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                if (element instanceof ComposedModifier) {
                    modifier4 = ComposedModifierKt.materialize(Composer.this, (Modifier) ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(((ComposedModifier) element).getFactory(), 3)).invoke(Modifier.INSTANCE, Composer.this, 0));
                } else {
                    if (element instanceof FocusEventModifier) {
                        function32 = ComposedModifierKt.WrapFocusEventModifier;
                        modifier3 = element.then((Modifier) ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function32, 3)).invoke(element, Composer.this, 0));
                    } else {
                        modifier3 = element;
                    }
                    if (element instanceof FocusRequesterModifier) {
                        function3 = ComposedModifierKt.WrapFocusRequesterModifier;
                        modifier4 = modifier3.then((Modifier) ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function3, 3)).invoke(element, Composer.this, 0));
                    } else {
                        modifier4 = modifier3;
                    }
                }
                return acc.then(modifier4);
            }
        });
        composer.endReplaceableGroup();
        return modifier2;
    }
}
