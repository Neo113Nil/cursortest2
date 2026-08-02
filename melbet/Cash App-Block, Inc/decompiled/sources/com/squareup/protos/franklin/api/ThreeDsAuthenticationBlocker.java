package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ThreeDsAuthenticationBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ThreeDsAuthenticationBlocker$Builder;", "", "directory_server_id", "Ljava/lang/String;", "message_version", "progress_message", "Lcom/squareup/protos/cash/ui/Image;", "issuer_logo", "Lcom/squareup/protos/cash/ui/Image;", "", "minimum_delay_ms", "Ljava/lang/Integer;", "client_timeout_seconds", "ip_address", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThreeDsAuthenticationBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ThreeDsAuthenticationBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 5, tag = 6)
    public final Integer client_timeout_seconds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String directory_server_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 6, tag = 7)
    public final String ip_address;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 3, tag = 4)
    public final Image issuer_logo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String message_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 5)
    public final Integer minimum_delay_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String progress_message;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ThreeDsAuthenticationBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ThreeDsAuthenticationBlocker;", "<init>", "()V", "directory_server_id", "", "message_version", "progress_message", "issuer_logo", "Lcom/squareup/protos/cash/ui/Image;", "minimum_delay_ms", "", "Ljava/lang/Integer;", "client_timeout_seconds", "ip_address", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/api/ThreeDsAuthenticationBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Integer client_timeout_seconds;
        public String directory_server_id;
        public String ip_address;
        public Image issuer_logo;
        public String message_version;
        public Integer minimum_delay_ms;
        public String progress_message;

        @Override // com.squareup.wire.Message.Builder
        public ThreeDsAuthenticationBlocker build() {
            return new ThreeDsAuthenticationBlocker(this.directory_server_id, this.message_version, this.progress_message, this.issuer_logo, this.minimum_delay_ms, this.client_timeout_seconds, this.ip_address, buildUnknownFields());
        }

        public final Builder client_timeout_seconds(Integer client_timeout_seconds) {
            this.client_timeout_seconds = client_timeout_seconds;
            return this;
        }

        public final Builder directory_server_id(String directory_server_id) {
            this.directory_server_id = directory_server_id;
            return this;
        }

        public final Builder ip_address(String ip_address) {
            this.ip_address = ip_address;
            return this;
        }

        public final Builder issuer_logo(Image issuer_logo) {
            this.issuer_logo = issuer_logo;
            return this;
        }

        public final Builder message_version(String message_version) {
            this.message_version = message_version;
            return this;
        }

        public final Builder minimum_delay_ms(Integer minimum_delay_ms) {
            this.minimum_delay_ms = minimum_delay_ms;
            return this;
        }

        public final Builder progress_message(String progress_message) {
            this.progress_message = progress_message;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ThreeDsAuthenticationBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ThreeDsAuthenticationBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ThreeDsAuthenticationBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ThreeDsAuthenticationBlocker((String) obj, (String) obj2, (String) obj3, (Image) obj4, (Integer) obj5, (Integer) obj6, (String) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
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
                            obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj4);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ThreeDsAuthenticationBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.directory_server_id);
                protoAdapter2.encodeWithTag(writer, 2, value.message_version);
                protoAdapter2.encodeWithTag(writer, 3, value.progress_message);
                Image.ADAPTER.encodeWithTag(writer, 4, value.issuer_logo);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 5, value.minimum_delay_ms);
                protoAdapter3.encodeWithTag(writer, 6, value.client_timeout_seconds);
                protoAdapter2.encodeWithTag(writer, 7, value.ip_address);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ThreeDsAuthenticationBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(4, value.issuer_logo) + protoAdapter2.encodedSizeWithTag(3, value.progress_message) + protoAdapter2.encodedSizeWithTag(2, value.message_version) + protoAdapter2.encodedSizeWithTag(1, value.directory_server_id) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                return protoAdapter2.encodedSizeWithTag(7, value.ip_address) + protoAdapter3.encodedSizeWithTag(6, value.client_timeout_seconds) + protoAdapter3.encodedSizeWithTag(5, value.minimum_delay_ms) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ThreeDsAuthenticationBlocker redact(ThreeDsAuthenticationBlocker value) {
                value.getClass();
                Image image = value.issuer_logo;
                Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.directory_server_id;
                String str2 = value.message_version;
                String str3 = value.progress_message;
                Integer num = value.minimum_delay_ms;
                Integer num2 = value.client_timeout_seconds;
                byteString.getClass();
                return new ThreeDsAuthenticationBlocker(str, str2, str3, image2, num, num2, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ThreeDsAuthenticationBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 7, value.ip_address);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 6, value.client_timeout_seconds);
                protoAdapter3.encodeWithTag(writer, 5, value.minimum_delay_ms);
                Image.ADAPTER.encodeWithTag(writer, 4, value.issuer_logo);
                protoAdapter2.encodeWithTag(writer, 3, value.progress_message);
                protoAdapter2.encodeWithTag(writer, 2, value.message_version);
                protoAdapter2.encodeWithTag(writer, 1, value.directory_server_id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDsAuthenticationBlocker(String str, String str2, String str3, Image image, Integer num, Integer num2, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.directory_server_id = str;
        this.message_version = str2;
        this.progress_message = str3;
        this.issuer_logo = image;
        this.minimum_delay_ms = num;
        this.client_timeout_seconds = num2;
        this.ip_address = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreeDsAuthenticationBlocker)) {
            return false;
        }
        ThreeDsAuthenticationBlocker threeDsAuthenticationBlocker = (ThreeDsAuthenticationBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), threeDsAuthenticationBlocker.unknownFields()) && Intrinsics.areEqual(this.directory_server_id, threeDsAuthenticationBlocker.directory_server_id) && Intrinsics.areEqual(this.message_version, threeDsAuthenticationBlocker.message_version) && Intrinsics.areEqual(this.progress_message, threeDsAuthenticationBlocker.progress_message) && Intrinsics.areEqual(this.issuer_logo, threeDsAuthenticationBlocker.issuer_logo) && Intrinsics.areEqual(this.minimum_delay_ms, threeDsAuthenticationBlocker.minimum_delay_ms) && Intrinsics.areEqual(this.client_timeout_seconds, threeDsAuthenticationBlocker.client_timeout_seconds) && Intrinsics.areEqual(this.ip_address, threeDsAuthenticationBlocker.ip_address);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.directory_server_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message_version;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.progress_message;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Image image = this.issuer_logo;
        int hashCode5 = (hashCode4 + (image != null ? image.hashCode() : 0)) * 37;
        Integer num = this.minimum_delay_ms;
        int hashCode6 = (hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.client_timeout_seconds;
        int hashCode7 = (hashCode6 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        String str4 = this.ip_address;
        int hashCode8 = hashCode7 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.directory_server_id = this.directory_server_id;
        builder.message_version = this.message_version;
        builder.progress_message = this.progress_message;
        builder.issuer_logo = this.issuer_logo;
        builder.minimum_delay_ms = this.minimum_delay_ms;
        builder.client_timeout_seconds = this.client_timeout_seconds;
        builder.ip_address = this.ip_address;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.directory_server_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "directory_server_id=", arrayList);
        }
        String str2 = this.message_version;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message_version=", arrayList);
        }
        String str3 = this.progress_message;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "progress_message=", arrayList);
        }
        Image image = this.issuer_logo;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("issuer_logo=", image, arrayList);
        }
        Integer num = this.minimum_delay_ms;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("minimum_delay_ms=", num, arrayList);
        }
        Integer num2 = this.client_timeout_seconds;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("client_timeout_seconds=", num2, arrayList);
        }
        if (this.ip_address != null) {
            arrayList.add("ip_address=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThreeDsAuthenticationBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ThreeDsAuthenticationBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ThreeDsAuthenticationBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ThreeDsAuthenticationBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ThreeDsAuthenticationBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ThreeDsAuthenticationBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
