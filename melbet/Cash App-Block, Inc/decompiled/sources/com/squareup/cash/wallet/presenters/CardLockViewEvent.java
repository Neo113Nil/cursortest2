package com.squareup.cash.wallet.presenters;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class CardLockViewEvent {

    public final class Dismiss extends CardLockViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -190449930;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class ToggleLock extends CardLockViewEvent {
        public final String deviceId;
        public final boolean setLocked;

        public ToggleLock(String str, boolean z) {
            str.getClass();
            this.deviceId = str;
            this.setLocked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToggleLock)) {
                return false;
            }
            ToggleLock toggleLock = (ToggleLock) obj;
            return Intrinsics.areEqual(this.deviceId, toggleLock.deviceId) && this.setLocked == toggleLock.setLocked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.setLocked) + (this.deviceId.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("ToggleLock(deviceId=", this.deviceId, ", setLocked=", ")", this.setLocked);
        }
    }
}
