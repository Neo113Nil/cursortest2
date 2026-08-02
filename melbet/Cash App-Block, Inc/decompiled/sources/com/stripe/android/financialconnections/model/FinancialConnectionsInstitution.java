package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.model.Cta;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class FinancialConnectionsInstitution implements Parcelable, java.io.Serializable {
    public final boolean featured;
    public final Integer featuredOrder;
    public final Image icon;
    public final String id;
    public final Image logo;
    public final boolean mobileHandoffCapable;
    public final String name;
    public final String url;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FinancialConnectionsInstitution> CREATOR = new Cta.Creator(18);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsInstitution$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FinancialConnectionsInstitution$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsInstitution(int i, boolean z, String str, boolean z2, String str2, Image image, Image image2, Integer num, String str3) {
        if (15 != (i & 15)) {
            TuplesKt.throwMissingFieldException(i, 15, FinancialConnectionsInstitution$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.featured = z;
        this.id = str;
        this.mobileHandoffCapable = z2;
        this.name = str2;
        if ((i & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        if ((i & 32) == 0) {
            this.logo = null;
        } else {
            this.logo = image2;
        }
        if ((i & 64) == 0) {
            this.featuredOrder = null;
        } else {
            this.featuredOrder = num;
        }
        if ((i & 128) == 0) {
            this.url = null;
        } else {
            this.url = str3;
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
        if (!(obj instanceof FinancialConnectionsInstitution)) {
            return false;
        }
        FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) obj;
        return this.featured == financialConnectionsInstitution.featured && Intrinsics.areEqual(this.id, financialConnectionsInstitution.id) && this.mobileHandoffCapable == financialConnectionsInstitution.mobileHandoffCapable && Intrinsics.areEqual(this.name, financialConnectionsInstitution.name) && Intrinsics.areEqual(this.icon, financialConnectionsInstitution.icon) && Intrinsics.areEqual(this.logo, financialConnectionsInstitution.logo) && Intrinsics.areEqual(this.featuredOrder, financialConnectionsInstitution.featuredOrder) && Intrinsics.areEqual(this.url, financialConnectionsInstitution.url);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.featured) * 31, 31, this.id), 31, this.mobileHandoffCapable), 31, this.name);
        Image image = this.icon;
        int hashCode = (m + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.logo;
        int hashCode2 = (hashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num = this.featuredOrder;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.url;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("FinancialConnectionsInstitution(featured=", ", id=", this.id, ", mobileHandoffCapable=", this.featured);
        NavAction$$ExternalSyntheticOutline0.m(m, this.mobileHandoffCapable, ", name=", this.name, ", icon=");
        m.append(this.icon);
        m.append(", logo=");
        m.append(this.logo);
        m.append(", featuredOrder=");
        m.append(this.featuredOrder);
        m.append(", url=");
        m.append(this.url);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.featured ? 1 : 0);
        parcel.writeString(this.id);
        parcel.writeInt(this.mobileHandoffCapable ? 1 : 0);
        parcel.writeString(this.name);
        Image image = this.icon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(image.f809default);
        }
        Image image2 = this.logo;
        if (image2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(image2.f809default);
        }
        Integer num = this.featuredOrder;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        parcel.writeString(this.url);
    }

    public FinancialConnectionsInstitution(boolean z, String str, boolean z2, String str2, Image image, Image image2, Integer num, String str3) {
        str.getClass();
        str2.getClass();
        this.featured = z;
        this.id = str;
        this.mobileHandoffCapable = z2;
        this.name = str2;
        this.icon = image;
        this.logo = image2;
        this.featuredOrder = num;
        this.url = str3;
    }
}
