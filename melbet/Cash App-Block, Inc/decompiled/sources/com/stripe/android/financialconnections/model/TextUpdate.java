package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.ServerLink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes8.dex */
public final class TextUpdate implements Parcelable {
    public final AccountPickerPane accountPicker;
    public final ConsentPane consent;
    public final IDConsentContentPane idConsentContentPane;
    public final LinkLoginPane linkLoginPane;
    public final NetworkingLinkSignupPane networkingLinkSignupPane;
    public final OauthPrepane oauthPrepane;
    public final ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker;
    public final SuccessPane successPane;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<TextUpdate> CREATOR = new ServerLink.Creator(14);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/TextUpdate$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/TextUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return TextUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TextUpdate(int i, AccountPickerPane accountPickerPane, ConsentPane consentPane, LinkLoginPane linkLoginPane, NetworkingLinkSignupPane networkingLinkSignupPane, OauthPrepane oauthPrepane, ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker, SuccessPane successPane, IDConsentContentPane iDConsentContentPane) {
        if ((i & 1) == 0) {
            this.accountPicker = null;
        } else {
            this.accountPicker = accountPickerPane;
        }
        if ((i & 2) == 0) {
            this.consent = null;
        } else {
            this.consent = consentPane;
        }
        if ((i & 4) == 0) {
            this.linkLoginPane = null;
        } else {
            this.linkLoginPane = linkLoginPane;
        }
        if ((i & 8) == 0) {
            this.networkingLinkSignupPane = null;
        } else {
            this.networkingLinkSignupPane = networkingLinkSignupPane;
        }
        if ((i & 16) == 0) {
            this.oauthPrepane = null;
        } else {
            this.oauthPrepane = oauthPrepane;
        }
        if ((i & 32) == 0) {
            this.returningNetworkingUserAccountPicker = null;
        } else {
            this.returningNetworkingUserAccountPicker = returningNetworkingUserAccountPicker;
        }
        if ((i & 64) == 0) {
            this.successPane = null;
        } else {
            this.successPane = successPane;
        }
        if ((i & 128) == 0) {
            this.idConsentContentPane = null;
        } else {
            this.idConsentContentPane = iDConsentContentPane;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextUpdate)) {
            return false;
        }
        TextUpdate textUpdate = (TextUpdate) obj;
        return Intrinsics.areEqual(this.accountPicker, textUpdate.accountPicker) && Intrinsics.areEqual(this.consent, textUpdate.consent) && Intrinsics.areEqual(this.linkLoginPane, textUpdate.linkLoginPane) && Intrinsics.areEqual(this.networkingLinkSignupPane, textUpdate.networkingLinkSignupPane) && Intrinsics.areEqual(this.oauthPrepane, textUpdate.oauthPrepane) && Intrinsics.areEqual(this.returningNetworkingUserAccountPicker, textUpdate.returningNetworkingUserAccountPicker) && Intrinsics.areEqual(this.successPane, textUpdate.successPane) && Intrinsics.areEqual(this.idConsentContentPane, textUpdate.idConsentContentPane);
    }

    public final int hashCode() {
        AccountPickerPane accountPickerPane = this.accountPicker;
        int hashCode = (accountPickerPane == null ? 0 : accountPickerPane.dataAccessNotice.hashCode()) * 31;
        ConsentPane consentPane = this.consent;
        int hashCode2 = (hashCode + (consentPane == null ? 0 : consentPane.hashCode())) * 31;
        LinkLoginPane linkLoginPane = this.linkLoginPane;
        int hashCode3 = (hashCode2 + (linkLoginPane == null ? 0 : linkLoginPane.hashCode())) * 31;
        NetworkingLinkSignupPane networkingLinkSignupPane = this.networkingLinkSignupPane;
        int hashCode4 = (hashCode3 + (networkingLinkSignupPane == null ? 0 : networkingLinkSignupPane.hashCode())) * 31;
        OauthPrepane oauthPrepane = this.oauthPrepane;
        int hashCode5 = (hashCode4 + (oauthPrepane == null ? 0 : oauthPrepane.hashCode())) * 31;
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker = this.returningNetworkingUserAccountPicker;
        int hashCode6 = (hashCode5 + (returningNetworkingUserAccountPicker == null ? 0 : returningNetworkingUserAccountPicker.hashCode())) * 31;
        SuccessPane successPane = this.successPane;
        int hashCode7 = (hashCode6 + (successPane == null ? 0 : successPane.hashCode())) * 31;
        IDConsentContentPane iDConsentContentPane = this.idConsentContentPane;
        return hashCode7 + (iDConsentContentPane != null ? iDConsentContentPane.hashCode() : 0);
    }

    public final String toString() {
        return "TextUpdate(accountPicker=" + this.accountPicker + ", consent=" + this.consent + ", linkLoginPane=" + this.linkLoginPane + ", networkingLinkSignupPane=" + this.networkingLinkSignupPane + ", oauthPrepane=" + this.oauthPrepane + ", returningNetworkingUserAccountPicker=" + this.returningNetworkingUserAccountPicker + ", successPane=" + this.successPane + ", idConsentContentPane=" + this.idConsentContentPane + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        AccountPickerPane accountPickerPane = this.accountPicker;
        if (accountPickerPane == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(accountPickerPane.dataAccessNotice);
        }
        ConsentPane consentPane = this.consent;
        if (consentPane == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            consentPane.writeToParcel(parcel, i);
        }
        LinkLoginPane linkLoginPane = this.linkLoginPane;
        if (linkLoginPane == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkLoginPane.writeToParcel(parcel, i);
        }
        NetworkingLinkSignupPane networkingLinkSignupPane = this.networkingLinkSignupPane;
        if (networkingLinkSignupPane == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            networkingLinkSignupPane.writeToParcel(parcel, i);
        }
        OauthPrepane oauthPrepane = this.oauthPrepane;
        if (oauthPrepane == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oauthPrepane.writeToParcel(parcel, i);
        }
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker = this.returningNetworkingUserAccountPicker;
        if (returningNetworkingUserAccountPicker == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            returningNetworkingUserAccountPicker.writeToParcel(parcel, i);
        }
        SuccessPane successPane = this.successPane;
        if (successPane == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            successPane.writeToParcel(parcel, i);
        }
        IDConsentContentPane iDConsentContentPane = this.idConsentContentPane;
        if (iDConsentContentPane == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iDConsentContentPane.writeToParcel(parcel, i);
        }
    }

    public TextUpdate(AccountPickerPane accountPickerPane, ConsentPane consentPane, LinkLoginPane linkLoginPane, NetworkingLinkSignupPane networkingLinkSignupPane, OauthPrepane oauthPrepane, ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker, SuccessPane successPane, IDConsentContentPane iDConsentContentPane) {
        this.accountPicker = accountPickerPane;
        this.consent = consentPane;
        this.linkLoginPane = linkLoginPane;
        this.networkingLinkSignupPane = networkingLinkSignupPane;
        this.oauthPrepane = oauthPrepane;
        this.returningNetworkingUserAccountPicker = returningNetworkingUserAccountPicker;
        this.successPane = successPane;
        this.idConsentContentPane = iDConsentContentPane;
    }
}
