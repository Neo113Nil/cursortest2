package com.squareup.cash.wallet.db;

import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.franklin.cards.CardTheme;

/* loaded from: classes.dex */
public final class IssuedCardFactory {
    public final SensitiveCardData sensitiveData;

    /* loaded from: classes7.dex */
    public final class IssuedCard {
        public final boolean activated;
        public final CardTheme cardTheme;
        public final String cardThemeName;
        public final String cardholderName;
        public final boolean enabled;
        public final CashAppCard.ExternalIssuingAccountState externalIssuingAccountState;
        public final boolean isExpired;
        public final boolean isSponsorLocked;
        public final boolean isVirtual;
        public final String lastFour;
        public final CashAppCard.PhysicalCardOrderState physicalCardOrderState;
        public final /* synthetic */ IssuedCardFactory this$0;
        public final String token;

        public IssuedCard(IssuedCardFactory issuedCardFactory, String str, String str2, boolean z, boolean z2, String str3, boolean z3, CardTheme cardTheme, CashAppCard.PhysicalCardOrderState physicalCardOrderState, CashAppCard.ExternalIssuingAccountState externalIssuingAccountState, boolean z4, String str4, boolean z5) {
            str.getClass();
            str2.getClass();
            this.this$0 = issuedCardFactory;
            this.token = str;
            this.lastFour = str2;
            this.enabled = z;
            this.isVirtual = z2;
            this.cardholderName = str3;
            this.activated = z3;
            this.cardTheme = cardTheme;
            this.physicalCardOrderState = physicalCardOrderState;
            this.externalIssuingAccountState = externalIssuingAccountState;
            this.isExpired = z4;
            this.cardThemeName = str4;
            this.isSponsorLocked = z5;
        }

        public final String getExpiration() {
            SensitiveCardData sensitiveCardData = this.this$0.sensitiveData;
            if (sensitiveCardData != null) {
                return sensitiveCardData.expiration.value;
            }
            return null;
        }

        public final String getPan() {
            SensitiveCardData sensitiveCardData = this.this$0.sensitiveData;
            if (sensitiveCardData != null) {
                return sensitiveCardData.pan.value;
            }
            return null;
        }
    }

    public final class SensitiveCardData {
        public final RedactedString expiration;
        public final RedactedString pan;
        public final RedactedString securityCode;

        public SensitiveCardData(RedactedString redactedString, RedactedString redactedString2, RedactedString redactedString3) {
            this.pan = redactedString;
            this.expiration = redactedString2;
            this.securityCode = redactedString3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SensitiveCardData)) {
                return false;
            }
            SensitiveCardData sensitiveCardData = (SensitiveCardData) obj;
            return this.pan.equals(sensitiveCardData.pan) && this.expiration.equals(sensitiveCardData.expiration) && this.securityCode.equals(sensitiveCardData.securityCode);
        }

        public final int hashCode() {
            return this.securityCode.hashCode() + ((this.expiration.hashCode() + (this.pan.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "SensitiveCardData(pan=" + this.pan + ", expiration=" + this.expiration + ", securityCode=" + this.securityCode + ")";
        }
    }

    public IssuedCardFactory(SensitiveCardData sensitiveCardData) {
        this.sensitiveData = sensitiveCardData;
    }
}
