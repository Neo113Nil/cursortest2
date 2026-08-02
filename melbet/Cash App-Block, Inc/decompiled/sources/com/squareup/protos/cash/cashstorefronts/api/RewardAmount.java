package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuk;
import com.squareup.protos.cash.cashface.api.Activity;
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

/* loaded from: classes7.dex */
public final class RewardAmount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RewardAmount> CREATOR;
    public final zzuk data;

    static {
        RewardAmount$Companion$ADAPTER$1 rewardAmount$Companion$ADAPTER$1 = new RewardAmount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RewardAmount.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.RewardAmount", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/Offer.proto");
        ADAPTER = rewardAmount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rewardAmount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardAmount(zzuk zzukVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.data = zzukVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RewardAmount)) {
            return false;
        }
        RewardAmount rewardAmount = (RewardAmount) obj;
        return Intrinsics.areEqual(unknownFields(), rewardAmount.unknownFields()) && Intrinsics.areEqual(this.data, rewardAmount.data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzuk zzukVar = this.data;
        int hashCode2 = hashCode + (zzukVar != null ? zzukVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(22);
        builder.activity = this.data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzuk zzukVar = this.data;
        if (zzukVar != null) {
            arrayList.add("data=" + zzukVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RewardAmount{", "}", 0, null, null, 56);
    }
}
