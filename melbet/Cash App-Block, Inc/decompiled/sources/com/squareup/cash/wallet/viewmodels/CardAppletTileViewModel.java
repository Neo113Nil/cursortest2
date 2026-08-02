package com.squareup.cash.wallet.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface CardAppletTileViewModel {

    public final class CardPillViewModel {
        public final String contentDescription;
        public final Icons icon;
        public final boolean isHidden;
        public final String text;

        public CardPillViewModel(Icons icons, String str, String str2, boolean z) {
            str.getClass();
            icons.getClass();
            str2.getClass();
            this.text = str;
            this.icon = icons;
            this.contentDescription = str2;
            this.isHidden = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardPillViewModel)) {
                return false;
            }
            CardPillViewModel cardPillViewModel = (CardPillViewModel) obj;
            return Intrinsics.areEqual(this.text, cardPillViewModel.text) && this.icon == cardPillViewModel.icon && Intrinsics.areEqual(this.contentDescription, cardPillViewModel.contentDescription) && this.isHidden == cardPillViewModel.isHidden;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isHidden) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.icon.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.contentDescription);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CardPillViewModel(text=");
            sb.append(this.text);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", contentDescription=");
            return re$$ExternalSyntheticOutline0.m(sb, this.contentDescription, ", isHidden=", this.isHidden, ")");
        }
    }

    public final class Installed implements WithCardUi {
        public final String appletContentDescription;
        public final boolean disableFilament;
        public final CardSchemeViewModel.Module.HeroCardDetails model;
        public final String onClickContentDescription;
        public final CardPillViewModel pill;
        public final boolean use3D;

        public Installed(boolean z, boolean z2, String str, CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, CardPillViewModel cardPillViewModel, String str2) {
            str.getClass();
            this.use3D = z;
            this.disableFilament = z2;
            this.onClickContentDescription = str;
            this.model = heroCardDetails;
            this.pill = cardPillViewModel;
            this.appletContentDescription = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return this.use3D == installed.use3D && this.disableFilament == installed.disableFilament && Intrinsics.areEqual(this.onClickContentDescription, installed.onClickContentDescription) && this.model.equals(installed.model) && this.pill.equals(installed.pill) && this.appletContentDescription.equals(installed.appletContentDescription);
        }

        @Override // com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel.WithCardUi
        public final String getOnClickContentDescription() {
            return this.onClickContentDescription;
        }

        public final int hashCode() {
            return this.appletContentDescription.hashCode() + ((this.pill.hashCode() + ((this.model.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.use3D) * 31, 31, this.disableFilament), 31, this.onClickContentDescription)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Installed(use3D=", ", disableFilament=", ", onClickContentDescription=", this.use3D, this.disableFilament);
            m.append(this.onClickContentDescription);
            m.append(", model=");
            m.append(this.model);
            m.append(", pill=");
            m.append(this.pill);
            m.append(", appletContentDescription=");
            m.append(this.appletContentDescription);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements CardAppletTileViewModel {
        public final boolean hidePill;
        public final boolean isAvailable;

        public Loading(boolean z, boolean z2) {
            this.isAvailable = z;
            this.hidePill = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return this.isAvailable == loading.isAvailable && this.hidePill == loading.hidePill;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hidePill) + (Boolean.hashCode(this.isAvailable) * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Loading(isAvailable=", ", hidePill=", ")", this.isAvailable, this.hidePill);
        }
    }

    public final class Uninstalled implements WithCardUi {
        public final boolean animateCardIntro;
        public final boolean disableFilament;
        public final String onClickContentDescription;
        public final PromotedAppletTileViewModel.Loaded promotedTileModel;
        public final List rotatingCards;
        public final boolean showingCardGrid;
        public final boolean use3D;

        public Uninstalled(boolean z, boolean z2, String str, boolean z3, boolean z4, List list, PromotedAppletTileViewModel.Loaded loaded) {
            str.getClass();
            list.getClass();
            this.use3D = z;
            this.disableFilament = z2;
            this.onClickContentDescription = str;
            this.animateCardIntro = z3;
            this.showingCardGrid = z4;
            this.rotatingCards = list;
            this.promotedTileModel = loaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return this.use3D == uninstalled.use3D && this.disableFilament == uninstalled.disableFilament && Intrinsics.areEqual(this.onClickContentDescription, uninstalled.onClickContentDescription) && this.animateCardIntro == uninstalled.animateCardIntro && this.showingCardGrid == uninstalled.showingCardGrid && Intrinsics.areEqual(this.rotatingCards, uninstalled.rotatingCards) && Intrinsics.areEqual(this.promotedTileModel, uninstalled.promotedTileModel);
        }

        @Override // com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel.WithCardUi
        public final String getOnClickContentDescription() {
            return this.onClickContentDescription;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.use3D) * 31, 31, this.disableFilament), 31, this.onClickContentDescription), 31, this.animateCardIntro), 31, this.showingCardGrid), 31, this.rotatingCards);
            PromotedAppletTileViewModel.Loaded loaded = this.promotedTileModel;
            return m + (loaded == null ? 0 : loaded.hashCode());
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Uninstalled(use3D=", ", disableFilament=", ", onClickContentDescription=", this.use3D, this.disableFilament);
            NavAction$$ExternalSyntheticOutline0.m(m, this.onClickContentDescription, ", animateCardIntro=", this.animateCardIntro, ", showingCardGrid=");
            m.append(this.showingCardGrid);
            m.append(", rotatingCards=");
            m.append(this.rotatingCards);
            m.append(", promotedTileModel=");
            m.append(this.promotedTileModel);
            m.append(")");
            return m.toString();
        }
    }

    public interface WithCardUi extends CardAppletTileViewModel {
        String getOnClickContentDescription();
    }
}
