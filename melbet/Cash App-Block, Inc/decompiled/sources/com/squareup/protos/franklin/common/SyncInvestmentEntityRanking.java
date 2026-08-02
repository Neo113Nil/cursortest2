package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.data.LinkResult;
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

/* loaded from: classes8.dex */
public final class SyncInvestmentEntityRanking extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncInvestmentEntityRanking> CREATOR;
    public final List investment_entity_tokens;
    public final RankingType ranking_type;

    public enum RankingType implements WireEnum {
        DO_NOT_USE_RANKING_TYPE(0),
        SEARCH_AND_CATEGORY_VIEWS(1);

        public static final SyncInvestmentEntityRanking$RankingType$Companion$ADAPTER$1 ADAPTER;
        public static final LinkResult.Companion Companion;
        public final int value;

        static {
            RankingType rankingType = DO_NOT_USE_RANKING_TYPE;
            Companion = new LinkResult.Companion();
            ADAPTER = new SyncInvestmentEntityRanking$RankingType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RankingType.class), Syntax.PROTO_2, rankingType);
        }

        RankingType(int i) {
            this.value = i;
        }

        public static final RankingType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DO_NOT_USE_RANKING_TYPE;
            }
            if (i != 1) {
                return null;
            }
            return SEARCH_AND_CATEGORY_VIEWS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SyncInvestmentEntityRanking$Companion$ADAPTER$1 syncInvestmentEntityRanking$Companion$ADAPTER$1 = new SyncInvestmentEntityRanking$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncInvestmentEntityRanking.class), "type.googleapis.com/squareup.franklin.SyncInvestmentEntityRanking", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncInvestmentEntityRanking$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvestmentEntityRanking$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncInvestmentEntityRanking(RankingType rankingType, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.ranking_type = rankingType;
        this.investment_entity_tokens = TransactorKt.immutableCopyOf("investment_entity_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncInvestmentEntityRanking)) {
            return false;
        }
        SyncInvestmentEntityRanking syncInvestmentEntityRanking = (SyncInvestmentEntityRanking) obj;
        return Intrinsics.areEqual(unknownFields(), syncInvestmentEntityRanking.unknownFields()) && this.ranking_type == syncInvestmentEntityRanking.ranking_type && Intrinsics.areEqual(this.investment_entity_tokens, syncInvestmentEntityRanking.investment_entity_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RankingType rankingType = this.ranking_type;
        int hashCode2 = this.investment_entity_tokens.hashCode() + ((hashCode + (rankingType != null ? rankingType.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(19);
        builder.f1372android = this.ranking_type;
        builder.ios = this.investment_entity_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RankingType rankingType = this.ranking_type;
        if (rankingType != null) {
            arrayList.add("ranking_type=" + rankingType);
        }
        List list = this.investment_entity_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("investment_entity_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncInvestmentEntityRanking{", "}", 0, null, null, 56);
    }
}
