package com.squareup.protos.cash.woodrow.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.cash.woodrow.model.v1.AssetAcquisition$AcquisitionType;
import com.squareup.protos.common.Money;
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
public final class AcquisitionSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AcquisitionSummary> CREATOR;
    public final AssetAcquisition$AcquisitionType acquisition_type;
    public final Money amount;

    static {
        AcquisitionSummary$Companion$ADAPTER$1 acquisitionSummary$Companion$ADAPTER$1 = new AcquisitionSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AcquisitionSummary.class), "type.googleapis.com/squareup.cash.woodrow.syncvalues.AcquisitionSummary", Syntax.PROTO_3, null, "squareup/cash/woodrow/syncvalues/types.proto");
        ADAPTER = acquisitionSummary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(acquisitionSummary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcquisitionSummary(AssetAcquisition$AcquisitionType assetAcquisition$AcquisitionType, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        assetAcquisition$AcquisitionType.getClass();
        byteString.getClass();
        this.acquisition_type = assetAcquisition$AcquisitionType;
        this.amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AcquisitionSummary)) {
            return false;
        }
        AcquisitionSummary acquisitionSummary = (AcquisitionSummary) obj;
        return Intrinsics.areEqual(unknownFields(), acquisitionSummary.unknownFields()) && this.acquisition_type == acquisitionSummary.acquisition_type && Intrinsics.areEqual(this.amount, acquisitionSummary.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (this.acquisition_type.hashCode() + (unknownFields().hashCode() * 37)) * 37;
        Money money = this.amount;
        int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(23);
        TransactionType.Companion companion = AssetAcquisition$AcquisitionType.Companion;
        builder.primary_button = this.acquisition_type;
        builder.secondary_button = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("acquisition_type=" + this.acquisition_type);
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AcquisitionSummary{", "}", 0, null, null, 56);
    }
}
