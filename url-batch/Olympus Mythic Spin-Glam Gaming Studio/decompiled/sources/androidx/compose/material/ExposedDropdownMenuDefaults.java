package androidx.compose.material;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExposedDropdownMenu.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "<init>", "()V", "", "expanded", "Lkotlin/Function0;", "", "onIconClick", "TrailingIcon", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes5.dex */
public final class ExposedDropdownMenuDefaults {
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TrailingIcon(final boolean z, Function0 function0, Composer composer, final int i, final int i2) {
        int i3;
        Function0 function02;
        final Function0 function03;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(876077373);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changed(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changed(function0) ? 32 : 16;
            if ((i3 & 91) == 18 || !startRestartGroup.getSkipping()) {
                function03 = i4 == 0 ? new Function0() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m862invoke() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m862invoke();
                        return Unit.INSTANCE;
                    }
                } : function02;
                IconButtonKt.IconButton(function03, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2
                    public final void invoke(@NotNull SemanticsPropertyReceiver clearAndSetSemantics) {
                        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return Unit.INSTANCE;
                    }
                }), false, null, ComposableLambdaKt.composableLambda(startRestartGroup, 726122713, true, new Function2() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i5) {
                        if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                            IconKt.m887Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE), "Trailing icon for exposed dropdown menu", RotateKt.rotate(Modifier.INSTANCE, z ? 180.0f : 360.0f), 0L, composer2, 48, 8);
                        } else {
                            composer2.skipToGroupEnd();
                        }
                    }
                }), startRestartGroup, ((i3 >> 3) & 14) | 24576, 12);
            } else {
                startRestartGroup.skipToGroupEnd();
                function03 = function02;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    ExposedDropdownMenuDefaults.this.TrailingIcon(z, function03, composer2, i | 1, i2);
                }
            });
            return;
        }
        function02 = function0;
        if ((i3 & 91) == 18) {
        }
        function03 = i4 == 0 ? new Function0() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m862invoke() {
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m862invoke();
                return Unit.INSTANCE;
            }
        } : function02;
        IconButtonKt.IconButton(function03, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2
            public final void invoke(@NotNull SemanticsPropertyReceiver clearAndSetSemantics) {
                Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }
        }), false, null, ComposableLambdaKt.composableLambda(startRestartGroup, 726122713, true, new Function2() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(@Nullable Composer composer2, int i5) {
                if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                    IconKt.m887Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE), "Trailing icon for exposed dropdown menu", RotateKt.rotate(Modifier.INSTANCE, z ? 180.0f : 360.0f), 0L, composer2, 48, 8);
                } else {
                    composer2.skipToGroupEnd();
                }
            }
        }), startRestartGroup, ((i3 >> 3) & 14) | 24576, 12);
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
