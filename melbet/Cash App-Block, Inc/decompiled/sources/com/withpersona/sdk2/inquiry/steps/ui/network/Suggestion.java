package com.withpersona.sdk2.inquiry.steps.ui.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import net.oneformapp.schema.Element;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "Landroid/os/Parcelable;", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Suggestion implements Parcelable {
    public static final Parcelable.Creator<Suggestion> CREATOR = new Element.AnonymousClass1(3);
    public final String address;
    public final String id;

    public Suggestion(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.address = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.valueOf(this.address);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.address);
    }
}
