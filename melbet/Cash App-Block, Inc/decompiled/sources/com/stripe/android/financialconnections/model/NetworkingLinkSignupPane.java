package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.financialconnections.model.ServerLink;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class NetworkingLinkSignupPane implements Parcelable {
    public final String aboveCta;
    public final NetworkingLinkSignupBody body;
    public final String cta;
    public final LegalDetailsNotice legalDetailsNotice;
    public final String skipCta;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<NetworkingLinkSignupPane> CREATOR = new ServerLink.Creator(4);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/NetworkingLinkSignupPane$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return NetworkingLinkSignupPane$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetworkingLinkSignupPane(int i, String str, NetworkingLinkSignupBody networkingLinkSignupBody, String str2, String str3, String str4, LegalDetailsNotice legalDetailsNotice) {
        if (31 != (i & 31)) {
            TuplesKt.throwMissingFieldException(i, 31, NetworkingLinkSignupPane$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.body = networkingLinkSignupBody;
        this.aboveCta = str2;
        this.cta = str3;
        this.skipCta = str4;
        if ((i & 32) == 0) {
            this.legalDetailsNotice = null;
        } else {
            this.legalDetailsNotice = legalDetailsNotice;
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
        if (!(obj instanceof NetworkingLinkSignupPane)) {
            return false;
        }
        NetworkingLinkSignupPane networkingLinkSignupPane = (NetworkingLinkSignupPane) obj;
        return Intrinsics.areEqual(this.title, networkingLinkSignupPane.title) && Intrinsics.areEqual(this.body, networkingLinkSignupPane.body) && Intrinsics.areEqual(this.aboveCta, networkingLinkSignupPane.aboveCta) && Intrinsics.areEqual(this.cta, networkingLinkSignupPane.cta) && Intrinsics.areEqual(this.skipCta, networkingLinkSignupPane.skipCta) && Intrinsics.areEqual(this.legalDetailsNotice, networkingLinkSignupPane.legalDetailsNotice);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.body.bullets), 31, this.aboveCta), 31, this.cta), 31, this.skipCta);
        LegalDetailsNotice legalDetailsNotice = this.legalDetailsNotice;
        return m + (legalDetailsNotice == null ? 0 : legalDetailsNotice.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkingLinkSignupPane(title=");
        sb.append(this.title);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", aboveCta=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.aboveCta, ", cta=", this.cta, ", skipCta=");
        sb.append(this.skipCta);
        sb.append(", legalDetailsNotice=");
        sb.append(this.legalDetailsNotice);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        this.body.writeToParcel(parcel, i);
        parcel.writeString(this.aboveCta);
        parcel.writeString(this.cta);
        parcel.writeString(this.skipCta);
        LegalDetailsNotice legalDetailsNotice = this.legalDetailsNotice;
        if (legalDetailsNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            legalDetailsNotice.writeToParcel(parcel, i);
        }
    }

    public NetworkingLinkSignupPane(String str, NetworkingLinkSignupBody networkingLinkSignupBody, String str2, String str3, String str4, LegalDetailsNotice legalDetailsNotice) {
        str.getClass();
        networkingLinkSignupBody.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.title = str;
        this.body = networkingLinkSignupBody;
        this.aboveCta = str2;
        this.cta = str3;
        this.skipCta = str4;
        this.legalDetailsNotice = legalDetailsNotice;
    }
}
