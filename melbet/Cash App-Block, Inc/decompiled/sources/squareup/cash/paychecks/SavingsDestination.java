package squareup.cash.paychecks;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.paychecks.SavingsDestination;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\n\t\u000b\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/SavingsDestination$Builder;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier;", "identifier", "Lsquareup/cash/paychecks/SavingsDestination$Identifier;", "Lsquareup/cash/paychecks/SavingsDestination$UiSpecification;", "ui_specification", "Lsquareup/cash/paychecks/SavingsDestination$UiSpecification;", "Companion", "Builder", "Identifier", "UiSpecification", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SavingsDestination extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsDestination> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "squareup.cash.paychecks.SavingsDestination$Identifier#ADAPTER", schemaIndex = 0, tag = 1)
    public final Identifier identifier;

    @WireField(adapter = "squareup.cash.paychecks.SavingsDestination$UiSpecification#ADAPTER", schemaIndex = 1, tag = 2)
    public final UiSpecification ui_specification;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/paychecks/SavingsDestination;", "<init>", "()V", "identifier", "Lsquareup/cash/paychecks/SavingsDestination$Identifier;", "ui_specification", "Lsquareup/cash/paychecks/SavingsDestination$UiSpecification;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Identifier identifier;
        public UiSpecification ui_specification;

        @Override // com.squareup.wire.Message.Builder
        public SavingsDestination build() {
            return new SavingsDestination(this.identifier, this.ui_specification, buildUnknownFields());
        }

        public final Builder identifier(Identifier identifier) {
            this.identifier = identifier;
            return this;
        }

        public final Builder ui_specification(UiSpecification ui_specification) {
            this.ui_specification = ui_specification;
            return this;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$Builder;", "type", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$Type;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsquareup/cash/paychecks/SavingsDestination$Identifier$Type;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Type", "Companion", "GeneralFolder", "GoalFolder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Identifier extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Identifier> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final Type type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier;", "<init>", "()V", "type", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$Type;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Type type;

            @Override // com.squareup.wire.Message.Builder
            public Identifier build() {
                return new Identifier(this.type, buildUnknownFields());
            }

            public final Builder type(Type type2) {
                this.type = type2;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Identifier.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.paychecks.SavingsDestination$Identifier$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SavingsDestination.Identifier decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    SavingsDestination.Identifier.Type type2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SavingsDestination.Identifier(type2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            type2 = new SavingsDestination.Identifier.Type.GeneralFolder((SavingsDestination.Identifier.GeneralFolder) SavingsDestination.Identifier.GeneralFolder.ADAPTER.decode(reader));
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            type2 = new SavingsDestination.Identifier.Type.GoalFolder((SavingsDestination.Identifier.GoalFolder) SavingsDestination.Identifier.GoalFolder.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SavingsDestination.Identifier value) {
                    writer.getClass();
                    value.getClass();
                    SavingsDestination.Identifier.Type type2 = value.type;
                    if (type2 instanceof SavingsDestination.Identifier.Type.GeneralFolder) {
                        SavingsDestination.Identifier.GeneralFolder.ADAPTER.encodeWithTag(writer, 1, ((SavingsDestination.Identifier.Type.GeneralFolder) type2).getValue());
                    } else if (type2 instanceof SavingsDestination.Identifier.Type.GoalFolder) {
                        SavingsDestination.Identifier.GoalFolder.ADAPTER.encodeWithTag(writer, 2, ((SavingsDestination.Identifier.Type.GoalFolder) type2).getValue());
                    } else if (type2 != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SavingsDestination.Identifier value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    SavingsDestination.Identifier.Type type2 = value.type;
                    if (type2 instanceof SavingsDestination.Identifier.Type.GeneralFolder) {
                        encodedSizeWithTag = SavingsDestination.Identifier.GeneralFolder.ADAPTER.encodedSizeWithTag(1, ((SavingsDestination.Identifier.Type.GeneralFolder) type2).getValue());
                    } else {
                        if (!(type2 instanceof SavingsDestination.Identifier.Type.GoalFolder)) {
                            if (type2 == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = SavingsDestination.Identifier.GoalFolder.ADAPTER.encodedSizeWithTag(2, ((SavingsDestination.Identifier.Type.GoalFolder) type2).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SavingsDestination.Identifier redact(SavingsDestination.Identifier value) {
                    value.getClass();
                    return SavingsDestination.Identifier.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SavingsDestination.Identifier value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    SavingsDestination.Identifier.Type type2 = value.type;
                    if (type2 instanceof SavingsDestination.Identifier.Type.GeneralFolder) {
                        SavingsDestination.Identifier.GeneralFolder.ADAPTER.encodeWithTag(writer, 1, ((SavingsDestination.Identifier.Type.GeneralFolder) type2).getValue());
                    } else if (type2 instanceof SavingsDestination.Identifier.Type.GoalFolder) {
                        SavingsDestination.Identifier.GoalFolder.ADAPTER.encodeWithTag(writer, 2, ((SavingsDestination.Identifier.Type.GoalFolder) type2).getValue());
                    } else {
                        if (type2 == null) {
                            return;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Identifier(Type type2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : type2, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Identifier copy$default(Identifier identifier, Type type2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = identifier.type;
            }
            if ((i & 2) != 0) {
                byteString = identifier.unknownFields();
            }
            return identifier.copy(type2, byteString);
        }

        public final Identifier copy(Type type2, ByteString unknownFields) {
            unknownFields.getClass();
            return new Identifier(type2, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Identifier)) {
                return false;
            }
            Identifier identifier = (Identifier) other;
            return Intrinsics.areEqual(unknownFields(), identifier.unknownFields()) && Intrinsics.areEqual(this.type, identifier.type);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.type;
            int hashCode2 = hashCode + (type2 != null ? type2.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.type = this.type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Type type2 = this.type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Identifier{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier$GeneralFolder;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$GeneralFolder$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class GeneralFolder extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<GeneralFolder> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier$GeneralFolder$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$GeneralFolder;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                @Override // com.squareup.wire.Message.Builder
                public GeneralFolder build() {
                    return new GeneralFolder(buildUnknownFields());
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GeneralFolder.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.paychecks.SavingsDestination$Identifier$GeneralFolder$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public SavingsDestination.Identifier.GeneralFolder decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new SavingsDestination.Identifier.GeneralFolder(reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            reader.readUnknownField(nextTag);
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, SavingsDestination.Identifier.GeneralFolder value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(SavingsDestination.Identifier.GeneralFolder value) {
                        value.getClass();
                        return value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public SavingsDestination.Identifier.GeneralFolder redact(SavingsDestination.Identifier.GeneralFolder value) {
                        value.getClass();
                        return value.copy(ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, SavingsDestination.Identifier.GeneralFolder value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ GeneralFolder(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ GeneralFolder copy$default(GeneralFolder generalFolder, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    byteString = generalFolder.unknownFields();
                }
                return generalFolder.copy(byteString);
            }

            public final GeneralFolder copy(ByteString unknownFields) {
                unknownFields.getClass();
                return new GeneralFolder(unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof GeneralFolder) && Intrinsics.areEqual(unknownFields(), ((GeneralFolder) other).unknownFields());
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
                return "GeneralFolder{}";
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier$GeneralFolder$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$GeneralFolder$Builder;", "", "body", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$GeneralFolder;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/paychecks/SavingsDestination$Identifier$GeneralFolder;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ GeneralFolder build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public GeneralFolder() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GeneralFolder(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier$GoalFolder;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$GoalFolder$Builder;", "goal_folder_token", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class GoalFolder extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<GoalFolder> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String goal_folder_token;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier$GoalFolder$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$GoalFolder;", "<init>", "()V", "goal_folder_token", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String goal_folder_token;

                @Override // com.squareup.wire.Message.Builder
                public GoalFolder build() {
                    return new GoalFolder(this.goal_folder_token, buildUnknownFields());
                }

                public final Builder goal_folder_token(String goal_folder_token) {
                    this.goal_folder_token = goal_folder_token;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GoalFolder.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.paychecks.SavingsDestination$Identifier$GoalFolder$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public SavingsDestination.Identifier.GoalFolder decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new SavingsDestination.Identifier.GoalFolder((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(nextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, SavingsDestination.Identifier.GoalFolder value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.goal_folder_token);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(SavingsDestination.Identifier.GoalFolder value) {
                        value.getClass();
                        return ProtoAdapter.STRING.encodedSizeWithTag(1, value.goal_folder_token) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public SavingsDestination.Identifier.GoalFolder redact(SavingsDestination.Identifier.GoalFolder value) {
                        value.getClass();
                        return SavingsDestination.Identifier.GoalFolder.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, SavingsDestination.Identifier.GoalFolder value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.goal_folder_token);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ GoalFolder(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ GoalFolder copy$default(GoalFolder goalFolder, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = goalFolder.goal_folder_token;
                }
                if ((i & 2) != 0) {
                    byteString = goalFolder.unknownFields();
                }
                return goalFolder.copy(str, byteString);
            }

            public final GoalFolder copy(String goal_folder_token, ByteString unknownFields) {
                unknownFields.getClass();
                return new GoalFolder(goal_folder_token, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof GoalFolder)) {
                    return false;
                }
                GoalFolder goalFolder = (GoalFolder) other;
                return Intrinsics.areEqual(unknownFields(), goalFolder.unknownFields()) && Intrinsics.areEqual(this.goal_folder_token, goalFolder.goal_folder_token);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.goal_folder_token;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.goal_folder_token = this.goal_folder_token;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.goal_folder_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "goal_folder_token=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "GoalFolder{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier$GoalFolder$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$GoalFolder$Builder;", "", "body", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$GoalFolder;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/paychecks/SavingsDestination$Identifier$GoalFolder;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ GoalFolder build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public GoalFolder() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoalFolder(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.goal_folder_token = str;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$Builder;", "", "body", "Lsquareup/cash/paychecks/SavingsDestination$Identifier;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/paychecks/SavingsDestination$Identifier;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Identifier build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier$Type;", "", "<init>", "()V", "GeneralFolder", "GoalFolder", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$Type$GeneralFolder;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$Type$GoalFolder;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Type {

            @WireOneofField(adapter = "squareup.cash.paychecks.SavingsDestination$Identifier$GeneralFolder#ADAPTER", declaredName = "general_folder", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier$Type$GeneralFolder;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$Type;", "value", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$GeneralFolder;", "<init>", "(Lsquareup/cash/paychecks/SavingsDestination$Identifier$GeneralFolder;)V", "getValue", "()Lsquareup/cash/paychecks/SavingsDestination$Identifier$GeneralFolder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class GeneralFolder extends Type {
                private final GeneralFolder value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public GeneralFolder(GeneralFolder generalFolder) {
                    super(null);
                    generalFolder.getClass();
                    this.value = generalFolder;
                }

                public static /* synthetic */ GeneralFolder copy$default(GeneralFolder generalFolder, GeneralFolder generalFolder2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        generalFolder2 = generalFolder.value;
                    }
                    return generalFolder.copy(generalFolder2);
                }

                /* renamed from: component1, reason: from getter */
                public final GeneralFolder getValue() {
                    return this.value;
                }

                public final GeneralFolder copy(GeneralFolder value) {
                    value.getClass();
                    return new GeneralFolder(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof GeneralFolder) && Intrinsics.areEqual(this.value, ((GeneralFolder) other).value);
                }

                public final GeneralFolder getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "GeneralFolder(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "squareup.cash.paychecks.SavingsDestination$Identifier$GoalFolder#ADAPTER", declaredName = "goal_folder", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Identifier$Type$GoalFolder;", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$Type;", "value", "Lsquareup/cash/paychecks/SavingsDestination$Identifier$GoalFolder;", "<init>", "(Lsquareup/cash/paychecks/SavingsDestination$Identifier$GoalFolder;)V", "getValue", "()Lsquareup/cash/paychecks/SavingsDestination$Identifier$GoalFolder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class GoalFolder extends Type {
                private final GoalFolder value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public GoalFolder(GoalFolder goalFolder) {
                    super(null);
                    goalFolder.getClass();
                    this.value = goalFolder;
                }

                public static /* synthetic */ GoalFolder copy$default(GoalFolder goalFolder, GoalFolder goalFolder2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        goalFolder2 = goalFolder.value;
                    }
                    return goalFolder.copy(goalFolder2);
                }

                /* renamed from: component1, reason: from getter */
                public final GoalFolder getValue() {
                    return this.value;
                }

                public final GoalFolder copy(GoalFolder value) {
                    value.getClass();
                    return new GoalFolder(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof GoalFolder) && Intrinsics.areEqual(this.value, ((GoalFolder) other).value);
                }

                public final GoalFolder getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "GoalFolder(value=" + this.value + ")";
                }
            }

            public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Type() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Identifier() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Identifier(Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.type = type2;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SavingsDestination.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.paychecks.SavingsDestination$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SavingsDestination decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SavingsDestination((SavingsDestination.Identifier) obj, (SavingsDestination.UiSpecification) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(SavingsDestination.Identifier.ADAPTER, reader, obj);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(SavingsDestination.UiSpecification.ADAPTER, reader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SavingsDestination value) {
                writer.getClass();
                value.getClass();
                SavingsDestination.Identifier.ADAPTER.encodeWithTag(writer, 1, value.identifier);
                SavingsDestination.UiSpecification.ADAPTER.encodeWithTag(writer, 2, value.ui_specification);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SavingsDestination value) {
                value.getClass();
                return SavingsDestination.UiSpecification.ADAPTER.encodedSizeWithTag(2, value.ui_specification) + SavingsDestination.Identifier.ADAPTER.encodedSizeWithTag(1, value.identifier) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SavingsDestination redact(SavingsDestination value) {
                value.getClass();
                SavingsDestination.Identifier identifier = value.identifier;
                SavingsDestination.Identifier identifier2 = identifier != null ? (SavingsDestination.Identifier) SavingsDestination.Identifier.ADAPTER.redact(identifier) : null;
                SavingsDestination.UiSpecification uiSpecification = value.ui_specification;
                SavingsDestination.UiSpecification uiSpecification2 = uiSpecification != null ? (SavingsDestination.UiSpecification) SavingsDestination.UiSpecification.ADAPTER.redact(uiSpecification) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new SavingsDestination(identifier2, uiSpecification2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SavingsDestination value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                SavingsDestination.UiSpecification.ADAPTER.encodeWithTag(writer, 2, value.ui_specification);
                SavingsDestination.Identifier.ADAPTER.encodeWithTag(writer, 1, value.identifier);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDestination(Identifier identifier, UiSpecification uiSpecification, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.identifier = identifier;
        this.ui_specification = uiSpecification;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsDestination)) {
            return false;
        }
        SavingsDestination savingsDestination = (SavingsDestination) obj;
        return Intrinsics.areEqual(unknownFields(), savingsDestination.unknownFields()) && Intrinsics.areEqual(this.identifier, savingsDestination.identifier) && Intrinsics.areEqual(this.ui_specification, savingsDestination.ui_specification);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Identifier identifier = this.identifier;
        int hashCode2 = (hashCode + (identifier != null ? identifier.hashCode() : 0)) * 37;
        UiSpecification uiSpecification = this.ui_specification;
        int hashCode3 = hashCode2 + (uiSpecification != null ? uiSpecification.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.identifier = this.identifier;
        builder.ui_specification = this.ui_specification;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Identifier identifier = this.identifier;
        if (identifier != null) {
            arrayList.add("identifier=" + identifier);
        }
        UiSpecification uiSpecification = this.ui_specification;
        if (uiSpecification != null) {
            arrayList.add("ui_specification=" + uiSpecification);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsDestination{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$UiSpecification;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/SavingsDestination$UiSpecification$Builder;", "name", "", "icon_unicode", "icon_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UiSpecification extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UiSpecification> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String icon_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String icon_unicode;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String name;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$UiSpecification$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/paychecks/SavingsDestination$UiSpecification;", "<init>", "()V", "name", "", "icon_unicode", "icon_id", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String icon_id;
            public String icon_unicode;
            public String name;

            @Override // com.squareup.wire.Message.Builder
            public UiSpecification build() {
                return new UiSpecification(this.name, this.icon_unicode, this.icon_id, buildUnknownFields());
            }

            public final Builder icon_id(String icon_id) {
                this.icon_id = icon_id;
                return this;
            }

            public final Builder icon_unicode(String icon_unicode) {
                this.icon_unicode = icon_unicode;
                return this;
            }

            public final Builder name(String name) {
                this.name = name;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UiSpecification.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.paychecks.SavingsDestination$UiSpecification$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SavingsDestination.UiSpecification decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SavingsDestination.UiSpecification((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SavingsDestination.UiSpecification value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.name);
                    protoAdapter2.encodeWithTag(writer, 2, value.icon_unicode);
                    protoAdapter2.encodeWithTag(writer, 3, value.icon_id);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SavingsDestination.UiSpecification value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.icon_id) + protoAdapter2.encodedSizeWithTag(2, value.icon_unicode) + protoAdapter2.encodedSizeWithTag(1, value.name) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SavingsDestination.UiSpecification redact(SavingsDestination.UiSpecification value) {
                    value.getClass();
                    return SavingsDestination.UiSpecification.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SavingsDestination.UiSpecification value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.icon_id);
                    protoAdapter2.encodeWithTag(writer, 2, value.icon_unicode);
                    protoAdapter2.encodeWithTag(writer, 1, value.name);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ UiSpecification(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ UiSpecification copy$default(UiSpecification uiSpecification, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiSpecification.name;
            }
            if ((i & 2) != 0) {
                str2 = uiSpecification.icon_unicode;
            }
            if ((i & 4) != 0) {
                str3 = uiSpecification.icon_id;
            }
            if ((i & 8) != 0) {
                byteString = uiSpecification.unknownFields();
            }
            return uiSpecification.copy(str, str2, str3, byteString);
        }

        public final UiSpecification copy(String name, String icon_unicode, String icon_id, ByteString unknownFields) {
            unknownFields.getClass();
            return new UiSpecification(name, icon_unicode, icon_id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof UiSpecification)) {
                return false;
            }
            UiSpecification uiSpecification = (UiSpecification) other;
            return Intrinsics.areEqual(unknownFields(), uiSpecification.unknownFields()) && Intrinsics.areEqual(this.name, uiSpecification.name) && Intrinsics.areEqual(this.icon_unicode, uiSpecification.icon_unicode) && Intrinsics.areEqual(this.icon_id, uiSpecification.icon_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.icon_unicode;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.icon_id;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.name = this.name;
            builder.icon_unicode = this.icon_unicode;
            builder.icon_id = this.icon_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
            }
            String str2 = this.icon_unicode;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_unicode=", arrayList);
            }
            String str3 = this.icon_id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "icon_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UiSpecification{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$UiSpecification$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/paychecks/SavingsDestination$UiSpecification$Builder;", "", "body", "Lsquareup/cash/paychecks/SavingsDestination$UiSpecification;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/paychecks/SavingsDestination$UiSpecification;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
        public UiSpecification(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = str;
            this.icon_unicode = str2;
            this.icon_id = str3;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/paychecks/SavingsDestination$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/paychecks/SavingsDestination$Builder;", "", "body", "Lsquareup/cash/paychecks/SavingsDestination;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/paychecks/SavingsDestination;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SavingsDestination build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
