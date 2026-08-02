package com.squareup.cash.support.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PhoneVerificationViewModel {

    public final class Loaded implements PhoneVerificationViewModel {
        public final List buttons;
        public final boolean phoneVerificationResultSuccess;
        public final Status status;
        public final String subTitle;
        public final String title;

        public final class ButtonViewModel {
            public final PhoneVerificationEvents event;
            public final String text;

            public ButtonViewModel(String str, PhoneVerificationEvents phoneVerificationEvents) {
                str.getClass();
                this.text = str;
                this.event = phoneVerificationEvents;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ButtonViewModel)) {
                    return false;
                }
                ButtonViewModel buttonViewModel = (ButtonViewModel) obj;
                return Intrinsics.areEqual(this.text, buttonViewModel.text) && this.event.equals(buttonViewModel.event);
            }

            public final int hashCode() {
                return this.event.hashCode() + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return "ButtonViewModel(text=" + this.text + ", event=" + this.event + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Status {
            public static final /* synthetic */ Status[] $VALUES;
            public static final Status EXPIRED;
            public static final Status FAILED_PIN;
            public static final Status INVALID;
            public static final Status PENDING;
            public static final Status REJECTED;
            public static final Status RESPONDING;
            public static final Status VERIFIED;

            static {
                Status status = new Status("PENDING", 0);
                PENDING = status;
                Status status2 = new Status("RESPONDING", 1);
                RESPONDING = status2;
                Status status3 = new Status("VERIFIED", 2);
                VERIFIED = status3;
                Status status4 = new Status("REJECTED", 3);
                REJECTED = status4;
                Status status5 = new Status("INVALID", 4);
                INVALID = status5;
                Status status6 = new Status("EXPIRED", 5);
                EXPIRED = status6;
                Status status7 = new Status("FAILED_PIN", 6);
                FAILED_PIN = status7;
                $VALUES = new Status[]{status, status2, status3, status4, status5, status6, status7};
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        public Loaded(String str, String str2, Status status, List list, boolean z) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
            this.title = str;
            this.subTitle = str2;
            this.status = status;
            this.buttons = list;
            this.phoneVerificationResultSuccess = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subTitle, loaded.subTitle) && this.status == loaded.status && Intrinsics.areEqual(this.buttons, loaded.buttons) && this.phoneVerificationResultSuccess == loaded.phoneVerificationResultSuccess;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.phoneVerificationResultSuccess) + Recorder$$ExternalSyntheticOutline2.m((this.status.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subTitle)) * 31, 31, this.buttons);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", subTitle=", this.subTitle, ", status=");
            m.append(this.status);
            m.append(", buttons=");
            m.append(this.buttons);
            m.append(", phoneVerificationResultSuccess=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.phoneVerificationResultSuccess, ")");
        }
    }

    public final class Loading implements PhoneVerificationViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2035726103;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
