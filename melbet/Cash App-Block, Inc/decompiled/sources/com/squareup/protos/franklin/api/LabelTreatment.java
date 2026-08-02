package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/LabelTreatment;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/LabelTreatment$Builder;", "Lcom/squareup/protos/cash/ui/Color;", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "text_color", "border_color", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LabelTreatment extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LabelTreatment> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 0, tag = 1)
    public final Color background_color;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 2, tag = 3)
    public final Color border_color;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 1, tag = 2)
    public final Color text_color;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/LabelTreatment$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/LabelTreatment;", "<init>", "()V", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "text_color", "border_color", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Color background_color;
        public Color border_color;
        public Color text_color;

        public final Builder background_color(Color background_color) {
            this.background_color = background_color;
            return this;
        }

        public final Builder border_color(Color border_color) {
            this.border_color = border_color;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LabelTreatment build() {
            return new LabelTreatment(this.background_color, this.text_color, this.border_color, buildUnknownFields());
        }

        public final Builder text_color(Color text_color) {
            this.text_color = text_color;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LabelTreatment.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.LabelTreatment$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LabelTreatment decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new LabelTreatment((Color) obj, (Color) obj2, (Color) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj2);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LabelTreatment value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = Color.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 1, value.background_color);
                protoAdapter2.encodeWithTag(writer, 2, value.text_color);
                protoAdapter2.encodeWithTag(writer, 3, value.border_color);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LabelTreatment value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = Color.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(3, value.border_color) + protoAdapter2.encodedSizeWithTag(2, value.text_color) + protoAdapter2.encodedSizeWithTag(1, value.background_color) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LabelTreatment redact(LabelTreatment value) {
                value.getClass();
                Color color = value.background_color;
                Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                Color color3 = value.text_color;
                Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
                Color color5 = value.border_color;
                Color color6 = color5 != null ? (Color) Color.ADAPTER.redact(color5) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new LabelTreatment(color2, color4, color6, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LabelTreatment value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = Color.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 3, value.border_color);
                protoAdapter2.encodeWithTag(writer, 2, value.text_color);
                protoAdapter2.encodeWithTag(writer, 1, value.background_color);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelTreatment(Color color, Color color2, Color color3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.background_color = color;
        this.text_color = color2;
        this.border_color = color3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LabelTreatment)) {
            return false;
        }
        LabelTreatment labelTreatment = (LabelTreatment) obj;
        return Intrinsics.areEqual(unknownFields(), labelTreatment.unknownFields()) && Intrinsics.areEqual(this.background_color, labelTreatment.background_color) && Intrinsics.areEqual(this.text_color, labelTreatment.text_color) && Intrinsics.areEqual(this.border_color, labelTreatment.border_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Color color = this.background_color;
        int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.text_color;
        int hashCode3 = (hashCode2 + (color2 != null ? color2.hashCode() : 0)) * 37;
        Color color3 = this.border_color;
        int hashCode4 = hashCode3 + (color3 != null ? color3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.background_color = this.background_color;
        builder.text_color = this.text_color;
        builder.border_color = this.border_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        Color color2 = this.text_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color2, arrayList);
        }
        Color color3 = this.border_color;
        if (color3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("border_color=", color3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LabelTreatment{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/LabelTreatment$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/LabelTreatment$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/LabelTreatment;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/LabelTreatment;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LabelTreatment build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
