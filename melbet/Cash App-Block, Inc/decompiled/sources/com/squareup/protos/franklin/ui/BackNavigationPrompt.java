package com.squareup.protos.franklin.ui;

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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/ui/BackNavigationPrompt;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/BackNavigationPrompt$Builder;", "", "title", "Ljava/lang/String;", "subtitle", "dismiss_button_title", "", "dismiss_button_disable_duration_ms", "Ljava/lang/Long;", "redirect_url", "auto_dismiss_delay_ms", "dismiss_button_hidden_duration_ms", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BackNavigationPrompt extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BackNavigationPrompt> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 5, tag = 6)
    public final Long auto_dismiss_delay_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 3, tag = 4)
    public final Long dismiss_button_disable_duration_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 6, tag = 7)
    public final Long dismiss_button_hidden_duration_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String dismiss_button_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String redirect_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/ui/BackNavigationPrompt$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/BackNavigationPrompt;", "<init>", "()V", "title", "", "subtitle", "dismiss_button_title", "dismiss_button_disable_duration_ms", "", "Ljava/lang/Long;", "redirect_url", "auto_dismiss_delay_ms", "dismiss_button_hidden_duration_ms", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/ui/BackNavigationPrompt$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long auto_dismiss_delay_ms;
        public Long dismiss_button_disable_duration_ms;
        public Long dismiss_button_hidden_duration_ms;
        public String dismiss_button_title;
        public String redirect_url;
        public String subtitle;
        public String title;

        public final Builder auto_dismiss_delay_ms(Long auto_dismiss_delay_ms) {
            this.auto_dismiss_delay_ms = auto_dismiss_delay_ms;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public BackNavigationPrompt build() {
            return new BackNavigationPrompt(this.title, this.subtitle, this.dismiss_button_title, this.dismiss_button_disable_duration_ms, this.redirect_url, this.auto_dismiss_delay_ms, this.dismiss_button_hidden_duration_ms, buildUnknownFields());
        }

        public final Builder dismiss_button_disable_duration_ms(Long dismiss_button_disable_duration_ms) {
            this.dismiss_button_disable_duration_ms = dismiss_button_disable_duration_ms;
            return this;
        }

        public final Builder dismiss_button_hidden_duration_ms(Long dismiss_button_hidden_duration_ms) {
            this.dismiss_button_hidden_duration_ms = dismiss_button_hidden_duration_ms;
            return this;
        }

        public final Builder dismiss_button_title(String dismiss_button_title) {
            this.dismiss_button_title = dismiss_button_title;
            return this;
        }

        public final Builder redirect_url(String redirect_url) {
            this.redirect_url = redirect_url;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BackNavigationPrompt.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.BackNavigationPrompt$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public BackNavigationPrompt decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BackNavigationPrompt((String) obj, (String) obj2, (String) obj3, (Long) obj4, (String) obj5, (Long) obj6, (Long) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
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
                            obj4 = ProtoAdapter.INT64.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.INT64.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.INT64.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BackNavigationPrompt value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 3, value.dismiss_button_title);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(writer, 4, value.dismiss_button_disable_duration_ms);
                protoAdapter2.encodeWithTag(writer, 5, value.redirect_url);
                protoAdapter3.encodeWithTag(writer, 6, value.auto_dismiss_delay_ms);
                protoAdapter3.encodeWithTag(writer, 7, value.dismiss_button_hidden_duration_ms);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BackNavigationPrompt value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(3, value.dismiss_button_title) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                return protoAdapter3.encodedSizeWithTag(7, value.dismiss_button_hidden_duration_ms) + protoAdapter3.encodedSizeWithTag(6, value.auto_dismiss_delay_ms) + protoAdapter2.encodedSizeWithTag(5, value.redirect_url) + protoAdapter3.encodedSizeWithTag(4, value.dismiss_button_disable_duration_ms) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BackNavigationPrompt redact(BackNavigationPrompt value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.subtitle;
                String str3 = value.dismiss_button_title;
                Long l = value.dismiss_button_disable_duration_ms;
                String str4 = value.redirect_url;
                Long l2 = value.auto_dismiss_delay_ms;
                Long l3 = value.dismiss_button_hidden_duration_ms;
                value.getClass();
                byteString.getClass();
                return new BackNavigationPrompt(str, str2, str3, l, str4, l2, l3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BackNavigationPrompt value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(writer, 7, value.dismiss_button_hidden_duration_ms);
                protoAdapter2.encodeWithTag(writer, 6, value.auto_dismiss_delay_ms);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 5, value.redirect_url);
                protoAdapter2.encodeWithTag(writer, 4, value.dismiss_button_disable_duration_ms);
                protoAdapter3.encodeWithTag(writer, 3, value.dismiss_button_title);
                protoAdapter3.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter3.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackNavigationPrompt(String str, String str2, String str3, Long l, String str4, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.dismiss_button_title = str3;
        this.dismiss_button_disable_duration_ms = l;
        this.redirect_url = str4;
        this.auto_dismiss_delay_ms = l2;
        this.dismiss_button_hidden_duration_ms = l3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackNavigationPrompt)) {
            return false;
        }
        BackNavigationPrompt backNavigationPrompt = (BackNavigationPrompt) obj;
        return Intrinsics.areEqual(unknownFields(), backNavigationPrompt.unknownFields()) && Intrinsics.areEqual(this.title, backNavigationPrompt.title) && Intrinsics.areEqual(this.subtitle, backNavigationPrompt.subtitle) && Intrinsics.areEqual(this.dismiss_button_title, backNavigationPrompt.dismiss_button_title) && Intrinsics.areEqual(this.dismiss_button_disable_duration_ms, backNavigationPrompt.dismiss_button_disable_duration_ms) && Intrinsics.areEqual(this.redirect_url, backNavigationPrompt.redirect_url) && Intrinsics.areEqual(this.auto_dismiss_delay_ms, backNavigationPrompt.auto_dismiss_delay_ms) && Intrinsics.areEqual(this.dismiss_button_hidden_duration_ms, backNavigationPrompt.dismiss_button_hidden_duration_ms);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.dismiss_button_title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.dismiss_button_disable_duration_ms;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str4 = this.redirect_url;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l2 = this.auto_dismiss_delay_ms;
        int hashCode7 = (hashCode6 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.dismiss_button_hidden_duration_ms;
        int hashCode8 = hashCode7 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.dismiss_button_title = this.dismiss_button_title;
        builder.dismiss_button_disable_duration_ms = this.dismiss_button_disable_duration_ms;
        builder.redirect_url = this.redirect_url;
        builder.auto_dismiss_delay_ms = this.auto_dismiss_delay_ms;
        builder.dismiss_button_hidden_duration_ms = this.dismiss_button_hidden_duration_ms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        String str3 = this.dismiss_button_title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dismiss_button_title=", arrayList);
        }
        Long l = this.dismiss_button_disable_duration_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("dismiss_button_disable_duration_ms=", l, arrayList);
        }
        String str4 = this.redirect_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "redirect_url=", arrayList);
        }
        Long l2 = this.auto_dismiss_delay_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("auto_dismiss_delay_ms=", l2, arrayList);
        }
        Long l3 = this.dismiss_button_hidden_duration_ms;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("dismiss_button_hidden_duration_ms=", l3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BackNavigationPrompt{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/BackNavigationPrompt$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/BackNavigationPrompt$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/BackNavigationPrompt;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/BackNavigationPrompt;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BackNavigationPrompt build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
