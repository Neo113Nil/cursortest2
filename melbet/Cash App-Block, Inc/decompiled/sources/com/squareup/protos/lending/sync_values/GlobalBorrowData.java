package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.app.SyncContactsRequest;
import com.squareup.protos.rewardly.ui.AppLinks;
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

/* loaded from: classes8.dex */
public final class GlobalBorrowData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GlobalBorrowData> CREATOR;
    public final List country_supports;
    public final List entry_points;
    public final String fallback_client_route;

    public final class CountrySupport extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CountrySupport> CREATOR;
        public final Country country;
        public final List supported_states;

        static {
            GlobalBorrowData$CountrySupport$Companion$ADAPTER$1 globalBorrowData$CountrySupport$Companion$ADAPTER$1 = new GlobalBorrowData$CountrySupport$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CountrySupport.class), "type.googleapis.com/squareup.lending.sync_values.GlobalBorrowData.CountrySupport", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
            ADAPTER = globalBorrowData$CountrySupport$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(globalBorrowData$CountrySupport$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountrySupport(Country country, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.country = country;
            this.supported_states = TransactorKt.immutableCopyOf("supported_states", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CountrySupport)) {
                return false;
            }
            CountrySupport countrySupport = (CountrySupport) obj;
            return Intrinsics.areEqual(unknownFields(), countrySupport.unknownFields()) && this.country == countrySupport.country && Intrinsics.areEqual(this.supported_states, countrySupport.supported_states);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Country country = this.country;
            int hashCode2 = this.supported_states.hashCode() + ((hashCode + (country != null ? country.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinks.Builder builder = new AppLinks.Builder(15);
            builder.f1411android = this.country;
            builder.ios = this.supported_states;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Country country = this.country;
            if (country != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("country=", country, arrayList);
            }
            List list = this.supported_states;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("supported_states=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CountrySupport{", "}", 0, null, null, 56);
        }
    }

    static {
        GlobalBorrowData$Companion$ADAPTER$1 globalBorrowData$Companion$ADAPTER$1 = new GlobalBorrowData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GlobalBorrowData.class), "type.googleapis.com/squareup.lending.sync_values.GlobalBorrowData", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
        ADAPTER = globalBorrowData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(globalBorrowData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalBorrowData(String str, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.fallback_client_route = str;
        this.entry_points = TransactorKt.immutableCopyOf("entry_points", list);
        this.country_supports = TransactorKt.immutableCopyOf("country_supports", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GlobalBorrowData)) {
            return false;
        }
        GlobalBorrowData globalBorrowData = (GlobalBorrowData) obj;
        return Intrinsics.areEqual(unknownFields(), globalBorrowData.unknownFields()) && Intrinsics.areEqual(this.entry_points, globalBorrowData.entry_points) && Intrinsics.areEqual(this.country_supports, globalBorrowData.country_supports) && Intrinsics.areEqual(this.fallback_client_route, globalBorrowData.fallback_client_route);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.entry_points), 37, this.country_supports);
        String str = this.fallback_client_route;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SyncContactsRequest.Builder builder = new SyncContactsRequest.Builder(8, false);
        builder.add_hashed_aliases = this.entry_points;
        builder.remove_hashed_aliases = this.country_supports;
        builder.sync_token = this.fallback_client_route;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.entry_points;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("entry_points=", arrayList, list);
        }
        List list2 = this.country_supports;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("country_supports=", arrayList, list2);
        }
        String str = this.fallback_client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "fallback_client_route=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GlobalBorrowData{", "}", 0, null, null, 56);
    }
}
