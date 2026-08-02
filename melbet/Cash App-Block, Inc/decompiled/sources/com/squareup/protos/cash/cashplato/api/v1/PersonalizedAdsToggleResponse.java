package com.squareup.protos.cash.cashplato.api.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuj;
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
public final class PersonalizedAdsToggleResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PersonalizedAdsToggleResponse> CREATOR;
    public final zzuj response;

    static {
        PersonalizedAdsToggleResponse$Companion$ADAPTER$1 personalizedAdsToggleResponse$Companion$ADAPTER$1 = new PersonalizedAdsToggleResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PersonalizedAdsToggleResponse.class), "type.googleapis.com/squareup.cash.cashplato.api.v1.PersonalizedAdsToggleResponse", Syntax.PROTO_2, null, "squareup/cash/cashplato/api/v1/cash_plato_service.proto");
        ADAPTER = personalizedAdsToggleResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(personalizedAdsToggleResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizedAdsToggleResponse(zzuj zzujVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = zzujVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonalizedAdsToggleResponse)) {
            return false;
        }
        PersonalizedAdsToggleResponse personalizedAdsToggleResponse = (PersonalizedAdsToggleResponse) obj;
        return Intrinsics.areEqual(unknownFields(), personalizedAdsToggleResponse.unknownFields()) && Intrinsics.areEqual(this.response, personalizedAdsToggleResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzuj zzujVar = this.response;
        int hashCode2 = hashCode + (zzujVar != null ? zzujVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(21);
        builder.activity = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzuj zzujVar = this.response;
        if (zzujVar != null) {
            arrayList.add("response=" + zzujVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PersonalizedAdsToggleResponse{", "}", 0, null, null, 56);
    }
}
