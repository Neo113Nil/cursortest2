package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.OptionWithDescription;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2NavigationBarBinding;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputRadioGroupBinding;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex$$ExternalSyntheticLambda1;
import kotlin.text.StringsKt;
import sqip.internal.BaseCardEntryActivity$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class InputRadioGroupComponentKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v3, types: [android.widget.LinearLayout] */
    public static final LinearLayout makeView(final InputRadioGroupComponent inputRadioGroupComponent, MarkwonImpl markwonImpl, final InputRadioGroup inputRadioGroup) {
        List<OptionWithDescription> list;
        TextBasedComponentStyle errorTextStyle;
        LayoutInflater layoutInflater = (LayoutInflater) markwonImpl.visitorFactory;
        LinkedList linkedList = (LinkedList) markwonImpl.plugins;
        String str = null;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.pi2_ui_input_radio_group, (ViewGroup) null, false);
        int i = R.id.radio_button_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.radio_button_container);
        if (linearLayout != null) {
            i = R.id.radio_group_error;
            TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.radio_group_error);
            if (textView != null) {
                i = R.id.radio_group_label;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.radio_group_label);
                if (textView2 != null) {
                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                    final Pi2UiInputRadioGroupBinding pi2UiInputRadioGroupBinding = new Pi2UiInputRadioGroupBinding(linearLayout2, linearLayout, textView, textView2);
                    InputRadioGroup.Attributes attributes = inputRadioGroup.getAttributes();
                    final ArrayList arrayList = new ArrayList();
                    if (attributes == null || (list = attributes.getOptions()) == null) {
                        list = EmptyList.INSTANCE;
                    }
                    for (final OptionWithDescription optionWithDescription : list) {
                        ?? r26 = str;
                        View inflate2 = layoutInflater.inflate(R.layout.pi2_radio_button, linearLayout2, z);
                        int i2 = R.id.radio_button;
                        MaterialRadioButton materialRadioButton = (MaterialRadioButton) ViewBindings.findChildViewById(inflate2, R.id.radio_button);
                        if (materialRadioButton != null) {
                            i2 = R.id.radio_button_description;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate2, R.id.radio_button_description);
                            if (textView3 != null) {
                                i2 = R.id.radio_button_label;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(inflate2, R.id.radio_button_label);
                                if (textView4 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate2;
                                    Pi2NavigationBarBinding pi2NavigationBarBinding = new Pi2NavigationBarBinding(constraintLayout, materialRadioButton, textView3, textView4, 2);
                                    ExtensionsKt.setMarkdown(textView4, optionWithDescription.getText());
                                    String descriptionText = optionWithDescription.getDescriptionText();
                                    if (descriptionText == null || StringsKt.isBlank(descriptionText)) {
                                        textView3.setVisibility(8);
                                    } else {
                                        textView3.setVisibility(0);
                                        ExtensionsKt.setMarkdown(textView3, descriptionText);
                                    }
                                    linkedList.add(new Regex$$ExternalSyntheticLambda1(7, inputRadioGroup, pi2NavigationBarBinding));
                                    materialRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponentKt$$ExternalSyntheticLambda1
                                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                                            List<OptionWithDescription> options;
                                            Object obj;
                                            compoundButton.getClass();
                                            if (z2) {
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj2 : arrayList) {
                                                    if (!Intrinsics.areEqual((RadioButton) obj2, compoundButton)) {
                                                        arrayList2.add(obj2);
                                                    }
                                                }
                                                Iterator it = arrayList2.iterator();
                                                while (it.hasNext()) {
                                                    ((RadioButton) it.next()).setChecked(false);
                                                }
                                                String text = optionWithDescription.getText();
                                                InputRadioGroup.Attributes attributes2 = inputRadioGroup.getAttributes();
                                                String str2 = null;
                                                if (attributes2 != null && (options = attributes2.getOptions()) != null) {
                                                    Iterator<T> it2 = options.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            obj = it2.next();
                                                            if (Intrinsics.areEqual(((OptionWithDescription) obj).getText(), text)) {
                                                                break;
                                                            }
                                                        } else {
                                                            obj = null;
                                                            break;
                                                        }
                                                    }
                                                    OptionWithDescription optionWithDescription2 = (OptionWithDescription) obj;
                                                    if (optionWithDescription2 != null) {
                                                        str2 = optionWithDescription2.getValue();
                                                    }
                                                }
                                                if (str2 != null) {
                                                    inputRadioGroupComponent.textController.setTextValue(str2);
                                                }
                                            }
                                        }
                                    });
                                    constraintLayout.setOnClickListener(new BaseCardEntryActivity$$ExternalSyntheticLambda1(pi2NavigationBarBinding, 2));
                                    pi2UiInputRadioGroupBinding.radioButtonContainer.addView(constraintLayout);
                                    arrayList.add(materialRadioButton);
                                    if (Intrinsics.areEqual(inputRadioGroupComponent.textController.getTextValue(), optionWithDescription.getValue())) {
                                        materialRadioButton.setChecked(true);
                                    }
                                    str = r26;
                                    z = false;
                                }
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                        return r26;
                    }
                    String str2 = str;
                    InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroup.getStyles();
                    if (styles != null && (errorTextStyle = styles.getErrorTextStyle()) != null) {
                        TextStylingKt.style(pi2UiInputRadioGroupBinding.radioGroupError, errorTextStyle, EmptySet.INSTANCE);
                    }
                    String label = attributes != null ? attributes.getLabel() : str2;
                    if (label == null || label.length() == 0) {
                        textView2.setVisibility(8);
                    } else {
                        final int i3 = 0;
                        textView2.setVisibility(0);
                        textView2.setText(label);
                        linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                TextBasedComponentStyle textBasedStyle;
                                StyleElements.SizeSet margins;
                                int i4 = i3;
                                Pi2UiInputRadioGroupBinding pi2UiInputRadioGroupBinding2 = pi2UiInputRadioGroupBinding;
                                InputRadioGroup inputRadioGroup2 = inputRadioGroup;
                                switch (i4) {
                                    case 0:
                                        InputRadioGroup.InputRadioGroupComponentStyle styles2 = inputRadioGroup2.getStyles();
                                        if (styles2 != null && (textBasedStyle = styles2.getTextBasedStyle()) != null) {
                                            TextStylingKt.style(pi2UiInputRadioGroupBinding2.radioGroupLabel, textBasedStyle, EmptySet.INSTANCE);
                                        }
                                        break;
                                    default:
                                        InputRadioGroup.InputRadioGroupComponentStyle styles3 = inputRadioGroup2.getStyles();
                                        if (styles3 != null && (margins = styles3.getMargins()) != null) {
                                            LinearLayout linearLayout3 = pi2UiInputRadioGroupBinding2.rootView;
                                            linearLayout3.getClass();
                                            ViewUtilsKt.setMargins(linearLayout3, margins);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    final int i4 = 1;
                    linkedList.add(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            TextBasedComponentStyle textBasedStyle;
                            StyleElements.SizeSet margins;
                            int i42 = i4;
                            Pi2UiInputRadioGroupBinding pi2UiInputRadioGroupBinding2 = pi2UiInputRadioGroupBinding;
                            InputRadioGroup inputRadioGroup2 = inputRadioGroup;
                            switch (i42) {
                                case 0:
                                    InputRadioGroup.InputRadioGroupComponentStyle styles2 = inputRadioGroup2.getStyles();
                                    if (styles2 != null && (textBasedStyle = styles2.getTextBasedStyle()) != null) {
                                        TextStylingKt.style(pi2UiInputRadioGroupBinding2.radioGroupLabel, textBasedStyle, EmptySet.INSTANCE);
                                    }
                                    break;
                                default:
                                    InputRadioGroup.InputRadioGroupComponentStyle styles3 = inputRadioGroup2.getStyles();
                                    if (styles3 != null && (margins = styles3.getMargins()) != null) {
                                        LinearLayout linearLayout3 = pi2UiInputRadioGroupBinding2.rootView;
                                        linearLayout3.getClass();
                                        ViewUtilsKt.setMargins(linearLayout3, margins);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    linearLayout2.setTag(pi2UiInputRadioGroupBinding);
                    return linearLayout2;
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
