package com.squareup.protos.cash.giftly.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.MultiplePendingRequestsRow;
import com.squareup.protos.cash.cashsessionrecorder.app.v1.SubmitScreenshotBundleRequest;
import com.squareup.protos.cash.local.client.v1.LocalMenuDiscountSummary;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosPerformanceValue;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GiftCardCategory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GiftCardCategory> CREATOR;
    public final List gift_card_type_tokens;
    public final String name;
    public final String token;

    static {
        GiftCardCategory$Companion$ADAPTER$1 giftCardCategory$Companion$ADAPTER$1 = new GiftCardCategory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GiftCardCategory.class), "type.googleapis.com/squareup.cash.giftly.app.GiftCardCategory", Syntax.PROTO_2, null, "squareup/cash/giftly/app/service.proto");
        ADAPTER = giftCardCategory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCardCategory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftCardCategory(String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.name = str2;
        this.gift_card_type_tokens = TransactorKt.immutableCopyOf("gift_card_type_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftCardCategory)) {
            return false;
        }
        GiftCardCategory giftCardCategory = (GiftCardCategory) obj;
        return Intrinsics.areEqual(unknownFields(), giftCardCategory.unknownFields()) && Intrinsics.areEqual(this.token, giftCardCategory.token) && Intrinsics.areEqual(this.name, giftCardCategory.name) && Intrinsics.areEqual(this.gift_card_type_tokens, giftCardCategory.gift_card_type_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = this.gift_card_type_tokens.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.token = this.token;
        builder.name = this.name;
        builder.gift_card_type_tokens = this.gift_card_type_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        List list = this.gift_card_type_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("gift_card_type_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GiftCardCategory{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List gift_card_type_tokens;
        public String name;
        public String token;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 5:
                    this.gift_card_type_tokens = EmptyList.INSTANCE;
                    break;
                default:
                    this.gift_card_type_tokens = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GiftCardCategory(this.token, this.name, this.gift_card_type_tokens, buildUnknownFields());
                case 1:
                    return new MultiplePendingRequestsRow(this.token, this.name, this.gift_card_type_tokens, buildUnknownFields());
                case 2:
                    return new SubmitScreenshotBundleRequest(this.token, this.name, this.gift_card_type_tokens, buildUnknownFields());
                case 3:
                    return new LocalMenuDiscountSummary(this.token, this.name, this.gift_card_type_tokens, buildUnknownFields());
                case 4:
                    return new PortfoliosPerformanceValue(this.token, this.name, this.gift_card_type_tokens, buildUnknownFields());
                case 5:
                    return new SyncInvestmentFilterGroup.CategoryMapNode(this.token, this.name, this.gift_card_type_tokens, buildUnknownFields());
                default:
                    return new OvertimeReportByTimecardForEmployeeResponse(this.gift_card_type_tokens, this.token, this.name, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
