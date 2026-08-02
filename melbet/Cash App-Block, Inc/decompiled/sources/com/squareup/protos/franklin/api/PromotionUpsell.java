package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/PromotionUpsell;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PromotionUpsell$Builder;", "", "title", "Ljava/lang/String;", "body", "cta", "cta_client_route", "image_url_light", "image_url_dark", "", "image_height", "Ljava/lang/Long;", "image_width", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PromotionUpsell extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PromotionUpsell> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String cta_client_route;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 6, tag = 7)
    public final Long image_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String image_url_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String image_url_light;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 7, tag = 8)
    public final Long image_width;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/PromotionUpsell$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PromotionUpsell;", "<init>", "()V", "title", "", "body", "cta", "cta_client_route", "image_url_light", "image_url_dark", "image_height", "", "Ljava/lang/Long;", "image_width", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/PromotionUpsell$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String body;
        public String cta;
        public String cta_client_route;
        public Long image_height;
        public String image_url_dark;
        public String image_url_light;
        public Long image_width;
        public String title;

        public final Builder body(String body) {
            this.body = body;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PromotionUpsell build() {
            return new PromotionUpsell(this.title, this.body, this.cta, this.cta_client_route, this.image_url_light, this.image_url_dark, this.image_height, this.image_width, buildUnknownFields());
        }

        public final Builder cta(String cta) {
            this.cta = cta;
            return this;
        }

        public final Builder cta_client_route(String cta_client_route) {
            this.cta_client_route = cta_client_route;
            return this;
        }

        public final Builder image_height(Long image_height) {
            this.image_height = image_height;
            return this;
        }

        public final Builder image_url_dark(String image_url_dark) {
            this.image_url_dark = image_url_dark;
            return this;
        }

        public final Builder image_url_light(String image_url_light) {
            this.image_url_light = image_url_light;
            return this;
        }

        public final Builder image_width(Long image_width) {
            this.image_width = image_width;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PromotionUpsell.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PromotionUpsell$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PromotionUpsell decode(ProtoReader reader) {
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
                        return new PromotionUpsell((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (Long) obj7, (Long) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
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
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.INT64.decode(reader);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.INT64.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PromotionUpsell value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.body);
                protoAdapter2.encodeWithTag(writer, 3, value.cta);
                protoAdapter2.encodeWithTag(writer, 4, value.cta_client_route);
                protoAdapter2.encodeWithTag(writer, 5, value.image_url_light);
                protoAdapter2.encodeWithTag(writer, 6, value.image_url_dark);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(writer, 7, value.image_height);
                protoAdapter3.encodeWithTag(writer, 8, value.image_width);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PromotionUpsell value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(6, value.image_url_dark) + protoAdapter2.encodedSizeWithTag(5, value.image_url_light) + protoAdapter2.encodedSizeWithTag(4, value.cta_client_route) + protoAdapter2.encodedSizeWithTag(3, value.cta) + protoAdapter2.encodedSizeWithTag(2, value.body) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                return protoAdapter3.encodedSizeWithTag(8, value.image_width) + protoAdapter3.encodedSizeWithTag(7, value.image_height) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PromotionUpsell redact(PromotionUpsell value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.body;
                String str3 = value.cta;
                String str4 = value.cta_client_route;
                String str5 = value.image_url_light;
                String str6 = value.image_url_dark;
                Long l = value.image_height;
                Long l2 = value.image_width;
                value.getClass();
                byteString.getClass();
                return new PromotionUpsell(str, str2, str3, str4, str5, str6, l, l2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PromotionUpsell value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(writer, 8, value.image_width);
                protoAdapter2.encodeWithTag(writer, 7, value.image_height);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 6, value.image_url_dark);
                protoAdapter3.encodeWithTag(writer, 5, value.image_url_light);
                protoAdapter3.encodeWithTag(writer, 4, value.cta_client_route);
                protoAdapter3.encodeWithTag(writer, 3, value.cta);
                protoAdapter3.encodeWithTag(writer, 2, value.body);
                protoAdapter3.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionUpsell(String str, String str2, String str3, String str4, String str5, String str6, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.body = str2;
        this.cta = str3;
        this.cta_client_route = str4;
        this.image_url_light = str5;
        this.image_url_dark = str6;
        this.image_height = l;
        this.image_width = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromotionUpsell)) {
            return false;
        }
        PromotionUpsell promotionUpsell = (PromotionUpsell) obj;
        return Intrinsics.areEqual(unknownFields(), promotionUpsell.unknownFields()) && Intrinsics.areEqual(this.title, promotionUpsell.title) && Intrinsics.areEqual(this.body, promotionUpsell.body) && Intrinsics.areEqual(this.cta, promotionUpsell.cta) && Intrinsics.areEqual(this.cta_client_route, promotionUpsell.cta_client_route) && Intrinsics.areEqual(this.image_url_light, promotionUpsell.image_url_light) && Intrinsics.areEqual(this.image_url_dark, promotionUpsell.image_url_dark) && Intrinsics.areEqual(this.image_height, promotionUpsell.image_height) && Intrinsics.areEqual(this.image_width, promotionUpsell.image_width);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.body;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.cta;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.cta_client_route;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.image_url_light;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.image_url_dark;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Long l = this.image_height;
        int hashCode8 = (hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.image_width;
        int hashCode9 = hashCode8 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.body = this.body;
        builder.cta = this.cta;
        builder.cta_client_route = this.cta_client_route;
        builder.image_url_light = this.image_url_light;
        builder.image_url_dark = this.image_url_dark;
        builder.image_height = this.image_height;
        builder.image_width = this.image_width;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.body;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
        }
        String str3 = this.cta;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "cta=", arrayList);
        }
        String str4 = this.cta_client_route;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "cta_client_route=", arrayList);
        }
        String str5 = this.image_url_light;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "image_url_light=", arrayList);
        }
        String str6 = this.image_url_dark;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "image_url_dark=", arrayList);
        }
        Long l = this.image_height;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("image_height=", l, arrayList);
        }
        Long l2 = this.image_width;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("image_width=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PromotionUpsell{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PromotionUpsell$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PromotionUpsell$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PromotionUpsell;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PromotionUpsell;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PromotionUpsell build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
