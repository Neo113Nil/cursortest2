package squareup.cash.paychecks;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
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
import squareup.cash.paychecks.InvestingDestination;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\t\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lsquareup/cash/paychecks/InvestingDestination;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/InvestingDestination$Builder;", "", "investment_entity_token", "Ljava/lang/String;", "Lsquareup/cash/paychecks/InvestingDestination$UiSpecification;", "ui_specification", "Lsquareup/cash/paychecks/InvestingDestination$UiSpecification;", "Companion", "Builder", "UiSpecification", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InvestingDestination extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestingDestination> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String investment_entity_token;

    @WireField(adapter = "squareup.cash.paychecks.InvestingDestination$UiSpecification#ADAPTER", schemaIndex = 1, tag = 4)
    public final UiSpecification ui_specification;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/paychecks/InvestingDestination$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/paychecks/InvestingDestination;", "<init>", "()V", "investment_entity_token", "", "ui_specification", "Lsquareup/cash/paychecks/InvestingDestination$UiSpecification;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String investment_entity_token;
        public UiSpecification ui_specification;

        @Override // com.squareup.wire.Message.Builder
        public InvestingDestination build() {
            return new InvestingDestination(this.investment_entity_token, this.ui_specification, buildUnknownFields());
        }

        public final Builder investment_entity_token(String investment_entity_token) {
            this.investment_entity_token = investment_entity_token;
            return this;
        }

        public final Builder ui_specification(UiSpecification ui_specification) {
            this.ui_specification = ui_specification;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InvestingDestination.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.paychecks.InvestingDestination$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public InvestingDestination decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new InvestingDestination((String) obj, (InvestingDestination.UiSpecification) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(InvestingDestination.UiSpecification.ADAPTER, reader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestingDestination value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.investment_entity_token);
                InvestingDestination.UiSpecification.ADAPTER.encodeWithTag(writer, 4, value.ui_specification);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestingDestination value) {
                value.getClass();
                return InvestingDestination.UiSpecification.ADAPTER.encodedSizeWithTag(4, value.ui_specification) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.investment_entity_token) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestingDestination redact(InvestingDestination value) {
                value.getClass();
                InvestingDestination.UiSpecification uiSpecification = value.ui_specification;
                InvestingDestination.UiSpecification uiSpecification2 = uiSpecification != null ? (InvestingDestination.UiSpecification) InvestingDestination.UiSpecification.ADAPTER.redact(uiSpecification) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.investment_entity_token;
                byteString.getClass();
                return new InvestingDestination(str, uiSpecification2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestingDestination value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                InvestingDestination.UiSpecification.ADAPTER.encodeWithTag(writer, 4, value.ui_specification);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.investment_entity_token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingDestination(String str, UiSpecification uiSpecification, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.investment_entity_token = str;
        this.ui_specification = uiSpecification;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestingDestination)) {
            return false;
        }
        InvestingDestination investingDestination = (InvestingDestination) obj;
        return Intrinsics.areEqual(unknownFields(), investingDestination.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, investingDestination.investment_entity_token) && Intrinsics.areEqual(this.ui_specification, investingDestination.ui_specification);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        UiSpecification uiSpecification = this.ui_specification;
        int hashCode3 = hashCode2 + (uiSpecification != null ? uiSpecification.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.investment_entity_token = this.investment_entity_token;
        builder.ui_specification = this.ui_specification;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        UiSpecification uiSpecification = this.ui_specification;
        if (uiSpecification != null) {
            arrayList.add("ui_specification=" + uiSpecification);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestingDestination{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lsquareup/cash/paychecks/InvestingDestination$UiSpecification;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/InvestingDestination$UiSpecification$Builder;", "display_name", "", "symbol", "icon", "Lcom/squareup/protos/cash/ui/Image;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Image;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UiSpecification extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UiSpecification> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String display_name;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 2, tag = 3)
        public final Image icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String symbol;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lsquareup/cash/paychecks/InvestingDestination$UiSpecification$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/paychecks/InvestingDestination$UiSpecification;", "<init>", "()V", "display_name", "", "symbol", "icon", "Lcom/squareup/protos/cash/ui/Image;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String display_name;
            public Image icon;
            public String symbol;

            @Override // com.squareup.wire.Message.Builder
            public UiSpecification build() {
                return new UiSpecification(this.display_name, this.symbol, this.icon, buildUnknownFields());
            }

            public final Builder display_name(String display_name) {
                this.display_name = display_name;
                return this;
            }

            public final Builder icon(Image icon) {
                this.icon = icon;
                return this;
            }

            public final Builder symbol(String symbol) {
                this.symbol = symbol;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UiSpecification.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.paychecks.InvestingDestination$UiSpecification$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InvestingDestination.UiSpecification decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InvestingDestination.UiSpecification((String) obj, (String) obj2, (Image) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj3);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InvestingDestination.UiSpecification value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.display_name);
                    protoAdapter2.encodeWithTag(writer, 2, value.symbol);
                    Image.ADAPTER.encodeWithTag(writer, 3, value.icon);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InvestingDestination.UiSpecification value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return Image.ADAPTER.encodedSizeWithTag(3, value.icon) + protoAdapter2.encodedSizeWithTag(2, value.symbol) + protoAdapter2.encodedSizeWithTag(1, value.display_name) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InvestingDestination.UiSpecification redact(InvestingDestination.UiSpecification value) {
                    value.getClass();
                    Image image = value.icon;
                    return InvestingDestination.UiSpecification.copy$default(value, null, null, image != null ? (Image) Image.ADAPTER.redact(image) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InvestingDestination.UiSpecification value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Image.ADAPTER.encodeWithTag(writer, 3, value.icon);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.symbol);
                    protoAdapter2.encodeWithTag(writer, 1, value.display_name);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ UiSpecification(String str, String str2, Image image, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : image, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ UiSpecification copy$default(UiSpecification uiSpecification, String str, String str2, Image image, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiSpecification.display_name;
            }
            if ((i & 2) != 0) {
                str2 = uiSpecification.symbol;
            }
            if ((i & 4) != 0) {
                image = uiSpecification.icon;
            }
            if ((i & 8) != 0) {
                byteString = uiSpecification.unknownFields();
            }
            return uiSpecification.copy(str, str2, image, byteString);
        }

        public final UiSpecification copy(String display_name, String symbol, Image icon, ByteString unknownFields) {
            unknownFields.getClass();
            return new UiSpecification(display_name, symbol, icon, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof UiSpecification)) {
                return false;
            }
            UiSpecification uiSpecification = (UiSpecification) other;
            return Intrinsics.areEqual(unknownFields(), uiSpecification.unknownFields()) && Intrinsics.areEqual(this.display_name, uiSpecification.display_name) && Intrinsics.areEqual(this.symbol, uiSpecification.symbol) && Intrinsics.areEqual(this.icon, uiSpecification.icon);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.display_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.symbol;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Image image = this.icon;
            int hashCode4 = hashCode3 + (image != null ? image.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.display_name = this.display_name;
            builder.symbol = this.symbol;
            builder.icon = this.icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.display_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
            }
            String str2 = this.symbol;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "symbol=", arrayList);
            }
            Image image = this.icon;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UiSpecification{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/paychecks/InvestingDestination$UiSpecification$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/paychecks/InvestingDestination$UiSpecification$Builder;", "", "body", "Lsquareup/cash/paychecks/InvestingDestination$UiSpecification;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/paychecks/InvestingDestination$UiSpecification;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ UiSpecification build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public UiSpecification() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UiSpecification(String str, String str2, Image image, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.display_name = str;
            this.symbol = str2;
            this.icon = image;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/paychecks/InvestingDestination$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/paychecks/InvestingDestination$Builder;", "", "body", "Lsquareup/cash/paychecks/InvestingDestination;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/paychecks/InvestingDestination;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InvestingDestination build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
