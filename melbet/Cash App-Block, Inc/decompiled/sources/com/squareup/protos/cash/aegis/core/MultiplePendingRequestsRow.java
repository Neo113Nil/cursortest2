package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.giftly.app.GiftCardCategory;
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

/* loaded from: classes7.dex */
public final class MultiplePendingRequestsRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MultiplePendingRequestsRow> CREATOR;
    public final String pending_requests_url;
    public final List subtitle_customer_tokens;
    public final String title;

    static {
        MultiplePendingRequestsRow$Companion$ADAPTER$1 multiplePendingRequestsRow$Companion$ADAPTER$1 = new MultiplePendingRequestsRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MultiplePendingRequestsRow.class), "type.googleapis.com/squareup.cash.aegis.core.MultiplePendingRequestsRow", Syntax.PROTO_2, null, "squareup/cash/aegis/core/FamilyAccountsParameters.proto");
        ADAPTER = multiplePendingRequestsRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(multiplePendingRequestsRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiplePendingRequestsRow(String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.pending_requests_url = str2;
        this.subtitle_customer_tokens = TransactorKt.immutableCopyOf("subtitle_customer_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiplePendingRequestsRow)) {
            return false;
        }
        MultiplePendingRequestsRow multiplePendingRequestsRow = (MultiplePendingRequestsRow) obj;
        return Intrinsics.areEqual(unknownFields(), multiplePendingRequestsRow.unknownFields()) && Intrinsics.areEqual(this.title, multiplePendingRequestsRow.title) && Intrinsics.areEqual(this.subtitle_customer_tokens, multiplePendingRequestsRow.subtitle_customer_tokens) && Intrinsics.areEqual(this.pending_requests_url, multiplePendingRequestsRow.pending_requests_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.subtitle_customer_tokens);
        String str2 = this.pending_requests_url;
        int hashCode2 = m + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCardCategory.Builder builder = new GiftCardCategory.Builder(1, false);
        builder.token = this.title;
        builder.gift_card_type_tokens = this.subtitle_customer_tokens;
        builder.name = this.pending_requests_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.title != null) {
            arrayList.add("title=██");
        }
        List list = this.subtitle_customer_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("subtitle_customer_tokens=", arrayList, list);
        }
        if (this.pending_requests_url != null) {
            arrayList.add("pending_requests_url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MultiplePendingRequestsRow{", "}", 0, null, null, 56);
    }
}
