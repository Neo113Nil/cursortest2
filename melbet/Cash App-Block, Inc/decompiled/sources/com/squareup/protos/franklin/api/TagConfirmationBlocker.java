package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.TagConfirmationBlocker;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/TagConfirmationBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/TagConfirmationBlocker$Builder;", "", "highlighted_title", "Ljava/lang/String;", "standard_title", "button_title", "Lcom/squareup/protos/franklin/api/TagConfirmationBlocker$TagConfirmationBlockerStyle;", "style", "Lcom/squareup/protos/franklin/api/TagConfirmationBlocker$TagConfirmationBlockerStyle;", "tag_theme_token", "Companion", "Builder", "TagConfirmationBlockerStyle", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TagConfirmationBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TagConfirmationBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String button_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String highlighted_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String standard_title;

    @WireField(adapter = "com.squareup.protos.franklin.api.TagConfirmationBlocker$TagConfirmationBlockerStyle#ADAPTER", schemaIndex = 3, tag = 4)
    public final TagConfirmationBlockerStyle style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String tag_theme_token;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/TagConfirmationBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/TagConfirmationBlocker;", "<init>", "()V", "highlighted_title", "", "standard_title", "button_title", "style", "Lcom/squareup/protos/franklin/api/TagConfirmationBlocker$TagConfirmationBlockerStyle;", "tag_theme_token", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String button_title;
        public String highlighted_title;
        public String standard_title;
        public TagConfirmationBlockerStyle style;
        public String tag_theme_token;

        @Override // com.squareup.wire.Message.Builder
        public TagConfirmationBlocker build() {
            return new TagConfirmationBlocker(this.highlighted_title, this.standard_title, this.button_title, this.style, this.tag_theme_token, buildUnknownFields());
        }

        public final Builder button_title(String button_title) {
            this.button_title = button_title;
            return this;
        }

        public final Builder highlighted_title(String highlighted_title) {
            this.highlighted_title = highlighted_title;
            return this;
        }

        public final Builder standard_title(String standard_title) {
            this.standard_title = standard_title;
            return this;
        }

        public final Builder style(TagConfirmationBlockerStyle style) {
            this.style = style;
            return this;
        }

        public final Builder tag_theme_token(String tag_theme_token) {
            this.tag_theme_token = tag_theme_token;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TagConfirmationBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.TagConfirmationBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TagConfirmationBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TagConfirmationBlocker((String) obj, (String) obj2, (String) obj3, (TagConfirmationBlocker.TagConfirmationBlockerStyle) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 4) {
                        try {
                            obj4 = TagConfirmationBlocker.TagConfirmationBlockerStyle.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TagConfirmationBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.highlighted_title);
                protoAdapter2.encodeWithTag(writer, 2, value.standard_title);
                protoAdapter2.encodeWithTag(writer, 3, value.button_title);
                TagConfirmationBlocker.TagConfirmationBlockerStyle.ADAPTER.encodeWithTag(writer, 4, value.style);
                protoAdapter2.encodeWithTag(writer, 5, value.tag_theme_token);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TagConfirmationBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(5, value.tag_theme_token) + TagConfirmationBlocker.TagConfirmationBlockerStyle.ADAPTER.encodedSizeWithTag(4, value.style) + protoAdapter2.encodedSizeWithTag(3, value.button_title) + protoAdapter2.encodedSizeWithTag(2, value.standard_title) + protoAdapter2.encodedSizeWithTag(1, value.highlighted_title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TagConfirmationBlocker redact(TagConfirmationBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.highlighted_title;
                String str2 = value.standard_title;
                String str3 = value.button_title;
                TagConfirmationBlocker.TagConfirmationBlockerStyle tagConfirmationBlockerStyle = value.style;
                String str4 = value.tag_theme_token;
                value.getClass();
                byteString.getClass();
                return new TagConfirmationBlocker(str, str2, str3, tagConfirmationBlockerStyle, str4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TagConfirmationBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.tag_theme_token);
                TagConfirmationBlocker.TagConfirmationBlockerStyle.ADAPTER.encodeWithTag(writer, 4, value.style);
                protoAdapter2.encodeWithTag(writer, 3, value.button_title);
                protoAdapter2.encodeWithTag(writer, 2, value.standard_title);
                protoAdapter2.encodeWithTag(writer, 1, value.highlighted_title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagConfirmationBlocker(String str, String str2, String str3, TagConfirmationBlockerStyle tagConfirmationBlockerStyle, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.highlighted_title = str;
        this.standard_title = str2;
        this.button_title = str3;
        this.style = tagConfirmationBlockerStyle;
        this.tag_theme_token = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TagConfirmationBlocker)) {
            return false;
        }
        TagConfirmationBlocker tagConfirmationBlocker = (TagConfirmationBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), tagConfirmationBlocker.unknownFields()) && Intrinsics.areEqual(this.highlighted_title, tagConfirmationBlocker.highlighted_title) && Intrinsics.areEqual(this.standard_title, tagConfirmationBlocker.standard_title) && Intrinsics.areEqual(this.button_title, tagConfirmationBlocker.button_title) && this.style == tagConfirmationBlocker.style && Intrinsics.areEqual(this.tag_theme_token, tagConfirmationBlocker.tag_theme_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.highlighted_title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.standard_title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.button_title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        TagConfirmationBlockerStyle tagConfirmationBlockerStyle = this.style;
        int hashCode5 = (hashCode4 + (tagConfirmationBlockerStyle != null ? tagConfirmationBlockerStyle.hashCode() : 0)) * 37;
        String str4 = this.tag_theme_token;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.highlighted_title = this.highlighted_title;
        builder.standard_title = this.standard_title;
        builder.button_title = this.button_title;
        builder.style = this.style;
        builder.tag_theme_token = this.tag_theme_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.highlighted_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "highlighted_title=", arrayList);
        }
        String str2 = this.standard_title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "standard_title=", arrayList);
        }
        String str3 = this.button_title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_title=", arrayList);
        }
        TagConfirmationBlockerStyle tagConfirmationBlockerStyle = this.style;
        if (tagConfirmationBlockerStyle != null) {
            arrayList.add("style=" + tagConfirmationBlockerStyle);
        }
        String str4 = this.tag_theme_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "tag_theme_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TagConfirmationBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/TagConfirmationBlocker$TagConfirmationBlockerStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TAG_CONFIRMATION_BLOCKER_STYLE_UNSPECIFIED", "TAG_CONFIRMATION_BLOCKER_STYLE_SUCCESS", "TAG_CONFIRMATION_BLOCKER_STYLE_FAILURE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class TagConfirmationBlockerStyle implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TagConfirmationBlockerStyle[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TagConfirmationBlockerStyle TAG_CONFIRMATION_BLOCKER_STYLE_FAILURE;
        public static final TagConfirmationBlockerStyle TAG_CONFIRMATION_BLOCKER_STYLE_SUCCESS;
        public static final TagConfirmationBlockerStyle TAG_CONFIRMATION_BLOCKER_STYLE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ TagConfirmationBlockerStyle[] $values() {
            return new TagConfirmationBlockerStyle[]{TAG_CONFIRMATION_BLOCKER_STYLE_UNSPECIFIED, TAG_CONFIRMATION_BLOCKER_STYLE_SUCCESS, TAG_CONFIRMATION_BLOCKER_STYLE_FAILURE};
        }

        static {
            final TagConfirmationBlockerStyle tagConfirmationBlockerStyle = new TagConfirmationBlockerStyle("TAG_CONFIRMATION_BLOCKER_STYLE_UNSPECIFIED", 0, 0);
            TAG_CONFIRMATION_BLOCKER_STYLE_UNSPECIFIED = tagConfirmationBlockerStyle;
            TAG_CONFIRMATION_BLOCKER_STYLE_SUCCESS = new TagConfirmationBlockerStyle("TAG_CONFIRMATION_BLOCKER_STYLE_SUCCESS", 1, 1);
            TAG_CONFIRMATION_BLOCKER_STYLE_FAILURE = new TagConfirmationBlockerStyle("TAG_CONFIRMATION_BLOCKER_STYLE_FAILURE", 2, 2);
            TagConfirmationBlockerStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TagConfirmationBlockerStyle.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, tagConfirmationBlockerStyle) { // from class: com.squareup.protos.franklin.api.TagConfirmationBlocker$TagConfirmationBlockerStyle$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TagConfirmationBlocker.TagConfirmationBlockerStyle fromValue(int value) {
                    return TagConfirmationBlocker.TagConfirmationBlockerStyle.INSTANCE.fromValue(value);
                }
            };
        }

        private TagConfirmationBlockerStyle(String str, int i, int i2) {
            this.value = i2;
        }

        public static final TagConfirmationBlockerStyle fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static TagConfirmationBlockerStyle valueOf(String str) {
            return (TagConfirmationBlockerStyle) Enum.valueOf(TagConfirmationBlockerStyle.class, str);
        }

        public static TagConfirmationBlockerStyle[] values() {
            return (TagConfirmationBlockerStyle[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/TagConfirmationBlocker$TagConfirmationBlockerStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/TagConfirmationBlocker$TagConfirmationBlockerStyle;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TagConfirmationBlockerStyle fromValue(int value) {
                if (value == 0) {
                    return TagConfirmationBlockerStyle.TAG_CONFIRMATION_BLOCKER_STYLE_UNSPECIFIED;
                }
                if (value == 1) {
                    return TagConfirmationBlockerStyle.TAG_CONFIRMATION_BLOCKER_STYLE_SUCCESS;
                }
                if (value != 2) {
                    return null;
                }
                return TagConfirmationBlockerStyle.TAG_CONFIRMATION_BLOCKER_STYLE_FAILURE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/TagConfirmationBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/TagConfirmationBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/TagConfirmationBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/TagConfirmationBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TagConfirmationBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
