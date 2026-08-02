package com.squareup.cash.transfers.views;

import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;

/* loaded from: classes7.dex */
public final class ManagedAccountKeypadListener implements KeypadAmount.OnAmountChangedListener {
    public final /* synthetic */ int $r8$classId;
    public final AmountDisplayState amountDisplayState;
    public final Shaker shaker;
    public final RealCashVibrator vibrator;

    public ManagedAccountKeypadListener(AmountDisplayState amountDisplayState, RealCashVibrator realCashVibrator, Shaker shaker) {
        this.$r8$classId = 0;
        shaker.getClass();
        this.amountDisplayState = amountDisplayState;
        this.vibrator = realCashVibrator;
        this.shaker = shaker;
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public final void onCharacterAdded(KeypadAmount keypadAmount, char c) {
        int i = this.$r8$classId;
        AmountDisplayState amountDisplayState = this.amountDisplayState;
        switch (i) {
            case 0:
                amountDisplayState.add(c);
                break;
            case 1:
                amountDisplayState.add(c);
                break;
            default:
                amountDisplayState.add(c);
                break;
        }
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public final void onCharacterRemoved(KeypadAmount keypadAmount) {
        int i = this.$r8$classId;
        AmountDisplayState amountDisplayState = this.amountDisplayState;
        switch (i) {
            case 0:
                amountDisplayState.delete();
                break;
            case 1:
                amountDisplayState.delete();
                break;
            default:
                amountDisplayState.delete();
                break;
        }
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public final void onInvalidChange() {
        int i = this.$r8$classId;
        RealCashVibrator realCashVibrator = this.vibrator;
        Shaker shaker = this.shaker;
        switch (i) {
            case 0:
                shaker.shake();
                if (realCashVibrator != null) {
                    realCashVibrator.error();
                    break;
                }
                break;
            case 1:
                shaker.shake();
                if (realCashVibrator != null) {
                    realCashVibrator.error();
                    break;
                }
                break;
            default:
                shaker.shake();
                realCashVibrator.error();
                break;
        }
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public final void onReset(KeypadAmount keypadAmount) {
        int i = this.$r8$classId;
        AmountDisplayState amountDisplayState = this.amountDisplayState;
        switch (i) {
            case 0:
                AmountDisplayState.reset$default(amountDisplayState, keypadAmount.amountText, 2);
                break;
            case 1:
                AmountDisplayState.reset$default(amountDisplayState, keypadAmount.amountText, 2);
                break;
            default:
                AmountDisplayState.reset$default(amountDisplayState, keypadAmount.amountText, 2);
                break;
        }
    }

    public /* synthetic */ ManagedAccountKeypadListener(AmountDisplayState amountDisplayState, Shaker shaker, RealCashVibrator realCashVibrator, int i) {
        this.$r8$classId = i;
        this.amountDisplayState = amountDisplayState;
        this.shaker = shaker;
        this.vibrator = realCashVibrator;
    }

    @Override // com.squareup.cash.ui.widget.keypad.KeypadAmount.OnAmountChangedListener
    public final void onReset() {
        int i = this.$r8$classId;
        AmountDisplayState amountDisplayState = this.amountDisplayState;
        switch (i) {
            case 0:
                AmountDisplayState.reset$default(amountDisplayState, null, 3);
                break;
            case 1:
                AmountDisplayState.reset$default(amountDisplayState, null, 3);
                break;
            default:
                AmountDisplayState.reset$default(amountDisplayState, null, 3);
                break;
        }
    }
}
