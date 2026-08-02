package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvestmentEntityRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestmentEntityRenderData> CREATOR;
    public final String dark_theme_icon_url;
    public final String icon_url;
    public final String investment_entity_name;
    public final String investment_entity_symbol;
    public final String investment_entity_token;

    /* renamed from: type, reason: collision with root package name */
    public final InvestmentType f1379type;

    public enum InvestmentType implements WireEnum {
        STOCK(1),
        CURRENCY(2);

        public final int value;
        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
        public static final InvestmentEntityRenderData$InvestmentType$Companion$ADAPTER$1 ADAPTER = new InvestmentEntityRenderData$InvestmentType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InvestmentType.class), Syntax.PROTO_2, null);

        InvestmentType(int i) {
            this.value = i;
        }

        public static final InvestmentType fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return STOCK;
            }
            if (i != 2) {
                return null;
            }
            return CURRENCY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        InvestmentEntityRenderData$Companion$ADAPTER$1 investmentEntityRenderData$Companion$ADAPTER$1 = new InvestmentEntityRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestmentEntityRenderData.class), "type.googleapis.com/squareup.franklin.InvestmentEntityRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = investmentEntityRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentEntityRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentEntityRenderData(String str, String str2, String str3, String str4, String str5, InvestmentType investmentType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.investment_entity_symbol = str;
        this.investment_entity_name = str2;
        this.investment_entity_token = str3;
        this.icon_url = str4;
        this.dark_theme_icon_url = str5;
        this.f1379type = investmentType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestmentEntityRenderData)) {
            return false;
        }
        InvestmentEntityRenderData investmentEntityRenderData = (InvestmentEntityRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), investmentEntityRenderData.unknownFields()) && Intrinsics.areEqual(this.investment_entity_symbol, investmentEntityRenderData.investment_entity_symbol) && Intrinsics.areEqual(this.investment_entity_name, investmentEntityRenderData.investment_entity_name) && Intrinsics.areEqual(this.investment_entity_token, investmentEntityRenderData.investment_entity_token) && Intrinsics.areEqual(this.icon_url, investmentEntityRenderData.icon_url) && Intrinsics.areEqual(this.dark_theme_icon_url, investmentEntityRenderData.dark_theme_icon_url) && this.f1379type == investmentEntityRenderData.f1379type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_symbol;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.investment_entity_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.investment_entity_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.icon_url;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.dark_theme_icon_url;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        InvestmentType investmentType = this.f1379type;
        int hashCode7 = hashCode6 + (investmentType != null ? investmentType.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(3, false);
        builder.full_name = this.investment_entity_symbol;
        builder.photo_url = this.investment_entity_name;
        builder.synopsis = this.investment_entity_token;
        builder.full_cashtag = this.icon_url;
        builder.cashtag_url_enabled = this.dark_theme_icon_url;
        builder.is_verified_account = this.f1379type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_symbol;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_symbol=", arrayList);
        }
        String str2 = this.investment_entity_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "investment_entity_name=", arrayList);
        }
        String str3 = this.investment_entity_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "investment_entity_token=", arrayList);
        }
        String str4 = this.icon_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "icon_url=", arrayList);
        }
        String str5 = this.dark_theme_icon_url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "dark_theme_icon_url=", arrayList);
        }
        InvestmentType investmentType = this.f1379type;
        if (investmentType != null) {
            arrayList.add("type=" + investmentType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentEntityRenderData{", "}", 0, null, null, 56);
    }
}
