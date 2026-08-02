package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
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
public final class CashAppPayInstrumentRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayInstrumentRenderData> CREATOR;
    public final InstrumentType brand;
    public final String card_last_4;
    public final String display_name;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final CashInstrumentType f1321type;

    static {
        CashAppPayInstrumentRenderData$Companion$ADAPTER$1 cashAppPayInstrumentRenderData$Companion$ADAPTER$1 = new CashAppPayInstrumentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayInstrumentRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayInstrumentRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_instrument.proto");
        ADAPTER = cashAppPayInstrumentRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayInstrumentRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayInstrumentRenderData(String str, String str2, CashInstrumentType cashInstrumentType, InstrumentType instrumentType, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_name = str;
        this.token = str2;
        this.f1321type = cashInstrumentType;
        this.brand = instrumentType;
        this.card_last_4 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayInstrumentRenderData)) {
            return false;
        }
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = (CashAppPayInstrumentRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayInstrumentRenderData.unknownFields()) && Intrinsics.areEqual(this.display_name, cashAppPayInstrumentRenderData.display_name) && Intrinsics.areEqual(this.token, cashAppPayInstrumentRenderData.token) && this.f1321type == cashAppPayInstrumentRenderData.f1321type && this.brand == cashAppPayInstrumentRenderData.brand && Intrinsics.areEqual(this.card_last_4, cashAppPayInstrumentRenderData.card_last_4);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.display_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CashInstrumentType cashInstrumentType = this.f1321type;
        int hashCode4 = (hashCode3 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0)) * 37;
        InstrumentType instrumentType = this.brand;
        int hashCode5 = (hashCode4 + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        String str3 = this.card_last_4;
        int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(27);
        builder.icon = this.display_name;
        builder.title = this.token;
        builder.subtitle = this.f1321type;
        builder.action = this.brand;
        builder.icon_background_color = this.card_last_4;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.display_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
        }
        String str2 = this.token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "token=", arrayList);
        }
        CashInstrumentType cashInstrumentType = this.f1321type;
        if (cashInstrumentType != null) {
            arrayList.add("type=" + cashInstrumentType);
        }
        InstrumentType instrumentType = this.brand;
        if (instrumentType != null) {
            arrayList.add("brand=" + instrumentType);
        }
        String str3 = this.card_last_4;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "card_last_4=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayInstrumentRenderData{", "}", 0, null, null, 56);
    }
}
