package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalImage;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalImage$Builder;", "", "light_url", "Ljava/lang/String;", "dark_url", "", "width", "Ljava/lang/Long;", "height", "Lcom/squareup/protos/cash/local/client/v1/LocalColor;", "placeholder_color", "Lcom/squareup/protos/cash/local/client/v1/LocalColor;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalImage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalImage> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String dark_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 3, tag = 4)
    public final Long height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String light_url;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalColor#ADAPTER", schemaIndex = 4, tag = 5)
    public final LocalColor placeholder_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
    public final Long width;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalImage$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalImage;", "<init>", "()V", "light_url", "", "dark_url", "width", "", "Ljava/lang/Long;", "height", "placeholder_color", "Lcom/squareup/protos/cash/local/client/v1/LocalColor;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/local/client/v1/LocalImage$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String dark_url;
        public Long height;
        public String light_url;
        public LocalColor placeholder_color;
        public Long width;

        @Override // com.squareup.wire.Message.Builder
        public LocalImage build() {
            return new LocalImage(this.light_url, this.dark_url, this.width, this.height, this.placeholder_color, buildUnknownFields());
        }

        public final Builder dark_url(String dark_url) {
            this.dark_url = dark_url;
            return this;
        }

        public final Builder height(Long height) {
            this.height = height;
            return this;
        }

        public final Builder light_url(String light_url) {
            this.light_url = light_url;
            return this;
        }

        public final Builder placeholder_color(LocalColor placeholder_color) {
            this.placeholder_color = placeholder_color;
            return this;
        }

        public final Builder width(Long width) {
            this.width = width;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalImage.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalImage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LocalImage decode(ProtoReader reader) {
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
                        return new LocalImage((String) obj, (String) obj2, (Long) obj3, (Long) obj4, (LocalColor) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj5 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, reader, obj5);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalImage value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.light_url);
                protoAdapter2.encodeWithTag(writer, 2, value.dark_url);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(writer, 3, value.width);
                protoAdapter3.encodeWithTag(writer, 4, value.height);
                LocalColor.ADAPTER.encodeWithTag(writer, 5, value.placeholder_color);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalImage value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.dark_url) + protoAdapter2.encodedSizeWithTag(1, value.light_url) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                return LocalColor.ADAPTER.encodedSizeWithTag(5, value.placeholder_color) + protoAdapter3.encodedSizeWithTag(4, value.height) + protoAdapter3.encodedSizeWithTag(3, value.width) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalImage redact(LocalImage value) {
                value.getClass();
                LocalColor localColor = value.placeholder_color;
                return LocalImage.copy$default(value, localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null, ByteString.EMPTY, 15);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalImage value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LocalColor.ADAPTER.encodeWithTag(writer, 5, value.placeholder_color);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
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

    public /* synthetic */ LocalImage(String str, String str2, Long l, Long l2, LocalColor localColor, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : localColor, ByteString.EMPTY);
    }

    public static LocalImage copy$default(LocalImage localImage, LocalColor localColor, ByteString byteString, int i) {
        String str = localImage.light_url;
        String str2 = localImage.dark_url;
        Long l = localImage.width;
        Long l2 = localImage.height;
        if ((i & 32) != 0) {
            byteString = localImage.unknownFields();
        }
        ByteString byteString2 = byteString;
        localImage.getClass();
        byteString2.getClass();
        return new LocalImage(str, str2, l, l2, localColor, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalImage)) {
            return false;
        }
        LocalImage localImage = (LocalImage) obj;
        return Intrinsics.areEqual(unknownFields(), localImage.unknownFields()) && Intrinsics.areEqual(this.light_url, localImage.light_url) && Intrinsics.areEqual(this.dark_url, localImage.dark_url) && Intrinsics.areEqual(this.width, localImage.width) && Intrinsics.areEqual(this.height, localImage.height) && Intrinsics.areEqual(this.placeholder_color, localImage.placeholder_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.light_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.dark_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.width;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.height;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        LocalColor localColor = this.placeholder_color;
        int hashCode6 = hashCode5 + (localColor != null ? localColor.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.light_url = this.light_url;
        builder.dark_url = this.dark_url;
        builder.width = this.width;
        builder.height = this.height;
        builder.placeholder_color = this.placeholder_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.light_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "light_url=", arrayList);
        }
        String str2 = this.dark_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dark_url=", arrayList);
        }
        Long l = this.width;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("width=", l, arrayList);
        }
        Long l2 = this.height;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("height=", l2, arrayList);
        }
        LocalColor localColor = this.placeholder_color;
        if (localColor != null) {
            SizeMode$EnumUnboxingLocalUtility.m("placeholder_color=", localColor, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalImage{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalImage$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalImage$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalImage;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalImage;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalImage build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalImage(String str, String str2, Long l, Long l2, LocalColor localColor, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.light_url = str;
        this.dark_url = str2;
        this.width = l;
        this.height = l2;
        this.placeholder_color = localColor;
    }
}
