package com.squareup.cash.transfers.backend.api;

import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ScheduledReloadsPreference {
    public final Source source;
    public final State state;
    public final String subtitle;
    public final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source PROFILE;
        public static final Source SYNC_VALUE;

        static {
            Source source = new Source("SYNC_VALUE", 0);
            SYNC_VALUE = source;
            Source source2 = new Source("PROFILE", 1);
            PROFILE = source2;
            $VALUES = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* loaded from: classes7.dex */
    public interface State {

        /* loaded from: classes6.dex */
        public final class Disabled implements State {
            public static final Disabled INSTANCE = new Disabled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Disabled);
            }

            public final int hashCode() {
                return -1009637415;
            }

            public final String toString() {
                return "Disabled";
            }
        }

        public final class Enabled implements State {
            public final Money amount;
            public final String fundingSource;
            public final Long nextReloadAt;
            public final RecurringSchedule recurringSchedule;

            public Enabled(Money money, String str, Long l, RecurringSchedule recurringSchedule) {
                this.amount = money;
                this.fundingSource = str;
                this.nextReloadAt = l;
                this.recurringSchedule = recurringSchedule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Enabled)) {
                    return false;
                }
                Enabled enabled = (Enabled) obj;
                return Intrinsics.areEqual(this.amount, enabled.amount) && Intrinsics.areEqual(this.fundingSource, enabled.fundingSource) && Intrinsics.areEqual(this.nextReloadAt, enabled.nextReloadAt) && Intrinsics.areEqual(this.recurringSchedule, enabled.recurringSchedule);
            }

            public final int hashCode() {
                Money money = this.amount;
                int hashCode = (money == null ? 0 : money.hashCode()) * 31;
                String str = this.fundingSource;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l = this.nextReloadAt;
                int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                RecurringSchedule recurringSchedule = this.recurringSchedule;
                return hashCode3 + (recurringSchedule != null ? recurringSchedule.hashCode() : 0);
            }

            public final String toString() {
                return "Enabled(amount=" + this.amount + ", fundingSource=" + this.fundingSource + ", nextReloadAt=" + this.nextReloadAt + ", recurringSchedule=" + this.recurringSchedule + ")";
            }
        }
    }

    public ScheduledReloadsPreference(String str, String str2, State state, Source source) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
        this.state = state;
        this.source = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduledReloadsPreference)) {
            return false;
        }
        ScheduledReloadsPreference scheduledReloadsPreference = (ScheduledReloadsPreference) obj;
        return Intrinsics.areEqual(this.title, scheduledReloadsPreference.title) && Intrinsics.areEqual(this.subtitle, scheduledReloadsPreference.subtitle) && this.state.equals(scheduledReloadsPreference.state) && this.source == scheduledReloadsPreference.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + ((this.state.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ScheduledReloadsPreference(title=", this.title, ", subtitle=", this.subtitle, ", state=");
        m.append(this.state);
        m.append(", source=");
        m.append(this.source);
        m.append(")");
        return m.toString();
    }
}
