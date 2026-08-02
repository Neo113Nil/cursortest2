package com.squareup.cash.tabs.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.datastore.core.SimpleActor;
import com.squareup.cash.arcade.components.input.DropdownState;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class TabToolbarsKt$$ExternalSyntheticLambda15 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ boolean f$7;
    public final /* synthetic */ boolean f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda15(DropdownState dropdownState, String str, Modifier modifier, boolean z, boolean z2, Function2 function2, String str2, Function2 function22, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = dropdownState;
        this.f$1 = str;
        this.f$2 = modifier;
        this.f$7 = z;
        this.f$8 = z2;
        this.f$3 = function2;
        this.f$4 = str2;
        this.f$5 = function22;
        this.f$6 = composableLambdaImpl;
        this.f$9 = i;
        this.f$10 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$9;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        Object obj5 = this.f$6;
        Object obj6 = this.f$5;
        Object obj7 = this.f$4;
        Object obj8 = this.f$3;
        Object obj9 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                TabToolbarsKt.ImageButton((TitleBarActionScope) obj4, (TabToolbarInternalViewModel.ImageButton) obj3, (Function1) obj9, (ElementBoundsRegistry) obj8, (SimpleActor) obj7, (MoneybotToolbarSharedElementConfig) obj6, (SharedToolbarSwipeScope) obj5, this.f$7, this.f$8, (Composer) obj, updateChangedFlags, this.f$10);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                InputChipKt.InputDropdown((DropdownState) obj4, (String) obj3, (Modifier) obj9, this.f$7, this.f$8, (Function2) obj8, (String) obj7, (Function2) obj6, (ComposableLambdaImpl) obj5, (Composer) obj, updateChangedFlags2, this.f$10);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(this.f$10 | 1);
                ComposeBottomSheetKt.SheetV2(this.f$0, this.f$1, (Function0) obj9, this.f$7, this.f$8, this.f$9, (BottomSheetConfig.HeightMode) obj8, (BottomSheetStyle) obj7, (OverlayLayer) obj6, (ComposableLambdaImpl) obj5, (Composer) obj, updateChangedFlags3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda15(TitleBarActionScope titleBarActionScope, TabToolbarInternalViewModel.ImageButton imageButton, Function1 function1, ElementBoundsRegistry elementBoundsRegistry, SimpleActor simpleActor, MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig, SharedToolbarSwipeScope sharedToolbarSwipeScope, boolean z, boolean z2, int i, int i2) {
        this.f$0 = titleBarActionScope;
        this.f$1 = imageButton;
        this.f$2 = function1;
        this.f$3 = elementBoundsRegistry;
        this.f$4 = simpleActor;
        this.f$5 = moneybotToolbarSharedElementConfig;
        this.f$6 = sharedToolbarSwipeScope;
        this.f$7 = z;
        this.f$8 = z2;
        this.f$9 = i;
        this.f$10 = i2;
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda15(Object obj, Object obj2, Function0 function0, boolean z, boolean z2, int i, BottomSheetConfig.HeightMode heightMode, BottomSheetStyle bottomSheetStyle, OverlayLayer overlayLayer, ComposableLambdaImpl composableLambdaImpl, int i2) {
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = function0;
        this.f$7 = z;
        this.f$8 = z2;
        this.f$9 = i;
        this.f$3 = heightMode;
        this.f$4 = bottomSheetStyle;
        this.f$5 = overlayLayer;
        this.f$6 = composableLambdaImpl;
        this.f$10 = i2;
    }
}
