package com.squareup.cash.upsell.viewmodels;

import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class UiGroupElementViewModel {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ButtonStyle {
        public static final /* synthetic */ ButtonStyle[] $VALUES;
        public static final ButtonStyle PRIMARY;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0);
            PRIMARY = buttonStyle;
            $VALUES = new ButtonStyle[]{buttonStyle, new ButtonStyle("SECONDARY", 1)};
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }
    }

    public final class ButtonViewModel extends UiGroupElementViewModel {
        public final String text;

        public ButtonViewModel(String str) {
            ButtonStyle buttonStyle = ButtonStyle.PRIMARY;
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonViewModel) || !Intrinsics.areEqual(this.text, ((ButtonViewModel) obj).text)) {
                return false;
            }
            ButtonStyle buttonStyle = ButtonStyle.PRIMARY;
            return true;
        }

        public final int hashCode() {
            return (ButtonStyle.PRIMARY.hashCode() + (this.text.hashCode() * 31)) * 961;
        }

        public final String toString() {
            return "ButtonViewModel(text=" + this.text + ", style=" + ButtonStyle.PRIMARY + ", url=, treatment=)";
        }
    }

    public final class DrawableViewModel extends UiGroupElementViewModel {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DrawableViewModel);
        }

        public final int hashCode() {
            return Integer.hashCode(R.drawable.stablecoin_null_state_carousel_image);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(R.drawable.stablecoin_null_state_carousel_image, "DrawableViewModel(resourceId=", ")");
        }
    }

    public final class SpaceViewModel extends UiGroupElementViewModel {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SpaceViewModel);
        }

        public final int hashCode() {
            return Integer.hashCode(24);
        }

        public final String toString() {
            return "SpaceViewModel(heightDp=24)";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TextStyle {
        public static final /* synthetic */ TextStyle[] $VALUES;
        public static final TextStyle HEADLINE;
        public static final TextStyle SUBTITLE;

        /* JADX INFO: Fake field, exist only in values array */
        TextStyle EF0;

        static {
            TextStyle textStyle = new TextStyle("TITLE", 0);
            TextStyle textStyle2 = new TextStyle("HEADLINE", 1);
            HEADLINE = textStyle2;
            TextStyle textStyle3 = new TextStyle("SUBTITLE", 2);
            SUBTITLE = textStyle3;
            $VALUES = new TextStyle[]{textStyle, textStyle2, textStyle3};
        }

        public static TextStyle valueOf(String str) {
            return (TextStyle) Enum.valueOf(TextStyle.class, str);
        }

        public static TextStyle[] values() {
            return (TextStyle[]) $VALUES.clone();
        }
    }

    /* loaded from: classes6.dex */
    public final class TextViewModel extends UiGroupElementViewModel {
        public final TextStyle style;
        public final String text;

        public TextViewModel(String str, TextStyle textStyle) {
            str.getClass();
            this.text = str;
            this.style = textStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextViewModel)) {
                return false;
            }
            TextViewModel textViewModel = (TextViewModel) obj;
            return Intrinsics.areEqual(this.text, textViewModel.text) && this.style == textViewModel.style;
        }

        public final int hashCode() {
            return this.style.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return "TextViewModel(text=" + this.text + ", style=" + this.style + ")";
        }
    }
}
