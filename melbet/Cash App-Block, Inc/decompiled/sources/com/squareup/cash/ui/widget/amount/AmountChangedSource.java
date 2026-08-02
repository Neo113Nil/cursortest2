package com.squareup.cash.ui.widget.amount;

import android.net.Uri;
import android.view.InputEvent;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public abstract class AmountChangedSource {

    /* loaded from: classes7.dex */
    public final class AmountOverflow extends AmountChangedSource {
        public static final AmountOverflow INSTANCE = new AmountOverflow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AmountOverflow);
        }

        public final int hashCode() {
            return -196375643;
        }

        public final String toString() {
            return "AmountOverflow";
        }
    }

    /* loaded from: classes7.dex */
    public final class ConfigReset extends AmountChangedSource {
        public static final ConfigReset INSTANCE = new ConfigReset();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfigReset);
        }

        public final int hashCode() {
            return 739061730;
        }

        public final String toString() {
            return "ConfigReset";
        }
    }

    /* loaded from: classes7.dex */
    public final class DigitInput extends AmountChangedSource {
        public static final DigitInput INSTANCE = new DigitInput();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DigitInput);
        }

        public final int hashCode() {
            return -2040730808;
        }

        public final String toString() {
            return "DigitInput";
        }
    }

    /* loaded from: classes7.dex */
    public final class Reset extends AmountChangedSource {
        public static final Reset INSTANCE = new Reset();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Reset);
        }

        public final int hashCode() {
            return 1046926788;
        }

        public final String toString() {
            return "Reset";
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBitcoinBuyWithParams.deepLinkSpecs;
    }

    public abstract Object getMeasurementApiStatus(Continuation continuation);

    public abstract Object registerSource(Uri uri, InputEvent inputEvent, Continuation continuation);

    public abstract Object registerTrigger(Uri uri, Continuation continuation);
}
