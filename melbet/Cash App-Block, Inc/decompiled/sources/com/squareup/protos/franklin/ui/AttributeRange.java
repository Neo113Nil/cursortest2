package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.AttributeRange;
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
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\f\u000b\f\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Builder;", "", "begin_index_inclusive", "Ljava/lang/Integer;", "end_index_inclusive", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "attribute", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "Companion", "Builder", "Attribute", "Link", "ForegroundColor", "Bold", "StrikeThrough", "Faded", "Underline", "UnorderedListItem", "OrderedListItem", "Icon", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AttributeRange extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AttributeRange> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 2)
    public final Attribute attribute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
    public final Integer begin_index_inclusive;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    public final Integer end_index_inclusive;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/AttributeRange;", "<init>", "()V", "begin_index_inclusive", "", "Ljava/lang/Integer;", "end_index_inclusive", "attribute", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/ui/AttributeRange$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Attribute attribute;
        public Integer begin_index_inclusive;
        public Integer end_index_inclusive;

        public final Builder attribute(Attribute attribute) {
            this.attribute = attribute;
            return this;
        }

        public final Builder begin_index_inclusive(Integer begin_index_inclusive) {
            this.begin_index_inclusive = begin_index_inclusive;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public AttributeRange build() {
            return new AttributeRange(this.begin_index_inclusive, this.end_index_inclusive, this.attribute, buildUnknownFields());
        }

        public final Builder end_index_inclusive(Integer end_index_inclusive) {
            this.end_index_inclusive = end_index_inclusive;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AttributeRange.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.AttributeRange$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AttributeRange decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                AttributeRange.Attribute attribute = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AttributeRange((Integer) obj, (Integer) obj2, attribute, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 3:
                            attribute = new AttributeRange.Attribute.Link((AttributeRange.Link) AttributeRange.Link.ADAPTER.decode(reader));
                            break;
                        case 4:
                            attribute = new AttributeRange.Attribute.ForegroundColor((AttributeRange.ForegroundColor) AttributeRange.ForegroundColor.ADAPTER.decode(reader));
                            break;
                        case 5:
                            attribute = new AttributeRange.Attribute.Bold((AttributeRange.Bold) AttributeRange.Bold.ADAPTER.decode(reader));
                            break;
                        case 6:
                            attribute = new AttributeRange.Attribute.StrikeThrough((AttributeRange.StrikeThrough) AttributeRange.StrikeThrough.ADAPTER.decode(reader));
                            break;
                        case 7:
                            attribute = new AttributeRange.Attribute.Faded((AttributeRange.Faded) AttributeRange.Faded.ADAPTER.decode(reader));
                            break;
                        case 8:
                            attribute = new AttributeRange.Attribute.Underline((AttributeRange.Underline) AttributeRange.Underline.ADAPTER.decode(reader));
                            break;
                        case 9:
                            attribute = new AttributeRange.Attribute.UnorderedListItem((AttributeRange.UnorderedListItem) AttributeRange.UnorderedListItem.ADAPTER.decode(reader));
                            break;
                        case 10:
                            attribute = new AttributeRange.Attribute.OrderedListItem((AttributeRange.OrderedListItem) AttributeRange.OrderedListItem.ADAPTER.decode(reader));
                            break;
                        case 11:
                            attribute = new AttributeRange.Attribute.Icon((AttributeRange.Icon) AttributeRange.Icon.ADAPTER.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AttributeRange value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 1, value.begin_index_inclusive);
                protoAdapter2.encodeWithTag(writer, 2, value.end_index_inclusive);
                AttributeRange.Attribute attribute = value.attribute;
                if (attribute instanceof AttributeRange.Attribute.Link) {
                    AttributeRange.Link.ADAPTER.encodeWithTag(writer, 3, ((AttributeRange.Attribute.Link) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.ForegroundColor) {
                    AttributeRange.ForegroundColor.ADAPTER.encodeWithTag(writer, 4, ((AttributeRange.Attribute.ForegroundColor) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.Bold) {
                    AttributeRange.Bold.ADAPTER.encodeWithTag(writer, 5, ((AttributeRange.Attribute.Bold) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.StrikeThrough) {
                    AttributeRange.StrikeThrough.ADAPTER.encodeWithTag(writer, 6, ((AttributeRange.Attribute.StrikeThrough) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.Faded) {
                    AttributeRange.Faded.ADAPTER.encodeWithTag(writer, 7, ((AttributeRange.Attribute.Faded) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.Underline) {
                    AttributeRange.Underline.ADAPTER.encodeWithTag(writer, 8, ((AttributeRange.Attribute.Underline) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.UnorderedListItem) {
                    AttributeRange.UnorderedListItem.ADAPTER.encodeWithTag(writer, 9, ((AttributeRange.Attribute.UnorderedListItem) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.OrderedListItem) {
                    AttributeRange.OrderedListItem.ADAPTER.encodeWithTag(writer, 10, ((AttributeRange.Attribute.OrderedListItem) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.Icon) {
                    AttributeRange.Icon.ADAPTER.encodeWithTag(writer, 11, ((AttributeRange.Attribute.Icon) attribute).getValue());
                } else if (attribute != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AttributeRange value) {
                int encodedSizeWithTag;
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value.end_index_inclusive) + protoAdapter2.encodedSizeWithTag(1, value.begin_index_inclusive) + size$okio;
                AttributeRange.Attribute attribute = value.attribute;
                if (attribute instanceof AttributeRange.Attribute.Link) {
                    encodedSizeWithTag = AttributeRange.Link.ADAPTER.encodedSizeWithTag(3, ((AttributeRange.Attribute.Link) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.ForegroundColor) {
                    encodedSizeWithTag = AttributeRange.ForegroundColor.ADAPTER.encodedSizeWithTag(4, ((AttributeRange.Attribute.ForegroundColor) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.Bold) {
                    encodedSizeWithTag = AttributeRange.Bold.ADAPTER.encodedSizeWithTag(5, ((AttributeRange.Attribute.Bold) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.StrikeThrough) {
                    encodedSizeWithTag = AttributeRange.StrikeThrough.ADAPTER.encodedSizeWithTag(6, ((AttributeRange.Attribute.StrikeThrough) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.Faded) {
                    encodedSizeWithTag = AttributeRange.Faded.ADAPTER.encodedSizeWithTag(7, ((AttributeRange.Attribute.Faded) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.Underline) {
                    encodedSizeWithTag = AttributeRange.Underline.ADAPTER.encodedSizeWithTag(8, ((AttributeRange.Attribute.Underline) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.UnorderedListItem) {
                    encodedSizeWithTag = AttributeRange.UnorderedListItem.ADAPTER.encodedSizeWithTag(9, ((AttributeRange.Attribute.UnorderedListItem) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.OrderedListItem) {
                    encodedSizeWithTag = AttributeRange.OrderedListItem.ADAPTER.encodedSizeWithTag(10, ((AttributeRange.Attribute.OrderedListItem) attribute).getValue());
                } else {
                    if (!(attribute instanceof AttributeRange.Attribute.Icon)) {
                        if (attribute == null) {
                            return encodedSizeWithTag2;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    encodedSizeWithTag = AttributeRange.Icon.ADAPTER.encodedSizeWithTag(11, ((AttributeRange.Attribute.Icon) attribute).getValue());
                }
                return encodedSizeWithTag + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AttributeRange redact(AttributeRange value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Integer num = value.begin_index_inclusive;
                Integer num2 = value.end_index_inclusive;
                AttributeRange.Attribute attribute = value.attribute;
                value.getClass();
                byteString.getClass();
                return new AttributeRange(num, num2, attribute, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AttributeRange value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                AttributeRange.Attribute attribute = value.attribute;
                if (attribute instanceof AttributeRange.Attribute.Link) {
                    AttributeRange.Link.ADAPTER.encodeWithTag(writer, 3, ((AttributeRange.Attribute.Link) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.ForegroundColor) {
                    AttributeRange.ForegroundColor.ADAPTER.encodeWithTag(writer, 4, ((AttributeRange.Attribute.ForegroundColor) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.Bold) {
                    AttributeRange.Bold.ADAPTER.encodeWithTag(writer, 5, ((AttributeRange.Attribute.Bold) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.StrikeThrough) {
                    AttributeRange.StrikeThrough.ADAPTER.encodeWithTag(writer, 6, ((AttributeRange.Attribute.StrikeThrough) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.Faded) {
                    AttributeRange.Faded.ADAPTER.encodeWithTag(writer, 7, ((AttributeRange.Attribute.Faded) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.Underline) {
                    AttributeRange.Underline.ADAPTER.encodeWithTag(writer, 8, ((AttributeRange.Attribute.Underline) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.UnorderedListItem) {
                    AttributeRange.UnorderedListItem.ADAPTER.encodeWithTag(writer, 9, ((AttributeRange.Attribute.UnorderedListItem) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.OrderedListItem) {
                    AttributeRange.OrderedListItem.ADAPTER.encodeWithTag(writer, 10, ((AttributeRange.Attribute.OrderedListItem) attribute).getValue());
                } else if (attribute instanceof AttributeRange.Attribute.Icon) {
                    AttributeRange.Icon.ADAPTER.encodeWithTag(writer, 11, ((AttributeRange.Attribute.Icon) attribute).getValue());
                } else if (attribute != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 2, value.end_index_inclusive);
                protoAdapter2.encodeWithTag(writer, 1, value.begin_index_inclusive);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeRange(Integer num, Integer num2, Attribute attribute, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.begin_index_inclusive = num;
        this.end_index_inclusive = num2;
        this.attribute = attribute;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttributeRange)) {
            return false;
        }
        AttributeRange attributeRange = (AttributeRange) obj;
        return Intrinsics.areEqual(unknownFields(), attributeRange.unknownFields()) && Intrinsics.areEqual(this.begin_index_inclusive, attributeRange.begin_index_inclusive) && Intrinsics.areEqual(this.end_index_inclusive, attributeRange.end_index_inclusive) && Intrinsics.areEqual(this.attribute, attributeRange.attribute);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.begin_index_inclusive;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.end_index_inclusive;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Attribute attribute = this.attribute;
        int hashCode4 = hashCode3 + (attribute != null ? attribute.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.begin_index_inclusive = this.begin_index_inclusive;
        builder.end_index_inclusive = this.end_index_inclusive;
        builder.attribute = this.attribute;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.begin_index_inclusive;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("begin_index_inclusive=", num, arrayList);
        }
        Integer num2 = this.end_index_inclusive;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("end_index_inclusive=", num2, arrayList);
        }
        Attribute attribute = this.attribute;
        if (attribute != null) {
            arrayList.add("attribute=" + attribute);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AttributeRange{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Bold;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Bold$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Bold extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Bold> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Bold$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Bold;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            @Override // com.squareup.wire.Message.Builder
            public Bold build() {
                return new Bold(buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Bold.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.AttributeRange$Bold$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.Bold decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AttributeRange.Bold(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AttributeRange.Bold value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AttributeRange.Bold value) {
                    value.getClass();
                    return value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.Bold redact(AttributeRange.Bold value) {
                    value.getClass();
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AttributeRange.Bold value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Bold(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Bold copy$default(Bold bold, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = bold.unknownFields();
            }
            return bold.copy(byteString);
        }

        public final Bold copy(ByteString unknownFields) {
            unknownFields.getClass();
            return new Bold(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof Bold) && Intrinsics.areEqual(unknownFields(), ((Bold) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            return "Bold{}";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Bold$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Bold$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/AttributeRange$Bold;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/AttributeRange$Bold;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Bold build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Bold() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bold(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Faded;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Faded$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Faded extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Faded> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Faded$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Faded;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            @Override // com.squareup.wire.Message.Builder
            public Faded build() {
                return new Faded(buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Faded.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.AttributeRange$Faded$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.Faded decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AttributeRange.Faded(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AttributeRange.Faded value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AttributeRange.Faded value) {
                    value.getClass();
                    return value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.Faded redact(AttributeRange.Faded value) {
                    value.getClass();
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AttributeRange.Faded value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Faded(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Faded copy$default(Faded faded, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = faded.unknownFields();
            }
            return faded.copy(byteString);
        }

        public final Faded copy(ByteString unknownFields) {
            unknownFields.getClass();
            return new Faded(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof Faded) && Intrinsics.areEqual(unknownFields(), ((Faded) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            return "Faded{}";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Faded$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Faded$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/AttributeRange$Faded;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/AttributeRange$Faded;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Faded build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Faded() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Faded(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$ForegroundColor;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/AttributeRange$ForegroundColor$Builder;", "color", "Lcom/squareup/protos/cash/ui/Color;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Color;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ForegroundColor extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ForegroundColor> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 0, tag = 1)
        public final Color color;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$ForegroundColor$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/AttributeRange$ForegroundColor;", "<init>", "()V", "color", "Lcom/squareup/protos/cash/ui/Color;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Color color;

            @Override // com.squareup.wire.Message.Builder
            public ForegroundColor build() {
                return new ForegroundColor(this.color, buildUnknownFields());
            }

            public final Builder color(Color color) {
                this.color = color;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ForegroundColor.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.AttributeRange$ForegroundColor$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.ForegroundColor decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AttributeRange.ForegroundColor((Color) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AttributeRange.ForegroundColor value) {
                    writer.getClass();
                    value.getClass();
                    Color.ADAPTER.encodeWithTag(writer, 1, value.color);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AttributeRange.ForegroundColor value) {
                    value.getClass();
                    return Color.ADAPTER.encodedSizeWithTag(1, value.color) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.ForegroundColor redact(AttributeRange.ForegroundColor value) {
                    value.getClass();
                    Color color = value.color;
                    return value.copy(color != null ? (Color) Color.ADAPTER.redact(color) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AttributeRange.ForegroundColor value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Color.ADAPTER.encodeWithTag(writer, 1, value.color);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ForegroundColor(Color color, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : color, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ForegroundColor copy$default(ForegroundColor foregroundColor, Color color, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                color = foregroundColor.color;
            }
            if ((i & 2) != 0) {
                byteString = foregroundColor.unknownFields();
            }
            return foregroundColor.copy(color, byteString);
        }

        public final ForegroundColor copy(Color color, ByteString unknownFields) {
            unknownFields.getClass();
            return new ForegroundColor(color, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ForegroundColor)) {
                return false;
            }
            ForegroundColor foregroundColor = (ForegroundColor) other;
            return Intrinsics.areEqual(unknownFields(), foregroundColor.unknownFields()) && Intrinsics.areEqual(this.color, foregroundColor.color);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Color color = this.color;
            int hashCode2 = hashCode + (color != null ? color.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.color = this.color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Color color = this.color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ForegroundColor{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$ForegroundColor$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/AttributeRange$ForegroundColor$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/AttributeRange$ForegroundColor;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/AttributeRange$ForegroundColor;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ForegroundColor build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ForegroundColor() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForegroundColor(Color color, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.color = color;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Icon;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Icon$Builder;", "image", "Lcom/squareup/protos/cash/ui/Image;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Icon extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Icon> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
        public final Image image;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Icon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Icon;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Image;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Image image;

            @Override // com.squareup.wire.Message.Builder
            public Icon build() {
                return new Icon(this.image, buildUnknownFields());
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Icon.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.AttributeRange$Icon$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.Icon decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AttributeRange.Icon((Image) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AttributeRange.Icon value) {
                    writer.getClass();
                    value.getClass();
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AttributeRange.Icon value) {
                    value.getClass();
                    return Image.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.Icon redact(AttributeRange.Icon value) {
                    value.getClass();
                    Image image = value.image;
                    return value.copy(image != null ? (Image) Image.ADAPTER.redact(image) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AttributeRange.Icon value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Icon(Image image, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : image, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Icon copy$default(Icon icon, Image image, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                image = icon.image;
            }
            if ((i & 2) != 0) {
                byteString = icon.unknownFields();
            }
            return icon.copy(image, byteString);
        }

        public final Icon copy(Image image, ByteString unknownFields) {
            unknownFields.getClass();
            return new Icon(image, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return Intrinsics.areEqual(unknownFields(), icon.unknownFields()) && Intrinsics.areEqual(this.image, icon.image);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = hashCode + (image != null ? image.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Icon{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Icon$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Icon$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/AttributeRange$Icon;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/AttributeRange$Icon;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Icon build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Icon() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Icon(Image image, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Link;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Link$Builder;", "url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Link extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Link> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String url;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Link$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Link;", "<init>", "()V", "url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String url;

            @Override // com.squareup.wire.Message.Builder
            public Link build() {
                return new Link(this.url, buildUnknownFields());
            }

            public final Builder url(String url) {
                this.url = url;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Link.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.AttributeRange$Link$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.Link decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AttributeRange.Link((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AttributeRange.Link value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AttributeRange.Link value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.url) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.Link redact(AttributeRange.Link value) {
                    value.getClass();
                    return AttributeRange.Link.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AttributeRange.Link value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Link(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Link copy$default(Link link, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = link.url;
            }
            if ((i & 2) != 0) {
                byteString = link.unknownFields();
            }
            return link.copy(str, byteString);
        }

        public final Link copy(String url, ByteString unknownFields) {
            unknownFields.getClass();
            return new Link(url, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return Intrinsics.areEqual(unknownFields(), link.unknownFields()) && Intrinsics.areEqual(this.url, link.url);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.url = this.url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Link{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Link$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Link$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/AttributeRange$Link;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/AttributeRange$Link;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Link build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Link() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Link(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.url = str;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$OrderedListItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/AttributeRange$OrderedListItem$Builder;", InquiryField.FloatField.TYPE2, "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OrderedListItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OrderedListItem> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String number;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$OrderedListItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/AttributeRange$OrderedListItem;", "<init>", "()V", InquiryField.FloatField.TYPE2, "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String number;

            @Override // com.squareup.wire.Message.Builder
            public OrderedListItem build() {
                return new OrderedListItem(this.number, buildUnknownFields());
            }

            public final Builder number(String number) {
                this.number = number;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OrderedListItem.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.AttributeRange$OrderedListItem$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.OrderedListItem decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AttributeRange.OrderedListItem((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AttributeRange.OrderedListItem value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.number);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AttributeRange.OrderedListItem value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.number) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.OrderedListItem redact(AttributeRange.OrderedListItem value) {
                    value.getClass();
                    return AttributeRange.OrderedListItem.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AttributeRange.OrderedListItem value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.number);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ OrderedListItem(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ OrderedListItem copy$default(OrderedListItem orderedListItem, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = orderedListItem.number;
            }
            if ((i & 2) != 0) {
                byteString = orderedListItem.unknownFields();
            }
            return orderedListItem.copy(str, byteString);
        }

        public final OrderedListItem copy(String number, ByteString unknownFields) {
            unknownFields.getClass();
            return new OrderedListItem(number, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OrderedListItem)) {
                return false;
            }
            OrderedListItem orderedListItem = (OrderedListItem) other;
            return Intrinsics.areEqual(unknownFields(), orderedListItem.unknownFields()) && Intrinsics.areEqual(this.number, orderedListItem.number);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.number;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.number = this.number;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.number;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "number=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderedListItem{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$OrderedListItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/AttributeRange$OrderedListItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/AttributeRange$OrderedListItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/AttributeRange$OrderedListItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ OrderedListItem build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OrderedListItem() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderedListItem(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.number = str;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$StrikeThrough;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/AttributeRange$StrikeThrough$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StrikeThrough extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<StrikeThrough> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$StrikeThrough$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/AttributeRange$StrikeThrough;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            @Override // com.squareup.wire.Message.Builder
            public StrikeThrough build() {
                return new StrikeThrough(buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StrikeThrough.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.AttributeRange$StrikeThrough$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.StrikeThrough decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AttributeRange.StrikeThrough(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AttributeRange.StrikeThrough value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AttributeRange.StrikeThrough value) {
                    value.getClass();
                    return value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.StrikeThrough redact(AttributeRange.StrikeThrough value) {
                    value.getClass();
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AttributeRange.StrikeThrough value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ StrikeThrough(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ StrikeThrough copy$default(StrikeThrough strikeThrough, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = strikeThrough.unknownFields();
            }
            return strikeThrough.copy(byteString);
        }

        public final StrikeThrough copy(ByteString unknownFields) {
            unknownFields.getClass();
            return new StrikeThrough(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof StrikeThrough) && Intrinsics.areEqual(unknownFields(), ((StrikeThrough) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            return "StrikeThrough{}";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$StrikeThrough$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/AttributeRange$StrikeThrough$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/AttributeRange$StrikeThrough;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/AttributeRange$StrikeThrough;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ StrikeThrough build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StrikeThrough() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StrikeThrough(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Underline;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Underline$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Underline extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Underline> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Underline$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Underline;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            @Override // com.squareup.wire.Message.Builder
            public Underline build() {
                return new Underline(buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Underline.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.AttributeRange$Underline$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.Underline decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AttributeRange.Underline(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AttributeRange.Underline value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AttributeRange.Underline value) {
                    value.getClass();
                    return value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.Underline redact(AttributeRange.Underline value) {
                    value.getClass();
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AttributeRange.Underline value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Underline(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Underline copy$default(Underline underline, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = underline.unknownFields();
            }
            return underline.copy(byteString);
        }

        public final Underline copy(ByteString unknownFields) {
            unknownFields.getClass();
            return new Underline(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof Underline) && Intrinsics.areEqual(unknownFields(), ((Underline) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            return "Underline{}";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Underline$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Underline$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/AttributeRange$Underline;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/AttributeRange$Underline;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Underline build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Underline() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Underline(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$UnorderedListItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/AttributeRange$UnorderedListItem$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UnorderedListItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UnorderedListItem> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$UnorderedListItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/AttributeRange$UnorderedListItem;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            @Override // com.squareup.wire.Message.Builder
            public UnorderedListItem build() {
                return new UnorderedListItem(buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UnorderedListItem.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.AttributeRange$UnorderedListItem$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.UnorderedListItem decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AttributeRange.UnorderedListItem(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AttributeRange.UnorderedListItem value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AttributeRange.UnorderedListItem value) {
                    value.getClass();
                    return value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AttributeRange.UnorderedListItem redact(AttributeRange.UnorderedListItem value) {
                    value.getClass();
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AttributeRange.UnorderedListItem value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ UnorderedListItem(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ UnorderedListItem copy$default(UnorderedListItem unorderedListItem, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = unorderedListItem.unknownFields();
            }
            return unorderedListItem.copy(byteString);
        }

        public final UnorderedListItem copy(ByteString unknownFields) {
            unknownFields.getClass();
            return new UnorderedListItem(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof UnorderedListItem) && Intrinsics.areEqual(unknownFields(), ((UnorderedListItem) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            return "UnorderedListItem{}";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$UnorderedListItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/AttributeRange$UnorderedListItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/AttributeRange$UnorderedListItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/AttributeRange$UnorderedListItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ UnorderedListItem build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UnorderedListItem() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnorderedListItem(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "", "<init>", "()V", "Link", "ForegroundColor", "Bold", "StrikeThrough", "Faded", "Underline", "UnorderedListItem", "OrderedListItem", "Icon", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$Bold;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$Faded;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$ForegroundColor;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$Icon;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$Link;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$OrderedListItem;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$StrikeThrough;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$Underline;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$UnorderedListItem;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Attribute {

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.AttributeRange$Bold#ADAPTER", declaredName = "bold", tag = 5)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$Bold;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "value", "Lcom/squareup/protos/franklin/ui/AttributeRange$Bold;", "<init>", "(Lcom/squareup/protos/franklin/ui/AttributeRange$Bold;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/AttributeRange$Bold;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Bold extends Attribute {
            private final Bold value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Bold(Bold bold) {
                super(null);
                bold.getClass();
                this.value = bold;
            }

            public static /* synthetic */ Bold copy$default(Bold bold, Bold bold2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bold2 = bold.value;
                }
                return bold.copy(bold2);
            }

            /* renamed from: component1, reason: from getter */
            public final Bold getValue() {
                return this.value;
            }

            public final Bold copy(Bold value) {
                value.getClass();
                return new Bold(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Bold) && Intrinsics.areEqual(this.value, ((Bold) other).value);
            }

            public final Bold getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Bold(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.AttributeRange$Faded#ADAPTER", declaredName = "faded", tag = 7)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$Faded;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "value", "Lcom/squareup/protos/franklin/ui/AttributeRange$Faded;", "<init>", "(Lcom/squareup/protos/franklin/ui/AttributeRange$Faded;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/AttributeRange$Faded;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Faded extends Attribute {
            private final Faded value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Faded(Faded faded) {
                super(null);
                faded.getClass();
                this.value = faded;
            }

            public static /* synthetic */ Faded copy$default(Faded faded, Faded faded2, int i, Object obj) {
                if ((i & 1) != 0) {
                    faded2 = faded.value;
                }
                return faded.copy(faded2);
            }

            /* renamed from: component1, reason: from getter */
            public final Faded getValue() {
                return this.value;
            }

            public final Faded copy(Faded value) {
                value.getClass();
                return new Faded(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Faded) && Intrinsics.areEqual(this.value, ((Faded) other).value);
            }

            public final Faded getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Faded(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.AttributeRange$ForegroundColor#ADAPTER", declaredName = "foreground_color", tag = 4)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$ForegroundColor;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "value", "Lcom/squareup/protos/franklin/ui/AttributeRange$ForegroundColor;", "<init>", "(Lcom/squareup/protos/franklin/ui/AttributeRange$ForegroundColor;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/AttributeRange$ForegroundColor;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ForegroundColor extends Attribute {
            private final ForegroundColor value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForegroundColor(ForegroundColor foregroundColor) {
                super(null);
                foregroundColor.getClass();
                this.value = foregroundColor;
            }

            public static /* synthetic */ ForegroundColor copy$default(ForegroundColor foregroundColor, ForegroundColor foregroundColor2, int i, Object obj) {
                if ((i & 1) != 0) {
                    foregroundColor2 = foregroundColor.value;
                }
                return foregroundColor.copy(foregroundColor2);
            }

            /* renamed from: component1, reason: from getter */
            public final ForegroundColor getValue() {
                return this.value;
            }

            public final ForegroundColor copy(ForegroundColor value) {
                value.getClass();
                return new ForegroundColor(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ForegroundColor) && Intrinsics.areEqual(this.value, ((ForegroundColor) other).value);
            }

            public final ForegroundColor getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ForegroundColor(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.AttributeRange$Icon#ADAPTER", declaredName = "icon", tag = 11)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$Icon;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "value", "Lcom/squareup/protos/franklin/ui/AttributeRange$Icon;", "<init>", "(Lcom/squareup/protos/franklin/ui/AttributeRange$Icon;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/AttributeRange$Icon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Icon extends Attribute {
            private final Icon value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Icon(Icon icon) {
                super(null);
                icon.getClass();
                this.value = icon;
            }

            public static /* synthetic */ Icon copy$default(Icon icon, Icon icon2, int i, Object obj) {
                if ((i & 1) != 0) {
                    icon2 = icon.value;
                }
                return icon.copy(icon2);
            }

            /* renamed from: component1, reason: from getter */
            public final Icon getValue() {
                return this.value;
            }

            public final Icon copy(Icon value) {
                value.getClass();
                return new Icon(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Icon) && Intrinsics.areEqual(this.value, ((Icon) other).value);
            }

            public final Icon getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Icon(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.AttributeRange$Link#ADAPTER", declaredName = "link", tag = 3)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$Link;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "value", "Lcom/squareup/protos/franklin/ui/AttributeRange$Link;", "<init>", "(Lcom/squareup/protos/franklin/ui/AttributeRange$Link;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/AttributeRange$Link;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Link extends Attribute {
            private final Link value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Link(Link link) {
                super(null);
                link.getClass();
                this.value = link;
            }

            public static /* synthetic */ Link copy$default(Link link, Link link2, int i, Object obj) {
                if ((i & 1) != 0) {
                    link2 = link.value;
                }
                return link.copy(link2);
            }

            /* renamed from: component1, reason: from getter */
            public final Link getValue() {
                return this.value;
            }

            public final Link copy(Link value) {
                value.getClass();
                return new Link(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Link) && Intrinsics.areEqual(this.value, ((Link) other).value);
            }

            public final Link getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Link(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.AttributeRange$OrderedListItem#ADAPTER", declaredName = "ordered_list_item", tag = 10)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$OrderedListItem;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "value", "Lcom/squareup/protos/franklin/ui/AttributeRange$OrderedListItem;", "<init>", "(Lcom/squareup/protos/franklin/ui/AttributeRange$OrderedListItem;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/AttributeRange$OrderedListItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OrderedListItem extends Attribute {
            private final OrderedListItem value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderedListItem(OrderedListItem orderedListItem) {
                super(null);
                orderedListItem.getClass();
                this.value = orderedListItem;
            }

            public static /* synthetic */ OrderedListItem copy$default(OrderedListItem orderedListItem, OrderedListItem orderedListItem2, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderedListItem2 = orderedListItem.value;
                }
                return orderedListItem.copy(orderedListItem2);
            }

            /* renamed from: component1, reason: from getter */
            public final OrderedListItem getValue() {
                return this.value;
            }

            public final OrderedListItem copy(OrderedListItem value) {
                value.getClass();
                return new OrderedListItem(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OrderedListItem) && Intrinsics.areEqual(this.value, ((OrderedListItem) other).value);
            }

            public final OrderedListItem getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OrderedListItem(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.AttributeRange$StrikeThrough#ADAPTER", declaredName = "strike_through", tag = 6)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$StrikeThrough;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "value", "Lcom/squareup/protos/franklin/ui/AttributeRange$StrikeThrough;", "<init>", "(Lcom/squareup/protos/franklin/ui/AttributeRange$StrikeThrough;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/AttributeRange$StrikeThrough;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StrikeThrough extends Attribute {
            private final StrikeThrough value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StrikeThrough(StrikeThrough strikeThrough) {
                super(null);
                strikeThrough.getClass();
                this.value = strikeThrough;
            }

            public static /* synthetic */ StrikeThrough copy$default(StrikeThrough strikeThrough, StrikeThrough strikeThrough2, int i, Object obj) {
                if ((i & 1) != 0) {
                    strikeThrough2 = strikeThrough.value;
                }
                return strikeThrough.copy(strikeThrough2);
            }

            /* renamed from: component1, reason: from getter */
            public final StrikeThrough getValue() {
                return this.value;
            }

            public final StrikeThrough copy(StrikeThrough value) {
                value.getClass();
                return new StrikeThrough(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StrikeThrough) && Intrinsics.areEqual(this.value, ((StrikeThrough) other).value);
            }

            public final StrikeThrough getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "StrikeThrough(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.AttributeRange$Underline#ADAPTER", declaredName = "underline", tag = 8)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$Underline;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "value", "Lcom/squareup/protos/franklin/ui/AttributeRange$Underline;", "<init>", "(Lcom/squareup/protos/franklin/ui/AttributeRange$Underline;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/AttributeRange$Underline;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Underline extends Attribute {
            private final Underline value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Underline(Underline underline) {
                super(null);
                underline.getClass();
                this.value = underline;
            }

            public static /* synthetic */ Underline copy$default(Underline underline, Underline underline2, int i, Object obj) {
                if ((i & 1) != 0) {
                    underline2 = underline.value;
                }
                return underline.copy(underline2);
            }

            /* renamed from: component1, reason: from getter */
            public final Underline getValue() {
                return this.value;
            }

            public final Underline copy(Underline value) {
                value.getClass();
                return new Underline(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Underline) && Intrinsics.areEqual(this.value, ((Underline) other).value);
            }

            public final Underline getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Underline(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.AttributeRange$UnorderedListItem#ADAPTER", declaredName = "unordered_list_item", tag = 9)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute$UnorderedListItem;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Attribute;", "value", "Lcom/squareup/protos/franklin/ui/AttributeRange$UnorderedListItem;", "<init>", "(Lcom/squareup/protos/franklin/ui/AttributeRange$UnorderedListItem;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/AttributeRange$UnorderedListItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnorderedListItem extends Attribute {
            private final UnorderedListItem value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnorderedListItem(UnorderedListItem unorderedListItem) {
                super(null);
                unorderedListItem.getClass();
                this.value = unorderedListItem;
            }

            public static /* synthetic */ UnorderedListItem copy$default(UnorderedListItem unorderedListItem, UnorderedListItem unorderedListItem2, int i, Object obj) {
                if ((i & 1) != 0) {
                    unorderedListItem2 = unorderedListItem.value;
                }
                return unorderedListItem.copy(unorderedListItem2);
            }

            /* renamed from: component1, reason: from getter */
            public final UnorderedListItem getValue() {
                return this.value;
            }

            public final UnorderedListItem copy(UnorderedListItem value) {
                value.getClass();
                return new UnorderedListItem(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnorderedListItem) && Intrinsics.areEqual(this.value, ((UnorderedListItem) other).value);
            }

            public final UnorderedListItem getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UnorderedListItem(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Attribute(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Attribute() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/AttributeRange$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/AttributeRange$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/AttributeRange;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/AttributeRange;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AttributeRange build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
