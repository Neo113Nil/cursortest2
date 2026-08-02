package com.squareup.protos.franklin.common.appmessaging;

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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggle;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggle$Builder;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageHeadline;", "headline", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageHeadline;", "", "default_position", "Ljava/lang/Boolean;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AppMessageToggle extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppMessageToggle> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean default_position;

    @WireField(adapter = "com.squareup.protos.franklin.common.appmessaging.AppMessageHeadline#ADAPTER", schemaIndex = 0, tag = 1)
    public final AppMessageHeadline headline;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggle$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggle;", "<init>", "()V", "headline", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageHeadline;", "default_position", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggle$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean default_position;
        public AppMessageHeadline headline;

        @Override // com.squareup.wire.Message.Builder
        public AppMessageToggle build() {
            return new AppMessageToggle(this.headline, this.default_position, buildUnknownFields());
        }

        public final Builder default_position(Boolean default_position) {
            this.default_position = default_position;
            return this;
        }

        public final Builder headline(AppMessageHeadline headline) {
            this.headline = headline;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AppMessageToggle.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.appmessaging.AppMessageToggle$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AppMessageToggle decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AppMessageToggle((AppMessageHeadline) obj, (Boolean) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(AppMessageHeadline.ADAPTER, reader, obj);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.BOOL.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AppMessageToggle value) {
                writer.getClass();
                value.getClass();
                AppMessageHeadline.ADAPTER.encodeWithTag(writer, 1, value.headline);
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.default_position);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AppMessageToggle value) {
                value.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(2, value.default_position) + AppMessageHeadline.ADAPTER.encodedSizeWithTag(1, value.headline) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AppMessageToggle redact(AppMessageToggle value) {
                value.getClass();
                AppMessageHeadline appMessageHeadline = value.headline;
                AppMessageHeadline appMessageHeadline2 = appMessageHeadline != null ? (AppMessageHeadline) AppMessageHeadline.ADAPTER.redact(appMessageHeadline) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.default_position;
                byteString.getClass();
                return new AppMessageToggle(appMessageHeadline2, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AppMessageToggle value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.default_position);
                AppMessageHeadline.ADAPTER.encodeWithTag(writer, 1, value.headline);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMessageToggle(AppMessageHeadline appMessageHeadline, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.headline = appMessageHeadline;
        this.default_position = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppMessageToggle)) {
            return false;
        }
        AppMessageToggle appMessageToggle = (AppMessageToggle) obj;
        return Intrinsics.areEqual(unknownFields(), appMessageToggle.unknownFields()) && Intrinsics.areEqual(this.headline, appMessageToggle.headline) && Intrinsics.areEqual(this.default_position, appMessageToggle.default_position);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppMessageHeadline appMessageHeadline = this.headline;
        int hashCode2 = (hashCode + (appMessageHeadline != null ? appMessageHeadline.hashCode() : 0)) * 37;
        Boolean bool = this.default_position;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.headline = this.headline;
        builder.default_position = this.default_position;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppMessageHeadline appMessageHeadline = this.headline;
        if (appMessageHeadline != null) {
            arrayList.add("headline=" + appMessageHeadline);
        }
        Boolean bool = this.default_position;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("default_position=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppMessageToggle{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggle$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggle$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggle;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggle;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AppMessageToggle build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
