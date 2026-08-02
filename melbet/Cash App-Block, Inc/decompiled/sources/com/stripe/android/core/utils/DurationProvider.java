package com.stripe.android.core.utils;

import android.os.SystemClock;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;

/* loaded from: classes8.dex */
public interface DurationProvider {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Key {
        public static final /* synthetic */ Key[] $VALUES;
        public static final Key Captcha;
        public static final Key CaptchaAttach;
        public static final Key IntentConfirmationChallenge;
        public static final Key IntentConfirmationChallengeWebViewLoaded;
        public static final Key PaymentLauncher;

        /* JADX INFO: Fake field, exist only in values array */
        Key EF1;

        static {
            Key key = new Key("Loading", 0);
            Key key2 = new Key("PaymentSheetLoadIsGooglePaySupported", 1);
            Key key3 = new Key("PaymentSheetLoadIsGooglePayReady", 2);
            Key key4 = new Key("PaymentSheetLoadRetrieveSavedPaymentMethodSelection", 3);
            Key key5 = new Key("PaymentSheetLoadSessionLoad", 4);
            Key key6 = new Key("PaymentSheetLoadCreateLinkState", 5);
            Key key7 = new Key("PaymentSheetLoadCreateCustomerState", 6);
            Key key8 = new Key("PaymentSheetLoadRetrieveInitialPaymentSelection", 7);
            Key key9 = new Key("Checkout", 8);
            Key key10 = new Key("LinkSignup", 9);
            Key key11 = new Key("ConfirmButtonClicked", 10);
            Key key12 = new Key("TapToAdd", 11);
            Key key13 = new Key("CardScan", 12);
            Key key14 = new Key("Captcha", 13);
            Captcha = key14;
            Key key15 = new Key("CaptchaAttach", 14);
            CaptchaAttach = key15;
            Key key16 = new Key("PaymentLauncher", 15);
            PaymentLauncher = key16;
            Key key17 = new Key("PrepareAttestation", 16);
            Key key18 = new Key("Attest", 17);
            Key key19 = new Key("IntentConfirmationChallenge", 18);
            IntentConfirmationChallenge = key19;
            Key key20 = new Key("IntentConfirmationChallengeWebViewLoaded", 19);
            IntentConfirmationChallengeWebViewLoaded = key20;
            $VALUES = new Key[]{key, key2, key3, key4, key5, key6, key7, key8, key9, key10, key11, key12, key13, key14, key15, key16, key17, key18, key19, key20, new Key("PaymentMethodMessaging", 20)};
        }

        public static Key valueOf(String str) {
            return (Key) Enum.valueOf(Key.class, str);
        }

        public static Key[] values() {
            return (Key[]) $VALUES.clone();
        }
    }

    static void start$default(DurationProvider durationProvider, Key key) {
        DefaultDurationProvider defaultDurationProvider = (DefaultDurationProvider) durationProvider;
        defaultDurationProvider.store.put(key, Long.valueOf(SystemClock.uptimeMillis()));
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = defaultDurationProvider.logger;
        key.name();
        logger$Companion$NOOP_LOGGER$1.getClass();
    }
}
