package com.squareup.cash.taptopay.viewmodels;

/* loaded from: classes7.dex */
public final class TapToPayErrorDialogViewEvent {
    public final ErrorDialogAction$Action action;

    public TapToPayErrorDialogViewEvent(ErrorDialogAction$Action errorDialogAction$Action) {
        this.action = errorDialogAction$Action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapToPayErrorDialogViewEvent) && this.action == ((TapToPayErrorDialogViewEvent) obj).action;
    }

    public final int hashCode() {
        return this.action.hashCode();
    }

    public final String toString() {
        return "TapToPayErrorDialogViewEvent(action=" + this.action + ")";
    }
}
