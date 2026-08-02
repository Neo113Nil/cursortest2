package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, d2 = {"Lsquareup/cash/ui/arcade/elements/SectionHeader;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/SectionHeader$Builder;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "show_more_text", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SectionHeader extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SectionHeader> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString show_more_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalizedString title_text;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lsquareup/cash/ui/arcade/elements/SectionHeader$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/SectionHeader;", "<init>", "()V", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "show_more_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalizedString show_more_text;
        public LocalizedString title_text;

        @Override // com.squareup.wire.Message.Builder
        public SectionHeader build() {
            return new SectionHeader(this.title_text, this.show_more_text, buildUnknownFields());
        }

        public final Builder show_more_text(LocalizedString show_more_text) {
            this.show_more_text = show_more_text;
            return this;
        }

        public final Builder title_text(LocalizedString title_text) {
            this.title_text = title_text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SectionHeader.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.SectionHeader$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SectionHeader decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SectionHeader((LocalizedString) obj, (LocalizedString) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SectionHeader value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                protoAdapter2.encodeWithTag(writer, 2, value.show_more_text);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SectionHeader value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(2, value.show_more_text) + protoAdapter2.encodedSizeWithTag(1, value.title_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SectionHeader redact(SectionHeader value) {
                value.getClass();
                LocalizedString localizedString = value.title_text;
                LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                LocalizedString localizedString3 = value.show_more_text;
                LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new SectionHeader(localizedString2, localizedString4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SectionHeader value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 2, value.show_more_text);
                protoAdapter2.encodeWithTag(writer, 1, value.title_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionHeader(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title_text = localizedString;
        this.show_more_text = localizedString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionHeader)) {
            return false;
        }
        SectionHeader sectionHeader = (SectionHeader) obj;
        return Intrinsics.areEqual(unknownFields(), sectionHeader.unknownFields()) && Intrinsics.areEqual(this.title_text, sectionHeader.title_text) && Intrinsics.areEqual(this.show_more_text, sectionHeader.show_more_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title_text;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.show_more_text;
        int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title_text = this.title_text;
        builder.show_more_text = this.show_more_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.show_more_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("show_more_text=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SectionHeader{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/SectionHeader$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/SectionHeader$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/SectionHeader;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/SectionHeader;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SectionHeader build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
