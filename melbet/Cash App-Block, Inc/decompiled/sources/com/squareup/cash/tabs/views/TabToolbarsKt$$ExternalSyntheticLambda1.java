package com.squareup.cash.tabs.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda4;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.datastore.core.SimpleActor;
import androidx.room.Room;
import androidx.room.TransactorKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.viewmodels.chat.ChatFooterViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.widgets.KeyboardState;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public final /* synthetic */ class TabToolbarsKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ boolean f$7;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda1(MoneybotChatViewModel.Content content, KeyboardState keyboardState, boolean z, boolean z2, LazyListState lazyListState, Function1 function1, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2, MutableState mutableState) {
        this.f$0 = content;
        this.f$2 = keyboardState;
        this.f$6 = z;
        this.f$7 = z2;
        this.f$3 = lazyListState;
        this.f$1 = function1;
        this.f$4 = parcelableSnapshotMutableIntState;
        this.f$5 = parcelableSnapshotMutableIntState2;
        this.f$8 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TitleBarActionScope titleBarActionScope;
        TitleBarActionScope titleBarActionScope2;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$8;
        Object obj5 = this.f$5;
        Object obj6 = this.f$4;
        Object obj7 = this.f$1;
        Object obj8 = this.f$3;
        Object obj9 = this.f$2;
        Object obj10 = this.f$0;
        switch (i) {
            case 0:
                TabToolbarInternalViewModel tabToolbarInternalViewModel = (TabToolbarInternalViewModel) obj10;
                Function1 function1 = (Function1) obj7;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj9;
                SimpleActor simpleActor = (SimpleActor) obj8;
                MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig = (MoneybotToolbarSharedElementConfig) obj6;
                SharedToolbarSwipeScope sharedToolbarSwipeScope = (SharedToolbarSwipeScope) obj5;
                Function3 function3 = (Function3) obj4;
                TitleBarActionScope titleBarActionScope3 = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope3.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope3) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    TabToolbarInternalViewModel.StartButtonType startButtonType = tabToolbarInternalViewModel.startButtonType;
                    TabToolbarInternalViewModel.ToolbarButton toolbarButton = tabToolbarInternalViewModel.moneybotSpacesButton;
                    int ordinal = startButtonType.ordinal();
                    if (ordinal == 0) {
                        titleBarActionScope = titleBarActionScope3;
                        gapComposer.startReplaceGroup(1371630403);
                        gapComposer.end(false);
                    } else if (ordinal == 1) {
                        titleBarActionScope = titleBarActionScope3;
                        gapComposer.startReplaceGroup(1371096924);
                        Icons icons = Icons.NavigationBack;
                        String stringResource = Room.stringResource(gapComposer, R.string.back_content_description);
                        boolean changed = gapComposer.changed(function1);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda8(0, function1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer, (intValue & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                        gapComposer.end(false);
                    } else {
                        if (ordinal != 2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1152605465, false);
                        }
                        gapComposer.startReplaceGroup(1371368639);
                        Icons icons2 = Icons.NavigationClose;
                        String stringResource2 = Room.stringResource(gapComposer, R.string.close_content_description);
                        boolean changed2 = gapComposer.changed(function1);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda8(18, function1);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        TransactorKt.IconAction(titleBarActionScope3, icons2, stringResource2, (Function0) rememberedValue2, null, null, null, null, null, null, false, gapComposer, (intValue & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                        titleBarActionScope = titleBarActionScope3;
                        gapComposer.end(false);
                    }
                    if (tabToolbarInternalViewModel.startButtonType == TabToolbarInternalViewModel.StartButtonType.NONE) {
                        gapComposer.startReplaceGroup(1371778986);
                        if (toolbarButton instanceof TabToolbarInternalViewModel.ImageButton) {
                            gapComposer.startReplaceGroup(1152632806);
                            TabToolbarsKt.ImageButton(titleBarActionScope, (TabToolbarInternalViewModel.ImageButton) toolbarButton, function1, elementBoundsRegistry, simpleActor, moneybotToolbarSharedElementConfig, sharedToolbarSwipeScope, this.f$6, false, gapComposer, (intValue & 14) | 32768, 128);
                            gapComposer.end(false);
                            titleBarActionScope2 = titleBarActionScope;
                        } else if (toolbarButton instanceof TabToolbarInternalViewModel.TextButton) {
                            gapComposer.startReplaceGroup(1152642205);
                            TabToolbarsKt.TextButton(titleBarActionScope, (TabToolbarInternalViewModel.TextButton) toolbarButton, function1, moneybotToolbarSharedElementConfig, sharedToolbarSwipeScope, gapComposer, intValue & 14);
                            titleBarActionScope2 = titleBarActionScope;
                            gapComposer.end(false);
                        } else {
                            titleBarActionScope2 = titleBarActionScope;
                            if (toolbarButton != null) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1152629592, false);
                            }
                            gapComposer.startReplaceGroup(1372256231);
                            gapComposer.end(false);
                        }
                        gapComposer.end(false);
                    } else {
                        titleBarActionScope2 = titleBarActionScope;
                        gapComposer.startReplaceGroup(1372279977);
                        gapComposer.end(false);
                    }
                    if (!this.f$7 || toolbarButton == null || function3 == null) {
                        gapComposer.startReplaceGroup(1372481353);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1372433303);
                        SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 6.0f));
                        gapComposer.end(false);
                    }
                    if (function3 == null) {
                        gapComposer.startReplaceGroup(1372504540);
                    } else {
                        gapComposer.startReplaceGroup(1152652997);
                        function3.invoke(titleBarActionScope2, gapComposer, Integer.valueOf(intValue & 14));
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj10;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj7;
                Function2 function2 = (Function2) obj9;
                Function2 function22 = (Function2) obj8;
                Function2 function23 = (Function2) obj6;
                Shape shape = (Shape) obj5;
                TextFieldColors textFieldColors = (TextFieldColors) obj4;
                Function2 function24 = (Function2) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changedInstance(function24) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                    boolean z = this.f$6;
                    boolean z2 = this.f$7;
                    textFieldDefaults.OutlinedTextFieldDecorationBox(str, function24, z, mutableInteractionSourceImpl, z2, function2, function22, function23, shape, textFieldColors, null, Expect_jvmKt.rememberComposableLambda(-1118701585, new OutlinedTextFieldKt$$ExternalSyntheticLambda4(z, z2, mutableInteractionSourceImpl, textFieldColors, shape), gapComposer2), gapComposer2, (intValue2 << 3) & 112);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                MoneybotChatViewModel.Content content = (MoneybotChatViewModel.Content) obj10;
                KeyboardState keyboardState = (KeyboardState) obj9;
                LazyListState lazyListState = (LazyListState) obj8;
                Function1 function12 = (Function1) obj7;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj6;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj5;
                MutableState mutableState = (MutableState) obj4;
                Function0 function0 = (Function0) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                function0.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changedInstance(function0) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    MoneybotChatViewModel.Content.Chat chat = (MoneybotChatViewModel.Content.Chat) content;
                    ChatFooterViewModel chatFooterViewModel = chat.footer;
                    boolean z3 = chat.requestKeyboardFocus;
                    Modifier align = BoxScopeInstance.INSTANCE.align(SpacerKt.imePadding(SizeKt.fillMaxWidth(companion, 1.0f)), Alignment.Companion.BottomCenter);
                    boolean z4 = chat.showImageAttachmentButton;
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda14(18, parcelableSnapshotMutableIntState);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    Function1 function13 = (Function1) rememberedValue3;
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda14(19, parcelableSnapshotMutableIntState2);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    Function1 function14 = (Function1) rememberedValue4;
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda9(12, mutableState);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    CardViewApi21Impl.Footer(chatFooterViewModel, keyboardState, align, z3, this.f$6, this.f$7, false, z4, lazyListState, function13, function14, (Function1) rememberedValue5, function12, function0, gapComposer3, 805306368, ((intValue3 << 9) & 7168) | 54, 64);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda1(TabToolbarInternalViewModel tabToolbarInternalViewModel, Function1 function1, ElementBoundsRegistry elementBoundsRegistry, SimpleActor simpleActor, MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig, SharedToolbarSwipeScope sharedToolbarSwipeScope, boolean z, boolean z2, Function3 function3) {
        this.f$0 = tabToolbarInternalViewModel;
        this.f$1 = function1;
        this.f$2 = elementBoundsRegistry;
        this.f$3 = simpleActor;
        this.f$4 = moneybotToolbarSharedElementConfig;
        this.f$5 = sharedToolbarSwipeScope;
        this.f$6 = z;
        this.f$7 = z2;
        this.f$8 = function3;
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda1(String str, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, Function2 function2, Function2 function22, Function2 function23, Shape shape, TextFieldColors textFieldColors) {
        this.f$0 = str;
        this.f$6 = z;
        this.f$1 = mutableInteractionSourceImpl;
        this.f$7 = z2;
        this.f$2 = function2;
        this.f$3 = function22;
        this.f$4 = function23;
        this.f$5 = shape;
        this.f$8 = textFieldColors;
    }
}
