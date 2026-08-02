package com.squareup.cash.transfers.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BalanceBasedAddCashPreference {
    public final State state;
    public final String subtitle;
    public final String title;

    public interface State {

        public final class Disabled implements State {
            public static final Disabled INSTANCE = new Disabled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Disabled);
            }

            public final int hashCode() {
                return -549669643;
            }

            public final String toString() {
                return "Disabled";
            }
        }

        public final class Enabled implements State {
            public final Money incrementAmount;
            public final Money minimumBalance;

            public Enabled(Money money, Money money2) {
                money.getClass();
                money2.getClass();
                this.minimumBalance = money;
                this.incrementAmount = money2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Enabled)) {
                    return false;
                }
                Enabled enabled = (Enabled) obj;
                return Intrinsics.areEqual(this.minimumBalance, enabled.minimumBalance) && Intrinsics.areEqual(this.incrementAmount, enabled.incrementAmount);
            }

            public final int hashCode() {
                return this.incrementAmount.hashCode() + (this.minimumBalance.hashCode() * 31);
            }

            public final String toString() {
                return "Enabled(minimumBalance=" + this.minimumBalance + ", incrementAmount=" + this.incrementAmount + ")";
            }
        }

        public final class Locked implements State {
            public final String buttonText;
            public final String clientRoute;
            public final String description;
            public final String dismissButtonText;
            public final String title;

            public Locked(String str, String str2, String str3, String str4, String str5) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
                this.title = str;
                this.description = str2;
                this.buttonText = str3;
                this.dismissButtonText = str4;
                this.clientRoute = str5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Locked)) {
                    return false;
                }
                Locked locked = (Locked) obj;
                return Intrinsics.areEqual(this.title, locked.title) && Intrinsics.areEqual(this.description, locked.description) && Intrinsics.areEqual(this.buttonText, locked.buttonText) && Intrinsics.areEqual(this.dismissButtonText, locked.dismissButtonText) && Intrinsics.areEqual(this.clientRoute, locked.clientRoute);
            }

            public final int hashCode() {
                return this.clientRoute.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.buttonText), 31, this.dismissButtonText);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Locked(title=", this.title, ", description=", this.description, ", buttonText=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.buttonText, ", dismissButtonText=", this.dismissButtonText, ", clientRoute=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.clientRoute, ")");
            }
        }
    }

    public BalanceBasedAddCashPreference(String str, String str2, State state) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
        this.state = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceBasedAddCashPreference)) {
            return false;
        }
        BalanceBasedAddCashPreference balanceBasedAddCashPreference = (BalanceBasedAddCashPreference) obj;
        return Intrinsics.areEqual(this.title, balanceBasedAddCashPreference.title) && Intrinsics.areEqual(this.subtitle, balanceBasedAddCashPreference.subtitle) && this.state.equals(balanceBasedAddCashPreference.state);
    }

    public final int hashCode() {
        return this.state.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BalanceBasedAddCashPreference(title=", this.title, ", subtitle=", this.subtitle, ", state=");
        m.append(this.state);
        m.append(")");
        return m.toString();
    }
}
