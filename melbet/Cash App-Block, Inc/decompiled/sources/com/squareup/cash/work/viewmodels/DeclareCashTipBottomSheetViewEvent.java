package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface DeclareCashTipBottomSheetViewEvent {

    public final class Dismiss implements DeclareCashTipBottomSheetViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 775164559;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    /* loaded from: classes6.dex */
    public final class SaveClicked implements DeclareCashTipBottomSheetViewEvent {
        public final String amountText;

        public SaveClicked(String str) {
            str.getClass();
            this.amountText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveClicked) && Intrinsics.areEqual(this.amountText, ((SaveClicked) obj).amountText);
        }

        public final int hashCode() {
            return this.amountText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SaveClicked(amountText=", this.amountText, ")");
        }
    }
}
