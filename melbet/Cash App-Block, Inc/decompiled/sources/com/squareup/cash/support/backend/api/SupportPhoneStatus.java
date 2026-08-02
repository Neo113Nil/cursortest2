package com.squareup.cash.support.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.protos.cash.tax.TaxEnvironment;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface SupportPhoneStatus {

    /* loaded from: classes7.dex */
    public final class Active implements SupportPhoneStatus, IsEligible {
        public final boolean allowCancellation;
        public final PhoneServiceAvailability availability;
        public final String message;
        public final String notificationMessage;
        public final String notificationTitle;
        public final ActiveStatus status;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ActiveStatus {
            public static final /* synthetic */ ActiveStatus[] $VALUES;
            public static final ActiveStatus CANCELLED;
            public static final ActiveStatus COMPLETED;
            public static final ActiveStatus FAILED_TO_QUEUE;
            public static final ActiveStatus IN_QUEUE;
            public static final ActiveStatus MISSED;

            static {
                ActiveStatus activeStatus = new ActiveStatus("IN_QUEUE", 0);
                IN_QUEUE = activeStatus;
                ActiveStatus activeStatus2 = new ActiveStatus("MISSED", 1);
                MISSED = activeStatus2;
                ActiveStatus activeStatus3 = new ActiveStatus("COMPLETED", 2);
                COMPLETED = activeStatus3;
                ActiveStatus activeStatus4 = new ActiveStatus("CANCELLED", 3);
                CANCELLED = activeStatus4;
                ActiveStatus activeStatus5 = new ActiveStatus("FAILED_TO_QUEUE", 4);
                FAILED_TO_QUEUE = activeStatus5;
                $VALUES = new ActiveStatus[]{activeStatus, activeStatus2, activeStatus3, activeStatus4, activeStatus5};
            }

            public static ActiveStatus valueOf(String str) {
                return (ActiveStatus) Enum.valueOf(ActiveStatus.class, str);
            }

            public static ActiveStatus[] values() {
                return (ActiveStatus[]) $VALUES.clone();
            }
        }

        /* loaded from: classes8.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SupportPhoneStatusResponse.ActiveStatus.values().length];
                try {
                    TaxEnvironment.Companion companion = SupportPhoneStatusResponse.ActiveStatus.Companion;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    TaxEnvironment.Companion companion2 = SupportPhoneStatusResponse.ActiveStatus.Companion;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    TaxEnvironment.Companion companion3 = SupportPhoneStatusResponse.ActiveStatus.Companion;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    TaxEnvironment.Companion companion4 = SupportPhoneStatusResponse.ActiveStatus.Companion;
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    TaxEnvironment.Companion companion5 = SupportPhoneStatusResponse.ActiveStatus.Companion;
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Active(SupportPhoneStatusResponse.Active active) {
            ActiveStatus activeStatus;
            active.getClass();
            SupportPhoneStatusResponse.ActiveStatus activeStatus2 = active.status;
            int i = activeStatus2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[activeStatus2.ordinal()];
            if (i == -1) {
                a$$ExternalSyntheticBUOutline0.m$3("Active proto missing status property");
                throw null;
            }
            if (i == 1) {
                activeStatus = ActiveStatus.IN_QUEUE;
            } else if (i == 2) {
                activeStatus = ActiveStatus.MISSED;
            } else if (i == 3) {
                activeStatus = ActiveStatus.COMPLETED;
            } else if (i == 4) {
                activeStatus = ActiveStatus.CANCELLED;
            } else {
                if (i != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    throw null;
                }
                activeStatus = ActiveStatus.FAILED_TO_QUEUE;
            }
            SupportPhoneStatusResponse.ServiceAvailability serviceAvailability = active.service_availability;
            serviceAvailability.getClass();
            PhoneServiceAvailability phoneServiceAvailability = new PhoneServiceAvailability(serviceAvailability);
            String str = active.title;
            str.getClass();
            String str2 = active.message;
            str2.getClass();
            String str3 = active.notification_title;
            String str4 = active.notification_message;
            Boolean bool = active.allow_cancellation;
            bool.getClass();
            boolean booleanValue = bool.booleanValue();
            this.status = activeStatus;
            this.availability = phoneServiceAvailability;
            this.title = str;
            this.message = str2;
            this.notificationTitle = str3;
            this.notificationMessage = str4;
            this.allowCancellation = booleanValue;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Active)) {
                return false;
            }
            Active active = (Active) obj;
            return this.status == active.status && Intrinsics.areEqual(this.availability, active.availability) && Intrinsics.areEqual(this.title, active.title) && Intrinsics.areEqual(this.message, active.message) && Intrinsics.areEqual(this.notificationTitle, active.notificationTitle) && Intrinsics.areEqual(this.notificationMessage, active.notificationMessage) && this.allowCancellation == active.allowCancellation;
        }

        @Override // com.squareup.cash.support.backend.api.SupportPhoneStatus.IsEligible
        public final PhoneServiceAvailability getAvailability() {
            return this.availability;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.availability.hashCode() + (this.status.hashCode() * 31)) * 31, 31, this.title), 31, this.message);
            String str = this.notificationTitle;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.notificationMessage;
            return Boolean.hashCode(this.allowCancellation) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Active(status=");
            sb.append(this.status);
            sb.append(", availability=");
            sb.append(this.availability);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", message=", this.message, ", notificationTitle=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.notificationTitle, ", notificationMessage=", this.notificationMessage, ", allowCancellation=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.allowCancellation, ")");
        }
    }

    /* loaded from: classes7.dex */
    public final class Error implements SupportPhoneStatus {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -19561942;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* loaded from: classes7.dex */
    public final class FeatureDisabled implements SupportPhoneStatus {
        public final String reason;

        public FeatureDisabled(String str) {
            this.reason = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FeatureDisabled) && Intrinsics.areEqual(this.reason, ((FeatureDisabled) obj).reason);
        }

        public final int hashCode() {
            String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FeatureDisabled(reason=", this.reason, ")");
        }
    }

    /* loaded from: classes7.dex */
    public final class Idle implements SupportPhoneStatus, IsEligible {
        public final PhoneServiceAvailability availability;

        public Idle(PhoneServiceAvailability phoneServiceAvailability) {
            this.availability = phoneServiceAvailability;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Idle) && this.availability.equals(((Idle) obj).availability);
        }

        @Override // com.squareup.cash.support.backend.api.SupportPhoneStatus.IsEligible
        public final PhoneServiceAvailability getAvailability() {
            return this.availability;
        }

        public final int hashCode() {
            return this.availability.hashCode();
        }

        public final String toString() {
            return "Idle(availability=" + this.availability + ")";
        }
    }

    /* loaded from: classes7.dex */
    public interface IsEligible {
        PhoneServiceAvailability getAvailability();
    }

    /* loaded from: classes7.dex */
    public final class PhoneServiceAvailability {
        public final boolean isAvailable;
        public final Instant nextAvailableTimestamp;
        public final String subtitle;

        public PhoneServiceAvailability(SupportPhoneStatusResponse.ServiceAvailability serviceAvailability) {
            serviceAvailability.getClass();
            Boolean bool = serviceAvailability.available;
            bool.getClass();
            boolean booleanValue = bool.booleanValue();
            Long l = serviceAvailability.service_available_timestamp;
            Instant ofEpochMilli = l != null ? Instant.ofEpochMilli(l.longValue()) : null;
            String str = serviceAvailability.availability_subtitle;
            this.isAvailable = booleanValue;
            this.nextAvailableTimestamp = ofEpochMilli;
            this.subtitle = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneServiceAvailability)) {
                return false;
            }
            PhoneServiceAvailability phoneServiceAvailability = (PhoneServiceAvailability) obj;
            return this.isAvailable == phoneServiceAvailability.isAvailable && Intrinsics.areEqual(this.nextAvailableTimestamp, phoneServiceAvailability.nextAvailableTimestamp) && Intrinsics.areEqual(this.subtitle, phoneServiceAvailability.subtitle);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.isAvailable) * 31;
            Instant instant = this.nextAvailableTimestamp;
            int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            String str = this.subtitle;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PhoneServiceAvailability(isAvailable=");
            sb.append(this.isAvailable);
            sb.append(", nextAvailableTimestamp=");
            sb.append(this.nextAvailableTimestamp);
            sb.append(", subtitle=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ")");
        }
    }

    public final class Undetermined implements SupportPhoneStatus {
        public static final Undetermined INSTANCE = new Undetermined();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Undetermined);
        }

        public final int hashCode() {
            return 1936602984;
        }

        public final String toString() {
            return "Undetermined";
        }
    }
}
