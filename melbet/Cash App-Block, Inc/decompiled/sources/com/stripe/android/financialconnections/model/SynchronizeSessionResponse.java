package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.ServerLink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class SynchronizeSessionResponse implements Parcelable {
    public final FinancialConnectionsSessionManifest manifest;
    public final TextUpdate text;
    public final VisualUpdate visual;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SynchronizeSessionResponse> CREATOR = new ServerLink.Creator(13);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/SynchronizeSessionResponse$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return SynchronizeSessionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SynchronizeSessionResponse(int i, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate, VisualUpdate visualUpdate) {
        if (5 != (i & 5)) {
            TuplesKt.throwMissingFieldException(i, 5, SynchronizeSessionResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.manifest = financialConnectionsSessionManifest;
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = textUpdate;
        }
        this.visual = visualUpdate;
    }

    public static SynchronizeSessionResponse copy$default(SynchronizeSessionResponse synchronizeSessionResponse, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate, int i) {
        if ((i & 1) != 0) {
            financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
        }
        if ((i & 2) != 0) {
            textUpdate = synchronizeSessionResponse.text;
        }
        VisualUpdate visualUpdate = synchronizeSessionResponse.visual;
        financialConnectionsSessionManifest.getClass();
        visualUpdate.getClass();
        return new SynchronizeSessionResponse(financialConnectionsSessionManifest, textUpdate, visualUpdate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SynchronizeSessionResponse)) {
            return false;
        }
        SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
        return Intrinsics.areEqual(this.manifest, synchronizeSessionResponse.manifest) && Intrinsics.areEqual(this.text, synchronizeSessionResponse.text) && Intrinsics.areEqual(this.visual, synchronizeSessionResponse.visual);
    }

    public final int hashCode() {
        int hashCode = this.manifest.hashCode() * 31;
        TextUpdate textUpdate = this.text;
        return this.visual.hashCode() + ((hashCode + (textUpdate == null ? 0 : textUpdate.hashCode())) * 31);
    }

    public final String toString() {
        return "SynchronizeSessionResponse(manifest=" + this.manifest + ", text=" + this.text + ", visual=" + this.visual + ")";
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
        this.visual.writeToParcel(parcel, i);
    }

    public SynchronizeSessionResponse(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, TextUpdate textUpdate, VisualUpdate visualUpdate) {
        financialConnectionsSessionManifest.getClass();
        visualUpdate.getClass();
        this.manifest = financialConnectionsSessionManifest;
        this.text = textUpdate;
        this.visual = visualUpdate;
    }
}
