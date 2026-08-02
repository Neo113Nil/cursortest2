package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.experiments.bouncer.CardScanResult;
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
public final class KeyedCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<KeyedCard> CREATOR;
    public final CardScanResult bouncer_scan_result;
    public final String cardholder_name;
    public final String expiration;
    public final InstrumentType instrument_type;
    public final String last_four;
    public final String postal_code;
    public final String security_code;
    public final String unencrypted_pan;

    static {
        KeyedCard$Companion$ADAPTER$1 keyedCard$Companion$ADAPTER$1 = new KeyedCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(KeyedCard.class), "type.googleapis.com/squareup.franklin.common.KeyedCard", Syntax.PROTO_2, null, "squareup/franklin/common/keyed_card.proto");
        ADAPTER = keyedCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(keyedCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedCard(String str, String str2, String str3, String str4, String str5, InstrumentType instrumentType, String str6, CardScanResult cardScanResult, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.unencrypted_pan = str;
        this.expiration = str2;
        this.security_code = str3;
        this.postal_code = str4;
        this.last_four = str5;
        this.instrument_type = instrumentType;
        this.cardholder_name = str6;
        this.bouncer_scan_result = cardScanResult;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeyedCard)) {
            return false;
        }
        KeyedCard keyedCard = (KeyedCard) obj;
        return Intrinsics.areEqual(unknownFields(), keyedCard.unknownFields()) && Intrinsics.areEqual(this.unencrypted_pan, keyedCard.unencrypted_pan) && Intrinsics.areEqual(this.expiration, keyedCard.expiration) && Intrinsics.areEqual(this.security_code, keyedCard.security_code) && Intrinsics.areEqual(this.postal_code, keyedCard.postal_code) && Intrinsics.areEqual(this.last_four, keyedCard.last_four) && this.instrument_type == keyedCard.instrument_type && Intrinsics.areEqual(this.cardholder_name, keyedCard.cardholder_name) && Intrinsics.areEqual(this.bouncer_scan_result, keyedCard.bouncer_scan_result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.unencrypted_pan;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.expiration;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.security_code;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.postal_code;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.last_four;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        InstrumentType instrumentType = this.instrument_type;
        int hashCode7 = (hashCode6 + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        String str6 = this.cardholder_name;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        CardScanResult cardScanResult = this.bouncer_scan_result;
        int hashCode9 = hashCode8 + (cardScanResult != null ? cardScanResult.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(26, false);
        builder.category = this.unencrypted_pan;
        builder.token = this.expiration;
        builder.title = this.security_code;
        builder.client_route = this.postal_code;
        builder.url = this.last_four;
        builder.version_data = this.instrument_type;
        builder.owner_token = this.cardholder_name;
        builder.localizable_title = this.bouncer_scan_result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.unencrypted_pan != null) {
            arrayList.add("unencrypted_pan=██");
        }
        if (this.expiration != null) {
            arrayList.add("expiration=██");
        }
        if (this.security_code != null) {
            arrayList.add("security_code=██");
        }
        if (this.postal_code != null) {
            arrayList.add("postal_code=██");
        }
        String str = this.last_four;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "last_four=", arrayList);
        }
        InstrumentType instrumentType = this.instrument_type;
        if (instrumentType != null) {
            arrayList.add("instrument_type=" + instrumentType);
        }
        if (this.cardholder_name != null) {
            arrayList.add("cardholder_name=██");
        }
        CardScanResult cardScanResult = this.bouncer_scan_result;
        if (cardScanResult != null) {
            arrayList.add("bouncer_scan_result=" + cardScanResult);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "KeyedCard{", "}", 0, null, null, 56);
    }
}
