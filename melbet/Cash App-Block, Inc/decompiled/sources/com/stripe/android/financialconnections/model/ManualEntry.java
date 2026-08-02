package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.ServerLink;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class ManualEntry implements Parcelable {
    public final ManualEntryMode mode;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ManualEntry> CREATOR = new ServerLink.Creator(1);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/ManualEntry$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ManualEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ManualEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ManualEntry(int i, ManualEntryMode manualEntryMode) {
        if (1 == (i & 1)) {
            this.mode = manualEntryMode;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, ManualEntry$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof ManualEntry) && this.mode == ((ManualEntry) obj).mode;
    }

    public final int hashCode() {
        return this.mode.hashCode();
    }

    public final String toString() {
        return "ManualEntry(mode=" + this.mode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.mode.name());
    }

    public ManualEntry(ManualEntryMode manualEntryMode) {
        manualEntryMode.getClass();
        this.mode = manualEntryMode;
    }
}
