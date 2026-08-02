package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.Cta;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class IDConsentContentPane implements Parcelable {
    public final LegalDetailsNotice legalDetailsNotice;
    public final FinancialConnectionsGenericInfoScreen screen;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<IDConsentContentPane> CREATOR = new Cta.Creator(25);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/IDConsentContentPane$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/IDConsentContentPane;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return IDConsentContentPane$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IDConsentContentPane(int i, FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, LegalDetailsNotice legalDetailsNotice) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, IDConsentContentPane$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.screen = financialConnectionsGenericInfoScreen;
        this.legalDetailsNotice = legalDetailsNotice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IDConsentContentPane)) {
            return false;
        }
        IDConsentContentPane iDConsentContentPane = (IDConsentContentPane) obj;
        return Intrinsics.areEqual(this.screen, iDConsentContentPane.screen) && Intrinsics.areEqual(this.legalDetailsNotice, iDConsentContentPane.legalDetailsNotice);
    }

    public final int hashCode() {
        return this.legalDetailsNotice.hashCode() + (this.screen.hashCode() * 31);
    }

    public final String toString() {
        return "IDConsentContentPane(screen=" + this.screen + ", legalDetailsNotice=" + this.legalDetailsNotice + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.screen.writeToParcel(parcel, i);
        this.legalDetailsNotice.writeToParcel(parcel, i);
    }

    public IDConsentContentPane(FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, LegalDetailsNotice legalDetailsNotice) {
        financialConnectionsGenericInfoScreen.getClass();
        legalDetailsNotice.getClass();
        this.screen = financialConnectionsGenericInfoScreen;
        this.legalDetailsNotice = legalDetailsNotice;
    }
}
