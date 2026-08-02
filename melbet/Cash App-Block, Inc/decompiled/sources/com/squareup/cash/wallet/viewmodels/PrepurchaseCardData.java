package com.squareup.cash.wallet.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCardData {
    public final Toggle toggle;
    public final CardHeader turnedOnCardHeader;

    public final class CardHeader {
        public final String amount;
        public final String buttonClientRoute;
        public final String buttonText;
        public final String title;

        public CardHeader(String str, String str2, String str3, String str4) {
            this.title = str;
            this.amount = str2;
            this.buttonText = str3;
            this.buttonClientRoute = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardHeader)) {
                return false;
            }
            CardHeader cardHeader = (CardHeader) obj;
            return Intrinsics.areEqual(this.title, cardHeader.title) && this.amount.equals(cardHeader.amount) && this.buttonText.equals(cardHeader.buttonText) && Intrinsics.areEqual(this.buttonClientRoute, cardHeader.buttonClientRoute);
        }

        public final int hashCode() {
            String str = this.title;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.amount), 31, this.buttonText);
            String str2 = this.buttonClientRoute;
            return m + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardHeader(title=", this.title, ", amount=", this.amount, ", buttonText="), this.buttonText, ", buttonClientRoute=", this.buttonClientRoute, ")");
        }
    }

    public final class Toggle {
        public final Icon icon;
        public final String infoIconActionUrl;
        public final boolean loading;
        public final Position position;
        public final ToggleEntryPointData.ToggleState state;
        public final String subtitle;
        public final String text;

        public interface Position {

            public final class ButtonsRow implements Position {
                public static final ButtonsRow INSTANCE = new ButtonsRow();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof ButtonsRow);
                }

                public final int hashCode() {
                    return 1237819056;
                }

                public final String toString() {
                    return "ButtonsRow";
                }
            }

            public final class Standalone implements Position {
                public final String rowClickOverrideUrl;

                public Standalone(String str) {
                    this.rowClickOverrideUrl = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Standalone) && Intrinsics.areEqual(this.rowClickOverrideUrl, ((Standalone) obj).rowClickOverrideUrl);
                }

                public final int hashCode() {
                    String str = this.rowClickOverrideUrl;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Standalone(rowClickOverrideUrl=", this.rowClickOverrideUrl, ")");
                }
            }
        }

        public Toggle(ToggleEntryPointData.ToggleState toggleState, Position position, Icon icon, String str, String str2, boolean z, String str3) {
            toggleState.getClass();
            this.state = toggleState;
            this.position = position;
            this.icon = icon;
            this.text = str;
            this.subtitle = str2;
            this.loading = z;
            this.infoIconActionUrl = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Toggle)) {
                return false;
            }
            Toggle toggle = (Toggle) obj;
            return this.state == toggle.state && this.position.equals(toggle.position) && Intrinsics.areEqual(this.icon, toggle.icon) && Intrinsics.areEqual(this.text, toggle.text) && Intrinsics.areEqual(this.subtitle, toggle.subtitle) && this.loading == toggle.loading && Intrinsics.areEqual(this.infoIconActionUrl, toggle.infoIconActionUrl);
        }

        public final int hashCode() {
            int hashCode = (this.position.hashCode() + (this.state.hashCode() * 31)) * 31;
            Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
            String str = this.text;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.loading);
            String str3 = this.infoIconActionUrl;
            return m + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Toggle(state=");
            sb.append(this.state);
            sb.append(", position=");
            sb.append(this.position);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", subtitle=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", loading=", this.loading, ", infoIconActionUrl=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.infoIconActionUrl, ")");
        }
    }

    public PrepurchaseCardData(CardHeader cardHeader, Toggle toggle) {
        this.turnedOnCardHeader = cardHeader;
        this.toggle = toggle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepurchaseCardData)) {
            return false;
        }
        PrepurchaseCardData prepurchaseCardData = (PrepurchaseCardData) obj;
        return Intrinsics.areEqual(this.turnedOnCardHeader, prepurchaseCardData.turnedOnCardHeader) && this.toggle.equals(prepurchaseCardData.toggle);
    }

    public final int hashCode() {
        CardHeader cardHeader = this.turnedOnCardHeader;
        return this.toggle.hashCode() + ((cardHeader == null ? 0 : cardHeader.hashCode()) * 31);
    }

    public final String toString() {
        return "PrepurchaseCardData(turnedOnCardHeader=" + this.turnedOnCardHeader + ", toggle=" + this.toggle + ")";
    }
}
