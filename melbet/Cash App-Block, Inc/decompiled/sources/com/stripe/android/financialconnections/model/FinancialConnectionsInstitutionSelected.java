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
public final class FinancialConnectionsInstitutionSelected implements Parcelable {
    public final FinancialConnectionsSessionManifest manifest;
    public final TextUpdate text;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FinancialConnectionsInstitutionSelected> CREATOR = new Cta.Creator(19);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FinancialConnectionsInstitutionSelected$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsInstitutionSelected(int i, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, FinancialConnectionsInstitutionSelected$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.manifest = financialConnectionsSessionManifest;
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = textUpdate;
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
        if (!(obj instanceof FinancialConnectionsInstitutionSelected)) {
            return false;
        }
        FinancialConnectionsInstitutionSelected financialConnectionsInstitutionSelected = (FinancialConnectionsInstitutionSelected) obj;
        return Intrinsics.areEqual(this.manifest, financialConnectionsInstitutionSelected.manifest) && Intrinsics.areEqual(this.text, financialConnectionsInstitutionSelected.text);
    }

    public final int hashCode() {
        int hashCode = this.manifest.hashCode() * 31;
        TextUpdate textUpdate = this.text;
        return hashCode + (textUpdate == null ? 0 : textUpdate.hashCode());
    }

    public final String toString() {
        return "FinancialConnectionsInstitutionSelected(manifest=" + this.manifest + ", text=" + this.text + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.manifest.writeToParcel(parcel, i);
        TextUpdate textUpdate = this.text;
        if (textUpdate == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textUpdate.writeToParcel(parcel, i);
        }
    }

    public FinancialConnectionsInstitutionSelected(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate) {
        financialConnectionsSessionManifest.getClass();
        this.manifest = financialConnectionsSessionManifest;
        this.text = textUpdate;
    }
}
