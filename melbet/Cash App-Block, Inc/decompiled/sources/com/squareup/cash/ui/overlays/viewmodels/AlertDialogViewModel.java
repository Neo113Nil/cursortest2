package com.squareup.cash.ui.overlays.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AlertDialogViewModel {

    public final class Dismissed implements AlertDialogViewModel {
        public static final Dismissed INSTANCE = new Dismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return 1353044791;
        }

        public final String toString() {
            return "Dismissed";
        }
    }

    /* loaded from: classes6.dex */
    public final class Show implements AlertDialogViewModel {
        public final String message;
        public final String negativeButton;

        public Show(String str, String str2) {
            this.message = str;
            this.negativeButton = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Show)) {
                return false;
            }
            Show show = (Show) obj;
            return Intrinsics.areEqual(this.message, show.message) && Intrinsics.areEqual(this.negativeButton, show.negativeButton);
        }

        public final int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 961;
            String str2 = this.negativeButton;
            return Boolean.hashCode(true) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Show(title=null, message=", this.message, ", positiveButton=null, negativeButton=", this.negativeButton, ", tapOutsideToDismiss=true)");
        }
    }
}
