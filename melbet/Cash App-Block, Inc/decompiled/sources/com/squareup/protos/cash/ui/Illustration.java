package com.squareup.protos.cash.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Illustration;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\t\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/ui/Illustration;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/ui/Illustration$Builder;", "", "arcade_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration;", "fallback_illustration", "Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration;", "Companion", "Builder", "FallbackRemoteIllustration", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Illustration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Illustration> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String arcade_id;

    @WireField(adapter = "com.squareup.protos.cash.ui.Illustration$FallbackRemoteIllustration#ADAPTER", schemaIndex = 1, tag = 2)
    public final FallbackRemoteIllustration fallback_illustration;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/ui/Illustration$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/ui/Illustration;", "<init>", "()V", "arcade_id", "", "fallback_illustration", "Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String arcade_id;
        public FallbackRemoteIllustration fallback_illustration;

        public final Builder arcade_id(String arcade_id) {
            this.arcade_id = arcade_id;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Illustration build() {
            return new Illustration(this.arcade_id, this.fallback_illustration, buildUnknownFields());
        }

        public final Builder fallback_illustration(FallbackRemoteIllustration fallback_illustration) {
            this.fallback_illustration = fallback_illustration;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Illustration.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.ui.Illustration$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Illustration decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Illustration((String) obj, (Illustration.FallbackRemoteIllustration) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(Illustration.FallbackRemoteIllustration.ADAPTER, reader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Illustration value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.arcade_id);
                Illustration.FallbackRemoteIllustration.ADAPTER.encodeWithTag(writer, 2, value.fallback_illustration);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Illustration value) {
                value.getClass();
                return Illustration.FallbackRemoteIllustration.ADAPTER.encodedSizeWithTag(2, value.fallback_illustration) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.arcade_id) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Illustration redact(Illustration value) {
                value.getClass();
                Illustration.FallbackRemoteIllustration fallbackRemoteIllustration = value.fallback_illustration;
                Illustration.FallbackRemoteIllustration fallbackRemoteIllustration2 = fallbackRemoteIllustration != null ? (Illustration.FallbackRemoteIllustration) Illustration.FallbackRemoteIllustration.ADAPTER.redact(fallbackRemoteIllustration) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.arcade_id;
                byteString.getClass();
                return new Illustration(str, fallbackRemoteIllustration2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Illustration value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Illustration.FallbackRemoteIllustration.ADAPTER.encodeWithTag(writer, 2, value.fallback_illustration);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.arcade_id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Illustration(String str, FallbackRemoteIllustration fallbackRemoteIllustration, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.arcade_id = str;
        this.fallback_illustration = fallbackRemoteIllustration;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Illustration)) {
            return false;
        }
        Illustration illustration = (Illustration) obj;
        return Intrinsics.areEqual(unknownFields(), illustration.unknownFields()) && Intrinsics.areEqual(this.arcade_id, illustration.arcade_id) && Intrinsics.areEqual(this.fallback_illustration, illustration.fallback_illustration);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.arcade_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        FallbackRemoteIllustration fallbackRemoteIllustration = this.fallback_illustration;
        int hashCode3 = hashCode2 + (fallbackRemoteIllustration != null ? fallbackRemoteIllustration.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.arcade_id = this.arcade_id;
        builder.fallback_illustration = this.fallback_illustration;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.arcade_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "arcade_id=", arrayList);
        }
        FallbackRemoteIllustration fallbackRemoteIllustration = this.fallback_illustration;
        if (fallbackRemoteIllustration != null) {
            arrayList.add("fallback_illustration=" + fallbackRemoteIllustration);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Illustration{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0007H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration$Builder;", "light_url", "", "dark_url", "width", "", "height", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lokio/ByteString;)Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FallbackRemoteIllustration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FallbackRemoteIllustration> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String dark_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 3, tag = 4)
        public final Integer height;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
        public final String light_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 2, tag = 3)
        public final Integer width;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration;", "<init>", "()V", "light_url", "", "dark_url", "width", "", "Ljava/lang/Integer;", "height", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String dark_url;
            public Integer height;
            public String light_url;
            public Integer width;

            @Override // com.squareup.wire.Message.Builder
            public FallbackRemoteIllustration build() {
                return new FallbackRemoteIllustration(this.light_url, this.dark_url, this.width, this.height, buildUnknownFields());
            }

            public final Builder dark_url(String dark_url) {
                this.dark_url = dark_url;
                return this;
            }

            public final Builder height(Integer height) {
                this.height = height;
                return this;
            }

            public final Builder light_url(String light_url) {
                this.light_url = light_url;
                return this;
            }

            public final Builder width(Integer width) {
                this.width = width;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FallbackRemoteIllustration.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.ui.Illustration$FallbackRemoteIllustration$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public Illustration.FallbackRemoteIllustration decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new Illustration.FallbackRemoteIllustration((String) obj, (String) obj2, (Integer) obj3, (Integer) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.UINT32.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = ProtoAdapter.UINT32.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Illustration.FallbackRemoteIllustration value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.light_url);
                    protoAdapter2.encodeWithTag(writer, 2, value.dark_url);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.UINT32;
                    protoAdapter3.encodeWithTag(writer, 3, value.width);
                    protoAdapter3.encodeWithTag(writer, 4, value.height);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Illustration.FallbackRemoteIllustration value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.dark_url) + protoAdapter2.encodedSizeWithTag(1, value.light_url) + size$okio;
                    ProtoAdapter protoAdapter3 = ProtoAdapter.UINT32;
                    return protoAdapter3.encodedSizeWithTag(4, value.height) + protoAdapter3.encodedSizeWithTag(3, value.width) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Illustration.FallbackRemoteIllustration redact(Illustration.FallbackRemoteIllustration value) {
                    value.getClass();
                    return Illustration.FallbackRemoteIllustration.copy$default(value, null, null, null, null, ByteString.EMPTY, 12, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Illustration.FallbackRemoteIllustration value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
                    protoAdapter2.encodeWithTag(writer, 4, value.height);
                    protoAdapter2.encodeWithTag(writer, 3, value.width);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    protoAdapter3.encodeWithTag(writer, 2, value.dark_url);
                    protoAdapter3.encodeWithTag(writer, 1, value.light_url);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ FallbackRemoteIllustration(String str, String str2, Integer num, Integer num2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ FallbackRemoteIllustration copy$default(FallbackRemoteIllustration fallbackRemoteIllustration, String str, String str2, Integer num, Integer num2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fallbackRemoteIllustration.light_url;
            }
            if ((i & 2) != 0) {
                str2 = fallbackRemoteIllustration.dark_url;
            }
            if ((i & 4) != 0) {
                num = fallbackRemoteIllustration.width;
            }
            if ((i & 8) != 0) {
                num2 = fallbackRemoteIllustration.height;
            }
            if ((i & 16) != 0) {
                byteString = fallbackRemoteIllustration.unknownFields();
            }
            ByteString byteString2 = byteString;
            Integer num3 = num;
            return fallbackRemoteIllustration.copy(str, str2, num3, num2, byteString2);
        }

        public final FallbackRemoteIllustration copy(String light_url, String dark_url, Integer width, Integer height, ByteString unknownFields) {
            unknownFields.getClass();
            return new FallbackRemoteIllustration(light_url, dark_url, width, height, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof FallbackRemoteIllustration)) {
                return false;
            }
            FallbackRemoteIllustration fallbackRemoteIllustration = (FallbackRemoteIllustration) other;
            return Intrinsics.areEqual(unknownFields(), fallbackRemoteIllustration.unknownFields()) && Intrinsics.areEqual(this.light_url, fallbackRemoteIllustration.light_url) && Intrinsics.areEqual(this.dark_url, fallbackRemoteIllustration.dark_url) && Intrinsics.areEqual(this.width, fallbackRemoteIllustration.width) && Intrinsics.areEqual(this.height, fallbackRemoteIllustration.height);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.light_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.dark_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Integer num = this.width;
            int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.height;
            int hashCode5 = hashCode4 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.light_url = this.light_url;
            builder.dark_url = this.dark_url;
            builder.width = this.width;
            builder.height = this.height;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.light_url != null) {
                arrayList.add("light_url=██");
            }
            if (this.dark_url != null) {
                arrayList.add("dark_url=██");
            }
            Integer num = this.width;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("width=", num, arrayList);
            }
            Integer num2 = this.height;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("height=", num2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FallbackRemoteIllustration{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration$Builder;", "", "body", "Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/ui/Illustration$FallbackRemoteIllustration;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ FallbackRemoteIllustration build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public FallbackRemoteIllustration() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FallbackRemoteIllustration(String str, String str2, Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.light_url = str;
            this.dark_url = str2;
            this.width = num;
            this.height = num2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/ui/Illustration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/ui/Illustration$Builder;", "", "body", "Lcom/squareup/protos/cash/ui/Illustration;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/ui/Illustration;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Illustration build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
