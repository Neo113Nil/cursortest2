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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/blockly/api/BlockSearchResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/SubsectionBlock$Builder;", "Builder", "Companion", "BlockSuggestions", "BlockSearchResults", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlockSearchResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlockSearchResponse> CREATOR;
    public final LocalBrandBanner.Companion results;

    public final class BlockSearchResults extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BlockSearchResults> CREATOR;
        public final List customers;

        static {
            BlockSearchResponse$BlockSearchResults$Companion$ADAPTER$1 blockSearchResponse$BlockSearchResults$Companion$ADAPTER$1 = new BlockSearchResponse$BlockSearchResults$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlockSearchResults.class), "type.googleapis.com/squareup.cash.blockly.api.BlockSearchResponse.BlockSearchResults", Syntax.PROTO_2, null, "squareup/cash/blockly/api/Search.proto");
            ADAPTER = blockSearchResponse$BlockSearchResults$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(blockSearchResponse$BlockSearchResults$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BlockSearchResults(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.customers = TransactorKt.immutableCopyOf("customers", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BlockSearchResults)) {
                return false;
            }
            BlockSearchResults blockSearchResults = (BlockSearchResults) obj;
            return Intrinsics.areEqual(unknownFields(), blockSearchResults.unknownFields()) && Intrinsics.areEqual(this.customers, blockSearchResults.customers);
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
            Gradient.Builder builder = new Gradient.Builder(25, false);
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
            return CollectionsKt.joinToString$default(arrayList, ", ", "BlockSearchResults{", "}", 0, null, null, 56);
        }
    }

    public final class BlockSuggestions extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BlockSuggestions> CREATOR;
        public final List customers;

        static {
            BlockSearchResponse$BlockSuggestions$Companion$ADAPTER$1 blockSearchResponse$BlockSuggestions$Companion$ADAPTER$1 = new BlockSearchResponse$BlockSuggestions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlockSuggestions.class), "type.googleapis.com/squareup.cash.blockly.api.BlockSearchResponse.BlockSuggestions", Syntax.PROTO_2, null, "squareup/cash/blockly/api/Search.proto");
            ADAPTER = blockSearchResponse$BlockSuggestions$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(blockSearchResponse$BlockSuggestions$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BlockSuggestions(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.customers = TransactorKt.immutableCopyOf("customers", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BlockSuggestions)) {
                return false;
            }
            BlockSuggestions blockSuggestions = (BlockSuggestions) obj;
            return Intrinsics.areEqual(unknownFields(), blockSuggestions.unknownFields()) && Intrinsics.areEqual(this.customers, blockSuggestions.customers);
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
            Gradient.Builder builder = new Gradient.Builder(26, false);
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
            return CollectionsKt.joinToString$default(arrayList, ", ", "BlockSuggestions{", "}", 0, null, null, 56);
        }
    }

    static {
        BlockSearchResponse$Companion$ADAPTER$1 blockSearchResponse$Companion$ADAPTER$1 = new BlockSearchResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlockSearchResponse.class), "type.googleapis.com/squareup.cash.blockly.api.BlockSearchResponse", Syntax.PROTO_2, null, "squareup/cash/blockly/api/Search.proto");
        ADAPTER = blockSearchResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(blockSearchResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockSearchResponse(LocalBrandBanner.Companion companion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.results = companion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockSearchResponse)) {
            return false;
        }
        BlockSearchResponse blockSearchResponse = (BlockSearchResponse) obj;
        return Intrinsics.areEqual(unknownFields(), blockSearchResponse.unknownFields()) && Intrinsics.areEqual(this.results, blockSearchResponse.results);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalBrandBanner.Companion companion = this.results;
        int hashCode2 = hashCode + (companion != null ? companion.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(28);
        builder.f1245type = this.results;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalBrandBanner.Companion companion = this.results;
        if (companion != null) {
            arrayList.add("results=" + companion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlockSearchResponse{", "}", 0, null, null, 56);
    }
}
