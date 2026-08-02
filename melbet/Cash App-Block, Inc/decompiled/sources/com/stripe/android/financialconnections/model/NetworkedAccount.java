package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.financialconnections.model.ServerLink;
import defpackage.FinancialConnectionsGenericInfoScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class NetworkedAccount implements Parcelable {
    public final Image accountIcon;
    public final boolean allowSelection;
    public final String caption;
    public final DataAccessNotice dataAccessNotice;
    public final FinancialConnectionsGenericInfoScreen drawerOnSelection;
    public final Image icon;
    public final String id;
    public final String selectionCta;
    public final Image selectionCtaIcon;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<NetworkedAccount> CREATOR = new ServerLink.Creator(2);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/NetworkedAccount$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/NetworkedAccount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return NetworkedAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetworkedAccount(int i, String str, boolean z, String str2, String str3, Image image, Image image2, Image image3, DataAccessNotice dataAccessNotice, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, NetworkedAccount$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.allowSelection = z;
        if ((i & 4) == 0) {
            this.caption = null;
        } else {
            this.caption = str2;
        }
        if ((i & 8) == 0) {
            this.selectionCta = null;
        } else {
            this.selectionCta = str3;
        }
        if ((i & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        if ((i & 32) == 0) {
            this.selectionCtaIcon = null;
        } else {
            this.selectionCtaIcon = image2;
        }
        if ((i & 64) == 0) {
            this.accountIcon = null;
        } else {
            this.accountIcon = image3;
        }
        if ((i & 128) == 0) {
            this.dataAccessNotice = null;
        } else {
            this.dataAccessNotice = dataAccessNotice;
        }
        if ((i & 256) == 0) {
            this.drawerOnSelection = null;
        } else {
            this.drawerOnSelection = financialConnectionsGenericInfoScreen;
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
        if (!(obj instanceof NetworkedAccount)) {
            return false;
        }
        NetworkedAccount networkedAccount = (NetworkedAccount) obj;
        return Intrinsics.areEqual(this.id, networkedAccount.id) && this.allowSelection == networkedAccount.allowSelection && Intrinsics.areEqual(this.caption, networkedAccount.caption) && Intrinsics.areEqual(this.selectionCta, networkedAccount.selectionCta) && Intrinsics.areEqual(this.icon, networkedAccount.icon) && Intrinsics.areEqual(this.selectionCtaIcon, networkedAccount.selectionCtaIcon) && Intrinsics.areEqual(this.accountIcon, networkedAccount.accountIcon) && Intrinsics.areEqual(this.dataAccessNotice, networkedAccount.dataAccessNotice) && Intrinsics.areEqual(this.drawerOnSelection, networkedAccount.drawerOnSelection);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.allowSelection);
        String str = this.caption;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectionCta;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.icon;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.selectionCtaIcon;
        int hashCode4 = (hashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Image image3 = this.accountIcon;
        int hashCode5 = (hashCode4 + (image3 == null ? 0 : image3.hashCode())) * 31;
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        int hashCode6 = (hashCode5 + (dataAccessNotice == null ? 0 : dataAccessNotice.hashCode())) * 31;
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = this.drawerOnSelection;
        return hashCode6 + (financialConnectionsGenericInfoScreen != null ? financialConnectionsGenericInfoScreen.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("NetworkedAccount(id=", this.id, ", allowSelection=", ", caption=", this.allowSelection);
        Boxes$$ExternalSyntheticOutline1.m(m1540m, this.caption, ", selectionCta=", this.selectionCta, ", icon=");
        m1540m.append(this.icon);
        m1540m.append(", selectionCtaIcon=");
        m1540m.append(this.selectionCtaIcon);
        m1540m.append(", accountIcon=");
        m1540m.append(this.accountIcon);
        m1540m.append(", dataAccessNotice=");
        m1540m.append(this.dataAccessNotice);
        m1540m.append(", drawerOnSelection=");
        m1540m.append(this.drawerOnSelection);
        m1540m.append(")");
        return m1540m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeInt(this.allowSelection ? 1 : 0);
        parcel.writeString(this.caption);
        parcel.writeString(this.selectionCta);
        Image image = this.icon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(image.f809default);
        }
        Image image2 = this.selectionCtaIcon;
        if (image2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(image2.f809default);
        }
        Image image3 = this.accountIcon;
        if (image3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(image3.f809default);
        }
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        if (dataAccessNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dataAccessNotice.writeToParcel(parcel, i);
        }
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = this.drawerOnSelection;
        if (financialConnectionsGenericInfoScreen == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financialConnectionsGenericInfoScreen.writeToParcel(parcel, i);
        }
    }

    public NetworkedAccount(String str, boolean z, String str2, String str3, Image image, Image image2, Image image3, DataAccessNotice dataAccessNotice, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen) {
        str.getClass();
        this.id = str;
        this.allowSelection = z;
        this.caption = str2;
        this.selectionCta = str3;
        this.icon = image;
        this.selectionCtaIcon = image2;
        this.accountIcon = image3;
        this.dataAccessNotice = dataAccessNotice;
        this.drawerOnSelection = financialConnectionsGenericInfoScreen;
    }
}
