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
public final class ConsentPane implements Parcelable {
    public final String aboveCta;
    public final String belowCta;
    public final ConsentPaneBody body;
    public final String cta;
    public final DataAccessNotice dataAccessNotice;
    public final LegalDetailsNotice legalDetailsNotice;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ConsentPane> CREATOR = new Cta.Creator(7);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/ConsentPane$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ConsentPane$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConsentPane(int i, String str, String str2, ConsentPaneBody consentPaneBody, String str3, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String str4) {
        if (109 != (i & 109)) {
            TuplesKt.throwMissingFieldException(i, 109, ConsentPane$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.aboveCta = str;
        if ((i & 2) == 0) {
            this.belowCta = null;
        } else {
            this.belowCta = str2;
        }
        this.body = consentPaneBody;
        this.cta = str3;
        if ((i & 16) == 0) {
            this.dataAccessNotice = null;
        } else {
            this.dataAccessNotice = dataAccessNotice;
        }
        this.legalDetailsNotice = legalDetailsNotice;
        this.title = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentPane)) {
            return false;
        }
        ConsentPane consentPane = (ConsentPane) obj;
        return Intrinsics.areEqual(this.aboveCta, consentPane.aboveCta) && Intrinsics.areEqual(this.belowCta, consentPane.belowCta) && Intrinsics.areEqual(this.body, consentPane.body) && Intrinsics.areEqual(this.cta, consentPane.cta) && Intrinsics.areEqual(this.dataAccessNotice, consentPane.dataAccessNotice) && Intrinsics.areEqual(this.legalDetailsNotice, consentPane.legalDetailsNotice) && Intrinsics.areEqual(this.title, consentPane.title);
    }

    public final int hashCode() {
        int hashCode = this.aboveCta.hashCode() * 31;
        String str = this.belowCta;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.body.bullets), 31, this.cta);
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        return this.title.hashCode() + ((this.legalDetailsNotice.hashCode() + ((m + (dataAccessNotice != null ? dataAccessNotice.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConsentPane(aboveCta=", this.aboveCta, ", belowCta=", this.belowCta, ", body=");
        m.append(this.body);
        m.append(", cta=");
        m.append(this.cta);
        m.append(", dataAccessNotice=");
        m.append(this.dataAccessNotice);
        m.append(", legalDetailsNotice=");
        m.append(this.legalDetailsNotice);
        m.append(", title=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.title, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.aboveCta);
        parcel.writeString(this.belowCta);
        this.body.writeToParcel(parcel, i);
        parcel.writeString(this.cta);
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        if (dataAccessNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dataAccessNotice.writeToParcel(parcel, i);
        }
        this.legalDetailsNotice.writeToParcel(parcel, i);
        parcel.writeString(this.title);
    }

    public ConsentPane(String str, String str2, ConsentPaneBody consentPaneBody, String str3, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String str4) {
        str.getClass();
        consentPaneBody.getClass();
        str3.getClass();
        legalDetailsNotice.getClass();
        str4.getClass();
        this.aboveCta = str;
        this.belowCta = str2;
        this.body = consentPaneBody;
        this.cta = str3;
        this.dataAccessNotice = dataAccessNotice;
        this.legalDetailsNotice = legalDetailsNotice;
        this.title = str4;
    }
}
