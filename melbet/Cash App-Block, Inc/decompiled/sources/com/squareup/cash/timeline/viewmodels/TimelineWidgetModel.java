package com.squareup.cash.timeline.viewmodels;

import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TimelineWidgetModel {
    public final int collapsedSize;
    public final ArrayList items;

    public final class Item {
        public final Object clickEvent;
        public final boolean emphasizeWhenClickable;
        public final InlineText inlineText;
        public final String primaryText;
        public final String secondaryText;
        public final State state;

        public final class InlineText {
            public final boolean shouldAllowInlineText;
            public final InlineState state;
            public final String text;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class InlineState {
                public static final /* synthetic */ InlineState[] $VALUES;
                public static final InlineState MATCH_PRIMARY;
                public static final InlineState OVERDUE;
                public static final InlineState SECONDARY;

                static {
                    InlineState inlineState = new InlineState("MATCH_PRIMARY", 0);
                    MATCH_PRIMARY = inlineState;
                    InlineState inlineState2 = new InlineState("SECONDARY", 1);
                    SECONDARY = inlineState2;
                    InlineState inlineState3 = new InlineState("OVERDUE", 2);
                    OVERDUE = inlineState3;
                    $VALUES = new InlineState[]{inlineState, inlineState2, inlineState3};
                }

                public static InlineState valueOf(String str) {
                    return (InlineState) Enum.valueOf(InlineState.class, str);
                }

                public static InlineState[] values() {
                    return (InlineState[]) $VALUES.clone();
                }
            }

            public InlineText(String str, InlineState inlineState, boolean z) {
                str.getClass();
                inlineState.getClass();
                this.text = str;
                this.state = inlineState;
                this.shouldAllowInlineText = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InlineText)) {
                    return false;
                }
                InlineText inlineText = (InlineText) obj;
                return Intrinsics.areEqual(this.text, inlineText.text) && this.state == inlineText.state && this.shouldAllowInlineText == inlineText.shouldAllowInlineText;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.shouldAllowInlineText) + ((this.state.hashCode() + (this.text.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("InlineText(text=");
                sb.append(this.text);
                sb.append(", state=");
                sb.append(this.state);
                sb.append(", shouldAllowInlineText=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shouldAllowInlineText, ")");
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class State {
            public static final /* synthetic */ State[] $VALUES;
            public static final State ALERT;
            public static final State CANCELED;
            public static final State CANCELED_ALT;
            public static final State COMPLETED;
            public static final State FAILED;
            public static final State HIGHLIGHT;
            public static final State HIGHLIGHT_COMPLETED;
            public static final State MISSED;
            public static final State NORMAL;
            public static final State PENDING;
            public static final State REFUNDED_ALT;
            public static final State SKIPPED;
            public static final State UPCOMING;

            static {
                State state = new State("HIGHLIGHT", 0);
                HIGHLIGHT = state;
                State state2 = new State("NORMAL", 1);
                NORMAL = state2;
                State state3 = new State("PENDING", 2);
                PENDING = state3;
                State state4 = new State("COMPLETED", 3);
                COMPLETED = state4;
                State state5 = new State("SKIPPED", 4);
                SKIPPED = state5;
                State state6 = new State("MISSED", 5);
                MISSED = state6;
                State state7 = new State("UPCOMING", 6);
                UPCOMING = state7;
                State state8 = new State("REFUNDED", 7);
                State state9 = new State("REFUNDED_ALT", 8);
                REFUNDED_ALT = state9;
                State state10 = new State("CANCELED", 9);
                CANCELED = state10;
                State state11 = new State("ALERT", 10);
                ALERT = state11;
                State state12 = new State("HIGHLIGHT_COMPLETED", 11);
                HIGHLIGHT_COMPLETED = state12;
                State state13 = new State("FAILED", 12);
                FAILED = state13;
                State state14 = new State("CANCELED_ALT", 13);
                CANCELED_ALT = state14;
                $VALUES = new State[]{state, state2, state3, state4, state5, state6, state7, state8, state9, state10, state11, state12, state13, state14};
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }
        }

        public Item(State state, String str, String str2, InlineText inlineText, AfterPayOrderDetailsViewEvent.ScheduledPaymentClicked scheduledPaymentClicked, boolean z) {
            str.getClass();
            this.state = state;
            this.primaryText = str;
            this.secondaryText = str2;
            this.inlineText = inlineText;
            this.clickEvent = scheduledPaymentClicked;
            this.emphasizeWhenClickable = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.state == item.state && Intrinsics.areEqual(this.primaryText, item.primaryText) && Intrinsics.areEqual(this.secondaryText, item.secondaryText) && Intrinsics.areEqual(this.inlineText, item.inlineText) && Intrinsics.areEqual(this.clickEvent, item.clickEvent) && this.emphasizeWhenClickable == item.emphasizeWhenClickable;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.state.hashCode() * 31, 31, this.primaryText);
            String str = this.secondaryText;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            InlineText inlineText = this.inlineText;
            int hashCode2 = (hashCode + (inlineText == null ? 0 : inlineText.hashCode())) * 31;
            Object obj = this.clickEvent;
            return Boolean.hashCode(this.emphasizeWhenClickable) + ((hashCode2 + (obj != null ? obj.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Item(state=" + this.state + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", inlineText=" + this.inlineText + ", clickEvent=" + this.clickEvent + ", emphasizeWhenClickable=" + this.emphasizeWhenClickable + ")";
        }
    }

    public TimelineWidgetModel(int i, ArrayList arrayList) {
        this.items = arrayList;
        this.collapsedSize = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineWidgetModel)) {
            return false;
        }
        TimelineWidgetModel timelineWidgetModel = (TimelineWidgetModel) obj;
        return this.items.equals(timelineWidgetModel.items) && this.collapsedSize == timelineWidgetModel.collapsedSize;
    }

    public final int hashCode() {
        return Integer.hashCode(this.collapsedSize) + (this.items.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineWidgetModel(items=" + this.items + ", collapsedSize=" + this.collapsedSize + ")";
    }
}
