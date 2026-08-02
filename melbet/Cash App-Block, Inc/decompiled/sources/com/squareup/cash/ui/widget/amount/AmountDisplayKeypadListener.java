package com.squareup.cash.ui.widget.amount;

import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.cash.ui.widget.keypad.KeypadListener;

/* loaded from: classes7.dex */
public final class AmountDisplayKeypadListener implements KeypadListener {
    public final AmountDisplayState state;

    public AmountDisplayKeypadListener(AmountDisplayState amountDisplayState) {
        this.state = amountDisplayState;
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onBackspace() {
        this.state.delete();
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onDecimal() {
        AmountDisplayState amountDisplayState = this.state;
        amountDisplayState.validateAndSet(amountDisplayState.getModel().append('.'), AmountChangedSource.DigitInput.INSTANCE);
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onDigit(int i) {
        AmountDisplayState amountDisplayState = this.state;
        if (amountDisplayState.isValidEntry(i)) {
            amountDisplayState.validateAndSet(amountDisplayState.getModel().append((char) (i + 48)), AmountChangedSource.DigitInput.INSTANCE);
        }
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadListener
    public final void onLongBackspace() {
        AmountDisplayState.reset$default(this.state, null, 3);
    }
}
