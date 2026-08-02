package com.squareup.protos.cash.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\b\u0007\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/ui/Color;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/ui/Color$Builder;", "Lcom/squareup/protos/cash/ui/Color$ModeVariant;", "light", "Lcom/squareup/protos/cash/ui/Color$ModeVariant;", "dark", "Companion", "Builder", "ModeVariant", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Color extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Color> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color$ModeVariant#ADAPTER", schemaIndex = 1, tag = 2)
    public final ModeVariant dark;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color$ModeVariant#ADAPTER", schemaIndex = 0, tag = 1)
    public final ModeVariant light;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/ui/Color$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/ui/Color;", "<init>", "()V", "light", "Lcom/squareup/protos/cash/ui/Color$ModeVariant;", "dark", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public ModeVariant dark;
        public ModeVariant light;

        @Override // com.squareup.wire.Message.Builder
        public Color build() {
            return new Color(this.light, this.dark, buildUnknownFields());
        }

        public final Builder dark(ModeVariant dark) {
            this.dark = dark;
            return this;
        }

        public final Builder light(ModeVariant light) {
            this.light = light;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Color.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.ui.Color$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Color decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Color((Color.ModeVariant) obj, (Color.ModeVariant) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(Color.ModeVariant.ADAPTER, reader, obj);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(Color.ModeVariant.ADAPTER, reader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Color value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = Color.ModeVariant.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 1, value.light);
                protoAdapter2.encodeWithTag(writer, 2, value.dark);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Color value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = Color.ModeVariant.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(2, value.dark) + protoAdapter2.encodedSizeWithTag(1, value.light) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Color redact(Color value) {
                value.getClass();
                Color.ModeVariant modeVariant = value.light;
                Color.ModeVariant modeVariant2 = modeVariant != null ? (Color.ModeVariant) Color.ModeVariant.ADAPTER.redact(modeVariant) : null;
                Color.ModeVariant modeVariant3 = value.dark;
                Color.ModeVariant modeVariant4 = modeVariant3 != null ? (Color.ModeVariant) Color.ModeVariant.ADAPTER.redact(modeVariant3) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new Color(modeVariant2, modeVariant4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Color value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = Color.ModeVariant.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 2, value.dark);
                protoAdapter2.encodeWithTag(writer, 1, value.light);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ Color(ModeVariant modeVariant, ModeVariant modeVariant2, int i) {
        this((i & 1) != 0 ? null : modeVariant, (i & 2) != 0 ? null : modeVariant2, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Color)) {
            return false;
        }
        Color color = (Color) obj;
        return Intrinsics.areEqual(unknownFields(), color.unknownFields()) && Intrinsics.areEqual(this.light, color.light) && Intrinsics.areEqual(this.dark, color.dark);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ModeVariant modeVariant = this.light;
        int hashCode2 = (hashCode + (modeVariant != null ? modeVariant.hashCode() : 0)) * 37;
        ModeVariant modeVariant2 = this.dark;
        int hashCode3 = hashCode2 + (modeVariant2 != null ? modeVariant2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.light = this.light;
        builder.dark = this.dark;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ModeVariant modeVariant = this.light;
        if (modeVariant != null) {
            arrayList.add("light=" + modeVariant);
        }
        ModeVariant modeVariant2 = this.dark;
        if (modeVariant2 != null) {
            arrayList.add("dark=" + modeVariant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Color{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/ui/Color$ModeVariant;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/ui/Color$ModeVariant$Builder;", "srgb", "", "p3", "high_contrast_srgb", "high_contrast_p3", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ModeVariant extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ModeVariant> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String high_contrast_p3;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String high_contrast_srgb;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String p3;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String srgb;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/ui/Color$ModeVariant$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/ui/Color$ModeVariant;", "<init>", "()V", "srgb", "", "p3", "high_contrast_srgb", "high_contrast_p3", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String high_contrast_p3;
            public String high_contrast_srgb;
            public String p3;
            public String srgb;

            @Override // com.squareup.wire.Message.Builder
            public ModeVariant build() {
                return new ModeVariant(this.srgb, this.p3, this.high_contrast_srgb, this.high_contrast_p3, buildUnknownFields());
            }

            public final Builder high_contrast_p3(String high_contrast_p3) {
                this.high_contrast_p3 = high_contrast_p3;
                return this;
            }

            public final Builder high_contrast_srgb(String high_contrast_srgb) {
                this.high_contrast_srgb = high_contrast_srgb;
                return this;
            }

            public final Builder p3(String p3) {
                this.p3 = p3;
                return this;
            }

            public final Builder srgb(String srgb) {
                this.srgb = srgb;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ModeVariant.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.ui.Color$ModeVariant$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public Color.ModeVariant decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new Color.ModeVariant((String) obj, (String) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Color.ModeVariant value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.srgb);
                    protoAdapter2.encodeWithTag(writer, 2, value.p3);
                    protoAdapter2.encodeWithTag(writer, 3, value.high_contrast_srgb);
                    protoAdapter2.encodeWithTag(writer, 4, value.high_contrast_p3);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Color.ModeVariant value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(4, value.high_contrast_p3) + protoAdapter2.encodedSizeWithTag(3, value.high_contrast_srgb) + protoAdapter2.encodedSizeWithTag(2, value.p3) + protoAdapter2.encodedSizeWithTag(1, value.srgb) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Color.ModeVariant redact(Color.ModeVariant value) {
                    value.getClass();
                    return Color.ModeVariant.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Color.ModeVariant value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.high_contrast_p3);
                    protoAdapter2.encodeWithTag(writer, 3, value.high_contrast_srgb);
                    protoAdapter2.encodeWithTag(writer, 2, value.p3);
                    protoAdapter2.encodeWithTag(writer, 1, value.srgb);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ModeVariant(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ModeVariant copy$default(ModeVariant modeVariant, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = modeVariant.srgb;
            }
            if ((i & 2) != 0) {
                str2 = modeVariant.p3;
            }
            if ((i & 4) != 0) {
                str3 = modeVariant.high_contrast_srgb;
            }
            if ((i & 8) != 0) {
                str4 = modeVariant.high_contrast_p3;
            }
            if ((i & 16) != 0) {
                byteString = modeVariant.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str5 = str3;
            return modeVariant.copy(str, str2, str5, str4, byteString2);
        }

        public final ModeVariant copy(String srgb, String p3, String high_contrast_srgb, String high_contrast_p3, ByteString unknownFields) {
            unknownFields.getClass();
            return new ModeVariant(srgb, p3, high_contrast_srgb, high_contrast_p3, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ModeVariant)) {
                return false;
            }
            ModeVariant modeVariant = (ModeVariant) other;
            return Intrinsics.areEqual(unknownFields(), modeVariant.unknownFields()) && Intrinsics.areEqual(this.srgb, modeVariant.srgb) && Intrinsics.areEqual(this.p3, modeVariant.p3) && Intrinsics.areEqual(this.high_contrast_srgb, modeVariant.high_contrast_srgb) && Intrinsics.areEqual(this.high_contrast_p3, modeVariant.high_contrast_p3);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.srgb;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.p3;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.high_contrast_srgb;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.high_contrast_p3;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.srgb = this.srgb;
            builder.p3 = this.p3;
            builder.high_contrast_srgb = this.high_contrast_srgb;
            builder.high_contrast_p3 = this.high_contrast_p3;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.srgb;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "srgb=", arrayList);
            }
            String str2 = this.p3;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "p3=", arrayList);
            }
            String str3 = this.high_contrast_srgb;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "high_contrast_srgb=", arrayList);
            }
            String str4 = this.high_contrast_p3;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "high_contrast_p3=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ModeVariant{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/ui/Color$ModeVariant$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/ui/Color$ModeVariant$Builder;", "", "body", "Lcom/squareup/protos/cash/ui/Color$ModeVariant;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/ui/Color$ModeVariant;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ModeVariant build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ModeVariant() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ModeVariant(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.srgb = str;
            this.p3 = str2;
            this.high_contrast_srgb = str3;
            this.high_contrast_p3 = str4;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/ui/Color$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/ui/Color$Builder;", "", "body", "Lcom/squareup/protos/cash/ui/Color;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/ui/Color;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Color build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Color(ModeVariant modeVariant, ModeVariant modeVariant2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.light = modeVariant;
        this.dark = modeVariant2;
    }
}
