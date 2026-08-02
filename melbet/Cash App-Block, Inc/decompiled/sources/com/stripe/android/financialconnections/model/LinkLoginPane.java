package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.financialconnections.model.Cta;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class LinkLoginPane implements Parcelable {
    public final String aboveCta;
    public final String body;
    public final String cta;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<LinkLoginPane> CREATOR = new Cta.Creator(29);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/LinkLoginPane$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/LinkLoginPane;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return LinkLoginPane$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LinkLoginPane(String str, int i, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            TuplesKt.throwMissingFieldException(i, 15, LinkLoginPane$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.body = str2;
        this.aboveCta = str3;
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
        if (!(obj instanceof LinkLoginPane)) {
            return false;
        }
        LinkLoginPane linkLoginPane = (LinkLoginPane) obj;
        return Intrinsics.areEqual(this.title, linkLoginPane.title) && Intrinsics.areEqual(this.body, linkLoginPane.body) && Intrinsics.areEqual(this.aboveCta, linkLoginPane.aboveCta) && Intrinsics.areEqual(this.cta, linkLoginPane.cta);
    }

    public final int hashCode() {
        return this.cta.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.aboveCta);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LinkLoginPane(title=", this.title, ", body=", this.body, ", aboveCta="), this.aboveCta, ", cta=", this.cta, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeString(this.aboveCta);
        parcel.writeString(this.cta);
    }

    public LinkLoginPane(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.body = str2;
        this.aboveCta = str3;
        this.cta = str4;
    }
}
