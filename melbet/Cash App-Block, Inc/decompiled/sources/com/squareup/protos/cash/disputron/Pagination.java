package com.squareup.protos.cash.disputron;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.crow.sync_values.RestrictionsData;
import com.squareup.protos.cash.cashapproxy.api.GetApOrdersHubRequest;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.marketdata.model.SectorsDetails;
import com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageDeliveredRequest;
import com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageViewRequest;
import com.squareup.protos.cash.piggybank.api.v2.GetInterestSettingsResponse;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.franklin.common.GiftCardRenderData;
import com.squareup.protos.franklin.common.WebLoginConfig;
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
public final class Pagination extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Pagination> CREATOR;
    public final Long limit;
    public final String offset;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Long limit;
        public String offset;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Pagination(this.offset, this.limit, buildUnknownFields());
                case 1:
                    return new RestrictionsData(this.offset, this.limit, buildUnknownFields());
                case 2:
                    return new GetApOrdersHubRequest(this.offset, this.limit, buildUnknownFields());
                case 3:
                    return new GenericProfileElement.ValueUnitElement.Split(this.offset, this.limit, buildUnknownFields());
                case 4:
                    return new SectorsDetails.Sector(this.offset, this.limit, buildUnknownFields());
                case 5:
                    return new ReportAppMessageDeliveredRequest(this.offset, this.limit, buildUnknownFields());
                case 6:
                    return new ReportAppMessageViewRequest(this.offset, this.limit, buildUnknownFields());
                case 7:
                    return new GetInterestSettingsResponse.PreviousInterestEnrollment(this.offset, this.limit, buildUnknownFields());
                case 8:
                    return new FormattedDetail.CountdownInfoCheck(this.offset, this.limit, buildUnknownFields());
                case 9:
                    return new GiftCardRenderData.RecipientData(this.offset, this.limit, buildUnknownFields());
                default:
                    return new WebLoginConfig(this.offset, this.limit, buildUnknownFields());
            }
        }
    }

    static {
        Pagination$Companion$ADAPTER$1 pagination$Companion$ADAPTER$1 = new Pagination$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Pagination.class), "type.googleapis.com/squareup.cash.disputron.Pagination", Syntax.PROTO_2, null, "squareup/cash/disputron/common.proto");
        ADAPTER = pagination$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pagination$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pagination(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.offset = str;
        this.limit = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pagination)) {
            return false;
        }
        Pagination pagination = (Pagination) obj;
        return Intrinsics.areEqual(unknownFields(), pagination.unknownFields()) && Intrinsics.areEqual(this.offset, pagination.offset) && Intrinsics.areEqual(this.limit, pagination.limit);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.offset;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.limit;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.offset = this.offset;
        builder.limit = this.limit;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.offset;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "offset=", arrayList);
        }
        Long l = this.limit;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("limit=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Pagination{", "}", 0, null, null, 56);
    }
}
