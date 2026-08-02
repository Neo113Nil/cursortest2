package com.squareup.cash.transactionpicker.viewmodels;

/* loaded from: classes7.dex */
public abstract class TransactionPickerViewEvent {

    public final class ExitFlow extends TransactionPickerViewEvent {
        public static final ExitFlow INSTANCE = new ExitFlow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitFlow);
        }

        public final int hashCode() {
            return -1407491322;
        }

        public final String toString() {
            return "ExitFlow";
        }
    }

    public final class SelectTransaction extends TransactionPickerViewEvent {
        public final String token;

        public SelectTransaction(String str) {
            this.token = str;
        }
    }
}
