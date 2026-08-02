package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInternationalDbFieldBinding;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import kotlin.text.Regex$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class InputInternationalDbComponentKt {
    public static final ConstraintLayout makeView(InputInternationalDbComponent inputInternationalDbComponent, MarkwonImpl markwonImpl, InputInternationalDb inputInternationalDb) {
        View inflate = ((LayoutInflater) markwonImpl.visitorFactory).inflate(R.layout.pi2_ui_international_db_field, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i = R.id.idb_country_input;
        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(inflate, R.id.idb_country_input);
        if (textInputLayout != null) {
            i = R.id.idb_country_text_view;
            if (((AutoCompleteTextView) ViewBindings.findChildViewById(inflate, R.id.idb_country_text_view)) != null) {
                i = R.id.idb_description;
                TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.idb_description);
                if (textView != null) {
                    i = R.id.idb_id_type_input;
                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(inflate, R.id.idb_id_type_input);
                    if (textInputLayout2 != null) {
                        i = R.id.idb_id_type_text_view;
                        if (((AutoCompleteTextView) ViewBindings.findChildViewById(inflate, R.id.idb_id_type_text_view)) != null) {
                            i = R.id.idb_label;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.idb_label);
                            if (textView2 != null) {
                                i = R.id.idb_value_input;
                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(inflate, R.id.idb_value_input);
                                if (textInputLayout3 != null) {
                                    i = R.id.idb_value_text_view;
                                    if (((TextInputEditText) ViewBindings.findChildViewById(inflate, R.id.idb_value_text_view)) != null) {
                                        Pi2UiInternationalDbFieldBinding pi2UiInternationalDbFieldBinding = new Pi2UiInternationalDbFieldBinding(constraintLayout, textInputLayout, textView, textInputLayout2, textView2, textInputLayout3);
                                        InputInternationalDb.Attributes attributes = inputInternationalDb.getAttributes();
                                        textView2.setText(attributes != null ? attributes.getLabel() : null);
                                        textInputLayout.setHint(attributes != null ? attributes.getLabelIdbCountry() : null);
                                        textInputLayout2.setHint(attributes != null ? attributes.getLabelIdbType() : null);
                                        textInputLayout3.setHint(attributes != null ? attributes.getLabelIdbValue() : null);
                                        EditText editText = textInputLayout3.editText;
                                        if (editText != null) {
                                            zzna.control(inputInternationalDbComponent.idValueController, editText);
                                        }
                                        ((LinkedList) markwonImpl.plugins).add(new Regex$$ExternalSyntheticLambda1(2, inputInternationalDb, pi2UiInternationalDbFieldBinding));
                                        constraintLayout.setTag(pi2UiInternationalDbFieldBinding);
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
