package com.squareup.cash.ui.widget.keypad;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.math.BigDecimal;
import java.math.MathContext;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes7.dex */
public final class KeypadAmount implements KeypadListener {
    public String amountText = "0";
    public long maxAmountCents = 9999999;
    public OnAmountChangedListener onAmountChangedListener;

    public interface OnAmountChangedListener {
        void onCharacterAdded(KeypadAmount keypadAmount, char c);

        void onCharacterRemoved(KeypadAmount keypadAmount);

        void onInvalidChange();

        void onReset();

        void onReset(KeypadAmount keypadAmount);
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onBackspace() {
        if (this.amountText.equals("0")) {
            OnAmountChangedListener onAmountChangedListener = this.onAmountChangedListener;
            if (onAmountChangedListener != null) {
                onAmountChangedListener.onInvalidChange();
                return;
            }
            return;
        }
        StringsKt___StringsKt.last(this.amountText);
        String m1148m = Boxes$$ExternalSyntheticOutline1.m1148m(1, 0, this.amountText);
        this.amountText = m1148m;
        if (m1148m.equals("")) {
            this.amountText = "0";
        }
        OnAmountChangedListener onAmountChangedListener2 = this.onAmountChangedListener;
        if (onAmountChangedListener2 != null) {
            onAmountChangedListener2.onCharacterRemoved(this);
        }
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onDecimal() {
        if (!(this.amountText.equals("0") ? false : !StringsKt.contains((CharSequence) this.amountText, (CharSequence) ".", false))) {
            OnAmountChangedListener onAmountChangedListener = this.onAmountChangedListener;
            if (onAmountChangedListener != null) {
                onAmountChangedListener.onInvalidChange();
                return;
            }
            return;
        }
        this.amountText = this.amountText.concat(".");
        OnAmountChangedListener onAmountChangedListener2 = this.onAmountChangedListener;
        if (onAmountChangedListener2 != null) {
            onAmountChangedListener2.onCharacterAdded(this, '.');
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (new java.math.BigDecimal(r8.amountText + r9).movePointRight(2).longValueExact() > r8.maxAmountCents) goto L27;
     */
    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDigit(int i) {
        boolean z = false;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.amountText, ".", 0, false, 6);
        boolean z2 = indexOf$default == -1 || this.amountText.length() - (indexOf$default + 1) < 2;
        Integer valueOf = Integer.valueOf(indexOf$default);
        if (indexOf$default == -1) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : this.amountText.length()) >= 10) {
            z2 = false;
        }
        if (i == 0 && this.amountText.equals("0")) {
            z2 = false;
        }
        if (z2) {
        }
        z = z2;
        if (!z) {
            OnAmountChangedListener onAmountChangedListener = this.onAmountChangedListener;
            if (onAmountChangedListener != null) {
                onAmountChangedListener.onInvalidChange();
                return;
            }
            return;
        }
        if (this.amountText.equals("0")) {
            this.amountText = "";
        }
        this.amountText = this.amountText + i;
        OnAmountChangedListener onAmountChangedListener2 = this.onAmountChangedListener;
        if (onAmountChangedListener2 != null) {
            onAmountChangedListener2.onCharacterAdded(this, (char) (i + 48));
        }
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onLongBackspace() {
        if (this.amountText.equals("0")) {
            return;
        }
        this.amountText = "0";
        OnAmountChangedListener onAmountChangedListener = this.onAmountChangedListener;
        if (onAmountChangedListener != null) {
            onAmountChangedListener.onReset();
        }
    }

    public final void setMaxAmount(Double d) {
        this.maxAmountCents = new BigDecimal(d.doubleValue(), MathContext.DECIMAL64).movePointRight(2).longValue();
    }

    public final void setRawAmount(String str) {
        str.getClass();
        String replace$default = StringsKt__StringsJVMKt.replace$default(str, ",", "");
        if (this.amountText.equals(replace$default)) {
            return;
        }
        this.amountText = replace$default;
        OnAmountChangedListener onAmountChangedListener = this.onAmountChangedListener;
        if (onAmountChangedListener != null) {
            onAmountChangedListener.onReset(this);
        }
    }
}
