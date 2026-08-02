package com.squareup.protos.cash.tax;

import android.os.Parcelable;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tax.TaxWebBridgeEvent;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Builder;", "", "id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Event;", BreadcrumbHelper.Category.EVENT, "Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Event;", "Companion", "Builder", "Event", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaxWebBridgeEvent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TaxWebBridgeEvent> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final Event event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent;", "<init>", "()V", "id", "", BreadcrumbHelper.Category.EVENT, "Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Event;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Event event;
        public String id;

        @Override // com.squareup.wire.Message.Builder
        public TaxWebBridgeEvent build() {
            return new TaxWebBridgeEvent(this.id, this.event, buildUnknownFields());
        }

        public final Builder event(Event event) {
            this.event = event;
            return this;
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TaxWebBridgeEvent.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.tax.TaxWebBridgeEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeEvent decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                TaxWebBridgeEvent.Event event = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TaxWebBridgeEvent((String) obj, event, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        event = new TaxWebBridgeEvent.Event.Request((TaxWebBridgeRequest) TaxWebBridgeRequest.ADAPTER.decode(reader));
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        event = new TaxWebBridgeEvent.Event.Response((TaxWebBridgeResponse) TaxWebBridgeResponse.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxWebBridgeEvent value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
                TaxWebBridgeEvent.Event event = value.event;
                if (event instanceof TaxWebBridgeEvent.Event.Request) {
                    TaxWebBridgeRequest.ADAPTER.encodeWithTag(writer, 2, ((TaxWebBridgeEvent.Event.Request) event).getValue());
                } else if (event instanceof TaxWebBridgeEvent.Event.Response) {
                    TaxWebBridgeResponse.ADAPTER.encodeWithTag(writer, 3, ((TaxWebBridgeEvent.Event.Response) event).getValue());
                } else if (event != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxWebBridgeEvent value) {
                value.getClass();
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) + value.unknownFields().getSize$okio();
                TaxWebBridgeEvent.Event event = value.event;
                if (event instanceof TaxWebBridgeEvent.Event.Request) {
                    return TaxWebBridgeRequest.ADAPTER.encodedSizeWithTag(2, ((TaxWebBridgeEvent.Event.Request) event).getValue()) + encodedSizeWithTag;
                }
                if (event instanceof TaxWebBridgeEvent.Event.Response) {
                    return TaxWebBridgeResponse.ADAPTER.encodedSizeWithTag(3, ((TaxWebBridgeEvent.Event.Response) event).getValue()) + encodedSizeWithTag;
                }
                if (event == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeEvent redact(TaxWebBridgeEvent value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.id;
                TaxWebBridgeEvent.Event event = value.event;
                value.getClass();
                byteString.getClass();
                return new TaxWebBridgeEvent(str, event, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxWebBridgeEvent value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                TaxWebBridgeEvent.Event event = value.event;
                if (event instanceof TaxWebBridgeEvent.Event.Request) {
                    TaxWebBridgeRequest.ADAPTER.encodeWithTag(writer, 2, ((TaxWebBridgeEvent.Event.Request) event).getValue());
                } else if (event instanceof TaxWebBridgeEvent.Event.Response) {
                    TaxWebBridgeResponse.ADAPTER.encodeWithTag(writer, 3, ((TaxWebBridgeEvent.Event.Response) event).getValue());
                } else if (event != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebBridgeEvent(String str, Event event, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.event = event;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaxWebBridgeEvent)) {
            return false;
        }
        TaxWebBridgeEvent taxWebBridgeEvent = (TaxWebBridgeEvent) obj;
        return Intrinsics.areEqual(unknownFields(), taxWebBridgeEvent.unknownFields()) && Intrinsics.areEqual(this.id, taxWebBridgeEvent.id) && Intrinsics.areEqual(this.event, taxWebBridgeEvent.event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Event event = this.event;
        int hashCode3 = hashCode2 + (event != null ? event.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.event = this.event;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        Event event = this.event;
        if (event != null) {
            arrayList.add("event=" + event);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxWebBridgeEvent{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Builder;", "", "body", "Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TaxWebBridgeEvent build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Event;", "", "<init>", "()V", "Request", "Response", "Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Event$Request;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Event$Response;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Event {

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeRequest#ADAPTER", declaredName = "request", tag = 2)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Event$Request;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Event;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Request extends Event {
            private final TaxWebBridgeRequest value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Request(TaxWebBridgeRequest taxWebBridgeRequest) {
                super(null);
                taxWebBridgeRequest.getClass();
                this.value = taxWebBridgeRequest;
            }

            public static /* synthetic */ Request copy$default(Request request, TaxWebBridgeRequest taxWebBridgeRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeRequest = request.value;
                }
                return request.copy(taxWebBridgeRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeRequest getValue() {
                return this.value;
            }

            public final Request copy(TaxWebBridgeRequest value) {
                value.getClass();
                return new Request(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Request) && Intrinsics.areEqual(this.value, ((Request) other).value);
            }

            public final TaxWebBridgeRequest getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Request(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeResponse#ADAPTER", declaredName = "response", tag = 3)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Event$Response;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeEvent$Event;", "value", "Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse;", "<init>", "(Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse;)V", "getValue", "()Lcom/squareup/protos/cash/tax/TaxWebBridgeResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Response extends Event {
            private final TaxWebBridgeResponse value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Response(TaxWebBridgeResponse taxWebBridgeResponse) {
                super(null);
                taxWebBridgeResponse.getClass();
                this.value = taxWebBridgeResponse;
            }

            public static /* synthetic */ Response copy$default(Response response, TaxWebBridgeResponse taxWebBridgeResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxWebBridgeResponse = response.value;
                }
                return response.copy(taxWebBridgeResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final TaxWebBridgeResponse getValue() {
                return this.value;
            }

            public final Response copy(TaxWebBridgeResponse value) {
                value.getClass();
                return new Response(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Response) && Intrinsics.areEqual(this.value, ((Response) other).value);
            }

            public final TaxWebBridgeResponse getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Response(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Event() {
        }
    }

    public /* synthetic */ TaxWebBridgeEvent(String str, Event event) {
        this(str, event, ByteString.EMPTY);
    }
}
