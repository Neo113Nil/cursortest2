package com.squareup.protos.franklin.cards;

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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme$Builder;", "", "empty_customization_outline_color", "Ljava/lang/String;", "filled_customization_outline_color", "controls_tint_color", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardCustomizationControlsTheme extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardCustomizationControlsTheme> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String controls_tint_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String empty_customization_outline_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String filled_customization_outline_color;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme;", "<init>", "()V", "empty_customization_outline_color", "", "filled_customization_outline_color", "controls_tint_color", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String controls_tint_color;
        public String empty_customization_outline_color;
        public String filled_customization_outline_color;

        @Override // com.squareup.wire.Message.Builder
        public CardCustomizationControlsTheme build() {
            return new CardCustomizationControlsTheme(this.empty_customization_outline_color, this.filled_customization_outline_color, this.controls_tint_color, buildUnknownFields());
        }

        public final Builder controls_tint_color(String controls_tint_color) {
            this.controls_tint_color = controls_tint_color;
            return this;
        }

        public final Builder empty_customization_outline_color(String empty_customization_outline_color) {
            this.empty_customization_outline_color = empty_customization_outline_color;
            return this;
        }

        public final Builder filled_customization_outline_color(String filled_customization_outline_color) {
            this.filled_customization_outline_color = filled_customization_outline_color;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardCustomizationControlsTheme.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.CardCustomizationControlsTheme$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public CardCustomizationControlsTheme decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new CardCustomizationControlsTheme((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CardCustomizationControlsTheme value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.empty_customization_outline_color);
                protoAdapter2.encodeWithTag(writer, 2, value.filled_customization_outline_color);
                protoAdapter2.encodeWithTag(writer, 3, value.controls_tint_color);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CardCustomizationControlsTheme value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, value.controls_tint_color) + protoAdapter2.encodedSizeWithTag(2, value.filled_customization_outline_color) + protoAdapter2.encodedSizeWithTag(1, value.empty_customization_outline_color) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CardCustomizationControlsTheme redact(CardCustomizationControlsTheme value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.empty_customization_outline_color;
                String str2 = value.filled_customization_outline_color;
                String str3 = value.controls_tint_color;
                value.getClass();
                byteString.getClass();
                return new CardCustomizationControlsTheme(str, str2, str3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CardCustomizationControlsTheme value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, value.controls_tint_color);
                protoAdapter2.encodeWithTag(writer, 2, value.filled_customization_outline_color);
                protoAdapter2.encodeWithTag(writer, 1, value.empty_customization_outline_color);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardCustomizationControlsTheme(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.empty_customization_outline_color = str;
        this.filled_customization_outline_color = str2;
        this.controls_tint_color = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardCustomizationControlsTheme)) {
            return false;
        }
        CardCustomizationControlsTheme cardCustomizationControlsTheme = (CardCustomizationControlsTheme) obj;
        return Intrinsics.areEqual(unknownFields(), cardCustomizationControlsTheme.unknownFields()) && Intrinsics.areEqual(this.empty_customization_outline_color, cardCustomizationControlsTheme.empty_customization_outline_color) && Intrinsics.areEqual(this.filled_customization_outline_color, cardCustomizationControlsTheme.filled_customization_outline_color) && Intrinsics.areEqual(this.controls_tint_color, cardCustomizationControlsTheme.controls_tint_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.empty_customization_outline_color;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.filled_customization_outline_color;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.controls_tint_color;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.empty_customization_outline_color = this.empty_customization_outline_color;
        builder.filled_customization_outline_color = this.filled_customization_outline_color;
        builder.controls_tint_color = this.controls_tint_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.empty_customization_outline_color;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "empty_customization_outline_color=", arrayList);
        }
        String str2 = this.filled_customization_outline_color;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "filled_customization_outline_color=", arrayList);
        }
        String str3 = this.controls_tint_color;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "controls_tint_color=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardCustomizationControlsTheme{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme$Builder;", "", "body", "Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/cards/CardCustomizationControlsTheme;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CardCustomizationControlsTheme build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
