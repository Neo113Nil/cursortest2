package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0013\u0015R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/ui/Avatar;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/Avatar$Builder;", "", "image_url", "Ljava/lang/String;", "initial", "accent_color", "", "colorize_image", "Ljava/lang/Boolean;", "dark_theme_image_url", "dark_theme_accent_color", "Lcom/squareup/protos/franklin/ui/Avatar$Shape;", "shape", "Lcom/squareup/protos/franklin/ui/Avatar$Shape;", "Lcom/squareup/protos/cash/ui/Icon;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "Companion", "Builder", "Shape", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Avatar extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Avatar> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String accent_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean colorize_image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String dark_theme_accent_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 5)
    public final String dark_theme_image_url;

    @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 7, tag = 8)
    public final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
    public final String initial;

    @WireField(adapter = "com.squareup.protos.franklin.ui.Avatar$Shape#ADAPTER", schemaIndex = 6, tag = 7)
    public final Shape shape;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0012J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/Avatar$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/Avatar;", "<init>", "()V", "image_url", "", "initial", "accent_color", "colorize_image", "", "Ljava/lang/Boolean;", "dark_theme_image_url", "dark_theme_accent_color", "shape", "Lcom/squareup/protos/franklin/ui/Avatar$Shape;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/ui/Avatar$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String accent_color;
        public Boolean colorize_image;
        public String dark_theme_accent_color;
        public String dark_theme_image_url;
        public Icon icon;
        public String image_url;
        public String initial;
        public Shape shape;

        public final Builder accent_color(String accent_color) {
            this.accent_color = accent_color;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Avatar build() {
            return new Avatar(this.image_url, this.initial, this.accent_color, this.colorize_image, this.dark_theme_image_url, this.dark_theme_accent_color, this.shape, this.icon, buildUnknownFields());
        }

        public final Builder colorize_image(Boolean colorize_image) {
            this.colorize_image = colorize_image;
            return this;
        }

        public final Builder dark_theme_accent_color(String dark_theme_accent_color) {
            this.dark_theme_accent_color = dark_theme_accent_color;
            return this;
        }

        public final Builder dark_theme_image_url(String dark_theme_image_url) {
            this.dark_theme_image_url = dark_theme_image_url;
            return this;
        }

        public final Builder icon(Icon icon) {
            this.icon = icon;
            return this;
        }

        public final Builder image_url(String image_url) {
            this.image_url = image_url;
            return this;
        }

        public final Builder initial(String initial) {
            this.initial = initial;
            return this;
        }

        public final Builder shape(Shape shape) {
            this.shape = shape;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Avatar.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.Avatar$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Avatar decode(ProtoReader reader) {
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
                        return new Avatar((String) obj, (String) obj2, (String) obj3, (Boolean) obj4, (String) obj5, (String) obj6, (Avatar.Shape) obj7, (Icon) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
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
                            obj4 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            try {
                                obj7 = Avatar.Shape.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 8:
                            obj8 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj8);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Avatar value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.image_url);
                protoAdapter2.encodeWithTag(writer, 2, value.initial);
                protoAdapter2.encodeWithTag(writer, 3, value.accent_color);
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.colorize_image);
                protoAdapter2.encodeWithTag(writer, 5, value.dark_theme_image_url);
                protoAdapter2.encodeWithTag(writer, 6, value.dark_theme_accent_color);
                Avatar.Shape.ADAPTER.encodeWithTag(writer, 7, value.shape);
                Icon.ADAPTER.encodeWithTag(writer, 8, value.icon);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Avatar value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return Icon.ADAPTER.encodedSizeWithTag(8, value.icon) + Avatar.Shape.ADAPTER.encodedSizeWithTag(7, value.shape) + protoAdapter2.encodedSizeWithTag(6, value.dark_theme_accent_color) + protoAdapter2.encodedSizeWithTag(5, value.dark_theme_image_url) + ProtoAdapter.BOOL.encodedSizeWithTag(4, value.colorize_image) + protoAdapter2.encodedSizeWithTag(3, value.accent_color) + protoAdapter2.encodedSizeWithTag(2, value.initial) + protoAdapter2.encodedSizeWithTag(1, value.image_url) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Avatar redact(Avatar value) {
                value.getClass();
                Icon icon = value.icon;
                Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.accent_color;
                Boolean bool = value.colorize_image;
                String str2 = value.dark_theme_accent_color;
                Avatar.Shape shape = value.shape;
                byteString.getClass();
                return new Avatar(null, null, str, bool, null, str2, shape, icon2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Avatar value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Icon.ADAPTER.encodeWithTag(writer, 8, value.icon);
                Avatar.Shape.ADAPTER.encodeWithTag(writer, 7, value.shape);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 6, value.dark_theme_accent_color);
                protoAdapter2.encodeWithTag(writer, 5, value.dark_theme_image_url);
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.colorize_image);
                protoAdapter2.encodeWithTag(writer, 3, value.accent_color);
                protoAdapter2.encodeWithTag(writer, 2, value.initial);
                protoAdapter2.encodeWithTag(writer, 1, value.image_url);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Avatar(String str, String str2, String str3, Boolean bool, String str4, String str5, Shape shape, Icon icon, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image_url = str;
        this.initial = str2;
        this.accent_color = str3;
        this.colorize_image = bool;
        this.dark_theme_image_url = str4;
        this.dark_theme_accent_color = str5;
        this.shape = shape;
        this.icon = icon;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return Intrinsics.areEqual(unknownFields(), avatar.unknownFields()) && Intrinsics.areEqual(this.image_url, avatar.image_url) && Intrinsics.areEqual(this.initial, avatar.initial) && Intrinsics.areEqual(this.accent_color, avatar.accent_color) && Intrinsics.areEqual(this.colorize_image, avatar.colorize_image) && Intrinsics.areEqual(this.dark_theme_image_url, avatar.dark_theme_image_url) && Intrinsics.areEqual(this.dark_theme_accent_color, avatar.dark_theme_accent_color) && this.shape == avatar.shape && Intrinsics.areEqual(this.icon, avatar.icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.image_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.initial;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.accent_color;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.colorize_image;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str4 = this.dark_theme_image_url;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.dark_theme_accent_color;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Shape shape = this.shape;
        int hashCode8 = (hashCode7 + (shape != null ? shape.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int hashCode9 = hashCode8 + (icon != null ? icon.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.image_url = this.image_url;
        builder.initial = this.initial;
        builder.accent_color = this.accent_color;
        builder.colorize_image = this.colorize_image;
        builder.dark_theme_image_url = this.dark_theme_image_url;
        builder.dark_theme_accent_color = this.dark_theme_accent_color;
        builder.shape = this.shape;
        builder.icon = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.image_url != null) {
            arrayList.add("image_url=██");
        }
        if (this.initial != null) {
            arrayList.add("initial=██");
        }
        String str = this.accent_color;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "accent_color=", arrayList);
        }
        Boolean bool = this.colorize_image;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("colorize_image=", bool, arrayList);
        }
        if (this.dark_theme_image_url != null) {
            arrayList.add("dark_theme_image_url=██");
        }
        String str2 = this.dark_theme_accent_color;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dark_theme_accent_color=", arrayList);
        }
        Shape shape = this.shape;
        if (shape != null) {
            arrayList.add("shape=" + shape);
        }
        Icon icon = this.icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Avatar{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/ui/Avatar$Shape;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CIRCLE", "SQUARE", "SQUIRCLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Shape implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Shape[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Shape CIRCLE = new Shape("CIRCLE", 0, 1);
        public static final Shape SQUARE = new Shape("SQUARE", 1, 2);
        public static final Shape SQUIRCLE = new Shape("SQUIRCLE", 2, 3);

        private static final /* synthetic */ Shape[] $values() {
            return new Shape[]{CIRCLE, SQUARE, SQUIRCLE};
        }

        static {
            Shape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Shape.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.Avatar$Shape$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public Avatar.Shape fromValue(int value) {
                    return Avatar.Shape.INSTANCE.fromValue(value);
                }
            };
        }

        private Shape(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Shape fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Shape valueOf(String str) {
            return (Shape) Enum.valueOf(Shape.class, str);
        }

        public static Shape[] values() {
            return (Shape[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/Avatar$Shape$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/Avatar$Shape;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Shape fromValue(int value) {
                if (value == 1) {
                    return Shape.CIRCLE;
                }
                if (value == 2) {
                    return Shape.SQUARE;
                }
                if (value != 3) {
                    return null;
                }
                return Shape.SQUIRCLE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/Avatar$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/Avatar$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/Avatar;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/Avatar;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Avatar build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
