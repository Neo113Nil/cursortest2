package com.squareup.cash.ui.widget.amount;

import androidx.room.util.CursorUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class AmountEvent {

    public final class AmountChanged extends AmountEvent {
        public final String rawAmount;
        public final AmountChangedSource source;

        public AmountChanged(String str, AmountChangedSource amountChangedSource) {
            amountChangedSource.getClass();
            this.rawAmount = str;
            this.source = amountChangedSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmountChanged)) {
                return false;
            }
            AmountChanged amountChanged = (AmountChanged) obj;
            return this.rawAmount.equals(amountChanged.rawAmount) && Intrinsics.areEqual(this.source, amountChanged.source);
        }

        public final int hashCode() {
            return this.source.hashCode() + (this.rawAmount.hashCode() * 31);
        }

        public final String toString() {
            return "AmountChanged(rawAmount=" + this.rawAmount + ", source=" + this.source + ")";
        }
    }

    public final class InvalidChange extends AmountEvent {
        public final CursorUtil validationResult;

        public InvalidChange(CursorUtil cursorUtil) {
            this.validationResult = cursorUtil;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidChange) && this.validationResult.equals(((InvalidChange) obj).validationResult);
        }

        public final int hashCode() {
            return this.validationResult.hashCode();
        }

        public final String toString() {
            return "InvalidChange(validationResult=" + this.validationResult + ")";
        }
    }
}
