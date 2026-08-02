package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.squareup.cash.security.views.databinding.SecurityViewPasswordEntryBinding;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class SelectCountryAndIdClassRunner implements LayoutRunner {
    public static final UiScreenRunner.Companion Companion = new UiScreenRunner.Companion(3);
    public final SelectCountryAndIdClassViewController viewController;

    public SelectCountryAndIdClassRunner(SelectCountryAndIdClassViewController selectCountryAndIdClassViewController) {
        selectCountryAndIdClassViewController.getClass();
        this.viewController = selectCountryAndIdClassViewController;
        InsetsUtilsKt.applyInsetsAsPadding$default((LinearLayout) ((BasicSelectCountryAndIdClassViewController) selectCountryAndIdClassViewController).binding.securityViewDivider, 15);
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(final Screen.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen, ViewEnvironment viewEnvironment) {
        Object obj;
        List list;
        boolean z;
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.InputSelectStyleContainer base3;
        InputSelectComponentStyle base4;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        StepStyles.StepTextBasedComponentStyleContainer base7;
        TextBasedComponentStyle base8;
        StepStyles.InputSelectStyleContainer base9;
        StepStyles.InputSelectStyleContainer base10;
        autoClassificationSelectCountryAndIdClassScreen.getClass();
        viewEnvironment.getClass();
        final BasicSelectCountryAndIdClassViewController basicSelectCountryAndIdClassViewController = (BasicSelectCountryAndIdClassViewController) this.viewController;
        basicSelectCountryAndIdClassViewController.getClass();
        SecurityViewPasswordEntryBinding securityViewPasswordEntryBinding = basicSelectCountryAndIdClassViewController.binding;
        NavigationState navigationState = autoClassificationSelectCountryAndIdClassScreen.navigationState;
        final int i = 0;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.BasicSelectCountryAndIdClassViewController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                Screen.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen2 = autoClassificationSelectCountryAndIdClassScreen;
                switch (i2) {
                    case 0:
                        autoClassificationSelectCountryAndIdClassScreen2.onBackClick.invoke();
                        break;
                    default:
                        autoClassificationSelectCountryAndIdClassScreen2.onCancelClick.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i2 = 1;
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.BasicSelectCountryAndIdClassViewController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                Screen.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen2 = autoClassificationSelectCountryAndIdClassScreen;
                switch (i22) {
                    case 0:
                        autoClassificationSelectCountryAndIdClassScreen2.onBackClick.invoke();
                        break;
                    default:
                        autoClassificationSelectCountryAndIdClassScreen2.onCancelClick.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) securityViewPasswordEntryBinding.securityViewPasswordEditText;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) securityViewPasswordEntryBinding.rootView;
        TextView textView = securityViewPasswordEntryBinding.securityViewPasswordDetailText;
        TextView textView2 = (TextView) securityViewPasswordEntryBinding.securityViewHelpButton;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) securityViewPasswordEntryBinding.securityViewBiometricsCheckbox;
        TextInputLayout textInputLayout = (TextInputLayout) securityViewPasswordEntryBinding.securityViewForgotPasswordText;
        TextInputLayout textInputLayout2 = (TextInputLayout) securityViewPasswordEntryBinding.securityViewPasswordActionButton;
        coordinatorLayout.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, coordinatorLayout);
        TextView textView3 = securityViewPasswordEntryBinding.securityViewPasswordHeader;
        textView3.setText(autoClassificationSelectCountryAndIdClassScreen.manualClassificationTitle);
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = autoClassificationSelectCountryAndIdClassScreen.styles;
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle = governmentIdStepStyle != null ? governmentIdStepStyle.getInputSelectStyle() : null;
        ArrayList<Screen.AutoClassificationSelectCountryAndIdClassScreen.CountryOption> arrayList = autoClassificationSelectCountryAndIdClassScreen.countryOptions;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Screen.AutoClassificationSelectCountryAndIdClassScreen.CountryOption countryOption : arrayList) {
            arrayList2.add(new Option(countryOption.countryName, countryOption.countryCode));
        }
        String str = autoClassificationSelectCountryAndIdClassScreen.selectedCountryCode;
        Iterator it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((Option) obj).value, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Option option = (Option) obj;
        if (option == null || (list = CollectionsKt__CollectionsJVMKt.listOf(option)) == null) {
            list = EmptyList.INSTANCE;
        }
        final BasicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1 basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1 = new BasicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1((inputSelectStyle == null || (base10 = inputSelectStyle.getBase()) == null) ? null : base10.getBase(), arrayList2, list);
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle2 = governmentIdStepStyle != null ? governmentIdStepStyle.getInputSelectStyle() : null;
        ArrayList arrayList3 = autoClassificationSelectCountryAndIdClassScreen.idClassOptions;
        String str2 = autoClassificationSelectCountryAndIdClassScreen.selectedIdClass;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = governmentIdStepStyle;
            StepStyles.GovernmentIdStepInputSelectStyle governmentIdStepInputSelectStyle = inputSelectStyle2;
            if (Intrinsics.areEqual(((Option) obj2).value, str2)) {
                arrayList4.add(obj2);
            }
            governmentIdStepStyle = governmentIdStepStyle2;
            inputSelectStyle2 = governmentIdStepInputSelectStyle;
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = governmentIdStepStyle;
        StepStyles.GovernmentIdStepInputSelectStyle governmentIdStepInputSelectStyle2 = inputSelectStyle2;
        final BasicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1 basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$12 = new BasicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1((governmentIdStepInputSelectStyle2 == null || (base9 = governmentIdStepInputSelectStyle2.getBase()) == null) ? null : base9.getBase(), arrayList3, arrayList4);
        Option option2 = (Option) CollectionsKt.firstOrNull(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1.$selectedOptions);
        String str3 = option2 != null ? option2.text : null;
        final int i3 = 0;
        textInputLayout.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.BasicSelectCountryAndIdClassViewController$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                Screen.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen2 = autoClassificationSelectCountryAndIdClassScreen;
                BasicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1 basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13 = basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1;
                BasicSelectCountryAndIdClassViewController basicSelectCountryAndIdClassViewController2 = basicSelectCountryAndIdClassViewController;
                switch (i4) {
                    case 0:
                        basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onCountrySelected));
                        break;
                    case 1:
                        basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onCountrySelected));
                        break;
                    case 2:
                        basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onIdClassSelected));
                        break;
                    default:
                        basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onIdClassSelected));
                        break;
                }
            }
        });
        EditText editText = textInputLayout.editText;
        if (editText != null) {
            z = true;
            final char c = 1 == true ? 1 : 0;
            editText.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.BasicSelectCountryAndIdClassViewController$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = c;
                    Screen.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen2 = autoClassificationSelectCountryAndIdClassScreen;
                    BasicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1 basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13 = basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1;
                    BasicSelectCountryAndIdClassViewController basicSelectCountryAndIdClassViewController2 = basicSelectCountryAndIdClassViewController;
                    switch (i4) {
                        case 0:
                            basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onCountrySelected));
                            break;
                        case 1:
                            basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onCountrySelected));
                            break;
                        case 2:
                            basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onIdClassSelected));
                            break;
                        default:
                            basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onIdClassSelected));
                            break;
                    }
                }
            });
        } else {
            z = true;
        }
        EditText editText2 = textInputLayout.editText;
        if (editText2 != null) {
            editText2.setText(str3);
        }
        if (str3 != null) {
            textInputLayout2.setEnabled(z);
            EditText editText3 = textInputLayout2.editText;
            if (editText3 != null) {
                editText3.setEnabled(z);
            }
            final int i4 = 2;
            textInputLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.BasicSelectCountryAndIdClassViewController$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i4;
                    Screen.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen2 = autoClassificationSelectCountryAndIdClassScreen;
                    BasicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1 basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13 = basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$12;
                    BasicSelectCountryAndIdClassViewController basicSelectCountryAndIdClassViewController2 = basicSelectCountryAndIdClassViewController;
                    switch (i42) {
                        case 0:
                            basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onCountrySelected));
                            break;
                        case 1:
                            basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onCountrySelected));
                            break;
                        case 2:
                            basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onIdClassSelected));
                            break;
                        default:
                            basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onIdClassSelected));
                            break;
                    }
                }
            });
            EditText editText4 = textInputLayout2.editText;
            if (editText4 != null) {
                final int i5 = 3;
                editText4.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.BasicSelectCountryAndIdClassViewController$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i42 = i5;
                        Screen.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen2 = autoClassificationSelectCountryAndIdClassScreen;
                        BasicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1 basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13 = basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$12;
                        BasicSelectCountryAndIdClassViewController basicSelectCountryAndIdClassViewController2 = basicSelectCountryAndIdClassViewController;
                        switch (i42) {
                            case 0:
                                basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onCountrySelected));
                                break;
                            case 1:
                                basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onCountrySelected));
                                break;
                            case 2:
                                basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onIdClassSelected));
                                break;
                            default:
                                basicSelectCountryAndIdClassViewController2.inputSelectBottomSheetController.show(basicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$13, new ViewGroups$$ExternalSyntheticLambda0(19, autoClassificationSelectCountryAndIdClassScreen2.onIdClassSelected));
                                break;
                        }
                    }
                });
            }
            EditText editText5 = textInputLayout2.editText;
            if (editText5 != null) {
                Option option3 = (Option) CollectionsKt.firstOrNull((List) arrayList4);
                editText5.setText(option3 != null ? option3.text : null);
            }
        } else {
            textInputLayout2.setEnabled(false);
            EditText editText6 = textInputLayout2.editText;
            if (editText6 != null) {
                editText6.setEnabled(false);
            }
        }
        textView2.setText(autoClassificationSelectCountryAndIdClassScreen.countryInputTitle);
        textView.setText(autoClassificationSelectCountryAndIdClassScreen.idClassInputTitle);
        personaMaterialButton.setEnabled(autoClassificationSelectCountryAndIdClassScreen.isContinueEnabled);
        personaMaterialButton.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(autoClassificationSelectCountryAndIdClassScreen, 14));
        personaMaterialButton.setText(autoClassificationSelectCountryAndIdClassScreen.continueButtonText);
        if (governmentIdStepStyle3 == null) {
            return;
        }
        Integer backgroundColorValue = governmentIdStepStyle3.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int intValue = backgroundColorValue.intValue();
            coordinatorLayout.setBackgroundColor(intValue);
            Context context = coordinatorLayout.getContext();
            context.getClass();
            zzat.updateSystemUiColor(viewEnvironment, context, intValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle3.getTitleStyle();
        if (titleStyle != null && (base7 = titleStyle.getBase()) != null && (base8 = base7.getBase()) != null) {
            TextStylingKt.style(textView3, base8, EmptySet.INSTANCE);
        }
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = governmentIdStepStyle3.getTextStyle();
        if (textStyle != null && (base5 = textStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            EmptySet emptySet = EmptySet.INSTANCE;
            TextStylingKt.style(textView2, base6, emptySet);
            TextStylingKt.style(textView, base6, emptySet);
        }
        StepStyles.GovernmentIdStepInputSelectStyle inputSelectStyle3 = governmentIdStepStyle3.getInputSelectStyle();
        if (inputSelectStyle3 != null && (base3 = inputSelectStyle3.getBase()) != null && (base4 = base3.getBase()) != null) {
            InputSelectStylingKt.style(textInputLayout, base4);
            InputSelectStylingKt.style(textInputLayout2, base4);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle3.getButtonPrimaryStyle();
        if (buttonPrimaryStyle == null || (base = buttonPrimaryStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return;
        }
        ButtonStylingKt.style$default(personaMaterialButton, base2, false, false, 14);
    }
}
