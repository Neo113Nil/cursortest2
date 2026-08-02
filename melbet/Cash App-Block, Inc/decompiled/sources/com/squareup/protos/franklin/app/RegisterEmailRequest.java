package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.app.RegisterEmailRequest;
import com.squareup.protos.franklin.common.DeviceLocationHeuristics;
import com.squareup.protos.franklin.common.RequestContext;
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

/* loaded from: classes.dex */
public final class RegisterEmailRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RegisterEmailRequest> CREATOR;
    public final String account_id;
    public final DeviceLocationHeuristics device_location_heuristics;
    public final String email_address;
    public final String enrollment_token;
    public final Boolean existing_customer_only;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final Scenario scenario;

    /* loaded from: classes8.dex */
    public enum Scenario implements WireEnum {
        ONBOARDING(0),
        PROFILE(1);

        public static final RegisterEmailRequest$Scenario$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            Scenario scenario = ONBOARDING;
            Companion = new TextSize.Companion();
            ADAPTER = new RegisterEmailRequest$Scenario$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Scenario.class), Syntax.PROTO_2, scenario);
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
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RegisterEmailRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.RegisterEmailRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RegisterEmailRequest((RequestContext) obj, (String) obj2, (RegisterEmailRequest.Scenario) obj3, m, (Boolean) obj4, (String) obj5, (DeviceLocationHeuristics) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 3:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                obj3 = RegisterEmailRequest.Scenario.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            obj4 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        case 9:
                            obj6 = TransactorKt.decodeMessageOrMerge(DeviceLocationHeuristics.ADAPTER, protoReader, obj6);
                            break;
                        case 10:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RegisterEmailRequest registerEmailRequest = (RegisterEmailRequest) obj;
                reverseProtoWriter.getClass();
                registerEmailRequest.getClass();
                reverseProtoWriter.writeBytes(registerEmailRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 10, registerEmailRequest.account_id);
                DeviceLocationHeuristics.ADAPTER.encodeWithTag(reverseProtoWriter, 9, registerEmailRequest.device_location_heuristics);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, registerEmailRequest.enrollment_token);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, registerEmailRequest.existing_customer_only);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, registerEmailRequest.payment_tokens);
                RegisterEmailRequest.Scenario.ADAPTER.encodeWithTag(reverseProtoWriter, 4, registerEmailRequest.scenario);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, registerEmailRequest.email_address);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 8, registerEmailRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RegisterEmailRequest registerEmailRequest = (RegisterEmailRequest) obj;
                registerEmailRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(8, registerEmailRequest.request_context) + registerEmailRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(10, registerEmailRequest.account_id) + DeviceLocationHeuristics.ADAPTER.encodedSizeWithTag(9, registerEmailRequest.device_location_heuristics) + protoAdapter2.encodedSizeWithTag(7, registerEmailRequest.enrollment_token) + ProtoAdapter.BOOL.encodedSizeWithTag(6, registerEmailRequest.existing_customer_only) + protoAdapter2.asRepeated().encodedSizeWithTag(5, registerEmailRequest.payment_tokens) + RegisterEmailRequest.Scenario.ADAPTER.encodedSizeWithTag(4, registerEmailRequest.scenario) + protoAdapter2.encodedSizeWithTag(3, registerEmailRequest.email_address) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RegisterEmailRequest registerEmailRequest = (RegisterEmailRequest) obj;
                registerEmailRequest.getClass();
                RequestContext requestContext = registerEmailRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                DeviceLocationHeuristics deviceLocationHeuristics = registerEmailRequest.device_location_heuristics;
                return RegisterEmailRequest.copy$default(registerEmailRequest, requestContext2, emptyList, deviceLocationHeuristics != null ? (DeviceLocationHeuristics) DeviceLocationHeuristics.ADAPTER.redact(deviceLocationHeuristics) : null, ByteString.EMPTY, 20);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RegisterEmailRequest registerEmailRequest = (RegisterEmailRequest) obj;
                registerEmailRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 8, registerEmailRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 3, registerEmailRequest.email_address);
                RegisterEmailRequest.Scenario.ADAPTER.encodeWithTag(protoWriter, 4, registerEmailRequest.scenario);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, registerEmailRequest.payment_tokens);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, registerEmailRequest.existing_customer_only);
                protoAdapter2.encodeWithTag(protoWriter, 7, registerEmailRequest.enrollment_token);
                DeviceLocationHeuristics.ADAPTER.encodeWithTag(protoWriter, 9, registerEmailRequest.device_location_heuristics);
                protoAdapter2.encodeWithTag(protoWriter, 10, registerEmailRequest.account_id);
                protoWriter.writeBytes(registerEmailRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterEmailRequest(RequestContext requestContext, String str, Scenario scenario, List list, Boolean bool, String str2, DeviceLocationHeuristics deviceLocationHeuristics, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.email_address = str;
        this.scenario = scenario;
        this.existing_customer_only = bool;
        this.enrollment_token = str2;
        this.device_location_heuristics = deviceLocationHeuristics;
        this.account_id = str3;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.List] */
    public static RegisterEmailRequest copy$default(RegisterEmailRequest registerEmailRequest, RequestContext requestContext, EmptyList emptyList, DeviceLocationHeuristics deviceLocationHeuristics, ByteString byteString, int i) {
        String str = (i & 2) != 0 ? registerEmailRequest.email_address : null;
        Scenario scenario = registerEmailRequest.scenario;
        EmptyList emptyList2 = emptyList;
        if ((i & 8) != 0) {
            emptyList2 = registerEmailRequest.payment_tokens;
        }
        EmptyList emptyList3 = emptyList2;
        Boolean bool = registerEmailRequest.existing_customer_only;
        String str2 = (i & 32) != 0 ? registerEmailRequest.enrollment_token : null;
        DeviceLocationHeuristics deviceLocationHeuristics2 = (i & 64) != 0 ? registerEmailRequest.device_location_heuristics : deviceLocationHeuristics;
        String str3 = (i & 128) != 0 ? registerEmailRequest.account_id : null;
        ByteString unknownFields = (i & 256) != 0 ? registerEmailRequest.unknownFields() : byteString;
        registerEmailRequest.getClass();
        emptyList3.getClass();
        unknownFields.getClass();
        return new RegisterEmailRequest(requestContext, str, scenario, emptyList3, bool, str2, deviceLocationHeuristics2, str3, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisterEmailRequest)) {
            return false;
        }
        RegisterEmailRequest registerEmailRequest = (RegisterEmailRequest) obj;
        return Intrinsics.areEqual(unknownFields(), registerEmailRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, registerEmailRequest.request_context) && Intrinsics.areEqual(this.email_address, registerEmailRequest.email_address) && this.scenario == registerEmailRequest.scenario && Intrinsics.areEqual(this.payment_tokens, registerEmailRequest.payment_tokens) && Intrinsics.areEqual(this.existing_customer_only, registerEmailRequest.existing_customer_only) && Intrinsics.areEqual(this.enrollment_token, registerEmailRequest.enrollment_token) && Intrinsics.areEqual(this.device_location_heuristics, registerEmailRequest.device_location_heuristics) && Intrinsics.areEqual(this.account_id, registerEmailRequest.account_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.email_address;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Scenario scenario = this.scenario;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (scenario != null ? scenario.hashCode() : 0)) * 37, 37, this.payment_tokens);
        Boolean bool = this.existing_customer_only;
        int hashCode4 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str2 = this.enrollment_token;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        DeviceLocationHeuristics deviceLocationHeuristics = this.device_location_heuristics;
        int hashCode6 = (hashCode5 + (deviceLocationHeuristics != null ? deviceLocationHeuristics.hashCode() : 0)) * 37;
        String str3 = this.account_id;
        int hashCode7 = hashCode6 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(22);
        builder.client_route = this.request_context;
        builder.category = this.email_address;
        builder.url = this.scenario;
        builder.owner_token = this.payment_tokens;
        builder.version_data = this.existing_customer_only;
        builder.token = this.enrollment_token;
        builder.localizable_title = this.device_location_heuristics;
        builder.title = this.account_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.email_address != null) {
            arrayList.add("email_address=██");
        }
        Scenario scenario = this.scenario;
        if (scenario != null) {
            arrayList.add("scenario=" + scenario);
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        Boolean bool = this.existing_customer_only;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("existing_customer_only=", bool, arrayList);
        }
        if (this.enrollment_token != null) {
            arrayList.add("enrollment_token=██");
        }
        DeviceLocationHeuristics deviceLocationHeuristics = this.device_location_heuristics;
        if (deviceLocationHeuristics != null) {
            arrayList.add("device_location_heuristics=" + deviceLocationHeuristics);
        }
        if (this.account_id != null) {
            arrayList.add("account_id=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RegisterEmailRequest{", "}", 0, null, null, 56);
    }
}
