package com.squareup.cash.ui.widget.amount;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes7.dex */
public abstract class Digit {
    public Digit leftOf;

    public final class CurrencySymbol extends Digit {
        public final String symbol;

        public CurrencySymbol(String str) {
            str.getClass();
            this.symbol = str;
        }

        public final String toString() {
            return this.symbol;
        }
    }

    public final class EmptyZero extends Digit {
        public final int createdAfter;

        public EmptyZero(int i) {
            this.createdAfter = i;
        }

        public final String toString() {
            return "0";
        }
    }

    public final class Number extends Digit {
        public final boolean last;
        public final int number;

        public Number(int i, boolean z) {
            this.number = i;
            this.last = z;
            if (i < 0 || i >= 10) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                throw null;
            }
        }

        public final String toString() {
            return String.valueOf((char) (this.number + 48));
        }
    }

    public final class Symbol extends Digit {
        public final char character;

        public Symbol(char c) {
            this.character = c;
        }

        public final String toString() {
            return String.valueOf(this.character);
        }
    }

    public final boolean isComma$amountview() {
        return (this instanceof Symbol) && ((Symbol) this).character == ',';
    }

    public final boolean isDecimalPoint$amountview() {
        return (this instanceof Symbol) && ((Symbol) this).character == '.';
    }

    public final boolean isLastZero$amountview() {
        if (!(this instanceof Number)) {
            return false;
        }
        Number number = (Number) this;
        return number.number == 0 && number.last;
    }
}
