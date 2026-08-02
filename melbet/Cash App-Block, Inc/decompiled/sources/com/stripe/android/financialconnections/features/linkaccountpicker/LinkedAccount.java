package com.stripe.android.financialconnections.features.linkaccountpicker;

import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class LinkedAccount {
    public final PartnerAccount account;
    public final NetworkedAccount display;

    public LinkedAccount(PartnerAccount partnerAccount, NetworkedAccount networkedAccount) {
        networkedAccount.getClass();
        this.account = partnerAccount;
        this.display = networkedAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedAccount)) {
            return false;
        }
        LinkedAccount linkedAccount = (LinkedAccount) obj;
        return this.account.equals(linkedAccount.account) && Intrinsics.areEqual(this.display, linkedAccount.display);
    }

    public final int hashCode() {
        return this.display.hashCode() + (this.account.hashCode() * 31);
    }

    public final String toString() {
        return "LinkedAccount(account=" + this.account + ", display=" + this.display + ")";
    }
}
