package com.squareup.protos.franklin.common.appmessaging;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload$Builder;", "", "message_token", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggleTemplate;", "toggle", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggleTemplate;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageInAppPromoTemplate;", "in_app_promo", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageInAppPromoTemplate;", "", "increment_activity_badge_count_by", "Ljava/lang/Integer;", "getIncrement_activity_badge_count_by$annotations", "()V", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AppMessagePayload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppMessagePayload> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.appmessaging.AppMessageInAppPromoTemplate#ADAPTER", schemaIndex = 2, tag = 18)
    public final AppMessageInAppPromoTemplate in_app_promo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 19)
    public final Integer increment_activity_badge_count_by;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 6)
    public final String message_token;

    @WireField(adapter = "com.squareup.protos.franklin.common.appmessaging.AppMessageToggleTemplate#ADAPTER", schemaIndex = 1, tag = 12)
    public final AppMessageToggleTemplate toggle;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload;", "<init>", "()V", "message_token", "", "toggle", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageToggleTemplate;", "in_app_promo", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageInAppPromoTemplate;", "increment_activity_badge_count_by", "", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public AppMessageInAppPromoTemplate in_app_promo;
        public Integer increment_activity_badge_count_by;
        public String message_token;
        public AppMessageToggleTemplate toggle;

        @Override // com.squareup.wire.Message.Builder
        public AppMessagePayload build() {
            return new AppMessagePayload(this.message_token, this.toggle, this.in_app_promo, this.increment_activity_badge_count_by, buildUnknownFields());
        }

        public final Builder in_app_promo(AppMessageInAppPromoTemplate in_app_promo) {
            this.in_app_promo = in_app_promo;
            return this;
        }

        @Deprecated
        public final Builder increment_activity_badge_count_by(Integer increment_activity_badge_count_by) {
            this.increment_activity_badge_count_by = increment_activity_badge_count_by;
            return this;
        }

        public final Builder message_token(String message_token) {
            this.message_token = message_token;
            return this;
        }

        public final Builder toggle(AppMessageToggleTemplate toggle) {
            this.toggle = toggle;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AppMessagePayload.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.appmessaging.AppMessagePayload$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AppMessagePayload decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AppMessagePayload((String) obj, (AppMessageToggleTemplate) obj2, (AppMessageInAppPromoTemplate) obj3, (Integer) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 6) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 12) {
                        obj2 = TransactorKt.decodeMessageOrMerge(AppMessageToggleTemplate.ADAPTER, reader, obj2);
                    } else if (nextTag == 18) {
                        obj3 = TransactorKt.decodeMessageOrMerge(AppMessageInAppPromoTemplate.ADAPTER, reader, obj3);
                    } else if (nextTag != 19) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.INT32.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AppMessagePayload value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 6, value.message_token);
                AppMessageToggleTemplate.ADAPTER.encodeWithTag(writer, 12, value.toggle);
                AppMessageInAppPromoTemplate.ADAPTER.encodeWithTag(writer, 18, value.in_app_promo);
                ProtoAdapter.INT32.encodeWithTag(writer, 19, value.increment_activity_badge_count_by);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AppMessagePayload value) {
                value.getClass();
                return ProtoAdapter.INT32.encodedSizeWithTag(19, value.increment_activity_badge_count_by) + AppMessageInAppPromoTemplate.ADAPTER.encodedSizeWithTag(18, value.in_app_promo) + AppMessageToggleTemplate.ADAPTER.encodedSizeWithTag(12, value.toggle) + ProtoAdapter.STRING.encodedSizeWithTag(6, value.message_token) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AppMessagePayload redact(AppMessagePayload value) {
                value.getClass();
                AppMessageToggleTemplate appMessageToggleTemplate = value.toggle;
                AppMessageToggleTemplate appMessageToggleTemplate2 = appMessageToggleTemplate != null ? (AppMessageToggleTemplate) AppMessageToggleTemplate.ADAPTER.redact(appMessageToggleTemplate) : null;
                AppMessageInAppPromoTemplate appMessageInAppPromoTemplate = value.in_app_promo;
                AppMessageInAppPromoTemplate appMessageInAppPromoTemplate2 = appMessageInAppPromoTemplate != null ? (AppMessageInAppPromoTemplate) AppMessageInAppPromoTemplate.ADAPTER.redact(appMessageInAppPromoTemplate) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.message_token;
                Integer num = value.increment_activity_badge_count_by;
                byteString.getClass();
                return new AppMessagePayload(str, appMessageToggleTemplate2, appMessageInAppPromoTemplate2, num, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AppMessagePayload value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(writer, 19, value.increment_activity_badge_count_by);
                AppMessageInAppPromoTemplate.ADAPTER.encodeWithTag(writer, 18, value.in_app_promo);
                AppMessageToggleTemplate.ADAPTER.encodeWithTag(writer, 12, value.toggle);
                ProtoAdapter.STRING.encodeWithTag(writer, 6, value.message_token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMessagePayload(String str, AppMessageToggleTemplate appMessageToggleTemplate, AppMessageInAppPromoTemplate appMessageInAppPromoTemplate, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.message_token = str;
        this.toggle = appMessageToggleTemplate;
        this.in_app_promo = appMessageInAppPromoTemplate;
        this.increment_activity_badge_count_by = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppMessagePayload)) {
            return false;
        }
        AppMessagePayload appMessagePayload = (AppMessagePayload) obj;
        return Intrinsics.areEqual(unknownFields(), appMessagePayload.unknownFields()) && Intrinsics.areEqual(this.message_token, appMessagePayload.message_token) && Intrinsics.areEqual(this.toggle, appMessagePayload.toggle) && Intrinsics.areEqual(this.in_app_promo, appMessagePayload.in_app_promo) && Intrinsics.areEqual(this.increment_activity_badge_count_by, appMessagePayload.increment_activity_badge_count_by);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.message_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        AppMessageToggleTemplate appMessageToggleTemplate = this.toggle;
        int hashCode3 = (hashCode2 + (appMessageToggleTemplate != null ? appMessageToggleTemplate.hashCode() : 0)) * 37;
        AppMessageInAppPromoTemplate appMessageInAppPromoTemplate = this.in_app_promo;
        int hashCode4 = (hashCode3 + (appMessageInAppPromoTemplate != null ? appMessageInAppPromoTemplate.hashCode() : 0)) * 37;
        Integer num = this.increment_activity_badge_count_by;
        int hashCode5 = hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.message_token = this.message_token;
        builder.toggle = this.toggle;
        builder.in_app_promo = this.in_app_promo;
        builder.increment_activity_badge_count_by = this.increment_activity_badge_count_by;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.message_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_token=", arrayList);
        }
        AppMessageToggleTemplate appMessageToggleTemplate = this.toggle;
        if (appMessageToggleTemplate != null) {
            arrayList.add("toggle=" + appMessageToggleTemplate);
        }
        AppMessageInAppPromoTemplate appMessageInAppPromoTemplate = this.in_app_promo;
        if (appMessageInAppPromoTemplate != null) {
            arrayList.add("in_app_promo=" + appMessageInAppPromoTemplate);
        }
        Integer num = this.increment_activity_badge_count_by;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("increment_activity_badge_count_by=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppMessagePayload{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AppMessagePayload build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
