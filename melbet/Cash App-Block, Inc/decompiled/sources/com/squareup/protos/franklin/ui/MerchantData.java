package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/ui/MerchantData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/MerchantData$Builder;", "", "category", "Ljava/lang/String;", "", "should_colorize_avatar", "Ljava/lang/Boolean;", "should_fill_background", "in_app_browser_shop_url", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localizable_category", "Lcom/squareup/protos/cash/localization/LocalizableString;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MerchantData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MerchantData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 9)
    public final String in_app_browser_shop_url;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 4, tag = 10)
    public final LocalizableString localizable_category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean should_colorize_avatar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 4)
    public final Boolean should_fill_background;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/ui/MerchantData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/MerchantData;", "<init>", "()V", "category", "", "should_colorize_avatar", "", "Ljava/lang/Boolean;", "should_fill_background", "in_app_browser_shop_url", "localizable_category", "Lcom/squareup/protos/cash/localization/LocalizableString;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/ui/MerchantData$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public String category;
        public String in_app_browser_shop_url;
        public LocalizableString localizable_category;
        public Boolean should_colorize_avatar;
        public Boolean should_fill_background;

        @Override // com.squareup.wire.Message.Builder
        public MerchantData build() {
            return new MerchantData(this.category, this.should_colorize_avatar, this.should_fill_background, this.in_app_browser_shop_url, this.localizable_category, buildUnknownFields());
        }

        public final Builder category(String category) {
            this.category = category;
            return this;
        }

        public final Builder in_app_browser_shop_url(String in_app_browser_shop_url) {
            this.in_app_browser_shop_url = in_app_browser_shop_url;
            return this;
        }

        public final Builder localizable_category(LocalizableString localizable_category) {
            this.localizable_category = localizable_category;
            return this;
        }

        public final Builder should_colorize_avatar(Boolean should_colorize_avatar) {
            this.should_colorize_avatar = should_colorize_avatar;
            return this;
        }

        public final Builder should_fill_background(Boolean should_fill_background) {
            this.should_fill_background = should_fill_background;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MerchantData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.MerchantData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public MerchantData decode(ProtoReader reader) {
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
                        return new MerchantData((String) obj, (Boolean) obj2, (Boolean) obj3, (String) obj4, (LocalizableString) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag == 4) {
                        obj3 = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag == 9) {
                        obj4 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 10) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj5);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MerchantData value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.category);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 2, value.should_colorize_avatar);
                protoAdapter3.encodeWithTag(writer, 4, value.should_fill_background);
                protoAdapter2.encodeWithTag(writer, 9, value.in_app_browser_shop_url);
                LocalizableString.ADAPTER.encodeWithTag(writer, 10, value.localizable_category);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MerchantData value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.category) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                return LocalizableString.ADAPTER.encodedSizeWithTag(10, value.localizable_category) + protoAdapter2.encodedSizeWithTag(9, value.in_app_browser_shop_url) + protoAdapter3.encodedSizeWithTag(4, value.should_fill_background) + protoAdapter3.encodedSizeWithTag(2, value.should_colorize_avatar) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MerchantData redact(MerchantData value) {
                value.getClass();
                LocalizableString localizableString = value.localizable_category;
                LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.category;
                Boolean bool = value.should_colorize_avatar;
                Boolean bool2 = value.should_fill_background;
                String str2 = value.in_app_browser_shop_url;
                byteString.getClass();
                return new MerchantData(str, bool, bool2, str2, localizableString2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MerchantData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LocalizableString.ADAPTER.encodeWithTag(writer, 10, value.localizable_category);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 9, value.in_app_browser_shop_url);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 4, value.should_fill_background);
                protoAdapter3.encodeWithTag(writer, 2, value.should_colorize_avatar);
                protoAdapter2.encodeWithTag(writer, 1, value.category);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantData(String str, Boolean bool, Boolean bool2, String str2, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.category = str;
        this.should_colorize_avatar = bool;
        this.should_fill_background = bool2;
        this.in_app_browser_shop_url = str2;
        this.localizable_category = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MerchantData)) {
            return false;
        }
        MerchantData merchantData = (MerchantData) obj;
        return Intrinsics.areEqual(unknownFields(), merchantData.unknownFields()) && Intrinsics.areEqual(this.category, merchantData.category) && Intrinsics.areEqual(this.should_colorize_avatar, merchantData.should_colorize_avatar) && Intrinsics.areEqual(this.should_fill_background, merchantData.should_fill_background) && Intrinsics.areEqual(this.in_app_browser_shop_url, merchantData.in_app_browser_shop_url) && Intrinsics.areEqual(this.localizable_category, merchantData.localizable_category);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.category;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.should_colorize_avatar;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.should_fill_background;
        int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str2 = this.in_app_browser_shop_url;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_category;
        int hashCode6 = hashCode5 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.category = this.category;
        builder.should_colorize_avatar = this.should_colorize_avatar;
        builder.should_fill_background = this.should_fill_background;
        builder.in_app_browser_shop_url = this.in_app_browser_shop_url;
        builder.localizable_category = this.localizable_category;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.category;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "category=", arrayList);
        }
        Boolean bool = this.should_colorize_avatar;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_colorize_avatar=", bool, arrayList);
        }
        Boolean bool2 = this.should_fill_background;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_fill_background=", bool2, arrayList);
        }
        String str2 = this.in_app_browser_shop_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "in_app_browser_shop_url=", arrayList);
        }
        LocalizableString localizableString = this.localizable_category;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_category=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MerchantData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/MerchantData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/MerchantData$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/MerchantData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/MerchantData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ MerchantData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
