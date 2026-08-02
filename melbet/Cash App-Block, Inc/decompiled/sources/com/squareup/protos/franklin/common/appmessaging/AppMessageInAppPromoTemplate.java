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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageInAppPromoTemplate;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageInAppPromoTemplate$Builder;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageHeadline;", "headline", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageHeadline;", "", "image_url", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "primary_navigation_action", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "secondary_navigation_action", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AppMessageInAppPromoTemplate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppMessageInAppPromoTemplate> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.appmessaging.AppMessageHeadline#ADAPTER", schemaIndex = 0, tag = 1)
    public final AppMessageHeadline headline;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String image_url;

    @WireField(adapter = "com.squareup.protos.franklin.common.appmessaging.AppMessageAction#ADAPTER", schemaIndex = 2, tag = 3)
    public final AppMessageAction primary_navigation_action;

    @WireField(adapter = "com.squareup.protos.franklin.common.appmessaging.AppMessageAction#ADAPTER", schemaIndex = 3, tag = 4)
    public final AppMessageAction secondary_navigation_action;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageInAppPromoTemplate$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageInAppPromoTemplate;", "<init>", "()V", "headline", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageHeadline;", "image_url", "", "primary_navigation_action", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "secondary_navigation_action", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public AppMessageHeadline headline;
        public String image_url;
        public AppMessageAction primary_navigation_action;
        public AppMessageAction secondary_navigation_action;

        @Override // com.squareup.wire.Message.Builder
        public AppMessageInAppPromoTemplate build() {
            return new AppMessageInAppPromoTemplate(this.headline, this.image_url, this.primary_navigation_action, this.secondary_navigation_action, buildUnknownFields());
        }

        public final Builder headline(AppMessageHeadline headline) {
            this.headline = headline;
            return this;
        }

        public final Builder image_url(String image_url) {
            this.image_url = image_url;
            return this;
        }

        public final Builder primary_navigation_action(AppMessageAction primary_navigation_action) {
            this.primary_navigation_action = primary_navigation_action;
            return this;
        }

        public final Builder secondary_navigation_action(AppMessageAction secondary_navigation_action) {
            this.secondary_navigation_action = secondary_navigation_action;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AppMessageInAppPromoTemplate.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.appmessaging.AppMessageInAppPromoTemplate$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AppMessageInAppPromoTemplate decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AppMessageInAppPromoTemplate((AppMessageHeadline) obj, (String) obj2, (AppMessageAction) obj3, (AppMessageAction) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(AppMessageHeadline.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, reader, obj3);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AppMessageInAppPromoTemplate value) {
                writer.getClass();
                value.getClass();
                AppMessageHeadline.ADAPTER.encodeWithTag(writer, 1, value.headline);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.image_url);
                ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 3, value.primary_navigation_action);
                protoAdapter2.encodeWithTag(writer, 4, value.secondary_navigation_action);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AppMessageInAppPromoTemplate value) {
                value.getClass();
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, value.image_url) + AppMessageHeadline.ADAPTER.encodedSizeWithTag(1, value.headline) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(4, value.secondary_navigation_action) + protoAdapter2.encodedSizeWithTag(3, value.primary_navigation_action) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AppMessageInAppPromoTemplate redact(AppMessageInAppPromoTemplate value) {
                value.getClass();
                AppMessageHeadline appMessageHeadline = value.headline;
                AppMessageHeadline appMessageHeadline2 = appMessageHeadline != null ? (AppMessageHeadline) AppMessageHeadline.ADAPTER.redact(appMessageHeadline) : null;
                AppMessageAction appMessageAction = value.primary_navigation_action;
                AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
                AppMessageAction appMessageAction3 = value.secondary_navigation_action;
                AppMessageAction appMessageAction4 = appMessageAction3 != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction3) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.image_url;
                byteString.getClass();
                return new AppMessageInAppPromoTemplate(appMessageHeadline2, str, appMessageAction2, appMessageAction4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AppMessageInAppPromoTemplate value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 4, value.secondary_navigation_action);
                protoAdapter2.encodeWithTag(writer, 3, value.primary_navigation_action);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.image_url);
                AppMessageHeadline.ADAPTER.encodeWithTag(writer, 1, value.headline);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMessageInAppPromoTemplate(AppMessageHeadline appMessageHeadline, String str, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.headline = appMessageHeadline;
        this.image_url = str;
        this.primary_navigation_action = appMessageAction;
        this.secondary_navigation_action = appMessageAction2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppMessageInAppPromoTemplate)) {
            return false;
        }
        AppMessageInAppPromoTemplate appMessageInAppPromoTemplate = (AppMessageInAppPromoTemplate) obj;
        return Intrinsics.areEqual(unknownFields(), appMessageInAppPromoTemplate.unknownFields()) && Intrinsics.areEqual(this.headline, appMessageInAppPromoTemplate.headline) && Intrinsics.areEqual(this.image_url, appMessageInAppPromoTemplate.image_url) && Intrinsics.areEqual(this.primary_navigation_action, appMessageInAppPromoTemplate.primary_navigation_action) && Intrinsics.areEqual(this.secondary_navigation_action, appMessageInAppPromoTemplate.secondary_navigation_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppMessageHeadline appMessageHeadline = this.headline;
        int hashCode2 = (hashCode + (appMessageHeadline != null ? appMessageHeadline.hashCode() : 0)) * 37;
        String str = this.image_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.primary_navigation_action;
        int hashCode4 = (hashCode3 + (appMessageAction != null ? appMessageAction.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction2 = this.secondary_navigation_action;
        int hashCode5 = hashCode4 + (appMessageAction2 != null ? appMessageAction2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.headline = this.headline;
        builder.image_url = this.image_url;
        builder.primary_navigation_action = this.primary_navigation_action;
        builder.secondary_navigation_action = this.secondary_navigation_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppMessageHeadline appMessageHeadline = this.headline;
        if (appMessageHeadline != null) {
            arrayList.add("headline=" + appMessageHeadline);
        }
        String str = this.image_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "image_url=", arrayList);
        }
        AppMessageAction appMessageAction = this.primary_navigation_action;
        if (appMessageAction != null) {
            arrayList.add("primary_navigation_action=" + appMessageAction);
        }
        AppMessageAction appMessageAction2 = this.secondary_navigation_action;
        if (appMessageAction2 != null) {
            arrayList.add("secondary_navigation_action=" + appMessageAction2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppMessageInAppPromoTemplate{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessageInAppPromoTemplate$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageInAppPromoTemplate$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageInAppPromoTemplate;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/appmessaging/AppMessageInAppPromoTemplate;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AppMessageInAppPromoTemplate build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
