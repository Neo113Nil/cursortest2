package com.squareup.cash.taptopay.viewmodels;

import com.squareup.cash.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'GENERIC' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class TapToPayErrorDialogViewModel {
    public static final /* synthetic */ TapToPayErrorDialogViewModel[] $VALUES;
    public static final TapToPayErrorDialogViewModel ANDROID_VERSION_NOT_SUPPORTED;
    public static final TapToPayErrorDialogViewModel CARD_TAP;
    public static final TapToPayErrorDialogViewModel GENERIC;
    public static final TapToPayErrorDialogViewModel PLAY_PROTECT;
    public static final TapToPayErrorDialogViewModel SCREEN_CASTING_ON;
    public final Integer messageResId;
    public final ErrorDialogAction$Action primaryButtonAction;
    public final int primaryButtonResId;
    public final int secondaryButtonResId;
    public final int titleResId;

    static {
        Integer valueOf = Integer.valueOf(R.string.tap_to_pay_generic_error_message);
        ErrorDialogAction$Action errorDialogAction$Action = ErrorDialogAction$Action.SUPPORT;
        ErrorDialogAction$Action errorDialogAction$Action2 = ErrorDialogAction$Action.SUPPORT;
        TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel = new TapToPayErrorDialogViewModel("GENERIC", 0, R.string.tap_to_pay_generic_error_title, valueOf, R.string.tap_to_pay_generic_error_button_support, errorDialogAction$Action, R.string.tap_to_pay_generic_error_button_okay);
        GENERIC = tapToPayErrorDialogViewModel;
        TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel2 = new TapToPayErrorDialogViewModel("PLAY_PROTECT", 1, R.string.tap_to_pay_play_protect_error_title, Integer.valueOf(R.string.tap_to_pay_play_protect_error_message), R.string.tap_to_pay_generic_error_button_support, errorDialogAction$Action, R.string.tap_to_pay_generic_error_button_okay);
        PLAY_PROTECT = tapToPayErrorDialogViewModel2;
        TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel3 = new TapToPayErrorDialogViewModel("CARD_TAP", 2, R.string.tap_to_pay_card_tap_error_title, Integer.valueOf(R.string.tap_to_pay_card_tap_error_message), R.string.tap_to_pay_generic_error_button_try_again, ErrorDialogAction$Action.TRY_AGAIN, R.string.tap_to_pay_generic_error_button_close);
        CARD_TAP = tapToPayErrorDialogViewModel3;
        Integer valueOf2 = Integer.valueOf(R.string.tap_to_pay_card_android_version_error_message);
        ErrorDialogAction$Action errorDialogAction$Action3 = ErrorDialogAction$Action.OPEN_SETTINGS;
        TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel4 = new TapToPayErrorDialogViewModel("ANDROID_VERSION_NOT_SUPPORTED", 3, R.string.tap_to_pay_card_android_version_error_title, valueOf2, R.string.tap_to_pay_generic_error_button_open_settings, errorDialogAction$Action3, R.string.tap_to_pay_generic_error_button_close);
        ANDROID_VERSION_NOT_SUPPORTED = tapToPayErrorDialogViewModel4;
        TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel5 = new TapToPayErrorDialogViewModel("SCREEN_CASTING_ON", 4, R.string.tap_to_pay_screen_recording_casting_title, Integer.valueOf(R.string.tap_to_pay_screen_recording_casting_message), R.string.tap_to_pay_generic_error_button_open_settings, errorDialogAction$Action3, R.string.tap_to_pay_generic_error_button_close);
        SCREEN_CASTING_ON = tapToPayErrorDialogViewModel5;
        $VALUES = new TapToPayErrorDialogViewModel[]{tapToPayErrorDialogViewModel, tapToPayErrorDialogViewModel2, tapToPayErrorDialogViewModel3, tapToPayErrorDialogViewModel4, tapToPayErrorDialogViewModel5};
    }

    public TapToPayErrorDialogViewModel(String str, int i, int i2, Integer num, int i3, ErrorDialogAction$Action errorDialogAction$Action, int i4) {
        ErrorDialogAction$Action errorDialogAction$Action2 = ErrorDialogAction$Action.SUPPORT;
        this.titleResId = i2;
        this.messageResId = num;
        this.primaryButtonResId = i3;
        this.primaryButtonAction = errorDialogAction$Action;
        this.secondaryButtonResId = i4;
    }

    public static TapToPayErrorDialogViewModel valueOf(String str) {
        return (TapToPayErrorDialogViewModel) Enum.valueOf(TapToPayErrorDialogViewModel.class, str);
    }

    public static TapToPayErrorDialogViewModel[] values() {
        return (TapToPayErrorDialogViewModel[]) $VALUES.clone();
    }
}
