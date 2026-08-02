package com.squareup.protos.cash.blockly.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.local.primitives.LocalBrandBanner;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/blockly/api/AllowlistSearchResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/SubsectionBlock$Builder;", "Builder", "Action", "AllowlistSuggestions", "AllowlistSearchResults", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AllowlistSearchResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AllowlistSearchResponse> CREATOR;
    public final LocalBrandBanner.Action results;

    public final class AllowlistSearchResults extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AllowlistSearchResults> CREATOR;
        public final List customers;

        static {
            AllowlistSearchResponse$AllowlistSearchResults$Companion$ADAPTER$1 allowlistSearchResponse$AllowlistSearchResults$Companion$ADAPTER$1 = new AllowlistSearchResponse$AllowlistSearchResults$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AllowlistSearchResults.class), "type.googleapis.com/squareup.cash.blockly.api.AllowlistSearchResponse.AllowlistSearchResults", Syntax.PROTO_2, null, "squareup/cash/blockly/api/BlocklyServiceProto.proto");
            ADAPTER = allowlistSearchResponse$AllowlistSearchResults$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(allowlistSearchResponse$AllowlistSearchResults$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AllowlistSearchResults(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.customers = TransactorKt.immutableCopyOf("customers", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AllowlistSearchResults)) {
                return false;
            }
            AllowlistSearchResults allowlistSearchResults = (AllowlistSearchResults) obj;
            return Intrinsics.areEqual(unknownFields(), allowlistSearchResults.unknownFields()) && Intrinsics.areEqual(this.customers, allowlistSearchResults.customers);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.customers.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Gradient.Builder builder = new Gradient.Builder(23, false);
            builder.colors = this.customers;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.customers;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("customers=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AllowlistSearchResults{", "}", 0, null, null, 56);
        }
    }

    public final class AllowlistSuggestions extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AllowlistSuggestions> CREATOR;
        public final List customers;

        static {
            AllowlistSearchResponse$AllowlistSuggestions$Companion$ADAPTER$1 allowlistSearchResponse$AllowlistSuggestions$Companion$ADAPTER$1 = new AllowlistSearchResponse$AllowlistSuggestions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AllowlistSuggestions.class), "type.googleapis.com/squareup.cash.blockly.api.AllowlistSearchResponse.AllowlistSuggestions", Syntax.PROTO_2, null, "squareup/cash/blockly/api/BlocklyServiceProto.proto");
            ADAPTER = allowlistSearchResponse$AllowlistSuggestions$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(allowlistSearchResponse$AllowlistSuggestions$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AllowlistSuggestions(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.customers = TransactorKt.immutableCopyOf("customers", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AllowlistSuggestions)) {
                return false;
            }
            AllowlistSuggestions allowlistSuggestions = (AllowlistSuggestions) obj;
            return Intrinsics.areEqual(unknownFields(), allowlistSuggestions.unknownFields()) && Intrinsics.areEqual(this.customers, allowlistSuggestions.customers);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.customers.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Gradient.Builder builder = new Gradient.Builder(24, false);
            builder.colors = this.customers;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.customers;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("customers=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AllowlistSuggestions{", "}", 0, null, null, 56);
        }
    }

    static {
        AllowlistSearchResponse$Companion$ADAPTER$1 allowlistSearchResponse$Companion$ADAPTER$1 = new AllowlistSearchResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AllowlistSearchResponse.class), "type.googleapis.com/squareup.cash.blockly.api.AllowlistSearchResponse", Syntax.PROTO_2, null, "squareup/cash/blockly/api/BlocklyServiceProto.proto");
        ADAPTER = allowlistSearchResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(allowlistSearchResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllowlistSearchResponse(LocalBrandBanner.Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.results = action;
    }

    public static AllowlistSearchResponse copy$default(AllowlistSearchResponse allowlistSearchResponse, LocalBrandBanner.Action action, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            action = allowlistSearchResponse.results;
        }
        if ((i & 2) != 0) {
            byteString = allowlistSearchResponse.unknownFields();
        }
        allowlistSearchResponse.getClass();
        byteString.getClass();
        return new AllowlistSearchResponse(action, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AllowlistSearchResponse)) {
            return false;
        }
        AllowlistSearchResponse allowlistSearchResponse = (AllowlistSearchResponse) obj;
        return Intrinsics.areEqual(unknownFields(), allowlistSearchResponse.unknownFields()) && Intrinsics.areEqual(this.results, allowlistSearchResponse.results);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalBrandBanner.Action action = this.results;
        int hashCode2 = hashCode + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(27);
        builder.f1245type = this.results;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalBrandBanner.Action action = this.results;
        if (action != null) {
            arrayList.add("results=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AllowlistSearchResponse{", "}", 0, null, null, 56);
    }
}
