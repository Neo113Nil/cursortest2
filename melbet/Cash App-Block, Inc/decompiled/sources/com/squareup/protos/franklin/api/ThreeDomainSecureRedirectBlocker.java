package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.sca.ThreeDomainSecureRedirectUrl;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Deprecated
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/ThreeDomainSecureRedirectBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureRedirectBlocker$Builder;", "", "challenge_url", "Ljava/lang/String;", "header_title", "header_subtitle", "Lcom/squareup/protos/franklin/sca/ThreeDomainSecureRedirectUrl;", "redirect_url", "Lcom/squareup/protos/franklin/sca/ThreeDomainSecureRedirectUrl;", "spinner_message", "", "spinner_message_delay_s", "Ljava/lang/Long;", "transaction_type", "transaction_id", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThreeDomainSecureRedirectBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ThreeDomainSecureRedirectBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String challenge_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String header_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String header_title;

    @WireField(adapter = "com.squareup.protos.franklin.sca.ThreeDomainSecureRedirectUrl#ADAPTER", schemaIndex = 3, tag = 4)
    public final ThreeDomainSecureRedirectUrl redirect_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String spinner_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 5, tag = 6)
    public final Long spinner_message_delay_s;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String transaction_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String transaction_type;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/ThreeDomainSecureRedirectBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureRedirectBlocker;", "<init>", "()V", "challenge_url", "", "header_title", "header_subtitle", "redirect_url", "Lcom/squareup/protos/franklin/sca/ThreeDomainSecureRedirectUrl;", "spinner_message", "spinner_message_delay_s", "", "Ljava/lang/Long;", "transaction_type", "transaction_id", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/ThreeDomainSecureRedirectBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String challenge_url;
        public String header_subtitle;
        public String header_title;
        public ThreeDomainSecureRedirectUrl redirect_url;
        public String spinner_message;
        public Long spinner_message_delay_s;
        public String transaction_id;
        public String transaction_type;

        @Override // com.squareup.wire.Message.Builder
        public ThreeDomainSecureRedirectBlocker build() {
            return new ThreeDomainSecureRedirectBlocker(this.challenge_url, this.header_title, this.header_subtitle, this.redirect_url, this.spinner_message, this.spinner_message_delay_s, this.transaction_type, this.transaction_id, buildUnknownFields());
        }

        public final Builder challenge_url(String challenge_url) {
            this.challenge_url = challenge_url;
            return this;
        }

        public final Builder header_subtitle(String header_subtitle) {
            this.header_subtitle = header_subtitle;
            return this;
        }

        public final Builder header_title(String header_title) {
            this.header_title = header_title;
            return this;
        }

        public final Builder redirect_url(ThreeDomainSecureRedirectUrl redirect_url) {
            this.redirect_url = redirect_url;
            return this;
        }

        public final Builder spinner_message(String spinner_message) {
            this.spinner_message = spinner_message;
            return this;
        }

        public final Builder spinner_message_delay_s(Long spinner_message_delay_s) {
            this.spinner_message_delay_s = spinner_message_delay_s;
            return this;
        }

        public final Builder transaction_id(String transaction_id) {
            this.transaction_id = transaction_id;
            return this;
        }

        public final Builder transaction_type(String transaction_type) {
            this.transaction_type = transaction_type;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ThreeDomainSecureRedirectBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ThreeDomainSecureRedirectBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ThreeDomainSecureRedirectBlocker decode(ProtoReader reader) {
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
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ThreeDomainSecureRedirectBlocker((String) obj, (String) obj2, (String) obj3, (ThreeDomainSecureRedirectUrl) obj4, (String) obj5, (Long) obj6, (String) obj7, (String) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(ThreeDomainSecureRedirectUrl.ADAPTER, reader, obj4);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.INT64.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ThreeDomainSecureRedirectBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.challenge_url);
                protoAdapter2.encodeWithTag(writer, 2, value.header_title);
                protoAdapter2.encodeWithTag(writer, 3, value.header_subtitle);
                ThreeDomainSecureRedirectUrl.ADAPTER.encodeWithTag(writer, 4, value.redirect_url);
                protoAdapter2.encodeWithTag(writer, 5, value.spinner_message);
                ProtoAdapter.INT64.encodeWithTag(writer, 6, value.spinner_message_delay_s);
                protoAdapter2.encodeWithTag(writer, 7, value.transaction_type);
                protoAdapter2.encodeWithTag(writer, 8, value.transaction_id);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ThreeDomainSecureRedirectBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(8, value.transaction_id) + protoAdapter2.encodedSizeWithTag(7, value.transaction_type) + ProtoAdapter.INT64.encodedSizeWithTag(6, value.spinner_message_delay_s) + protoAdapter2.encodedSizeWithTag(5, value.spinner_message) + ThreeDomainSecureRedirectUrl.ADAPTER.encodedSizeWithTag(4, value.redirect_url) + protoAdapter2.encodedSizeWithTag(3, value.header_subtitle) + protoAdapter2.encodedSizeWithTag(2, value.header_title) + protoAdapter2.encodedSizeWithTag(1, value.challenge_url) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ThreeDomainSecureRedirectBlocker redact(ThreeDomainSecureRedirectBlocker value) {
                value.getClass();
                ThreeDomainSecureRedirectUrl threeDomainSecureRedirectUrl = value.redirect_url;
                ThreeDomainSecureRedirectUrl threeDomainSecureRedirectUrl2 = threeDomainSecureRedirectUrl != null ? (ThreeDomainSecureRedirectUrl) ThreeDomainSecureRedirectUrl.ADAPTER.redact(threeDomainSecureRedirectUrl) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.challenge_url;
                String str2 = value.header_title;
                String str3 = value.header_subtitle;
                String str4 = value.spinner_message;
                Long l = value.spinner_message_delay_s;
                String str5 = value.transaction_type;
                String str6 = value.transaction_id;
                byteString.getClass();
                return new ThreeDomainSecureRedirectBlocker(str, str2, str3, threeDomainSecureRedirectUrl2, str4, l, str5, str6, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ThreeDomainSecureRedirectBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 8, value.transaction_id);
                protoAdapter2.encodeWithTag(writer, 7, value.transaction_type);
                ProtoAdapter.INT64.encodeWithTag(writer, 6, value.spinner_message_delay_s);
                protoAdapter2.encodeWithTag(writer, 5, value.spinner_message);
                ThreeDomainSecureRedirectUrl.ADAPTER.encodeWithTag(writer, 4, value.redirect_url);
                protoAdapter2.encodeWithTag(writer, 3, value.header_subtitle);
                protoAdapter2.encodeWithTag(writer, 2, value.header_title);
                protoAdapter2.encodeWithTag(writer, 1, value.challenge_url);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDomainSecureRedirectBlocker(String str, String str2, String str3, ThreeDomainSecureRedirectUrl threeDomainSecureRedirectUrl, String str4, Long l, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.challenge_url = str;
        this.header_title = str2;
        this.header_subtitle = str3;
        this.redirect_url = threeDomainSecureRedirectUrl;
        this.spinner_message = str4;
        this.spinner_message_delay_s = l;
        this.transaction_type = str5;
        this.transaction_id = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreeDomainSecureRedirectBlocker)) {
            return false;
        }
        ThreeDomainSecureRedirectBlocker threeDomainSecureRedirectBlocker = (ThreeDomainSecureRedirectBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), threeDomainSecureRedirectBlocker.unknownFields()) && Intrinsics.areEqual(this.challenge_url, threeDomainSecureRedirectBlocker.challenge_url) && Intrinsics.areEqual(this.header_title, threeDomainSecureRedirectBlocker.header_title) && Intrinsics.areEqual(this.header_subtitle, threeDomainSecureRedirectBlocker.header_subtitle) && Intrinsics.areEqual(this.redirect_url, threeDomainSecureRedirectBlocker.redirect_url) && Intrinsics.areEqual(this.spinner_message, threeDomainSecureRedirectBlocker.spinner_message) && Intrinsics.areEqual(this.spinner_message_delay_s, threeDomainSecureRedirectBlocker.spinner_message_delay_s) && Intrinsics.areEqual(this.transaction_type, threeDomainSecureRedirectBlocker.transaction_type) && Intrinsics.areEqual(this.transaction_id, threeDomainSecureRedirectBlocker.transaction_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.challenge_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.header_title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.header_subtitle;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ThreeDomainSecureRedirectUrl threeDomainSecureRedirectUrl = this.redirect_url;
        int hashCode5 = (hashCode4 + (threeDomainSecureRedirectUrl != null ? threeDomainSecureRedirectUrl.hashCode() : 0)) * 37;
        String str4 = this.spinner_message;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l = this.spinner_message_delay_s;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str5 = this.transaction_type;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.transaction_id;
        int hashCode9 = hashCode8 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.challenge_url = this.challenge_url;
        builder.header_title = this.header_title;
        builder.header_subtitle = this.header_subtitle;
        builder.redirect_url = this.redirect_url;
        builder.spinner_message = this.spinner_message;
        builder.spinner_message_delay_s = this.spinner_message_delay_s;
        builder.transaction_type = this.transaction_type;
        builder.transaction_id = this.transaction_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.challenge_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "challenge_url=", arrayList);
        }
        String str2 = this.header_title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "header_title=", arrayList);
        }
        String str3 = this.header_subtitle;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "header_subtitle=", arrayList);
        }
        ThreeDomainSecureRedirectUrl threeDomainSecureRedirectUrl = this.redirect_url;
        if (threeDomainSecureRedirectUrl != null) {
            arrayList.add("redirect_url=" + threeDomainSecureRedirectUrl);
        }
        String str4 = this.spinner_message;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "spinner_message=", arrayList);
        }
        Long l = this.spinner_message_delay_s;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("spinner_message_delay_s=", l, arrayList);
        }
        String str5 = this.transaction_type;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "transaction_type=", arrayList);
        }
        String str6 = this.transaction_id;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "transaction_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThreeDomainSecureRedirectBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ThreeDomainSecureRedirectBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureRedirectBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureRedirectBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ThreeDomainSecureRedirectBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ThreeDomainSecureRedirectBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
