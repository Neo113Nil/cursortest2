package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class CreateCartRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateCartRequest> CREATOR;
    public final String anonymous_user_app_token;
    public final String attribution_key;
    public final String brand_token;
    public final List cart_line_selections;
    public final String checkout_flow_token;
    public final LocalMoney client_lines_subtotal;
    public final List discount_codes;
    public final LocalFulfillment fulfillment;
    public final List gift_card_codes;
    public final List input_values;
    public final String location_token;
    public final String loyalty_reward_token;
    public final String offer_token;
    public final Boolean redeem_local_cash;
    public final LocalMoney tip_amount;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public String anonymous_user_app_token;
        public String attribution_key;
        public String brand_token;
        public List cart_line_selections;
        public String checkout_flow_token;
        public LocalMoney client_lines_subtotal;
        public List discount_codes;
        public LocalFulfillment fulfillment;
        public List gift_card_codes;
        public List input_values;
        public String location_token;
        public String loyalty_reward_token;
        public String offer_token;
        public Boolean redeem_local_cash;
        public LocalMoney tip_amount;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.cart_line_selections = emptyList;
            this.discount_codes = emptyList;
            this.gift_card_codes = emptyList;
            this.input_values = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new CreateCartRequest(this.brand_token, this.location_token, this.cart_line_selections, this.client_lines_subtotal, this.anonymous_user_app_token, this.attribution_key, this.checkout_flow_token, this.discount_codes, this.fulfillment, this.loyalty_reward_token, this.offer_token, this.tip_amount, this.redeem_local_cash, this.gift_card_codes, this.input_values, buildUnknownFields());
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CreateCartRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.CreateCartRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0031. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                Object obj;
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                Object obj12 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    Object obj13 = obj5;
                    if (nextTag == -1) {
                        return new CreateCartRequest((String) obj3, (String) obj12, m, (LocalMoney) obj4, (String) obj13, (String) obj6, (String) obj7, arrayList, (LocalFulfillment) obj8, (String) obj9, (String) obj10, (LocalMoney) obj2, (Boolean) obj11, arrayList2, arrayList3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            obj5 = obj13;
                            break;
                        case 2:
                            obj12 = ProtoAdapter.STRING.decode(protoReader);
                            obj5 = obj13;
                            obj = obj3;
                            break;
                        case 3:
                            m.add(LocalCart.Line.Selection.ADAPTER.decode(protoReader));
                            obj = obj3;
                            obj5 = obj13;
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj4);
                            obj5 = obj13;
                            obj = obj3;
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            obj = obj3;
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            obj5 = obj13;
                            obj = obj3;
                            break;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            obj5 = obj13;
                            obj = obj3;
                            break;
                        case 8:
                            arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                            obj = obj3;
                            obj5 = obj13;
                            break;
                        case 9:
                            obj8 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.ADAPTER, protoReader, obj8);
                            obj5 = obj13;
                            obj = obj3;
                            break;
                        case 10:
                            obj9 = ProtoAdapter.STRING.decode(protoReader);
                            obj5 = obj13;
                            obj = obj3;
                            break;
                        case 11:
                            obj10 = ProtoAdapter.STRING.decode(protoReader);
                            obj5 = obj13;
                            obj = obj3;
                            break;
                        case 12:
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj2);
                            obj = obj3;
                            obj5 = obj13;
                            break;
                        case 13:
                            obj11 = ProtoAdapter.BOOL.decode(protoReader);
                            obj5 = obj13;
                            obj = obj3;
                            break;
                        case 14:
                            arrayList2.add(ProtoAdapter.STRING.decode(protoReader));
                            obj = obj3;
                            obj5 = obj13;
                            break;
                        case 15:
                            arrayList3.add(InputValue.ADAPTER.decode(protoReader));
                            obj = obj3;
                            obj5 = obj13;
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj3;
                            obj5 = obj13;
                            break;
                    }
                    obj3 = obj;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CreateCartRequest createCartRequest = (CreateCartRequest) obj;
                reverseProtoWriter.getClass();
                createCartRequest.getClass();
                reverseProtoWriter.writeBytes(createCartRequest.unknownFields());
                InputValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 15, createCartRequest.input_values);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 14, createCartRequest.gift_card_codes);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 13, createCartRequest.redeem_local_cash);
                ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 12, createCartRequest.tip_amount);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 11, createCartRequest.offer_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 10, createCartRequest.loyalty_reward_token);
                LocalFulfillment.ADAPTER.encodeWithTag(reverseProtoWriter, 9, createCartRequest.fulfillment);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 8, createCartRequest.discount_codes);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, createCartRequest.checkout_flow_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, createCartRequest.attribution_key);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, createCartRequest.anonymous_user_app_token);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 4, createCartRequest.client_lines_subtotal);
                LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, createCartRequest.cart_line_selections);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, createCartRequest.location_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, createCartRequest.brand_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CreateCartRequest createCartRequest = (CreateCartRequest) obj;
                createCartRequest.getClass();
                int size$okio = createCartRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = LocalCart.Line.Selection.ADAPTER.asRepeated().encodedSizeWithTag(3, createCartRequest.cart_line_selections) + protoAdapter2.encodedSizeWithTag(2, createCartRequest.location_token) + protoAdapter2.encodedSizeWithTag(1, createCartRequest.brand_token) + size$okio;
                ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                return InputValue.ADAPTER.asRepeated().encodedSizeWithTag(15, createCartRequest.input_values) + protoAdapter2.asRepeated().encodedSizeWithTag(14, createCartRequest.gift_card_codes) + ProtoAdapter.BOOL.encodedSizeWithTag(13, createCartRequest.redeem_local_cash) + protoAdapter3.encodedSizeWithTag(12, createCartRequest.tip_amount) + protoAdapter2.encodedSizeWithTag(11, createCartRequest.offer_token) + protoAdapter2.encodedSizeWithTag(10, createCartRequest.loyalty_reward_token) + LocalFulfillment.ADAPTER.encodedSizeWithTag(9, createCartRequest.fulfillment) + protoAdapter2.asRepeated().encodedSizeWithTag(8, createCartRequest.discount_codes) + protoAdapter2.encodedSizeWithTag(7, createCartRequest.checkout_flow_token) + protoAdapter2.encodedSizeWithTag(6, createCartRequest.attribution_key) + protoAdapter2.encodedSizeWithTag(5, createCartRequest.anonymous_user_app_token) + protoAdapter3.encodedSizeWithTag(4, createCartRequest.client_lines_subtotal) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CreateCartRequest createCartRequest = (CreateCartRequest) obj;
                createCartRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(createCartRequest.cart_line_selections, LocalCart.Line.Selection.ADAPTER);
                LocalMoney localMoney = createCartRequest.client_lines_subtotal;
                LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
                LocalFulfillment localFulfillment = createCartRequest.fulfillment;
                LocalFulfillment localFulfillment2 = localFulfillment != null ? (LocalFulfillment) LocalFulfillment.ADAPTER.redact(localFulfillment) : null;
                LocalMoney localMoney3 = createCartRequest.tip_amount;
                LocalMoney localMoney4 = localMoney3 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney3) : null;
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(createCartRequest.input_values, InputValue.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = createCartRequest.brand_token;
                String str2 = createCartRequest.location_token;
                String str3 = createCartRequest.anonymous_user_app_token;
                String str4 = createCartRequest.attribution_key;
                String str5 = createCartRequest.checkout_flow_token;
                List list = createCartRequest.discount_codes;
                String str6 = createCartRequest.loyalty_reward_token;
                String str7 = createCartRequest.offer_token;
                Boolean bool = createCartRequest.redeem_local_cash;
                List list2 = createCartRequest.gift_card_codes;
                list.getClass();
                list2.getClass();
                byteString.getClass();
                return new CreateCartRequest(str, str2, m1169redactElements, localMoney2, str3, str4, str5, list, localFulfillment2, str6, str7, localMoney4, bool, list2, m1169redactElements2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CreateCartRequest createCartRequest = (CreateCartRequest) obj;
                createCartRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, createCartRequest.brand_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, createCartRequest.location_token);
                LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, createCartRequest.cart_line_selections);
                ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                protoAdapter3.encodeWithTag(protoWriter, 4, createCartRequest.client_lines_subtotal);
                protoAdapter2.encodeWithTag(protoWriter, 5, createCartRequest.anonymous_user_app_token);
                protoAdapter2.encodeWithTag(protoWriter, 6, createCartRequest.attribution_key);
                protoAdapter2.encodeWithTag(protoWriter, 7, createCartRequest.checkout_flow_token);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 8, createCartRequest.discount_codes);
                LocalFulfillment.ADAPTER.encodeWithTag(protoWriter, 9, createCartRequest.fulfillment);
                protoAdapter2.encodeWithTag(protoWriter, 10, createCartRequest.loyalty_reward_token);
                protoAdapter2.encodeWithTag(protoWriter, 11, createCartRequest.offer_token);
                protoAdapter3.encodeWithTag(protoWriter, 12, createCartRequest.tip_amount);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, createCartRequest.redeem_local_cash);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 14, createCartRequest.gift_card_codes);
                InputValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, createCartRequest.input_values);
                protoWriter.writeBytes(createCartRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCartRequest(String str, String str2, List list, LocalMoney localMoney, String str3, String str4, String str5, List list2, LocalFulfillment localFulfillment, String str6, String str7, LocalMoney localMoney2, Boolean bool, List list3, List list4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.brand_token = str;
        this.location_token = str2;
        this.client_lines_subtotal = localMoney;
        this.anonymous_user_app_token = str3;
        this.attribution_key = str4;
        this.checkout_flow_token = str5;
        this.fulfillment = localFulfillment;
        this.loyalty_reward_token = str6;
        this.offer_token = str7;
        this.tip_amount = localMoney2;
        this.redeem_local_cash = bool;
        this.cart_line_selections = TransactorKt.immutableCopyOf("cart_line_selections", list);
        this.discount_codes = TransactorKt.immutableCopyOf("discount_codes", list2);
        this.gift_card_codes = TransactorKt.immutableCopyOf("gift_card_codes", list3);
        this.input_values = TransactorKt.immutableCopyOf("input_values", list4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateCartRequest)) {
            return false;
        }
        CreateCartRequest createCartRequest = (CreateCartRequest) obj;
        return Intrinsics.areEqual(unknownFields(), createCartRequest.unknownFields()) && Intrinsics.areEqual(this.brand_token, createCartRequest.brand_token) && Intrinsics.areEqual(this.location_token, createCartRequest.location_token) && Intrinsics.areEqual(this.cart_line_selections, createCartRequest.cart_line_selections) && Intrinsics.areEqual(this.client_lines_subtotal, createCartRequest.client_lines_subtotal) && Intrinsics.areEqual(this.anonymous_user_app_token, createCartRequest.anonymous_user_app_token) && Intrinsics.areEqual(this.attribution_key, createCartRequest.attribution_key) && Intrinsics.areEqual(this.checkout_flow_token, createCartRequest.checkout_flow_token) && Intrinsics.areEqual(this.discount_codes, createCartRequest.discount_codes) && Intrinsics.areEqual(this.fulfillment, createCartRequest.fulfillment) && Intrinsics.areEqual(this.loyalty_reward_token, createCartRequest.loyalty_reward_token) && Intrinsics.areEqual(this.offer_token, createCartRequest.offer_token) && Intrinsics.areEqual(this.tip_amount, createCartRequest.tip_amount) && Intrinsics.areEqual(this.redeem_local_cash, createCartRequest.redeem_local_cash) && Intrinsics.areEqual(this.gift_card_codes, createCartRequest.gift_card_codes) && Intrinsics.areEqual(this.input_values, createCartRequest.input_values);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.brand_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.location_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.cart_line_selections);
        LocalMoney localMoney = this.client_lines_subtotal;
        int hashCode3 = (m + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        String str3 = this.anonymous_user_app_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.attribution_key;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.checkout_flow_token;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37, 37, this.discount_codes);
        LocalFulfillment localFulfillment = this.fulfillment;
        int hashCode6 = (m2 + (localFulfillment != null ? localFulfillment.hashCode() : 0)) * 37;
        String str6 = this.loyalty_reward_token;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.offer_token;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        LocalMoney localMoney2 = this.tip_amount;
        int hashCode9 = (hashCode8 + (localMoney2 != null ? localMoney2.hashCode() : 0)) * 37;
        Boolean bool = this.redeem_local_cash;
        int hashCode10 = this.input_values.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.gift_card_codes);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.brand_token = this.brand_token;
        builder.location_token = this.location_token;
        builder.cart_line_selections = this.cart_line_selections;
        builder.client_lines_subtotal = this.client_lines_subtotal;
        builder.anonymous_user_app_token = this.anonymous_user_app_token;
        builder.attribution_key = this.attribution_key;
        builder.checkout_flow_token = this.checkout_flow_token;
        builder.discount_codes = this.discount_codes;
        builder.fulfillment = this.fulfillment;
        builder.loyalty_reward_token = this.loyalty_reward_token;
        builder.offer_token = this.offer_token;
        builder.tip_amount = this.tip_amount;
        builder.redeem_local_cash = this.redeem_local_cash;
        builder.gift_card_codes = this.gift_card_codes;
        builder.input_values = this.input_values;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.brand_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_token=", arrayList);
        }
        String str2 = this.location_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "location_token=", arrayList);
        }
        List list = this.cart_line_selections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("cart_line_selections=", arrayList, list);
        }
        LocalMoney localMoney = this.client_lines_subtotal;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("client_lines_subtotal=", localMoney, arrayList);
        }
        String str3 = this.anonymous_user_app_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "anonymous_user_app_token=", arrayList);
        }
        String str4 = this.attribution_key;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "attribution_key=", arrayList);
        }
        String str5 = this.checkout_flow_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "checkout_flow_token=", arrayList);
        }
        List list2 = this.discount_codes;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("discount_codes=", arrayList, list2);
        }
        LocalFulfillment localFulfillment = this.fulfillment;
        if (localFulfillment != null) {
            arrayList.add("fulfillment=" + localFulfillment);
        }
        String str6 = this.loyalty_reward_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "loyalty_reward_token=", arrayList);
        }
        String str7 = this.offer_token;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "offer_token=", arrayList);
        }
        LocalMoney localMoney2 = this.tip_amount;
        if (localMoney2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tip_amount=", localMoney2, arrayList);
        }
        Boolean bool = this.redeem_local_cash;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("redeem_local_cash=", bool, arrayList);
        }
        List list3 = this.gift_card_codes;
        if (!list3.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("gift_card_codes=", arrayList, list3);
        }
        List list4 = this.input_values;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("input_values=", arrayList, list4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateCartRequest{", "}", 0, null, null, 56);
    }

    public CreateCartRequest(String str, String str2, List list, LocalMoney localMoney, String str3, String str4, ArrayList arrayList, LocalFulfillment localFulfillment, String str5, String str6, LocalMoney localMoney2, Boolean bool, ArrayList arrayList2, int i) {
        this(str, str2, list, localMoney, null, str3, str4, arrayList, localFulfillment, str5, str6, (i & 2048) != 0 ? null : localMoney2, (i & 4096) != 0 ? null : bool, (i & PKIFailureInfo.certRevoked) != 0 ? EmptyList.INSTANCE : arrayList2, EmptyList.INSTANCE, ByteString.EMPTY);
    }
}
