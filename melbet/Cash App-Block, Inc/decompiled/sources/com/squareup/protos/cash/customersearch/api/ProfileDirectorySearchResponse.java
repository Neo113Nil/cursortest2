package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.zipline.internal.bridge.ZiplineServiceAdapterKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.Banner;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/customersearch/api/ProfileDirectorySearchResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/Action$Builder;", "Builder", "LocalFavoriteResults", "LocalAddressBookResults", "LocalSyncedCustomerResults", "ServerResults", "ResultSource", "Section", "DefaultUiElements", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfileDirectorySearchResponse> CREATOR;
    public final DefaultUiElements default_ui_elements;
    public final List sections;

    public final class DefaultUiElements extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DefaultUiElements> CREATOR;
        public final SeeMoreRow see_more_row;

        public final class SeeMoreRow extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SeeMoreRow> CREATOR;
            public final Image image;
            public final Integer index;
            public final Metadata metadata;
            public final HighlightText subtitle;
            public final HighlightText title;

            public final class Metadata extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Metadata> CREATOR;
                public final String query_token;

                static {
                    ProfileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Metadata$Companion$ADAPTER$1 profileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Metadata$Companion$ADAPTER$1 = new ProfileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Metadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Metadata.class), "type.googleapis.com/squareup.cash.customersearch.api.ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ProfileDirectorySearch.proto");
                    ADAPTER = profileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Metadata$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Metadata$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Metadata(String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.query_token = str;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Metadata)) {
                        return false;
                    }
                    Metadata metadata = (Metadata) obj;
                    return Intrinsics.areEqual(unknownFields(), metadata.unknownFields()) && Intrinsics.areEqual(this.query_token, metadata.query_token);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.query_token;
                    int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                    this.hashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Banner.Builder builder = new Banner.Builder(23);
                    builder.banner_color = this.query_token;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.query_token;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "query_token=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Metadata{", "}", 0, null, null, 56);
                }
            }

            static {
                ProfileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Companion$ADAPTER$1 profileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Companion$ADAPTER$1 = new ProfileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SeeMoreRow.class), "type.googleapis.com/squareup.cash.customersearch.api.ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ProfileDirectorySearch.proto");
                ADAPTER = profileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SeeMoreRow(Image image, HighlightText highlightText, HighlightText highlightText2, Metadata metadata, Integer num, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.image = image;
                this.title = highlightText;
                this.subtitle = highlightText2;
                this.metadata = metadata;
                this.index = num;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SeeMoreRow)) {
                    return false;
                }
                SeeMoreRow seeMoreRow = (SeeMoreRow) obj;
                return Intrinsics.areEqual(unknownFields(), seeMoreRow.unknownFields()) && Intrinsics.areEqual(this.image, seeMoreRow.image) && Intrinsics.areEqual(this.title, seeMoreRow.title) && Intrinsics.areEqual(this.subtitle, seeMoreRow.subtitle) && Intrinsics.areEqual(this.metadata, seeMoreRow.metadata) && Intrinsics.areEqual(this.index, seeMoreRow.index);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Image image = this.image;
                int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
                HighlightText highlightText = this.title;
                int hashCode3 = (hashCode2 + (highlightText != null ? highlightText.hashCode() : 0)) * 37;
                HighlightText highlightText2 = this.subtitle;
                int hashCode4 = (hashCode3 + (highlightText2 != null ? highlightText2.hashCode() : 0)) * 37;
                Metadata metadata = this.metadata;
                int hashCode5 = (hashCode4 + (metadata != null ? metadata.hashCode() : 0)) * 37;
                Integer num = this.index;
                int hashCode6 = hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Account.Builder builder = new Account.Builder(28, false);
                builder.customer_token = this.image;
                builder.account_token = this.title;
                builder.display_name = this.subtitle;
                builder.account_type = this.metadata;
                builder.is_sponsored_account = this.index;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Image image = this.image;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                }
                HighlightText highlightText = this.title;
                if (highlightText != null) {
                    arrayList.add("title=" + highlightText);
                }
                HighlightText highlightText2 = this.subtitle;
                if (highlightText2 != null) {
                    arrayList.add("subtitle=" + highlightText2);
                }
                Metadata metadata = this.metadata;
                if (metadata != null) {
                    arrayList.add("metadata=" + metadata);
                }
                Integer num = this.index;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("index=", num, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SeeMoreRow{", "}", 0, null, null, 56);
            }
        }

        static {
            ProfileDirectorySearchResponse$DefaultUiElements$Companion$ADAPTER$1 profileDirectorySearchResponse$DefaultUiElements$Companion$ADAPTER$1 = new ProfileDirectorySearchResponse$DefaultUiElements$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DefaultUiElements.class), "type.googleapis.com/squareup.cash.customersearch.api.ProfileDirectorySearchResponse.DefaultUiElements", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ProfileDirectorySearch.proto");
            ADAPTER = profileDirectorySearchResponse$DefaultUiElements$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDirectorySearchResponse$DefaultUiElements$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultUiElements(SeeMoreRow seeMoreRow, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.see_more_row = seeMoreRow;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DefaultUiElements)) {
                return false;
            }
            DefaultUiElements defaultUiElements = (DefaultUiElements) obj;
            return Intrinsics.areEqual(unknownFields(), defaultUiElements.unknownFields()) && Intrinsics.areEqual(this.see_more_row, defaultUiElements.see_more_row);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            SeeMoreRow seeMoreRow = this.see_more_row;
            int hashCode2 = hashCode + (seeMoreRow != null ? seeMoreRow.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Asset.Builder builder = new Asset.Builder(5);
            builder.asset_type = this.see_more_row;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            SeeMoreRow seeMoreRow = this.see_more_row;
            if (seeMoreRow != null) {
                arrayList.add("see_more_row=" + seeMoreRow);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DefaultUiElements{", "}", 0, null, null, 56);
        }
    }

    public final class LocalAddressBookResults extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalAddressBookResults> CREATOR;

        static {
            ProfileDirectorySearchResponse$LocalAddressBookResults$Companion$ADAPTER$1 profileDirectorySearchResponse$LocalAddressBookResults$Companion$ADAPTER$1 = new ProfileDirectorySearchResponse$LocalAddressBookResults$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalAddressBookResults.class), "type.googleapis.com/squareup.cash.customersearch.api.ProfileDirectorySearchResponse.LocalAddressBookResults", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ProfileDirectorySearch.proto");
            ADAPTER = profileDirectorySearchResponse$LocalAddressBookResults$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDirectorySearchResponse$LocalAddressBookResults$Companion$ADAPTER$1);
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
            Empty.Builder builder = new Empty.Builder(16);
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

        static {
            ProfileDirectorySearchResponse$LocalFavoriteResults$Companion$ADAPTER$1 profileDirectorySearchResponse$LocalFavoriteResults$Companion$ADAPTER$1 = new ProfileDirectorySearchResponse$LocalFavoriteResults$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalFavoriteResults.class), "type.googleapis.com/squareup.cash.customersearch.api.ProfileDirectorySearchResponse.LocalFavoriteResults", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ProfileDirectorySearch.proto");
            ADAPTER = profileDirectorySearchResponse$LocalFavoriteResults$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDirectorySearchResponse$LocalFavoriteResults$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalFavoriteResults(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof LocalFavoriteResults) && Intrinsics.areEqual(unknownFields(), ((LocalFavoriteResults) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Empty.Builder builder = new Empty.Builder(17);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "LocalFavoriteResults{}";
        }
    }

    public final class LocalSyncedCustomerResults extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalSyncedCustomerResults> CREATOR;
        public final List results;

        static {
            ProfileDirectorySearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1 profileDirectorySearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1 = new ProfileDirectorySearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalSyncedCustomerResults.class), "type.googleapis.com/squareup.cash.customersearch.api.ProfileDirectorySearchResponse.LocalSyncedCustomerResults", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ProfileDirectorySearch.proto");
            ADAPTER = profileDirectorySearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDirectorySearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1);
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
            TrustsData.Builder builder = new TrustsData.Builder(21);
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
        public final ZiplineServiceAdapterKt source;

        static {
            ProfileDirectorySearchResponse$ResultSource$Companion$ADAPTER$1 profileDirectorySearchResponse$ResultSource$Companion$ADAPTER$1 = new ProfileDirectorySearchResponse$ResultSource$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ResultSource.class), "type.googleapis.com/squareup.cash.customersearch.api.ProfileDirectorySearchResponse.ResultSource", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ProfileDirectorySearch.proto");
            ADAPTER = profileDirectorySearchResponse$ResultSource$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDirectorySearchResponse$ResultSource$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResultSource(ZiplineServiceAdapterKt ziplineServiceAdapterKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.source = ziplineServiceAdapterKt;
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
            ZiplineServiceAdapterKt ziplineServiceAdapterKt = this.source;
            int hashCode2 = hashCode + (ziplineServiceAdapterKt != null ? ziplineServiceAdapterKt.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Asset.Builder builder = new Asset.Builder(6);
            builder.asset_type = this.source;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ZiplineServiceAdapterKt ziplineServiceAdapterKt = this.source;
            if (ziplineServiceAdapterKt != null) {
                arrayList.add("source=" + ziplineServiceAdapterKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ResultSource{", "}", 0, null, null, 56);
        }
    }

    public final class Section extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Section> CREATOR;
        public final List results;
        public final ResultsType results_type;
        public final String title;

        public enum ResultsType implements WireEnum {
            UNKNOWN_TYPE(0),
            SINGLE_ROW_RESULTS(1),
            MULTIPATH_GROUPING(2);

            public static final ProfileDirectorySearchResponse$Section$ResultsType$Companion$ADAPTER$1 ADAPTER;
            public static final Channel.Companion Companion;
            public final int value;

            static {
                ResultsType resultsType = UNKNOWN_TYPE;
                Companion = new Channel.Companion();
                ADAPTER = new ProfileDirectorySearchResponse$Section$ResultsType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ResultsType.class), Syntax.PROTO_2, resultsType);
            }

            ResultsType(int i) {
                this.value = i;
            }

            public static final ResultsType fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return UNKNOWN_TYPE;
                }
                if (i == 1) {
                    return SINGLE_ROW_RESULTS;
                }
                if (i != 2) {
                    return null;
                }
                return MULTIPATH_GROUPING;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            ProfileDirectorySearchResponse$Section$Companion$ADAPTER$1 profileDirectorySearchResponse$Section$Companion$ADAPTER$1 = new ProfileDirectorySearchResponse$Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.cash.customersearch.api.ProfileDirectorySearchResponse.Section", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ProfileDirectorySearch.proto");
            ADAPTER = profileDirectorySearchResponse$Section$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDirectorySearchResponse$Section$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Section(String str, List list, ResultsType resultsType, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.results_type = resultsType;
            this.results = TransactorKt.immutableCopyOf("results", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.results, section.results) && this.results_type == section.results_type;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.results);
            ResultsType resultsType = this.results_type;
            int hashCode2 = m + (resultsType != null ? resultsType.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LoanOption.Builder builder = new LoanOption.Builder(4);
            builder.loan_type = this.title;
            builder.payment_schedule = this.results;
            builder.tila_data = this.results_type;
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
            ResultsType resultsType = this.results_type;
            if (resultsType != null) {
                arrayList.add("results_type=" + resultsType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
        }
    }

    public final class ServerResults extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ServerResults> CREATOR;
        public final List results;

        static {
            ProfileDirectorySearchResponse$ServerResults$Companion$ADAPTER$1 profileDirectorySearchResponse$ServerResults$Companion$ADAPTER$1 = new ProfileDirectorySearchResponse$ServerResults$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ServerResults.class), "type.googleapis.com/squareup.cash.customersearch.api.ProfileDirectorySearchResponse.ServerResults", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ProfileDirectorySearch.proto");
            ADAPTER = profileDirectorySearchResponse$ServerResults$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDirectorySearchResponse$ServerResults$Companion$ADAPTER$1);
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
            TrustsData.Builder builder = new TrustsData.Builder(22);
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
        ProfileDirectorySearchResponse$Companion$ADAPTER$1 profileDirectorySearchResponse$Companion$ADAPTER$1 = new ProfileDirectorySearchResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProfileDirectorySearchResponse.class), "type.googleapis.com/squareup.cash.customersearch.api.ProfileDirectorySearchResponse", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/ProfileDirectorySearch.proto");
        ADAPTER = profileDirectorySearchResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(profileDirectorySearchResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileDirectorySearchResponse(List list, DefaultUiElements defaultUiElements, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.default_ui_elements = defaultUiElements;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileDirectorySearchResponse)) {
            return false;
        }
        ProfileDirectorySearchResponse profileDirectorySearchResponse = (ProfileDirectorySearchResponse) obj;
        return Intrinsics.areEqual(unknownFields(), profileDirectorySearchResponse.unknownFields()) && Intrinsics.areEqual(this.sections, profileDirectorySearchResponse.sections) && Intrinsics.areEqual(this.default_ui_elements, profileDirectorySearchResponse.default_ui_elements);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.sections);
        DefaultUiElements defaultUiElements = this.default_ui_elements;
        int hashCode = m + (defaultUiElements != null ? defaultUiElements.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(5);
        builder.f1268type = this.sections;
        builder.details = this.default_ui_elements;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        DefaultUiElements defaultUiElements = this.default_ui_elements;
        if (defaultUiElements != null) {
            arrayList.add("default_ui_elements=" + defaultUiElements);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfileDirectorySearchResponse{", "}", 0, null, null, 56);
    }
}
