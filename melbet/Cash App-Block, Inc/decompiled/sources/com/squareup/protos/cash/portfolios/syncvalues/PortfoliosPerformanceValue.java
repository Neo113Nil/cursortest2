package com.squareup.protos.cash.portfolios.syncvalues;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
public final class PortfoliosPerformanceValue extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PortfoliosPerformanceValue> CREATOR;
    public final String investment_entity_token;
    public final List sections;
    public final String title;

    static {
        PortfoliosPerformanceValue$Companion$ADAPTER$1 portfoliosPerformanceValue$Companion$ADAPTER$1 = new PortfoliosPerformanceValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PortfoliosPerformanceValue.class), "type.googleapis.com/squareup.cash.portfolios.syncvalues.PortfoliosPerformanceValue", Syntax.PROTO_2, null, "squareup/cash/portfolios/syncvalues/portfolios_performance_value.proto");
        ADAPTER = portfoliosPerformanceValue$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(portfoliosPerformanceValue$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfoliosPerformanceValue(String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.investment_entity_token = str;
        this.title = str2;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PortfoliosPerformanceValue)) {
            return false;
        }
        PortfoliosPerformanceValue portfoliosPerformanceValue = (PortfoliosPerformanceValue) obj;
        return Intrinsics.areEqual(unknownFields(), portfoliosPerformanceValue.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, portfoliosPerformanceValue.investment_entity_token) && Intrinsics.areEqual(this.sections, portfoliosPerformanceValue.sections) && Intrinsics.areEqual(this.title, portfoliosPerformanceValue.title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.sections);
        String str2 = this.title;
        int hashCode2 = m + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCardCategory.Builder builder = new GiftCardCategory.Builder(4, false);
        builder.token = this.investment_entity_token;
        builder.gift_card_type_tokens = this.sections;
        builder.name = this.title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfoliosPerformanceValue{", "}", 0, null, null, 56);
    }
}
