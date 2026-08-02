package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class VerifyQrCodeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyQrCodeRequest> CREATOR;
    public final Boolean missing_qr_code_to_locate_cvv;
    public final String qr_code_data;
    public final RequestContext request_context;
    public final Boolean skip_blocker;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(VerifyQrCodeRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.VerifyQrCodeRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new VerifyQrCodeRequest((RequestContext) obj, (String) obj2, (Boolean) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                VerifyQrCodeRequest verifyQrCodeRequest = (VerifyQrCodeRequest) obj;
                reverseProtoWriter.getClass();
                verifyQrCodeRequest.getClass();
                reverseProtoWriter.writeBytes(verifyQrCodeRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, verifyQrCodeRequest.skip_blocker);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, verifyQrCodeRequest.missing_qr_code_to_locate_cvv);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, verifyQrCodeRequest.qr_code_data);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, verifyQrCodeRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                VerifyQrCodeRequest verifyQrCodeRequest = (VerifyQrCodeRequest) obj;
                verifyQrCodeRequest.getClass();
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, verifyQrCodeRequest.qr_code_data) + RequestContext.ADAPTER.encodedSizeWithTag(2, verifyQrCodeRequest.request_context) + verifyQrCodeRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                return protoAdapter2.encodedSizeWithTag(4, verifyQrCodeRequest.skip_blocker) + protoAdapter2.encodedSizeWithTag(3, verifyQrCodeRequest.missing_qr_code_to_locate_cvv) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                VerifyQrCodeRequest verifyQrCodeRequest = (VerifyQrCodeRequest) obj;
                verifyQrCodeRequest.getClass();
                RequestContext requestContext = verifyQrCodeRequest.request_context;
                return VerifyQrCodeRequest.copy$default(verifyQrCodeRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, null, null, ByteString.EMPTY, 12);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                VerifyQrCodeRequest verifyQrCodeRequest = (VerifyQrCodeRequest) obj;
                verifyQrCodeRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, verifyQrCodeRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, verifyQrCodeRequest.qr_code_data);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(protoWriter, 3, verifyQrCodeRequest.missing_qr_code_to_locate_cvv);
                protoAdapter2.encodeWithTag(protoWriter, 4, verifyQrCodeRequest.skip_blocker);
                protoWriter.writeBytes(verifyQrCodeRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyQrCodeRequest(RequestContext requestContext, String str, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.qr_code_data = str;
        this.missing_qr_code_to_locate_cvv = bool;
        this.skip_blocker = bool2;
    }

    public static VerifyQrCodeRequest copy$default(VerifyQrCodeRequest verifyQrCodeRequest, RequestContext requestContext, String str, Boolean bool, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            requestContext = verifyQrCodeRequest.request_context;
        }
        RequestContext requestContext2 = requestContext;
        if ((i & 2) != 0) {
            str = verifyQrCodeRequest.qr_code_data;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            bool = verifyQrCodeRequest.missing_qr_code_to_locate_cvv;
        }
        Boolean bool2 = bool;
        Boolean bool3 = verifyQrCodeRequest.skip_blocker;
        if ((i & 16) != 0) {
            byteString = verifyQrCodeRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        verifyQrCodeRequest.getClass();
        byteString2.getClass();
        return new VerifyQrCodeRequest(requestContext2, str2, bool2, bool3, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyQrCodeRequest)) {
            return false;
        }
        VerifyQrCodeRequest verifyQrCodeRequest = (VerifyQrCodeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), verifyQrCodeRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, verifyQrCodeRequest.request_context) && Intrinsics.areEqual(this.qr_code_data, verifyQrCodeRequest.qr_code_data) && Intrinsics.areEqual(this.missing_qr_code_to_locate_cvv, verifyQrCodeRequest.missing_qr_code_to_locate_cvv) && Intrinsics.areEqual(this.skip_blocker, verifyQrCodeRequest.skip_blocker);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.qr_code_data;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.missing_qr_code_to_locate_cvv;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.skip_blocker;
        int hashCode5 = hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(18);
        builder.button_color = this.request_context;
        builder.text_color = this.qr_code_data;
        builder.text = this.missing_qr_code_to_locate_cvv;
        builder.action = this.skip_blocker;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.qr_code_data != null) {
            arrayList.add("qr_code_data=██");
        }
        Boolean bool = this.missing_qr_code_to_locate_cvv;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("missing_qr_code_to_locate_cvv=", bool, arrayList);
        }
        Boolean bool2 = this.skip_blocker;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_blocker=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyQrCodeRequest{", "}", 0, null, null, 56);
    }
}
