package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
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
public final class UpdateDisclosureAcceptanceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateDisclosureAcceptanceRequest> CREATOR;
    public final DisclosureAction action;
    public final String disclosure_token;
    public final String locale;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateDisclosureAcceptanceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashcustomerprofile.api.v1.UpdateDisclosureAcceptanceRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new UpdateDisclosureAcceptanceRequest((String) obj, (String) obj2, (DisclosureAction) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = DisclosureAction.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateDisclosureAcceptanceRequest updateDisclosureAcceptanceRequest = (UpdateDisclosureAcceptanceRequest) obj;
                reverseProtoWriter.getClass();
                updateDisclosureAcceptanceRequest.getClass();
                reverseProtoWriter.writeBytes(updateDisclosureAcceptanceRequest.unknownFields());
                DisclosureAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, updateDisclosureAcceptanceRequest.action);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, updateDisclosureAcceptanceRequest.disclosure_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, updateDisclosureAcceptanceRequest.locale);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateDisclosureAcceptanceRequest updateDisclosureAcceptanceRequest = (UpdateDisclosureAcceptanceRequest) obj;
                updateDisclosureAcceptanceRequest.getClass();
                int size$okio = updateDisclosureAcceptanceRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return DisclosureAction.ADAPTER.encodedSizeWithTag(3, updateDisclosureAcceptanceRequest.action) + protoAdapter2.encodedSizeWithTag(2, updateDisclosureAcceptanceRequest.disclosure_token) + protoAdapter2.encodedSizeWithTag(1, updateDisclosureAcceptanceRequest.locale) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateDisclosureAcceptanceRequest updateDisclosureAcceptanceRequest = (UpdateDisclosureAcceptanceRequest) obj;
                updateDisclosureAcceptanceRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = updateDisclosureAcceptanceRequest.locale;
                String str2 = updateDisclosureAcceptanceRequest.disclosure_token;
                DisclosureAction disclosureAction = updateDisclosureAcceptanceRequest.action;
                byteString.getClass();
                return new UpdateDisclosureAcceptanceRequest(str, str2, disclosureAction, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateDisclosureAcceptanceRequest updateDisclosureAcceptanceRequest = (UpdateDisclosureAcceptanceRequest) obj;
                updateDisclosureAcceptanceRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, updateDisclosureAcceptanceRequest.locale);
                protoAdapter2.encodeWithTag(protoWriter, 2, updateDisclosureAcceptanceRequest.disclosure_token);
                DisclosureAction.ADAPTER.encodeWithTag(protoWriter, 3, updateDisclosureAcceptanceRequest.action);
                protoWriter.writeBytes(updateDisclosureAcceptanceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateDisclosureAcceptanceRequest(String str, String str2, DisclosureAction disclosureAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.locale = str;
        this.disclosure_token = str2;
        this.action = disclosureAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateDisclosureAcceptanceRequest)) {
            return false;
        }
        UpdateDisclosureAcceptanceRequest updateDisclosureAcceptanceRequest = (UpdateDisclosureAcceptanceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateDisclosureAcceptanceRequest.unknownFields()) && Intrinsics.areEqual(this.locale, updateDisclosureAcceptanceRequest.locale) && Intrinsics.areEqual(this.disclosure_token, updateDisclosureAcceptanceRequest.disclosure_token) && this.action == updateDisclosureAcceptanceRequest.action;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.locale;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.disclosure_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        DisclosureAction disclosureAction = this.action;
        int hashCode4 = hashCode3 + (disclosureAction != null ? disclosureAction.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(5);
        builder.title = this.locale;
        builder.subtitle = this.disclosure_token;
        builder.action = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.locale;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "locale=", arrayList);
        }
        String str2 = this.disclosure_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "disclosure_token=", arrayList);
        }
        DisclosureAction disclosureAction = this.action;
        if (disclosureAction != null) {
            arrayList.add("action=" + disclosureAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateDisclosureAcceptanceRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ UpdateDisclosureAcceptanceRequest(String str, String str2, int i) {
        this(str, (i & 2) != 0 ? null : str2, DisclosureAction.ACCEPT, ByteString.EMPTY);
    }
}
