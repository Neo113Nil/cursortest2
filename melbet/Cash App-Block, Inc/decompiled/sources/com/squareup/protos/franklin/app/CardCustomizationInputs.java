package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzdb;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
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
public final class CardCustomizationInputs extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardCustomizationInputs> CREATOR;
    public final zzdb customization_source;
    public final Boolean include_cashtag;

    static {
        CardCustomizationInputs$Companion$ADAPTER$1 cardCustomizationInputs$Companion$ADAPTER$1 = new CardCustomizationInputs$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardCustomizationInputs.class), "type.googleapis.com/squareup.franklin.app.CardCustomizationInputs", Syntax.PROTO_2, null, "squareup/franklin/app/payment_device_customization.proto");
        ADAPTER = cardCustomizationInputs$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardCustomizationInputs$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardCustomizationInputs(zzdb zzdbVar, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customization_source = zzdbVar;
        this.include_cashtag = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardCustomizationInputs)) {
            return false;
        }
        CardCustomizationInputs cardCustomizationInputs = (CardCustomizationInputs) obj;
        return Intrinsics.areEqual(unknownFields(), cardCustomizationInputs.unknownFields()) && Intrinsics.areEqual(this.customization_source, cardCustomizationInputs.customization_source) && Intrinsics.areEqual(this.include_cashtag, cardCustomizationInputs.include_cashtag);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzdb zzdbVar = this.customization_source;
        int hashCode2 = (hashCode + (zzdbVar != null ? zzdbVar.hashCode() : 0)) * 37;
        Boolean bool = this.include_cashtag;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(3);
        builder.strings = this.customization_source;
        builder.recurring_deposits_dda_upsell = this.include_cashtag;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzdb zzdbVar = this.customization_source;
        if (zzdbVar != null) {
            arrayList.add("customization_source=" + zzdbVar);
        }
        Boolean bool = this.include_cashtag;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_cashtag=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardCustomizationInputs{", "}", 0, null, null, 56);
    }
}
