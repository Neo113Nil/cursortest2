package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.support.GetSupportContactStatusResponse;
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
public final class InvestmentEntityCategory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestmentEntityCategory> CREATOR;
    public final String description;
    public final Boolean in_search_suggestion;
    public final List investment_entities;
    public final String name;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String description;
        public Boolean in_search_suggestion;
        public List investment_entities;
        public String name;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    String str = this.name;
                    List list = this.investment_entities;
                    return new InvestmentEntityCategory(this.in_search_suggestion, str, this.description, list, buildUnknownFields());
                default:
                    return new GetSupportContactStatusResponse(this.in_search_suggestion, this.name, this.description, this.investment_entities, buildUnknownFields());
            }
        }
    }

    static {
        InvestmentEntityCategory$Companion$ADAPTER$1 investmentEntityCategory$Companion$ADAPTER$1 = new InvestmentEntityCategory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestmentEntityCategory.class), "type.googleapis.com/squareup.cash.marketdata.model.InvestmentEntityCategory", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_entities.proto");
        ADAPTER = investmentEntityCategory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentEntityCategory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentEntityCategory(Boolean bool, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.name = str;
        this.description = str2;
        this.in_search_suggestion = bool;
        this.investment_entities = TransactorKt.immutableCopyOf("investment_entities", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestmentEntityCategory)) {
            return false;
        }
        InvestmentEntityCategory investmentEntityCategory = (InvestmentEntityCategory) obj;
        return Intrinsics.areEqual(unknownFields(), investmentEntityCategory.unknownFields()) && Intrinsics.areEqual(this.name, investmentEntityCategory.name) && Intrinsics.areEqual(this.investment_entities, investmentEntityCategory.investment_entities) && Intrinsics.areEqual(this.description, investmentEntityCategory.description) && Intrinsics.areEqual(this.in_search_suggestion, investmentEntityCategory.in_search_suggestion);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.investment_entities);
        String str2 = this.description;
        int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.in_search_suggestion;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.name = this.name;
        builder.investment_entities = this.investment_entities;
        builder.description = this.description;
        builder.in_search_suggestion = this.in_search_suggestion;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        List list = this.investment_entities;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("investment_entities=", arrayList, list);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        Boolean bool = this.in_search_suggestion;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("in_search_suggestion=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentEntityCategory{", "}", 0, null, null, 56);
    }
}
