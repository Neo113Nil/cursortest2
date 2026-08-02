package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzlr;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ProvisioningEligibility extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProvisioningEligibility> CREATOR;
    public final zzlr decision;

    static {
        ProvisioningEligibility$Companion$ADAPTER$1 provisioningEligibility$Companion$ADAPTER$1 = new ProvisioningEligibility$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProvisioningEligibility.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.ProvisioningEligibility", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/on_fidesmo_provisioning_start.proto");
        ADAPTER = provisioningEligibility$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(provisioningEligibility$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProvisioningEligibility(zzlr zzlrVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.decision = zzlrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProvisioningEligibility)) {
            return false;
        }
        ProvisioningEligibility provisioningEligibility = (ProvisioningEligibility) obj;
        return Intrinsics.areEqual(unknownFields(), provisioningEligibility.unknownFields()) && Intrinsics.areEqual(this.decision, provisioningEligibility.decision);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzlr zzlrVar = this.decision;
        int hashCode2 = hashCode + (zzlrVar != null ? zzlrVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(3);
        builder.claimable_payment = this.decision;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzlr zzlrVar = this.decision;
        if (zzlrVar != null) {
            arrayList.add("decision=" + zzlrVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProvisioningEligibility{", "}", 0, null, null, 56);
    }
}
