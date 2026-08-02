package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/common/AppVersion;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/AppVersion$Builder;", "Lcom/squareup/protos/franklin/common/Platform;", "platform", "Lcom/squareup/protos/franklin/common/Platform;", "", "major_version", "Ljava/lang/Integer;", "minor_version", "patch_version", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AppVersion extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppVersion> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    public final Integer major_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 3)
    public final Integer minor_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    public final Integer patch_version;

    @WireField(adapter = "com.squareup.protos.franklin.common.Platform#ADAPTER", schemaIndex = 0, tag = 1)
    public final Platform platform;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/common/AppVersion$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/AppVersion;", "<init>", "()V", "platform", "Lcom/squareup/protos/franklin/common/Platform;", "major_version", "", "Ljava/lang/Integer;", "minor_version", "patch_version", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/common/AppVersion$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Integer major_version;
        public Integer minor_version;
        public Integer patch_version;
        public Platform platform;

        @Override // com.squareup.wire.Message.Builder
        public AppVersion build() {
            return new AppVersion(this.platform, this.major_version, this.minor_version, this.patch_version, buildUnknownFields());
        }

        public final Builder major_version(Integer major_version) {
            this.major_version = major_version;
            return this;
        }

        public final Builder minor_version(Integer minor_version) {
            this.minor_version = minor_version;
            return this;
        }

        public final Builder patch_version(Integer patch_version) {
            this.patch_version = patch_version;
            return this;
        }

        public final Builder platform(Platform platform) {
            this.platform = platform;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AppVersion.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.AppVersion$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AppVersion decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AppVersion((Platform) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = Platform.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.INT32.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.INT32.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.INT32.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AppVersion value) {
                writer.getClass();
                value.getClass();
                Platform.ADAPTER.encodeWithTag(writer, 1, value.platform);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 2, value.major_version);
                protoAdapter2.encodeWithTag(writer, 3, value.minor_version);
                protoAdapter2.encodeWithTag(writer, 4, value.patch_version);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AppVersion value) {
                value.getClass();
                int encodedSizeWithTag = Platform.ADAPTER.encodedSizeWithTag(1, value.platform) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                return protoAdapter2.encodedSizeWithTag(4, value.patch_version) + protoAdapter2.encodedSizeWithTag(3, value.minor_version) + protoAdapter2.encodedSizeWithTag(2, value.major_version) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AppVersion redact(AppVersion value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Platform platform = value.platform;
                Integer num = value.major_version;
                Integer num2 = value.minor_version;
                Integer num3 = value.patch_version;
                value.getClass();
                byteString.getClass();
                return new AppVersion(platform, num, num2, num3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AppVersion value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 4, value.patch_version);
                protoAdapter2.encodeWithTag(writer, 3, value.minor_version);
                protoAdapter2.encodeWithTag(writer, 2, value.major_version);
                Platform.ADAPTER.encodeWithTag(writer, 1, value.platform);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppVersion(Platform platform, Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.platform = platform;
        this.major_version = num;
        this.minor_version = num2;
        this.patch_version = num3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppVersion)) {
            return false;
        }
        AppVersion appVersion = (AppVersion) obj;
        return Intrinsics.areEqual(unknownFields(), appVersion.unknownFields()) && this.platform == appVersion.platform && Intrinsics.areEqual(this.major_version, appVersion.major_version) && Intrinsics.areEqual(this.minor_version, appVersion.minor_version) && Intrinsics.areEqual(this.patch_version, appVersion.patch_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Platform platform = this.platform;
        int hashCode2 = (hashCode + (platform != null ? platform.hashCode() : 0)) * 37;
        Integer num = this.major_version;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.minor_version;
        int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.patch_version;
        int hashCode5 = hashCode4 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.platform = this.platform;
        builder.major_version = this.major_version;
        builder.minor_version = this.minor_version;
        builder.patch_version = this.patch_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Platform platform = this.platform;
        if (platform != null) {
            arrayList.add("platform=" + platform);
        }
        Integer num = this.major_version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("major_version=", num, arrayList);
        }
        Integer num2 = this.minor_version;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("minor_version=", num2, arrayList);
        }
        Integer num3 = this.patch_version;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("patch_version=", num3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppVersion{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/AppVersion$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/AppVersion$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/AppVersion;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/AppVersion;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AppVersion build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
