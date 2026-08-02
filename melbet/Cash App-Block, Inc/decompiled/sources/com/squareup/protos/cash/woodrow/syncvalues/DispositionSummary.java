package com.squareup.protos.cash.woodrow.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.cash.woodrow.model.v1.AssetDisposition$DispositionType;
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
public final class DispositionSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DispositionSummary> CREATOR;
    public final Money amount;
    public final AssetDisposition$DispositionType disposition_type;

    static {
        DispositionSummary$Companion$ADAPTER$1 dispositionSummary$Companion$ADAPTER$1 = new DispositionSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DispositionSummary.class), "type.googleapis.com/squareup.cash.woodrow.syncvalues.DispositionSummary", Syntax.PROTO_3, null, "squareup/cash/woodrow/syncvalues/types.proto");
        ADAPTER = dispositionSummary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dispositionSummary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DispositionSummary(AssetDisposition$DispositionType assetDisposition$DispositionType, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        assetDisposition$DispositionType.getClass();
        byteString.getClass();
        this.disposition_type = assetDisposition$DispositionType;
        this.amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DispositionSummary)) {
            return false;
        }
        DispositionSummary dispositionSummary = (DispositionSummary) obj;
        return Intrinsics.areEqual(unknownFields(), dispositionSummary.unknownFields()) && this.disposition_type == dispositionSummary.disposition_type && Intrinsics.areEqual(this.amount, dispositionSummary.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (this.disposition_type.hashCode() + (unknownFields().hashCode() * 37)) * 37;
        Money money = this.amount;
        int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(24);
        ActionType.Companion companion = AssetDisposition$DispositionType.Companion;
        builder.primary_button = this.disposition_type;
        builder.secondary_button = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("disposition_type=" + this.disposition_type);
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DispositionSummary{", "}", 0, null, null, 56);
    }
}
