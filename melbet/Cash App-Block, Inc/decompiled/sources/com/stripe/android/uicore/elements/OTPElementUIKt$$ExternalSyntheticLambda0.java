package com.stripe.android.uicore.elements;

import android.view.KeyEvent;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.shopping.viewmodels.ShoppingViewModel;
import com.squareup.cash.shopping.views.ShoppingWebContainerViewKt;
import com.squareup.cash.webview.android.WebViewProvider;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.FocusManagerKtKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function7;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes8.dex */
public final /* synthetic */ class OTPElementUIKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ String f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ OTPElementUIKt$$ExternalSyntheticLambda0(Modifier modifier, ShoppingViewModel shoppingViewModel, String str, String str2, boolean z, Function1 function1, WebViewProvider webViewProvider, boolean z2, Function7 function7, int i) {
        this.f$0 = modifier;
        this.f$3 = shoppingViewModel;
        this.f$8 = str;
        this.f$4 = str2;
        this.f$2 = z;
        this.f$5 = function1;
        this.f$7 = webViewProvider;
        this.f$6 = z2;
        this.f$9 = function7;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$9;
        Object obj4 = this.f$7;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$0;
        Object obj8 = this.f$5;
        switch (i) {
            case 0:
                final OTPElement oTPElement = (OTPElement) obj7;
                final FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj6;
                FocusRequester focusRequester = (FocusRequester) obj5;
                TextStyle textStyle = (TextStyle) obj8;
                OTPElementColors oTPElementColors = (OTPElementColors) obj4;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArrayList arrayList = oTPElement.controller.fieldValues;
                    final int i2 = this.f$1;
                    final MutableState collectAsState = StateFlowsComposeKt.collectAsState((StateFlow) arrayList.get(i2), gapComposer);
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 56.0f);
                    boolean changed = gapComposer.changed(i2);
                    boolean z = this.f$2;
                    boolean changed2 = changed | gapComposer.changed(z);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed2 || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new OTPElementUIKt$$ExternalSyntheticLambda2(parcelableSnapshotMutableIntState, z, i2, 0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier onFocusChanged = FocusOwnerImplKt.onFocusChanged(m277height3ABfNKs, (Function1) rememberedValue);
                    boolean changed3 = gapComposer.changed(i2) | gapComposer.changed(collectAsState) | gapComposer.changedInstance(focusOwnerImpl) | gapComposer.changedInstance(oTPElement);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new Function1() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                KeyEvent keyEvent = ((androidx.compose.ui.input.key.KeyEvent) obj9).nativeKeyEvent;
                                keyEvent.getClass();
                                int i3 = i2;
                                if (i3 == 0 || KeyEventType.m790getTypeZmokQxo(keyEvent) != 2 || keyEvent.getKeyCode() != 67 || ((String) collectAsState.getValue()).length() != 0) {
                                    return Boolean.FALSE;
                                }
                                FocusManagerKtKt.m4065moveFocusSafelyMxy_nc0(focusOwnerImpl, 2);
                                oTPElement.controller.onValueChanged(i3 - 1, "");
                                return Boolean.TRUE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Modifier testTag = TestTagKt.testTag(KeyEventType.onPreviewKeyEvent(onFocusChanged, (Function1) rememberedValue2), "OTP-" + i2);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new StripeApiRepository$$ExternalSyntheticLambda5(29);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(testTag, false, (Function1) rememberedValue3);
                    if (i2 == 0) {
                        gapComposer.startReplaceGroup(564046127);
                        Modifier focusRequester2 = FocusTraversalKt.focusRequester(semantics, focusRequester);
                        boolean changedInstance = gapComposer.changedInstance(oTPElement);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new OTPElement$$ExternalSyntheticLambda0(oTPElement, 1);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        }
                        semantics = SemanticsModifierKt.semantics(focusRequester2, false, (Function1) rememberedValue4);
                    } else {
                        gapComposer.startReplaceGroup(556899759);
                    }
                    gapComposer.end(false);
                    OTPElementUIKt.OTPInputBox((String) collectAsState.getValue(), z, textStyle, oTPElement, i2, focusOwnerImpl, semantics, this.f$6, oTPElementColors, this.f$8, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ShoppingWebContainerViewKt.Content((Modifier) obj7, (ShoppingViewModel) obj6, this.f$8, (String) obj5, this.f$2, (Function1) obj8, (WebViewProvider) obj4, this.f$6, (Function7) obj3, (Composer) obj, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                OTPElementUIKt.OTPInputBox(this.f$8, this.f$2, (TextStyle) obj8, (OTPElement) obj7, this.f$1, (FocusOwnerImpl) obj6, (Modifier) obj5, this.f$6, (OTPElementColors) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OTPElementUIKt$$ExternalSyntheticLambda0(OTPElement oTPElement, int i, boolean z, FocusOwnerImpl focusOwnerImpl, FocusRequester focusRequester, TextStyle textStyle, boolean z2, OTPElementColors oTPElementColors, String str, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.f$0 = oTPElement;
        this.f$1 = i;
        this.f$2 = z;
        this.f$3 = focusOwnerImpl;
        this.f$4 = focusRequester;
        this.f$5 = textStyle;
        this.f$6 = z2;
        this.f$7 = oTPElementColors;
        this.f$8 = str;
        this.f$9 = parcelableSnapshotMutableIntState;
    }

    public /* synthetic */ OTPElementUIKt$$ExternalSyntheticLambda0(String str, boolean z, TextStyle textStyle, OTPElement oTPElement, int i, FocusOwnerImpl focusOwnerImpl, Modifier modifier, boolean z2, OTPElementColors oTPElementColors, String str2, int i2) {
        this.f$8 = str;
        this.f$2 = z;
        this.f$5 = textStyle;
        this.f$0 = oTPElement;
        this.f$1 = i;
        this.f$3 = focusOwnerImpl;
        this.f$4 = modifier;
        this.f$6 = z2;
        this.f$7 = oTPElementColors;
        this.f$9 = str2;
    }
}
