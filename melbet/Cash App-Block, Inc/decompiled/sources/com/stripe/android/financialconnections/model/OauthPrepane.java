package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.ServerLink;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class OauthPrepane implements Parcelable {
    public final Body body;
    public final Cta cta;
    public final DataAccessNotice dataAccessNotice;
    public final Image institutionIcon;
    public final PartnerNotice partnerNotice;
    public final String subtitle;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<OauthPrepane> CREATOR = new ServerLink.Creator(5);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/OauthPrepane$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/OauthPrepane;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return OauthPrepane$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OauthPrepane(int i, Body body, Cta cta, Image image, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String str, String str2) {
        if (99 != (i & 99)) {
            TuplesKt.throwMissingFieldException(i, 99, OauthPrepane$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.body = body;
        this.cta = cta;
        if ((i & 4) == 0) {
            this.institutionIcon = null;
        } else {
            this.institutionIcon = image;
        }
        if ((i & 8) == 0) {
            this.partnerNotice = null;
        } else {
            this.partnerNotice = partnerNotice;
        }
        if ((i & 16) == 0) {
            this.dataAccessNotice = null;
        } else {
            this.dataAccessNotice = dataAccessNotice;
        }
        this.title = str;
        this.subtitle = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OauthPrepane)) {
            return false;
        }
        OauthPrepane oauthPrepane = (OauthPrepane) obj;
        return Intrinsics.areEqual(this.body, oauthPrepane.body) && Intrinsics.areEqual(this.cta, oauthPrepane.cta) && Intrinsics.areEqual(this.institutionIcon, oauthPrepane.institutionIcon) && Intrinsics.areEqual(this.partnerNotice, oauthPrepane.partnerNotice) && Intrinsics.areEqual(this.dataAccessNotice, oauthPrepane.dataAccessNotice) && Intrinsics.areEqual(this.title, oauthPrepane.title) && Intrinsics.areEqual(this.subtitle, oauthPrepane.subtitle);
    }

    public final int hashCode() {
        int hashCode = (this.cta.hashCode() + (this.body.entries.hashCode() * 31)) * 31;
        Image image = this.institutionIcon;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        PartnerNotice partnerNotice = this.partnerNotice;
        int hashCode3 = (hashCode2 + (partnerNotice == null ? 0 : partnerNotice.hashCode())) * 31;
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        return this.subtitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (dataAccessNotice != null ? dataAccessNotice.hashCode() : 0)) * 31, 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OauthPrepane(body=");
        sb.append(this.body);
        sb.append(", cta=");
        sb.append(this.cta);
        sb.append(", institutionIcon=");
        sb.append(this.institutionIcon);
        sb.append(", partnerNotice=");
        sb.append(this.partnerNotice);
        sb.append(", dataAccessNotice=");
        sb.append(this.dataAccessNotice);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.body.writeToParcel(parcel, i);
        this.cta.writeToParcel(parcel, i);
        Image image = this.institutionIcon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(image.f809default);
        }
        PartnerNotice partnerNotice = this.partnerNotice;
        if (partnerNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            partnerNotice.writeToParcel(parcel, i);
        }
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        if (dataAccessNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dataAccessNotice.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
    }

    public OauthPrepane(Body body, Cta cta, Image image, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String str, String str2) {
        body.getClass();
        cta.getClass();
        str.getClass();
        str2.getClass();
        this.body = body;
        this.cta = cta;
        this.institutionIcon = image;
        this.partnerNotice = partnerNotice;
        this.dataAccessNotice = dataAccessNotice;
        this.title = str;
        this.subtitle = str2;
    }
}
