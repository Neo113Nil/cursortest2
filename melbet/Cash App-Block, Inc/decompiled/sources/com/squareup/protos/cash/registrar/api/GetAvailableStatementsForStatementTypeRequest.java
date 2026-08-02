package com.squareup.protos.cash.registrar.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
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
public final class GetAvailableStatementsForStatementTypeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAvailableStatementsForStatementTypeRequest> CREATOR;
    public final String customer_token;
    public final StatementType statement_type;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetAvailableStatementsForStatementTypeRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.registrar.api.GetAvailableStatementsForStatementTypeRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetAvailableStatementsForStatementTypeRequest((String) obj, (StatementType) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = StatementType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetAvailableStatementsForStatementTypeRequest getAvailableStatementsForStatementTypeRequest = (GetAvailableStatementsForStatementTypeRequest) obj;
                reverseProtoWriter.getClass();
                getAvailableStatementsForStatementTypeRequest.getClass();
                reverseProtoWriter.writeBytes(getAvailableStatementsForStatementTypeRequest.unknownFields());
                StatementType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getAvailableStatementsForStatementTypeRequest.statement_type);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getAvailableStatementsForStatementTypeRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetAvailableStatementsForStatementTypeRequest getAvailableStatementsForStatementTypeRequest = (GetAvailableStatementsForStatementTypeRequest) obj;
                getAvailableStatementsForStatementTypeRequest.getClass();
                return StatementType.ADAPTER.encodedSizeWithTag(3, getAvailableStatementsForStatementTypeRequest.statement_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, getAvailableStatementsForStatementTypeRequest.customer_token) + getAvailableStatementsForStatementTypeRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetAvailableStatementsForStatementTypeRequest getAvailableStatementsForStatementTypeRequest = (GetAvailableStatementsForStatementTypeRequest) obj;
                getAvailableStatementsForStatementTypeRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getAvailableStatementsForStatementTypeRequest.customer_token;
                StatementType statementType = getAvailableStatementsForStatementTypeRequest.statement_type;
                byteString.getClass();
                return new GetAvailableStatementsForStatementTypeRequest(str, statementType, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetAvailableStatementsForStatementTypeRequest getAvailableStatementsForStatementTypeRequest = (GetAvailableStatementsForStatementTypeRequest) obj;
                getAvailableStatementsForStatementTypeRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAvailableStatementsForStatementTypeRequest.customer_token);
                StatementType.ADAPTER.encodeWithTag(protoWriter, 3, getAvailableStatementsForStatementTypeRequest.statement_type);
                protoWriter.writeBytes(getAvailableStatementsForStatementTypeRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAvailableStatementsForStatementTypeRequest(String str, StatementType statementType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.statement_type = statementType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAvailableStatementsForStatementTypeRequest)) {
            return false;
        }
        GetAvailableStatementsForStatementTypeRequest getAvailableStatementsForStatementTypeRequest = (GetAvailableStatementsForStatementTypeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getAvailableStatementsForStatementTypeRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, getAvailableStatementsForStatementTypeRequest.customer_token) && this.statement_type == getAvailableStatementsForStatementTypeRequest.statement_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        StatementType statementType = this.statement_type;
        int hashCode3 = hashCode2 + (statementType != null ? statementType.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(28);
        builder.f1329type = this.customer_token;
        builder.use_case = this.statement_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        StatementType statementType = this.statement_type;
        if (statementType != null) {
            arrayList.add("statement_type=" + statementType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAvailableStatementsForStatementTypeRequest{", "}", 0, null, null, 56);
    }
}
