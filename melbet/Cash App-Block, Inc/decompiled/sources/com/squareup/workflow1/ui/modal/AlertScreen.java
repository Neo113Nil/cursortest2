package com.squareup.workflow1.ui.modal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt$$ExternalSyntheticLambda4;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes8.dex */
public final class AlertScreen {
    public final Map buttons;
    public final String message;
    public final SelfieV1UtilsKt$$ExternalSyntheticLambda4 onEvent;
    public final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Button {
        public static final /* synthetic */ Button[] $VALUES;
        public static final Button POSITIVE;

        static {
            Button button = new Button("POSITIVE", 0);
            POSITIVE = button;
            $VALUES = new Button[]{button, new Button("NEGATIVE", 1), new Button("NEUTRAL", 2)};
        }

        public static Button valueOf(String str) {
            return (Button) Enum.valueOf(Button.class, str);
        }

        public static Button[] values() {
            return (Button[]) $VALUES.clone();
        }
    }

    /* loaded from: classes9.dex */
    public abstract class Event {
    }

    public AlertScreen(Map map, String str, SelfieV1UtilsKt$$ExternalSyntheticLambda4 selfieV1UtilsKt$$ExternalSyntheticLambda4) {
        map.getClass();
        str.getClass();
        this.buttons = map;
        this.message = str;
        this.title = "";
        this.onEvent = selfieV1UtilsKt$$ExternalSyntheticLambda4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (AlertScreen.class.equals(obj == null ? null : obj.getClass())) {
            if (obj == null) {
                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.AlertScreen");
                return false;
            }
            AlertScreen alertScreen = (AlertScreen) obj;
            if (this.buttons.equals(alertScreen.buttons) && this.message.equals(alertScreen.message) && this.title.equals(alertScreen.title)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.buttons.hashCode() * 31, 31, this.message), 31, this.title);
    }

    public final String toString() {
        return "AlertScreen(buttons=" + this.buttons + ", message=" + this.message + ", title=" + this.title + ", cancelable=true, onEvent=" + this.onEvent + ')';
    }
}
