package com.squareup.protos.cash.cdpproxy.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cdpproxy.api.AnalyticsMessage;
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
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Builder;", "Lcom/squareup/protos/cash/cdpproxy/api/MessageContext;", "context", "Lcom/squareup/protos/cash/cdpproxy/api/MessageContext;", "", "message_uuid", "Ljava/lang/String;", "customer_token", "app_token", "", "timestamp_since_epoch_millis", "Ljava/lang/Long;", "Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Payload;", "payload", "Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Payload;", "interactivity_session_id", "apps_flyer_id", "received_at_since_epoch_millis", "Lcom/squareup/protos/cash/cdpproxy/api/ProxyAppendedFields;", "proxy_appended_fields", "Lcom/squareup/protos/cash/cdpproxy/api/ProxyAppendedFields;", "Companion", "Builder", "Payload", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnalyticsMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AnalyticsMessage> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
    public final String app_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 10)
    public final String apps_flyer_id;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.MessageContext#ADAPTER", schemaIndex = 0, tag = 1)
    public final MessageContext context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
    public final String customer_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String interactivity_session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String message_uuid;

    @WireSealedOneof(schemaIndex = 5)
    public final Payload payload;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.ProxyAppendedFields#ADAPTER", schemaIndex = 9, tag = IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO)
    public final ProxyAppendedFields proxy_appended_fields;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 8, tag = IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO)
    public final Long received_at_since_epoch_millis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 4, tag = 5)
    public final Long timestamp_since_epoch_millis;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\bJ\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage;", "<init>", "()V", "context", "Lcom/squareup/protos/cash/cdpproxy/api/MessageContext;", "message_uuid", "", "customer_token", "app_token", "timestamp_since_epoch_millis", "", "Ljava/lang/Long;", "payload", "Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Payload;", "interactivity_session_id", "apps_flyer_id", "received_at_since_epoch_millis", "proxy_appended_fields", "Lcom/squareup/protos/cash/cdpproxy/api/ProxyAppendedFields;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public String app_token;
        public String apps_flyer_id;
        public MessageContext context;
        public String customer_token;
        public String interactivity_session_id;
        public String message_uuid;
        public Payload payload;
        public ProxyAppendedFields proxy_appended_fields;
        public Long received_at_since_epoch_millis;
        public Long timestamp_since_epoch_millis;

        public final Builder app_token(String app_token) {
            this.app_token = app_token;
            return this;
        }

        public final Builder apps_flyer_id(String apps_flyer_id) {
            this.apps_flyer_id = apps_flyer_id;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public AnalyticsMessage build() {
            return new AnalyticsMessage(this.context, this.message_uuid, this.customer_token, this.app_token, this.timestamp_since_epoch_millis, this.payload, this.interactivity_session_id, this.apps_flyer_id, this.received_at_since_epoch_millis, this.proxy_appended_fields, buildUnknownFields());
        }

        public final Builder context(MessageContext context) {
            this.context = context;
            return this;
        }

        public final Builder customer_token(String customer_token) {
            this.customer_token = customer_token;
            return this;
        }

        public final Builder interactivity_session_id(String interactivity_session_id) {
            this.interactivity_session_id = interactivity_session_id;
            return this;
        }

        public final Builder message_uuid(String message_uuid) {
            this.message_uuid = message_uuid;
            return this;
        }

        public final Builder payload(Payload payload) {
            this.payload = payload;
            return this;
        }

        public final Builder proxy_appended_fields(ProxyAppendedFields proxy_appended_fields) {
            this.proxy_appended_fields = proxy_appended_fields;
            return this;
        }

        public final Builder received_at_since_epoch_millis(Long received_at_since_epoch_millis) {
            this.received_at_since_epoch_millis = received_at_since_epoch_millis;
            return this;
        }

        public final Builder timestamp_since_epoch_millis(Long timestamp_since_epoch_millis) {
            this.timestamp_since_epoch_millis = timestamp_since_epoch_millis;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AnalyticsMessage.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cdpproxy.api.AnalyticsMessage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AnalyticsMessage decode(ProtoReader reader) {
                AnalyticsMessage.Payload identify;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                AnalyticsMessage.Payload payload = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AnalyticsMessage((MessageContext) obj, (String) obj2, (String) obj3, (String) obj4, (Long) obj5, payload, (String) obj6, (String) obj7, (Long) obj8, (ProxyAppendedFields) obj9, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 9) {
                        identify = new AnalyticsMessage.Payload.Identify((IdentifyMessage) IdentifyMessage.ADAPTER.decode(reader));
                    } else if (nextTag == 10) {
                        obj7 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 1000) {
                        obj8 = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag != 1001) {
                        switch (nextTag) {
                            case 1:
                                obj = TransactorKt.decodeMessageOrMerge(MessageContext.ADAPTER, reader, obj);
                                continue;
                            case 2:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                obj5 = ProtoAdapter.INT64.decode(reader);
                                continue;
                            case 6:
                                identify = new AnalyticsMessage.Payload.Track((TrackMessage) TrackMessage.ADAPTER.decode(reader));
                                break;
                            case 7:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(nextTag);
                                continue;
                        }
                    } else {
                        obj9 = TransactorKt.decodeMessageOrMerge(ProxyAppendedFields.ADAPTER, reader, obj9);
                    }
                    payload = identify;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AnalyticsMessage value) {
                writer.getClass();
                value.getClass();
                MessageContext.ADAPTER.encodeWithTag(writer, 1, value.context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.message_uuid);
                protoAdapter2.encodeWithTag(writer, 3, value.customer_token);
                protoAdapter2.encodeWithTag(writer, 4, value.app_token);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(writer, 5, value.timestamp_since_epoch_millis);
                protoAdapter2.encodeWithTag(writer, 7, value.interactivity_session_id);
                protoAdapter2.encodeWithTag(writer, 10, value.apps_flyer_id);
                protoAdapter3.encodeWithTag(writer, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, value.received_at_since_epoch_millis);
                ProxyAppendedFields.ADAPTER.encodeWithTag(writer, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, value.proxy_appended_fields);
                AnalyticsMessage.Payload payload = value.payload;
                if (payload instanceof AnalyticsMessage.Payload.Track) {
                    TrackMessage.ADAPTER.encodeWithTag(writer, 6, ((AnalyticsMessage.Payload.Track) payload).getValue());
                } else if (payload instanceof AnalyticsMessage.Payload.Identify) {
                    IdentifyMessage.ADAPTER.encodeWithTag(writer, 9, ((AnalyticsMessage.Payload.Identify) payload).getValue());
                } else if (payload != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AnalyticsMessage value) {
                int encodedSizeWithTag;
                value.getClass();
                int encodedSizeWithTag2 = MessageContext.ADAPTER.encodedSizeWithTag(1, value.context) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(4, value.app_token) + protoAdapter2.encodedSizeWithTag(3, value.customer_token) + protoAdapter2.encodedSizeWithTag(2, value.message_uuid) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                int encodedSizeWithTag4 = protoAdapter3.encodedSizeWithTag(5, value.timestamp_since_epoch_millis) + encodedSizeWithTag3;
                AnalyticsMessage.Payload payload = value.payload;
                if (payload instanceof AnalyticsMessage.Payload.Track) {
                    encodedSizeWithTag = TrackMessage.ADAPTER.encodedSizeWithTag(6, ((AnalyticsMessage.Payload.Track) payload).getValue());
                } else {
                    if (!(payload instanceof AnalyticsMessage.Payload.Identify)) {
                        if (payload != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return ProxyAppendedFields.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, value.proxy_appended_fields) + protoAdapter3.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, value.received_at_since_epoch_millis) + protoAdapter2.encodedSizeWithTag(10, value.apps_flyer_id) + protoAdapter2.encodedSizeWithTag(7, value.interactivity_session_id) + encodedSizeWithTag4;
                    }
                    encodedSizeWithTag = IdentifyMessage.ADAPTER.encodedSizeWithTag(9, ((AnalyticsMessage.Payload.Identify) payload).getValue());
                }
                encodedSizeWithTag4 += encodedSizeWithTag;
                return ProxyAppendedFields.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, value.proxy_appended_fields) + protoAdapter3.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, value.received_at_since_epoch_millis) + protoAdapter2.encodedSizeWithTag(10, value.apps_flyer_id) + protoAdapter2.encodedSizeWithTag(7, value.interactivity_session_id) + encodedSizeWithTag4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AnalyticsMessage redact(AnalyticsMessage value) {
                value.getClass();
                MessageContext messageContext = value.context;
                MessageContext messageContext2 = messageContext != null ? (MessageContext) MessageContext.ADAPTER.redact(messageContext) : null;
                ProxyAppendedFields proxyAppendedFields = value.proxy_appended_fields;
                return AnalyticsMessage.copy$default(value, messageContext2, null, proxyAppendedFields != null ? (ProxyAppendedFields) ProxyAppendedFields.ADAPTER.redact(proxyAppendedFields) : null, ByteString.EMPTY, 498);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AnalyticsMessage value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                AnalyticsMessage.Payload payload = value.payload;
                if (payload instanceof AnalyticsMessage.Payload.Track) {
                    TrackMessage.ADAPTER.encodeWithTag(writer, 6, ((AnalyticsMessage.Payload.Track) payload).getValue());
                } else if (payload instanceof AnalyticsMessage.Payload.Identify) {
                    IdentifyMessage.ADAPTER.encodeWithTag(writer, 9, ((AnalyticsMessage.Payload.Identify) payload).getValue());
                } else if (payload != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProxyAppendedFields.ADAPTER.encodeWithTag(writer, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, value.proxy_appended_fields);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(writer, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, value.received_at_since_epoch_millis);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 10, value.apps_flyer_id);
                protoAdapter3.encodeWithTag(writer, 7, value.interactivity_session_id);
                protoAdapter2.encodeWithTag(writer, 5, value.timestamp_since_epoch_millis);
                protoAdapter3.encodeWithTag(writer, 4, value.app_token);
                protoAdapter3.encodeWithTag(writer, 3, value.customer_token);
                protoAdapter3.encodeWithTag(writer, 2, value.message_uuid);
                MessageContext.ADAPTER.encodeWithTag(writer, 1, value.context);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsMessage(MessageContext messageContext, String str, String str2, String str3, Long l, Payload payload, String str4, String str5, Long l2, ProxyAppendedFields proxyAppendedFields, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.context = messageContext;
        this.message_uuid = str;
        this.customer_token = str2;
        this.app_token = str3;
        this.timestamp_since_epoch_millis = l;
        this.payload = payload;
        this.interactivity_session_id = str4;
        this.apps_flyer_id = str5;
        this.received_at_since_epoch_millis = l2;
        this.proxy_appended_fields = proxyAppendedFields;
    }

    public static AnalyticsMessage copy$default(AnalyticsMessage analyticsMessage, MessageContext messageContext, String str, ProxyAppendedFields proxyAppendedFields, ByteString byteString, int i) {
        MessageContext messageContext2 = (i & 1) != 0 ? analyticsMessage.context : messageContext;
        String str2 = analyticsMessage.message_uuid;
        String str3 = (i & 4) != 0 ? analyticsMessage.customer_token : null;
        Long l = analyticsMessage.timestamp_since_epoch_millis;
        Payload payload = analyticsMessage.payload;
        String str4 = analyticsMessage.interactivity_session_id;
        String str5 = analyticsMessage.apps_flyer_id;
        Long l2 = analyticsMessage.received_at_since_epoch_millis;
        ProxyAppendedFields proxyAppendedFields2 = (i & 512) != 0 ? analyticsMessage.proxy_appended_fields : proxyAppendedFields;
        ByteString unknownFields = (i & 1024) != 0 ? analyticsMessage.unknownFields() : byteString;
        unknownFields.getClass();
        return new AnalyticsMessage(messageContext2, str2, str3, str, l, payload, str4, str5, l2, proxyAppendedFields2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnalyticsMessage)) {
            return false;
        }
        AnalyticsMessage analyticsMessage = (AnalyticsMessage) obj;
        return Intrinsics.areEqual(unknownFields(), analyticsMessage.unknownFields()) && Intrinsics.areEqual(this.context, analyticsMessage.context) && Intrinsics.areEqual(this.message_uuid, analyticsMessage.message_uuid) && Intrinsics.areEqual(this.customer_token, analyticsMessage.customer_token) && Intrinsics.areEqual(this.app_token, analyticsMessage.app_token) && Intrinsics.areEqual(this.timestamp_since_epoch_millis, analyticsMessage.timestamp_since_epoch_millis) && Intrinsics.areEqual(this.payload, analyticsMessage.payload) && Intrinsics.areEqual(this.interactivity_session_id, analyticsMessage.interactivity_session_id) && Intrinsics.areEqual(this.apps_flyer_id, analyticsMessage.apps_flyer_id) && Intrinsics.areEqual(this.received_at_since_epoch_millis, analyticsMessage.received_at_since_epoch_millis) && Intrinsics.areEqual(this.proxy_appended_fields, analyticsMessage.proxy_appended_fields);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MessageContext messageContext = this.context;
        int hashCode2 = (hashCode + (messageContext != null ? messageContext.hashCode() : 0)) * 37;
        String str = this.message_uuid;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.customer_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.app_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.timestamp_since_epoch_millis;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Payload payload = this.payload;
        int hashCode7 = (hashCode6 + (payload != null ? payload.hashCode() : 0)) * 37;
        String str4 = this.interactivity_session_id;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.apps_flyer_id;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l2 = this.received_at_since_epoch_millis;
        int hashCode10 = (hashCode9 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        ProxyAppendedFields proxyAppendedFields = this.proxy_appended_fields;
        int hashCode11 = hashCode10 + (proxyAppendedFields != null ? proxyAppendedFields.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.context = this.context;
        builder.message_uuid = this.message_uuid;
        builder.customer_token = this.customer_token;
        builder.app_token = this.app_token;
        builder.timestamp_since_epoch_millis = this.timestamp_since_epoch_millis;
        builder.payload = this.payload;
        builder.interactivity_session_id = this.interactivity_session_id;
        builder.apps_flyer_id = this.apps_flyer_id;
        builder.received_at_since_epoch_millis = this.received_at_since_epoch_millis;
        builder.proxy_appended_fields = this.proxy_appended_fields;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MessageContext messageContext = this.context;
        if (messageContext != null) {
            arrayList.add("context=" + messageContext);
        }
        String str = this.message_uuid;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_uuid=", arrayList);
        }
        if (this.customer_token != null) {
            arrayList.add("customer_token=██");
        }
        if (this.app_token != null) {
            arrayList.add("app_token=██");
        }
        Long l = this.timestamp_since_epoch_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("timestamp_since_epoch_millis=", l, arrayList);
        }
        Payload payload = this.payload;
        if (payload != null) {
            arrayList.add("payload=" + payload);
        }
        String str2 = this.interactivity_session_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "interactivity_session_id=", arrayList);
        }
        String str3 = this.apps_flyer_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "apps_flyer_id=", arrayList);
        }
        Long l2 = this.received_at_since_epoch_millis;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("received_at_since_epoch_millis=", l2, arrayList);
        }
        ProxyAppendedFields proxyAppendedFields = this.proxy_appended_fields;
        if (proxyAppendedFields != null) {
            arrayList.add("proxy_appended_fields=" + proxyAppendedFields);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AnalyticsMessage{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Builder;", "", "body", "Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AnalyticsMessage build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Payload;", "", "<init>", "()V", "Track", "Identify", "Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Payload$Identify;", "Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Payload$Track;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Payload {

        @WireOneofField(adapter = "com.squareup.protos.cash.cdpproxy.api.IdentifyMessage#ADAPTER", declaredName = "identify", tag = 9)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Payload$Identify;", "Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Payload;", "value", "Lcom/squareup/protos/cash/cdpproxy/api/IdentifyMessage;", "<init>", "(Lcom/squareup/protos/cash/cdpproxy/api/IdentifyMessage;)V", "getValue", "()Lcom/squareup/protos/cash/cdpproxy/api/IdentifyMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final /* data */ class Identify extends Payload {
            private final IdentifyMessage value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Identify(IdentifyMessage identifyMessage) {
                super(null);
                identifyMessage.getClass();
                this.value = identifyMessage;
            }

            public static /* synthetic */ Identify copy$default(Identify identify, IdentifyMessage identifyMessage, int i, Object obj) {
                if ((i & 1) != 0) {
                    identifyMessage = identify.value;
                }
                return identify.copy(identifyMessage);
            }

            /* renamed from: component1, reason: from getter */
            public final IdentifyMessage getValue() {
                return this.value;
            }

            public final Identify copy(IdentifyMessage value) {
                value.getClass();
                return new Identify(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Identify) && Intrinsics.areEqual(this.value, ((Identify) other).value);
            }

            public final IdentifyMessage getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Identify(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.cdpproxy.api.TrackMessage#ADAPTER", declaredName = "track", tag = 6)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Payload$Track;", "Lcom/squareup/protos/cash/cdpproxy/api/AnalyticsMessage$Payload;", "value", "Lcom/squareup/protos/cash/cdpproxy/api/TrackMessage;", "<init>", "(Lcom/squareup/protos/cash/cdpproxy/api/TrackMessage;)V", "getValue", "()Lcom/squareup/protos/cash/cdpproxy/api/TrackMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Track extends Payload {
            private final TrackMessage value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Track(TrackMessage trackMessage) {
                super(null);
                trackMessage.getClass();
                this.value = trackMessage;
            }

            public static /* synthetic */ Track copy$default(Track track, TrackMessage trackMessage, int i, Object obj) {
                if ((i & 1) != 0) {
                    trackMessage = track.value;
                }
                return track.copy(trackMessage);
            }

            /* renamed from: component1, reason: from getter */
            public final TrackMessage getValue() {
                return this.value;
            }

            public final Track copy(TrackMessage value) {
                value.getClass();
                return new Track(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Track) && Intrinsics.areEqual(this.value, ((Track) other).value);
            }

            public final TrackMessage getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Track(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Payload(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Payload() {
        }
    }
}
