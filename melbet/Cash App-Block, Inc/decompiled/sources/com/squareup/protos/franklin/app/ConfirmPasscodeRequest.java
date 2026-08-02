package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.common.RequestContext;
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

/* loaded from: classes.dex */
public final class ConfirmPasscodeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ConfirmPasscodeRequest> CREATOR;
    public final InstrumentSelection instrument_selection;
    public final String passcode;
    public final String passcode_token;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final String transfer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmPasscodeRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.ConfirmPasscodeRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ConfirmPasscodeRequest((RequestContext) obj, (String) obj2, m, (String) obj3, (InstrumentSelection) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 4:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            obj4 = TransactorKt.decodeMessageOrMerge(InstrumentSelection.ADAPTER, protoReader, obj4);
                            break;
                        case 8:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ConfirmPasscodeRequest confirmPasscodeRequest = (ConfirmPasscodeRequest) obj;
                reverseProtoWriter.getClass();
                confirmPasscodeRequest.getClass();
                reverseProtoWriter.writeBytes(confirmPasscodeRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, confirmPasscodeRequest.transfer_token);
                InstrumentSelection.ADAPTER.encodeWithTag(reverseProtoWriter, 7, confirmPasscodeRequest.instrument_selection);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, confirmPasscodeRequest.passcode_token);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, confirmPasscodeRequest.payment_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, confirmPasscodeRequest.passcode);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 9, confirmPasscodeRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ConfirmPasscodeRequest confirmPasscodeRequest = (ConfirmPasscodeRequest) obj;
                confirmPasscodeRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(9, confirmPasscodeRequest.request_context) + confirmPasscodeRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(8, confirmPasscodeRequest.transfer_token) + InstrumentSelection.ADAPTER.encodedSizeWithTag(7, confirmPasscodeRequest.instrument_selection) + protoAdapter2.encodedSizeWithTag(6, confirmPasscodeRequest.passcode_token) + protoAdapter2.asRepeated().encodedSizeWithTag(5, confirmPasscodeRequest.payment_tokens) + protoAdapter2.encodedSizeWithTag(4, confirmPasscodeRequest.passcode) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ConfirmPasscodeRequest confirmPasscodeRequest = (ConfirmPasscodeRequest) obj;
                confirmPasscodeRequest.getClass();
                RequestContext requestContext = confirmPasscodeRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                InstrumentSelection instrumentSelection = confirmPasscodeRequest.instrument_selection;
                InstrumentSelection instrumentSelection2 = instrumentSelection != null ? (InstrumentSelection) InstrumentSelection.ADAPTER.redact(instrumentSelection) : null;
                ByteString byteString = ByteString.EMPTY;
                emptyList.getClass();
                byteString.getClass();
                return new ConfirmPasscodeRequest(requestContext2, (String) null, emptyList, (String) null, instrumentSelection2, (String) null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ConfirmPasscodeRequest confirmPasscodeRequest = (ConfirmPasscodeRequest) obj;
                confirmPasscodeRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 9, confirmPasscodeRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 4, confirmPasscodeRequest.passcode);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, confirmPasscodeRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 6, confirmPasscodeRequest.passcode_token);
                InstrumentSelection.ADAPTER.encodeWithTag(protoWriter, 7, confirmPasscodeRequest.instrument_selection);
                protoAdapter2.encodeWithTag(protoWriter, 8, confirmPasscodeRequest.transfer_token);
                protoWriter.writeBytes(confirmPasscodeRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public ConfirmPasscodeRequest(RequestContext requestContext, String str, List list, String str2, InstrumentSelection instrumentSelection, String str3, int i) {
        this((i & 1) != 0 ? null : requestContext, (i & 2) != 0 ? null : str, (i & 4) != 0 ? EmptyList.INSTANCE : list, str2, (i & 16) != 0 ? null : instrumentSelection, (i & 32) != 0 ? null : str3, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfirmPasscodeRequest)) {
            return false;
        }
        ConfirmPasscodeRequest confirmPasscodeRequest = (ConfirmPasscodeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), confirmPasscodeRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, confirmPasscodeRequest.request_context) && Intrinsics.areEqual(this.passcode, confirmPasscodeRequest.passcode) && Intrinsics.areEqual(this.payment_tokens, confirmPasscodeRequest.payment_tokens) && Intrinsics.areEqual(this.passcode_token, confirmPasscodeRequest.passcode_token) && Intrinsics.areEqual(this.instrument_selection, confirmPasscodeRequest.instrument_selection) && Intrinsics.areEqual(this.transfer_token, confirmPasscodeRequest.transfer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.passcode;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.payment_tokens);
        String str2 = this.passcode_token;
        int hashCode3 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        InstrumentSelection instrumentSelection = this.instrument_selection;
        int hashCode4 = (hashCode3 + (instrumentSelection != null ? instrumentSelection.hashCode() : 0)) * 37;
        String str3 = this.transfer_token;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(12);
        builder.url = this.request_context;
        builder.category = this.passcode;
        builder.owner_token = this.payment_tokens;
        builder.token = this.passcode_token;
        builder.document_date = this.instrument_selection;
        builder.title = this.transfer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.passcode != null) {
            arrayList.add("passcode=██");
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        InstrumentSelection instrumentSelection = this.instrument_selection;
        if (instrumentSelection != null) {
            arrayList.add("instrument_selection=" + instrumentSelection);
        }
        if (this.transfer_token != null) {
            arrayList.add("transfer_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmPasscodeRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmPasscodeRequest(RequestContext requestContext, String str, List list, String str2, InstrumentSelection instrumentSelection, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.passcode = str;
        this.passcode_token = str2;
        this.instrument_selection = instrumentSelection;
        this.transfer_token = str3;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }
}
