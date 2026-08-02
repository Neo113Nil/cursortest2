package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lsquareup/cash/ui/arcade/elements/PageHeader;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/PageHeader$Builder;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "header", "Lcom/squareup/protos/cash/localization/LocalizedString;", "body", "Lsquareup/cash/ui/arcade/elements/HorizontalAlignment;", "horizontal_alignment", "Lsquareup/cash/ui/arcade/elements/HorizontalAlignment;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PageHeader extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PageHeader> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", schemaIndex = 0, tag = 1)
    public final UiAvatar avatar;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
    public final LocalizedString body;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString header;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.HorizontalAlignment#ADAPTER", schemaIndex = 3, tag = 4)
    public final HorizontalAlignment horizontal_alignment;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lsquareup/cash/ui/arcade/elements/PageHeader$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/PageHeader;", "<init>", "()V", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "header", "Lcom/squareup/protos/cash/localization/LocalizedString;", "body", "horizontal_alignment", "Lsquareup/cash/ui/arcade/elements/HorizontalAlignment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public UiAvatar avatar;
        public LocalizedString body;
        public LocalizedString header;
        public HorizontalAlignment horizontal_alignment;

        public final Builder avatar(UiAvatar avatar) {
            this.avatar = avatar;
            return this;
        }

        public final Builder body(LocalizedString body) {
            this.body = body;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PageHeader build() {
            return new PageHeader(this.avatar, this.header, this.body, this.horizontal_alignment, buildUnknownFields());
        }

        public final Builder header(LocalizedString header) {
            this.header = header;
            return this;
        }

        public final Builder horizontal_alignment(HorizontalAlignment horizontal_alignment) {
            this.horizontal_alignment = horizontal_alignment;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PageHeader.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.PageHeader$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PageHeader decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PageHeader((UiAvatar) obj, (LocalizedString) obj2, (LocalizedString) obj3, (HorizontalAlignment) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj4 = HorizontalAlignment.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PageHeader value) {
                writer.getClass();
                value.getClass();
                UiAvatar.ADAPTER.encodeWithTag(writer, 1, value.avatar);
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 2, value.header);
                protoAdapter2.encodeWithTag(writer, 3, value.body);
                HorizontalAlignment.ADAPTER.encodeWithTag(writer, 4, value.horizontal_alignment);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PageHeader value) {
                value.getClass();
                int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(1, value.avatar) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                return HorizontalAlignment.ADAPTER.encodedSizeWithTag(4, value.horizontal_alignment) + protoAdapter2.encodedSizeWithTag(3, value.body) + protoAdapter2.encodedSizeWithTag(2, value.header) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PageHeader redact(PageHeader value) {
                value.getClass();
                UiAvatar uiAvatar = value.avatar;
                UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
                LocalizedString localizedString = value.header;
                LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                LocalizedString localizedString3 = value.body;
                LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                ByteString byteString = ByteString.EMPTY;
                HorizontalAlignment horizontalAlignment = value.horizontal_alignment;
                byteString.getClass();
                return new PageHeader(uiAvatar2, localizedString2, localizedString4, horizontalAlignment, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PageHeader value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                HorizontalAlignment.ADAPTER.encodeWithTag(writer, 4, value.horizontal_alignment);
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 3, value.body);
                protoAdapter2.encodeWithTag(writer, 2, value.header);
                UiAvatar.ADAPTER.encodeWithTag(writer, 1, value.avatar);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageHeader(UiAvatar uiAvatar, LocalizedString localizedString, LocalizedString localizedString2, HorizontalAlignment horizontalAlignment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.avatar = uiAvatar;
        this.header = localizedString;
        this.body = localizedString2;
        this.horizontal_alignment = horizontalAlignment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PageHeader)) {
            return false;
        }
        PageHeader pageHeader = (PageHeader) obj;
        return Intrinsics.areEqual(unknownFields(), pageHeader.unknownFields()) && Intrinsics.areEqual(this.avatar, pageHeader.avatar) && Intrinsics.areEqual(this.header, pageHeader.header) && Intrinsics.areEqual(this.body, pageHeader.body) && this.horizontal_alignment == pageHeader.horizontal_alignment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiAvatar uiAvatar = this.avatar;
        int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.header;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.body;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        HorizontalAlignment horizontalAlignment = this.horizontal_alignment;
        int hashCode5 = hashCode4 + (horizontalAlignment != null ? horizontalAlignment.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.avatar = this.avatar;
        builder.header = this.header;
        builder.body = this.body;
        builder.horizontal_alignment = this.horizontal_alignment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiAvatar uiAvatar = this.avatar;
        if (uiAvatar != null) {
            Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
        }
        LocalizedString localizedString = this.header;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("header=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.body;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
        }
        HorizontalAlignment horizontalAlignment = this.horizontal_alignment;
        if (horizontalAlignment != null) {
            arrayList.add("horizontal_alignment=" + horizontalAlignment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PageHeader{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/PageHeader$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/PageHeader$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/PageHeader;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/PageHeader;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PageHeader build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
