package com.squareup.protos.franklin.support;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.person.Alias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CreateSupportCaseRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateSupportCaseRequest> CREATOR;
    public final SupportContactType contact_type;
    public final String current_node_token;
    public final String email_address;
    public final String entity_id;
    public final String message;
    public final String phone_number;
    public final Boolean terms_accepted;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CreateSupportCaseRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.support.CreateSupportCaseRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
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
                        return new CreateSupportCaseRequest((String) obj, (String) obj2, (SupportContactType) obj3, (String) obj4, (String) obj5, (String) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag != 9) {
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                try {
                                    obj3 = SupportContactType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                obj4 = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                obj5 = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                obj6 = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                protoReader.readUnknownField(nextTag);
                                break;
                        }
                    } else {
                        obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CreateSupportCaseRequest createSupportCaseRequest = (CreateSupportCaseRequest) obj;
                reverseProtoWriter.getClass();
                createSupportCaseRequest.getClass();
                reverseProtoWriter.writeBytes(createSupportCaseRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, createSupportCaseRequest.terms_accepted);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, createSupportCaseRequest.message);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, createSupportCaseRequest.phone_number);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, createSupportCaseRequest.email_address);
                SupportContactType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, createSupportCaseRequest.contact_type);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, createSupportCaseRequest.entity_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, createSupportCaseRequest.current_node_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CreateSupportCaseRequest createSupportCaseRequest = (CreateSupportCaseRequest) obj;
                createSupportCaseRequest.getClass();
                int size$okio = createSupportCaseRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.BOOL.encodedSizeWithTag(9, createSupportCaseRequest.terms_accepted) + protoAdapter2.encodedSizeWithTag(6, createSupportCaseRequest.message) + protoAdapter2.encodedSizeWithTag(5, createSupportCaseRequest.phone_number) + protoAdapter2.encodedSizeWithTag(4, createSupportCaseRequest.email_address) + SupportContactType.ADAPTER.encodedSizeWithTag(3, createSupportCaseRequest.contact_type) + protoAdapter2.encodedSizeWithTag(2, createSupportCaseRequest.entity_id) + protoAdapter2.encodedSizeWithTag(1, createSupportCaseRequest.current_node_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CreateSupportCaseRequest createSupportCaseRequest = (CreateSupportCaseRequest) obj;
                createSupportCaseRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = createSupportCaseRequest.current_node_token;
                String str2 = createSupportCaseRequest.entity_id;
                SupportContactType supportContactType = createSupportCaseRequest.contact_type;
                Boolean bool = createSupportCaseRequest.terms_accepted;
                byteString.getClass();
                return new CreateSupportCaseRequest(str, str2, supportContactType, null, null, null, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CreateSupportCaseRequest createSupportCaseRequest = (CreateSupportCaseRequest) obj;
                createSupportCaseRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, createSupportCaseRequest.current_node_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, createSupportCaseRequest.entity_id);
                SupportContactType.ADAPTER.encodeWithTag(protoWriter, 3, createSupportCaseRequest.contact_type);
                protoAdapter2.encodeWithTag(protoWriter, 4, createSupportCaseRequest.email_address);
                protoAdapter2.encodeWithTag(protoWriter, 5, createSupportCaseRequest.phone_number);
                protoAdapter2.encodeWithTag(protoWriter, 6, createSupportCaseRequest.message);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, createSupportCaseRequest.terms_accepted);
                protoWriter.writeBytes(createSupportCaseRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSupportCaseRequest(String str, String str2, SupportContactType supportContactType, String str3, String str4, String str5, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.current_node_token = str;
        this.entity_id = str2;
        this.contact_type = supportContactType;
        this.email_address = str3;
        this.phone_number = str4;
        this.message = str5;
        this.terms_accepted = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateSupportCaseRequest)) {
            return false;
        }
        CreateSupportCaseRequest createSupportCaseRequest = (CreateSupportCaseRequest) obj;
        return Intrinsics.areEqual(unknownFields(), createSupportCaseRequest.unknownFields()) && Intrinsics.areEqual(this.current_node_token, createSupportCaseRequest.current_node_token) && Intrinsics.areEqual(this.entity_id, createSupportCaseRequest.entity_id) && this.contact_type == createSupportCaseRequest.contact_type && Intrinsics.areEqual(this.email_address, createSupportCaseRequest.email_address) && Intrinsics.areEqual(this.phone_number, createSupportCaseRequest.phone_number) && Intrinsics.areEqual(this.message, createSupportCaseRequest.message) && Intrinsics.areEqual(this.terms_accepted, createSupportCaseRequest.terms_accepted);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.current_node_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.entity_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        SupportContactType supportContactType = this.contact_type;
        int hashCode4 = (hashCode3 + (supportContactType != null ? supportContactType.hashCode() : 0)) * 37;
        String str3 = this.email_address;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.phone_number;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.message;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.terms_accepted;
        int hashCode8 = hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(18, false);
        builder.scope = this.current_node_token;
        builder.value = this.entity_id;
        builder.f1407type = this.contact_type;
        builder.first_verified_at_ms = this.email_address;
        builder.last_verified_at_ms = this.phone_number;
        builder.created_at = this.message;
        builder.updated_at = this.terms_accepted;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.current_node_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "current_node_token=", arrayList);
        }
        String str2 = this.entity_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "entity_id=", arrayList);
        }
        SupportContactType supportContactType = this.contact_type;
        if (supportContactType != null) {
            arrayList.add("contact_type=" + supportContactType);
        }
        if (this.email_address != null) {
            arrayList.add("email_address=██");
        }
        if (this.phone_number != null) {
            arrayList.add("phone_number=██");
        }
        if (this.message != null) {
            arrayList.add("message=██");
        }
        Boolean bool = this.terms_accepted;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("terms_accepted=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateSupportCaseRequest{", "}", 0, null, null, 56);
    }
}
