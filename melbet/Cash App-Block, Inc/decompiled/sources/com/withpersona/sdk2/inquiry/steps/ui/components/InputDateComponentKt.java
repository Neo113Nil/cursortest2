package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.adapter.StyleableSelectArrayAdapter;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class InputDateComponentKt {
    public static final ConstraintLayout makeView(InputDateComponent inputDateComponent, MarkwonImpl markwonImpl, MarkwonConfiguration markwonConfiguration, InputDate inputDate) {
        AttributeStyles.DateSelectBackgroundColorStyle backgroundColor;
        Integer inputSelectBackgroundColor;
        InputSelectComponentStyle inputSelectStyle;
        markwonConfiguration.getClass();
        TextBasedComponentStyle textBasedComponentStyle = null;
        View inflate = ((LayoutInflater) markwonImpl.visitorFactory).inflate(R.layout.pi2_ui_date_field, (ViewGroup) null, false);
        int i = R.id.date_label;
        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.date_label);
        if (textView != null) {
            i = R.id.day;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(inflate, R.id.day);
            if (textInputLayout != null) {
                i = R.id.day_edit_text;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(inflate, R.id.day_edit_text);
                if (textInputEditText != null) {
                    i = R.id.error_label;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.error_label);
                    if (textView2 != null) {
                        i = R.id.month;
                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(inflate, R.id.month);
                        if (textInputLayout2 != null) {
                            i = R.id.month_edit_text;
                            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) ViewBindings.findChildViewById(inflate, R.id.month_edit_text);
                            if (autoCompleteTextView != null) {
                                i = R.id.year;
                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(inflate, R.id.year);
                                if (textInputLayout3 != null) {
                                    i = R.id.year_edit_text;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(inflate, R.id.year_edit_text);
                                    if (textInputEditText2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                        Pi2UiDateFieldBinding pi2UiDateFieldBinding = new Pi2UiDateFieldBinding(constraintLayout, textView, textInputLayout, textInputEditText, textView2, textInputLayout2, autoCompleteTextView, textInputLayout3, textInputEditText2);
                                        InputDate.InputDateComponentStyle styles = inputDate.getStyles();
                                        InputDate.Attributes attributes = inputDate.getAttributes();
                                        if (attributes != null) {
                                            textView.setText(attributes.getLabel());
                                            List<String> textMonths = attributes.getTextMonths();
                                            if (textMonths == null) {
                                                textMonths = EmptyList.INSTANCE;
                                            }
                                            Context context = (Context) markwonImpl.parser;
                                            if (styles != null && (inputSelectStyle = styles.getInputSelectStyle()) != null) {
                                                textBasedComponentStyle = inputSelectStyle.getTextBasedStyle();
                                            }
                                            StyleableSelectArrayAdapter styleableSelectArrayAdapter = new StyleableSelectArrayAdapter(context, R.layout.pi2_ui_date_list_item, textMonths, textBasedComponentStyle);
                                            zzna.control((TextControllerImpl) markwonConfiguration.linkResolver, autoCompleteTextView);
                                            autoCompleteTextView.setAdapter(styleableSelectArrayAdapter);
                                            if (styles != null && (backgroundColor = styles.getBackgroundColor()) != null && (inputSelectBackgroundColor = backgroundColor.getInputSelectBackgroundColor()) != null) {
                                                autoCompleteTextView.setDropDownBackgroundDrawable(new ColorDrawable(inputSelectBackgroundColor.intValue()));
                                            }
                                            textInputLayout.setHint(attributes.getPlaceholderDay());
                                            zzna.control((TextControllerImpl) markwonConfiguration.imageDestinationProcessor, textInputEditText);
                                            textInputLayout3.setHint(attributes.getPlaceholderYear());
                                            zzna.control((TextControllerImpl) markwonConfiguration.syntaxHighlight, textInputEditText2);
                                        }
                                        ((LinkedList) markwonImpl.plugins).add(new StateFlowsKt$$ExternalSyntheticLambda2(29, styles, pi2UiDateFieldBinding));
                                        constraintLayout.setTag(pi2UiDateFieldBinding);
                                        return constraintLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
