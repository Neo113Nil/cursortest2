package com.squareup.cash.tax.viewmodels;

import androidx.compose.ui.unit.Dp;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TaxesAppletTileModel {

    public interface Accessory {

        public final class Icon implements Accessory {
            public final boolean isWarningIcon;

            /* renamed from: type, reason: collision with root package name */
            public final TaxesIconType f1213type;

            public Icon(TaxesIconType taxesIconType, boolean z) {
                this.f1213type = taxesIconType;
                this.isWarningIcon = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                return this.f1213type.equals(icon.f1213type) && this.isWarningIcon == icon.isWarningIcon;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isWarningIcon) + (this.f1213type.hashCode() * 31);
            }

            public final String toString() {
                return "Icon(type=" + this.f1213type + ", isWarningIcon=" + this.isWarningIcon + ")";
            }
        }

        /* loaded from: classes6.dex */
        public final class Progress implements Accessory {
            public final float progress;

            public Progress(float f) {
                this.progress = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Progress) && Float.compare(this.progress, ((Progress) obj).progress) == 0 && Dp.m1037equalsimpl0(4.0f, 4.0f);
            }

            public final int hashCode() {
                return Float.hashCode(4.0f) + (Float.hashCode(this.progress) * 31);
            }

            public final String toString() {
                return "Progress(progress=" + this.progress + ", strokeWidth=" + Dp.m1038toStringimpl(4.0f) + ")";
            }
        }
    }

    /* loaded from: classes6.dex */
    public abstract class Installed implements TaxesAppletTileModel {

        /* loaded from: classes7.dex */
        public final class Idle extends Installed {
            public final Pair emphasizedSubtitle;
            public final Accessory.Icon icon;
            public final String warningSubtitle;

            public Idle(Pair pair, String str, Accessory.Icon icon) {
                this.emphasizedSubtitle = pair;
                this.warningSubtitle = str;
                this.icon = icon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Idle)) {
                    return false;
                }
                Idle idle = (Idle) obj;
                return this.emphasizedSubtitle.equals(idle.emphasizedSubtitle) && Intrinsics.areEqual(this.warningSubtitle, idle.warningSubtitle) && this.icon.equals(idle.icon);
            }

            @Override // com.squareup.cash.tax.viewmodels.TaxesAppletTileModel.Installed
            public final Pair getEmphasizedSubtitle() {
                return this.emphasizedSubtitle;
            }

            @Override // com.squareup.cash.tax.viewmodels.TaxesAppletTileModel.Installed
            public final String getWarningSubtitle() {
                return this.warningSubtitle;
            }

            public final int hashCode() {
                int hashCode = this.emphasizedSubtitle.hashCode() * 31;
                String str = this.warningSubtitle;
                return this.icon.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return "Idle(emphasizedSubtitle=" + this.emphasizedSubtitle + ", warningSubtitle=" + this.warningSubtitle + ", icon=" + this.icon + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class Pending extends Installed {
            public final Accessory accessory;
            public final Pair emphasizedSubtitle;
            public final String notice;
            public final String warningSubtitle;

            public Pending(Pair pair, String str, Accessory accessory, String str2) {
                this.emphasizedSubtitle = pair;
                this.warningSubtitle = str;
                this.accessory = accessory;
                this.notice = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Pending)) {
                    return false;
                }
                Pending pending = (Pending) obj;
                return Intrinsics.areEqual(this.emphasizedSubtitle, pending.emphasizedSubtitle) && Intrinsics.areEqual(this.warningSubtitle, pending.warningSubtitle) && Intrinsics.areEqual(this.accessory, pending.accessory) && Intrinsics.areEqual(this.notice, pending.notice);
            }

            @Override // com.squareup.cash.tax.viewmodels.TaxesAppletTileModel.Installed
            public final Pair getEmphasizedSubtitle() {
                return this.emphasizedSubtitle;
            }

            @Override // com.squareup.cash.tax.viewmodels.TaxesAppletTileModel.Installed
            public final String getWarningSubtitle() {
                return this.warningSubtitle;
            }

            public final int hashCode() {
                int hashCode = this.emphasizedSubtitle.hashCode() * 31;
                String str = this.warningSubtitle;
                int hashCode2 = (this.accessory.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                String str2 = this.notice;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return "Pending(emphasizedSubtitle=" + this.emphasizedSubtitle + ", warningSubtitle=" + this.warningSubtitle + ", accessory=" + this.accessory + ", notice=" + this.notice + ")";
            }
        }

        public abstract Pair getEmphasizedSubtitle();

        public abstract String getWarningSubtitle();
    }

    public final class Loading implements TaxesAppletTileModel {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "Loading(installed=true)";
        }
    }

    /* loaded from: classes6.dex */
    public final class Uninstalled implements TaxesAppletTileModel {
        public final Accessory.Icon icon;
        public final PromotedAppletTileViewModel.Loaded promotedModel;
        public final boolean showPromotedUI;
        public final String subtitle;

        public Uninstalled(String str, Accessory.Icon icon, boolean z, PromotedAppletTileViewModel.Loaded loaded) {
            this.subtitle = str;
            this.icon = icon;
            this.showPromotedUI = z;
            this.promotedModel = loaded;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return this.subtitle.equals(uninstalled.subtitle) && this.icon.equals(uninstalled.icon) && this.showPromotedUI == uninstalled.showPromotedUI && Intrinsics.areEqual(this.promotedModel, uninstalled.promotedModel);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.icon.hashCode() + (this.subtitle.hashCode() * 31)) * 31, 31, this.showPromotedUI);
            PromotedAppletTileViewModel.Loaded loaded = this.promotedModel;
            return m + (loaded == null ? 0 : loaded.hashCode());
        }

        public final String toString() {
            return "Uninstalled(subtitle=" + this.subtitle + ", icon=" + this.icon + ", showPromotedUI=" + this.showPromotedUI + ", promotedModel=" + this.promotedModel + ")";
        }
    }
}
