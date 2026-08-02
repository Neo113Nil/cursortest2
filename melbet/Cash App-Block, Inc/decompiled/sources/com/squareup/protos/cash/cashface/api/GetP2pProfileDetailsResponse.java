package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/cashface/api/GetP2pProfileDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Trust$Builder;", "Builder", "HeaderData", "TrustElement", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetP2pProfileDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetP2pProfileDetailsResponse> CREATOR;
    public final HeaderData header_data;
    public final String subtitle;
    public final String title;
    public final List trust_elements;

    public final class HeaderData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeaderData> CREATOR;
        public final Color color;
        public final String display_name;
        public final Image photo;

        static {
            GetP2pProfileDetailsResponse$HeaderData$Companion$ADAPTER$1 getP2pProfileDetailsResponse$HeaderData$Companion$ADAPTER$1 = new GetP2pProfileDetailsResponse$HeaderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeaderData.class), "type.googleapis.com/squareup.cash.cashface.api.GetP2pProfileDetailsResponse.HeaderData", Syntax.PROTO_2, null, "squareup/cash/cashface/api/GetP2pProfileDetails.proto");
            ADAPTER = getP2pProfileDetailsResponse$HeaderData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getP2pProfileDetailsResponse$HeaderData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderData(String str, Image image, Color color, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.display_name = str;
            this.photo = image;
            this.color = color;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeaderData)) {
                return false;
            }
            HeaderData headerData = (HeaderData) obj;
            return Intrinsics.areEqual(unknownFields(), headerData.unknownFields()) && Intrinsics.areEqual(this.display_name, headerData.display_name) && Intrinsics.areEqual(this.photo, headerData.photo) && Intrinsics.areEqual(this.color, headerData.color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.display_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Image image = this.photo;
            int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
            Color color = this.color;
            int hashCode4 = hashCode3 + (color != null ? color.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Row.Builder builder = new Row.Builder(6);
            builder.title = this.display_name;
            builder.subtitle = this.photo;
            builder.action = this.color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.display_name != null) {
                arrayList.add("display_name=██");
            }
            if (this.photo != null) {
                arrayList.add("photo=██");
            }
            Color color = this.color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeaderData{", "}", 0, null, null, 56);
        }
    }

    public final class TrustElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TrustElement> CREATOR;
        public final Icon icon;
        public final String text;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Icon icon;
            public String text;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new TrustElement(this.icon, this.text, buildUnknownFields());
                    default:
                        return new GetPaperCashDepositBarcodeResponse.Success.BenefitReinforcementMessage(this.icon, this.text, buildUnknownFields());
                }
            }
        }

        static {
            GetP2pProfileDetailsResponse$TrustElement$Companion$ADAPTER$1 getP2pProfileDetailsResponse$TrustElement$Companion$ADAPTER$1 = new GetP2pProfileDetailsResponse$TrustElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TrustElement.class), "type.googleapis.com/squareup.cash.cashface.api.GetP2pProfileDetailsResponse.TrustElement", Syntax.PROTO_2, null, "squareup/cash/cashface/api/GetP2pProfileDetails.proto");
            ADAPTER = getP2pProfileDetailsResponse$TrustElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getP2pProfileDetailsResponse$TrustElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrustElement(Icon icon, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = icon;
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrustElement)) {
                return false;
            }
            TrustElement trustElement = (TrustElement) obj;
            return Intrinsics.areEqual(unknownFields(), trustElement.unknownFields()) && Intrinsics.areEqual(this.icon, trustElement.icon) && Intrinsics.areEqual(this.text, trustElement.text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            String str = this.text;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.icon = this.icon;
            builder.text = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            if (this.text != null) {
                arrayList.add("text=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TrustElement{", "}", 0, null, null, 56);
        }
    }

    static {
        GetP2pProfileDetailsResponse$Companion$ADAPTER$1 getP2pProfileDetailsResponse$Companion$ADAPTER$1 = new GetP2pProfileDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetP2pProfileDetailsResponse.class), "type.googleapis.com/squareup.cash.cashface.api.GetP2pProfileDetailsResponse", Syntax.PROTO_2, null, "squareup/cash/cashface/api/GetP2pProfileDetails.proto");
        ADAPTER = getP2pProfileDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getP2pProfileDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetP2pProfileDetailsResponse(HeaderData headerData, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.header_data = headerData;
        this.title = str;
        this.subtitle = str2;
        this.trust_elements = TransactorKt.immutableCopyOf("trust_elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetP2pProfileDetailsResponse)) {
            return false;
        }
        GetP2pProfileDetailsResponse getP2pProfileDetailsResponse = (GetP2pProfileDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getP2pProfileDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.header_data, getP2pProfileDetailsResponse.header_data) && Intrinsics.areEqual(this.title, getP2pProfileDetailsResponse.title) && Intrinsics.areEqual(this.subtitle, getP2pProfileDetailsResponse.subtitle) && Intrinsics.areEqual(this.trust_elements, getP2pProfileDetailsResponse.trust_elements);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        HeaderData headerData = this.header_data;
        int hashCode2 = (hashCode + (headerData != null ? headerData.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode4 = this.trust_elements.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(4, false);
        builder.icon = this.header_data;
        builder.title = this.title;
        builder.enabled = this.subtitle;
        builder.id = this.trust_elements;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        HeaderData headerData = this.header_data;
        if (headerData != null) {
            arrayList.add("header_data=" + headerData);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        List list = this.trust_elements;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("trust_elements=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetP2pProfileDetailsResponse{", "}", 0, null, null, 56);
    }
}
