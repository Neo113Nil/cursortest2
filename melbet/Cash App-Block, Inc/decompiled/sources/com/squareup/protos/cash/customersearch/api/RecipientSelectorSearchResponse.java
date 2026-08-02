package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.zipline.loader.FastCodeUpdatesKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.franklin.app.SyncContactsRequest;
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

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/customersearch/api/RecipientSelectorSearchResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/TrustsData$Builder;", "Builder", "LocalFavoriteResults", "LocalAddressBookResults", "LocalSyncedCustomerResults", "ServerResults", "ResultSource", "Section", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RecipientSelectorSearchResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecipientSelectorSearchResponse> CREATOR;
    public final List sections;

    public final class LocalAddressBookResults extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalAddressBookResults> CREATOR;

        static {
            RecipientSelectorSearchResponse$LocalAddressBookResults$Companion$ADAPTER$1 recipientSelectorSearchResponse$LocalAddressBookResults$Companion$ADAPTER$1 = new RecipientSelectorSearchResponse$LocalAddressBookResults$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalAddressBookResults.class), "type.googleapis.com/squareup.cash.customersearch.api.RecipientSelectorSearchResponse.LocalAddressBookResults", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/RecipientSelectorSearch.proto");
            ADAPTER = recipientSelectorSearchResponse$LocalAddressBookResults$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientSelectorSearchResponse$LocalAddressBookResults$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalAddressBookResults(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof LocalAddressBookResults) && Intrinsics.areEqual(unknownFields(), ((LocalAddressBookResults) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Empty.Builder builder = new Empty.Builder(18);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "LocalAddressBookResults{}";
        }
    }

    public final class LocalFavoriteResults extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalFavoriteResults> CREATOR;
        public final List results;

        static {
            RecipientSelectorSearchResponse$LocalFavoriteResults$Companion$ADAPTER$1 recipientSelectorSearchResponse$LocalFavoriteResults$Companion$ADAPTER$1 = new RecipientSelectorSearchResponse$LocalFavoriteResults$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalFavoriteResults.class), "type.googleapis.com/squareup.cash.customersearch.api.RecipientSelectorSearchResponse.LocalFavoriteResults", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/RecipientSelectorSearch.proto");
            ADAPTER = recipientSelectorSearchResponse$LocalFavoriteResults$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientSelectorSearchResponse$LocalFavoriteResults$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalFavoriteResults(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.results = TransactorKt.immutableCopyOf("results", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocalFavoriteResults)) {
                return false;
            }
            LocalFavoriteResults localFavoriteResults = (LocalFavoriteResults) obj;
            return Intrinsics.areEqual(unknownFields(), localFavoriteResults.unknownFields()) && Intrinsics.areEqual(this.results, localFavoriteResults.results);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.results.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TrustsData.Builder builder = new TrustsData.Builder(24);
            builder.trust = this.results;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.results;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("results=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocalFavoriteResults{", "}", 0, null, null, 56);
        }
    }

    public final class LocalSyncedCustomerResults extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalSyncedCustomerResults> CREATOR;
        public final List results;

        static {
            RecipientSelectorSearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1 recipientSelectorSearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1 = new RecipientSelectorSearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalSyncedCustomerResults.class), "type.googleapis.com/squareup.cash.customersearch.api.RecipientSelectorSearchResponse.LocalSyncedCustomerResults", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/RecipientSelectorSearch.proto");
            ADAPTER = recipientSelectorSearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientSelectorSearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalSyncedCustomerResults(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.results = TransactorKt.immutableCopyOf("results", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocalSyncedCustomerResults)) {
                return false;
            }
            LocalSyncedCustomerResults localSyncedCustomerResults = (LocalSyncedCustomerResults) obj;
            return Intrinsics.areEqual(unknownFields(), localSyncedCustomerResults.unknownFields()) && Intrinsics.areEqual(this.results, localSyncedCustomerResults.results);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.results.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TrustsData.Builder builder = new TrustsData.Builder(25);
            builder.trust = this.results;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.results;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("results=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocalSyncedCustomerResults{", "}", 0, null, null, 56);
        }
    }

    public final class ResultSource extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ResultSource> CREATOR;
        public final FastCodeUpdatesKt source;

        static {
            RecipientSelectorSearchResponse$ResultSource$Companion$ADAPTER$1 recipientSelectorSearchResponse$ResultSource$Companion$ADAPTER$1 = new RecipientSelectorSearchResponse$ResultSource$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ResultSource.class), "type.googleapis.com/squareup.cash.customersearch.api.RecipientSelectorSearchResponse.ResultSource", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/RecipientSelectorSearch.proto");
            ADAPTER = recipientSelectorSearchResponse$ResultSource$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientSelectorSearchResponse$ResultSource$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResultSource(FastCodeUpdatesKt fastCodeUpdatesKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.source = fastCodeUpdatesKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ResultSource)) {
                return false;
            }
            ResultSource resultSource = (ResultSource) obj;
            return Intrinsics.areEqual(unknownFields(), resultSource.unknownFields()) && Intrinsics.areEqual(this.source, resultSource.source);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            FastCodeUpdatesKt fastCodeUpdatesKt = this.source;
            int hashCode2 = hashCode + (fastCodeUpdatesKt != null ? fastCodeUpdatesKt.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Asset.Builder builder = new Asset.Builder(7);
            builder.asset_type = this.source;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            FastCodeUpdatesKt fastCodeUpdatesKt = this.source;
            if (fastCodeUpdatesKt != null) {
                arrayList.add("source=" + fastCodeUpdatesKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ResultSource{", "}", 0, null, null, 56);
        }
    }

    public final class Section extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Section> CREATOR;
        public final List full_results;
        public final List results;
        public final String title;

        static {
            RecipientSelectorSearchResponse$Section$Companion$ADAPTER$1 recipientSelectorSearchResponse$Section$Companion$ADAPTER$1 = new RecipientSelectorSearchResponse$Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.cash.customersearch.api.RecipientSelectorSearchResponse.Section", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/RecipientSelectorSearch.proto");
            ADAPTER = recipientSelectorSearchResponse$Section$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientSelectorSearchResponse$Section$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Section(String str, List list, List list2, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.title = str;
            this.results = TransactorKt.immutableCopyOf("results", list);
            this.full_results = TransactorKt.immutableCopyOf("full_results", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.results, section.results) && Intrinsics.areEqual(this.full_results, section.full_results);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = this.full_results.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.results);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SyncContactsRequest.Builder builder = new SyncContactsRequest.Builder(5, false);
            builder.sync_token = this.title;
            builder.add_hashed_aliases = this.results;
            builder.remove_hashed_aliases = this.full_results;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            List list = this.results;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("results=", arrayList, list);
            }
            List list2 = this.full_results;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("full_results=", arrayList, list2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
        }
    }

    public final class ServerResults extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ServerResults> CREATOR;
        public final List results;

        static {
            RecipientSelectorSearchResponse$ServerResults$Companion$ADAPTER$1 recipientSelectorSearchResponse$ServerResults$Companion$ADAPTER$1 = new RecipientSelectorSearchResponse$ServerResults$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ServerResults.class), "type.googleapis.com/squareup.cash.customersearch.api.RecipientSelectorSearchResponse.ServerResults", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/RecipientSelectorSearch.proto");
            ADAPTER = recipientSelectorSearchResponse$ServerResults$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientSelectorSearchResponse$ServerResults$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerResults(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.results = TransactorKt.immutableCopyOf("results", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServerResults)) {
                return false;
            }
            ServerResults serverResults = (ServerResults) obj;
            return Intrinsics.areEqual(unknownFields(), serverResults.unknownFields()) && Intrinsics.areEqual(this.results, serverResults.results);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.results.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TrustsData.Builder builder = new TrustsData.Builder(26);
            builder.trust = this.results;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.results;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("results=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ServerResults{", "}", 0, null, null, 56);
        }
    }

    static {
        RecipientSelectorSearchResponse$Companion$ADAPTER$1 recipientSelectorSearchResponse$Companion$ADAPTER$1 = new RecipientSelectorSearchResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecipientSelectorSearchResponse.class), "type.googleapis.com/squareup.cash.customersearch.api.RecipientSelectorSearchResponse", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/RecipientSelectorSearch.proto");
        ADAPTER = recipientSelectorSearchResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientSelectorSearchResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipientSelectorSearchResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecipientSelectorSearchResponse)) {
            return false;
        }
        RecipientSelectorSearchResponse recipientSelectorSearchResponse = (RecipientSelectorSearchResponse) obj;
        return Intrinsics.areEqual(unknownFields(), recipientSelectorSearchResponse.unknownFields()) && Intrinsics.areEqual(this.sections, recipientSelectorSearchResponse.sections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.sections.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        TrustsData.Builder builder = new TrustsData.Builder(23);
        builder.trust = this.sections;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecipientSelectorSearchResponse{", "}", 0, null, null, 56);
    }
}
