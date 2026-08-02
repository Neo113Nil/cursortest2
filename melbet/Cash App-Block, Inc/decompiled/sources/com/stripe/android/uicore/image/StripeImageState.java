package com.stripe.android.uicore.image;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class StripeImageState {

    /* loaded from: classes6.dex */
    public final class Error extends StripeImageState {
        public static final Error INSTANCE = new Error();
        public static final Error INSTANCE$1 = new Error();
    }

    /* loaded from: classes7.dex */
    public final class Success extends StripeImageState {
        public final Painter painter;

        public Success(Painter painter) {
            painter.getClass();
            this.painter = painter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.painter, ((Success) obj).painter);
        }

        public final int hashCode() {
            return this.painter.hashCode();
        }

        public final String toString() {
            return "Success(painter=" + this.painter + ")";
        }
    }
}
