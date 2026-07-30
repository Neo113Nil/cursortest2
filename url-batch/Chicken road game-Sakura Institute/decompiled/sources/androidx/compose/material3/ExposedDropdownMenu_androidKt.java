package androidx.compose.material3;

import android.content.res.Configuration;
import android.view.View;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ExposedDropdownMenu.android.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001a\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002\u001aV\u0010\u001e\u001a\u00020\n*\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u000e\u0010)\u001a\u00020\u001b*\u0004\u0018\u00010*H\u0002\u001a\f\u0010+\u001a\u00020\u001b*\u00020\u0012H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,²\u0006\f\u0010-\u001a\u0004\u0018\u00010*X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u0019X\u008a\u008e\u0002"}, d2 = {"ExposedDropdownMenuItemHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExposedDropdownMenuBox", "", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SoftKeyboardListener", "view", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "onKeyboardVisibilityChange", "Lkotlin/Function0;", "(Landroid/view/View;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "calculateMaxHeight", "", "windowBounds", "Landroidx/compose/ui/geometry/Rect;", "anchorBounds", "verticalMargin", "expandable", "anchorType", "Landroidx/compose/material3/MenuAnchorType;", "expandedDescription", "", "collapsedDescription", "toggleDescription", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "expandable-Gq7TBQ4", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Landroidx/compose/ui/Modifier;", "getAnchorBounds", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getWindowBounds", "material3_release", "anchorCoordinates", "anchorWidth", "menuMaxHeight"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt {
    private static final float ExposedDropdownMenuItemHorizontalPadding = Dp.m6299constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExposedDropdownMenuBox(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, final Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        View view;
        Density density;
        int mo367roundToPx0680j_4;
        Object rememberedValue;
        MutableState mutableState;
        Object rememberedValue2;
        Object rememberedValue3;
        MutableIntState mutableIntState;
        Object rememberedValue4;
        final FocusRequester focusRequester;
        Object rememberedValue5;
        int i5;
        int i6;
        boolean changed;
        Object rememberedValue6;
        final MutableIntState mutableIntState2;
        int i7;
        FocusRequester focusRequester2;
        int i8;
        final int i9;
        Density density2;
        View view2;
        int i10;
        MutableState mutableState2;
        Modifier modifier4;
        String str;
        boolean changedInstance;
        Object rememberedValue7;
        int currentCompositeKeyHash;
        Composer m3333constructorimpl;
        boolean z2;
        Object rememberedValue8;
        boolean z3;
        Object rememberedValue9;
        final Modifier modifier5;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2067579792);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenuBox)P(1,3,2)140@6498L7,141@6531L7,142@6570L7,146@6683L53,147@6760L33,148@6819L33,150@6879L29,151@6970L7,152@7008L31,153@7071L32,154@7132L37,155@7196L62,158@7284L2210,200@9543L361,199@9500L442,225@10317L47,225@10306L58,229@10529L27,229@10497L59:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2067579792, i4, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.android.kt:139)");
                }
                ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localConfiguration);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Configuration configuration = (Configuration) consume;
                ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localView);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                view = (View) consume2;
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                density = (Density) consume3;
                mo367roundToPx0680j_4 = density.mo367roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426259219, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableState = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426261663, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final MutableIntState mutableIntState3 = (MutableIntState) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426263551, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                mutableIntState = (MutableIntState) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426265467, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                focusRequester = (FocusRequester) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localSoftwareKeyboardController);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) consume4;
                Strings.Companion companion = Strings.INSTANCE;
                final String m2655getString2EP1pXo = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_dropdown_menu_expanded), startRestartGroup, 0);
                Strings.Companion companion2 = Strings.INSTANCE;
                final String m2655getString2EP1pXo2 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_dropdown_menu_collapsed), startRestartGroup, 0);
                Strings.Companion companion3 = Strings.INSTANCE;
                final String m2655getString2EP1pXo3 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_dropdown_menu_toggle), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426275644, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuAnchorType.m1897boximpl(MenuAnchorType.INSTANCE.m1905getPrimaryNotEditableMg6Rgbw()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                final MutableState mutableState3 = (MutableState) rememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426280608, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
                i5 = i4 & 14;
                i6 = i4 & 112;
                changed = startRestartGroup.changed(configuration) | (i5 != 4) | (i6 != 32) | startRestartGroup.changed(view) | startRestartGroup.changed(density);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    mutableIntState2 = mutableIntState;
                    i7 = i6;
                    focusRequester2 = focusRequester;
                    i8 = i5;
                    i9 = mo367roundToPx0680j_4;
                    density2 = density;
                    view2 = view;
                    i10 = i4;
                    mutableState2 = mutableState;
                    modifier4 = modifier3;
                    str = "CC(remember):ExposedDropdownMenu.android.kt#9igjgp";
                    ExposedDropdownMenuBoxScopeImpl exposedDropdownMenuBoxScopeImpl = new ExposedDropdownMenuBoxScopeImpl() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1
                        @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                        /* renamed from: menuAnchor-fsE2BvY */
                        public Modifier mo1763menuAnchorfsE2BvY(Modifier modifier6, final String str2, boolean z4) {
                            Modifier.Companion m1772expandableGq7TBQ4;
                            Modifier focusRequester3 = FocusRequesterModifierKt.focusRequester(modifier6, FocusRequester.this);
                            if (!z4) {
                                m1772expandableGq7TBQ4 = Modifier.INSTANCE;
                            } else {
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                boolean z5 = z;
                                final MutableState<MenuAnchorType> mutableState4 = mutableState3;
                                final Function1<Boolean, Unit> function12 = function1;
                                final boolean z6 = z;
                                m1772expandableGq7TBQ4 = ExposedDropdownMenu_androidKt.m1772expandableGq7TBQ4(companion4, z5, new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        mutableState4.setValue(MenuAnchorType.m1897boximpl(str2));
                                        function12.invoke(Boolean.valueOf(!z6));
                                    }
                                }, str2, m2655getString2EP1pXo, m2655getString2EP1pXo2, m2655getString2EP1pXo3, softwareKeyboardController);
                            }
                            return focusRequester3.then(m1772expandableGq7TBQ4);
                        }

                        @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                        /* renamed from: getAnchorType-Mg6Rgbw$material3_release */
                        public String mo1762getAnchorTypeMg6Rgbw$material3_release() {
                            return mutableState3.getValue().getName();
                        }

                        @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                        public Modifier exposedDropdownSize(Modifier modifier6, final boolean z4) {
                            final MutableIntState mutableIntState4 = mutableIntState3;
                            final MutableIntState mutableIntState5 = mutableIntState2;
                            return LayoutModifierKt.layout(modifier6, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                    return m1773invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                }

                                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                public final MeasureResult m1773invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                                    int ExposedDropdownMenuBox$lambda$5;
                                    int ExposedDropdownMenuBox$lambda$8;
                                    ExposedDropdownMenuBox$lambda$5 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$5(mutableIntState4);
                                    int m6269constrainWidthK40F9xA = ConstraintsKt.m6269constrainWidthK40F9xA(j, ExposedDropdownMenuBox$lambda$5);
                                    ExposedDropdownMenuBox$lambda$8 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$8(mutableIntState5);
                                    int m6268constrainHeightK40F9xA = ConstraintsKt.m6268constrainHeightK40F9xA(j, ExposedDropdownMenuBox$lambda$8);
                                    int m6254getMinWidthimpl = z4 ? m6269constrainWidthK40F9xA : Constraints.m6254getMinWidthimpl(j);
                                    if (!z4) {
                                        m6269constrainWidthK40F9xA = Constraints.m6252getMaxWidthimpl(j);
                                    }
                                    final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j, m6254getMinWidthimpl, m6269constrainWidthK40F9xA, 0, m6268constrainHeightK40F9xA, 4, null));
                                    return MeasureScope.layout$default(measureScope, mo5175measureBRTryo0.getWidth(), mo5175measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                            });
                        }
                    };
                    startRestartGroup.updateRememberedValue(exposedDropdownMenuBoxScopeImpl);
                    rememberedValue6 = exposedDropdownMenuBoxScopeImpl;
                } else {
                    mutableState2 = mutableState;
                    i8 = i5;
                    focusRequester2 = focusRequester;
                    density2 = density;
                    view2 = view;
                    modifier4 = modifier3;
                    i10 = i4;
                    str = "CC(remember):ExposedDropdownMenu.android.kt#9igjgp";
                    i7 = i6;
                    i9 = mo367roundToPx0680j_4;
                    mutableIntState2 = mutableIntState;
                }
                ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) rememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426351047, str);
                changedInstance = startRestartGroup.changedInstance(view2) | startRestartGroup.changed(i9);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    final View view3 = view2;
                    final int i12 = i9;
                    final MutableState mutableState4 = mutableState2;
                    final MutableIntState mutableIntState4 = mutableIntState2;
                    rememberedValue7 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                            Rect windowBounds;
                            LayoutCoordinates ExposedDropdownMenuBox$lambda$2;
                            Rect anchorBounds;
                            int calculateMaxHeight;
                            mutableState4.setValue(layoutCoordinates);
                            mutableIntState3.setIntValue(IntSize.m6469getWidthimpl(layoutCoordinates.mo5183getSizeYbymL2g()));
                            MutableIntState mutableIntState5 = mutableIntState4;
                            windowBounds = ExposedDropdownMenu_androidKt.getWindowBounds(view3.getRootView());
                            ExposedDropdownMenuBox$lambda$2 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$2(mutableState4);
                            anchorBounds = ExposedDropdownMenu_androidKt.getAnchorBounds(ExposedDropdownMenuBox$lambda$2);
                            calculateMaxHeight = ExposedDropdownMenu_androidKt.calculateMaxHeight(windowBounds, anchorBounds, i12);
                            mutableIntState5.setIntValue(calculateMaxHeight);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier modifier6 = modifier4;
                Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier6, (Function1) rememberedValue7);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -615130921, "C211@9927L9:ExposedDropdownMenu.android.kt#uh7d8r");
                function3.invoke(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1, startRestartGroup, Integer.valueOf((i10 >> 6) & 112));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(426363998);
                ComposerKt.sourceInformation(startRestartGroup, "215@10008L286,215@9972L322");
                final View view4 = view2;
                if (z) {
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426365852, str);
                    boolean changedInstance2 = startRestartGroup.changedInstance(view4) | startRestartGroup.changed(i9);
                    Object rememberedValue10 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        final MutableIntState mutableIntState5 = mutableIntState2;
                        final MutableState mutableState5 = mutableState2;
                        rememberedValue10 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                Rect windowBounds;
                                LayoutCoordinates ExposedDropdownMenuBox$lambda$2;
                                Rect anchorBounds;
                                int calculateMaxHeight;
                                MutableIntState mutableIntState6 = mutableIntState5;
                                windowBounds = ExposedDropdownMenu_androidKt.getWindowBounds(view4.getRootView());
                                ExposedDropdownMenuBox$lambda$2 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$2(mutableState5);
                                anchorBounds = ExposedDropdownMenu_androidKt.getAnchorBounds(ExposedDropdownMenuBox$lambda$2);
                                calculateMaxHeight = ExposedDropdownMenu_androidKt.calculateMaxHeight(windowBounds, anchorBounds, i9);
                                mutableIntState6.setIntValue(calculateMaxHeight);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SoftKeyboardListener(view4, density2, (Function0) rememberedValue10, startRestartGroup, 0);
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426375501, str);
                int i13 = i8;
                z2 = i13 != 4;
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    final FocusRequester focusRequester3 = focusRequester2;
                    rememberedValue8 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (z) {
                                focusRequester3.requestFocus();
                            }
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.SideEffect((Function0) rememberedValue8, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426382265, str);
                z3 = i7 == 32;
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!z3 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function1.invoke(false);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                BackHandlerKt.BackHandler(z, (Function0) rememberedValue9, startRestartGroup, i13, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i14) {
                        ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(z, function1, modifier5, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        i4 = i3;
        if ((i4 & 1171) == 1170) {
        }
        if (i11 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume5 = startRestartGroup.consume(localConfiguration2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Configuration configuration2 = (Configuration) consume5;
        ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localView2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        view = (View) consume22;
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        density = (Density) consume32;
        mo367roundToPx0680j_4 = density.mo367roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426259219, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426261663, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableIntState mutableIntState32 = (MutableIntState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426263551, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        mutableIntState = (MutableIntState) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426265467, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        focusRequester = (FocusRequester) rememberedValue4;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController2 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume42 = startRestartGroup.consume(localSoftwareKeyboardController2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) consume42;
        Strings.Companion companion4 = Strings.INSTANCE;
        final String m2655getString2EP1pXo4 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_dropdown_menu_expanded), startRestartGroup, 0);
        Strings.Companion companion22 = Strings.INSTANCE;
        final String m2655getString2EP1pXo22 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_dropdown_menu_collapsed), startRestartGroup, 0);
        Strings.Companion companion32 = Strings.INSTANCE;
        final String m2655getString2EP1pXo32 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_dropdown_menu_toggle), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426275644, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState<MenuAnchorType> mutableState32 = (MutableState) rememberedValue5;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426280608, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
        i5 = i4 & 14;
        if (i5 != 4) {
        }
        i6 = i4 & 112;
        if (i6 != 32) {
        }
        changed = startRestartGroup.changed(configuration2) | (i5 != 4) | (i6 != 32) | startRestartGroup.changed(view) | startRestartGroup.changed(density);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        mutableIntState2 = mutableIntState;
        i7 = i6;
        focusRequester2 = focusRequester;
        i8 = i5;
        i9 = mo367roundToPx0680j_4;
        density2 = density;
        view2 = view;
        i10 = i4;
        mutableState2 = mutableState;
        modifier4 = modifier3;
        str = "CC(remember):ExposedDropdownMenu.android.kt#9igjgp";
        ExposedDropdownMenuBoxScopeImpl exposedDropdownMenuBoxScopeImpl2 = new ExposedDropdownMenuBoxScopeImpl() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1
            @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
            /* renamed from: menuAnchor-fsE2BvY */
            public Modifier mo1763menuAnchorfsE2BvY(Modifier modifier62, final String str2, boolean z4) {
                Modifier.Companion m1772expandableGq7TBQ4;
                Modifier focusRequester32 = FocusRequesterModifierKt.focusRequester(modifier62, FocusRequester.this);
                if (!z4) {
                    m1772expandableGq7TBQ4 = Modifier.INSTANCE;
                } else {
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    boolean z5 = z;
                    final MutableState<MenuAnchorType> mutableState42 = mutableState32;
                    final Function1<? super Boolean, Unit> function12 = function1;
                    final boolean z6 = z;
                    m1772expandableGq7TBQ4 = ExposedDropdownMenu_androidKt.m1772expandableGq7TBQ4(companion42, z5, new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState42.setValue(MenuAnchorType.m1897boximpl(str2));
                            function12.invoke(Boolean.valueOf(!z6));
                        }
                    }, str2, m2655getString2EP1pXo4, m2655getString2EP1pXo22, m2655getString2EP1pXo32, softwareKeyboardController2);
                }
                return focusRequester32.then(m1772expandableGq7TBQ4);
            }

            @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
            /* renamed from: getAnchorType-Mg6Rgbw$material3_release */
            public String mo1762getAnchorTypeMg6Rgbw$material3_release() {
                return mutableState32.getValue().getName();
            }

            @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
            public Modifier exposedDropdownSize(Modifier modifier62, final boolean z4) {
                final MutableIntState mutableIntState42 = mutableIntState32;
                final MutableIntState mutableIntState52 = mutableIntState2;
                return LayoutModifierKt.layout(modifier62, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m1773invoke3p2s80s(measureScope, measurable, constraints.getValue());
                    }

                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m1773invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                        int ExposedDropdownMenuBox$lambda$5;
                        int ExposedDropdownMenuBox$lambda$8;
                        ExposedDropdownMenuBox$lambda$5 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$5(mutableIntState42);
                        int m6269constrainWidthK40F9xA = ConstraintsKt.m6269constrainWidthK40F9xA(j, ExposedDropdownMenuBox$lambda$5);
                        ExposedDropdownMenuBox$lambda$8 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$8(mutableIntState52);
                        int m6268constrainHeightK40F9xA = ConstraintsKt.m6268constrainHeightK40F9xA(j, ExposedDropdownMenuBox$lambda$8);
                        int m6254getMinWidthimpl = z4 ? m6269constrainWidthK40F9xA : Constraints.m6254getMinWidthimpl(j);
                        if (!z4) {
                            m6269constrainWidthK40F9xA = Constraints.m6252getMaxWidthimpl(j);
                        }
                        final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j, m6254getMinWidthimpl, m6269constrainWidthK40F9xA, 0, m6268constrainHeightK40F9xA, 4, null));
                        return MeasureScope.layout$default(measureScope, mo5175measureBRTryo0.getWidth(), mo5175measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                });
            }
        };
        startRestartGroup.updateRememberedValue(exposedDropdownMenuBoxScopeImpl2);
        rememberedValue6 = exposedDropdownMenuBoxScopeImpl2;
        ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$12 = (ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) rememberedValue6;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426351047, str);
        changedInstance = startRestartGroup.changedInstance(view2) | startRestartGroup.changed(i9);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        final View view32 = view2;
        final int i122 = i9;
        final MutableState<LayoutCoordinates> mutableState42 = mutableState2;
        final MutableIntState mutableIntState42 = mutableIntState2;
        rememberedValue7 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                Rect windowBounds;
                LayoutCoordinates ExposedDropdownMenuBox$lambda$2;
                Rect anchorBounds;
                int calculateMaxHeight;
                mutableState42.setValue(layoutCoordinates);
                mutableIntState32.setIntValue(IntSize.m6469getWidthimpl(layoutCoordinates.mo5183getSizeYbymL2g()));
                MutableIntState mutableIntState52 = mutableIntState42;
                windowBounds = ExposedDropdownMenu_androidKt.getWindowBounds(view32.getRootView());
                ExposedDropdownMenuBox$lambda$2 = ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox$lambda$2(mutableState42);
                anchorBounds = ExposedDropdownMenu_androidKt.getAnchorBounds(ExposedDropdownMenuBox$lambda$2);
                calculateMaxHeight = ExposedDropdownMenu_androidKt.calculateMaxHeight(windowBounds, anchorBounds, i122);
                mutableIntState52.setIntValue(calculateMaxHeight);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier modifier62 = modifier4;
        Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier62, (Function1) rememberedValue7);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl.getInserting()) {
        }
        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m3340setimpl(m3333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -615130921, "C211@9927L9:ExposedDropdownMenu.android.kt#uh7d8r");
        function3.invoke(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$12, startRestartGroup, Integer.valueOf((i10 >> 6) & 112));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(426363998);
        ComposerKt.sourceInformation(startRestartGroup, "215@10008L286,215@9972L322");
        final View view42 = view2;
        if (z) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426375501, str);
        int i132 = i8;
        if (i132 != 4) {
        }
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        final FocusRequester focusRequester32 = focusRequester2;
        rememberedValue8 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (z) {
                    focusRequester32.requestFocus();
                }
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue8);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.SideEffect((Function0) rememberedValue8, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 426382265, str);
        if (i7 == 32) {
        }
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue9 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                function1.invoke(false);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue9);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        BackHandlerKt.BackHandler(z, (Function0) rememberedValue9, startRestartGroup, i132, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier5 = modifier62;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates ExposedDropdownMenuBox$lambda$2(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$5(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$8(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SoftKeyboardListener(final View view, final Density density, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1319522472);
        ComposerKt.sourceInformation(startRestartGroup, "C(SoftKeyboardListener)P(2)240@10912L1420,240@10880L1452:ExposedDropdownMenu.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(density) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319522472, i2, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:237)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1935200244, "CC(remember):ExposedDropdownMenu.android.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(view) | ((i2 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(view, function0);
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1.this.dispose();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(view, density, (Function1) rememberedValue, startRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ExposedDropdownMenu_androidKt.SoftKeyboardListener(view, density, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: expandable-Gq7TBQ4, reason: not valid java name */
    public static final Modifier m1772expandableGq7TBQ4(Modifier modifier, final boolean z, final Function0<Unit> function0, final String str, final String str2, final String str3, final String str4, final SoftwareKeyboardController softwareKeyboardController) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier, function0, new ExposedDropdownMenu_androidKt$expandable$1(str, function0, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (MenuAnchorType.m1900equalsimpl0(str, MenuAnchorType.INSTANCE.m1906getSecondaryEditableMg6Rgbw())) {
                    SemanticsPropertiesKt.m5613setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5594getButtono7Vup1c());
                    SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, z ? str2 : str3);
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
                } else {
                    SemanticsPropertiesKt.m5613setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5596getDropdownListo7Vup1c());
                }
                final Function0<Unit> function02 = function0;
                final String str5 = str;
                final SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        SoftwareKeyboardController softwareKeyboardController3;
                        function02.invoke();
                        if (MenuAnchorType.m1900equalsimpl0(str5, MenuAnchorType.INSTANCE.m1904getPrimaryEditableMg6Rgbw()) && (softwareKeyboardController3 = softwareKeyboardController2) != null) {
                            softwareKeyboardController3.show();
                        }
                        return true;
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateMaxHeight(Rect rect, Rect rect2, int i) {
        int roundToInt;
        if (rect2 == null) {
            return 0;
        }
        float f = i;
        float top = rect.getTop() + f;
        float bottom = rect.getBottom() - f;
        if (rect2.getTop() > rect.getBottom() || rect2.getBottom() < rect.getTop()) {
            roundToInt = MathKt.roundToInt(bottom - top);
        } else {
            roundToInt = MathKt.roundToInt(Math.max(rect2.getTop() - top, bottom - rect2.getBottom()));
        }
        return Math.max(roundToInt, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getWindowBounds(View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.toComposeRect(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getAnchorBounds(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates == null ? Rect.INSTANCE.getZero() : RectKt.m3639Recttz77jQw(LayoutCoordinatesKt.positionInWindow(layoutCoordinates), IntSizeKt.m6481toSizeozmzZPI(layoutCoordinates.mo5183getSizeYbymL2g()));
    }
}
