package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.yoga.internal.detail.GlobalMembers;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShopInfoResponse$Picture$Avatar extends GlobalMembers {
    public final Avatar value;

    public ShopInfoResponse$Picture$Avatar(Avatar avatar) {
        avatar.getClass();
        this.value = avatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopInfoResponse$Picture$Avatar) && Intrinsics.areEqual(this.value, ((ShopInfoResponse$Picture$Avatar) obj).value);
    }

    public final Avatar getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Avatar(value=" + this.value + ")";
    }
}
