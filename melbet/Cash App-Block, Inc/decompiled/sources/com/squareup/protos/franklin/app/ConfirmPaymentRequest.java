package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
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
public final class ConfirmPaymentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ConfirmPaymentRequest> CREATOR;
    public final InstrumentSelection instrument_selection;
    public final String payment_token;
    public final List payment_tokens;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmPaymentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.ConfirmPaymentRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ConfirmPaymentRequest((RequestContext) obj, (String) obj2, m, (InstrumentSelection) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj3 = TransactorKt.decodeMessageOrMerge(InstrumentSelection.ADAPTER, protoReader, obj3);
                    } else if (nextTag == 5) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 6) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ConfirmPaymentRequest confirmPaymentRequest = (ConfirmPaymentRequest) obj;
                reverseProtoWriter.getClass();
                confirmPaymentRequest.getClass();
                reverseProtoWriter.writeBytes(confirmPaymentRequest.unknownFields());
                InstrumentSelection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, confirmPaymentRequest.instrument_selection);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, confirmPaymentRequest.payment_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, confirmPaymentRequest.payment_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, confirmPaymentRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ConfirmPaymentRequest confirmPaymentRequest = (ConfirmPaymentRequest) obj;
                confirmPaymentRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(6, confirmPaymentRequest.request_context) + confirmPaymentRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return InstrumentSelection.ADAPTER.encodedSizeWithTag(4, confirmPaymentRequest.instrument_selection) + protoAdapter2.asRepeated().encodedSizeWithTag(5, confirmPaymentRequest.payment_tokens) + protoAdapter2.encodedSizeWithTag(3, confirmPaymentRequest.payment_token) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ConfirmPaymentRequest confirmPaymentRequest = (ConfirmPaymentRequest) obj;
                confirmPaymentRequest.getClass();
                RequestContext requestContext = confirmPaymentRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                InstrumentSelection instrumentSelection = confirmPaymentRequest.instrument_selection;
                return ConfirmPaymentRequest.copy$default(confirmPaymentRequest, requestContext2, emptyList, instrumentSelection != null ? (InstrumentSelection) InstrumentSelection.ADAPTER.redact(instrumentSelection) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ConfirmPaymentRequest confirmPaymentRequest = (ConfirmPaymentRequest) obj;
                confirmPaymentRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 6, confirmPaymentRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 3, confirmPaymentRequest.payment_token);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, confirmPaymentRequest.payment_tokens);
                InstrumentSelection.ADAPTER.encodeWithTag(protoWriter, 4, confirmPaymentRequest.instrument_selection);
                protoWriter.writeBytes(confirmPaymentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmPaymentRequest(RequestContext requestContext, String str, List list, InstrumentSelection instrumentSelection, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.payment_token = str;
        this.instrument_selection = instrumentSelection;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    public static ConfirmPaymentRequest copy$default(ConfirmPaymentRequest confirmPaymentRequest, RequestContext requestContext, EmptyList emptyList, InstrumentSelection instrumentSelection, ByteString byteString, int i) {
        List list = emptyList;
        String str = confirmPaymentRequest.payment_token;
        if ((i & 4) != 0) {
            list = confirmPaymentRequest.payment_tokens;
        }
        if ((i & 8) != 0) {
            instrumentSelection = confirmPaymentRequest.instrument_selection;
        }
        if ((i & 16) != 0) {
            byteString = confirmPaymentRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        confirmPaymentRequest.getClass();
        list.getClass();
        byteString2.getClass();
        return new ConfirmPaymentRequest(requestContext, str, list, instrumentSelection, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfirmPaymentRequest)) {
            return false;
        }
        ConfirmPaymentRequest confirmPaymentRequest = (ConfirmPaymentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), confirmPaymentRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, confirmPaymentRequest.request_context) && Intrinsics.areEqual(this.payment_token, confirmPaymentRequest.payment_token) && Intrinsics.areEqual(this.payment_tokens, confirmPaymentRequest.payment_tokens) && Intrinsics.areEqual(this.instrument_selection, confirmPaymentRequest.instrument_selection);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.payment_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.payment_tokens);
        InstrumentSelection instrumentSelection = this.instrument_selection;
        int hashCode3 = m + (instrumentSelection != null ? instrumentSelection.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder();
        builder.button_color = this.request_context;
        builder.text_color = this.payment_token;
        builder.text = this.payment_tokens;
        builder.action = this.instrument_selection;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.payment_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_token=", arrayList);
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        InstrumentSelection instrumentSelection = this.instrument_selection;
        if (instrumentSelection != null) {
            arrayList.add("instrument_selection=" + instrumentSelection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmPaymentRequest{", "}", 0, null, null, 56);
    }

    public ConfirmPaymentRequest(RequestContext requestContext, List list, InstrumentSelection instrumentSelection, int i) {
        this((i & 1) != 0 ? null : requestContext, null, list, instrumentSelection, ByteString.EMPTY);
    }
}
