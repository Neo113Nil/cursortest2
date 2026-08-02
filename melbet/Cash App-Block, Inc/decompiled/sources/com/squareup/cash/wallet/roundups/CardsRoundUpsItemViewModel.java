package com.squareup.cash.wallet.roundups;

import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.RoundUpsElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CardsRoundUpsItemViewModel {
    public final DestinationAvatar destinationAvatar;
    public final RoundUpsElement element;

    public interface DestinationAvatar {

        public final class Bitcoin implements DestinationAvatar {
            public static final Bitcoin INSTANCE = new Bitcoin();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Bitcoin);
            }

            public final int hashCode() {
                return 537042382;
            }

            public final String toString() {
                return "Bitcoin";
            }
        }

        public final class Savings implements DestinationAvatar {
            public static final Savings INSTANCE = new Savings();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Savings);
            }

            public final int hashCode() {
                return -1782272663;
            }

            public final String toString() {
                return "Savings";
            }
        }

        public final class Stock implements DestinationAvatar {
            public final Image image;
            public final Color placeholderColor;

            public Stock(Image image, Color color) {
                image.getClass();
                color.getClass();
                this.image = image;
                this.placeholderColor = color;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Stock)) {
                    return false;
                }
                Stock stock = (Stock) obj;
                return Intrinsics.areEqual(this.image, stock.image) && Intrinsics.areEqual(this.placeholderColor, stock.placeholderColor);
            }

            public final int hashCode() {
                return this.placeholderColor.hashCode() + (this.image.hashCode() * 31);
            }

            public final String toString() {
                return "Stock(image=" + this.image + ", placeholderColor=" + this.placeholderColor + ")";
            }
        }
    }

    public CardsRoundUpsItemViewModel(RoundUpsElement roundUpsElement, DestinationAvatar destinationAvatar) {
        this.element = roundUpsElement;
        this.destinationAvatar = destinationAvatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardsRoundUpsItemViewModel)) {
            return false;
        }
        CardsRoundUpsItemViewModel cardsRoundUpsItemViewModel = (CardsRoundUpsItemViewModel) obj;
        return this.element.equals(cardsRoundUpsItemViewModel.element) && Intrinsics.areEqual(this.destinationAvatar, cardsRoundUpsItemViewModel.destinationAvatar);
    }

    public final int hashCode() {
        int hashCode = this.element.hashCode() * 31;
        DestinationAvatar destinationAvatar = this.destinationAvatar;
        return hashCode + (destinationAvatar == null ? 0 : destinationAvatar.hashCode());
    }

    public final String toString() {
        return "CardsRoundUpsItemViewModel(element=" + this.element + ", destinationAvatar=" + this.destinationAvatar + ")";
    }
}
