package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/app/FindCustomersResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/time/DateTime$Builder;", "Builder", "Status", "Sort", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FindCustomersResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FindCustomersResponse> CREATOR;
    public final UiCustomer exact_match;
    public final List matches;
    public final String search_text;
    public final Sort sort;
    public final Status status;

    public enum Sort implements WireEnum {
        EXACT_LOCAL_SERVER(0),
        LOCAL_EXACT_SERVER(1);

        public static final FindCustomersResponse$Sort$Companion$ADAPTER$1 ADAPTER;
        public static final TransactionType.Companion Companion;
        public final int value;

        static {
            Sort sort = EXACT_LOCAL_SERVER;
            Companion = new TransactionType.Companion();
            ADAPTER = new FindCustomersResponse$Sort$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Sort.class), Syntax.PROTO_2, sort);
        }

        Sort(int i) {
            this.value = i;
        }

        public static final Sort fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return EXACT_LOCAL_SERVER;
            }
            if (i != 1) {
                return null;
            }
            return LOCAL_EXACT_SERVER;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1);

        public static final FindCustomersResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new ActionType.Companion();
            ADAPTER = new FindCustomersResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i != 1) {
                return null;
            }
            return SUCCESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FindCustomersResponse$Companion$ADAPTER$1 findCustomersResponse$Companion$ADAPTER$1 = new FindCustomersResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FindCustomersResponse.class), "type.googleapis.com/squareup.franklin.app.FindCustomersResponse", Syntax.PROTO_2, null, "squareup/franklin/app/customers.proto");
        ADAPTER = findCustomersResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(findCustomersResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindCustomersResponse(Status status, String str, List list, UiCustomer uiCustomer, Sort sort, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        sort.getClass();
        byteString.getClass();
        this.status = status;
        this.search_text = str;
        this.exact_match = uiCustomer;
        this.sort = sort;
        this.matches = TransactorKt.immutableCopyOf("matches", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FindCustomersResponse)) {
            return false;
        }
        FindCustomersResponse findCustomersResponse = (FindCustomersResponse) obj;
        return Intrinsics.areEqual(unknownFields(), findCustomersResponse.unknownFields()) && this.status == findCustomersResponse.status && Intrinsics.areEqual(this.search_text, findCustomersResponse.search_text) && Intrinsics.areEqual(this.matches, findCustomersResponse.matches) && Intrinsics.areEqual(this.exact_match, findCustomersResponse.exact_match) && this.sort == findCustomersResponse.sort;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        String str = this.search_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.matches);
        UiCustomer uiCustomer = this.exact_match;
        int hashCode3 = this.sort.hashCode() + ((m + (uiCustomer != null ? uiCustomer.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(27, false);
        builder.instant_usec = this.status;
        builder.posix_tz = this.search_text;
        builder.tz_name = this.matches;
        builder.ordinal = this.exact_match;
        builder.timezone_offset_min = this.sort;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        if (this.search_text != null) {
            arrayList.add("search_text=██");
        }
        List list = this.matches;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("matches=", arrayList, list);
        }
        UiCustomer uiCustomer = this.exact_match;
        if (uiCustomer != null) {
            arrayList.add("exact_match=" + uiCustomer);
        }
        arrayList.add("sort=" + this.sort);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FindCustomersResponse{", "}", 0, null, null, 56);
    }
}
