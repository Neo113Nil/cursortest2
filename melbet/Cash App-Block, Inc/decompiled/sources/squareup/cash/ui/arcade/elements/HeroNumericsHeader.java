package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
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
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0012\u0011\u0013\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005¨\u0006\u0015"}, d2 = {"Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$Builder;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$BodyText;", "body_text", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$BodyText;", "additional_body_text", "Lsquareup/cash/ui/arcade/elements/HorizontalAlignment;", "horizontal_alignment", "Lsquareup/cash/ui/arcade/elements/HorizontalAlignment;", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$AccessibilityMode;", "accessibility_mode", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$AccessibilityMode;", "section_title_text", "Companion", "Builder", "BodyText", "AccessibilityMode", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HeroNumericsHeader extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HeroNumericsHeader> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.HeroNumericsHeader$AccessibilityMode#ADAPTER", schemaIndex = 4, tag = 7)
    public final AccessibilityMode accessibility_mode;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
    public final LocalizedString additional_body_text;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.HeroNumericsHeader$BodyText#ADAPTER", schemaIndex = 1, tag = 2)
    public final BodyText body_text;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.HorizontalAlignment#ADAPTER", schemaIndex = 3, tag = 4)
    public final HorizontalAlignment horizontal_alignment;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 5, tag = 8)
    public final LocalizedString section_title_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalizedString title_text;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader;", "<init>", "()V", "title_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "body_text", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$BodyText;", "additional_body_text", "horizontal_alignment", "Lsquareup/cash/ui/arcade/elements/HorizontalAlignment;", "accessibility_mode", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$AccessibilityMode;", "section_title_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public AccessibilityMode accessibility_mode;
        public LocalizedString additional_body_text;
        public BodyText body_text;
        public HorizontalAlignment horizontal_alignment;
        public LocalizedString section_title_text;
        public LocalizedString title_text;

        public final Builder accessibility_mode(AccessibilityMode accessibility_mode) {
            this.accessibility_mode = accessibility_mode;
            return this;
        }

        public final Builder additional_body_text(LocalizedString additional_body_text) {
            this.additional_body_text = additional_body_text;
            return this;
        }

        public final Builder body_text(BodyText body_text) {
            this.body_text = body_text;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public HeroNumericsHeader build() {
            return new HeroNumericsHeader(this.title_text, this.body_text, this.additional_body_text, this.horizontal_alignment, this.accessibility_mode, this.section_title_text, buildUnknownFields());
        }

        public final Builder horizontal_alignment(HorizontalAlignment horizontal_alignment) {
            this.horizontal_alignment = horizontal_alignment;
            return this;
        }

        public final Builder section_title_text(LocalizedString section_title_text) {
            this.section_title_text = section_title_text;
            return this;
        }

        public final Builder title_text(LocalizedString title_text) {
            this.title_text = title_text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HeroNumericsHeader.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.HeroNumericsHeader$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public HeroNumericsHeader decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new HeroNumericsHeader((LocalizedString) obj, (HeroNumericsHeader.BodyText) obj2, (LocalizedString) obj3, (HorizontalAlignment) obj4, (HeroNumericsHeader.AccessibilityMode) obj5, (LocalizedString) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(HeroNumericsHeader.BodyText.ADAPTER, reader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                    } else if (nextTag == 4) {
                        try {
                            obj4 = HorizontalAlignment.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 7) {
                        try {
                            obj5 = HeroNumericsHeader.AccessibilityMode.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (nextTag != 8) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj6);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HeroNumericsHeader value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                HeroNumericsHeader.BodyText.ADAPTER.encodeWithTag(writer, 2, value.body_text);
                protoAdapter2.encodeWithTag(writer, 3, value.additional_body_text);
                HorizontalAlignment.ADAPTER.encodeWithTag(writer, 4, value.horizontal_alignment);
                HeroNumericsHeader.AccessibilityMode.ADAPTER.encodeWithTag(writer, 7, value.accessibility_mode);
                protoAdapter2.encodeWithTag(writer, 8, value.section_title_text);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HeroNumericsHeader value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(8, value.section_title_text) + HeroNumericsHeader.AccessibilityMode.ADAPTER.encodedSizeWithTag(7, value.accessibility_mode) + HorizontalAlignment.ADAPTER.encodedSizeWithTag(4, value.horizontal_alignment) + protoAdapter2.encodedSizeWithTag(3, value.additional_body_text) + HeroNumericsHeader.BodyText.ADAPTER.encodedSizeWithTag(2, value.body_text) + protoAdapter2.encodedSizeWithTag(1, value.title_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HeroNumericsHeader redact(HeroNumericsHeader value) {
                value.getClass();
                LocalizedString localizedString = value.title_text;
                LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                HeroNumericsHeader.BodyText bodyText = value.body_text;
                HeroNumericsHeader.BodyText bodyText2 = bodyText != null ? (HeroNumericsHeader.BodyText) HeroNumericsHeader.BodyText.ADAPTER.redact(bodyText) : null;
                LocalizedString localizedString3 = value.additional_body_text;
                LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                LocalizedString localizedString5 = value.section_title_text;
                LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
                ByteString byteString = ByteString.EMPTY;
                HorizontalAlignment horizontalAlignment = value.horizontal_alignment;
                HeroNumericsHeader.AccessibilityMode accessibilityMode = value.accessibility_mode;
                byteString.getClass();
                return new HeroNumericsHeader(localizedString2, bodyText2, localizedString4, horizontalAlignment, accessibilityMode, localizedString6, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HeroNumericsHeader value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 8, value.section_title_text);
                HeroNumericsHeader.AccessibilityMode.ADAPTER.encodeWithTag(writer, 7, value.accessibility_mode);
                HorizontalAlignment.ADAPTER.encodeWithTag(writer, 4, value.horizontal_alignment);
                protoAdapter2.encodeWithTag(writer, 3, value.additional_body_text);
                HeroNumericsHeader.BodyText.ADAPTER.encodeWithTag(writer, 2, value.body_text);
                protoAdapter2.encodeWithTag(writer, 1, value.title_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroNumericsHeader(LocalizedString localizedString, BodyText bodyText, LocalizedString localizedString2, HorizontalAlignment horizontalAlignment, AccessibilityMode accessibilityMode, LocalizedString localizedString3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title_text = localizedString;
        this.body_text = bodyText;
        this.additional_body_text = localizedString2;
        this.horizontal_alignment = horizontalAlignment;
        this.accessibility_mode = accessibilityMode;
        this.section_title_text = localizedString3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeroNumericsHeader)) {
            return false;
        }
        HeroNumericsHeader heroNumericsHeader = (HeroNumericsHeader) obj;
        return Intrinsics.areEqual(unknownFields(), heroNumericsHeader.unknownFields()) && Intrinsics.areEqual(this.title_text, heroNumericsHeader.title_text) && Intrinsics.areEqual(this.body_text, heroNumericsHeader.body_text) && Intrinsics.areEqual(this.additional_body_text, heroNumericsHeader.additional_body_text) && this.horizontal_alignment == heroNumericsHeader.horizontal_alignment && this.accessibility_mode == heroNumericsHeader.accessibility_mode && Intrinsics.areEqual(this.section_title_text, heroNumericsHeader.section_title_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title_text;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        BodyText bodyText = this.body_text;
        int hashCode3 = (hashCode2 + (bodyText != null ? bodyText.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.additional_body_text;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        HorizontalAlignment horizontalAlignment = this.horizontal_alignment;
        int hashCode5 = (hashCode4 + (horizontalAlignment != null ? horizontalAlignment.hashCode() : 0)) * 37;
        AccessibilityMode accessibilityMode = this.accessibility_mode;
        int hashCode6 = (hashCode5 + (accessibilityMode != null ? accessibilityMode.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.section_title_text;
        int hashCode7 = hashCode6 + (localizedString3 != null ? localizedString3.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title_text = this.title_text;
        builder.body_text = this.body_text;
        builder.additional_body_text = this.additional_body_text;
        builder.horizontal_alignment = this.horizontal_alignment;
        builder.accessibility_mode = this.accessibility_mode;
        builder.section_title_text = this.section_title_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
        }
        BodyText bodyText = this.body_text;
        if (bodyText != null) {
            arrayList.add("body_text=" + bodyText);
        }
        LocalizedString localizedString2 = this.additional_body_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("additional_body_text=", localizedString2, arrayList);
        }
        HorizontalAlignment horizontalAlignment = this.horizontal_alignment;
        if (horizontalAlignment != null) {
            arrayList.add("horizontal_alignment=" + horizontalAlignment);
        }
        AccessibilityMode accessibilityMode = this.accessibility_mode;
        if (accessibilityMode != null) {
            arrayList.add("accessibility_mode=" + accessibilityMode);
        }
        LocalizedString localizedString3 = this.section_title_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("section_title_text=", localizedString3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HeroNumericsHeader{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$AccessibilityMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLIENT_COULD_NOT_PARSE_AX_MODE", "COMBINED_INTO_LABEL", "VALUE_AND_LABEL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AccessibilityMode implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccessibilityMode[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final AccessibilityMode CLIENT_COULD_NOT_PARSE_AX_MODE;
        public static final AccessibilityMode COMBINED_INTO_LABEL;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AccessibilityMode VALUE_AND_LABEL;
        private final int value;

        private static final /* synthetic */ AccessibilityMode[] $values() {
            return new AccessibilityMode[]{CLIENT_COULD_NOT_PARSE_AX_MODE, COMBINED_INTO_LABEL, VALUE_AND_LABEL};
        }

        static {
            final AccessibilityMode accessibilityMode = new AccessibilityMode("CLIENT_COULD_NOT_PARSE_AX_MODE", 0, 0);
            CLIENT_COULD_NOT_PARSE_AX_MODE = accessibilityMode;
            COMBINED_INTO_LABEL = new AccessibilityMode("COMBINED_INTO_LABEL", 1, 1);
            VALUE_AND_LABEL = new AccessibilityMode("VALUE_AND_LABEL", 2, 2);
            AccessibilityMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AccessibilityMode.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, accessibilityMode) { // from class: squareup.cash.ui.arcade.elements.HeroNumericsHeader$AccessibilityMode$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public HeroNumericsHeader.AccessibilityMode fromValue(int value) {
                    return HeroNumericsHeader.AccessibilityMode.INSTANCE.fromValue(value);
                }
            };
        }

        private AccessibilityMode(String str, int i, int i2) {
            this.value = i2;
        }

        public static final AccessibilityMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static AccessibilityMode valueOf(String str) {
            return (AccessibilityMode) Enum.valueOf(AccessibilityMode.class, str);
        }

        public static AccessibilityMode[] values() {
            return (AccessibilityMode[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$AccessibilityMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$AccessibilityMode;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AccessibilityMode fromValue(int value) {
                if (value == 0) {
                    return AccessibilityMode.CLIENT_COULD_NOT_PARSE_AX_MODE;
                }
                if (value == 1) {
                    return AccessibilityMode.COMBINED_INTO_LABEL;
                }
                if (value != 2) {
                    return null;
                }
                return AccessibilityMode.VALUE_AND_LABEL;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016JL\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$BodyText;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$BodyText$Builder;", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "tint_color", "Lcom/squareup/protos/cash/ui/Color;", "sq_accessibility_hint", "markdown_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/ui/Icon;Lcom/squareup/protos/cash/ui/Color;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BodyText extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BodyText> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 1, tag = 2)
        public final Icon icon;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 4, tag = 5)
        public final LocalizedString markdown_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalizedString sq_accessibility_hint;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString text;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 2, tag = 3)
        public final Color tint_color;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$BodyText$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$BodyText;", "<init>", "()V", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "tint_color", "Lcom/squareup/protos/cash/ui/Color;", "sq_accessibility_hint", "markdown_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Icon icon;
            public LocalizedString markdown_text;
            public LocalizedString sq_accessibility_hint;
            public LocalizedString text;
            public Color tint_color;

            @Override // com.squareup.wire.Message.Builder
            public BodyText build() {
                return new BodyText(this.text, this.icon, this.tint_color, this.sq_accessibility_hint, this.markdown_text, buildUnknownFields());
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder markdown_text(LocalizedString markdown_text) {
                this.markdown_text = markdown_text;
                return this;
            }

            public final Builder sq_accessibility_hint(LocalizedString sq_accessibility_hint) {
                this.sq_accessibility_hint = sq_accessibility_hint;
                return this;
            }

            public final Builder text(LocalizedString text) {
                this.text = text;
                return this;
            }

            public final Builder tint_color(Color tint_color) {
                this.tint_color = tint_color;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BodyText.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.HeroNumericsHeader$BodyText$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public HeroNumericsHeader.BodyText decode(ProtoReader reader) {
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
                            return new HeroNumericsHeader.BodyText((LocalizedString) obj, (Icon) obj2, (Color) obj3, (LocalizedString) obj4, (LocalizedString) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj3);
                        } else if (nextTag == 4) {
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj5);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, HeroNumericsHeader.BodyText value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.text);
                    Icon.ADAPTER.encodeWithTag(writer, 2, value.icon);
                    Color.ADAPTER.encodeWithTag(writer, 3, value.tint_color);
                    protoAdapter2.encodeWithTag(writer, 4, value.sq_accessibility_hint);
                    protoAdapter2.encodeWithTag(writer, 5, value.markdown_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(HeroNumericsHeader.BodyText value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(5, value.markdown_text) + protoAdapter2.encodedSizeWithTag(4, value.sq_accessibility_hint) + Color.ADAPTER.encodedSizeWithTag(3, value.tint_color) + Icon.ADAPTER.encodedSizeWithTag(2, value.icon) + protoAdapter2.encodedSizeWithTag(1, value.text) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public HeroNumericsHeader.BodyText redact(HeroNumericsHeader.BodyText value) {
                    value.getClass();
                    LocalizedString localizedString = value.text;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    Icon icon = value.icon;
                    Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                    Color color = value.tint_color;
                    Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                    LocalizedString localizedString3 = value.sq_accessibility_hint;
                    LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                    LocalizedString localizedString5 = value.markdown_text;
                    return value.copy(localizedString2, icon2, color2, localizedString4, localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, HeroNumericsHeader.BodyText value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 5, value.markdown_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.sq_accessibility_hint);
                    Color.ADAPTER.encodeWithTag(writer, 3, value.tint_color);
                    Icon.ADAPTER.encodeWithTag(writer, 2, value.icon);
                    protoAdapter2.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ BodyText(LocalizedString localizedString, Icon icon, Color color, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? null : color, (i & 8) != 0 ? null : localizedString2, (i & 16) != 0 ? null : localizedString3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ BodyText copy$default(BodyText bodyText, LocalizedString localizedString, Icon icon, Color color, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizedString = bodyText.text;
            }
            if ((i & 2) != 0) {
                icon = bodyText.icon;
            }
            if ((i & 4) != 0) {
                color = bodyText.tint_color;
            }
            if ((i & 8) != 0) {
                localizedString2 = bodyText.sq_accessibility_hint;
            }
            if ((i & 16) != 0) {
                localizedString3 = bodyText.markdown_text;
            }
            if ((i & 32) != 0) {
                byteString = bodyText.unknownFields();
            }
            LocalizedString localizedString4 = localizedString3;
            ByteString byteString2 = byteString;
            return bodyText.copy(localizedString, icon, color, localizedString2, localizedString4, byteString2);
        }

        public final BodyText copy(LocalizedString text, Icon icon, Color tint_color, LocalizedString sq_accessibility_hint, LocalizedString markdown_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new BodyText(text, icon, tint_color, sq_accessibility_hint, markdown_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BodyText)) {
                return false;
            }
            BodyText bodyText = (BodyText) other;
            return Intrinsics.areEqual(unknownFields(), bodyText.unknownFields()) && Intrinsics.areEqual(this.text, bodyText.text) && Intrinsics.areEqual(this.icon, bodyText.icon) && Intrinsics.areEqual(this.tint_color, bodyText.tint_color) && Intrinsics.areEqual(this.sq_accessibility_hint, bodyText.sq_accessibility_hint) && Intrinsics.areEqual(this.markdown_text, bodyText.markdown_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
            Color color = this.tint_color;
            int hashCode4 = (hashCode3 + (color != null ? color.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.sq_accessibility_hint;
            int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.markdown_text;
            int hashCode6 = hashCode5 + (localizedString3 != null ? localizedString3.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.icon = this.icon;
            builder.tint_color = this.tint_color;
            builder.sq_accessibility_hint = this.sq_accessibility_hint;
            builder.markdown_text = this.markdown_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            Color color = this.tint_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
            }
            LocalizedString localizedString2 = this.sq_accessibility_hint;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("sq_accessibility_hint=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.markdown_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("markdown_text=", localizedString3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BodyText{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$BodyText$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$BodyText$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$BodyText;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$BodyText;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BodyText build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public BodyText() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BodyText(LocalizedString localizedString, Icon icon, Color color, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = localizedString;
            this.icon = icon;
            this.tint_color = color;
            this.sq_accessibility_hint = localizedString2;
            this.markdown_text = localizedString3;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/HeroNumericsHeader;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ HeroNumericsHeader build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
