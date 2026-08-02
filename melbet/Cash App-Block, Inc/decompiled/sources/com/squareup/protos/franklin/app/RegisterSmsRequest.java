package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.franklin.app.RegisterSmsRequest;
import com.squareup.protos.franklin.common.DeviceLocationHeuristics;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.protos.franklin.common.SmsDeliveryMechanism;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
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
public final class RegisterSmsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RegisterSmsRequest> CREATOR;
    public final String account_id;
    public final String app_callback_token;
    public final String cellular_ip_address;
    public final String cellular_ip_address_debugging_description;
    public final String cellular_ip_address_state;
    public final DeviceLocationHeuristics device_location_heuristics;
    public final Boolean existing_customer_only;
    public final List payment_tokens;
    public final Boolean pre_filled_from_phone;
    public final RequestContext request_context;
    public final Scenario scenario;
    public final String sms_number;
    public final SmsDeliveryMechanism verification_mechanism;

    /* loaded from: classes8.dex */
    public enum Scenario implements WireEnum {
        ONBOARDING(0),
        PROFILE(1);

        public static final RegisterSmsRequest$Scenario$Companion$ADAPTER$1 ADAPTER;
        public static final PoolVisibility.Companion Companion;
        public final int value;

        static {
            Scenario scenario = ONBOARDING;
            Companion = new PoolVisibility.Companion();
            ADAPTER = new RegisterSmsRequest$Scenario$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Scenario.class), Syntax.PROTO_2, scenario);
        }

        Scenario(int i) {
            this.value = i;
        }

        public static final Scenario fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ONBOARDING;
            }
            if (i != 1) {
                return null;
            }
            return PROFILE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        KeyScope.Companion companion = SmsDeliveryMechanism.Companion;
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RegisterSmsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.RegisterSmsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34 */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v37 */
            /* JADX WARN: Type inference failed for: r0v38 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                Object obj;
                ArrayList arrayList;
                SmsDeliveryMechanism smsDeliveryMechanism;
                ?? decode;
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                String str = null;
                Object obj2 = null;
                SmsDeliveryMechanism smsDeliveryMechanism2 = null;
                RegisterSmsRequest.Scenario scenario = null;
                Boolean bool = null;
                Boolean bool2 = null;
                Object obj3 = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RegisterSmsRequest((RequestContext) obj2, str, smsDeliveryMechanism2, scenario, bool, m, bool2, (DeviceLocationHeuristics) obj3, str2, str3, str4, str5, str6, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 2:
                            arrayList = m;
                            decode = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj = obj2;
                            arrayList = m;
                            smsDeliveryMechanism = smsDeliveryMechanism2;
                            try {
                                smsDeliveryMechanism2 = SmsDeliveryMechanism.ADAPTER.decode(protoReader);
                                obj2 = obj;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 4:
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj2;
                            arrayList = m;
                            smsDeliveryMechanism = smsDeliveryMechanism2;
                            decode = str;
                            obj2 = obj;
                            smsDeliveryMechanism2 = smsDeliveryMechanism;
                            break;
                        case 5:
                            try {
                                scenario = RegisterSmsRequest.Scenario.ADAPTER.decode(protoReader);
                                arrayList = m;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj = obj2;
                                arrayList = m;
                                smsDeliveryMechanism = smsDeliveryMechanism2;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 6:
                            bool = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 7:
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            obj = obj2;
                            arrayList = m;
                            smsDeliveryMechanism = smsDeliveryMechanism2;
                            decode = str;
                            obj2 = obj;
                            smsDeliveryMechanism2 = smsDeliveryMechanism;
                            break;
                        case 8:
                            bool2 = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 9:
                            obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                            arrayList = m;
                            decode = str;
                            break;
                        case 10:
                            obj3 = TransactorKt.decodeMessageOrMerge(DeviceLocationHeuristics.ADAPTER, protoReader, obj3);
                            arrayList = m;
                            decode = str;
                            break;
                        case 11:
                            str2 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 12:
                            str3 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 13:
                            str4 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 14:
                            str5 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList = m;
                            decode = str;
                            break;
                        case 15:
                            str6 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList = m;
                            decode = str;
                            break;
                    }
                    str = decode;
                    m = arrayList;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RegisterSmsRequest registerSmsRequest = (RegisterSmsRequest) obj;
                reverseProtoWriter.getClass();
                registerSmsRequest.getClass();
                reverseProtoWriter.writeBytes(registerSmsRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 15, registerSmsRequest.cellular_ip_address_debugging_description);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 14, registerSmsRequest.cellular_ip_address_state);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 13, registerSmsRequest.cellular_ip_address);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 12, registerSmsRequest.account_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 11, registerSmsRequest.app_callback_token);
                DeviceLocationHeuristics.ADAPTER.encodeWithTag(reverseProtoWriter, 10, registerSmsRequest.device_location_heuristics);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 8, registerSmsRequest.existing_customer_only);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 7, registerSmsRequest.payment_tokens);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 6, registerSmsRequest.pre_filled_from_phone);
                RegisterSmsRequest.Scenario.ADAPTER.encodeWithTag(reverseProtoWriter, 5, registerSmsRequest.scenario);
                SmsDeliveryMechanism.ADAPTER.encodeWithTag(reverseProtoWriter, 3, registerSmsRequest.verification_mechanism);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, registerSmsRequest.sms_number);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 9, registerSmsRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RegisterSmsRequest registerSmsRequest = (RegisterSmsRequest) obj;
                registerSmsRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(9, registerSmsRequest.request_context) + registerSmsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = RegisterSmsRequest.Scenario.ADAPTER.encodedSizeWithTag(5, registerSmsRequest.scenario) + SmsDeliveryMechanism.ADAPTER.encodedSizeWithTag(3, registerSmsRequest.verification_mechanism) + protoAdapter2.encodedSizeWithTag(2, registerSmsRequest.sms_number) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                return protoAdapter2.encodedSizeWithTag(15, registerSmsRequest.cellular_ip_address_debugging_description) + protoAdapter2.encodedSizeWithTag(14, registerSmsRequest.cellular_ip_address_state) + protoAdapter2.encodedSizeWithTag(13, registerSmsRequest.cellular_ip_address) + protoAdapter2.encodedSizeWithTag(12, registerSmsRequest.account_id) + protoAdapter2.encodedSizeWithTag(11, registerSmsRequest.app_callback_token) + DeviceLocationHeuristics.ADAPTER.encodedSizeWithTag(10, registerSmsRequest.device_location_heuristics) + protoAdapter3.encodedSizeWithTag(8, registerSmsRequest.existing_customer_only) + protoAdapter2.asRepeated().encodedSizeWithTag(7, registerSmsRequest.payment_tokens) + protoAdapter3.encodedSizeWithTag(6, registerSmsRequest.pre_filled_from_phone) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RegisterSmsRequest registerSmsRequest = (RegisterSmsRequest) obj;
                registerSmsRequest.getClass();
                RequestContext requestContext = registerSmsRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                DeviceLocationHeuristics deviceLocationHeuristics = registerSmsRequest.device_location_heuristics;
                return RegisterSmsRequest.copy$default(registerSmsRequest, requestContext2, emptyList, deviceLocationHeuristics != null ? (DeviceLocationHeuristics) DeviceLocationHeuristics.ADAPTER.redact(deviceLocationHeuristics) : null, ByteString.EMPTY, 2396);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RegisterSmsRequest registerSmsRequest = (RegisterSmsRequest) obj;
                registerSmsRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 9, registerSmsRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, registerSmsRequest.sms_number);
                SmsDeliveryMechanism.ADAPTER.encodeWithTag(protoWriter, 3, registerSmsRequest.verification_mechanism);
                RegisterSmsRequest.Scenario.ADAPTER.encodeWithTag(protoWriter, 5, registerSmsRequest.scenario);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(protoWriter, 6, registerSmsRequest.pre_filled_from_phone);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 7, registerSmsRequest.payment_tokens);
                protoAdapter3.encodeWithTag(protoWriter, 8, registerSmsRequest.existing_customer_only);
                DeviceLocationHeuristics.ADAPTER.encodeWithTag(protoWriter, 10, registerSmsRequest.device_location_heuristics);
                protoAdapter2.encodeWithTag(protoWriter, 11, registerSmsRequest.app_callback_token);
                protoAdapter2.encodeWithTag(protoWriter, 12, registerSmsRequest.account_id);
                protoAdapter2.encodeWithTag(protoWriter, 13, registerSmsRequest.cellular_ip_address);
                protoAdapter2.encodeWithTag(protoWriter, 14, registerSmsRequest.cellular_ip_address_state);
                protoAdapter2.encodeWithTag(protoWriter, 15, registerSmsRequest.cellular_ip_address_debugging_description);
                protoWriter.writeBytes(registerSmsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterSmsRequest(RequestContext requestContext, String str, SmsDeliveryMechanism smsDeliveryMechanism, Scenario scenario, Boolean bool, List list, Boolean bool2, DeviceLocationHeuristics deviceLocationHeuristics, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.sms_number = str;
        this.verification_mechanism = smsDeliveryMechanism;
        this.scenario = scenario;
        this.pre_filled_from_phone = bool;
        this.existing_customer_only = bool2;
        this.device_location_heuristics = deviceLocationHeuristics;
        this.app_callback_token = str2;
        this.account_id = str3;
        this.cellular_ip_address = str4;
        this.cellular_ip_address_state = str5;
        this.cellular_ip_address_debugging_description = str6;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    public static RegisterSmsRequest copy$default(RegisterSmsRequest registerSmsRequest, RequestContext requestContext, EmptyList emptyList, DeviceLocationHeuristics deviceLocationHeuristics, ByteString byteString, int i) {
        String str = (i & 2) != 0 ? registerSmsRequest.sms_number : null;
        SmsDeliveryMechanism smsDeliveryMechanism = registerSmsRequest.verification_mechanism;
        Scenario scenario = registerSmsRequest.scenario;
        Boolean bool = registerSmsRequest.pre_filled_from_phone;
        EmptyList emptyList2 = (i & 32) != 0 ? registerSmsRequest.payment_tokens : emptyList;
        Boolean bool2 = registerSmsRequest.existing_customer_only;
        DeviceLocationHeuristics deviceLocationHeuristics2 = (i & 128) != 0 ? registerSmsRequest.device_location_heuristics : deviceLocationHeuristics;
        String str2 = registerSmsRequest.app_callback_token;
        String str3 = (i & 512) != 0 ? registerSmsRequest.account_id : null;
        String str4 = (i & 1024) != 0 ? registerSmsRequest.cellular_ip_address : null;
        String str5 = registerSmsRequest.cellular_ip_address_state;
        String str6 = (i & 4096) != 0 ? registerSmsRequest.cellular_ip_address_debugging_description : null;
        ByteString unknownFields = (i & PKIFailureInfo.certRevoked) != 0 ? registerSmsRequest.unknownFields() : byteString;
        registerSmsRequest.getClass();
        emptyList2.getClass();
        unknownFields.getClass();
        return new RegisterSmsRequest(requestContext, str, smsDeliveryMechanism, scenario, bool, emptyList2, bool2, deviceLocationHeuristics2, str2, str3, str4, str5, str6, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisterSmsRequest)) {
            return false;
        }
        RegisterSmsRequest registerSmsRequest = (RegisterSmsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), registerSmsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, registerSmsRequest.request_context) && Intrinsics.areEqual(this.sms_number, registerSmsRequest.sms_number) && this.verification_mechanism == registerSmsRequest.verification_mechanism && this.scenario == registerSmsRequest.scenario && Intrinsics.areEqual(this.pre_filled_from_phone, registerSmsRequest.pre_filled_from_phone) && Intrinsics.areEqual(this.payment_tokens, registerSmsRequest.payment_tokens) && Intrinsics.areEqual(this.existing_customer_only, registerSmsRequest.existing_customer_only) && Intrinsics.areEqual(this.device_location_heuristics, registerSmsRequest.device_location_heuristics) && Intrinsics.areEqual(this.app_callback_token, registerSmsRequest.app_callback_token) && Intrinsics.areEqual(this.account_id, registerSmsRequest.account_id) && Intrinsics.areEqual(this.cellular_ip_address, registerSmsRequest.cellular_ip_address) && Intrinsics.areEqual(this.cellular_ip_address_state, registerSmsRequest.cellular_ip_address_state) && Intrinsics.areEqual(this.cellular_ip_address_debugging_description, registerSmsRequest.cellular_ip_address_debugging_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.sms_number;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        SmsDeliveryMechanism smsDeliveryMechanism = this.verification_mechanism;
        int hashCode4 = (hashCode3 + (smsDeliveryMechanism != null ? smsDeliveryMechanism.hashCode() : 0)) * 37;
        Scenario scenario = this.scenario;
        int hashCode5 = (hashCode4 + (scenario != null ? scenario.hashCode() : 0)) * 37;
        Boolean bool = this.pre_filled_from_phone;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.payment_tokens);
        Boolean bool2 = this.existing_customer_only;
        int hashCode6 = (m + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        DeviceLocationHeuristics deviceLocationHeuristics = this.device_location_heuristics;
        int hashCode7 = (hashCode6 + (deviceLocationHeuristics != null ? deviceLocationHeuristics.hashCode() : 0)) * 37;
        String str2 = this.app_callback_token;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.account_id;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.cellular_ip_address;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.cellular_ip_address_state;
        int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.cellular_ip_address_debugging_description;
        int hashCode12 = hashCode11 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        RewardStatus.Builder builder = new RewardStatus.Builder();
        builder.minimum_code_length = this.request_context;
        builder.code_entry_client_route = this.sms_number;
        builder.reward_button_priority = this.verification_mechanism;
        builder.completed_reward_payments = this.scenario;
        builder.code_entry_enabled = this.pre_filled_from_phone;
        builder.available_reward_payments = this.payment_tokens;
        builder.reward_screen_enabled = this.existing_customer_only;
        builder.reward_payment_amount = this.device_location_heuristics;
        builder.reward_button_text = this.app_callback_token;
        builder.reward_header_text = this.account_id;
        builder.reward_main_text = this.cellular_ip_address;
        builder.expiration = this.cellular_ip_address_state;
        builder.referral_status_screen = this.cellular_ip_address_debugging_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.sms_number != null) {
            arrayList.add("sms_number=██");
        }
        SmsDeliveryMechanism smsDeliveryMechanism = this.verification_mechanism;
        if (smsDeliveryMechanism != null) {
            arrayList.add("verification_mechanism=" + smsDeliveryMechanism);
        }
        Scenario scenario = this.scenario;
        if (scenario != null) {
            arrayList.add("scenario=" + scenario);
        }
        Boolean bool = this.pre_filled_from_phone;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("pre_filled_from_phone=", bool, arrayList);
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        Boolean bool2 = this.existing_customer_only;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("existing_customer_only=", bool2, arrayList);
        }
        DeviceLocationHeuristics deviceLocationHeuristics = this.device_location_heuristics;
        if (deviceLocationHeuristics != null) {
            arrayList.add("device_location_heuristics=" + deviceLocationHeuristics);
        }
        String str = this.app_callback_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_callback_token=", arrayList);
        }
        if (this.account_id != null) {
            arrayList.add("account_id=██");
        }
        if (this.cellular_ip_address != null) {
            arrayList.add("cellular_ip_address=██");
        }
        String str2 = this.cellular_ip_address_state;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cellular_ip_address_state=", arrayList);
        }
        if (this.cellular_ip_address_debugging_description != null) {
            arrayList.add("cellular_ip_address_debugging_description=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RegisterSmsRequest{", "}", 0, null, null, 56);
    }
}
