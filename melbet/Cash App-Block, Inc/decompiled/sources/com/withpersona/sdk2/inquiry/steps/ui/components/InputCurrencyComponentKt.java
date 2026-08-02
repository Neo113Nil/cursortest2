package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.internal.zzi;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.BitmapController;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputNumberBinding;
import io.noties.markwon.MarkwonImpl;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.LinkedList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public abstract class InputCurrencyComponentKt {
    public static final TextInputLayout makeView(final InputCurrencyComponent inputCurrencyComponent, MarkwonImpl markwonImpl, InputCurrency inputCurrency) {
        final Pi2UiInputNumberBinding inflate = Pi2UiInputNumberBinding.inflate((LayoutInflater) markwonImpl.visitorFactory);
        TextInputEditText textInputEditText = (TextInputEditText) inflate.editText;
        TextInputLayout textInputLayout = (TextInputLayout) inflate.inputLayout;
        InputCurrency.Attributes attributes = inputCurrency.getAttributes();
        String str = "USD";
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                textInputLayout.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                textInputLayout.setPlaceholderText(placeholder);
                zzi.applyPlaceholderFix(textInputLayout);
            }
            String currencyCode = attributes.getCurrencyCode();
            if (currencyCode != null) {
                str = currencyCode;
            }
        }
        final Currency currency = Currency.getInstance(str);
        final NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currency);
        final NumberFormat numberFormat = NumberFormat.getInstance();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Editable text = textInputEditText.getText();
        ref$ObjectRef.element = text != null ? text.toString() : null;
        TextWatcher textWatcher = new TextWatcher() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponentKt$makeView$1$textWatcher$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TextInputEditText textInputEditText2 = (TextInputEditText) inflate.editText;
                String valueOf = String.valueOf(editable);
                Ref$ObjectRef ref$ObjectRef2 = Ref$ObjectRef.this;
                if (valueOf.equals(ref$ObjectRef2.element) || editable == null || StringsKt.isBlank(editable)) {
                    return;
                }
                textInputEditText2.removeTextChangedListener(this);
                String quote = Pattern.quote(currency.getSymbol());
                quote.getClass();
                String replace = new Regex(quote).replace(editable, "");
                StringBuilder sb = new StringBuilder();
                int length = replace.length();
                for (int i = 0; i < length; i++) {
                    char charAt = replace.charAt(i);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                Number parse = numberFormat.parse(sb.toString());
                if (parse != null) {
                    double doubleValue = parse.doubleValue() / 100.0d;
                    String format2 = currencyInstance.format(doubleValue);
                    ref$ObjectRef2.element = format2;
                    textInputEditText2.setText(format2);
                    textInputEditText2.setSelection(format2.length());
                    textInputEditText2.addTextChangedListener(this);
                    BitmapController bitmapController = inputCurrencyComponent.numberController;
                    bitmapController._bitmapValue.setValue(Double.valueOf(doubleValue));
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        Number number = inputCurrencyComponent.value;
        if (number != null) {
            try {
                textInputEditText.setText(currencyInstance.format(number.doubleValue()));
            } catch (Exception unused) {
            }
        }
        textInputEditText.addTextChangedListener(textWatcher);
        ((LinkedList) markwonImpl.plugins).add(new StateFlowsKt$$ExternalSyntheticLambda2(28, inputCurrency, inflate));
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.rootView;
        textInputLayout2.getClass();
        return textInputLayout2;
    }
}
