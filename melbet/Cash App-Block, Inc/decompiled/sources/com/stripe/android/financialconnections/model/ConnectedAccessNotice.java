package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.Cta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class ConnectedAccessNotice implements Parcelable {
    public final DataAccessNoticeBody body;
    public final String subtitle;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ConnectedAccessNotice> CREATOR = new Cta.Creator(6);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/ConnectedAccessNotice$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ConnectedAccessNotice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConnectedAccessNotice(int i, String str, DataAccessNoticeBody dataAccessNoticeBody) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, ConnectedAccessNotice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.subtitle = str;
        this.body = dataAccessNoticeBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectedAccessNotice)) {
            return false;
        }
        ConnectedAccessNotice connectedAccessNotice = (ConnectedAccessNotice) obj;
        return Intrinsics.areEqual(this.subtitle, connectedAccessNotice.subtitle) && Intrinsics.areEqual(this.body, connectedAccessNotice.body);
    }

    public final int hashCode() {
        return this.body.bullets.hashCode() + (this.subtitle.hashCode() * 31);
    }

    public final String toString() {
        return "ConnectedAccessNotice(subtitle=" + this.subtitle + ", body=" + this.body + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.subtitle);
        this.body.writeToParcel(parcel, i);
    }

    public ConnectedAccessNotice(String str, DataAccessNoticeBody dataAccessNoticeBody) {
        str.getClass();
        dataAccessNoticeBody.getClass();
        this.subtitle = str;
        this.body = dataAccessNoticeBody;
    }
}
