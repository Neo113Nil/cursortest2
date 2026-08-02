package com.squareup.cash.support.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SupportPhoneStatusViewModel {

    public final class Loaded implements SupportPhoneStatusViewModel {
        public final Status activeStatus;
        public final boolean allowCancellation;
        public final PhoneButtonViewModel button;
        public final String message;
        public final String title;

        public final class PhoneButtonViewModel {
            public final SupportPhoneStatusViewEvent event;
            public final String text;

            public PhoneButtonViewModel(String str, SupportPhoneStatusViewEvent supportPhoneStatusViewEvent) {
                str.getClass();
                this.text = str;
                this.event = supportPhoneStatusViewEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PhoneButtonViewModel)) {
                    return false;
                }
                PhoneButtonViewModel phoneButtonViewModel = (PhoneButtonViewModel) obj;
                return Intrinsics.areEqual(this.text, phoneButtonViewModel.text) && this.event.equals(phoneButtonViewModel.event);
            }

            public final int hashCode() {
                return this.event.hashCode() + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return "PhoneButtonViewModel(text=" + this.text + ", event=" + this.event + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Status {
            public static final /* synthetic */ Status[] $VALUES;
            public static final Status CANCELLED;
            public static final Status COMPLETED;
            public static final Status ERROR;
            public static final Status FAILED_TO_QUEUE;
            public static final Status IN_QUEUE;
            public static final Status MISSED;

            static {
                Status status = new Status("CANCELLED", 0);
                CANCELLED = status;
                Status status2 = new Status("MISSED", 1);
                MISSED = status2;
                Status status3 = new Status("COMPLETED", 2);
                COMPLETED = status3;
                Status status4 = new Status("IN_QUEUE", 3);
                IN_QUEUE = status4;
                Status status5 = new Status("ERROR", 4);
                ERROR = status5;
                Status status6 = new Status("FAILED_TO_QUEUE", 5);
                FAILED_TO_QUEUE = status6;
                $VALUES = new Status[]{status, status2, status3, status4, status5, status6};
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        public Loaded(String str, String str2, boolean z, PhoneButtonViewModel phoneButtonViewModel, Status status) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.message = str2;
            this.allowCancellation = z;
            this.button = phoneButtonViewModel;
            this.activeStatus = status;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.message, loaded.message) && this.allowCancellation == loaded.allowCancellation && this.button.equals(loaded.button) && this.activeStatus == loaded.activeStatus;
        }

        public final int hashCode() {
            return this.activeStatus.hashCode() + ((this.button.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.allowCancellation)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", message=", this.message, ", allowCancellation=");
            m.append(this.allowCancellation);
            m.append(", button=");
            m.append(this.button);
            m.append(", activeStatus=");
            m.append(this.activeStatus);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements SupportPhoneStatusViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -2125836109;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
