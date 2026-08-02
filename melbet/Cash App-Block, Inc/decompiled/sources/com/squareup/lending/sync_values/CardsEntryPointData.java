package com.squareup.lending.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardsEntryPointData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardsEntryPointData> CREATOR;
    public final List app_supports;
    public final CardsEntryPointData$EntryPoint$ToggleEntryPointData entry_point;

    static {
        CardsEntryPointData$Companion$ADAPTER$1 cardsEntryPointData$Companion$ADAPTER$1 = new CardsEntryPointData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardsEntryPointData.class), "type.googleapis.com/squareup.lending.sync_values.CardsEntryPointData", Syntax.PROTO_2, null, "squareup/lending/prepurchase_cash_card_sync_values.proto");
        ADAPTER = cardsEntryPointData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardsEntryPointData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsEntryPointData(List list, CardsEntryPointData$EntryPoint$ToggleEntryPointData cardsEntryPointData$EntryPoint$ToggleEntryPointData, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.entry_point = cardsEntryPointData$EntryPoint$ToggleEntryPointData;
        this.app_supports = TransactorKt.immutableCopyOf("app_supports", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardsEntryPointData)) {
            return false;
        }
        CardsEntryPointData cardsEntryPointData = (CardsEntryPointData) obj;
        return Intrinsics.areEqual(unknownFields(), cardsEntryPointData.unknownFields()) && Intrinsics.areEqual(this.app_supports, cardsEntryPointData.app_supports) && Intrinsics.areEqual(this.entry_point, cardsEntryPointData.entry_point);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.app_supports);
        CardsEntryPointData$EntryPoint$ToggleEntryPointData cardsEntryPointData$EntryPoint$ToggleEntryPointData = this.entry_point;
        int hashCode = m + (cardsEntryPointData$EntryPoint$ToggleEntryPointData != null ? cardsEntryPointData$EntryPoint$ToggleEntryPointData.value.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(28);
        builder.customer_token = this.app_supports;
        builder.sponsorship_tier = this.entry_point;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.app_supports;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("app_supports=", arrayList, list);
        }
        CardsEntryPointData$EntryPoint$ToggleEntryPointData cardsEntryPointData$EntryPoint$ToggleEntryPointData = this.entry_point;
        if (cardsEntryPointData$EntryPoint$ToggleEntryPointData != null) {
            arrayList.add("entry_point=" + cardsEntryPointData$EntryPoint$ToggleEntryPointData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardsEntryPointData{", "}", 0, null, null, 56);
    }
}
