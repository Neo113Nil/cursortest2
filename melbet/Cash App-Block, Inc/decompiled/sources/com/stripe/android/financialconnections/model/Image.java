package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.Cta;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class Image implements Parcelable, java.io.Serializable {

    /* renamed from: default, reason: not valid java name */
    public final String f809default;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Image> CREATOR = new Cta.Creator(26);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/Image$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/Image;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Image$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Image(int i, String str) {
        if (1 == (i & 1)) {
            this.f809default = str;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, Image$$serializer.INSTANCE.getDescriptor());
            throw null;
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
        return (obj instanceof Image) && Intrinsics.areEqual(this.f809default, ((Image) obj).f809default);
    }

    public final int hashCode() {
        String str = this.f809default;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Image(default=", this.f809default, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f809default);
    }

    public Image(String str) {
        this.f809default = str;
    }
}
