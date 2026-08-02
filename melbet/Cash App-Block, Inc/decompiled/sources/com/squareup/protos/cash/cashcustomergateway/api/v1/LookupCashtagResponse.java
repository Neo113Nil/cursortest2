package com.squareup.protos.cash.cashcustomergateway.api.v1;

import android.os.Parcelable;
import app.cash.local.primitives.ModifierKt;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/cashcustomergateway/api/v1/LookupCashtagResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/Row$Builder;", "Builder", "app/cash/local/primitives/ModifierKt", "MatchType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LookupCashtagResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LookupCashtagResponse> CREATOR;
    public final String cashtag;
    public final ModifierKt identity;
    public final MatchType match_type;

    public enum MatchType implements WireEnum {
        MATCH_TYPE_UNSPECIFIED(0),
        MATCH_TYPE_LOCAL_BRAND(1),
        MATCH_TYPE_CUSTOMER(2),
        MATCH_TYPE_NONE(3);

        public static final LookupCashtagResponse$MatchType$Companion$ADAPTER$1 ADAPTER;
        public static final WorkCookieJar Companion;
        public final int value;

        static {
            MatchType matchType = MATCH_TYPE_UNSPECIFIED;
            Companion = new WorkCookieJar(24);
            ADAPTER = new LookupCashtagResponse$MatchType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MatchType.class), Syntax.PROTO_2, matchType);
        }

        MatchType(int i) {
            this.value = i;
        }

        public static final MatchType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return MATCH_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return MATCH_TYPE_LOCAL_BRAND;
            }
            if (i == 2) {
                return MATCH_TYPE_CUSTOMER;
            }
            if (i != 3) {
                return null;
            }
            return MATCH_TYPE_NONE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LookupCashtagResponse$Companion$ADAPTER$1 lookupCashtagResponse$Companion$ADAPTER$1 = new LookupCashtagResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LookupCashtagResponse.class), "type.googleapis.com/squareup.cash.cashcustomergateway.api.v1beta1.LookupCashtagResponse", Syntax.PROTO_2, null, "squareup/cash/cashcustomergateway/api/v1beta1/lookup_cashtag_service.proto");
        ADAPTER = lookupCashtagResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lookupCashtagResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookupCashtagResponse(String str, MatchType matchType, ModifierKt modifierKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cashtag = str;
        this.match_type = matchType;
        this.identity = modifierKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LookupCashtagResponse)) {
            return false;
        }
        LookupCashtagResponse lookupCashtagResponse = (LookupCashtagResponse) obj;
        return Intrinsics.areEqual(unknownFields(), lookupCashtagResponse.unknownFields()) && Intrinsics.areEqual(this.cashtag, lookupCashtagResponse.cashtag) && this.match_type == lookupCashtagResponse.match_type && Intrinsics.areEqual(this.identity, lookupCashtagResponse.identity);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cashtag;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        MatchType matchType = this.match_type;
        int hashCode3 = (hashCode2 + (matchType != null ? matchType.hashCode() : 0)) * 37;
        ModifierKt modifierKt = this.identity;
        int hashCode4 = hashCode3 + (modifierKt != null ? modifierKt.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(4);
        builder.title = this.cashtag;
        builder.subtitle = this.match_type;
        builder.action = this.identity;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        MatchType matchType = this.match_type;
        if (matchType != null) {
            arrayList.add("match_type=" + matchType);
        }
        ModifierKt modifierKt = this.identity;
        if (modifierKt != null) {
            arrayList.add("identity=" + modifierKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LookupCashtagResponse{", "}", 0, null, null, 56);
    }
}
