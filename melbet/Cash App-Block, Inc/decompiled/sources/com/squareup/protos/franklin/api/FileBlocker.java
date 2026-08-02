package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FileBlocker;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/FileBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/FileBlocker$Builder;", "Lcom/squareup/protos/franklin/api/FileCategory;", "category", "Lcom/squareup/protos/franklin/api/FileCategory;", "", "footer_text", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/FileBlocker$FooterIcon;", "footer_icon", "Lcom/squareup/protos/franklin/api/FileBlocker$FooterIcon;", "Companion", "Builder", "FooterIcon", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FileBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.FileCategory#ADAPTER", schemaIndex = 0, tag = 1)
    public final FileCategory category;

    @WireField(adapter = "com.squareup.protos.franklin.api.FileBlocker$FooterIcon#ADAPTER", schemaIndex = 2, tag = 6)
    public final FooterIcon footer_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 5)
    public final String footer_text;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/FileBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/FileBlocker;", "<init>", "()V", "category", "Lcom/squareup/protos/franklin/api/FileCategory;", "footer_text", "", "footer_icon", "Lcom/squareup/protos/franklin/api/FileBlocker$FooterIcon;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public FileCategory category;
        public FooterIcon footer_icon;
        public String footer_text;

        @Override // com.squareup.wire.Message.Builder
        public FileBlocker build() {
            return new FileBlocker(this.category, this.footer_text, this.footer_icon, buildUnknownFields());
        }

        public final Builder category(FileCategory category) {
            this.category = category;
            return this;
        }

        public final Builder footer_icon(FooterIcon footer_icon) {
            this.footer_icon = footer_icon;
            return this;
        }

        public final Builder footer_text(String footer_text) {
            this.footer_text = footer_text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FileBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FileBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public FileBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new FileBlocker((FileCategory) obj, (String) obj2, (FileBlocker.FooterIcon) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = FileCategory.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 5) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 6) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = FileBlocker.FooterIcon.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FileBlocker value) {
                writer.getClass();
                value.getClass();
                FileCategory.ADAPTER.encodeWithTag(writer, 1, value.category);
                ProtoAdapter.STRING.encodeWithTag(writer, 5, value.footer_text);
                FileBlocker.FooterIcon.ADAPTER.encodeWithTag(writer, 6, value.footer_icon);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FileBlocker value) {
                value.getClass();
                return FileBlocker.FooterIcon.ADAPTER.encodedSizeWithTag(6, value.footer_icon) + ProtoAdapter.STRING.encodedSizeWithTag(5, value.footer_text) + FileCategory.ADAPTER.encodedSizeWithTag(1, value.category) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FileBlocker redact(FileBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                FileCategory fileCategory = value.category;
                String str = value.footer_text;
                FileBlocker.FooterIcon footerIcon = value.footer_icon;
                value.getClass();
                byteString.getClass();
                return new FileBlocker(fileCategory, str, footerIcon, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FileBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                FileBlocker.FooterIcon.ADAPTER.encodeWithTag(writer, 6, value.footer_icon);
                ProtoAdapter.STRING.encodeWithTag(writer, 5, value.footer_text);
                FileCategory.ADAPTER.encodeWithTag(writer, 1, value.category);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileBlocker(FileCategory fileCategory, String str, FooterIcon footerIcon, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.category = fileCategory;
        this.footer_text = str;
        this.footer_icon = footerIcon;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FileBlocker)) {
            return false;
        }
        FileBlocker fileBlocker = (FileBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), fileBlocker.unknownFields()) && this.category == fileBlocker.category && Intrinsics.areEqual(this.footer_text, fileBlocker.footer_text) && this.footer_icon == fileBlocker.footer_icon;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FileCategory fileCategory = this.category;
        int hashCode2 = (hashCode + (fileCategory != null ? fileCategory.hashCode() : 0)) * 37;
        String str = this.footer_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        FooterIcon footerIcon = this.footer_icon;
        int hashCode4 = hashCode3 + (footerIcon != null ? footerIcon.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.category = this.category;
        builder.footer_text = this.footer_text;
        builder.footer_icon = this.footer_icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FileCategory fileCategory = this.category;
        if (fileCategory != null) {
            arrayList.add("category=" + fileCategory);
        }
        String str = this.footer_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "footer_text=", arrayList);
        }
        FooterIcon footerIcon = this.footer_icon;
        if (footerIcon != null) {
            arrayList.add("footer_icon=" + footerIcon);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FileBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/FileBlocker$FooterIcon;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOCK", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class FooterIcon implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FooterIcon[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FooterIcon LOCK = new FooterIcon("LOCK", 0, 1);
        private final int value;

        private static final /* synthetic */ FooterIcon[] $values() {
            return new FooterIcon[]{LOCK};
        }

        static {
            FooterIcon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FooterIcon.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FileBlocker$FooterIcon$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public FileBlocker.FooterIcon fromValue(int value) {
                    return FileBlocker.FooterIcon.INSTANCE.fromValue(value);
                }
            };
        }

        private FooterIcon(String str, int i, int i2) {
            this.value = i2;
        }

        public static final FooterIcon fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static FooterIcon valueOf(String str) {
            return (FooterIcon) Enum.valueOf(FooterIcon.class, str);
        }

        public static FooterIcon[] values() {
            return (FooterIcon[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/FileBlocker$FooterIcon$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/FileBlocker$FooterIcon;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FooterIcon fromValue(int value) {
                if (value == 1) {
                    return FooterIcon.LOCK;
                }
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/FileBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/FileBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/FileBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/FileBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ FileBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
