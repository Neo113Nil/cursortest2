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
public final class LegalDetailsNotice implements Parcelable {
    public final LegalDetailsBody body;
    public final String cta;
    public final String disclaimer;
    public final Image icon;
    public final String subtitle;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<LegalDetailsNotice> CREATOR = new Cta.Creator(28);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/LegalDetailsNotice$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return LegalDetailsNotice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LegalDetailsNotice(int i, Image image, String str, String str2, LegalDetailsBody legalDetailsBody, String str3, String str4) {
        if (26 != (i & 26)) {
            TuplesKt.throwMissingFieldException(i, 26, LegalDetailsNotice$$serializer.INSTANCE.getDescriptor());
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
        this.body = legalDetailsBody;
        this.cta = str3;
        if ((i & 32) == 0) {
            this.disclaimer = null;
        } else {
            this.disclaimer = str4;
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
        if (!(obj instanceof LegalDetailsNotice)) {
            return false;
        }
        LegalDetailsNotice legalDetailsNotice = (LegalDetailsNotice) obj;
        return Intrinsics.areEqual(this.icon, legalDetailsNotice.icon) && Intrinsics.areEqual(this.title, legalDetailsNotice.title) && Intrinsics.areEqual(this.subtitle, legalDetailsNotice.subtitle) && Intrinsics.areEqual(this.body, legalDetailsNotice.body) && Intrinsics.areEqual(this.cta, legalDetailsNotice.cta) && Intrinsics.areEqual(this.disclaimer, legalDetailsNotice.disclaimer);
    }

    public final int hashCode() {
        Image image = this.icon;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((image == null ? 0 : image.hashCode()) * 31, 31, this.title);
        String str = this.subtitle;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.body.links), 31, this.cta);
        String str2 = this.disclaimer;
        return m2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegalDetailsNotice(icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", cta=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.cta, ", disclaimer=", this.disclaimer, ")");
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
        parcel.writeString(this.cta);
        parcel.writeString(this.disclaimer);
    }

    public LegalDetailsNotice(Image image, String str, String str2, LegalDetailsBody legalDetailsBody, String str3, String str4) {
        str.getClass();
        legalDetailsBody.getClass();
        str3.getClass();
        this.icon = image;
        this.title = str;
        this.subtitle = str2;
        this.body = legalDetailsBody;
        this.cta = str3;
        this.disclaimer = str4;
    }
}
