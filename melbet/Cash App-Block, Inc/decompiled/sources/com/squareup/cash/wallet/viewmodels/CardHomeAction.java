package com.squareup.cash.wallet.viewmodels;

import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface CardHomeAction {

    public final class CopyCardNumber implements CardHomeAction {
        public final int copyAnimationTrigger;
        public final Icons icon;
        public final boolean isDisabled;

        public CopyCardNumber(Icons icons, boolean z, int i) {
            this.icon = icons;
            this.isDisabled = z;
            this.copyAnimationTrigger = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CopyCardNumber)) {
                return false;
            }
            CopyCardNumber copyCardNumber = (CopyCardNumber) obj;
            return this.icon == copyCardNumber.icon && this.isDisabled == copyCardNumber.isDisabled && this.copyAnimationTrigger == copyCardNumber.copyAnimationTrigger;
        }

        public final int hashCode() {
            return Integer.hashCode(this.copyAnimationTrigger) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.isDisabled);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CopyCardNumber(icon=");
            sb.append(this.icon);
            sb.append(", isDisabled=");
            sb.append(this.isDisabled);
            sb.append(", copyAnimationTrigger=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.copyAnimationTrigger, ")", sb);
        }
    }

    public final class LockDevices implements CardHomeAction {
        public final String description;
        public final Icons icon;
        public final boolean isDisabled;
        public final String title;

        public LockDevices(Icons icons, String str, String str2, boolean z) {
            this.title = str;
            this.description = str2;
            this.icon = icons;
            this.isDisabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LockDevices)) {
                return false;
            }
            LockDevices lockDevices = (LockDevices) obj;
            return this.title.equals(lockDevices.title) && this.description.equals(lockDevices.description) && this.icon == lockDevices.icon && this.isDisabled == lockDevices.isDisabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isDisabled) + ((this.icon.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LockDevices(title=", this.title, ", description=", this.description, ", icon=");
            m.append(this.icon);
            m.append(", isDisabled=");
            m.append(this.isDisabled);
            m.append(")");
            return m.toString();
        }
    }
}
