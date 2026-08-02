package com.squareup.cash.wallet.viewmodels;

/* loaded from: classes7.dex */
public interface CardAppletTileViewEvent {

    public final class CardAppletOnClickPromotedTile implements CardAppletTileViewEvent {
        public static final CardAppletOnClickPromotedTile INSTANCE = new CardAppletOnClickPromotedTile();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardAppletOnClickPromotedTile);
        }

        public final int hashCode() {
            return 1154972260;
        }

        public final String toString() {
            return "CardAppletOnClickPromotedTile";
        }
    }

    public final class CardAppletOnClickTile implements CardAppletTileViewEvent {
        public static final CardAppletOnClickTile INSTANCE = new CardAppletOnClickTile();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardAppletOnClickTile);
        }

        public final int hashCode() {
            return 1514660256;
        }

        public final String toString() {
            return "CardAppletOnClickTile";
        }
    }

    public final class CardAppletOnClickUninstalledRow implements CardAppletTileViewEvent {
        public static final CardAppletOnClickUninstalledRow INSTANCE = new CardAppletOnClickUninstalledRow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardAppletOnClickUninstalledRow);
        }

        public final int hashCode() {
            return -2072962677;
        }

        public final String toString() {
            return "CardAppletOnClickUninstalledRow";
        }
    }
}
