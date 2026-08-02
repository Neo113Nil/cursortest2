package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.CashtagBlocker;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000e\r\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/CashtagBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CashtagBlocker$Builder;", "", "suggested_cashtag", "Ljava/lang/String;", "main_text", "subtitle", "label_text", "button_text", "Lcom/squareup/protos/franklin/api/CashtagBlocker$CashtagRestriction;", "cashtag_restriction", "Lcom/squareup/protos/franklin/api/CashtagBlocker$CashtagRestriction;", "Companion", "Builder", "CashtagRestriction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CashtagBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashtagBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String button_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.CashtagBlocker$CashtagRestriction#ADAPTER", schemaIndex = 5, tag = 6)
    public final CashtagRestriction cashtag_restriction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String label_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String main_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String suggested_cashtag;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/CashtagBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CashtagBlocker;", "<init>", "()V", "suggested_cashtag", "", "main_text", "subtitle", "label_text", "button_text", "cashtag_restriction", "Lcom/squareup/protos/franklin/api/CashtagBlocker$CashtagRestriction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String button_text;
        public CashtagRestriction cashtag_restriction;
        public String label_text;
        public String main_text;
        public String subtitle;
        public String suggested_cashtag;

        @Override // com.squareup.wire.Message.Builder
        public CashtagBlocker build() {
            return new CashtagBlocker(this.suggested_cashtag, this.main_text, this.subtitle, this.label_text, this.button_text, this.cashtag_restriction, buildUnknownFields());
        }

        public final Builder button_text(String button_text) {
            this.button_text = button_text;
            return this;
        }

        public final Builder cashtag_restriction(CashtagRestriction cashtag_restriction) {
            this.cashtag_restriction = cashtag_restriction;
            return this;
        }

        public final Builder label_text(String label_text) {
            this.label_text = label_text;
            return this;
        }

        public final Builder main_text(String main_text) {
            this.main_text = main_text;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder suggested_cashtag(String suggested_cashtag) {
            this.suggested_cashtag = suggested_cashtag;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CashtagBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CashtagBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public CashtagBlocker decode(ProtoReader reader) {
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
                        return new CashtagBlocker((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (CashtagBlocker.CashtagRestriction) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
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
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            try {
                                obj6 = CashtagBlocker.CashtagRestriction.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CashtagBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.suggested_cashtag);
                protoAdapter2.encodeWithTag(writer, 2, value.main_text);
                protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 4, value.label_text);
                protoAdapter2.encodeWithTag(writer, 5, value.button_text);
                CashtagBlocker.CashtagRestriction.ADAPTER.encodeWithTag(writer, 6, value.cashtag_restriction);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CashtagBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return CashtagBlocker.CashtagRestriction.ADAPTER.encodedSizeWithTag(6, value.cashtag_restriction) + protoAdapter2.encodedSizeWithTag(5, value.button_text) + protoAdapter2.encodedSizeWithTag(4, value.label_text) + protoAdapter2.encodedSizeWithTag(3, value.subtitle) + protoAdapter2.encodedSizeWithTag(2, value.main_text) + protoAdapter2.encodedSizeWithTag(1, value.suggested_cashtag) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CashtagBlocker redact(CashtagBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.main_text;
                String str2 = value.subtitle;
                String str3 = value.label_text;
                String str4 = value.button_text;
                CashtagBlocker.CashtagRestriction cashtagRestriction = value.cashtag_restriction;
                value.getClass();
                byteString.getClass();
                return new CashtagBlocker(null, str, str2, str3, str4, cashtagRestriction, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CashtagBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                CashtagBlocker.CashtagRestriction.ADAPTER.encodeWithTag(writer, 6, value.cashtag_restriction);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.button_text);
                protoAdapter2.encodeWithTag(writer, 4, value.label_text);
                protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 2, value.main_text);
                protoAdapter2.encodeWithTag(writer, 1, value.suggested_cashtag);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashtagBlocker(String str, String str2, String str3, String str4, String str5, CashtagRestriction cashtagRestriction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.suggested_cashtag = str;
        this.main_text = str2;
        this.subtitle = str3;
        this.label_text = str4;
        this.button_text = str5;
        this.cashtag_restriction = cashtagRestriction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashtagBlocker)) {
            return false;
        }
        CashtagBlocker cashtagBlocker = (CashtagBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), cashtagBlocker.unknownFields()) && Intrinsics.areEqual(this.suggested_cashtag, cashtagBlocker.suggested_cashtag) && Intrinsics.areEqual(this.main_text, cashtagBlocker.main_text) && Intrinsics.areEqual(this.subtitle, cashtagBlocker.subtitle) && Intrinsics.areEqual(this.label_text, cashtagBlocker.label_text) && Intrinsics.areEqual(this.button_text, cashtagBlocker.button_text) && this.cashtag_restriction == cashtagBlocker.cashtag_restriction;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.suggested_cashtag;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.main_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.subtitle;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.label_text;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.button_text;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        CashtagRestriction cashtagRestriction = this.cashtag_restriction;
        int hashCode7 = hashCode6 + (cashtagRestriction != null ? cashtagRestriction.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.suggested_cashtag = this.suggested_cashtag;
        builder.main_text = this.main_text;
        builder.subtitle = this.subtitle;
        builder.label_text = this.label_text;
        builder.button_text = this.button_text;
        builder.cashtag_restriction = this.cashtag_restriction;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.suggested_cashtag != null) {
            arrayList.add("suggested_cashtag=██");
        }
        String str = this.main_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "main_text=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        String str3 = this.label_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "label_text=", arrayList);
        }
        String str4 = this.button_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "button_text=", arrayList);
        }
        CashtagRestriction cashtagRestriction = this.cashtag_restriction;
        if (cashtagRestriction != null) {
            arrayList.add("cashtag_restriction=" + cashtagRestriction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashtagBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/CashtagBlocker$CashtagRestriction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "NO_CASHTAG_REUSE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CashtagRestriction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CashtagRestriction[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CashtagRestriction DEFAULT;
        public static final CashtagRestriction NO_CASHTAG_REUSE;
        private final int value;

        private static final /* synthetic */ CashtagRestriction[] $values() {
            return new CashtagRestriction[]{DEFAULT, NO_CASHTAG_REUSE};
        }

        static {
            final CashtagRestriction cashtagRestriction = new CashtagRestriction("DEFAULT", 0, 0);
            DEFAULT = cashtagRestriction;
            NO_CASHTAG_REUSE = new CashtagRestriction("NO_CASHTAG_REUSE", 1, 1);
            CashtagRestriction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CashtagRestriction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, cashtagRestriction) { // from class: com.squareup.protos.franklin.api.CashtagBlocker$CashtagRestriction$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public CashtagBlocker.CashtagRestriction fromValue(int value) {
                    return CashtagBlocker.CashtagRestriction.INSTANCE.fromValue(value);
                }
            };
        }

        private CashtagRestriction(String str, int i, int i2) {
            this.value = i2;
        }

        public static final CashtagRestriction fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static CashtagRestriction valueOf(String str) {
            return (CashtagRestriction) Enum.valueOf(CashtagRestriction.class, str);
        }

        public static CashtagRestriction[] values() {
            return (CashtagRestriction[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/CashtagBlocker$CashtagRestriction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/CashtagBlocker$CashtagRestriction;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CashtagRestriction fromValue(int value) {
                if (value == 0) {
                    return CashtagRestriction.DEFAULT;
                }
                if (value != 1) {
                    return null;
                }
                return CashtagRestriction.NO_CASHTAG_REUSE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CashtagBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CashtagBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CashtagBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CashtagBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CashtagBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
