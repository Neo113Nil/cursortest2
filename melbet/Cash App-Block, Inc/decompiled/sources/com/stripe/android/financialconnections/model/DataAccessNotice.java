package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.stripe.android.financialconnections.model.Cta;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class DataAccessNotice implements Parcelable {
    public final DataAccessNoticeBody body;
    public final ConnectedAccessNotice connectedAccountNotice;
    public final String cta;
    public final String disclaimer;
    public final Image icon;
    public final String subtitle;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DataAccessNotice> CREATOR = new Cta.Creator(10);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/DataAccessNotice$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return DataAccessNotice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DataAccessNotice(int i, Image image, String str, String str2, DataAccessNoticeBody dataAccessNoticeBody, ConnectedAccessNotice connectedAccessNotice, String str3, String str4) {
        if (74 != (i & 74)) {
            TuplesKt.throwMissingFieldException(i, 74, DataAccessNotice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        this.title = str;
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        this.body = dataAccessNoticeBody;
        if ((i & 16) == 0) {
            this.connectedAccountNotice = null;
        } else {
            this.connectedAccountNotice = connectedAccessNotice;
        }
        if ((i & 32) == 0) {
            this.disclaimer = null;
        } else {
            this.disclaimer = str3;
        }
        this.cta = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataAccessNotice)) {
            return false;
        }
        DataAccessNotice dataAccessNotice = (DataAccessNotice) obj;
        return Intrinsics.areEqual(this.icon, dataAccessNotice.icon) && Intrinsics.areEqual(this.title, dataAccessNotice.title) && Intrinsics.areEqual(this.subtitle, dataAccessNotice.subtitle) && Intrinsics.areEqual(this.body, dataAccessNotice.body) && Intrinsics.areEqual(this.connectedAccountNotice, dataAccessNotice.connectedAccountNotice) && Intrinsics.areEqual(this.disclaimer, dataAccessNotice.disclaimer) && Intrinsics.areEqual(this.cta, dataAccessNotice.cta);
    }

    public final int hashCode() {
        Image image = this.icon;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((image == null ? 0 : image.hashCode()) * 31, 31, this.title);
        String str = this.subtitle;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.body.bullets);
        ConnectedAccessNotice connectedAccessNotice = this.connectedAccountNotice;
        int hashCode = (m2 + (connectedAccessNotice == null ? 0 : connectedAccessNotice.hashCode())) * 31;
        String str2 = this.disclaimer;
        return this.cta.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataAccessNotice(icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", connectedAccountNotice=");
        sb.append(this.connectedAccountNotice);
        sb.append(", disclaimer=");
        sb.append(this.disclaimer);
        sb.append(", cta=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.cta, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Image image = this.icon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(image.f809default);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        this.body.writeToParcel(parcel, i);
        ConnectedAccessNotice connectedAccessNotice = this.connectedAccountNotice;
        if (connectedAccessNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            connectedAccessNotice.writeToParcel(parcel, i);
        }
        parcel.writeString(this.disclaimer);
        parcel.writeString(this.cta);
    }

    public DataAccessNotice(Image image, String str, String str2, DataAccessNoticeBody dataAccessNoticeBody, ConnectedAccessNotice connectedAccessNotice, String str3, String str4) {
        str.getClass();
        dataAccessNoticeBody.getClass();
        str4.getClass();
        this.icon = image;
        this.title = str;
        this.subtitle = str2;
        this.body = dataAccessNoticeBody;
        this.connectedAccountNotice = connectedAccessNotice;
        this.disclaimer = str3;
        this.cta = str4;
    }
}
