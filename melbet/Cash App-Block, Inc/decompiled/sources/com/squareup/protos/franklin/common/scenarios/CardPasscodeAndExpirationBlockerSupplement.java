package com.squareup.protos.franklin.common.scenarios;

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

@Deprecated
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/CardPasscodeAndExpirationBlockerSupplement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/CardPasscodeAndExpirationBlockerSupplement$Builder;", "", "passcode_main_text", "Ljava/lang/String;", "expiration_main_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localized_passcode_main_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localized_expiration_main_text", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardPasscodeAndExpirationBlockerSupplement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardPasscodeAndExpirationBlockerSupplement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String expiration_main_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 3, tag = 4)
    public final LocalizableString localized_expiration_main_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 2, tag = 3)
    public final LocalizableString localized_passcode_main_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String passcode_main_text;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/CardPasscodeAndExpirationBlockerSupplement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/CardPasscodeAndExpirationBlockerSupplement;", "<init>", "()V", "passcode_main_text", "", "expiration_main_text", "localized_passcode_main_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localized_expiration_main_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String expiration_main_text;
        public LocalizableString localized_expiration_main_text;
        public LocalizableString localized_passcode_main_text;
        public String passcode_main_text;

        @Override // com.squareup.wire.Message.Builder
        public CardPasscodeAndExpirationBlockerSupplement build() {
            return new CardPasscodeAndExpirationBlockerSupplement(this.passcode_main_text, this.localized_passcode_main_text, this.expiration_main_text, this.localized_expiration_main_text, buildUnknownFields());
        }

        public final Builder expiration_main_text(String expiration_main_text) {
            this.expiration_main_text = expiration_main_text;
            return this;
        }

        public final Builder localized_expiration_main_text(LocalizableString localized_expiration_main_text) {
            this.localized_expiration_main_text = localized_expiration_main_text;
            return this;
        }

        public final Builder localized_passcode_main_text(LocalizableString localized_passcode_main_text) {
            this.localized_passcode_main_text = localized_passcode_main_text;
            return this;
        }

        public final Builder passcode_main_text(String passcode_main_text) {
            this.passcode_main_text = passcode_main_text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardPasscodeAndExpirationBlockerSupplement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.CardPasscodeAndExpirationBlockerSupplement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public CardPasscodeAndExpirationBlockerSupplement decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new CardPasscodeAndExpirationBlockerSupplement((String) obj, (LocalizableString) obj3, (String) obj2, (LocalizableString) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj3);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CardPasscodeAndExpirationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.passcode_main_text);
                protoAdapter2.encodeWithTag(writer, 2, value.expiration_main_text);
                ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 3, value.localized_passcode_main_text);
                protoAdapter3.encodeWithTag(writer, 4, value.localized_expiration_main_text);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CardPasscodeAndExpirationBlockerSupplement value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.expiration_main_text) + protoAdapter2.encodedSizeWithTag(1, value.passcode_main_text) + size$okio;
                ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                return protoAdapter3.encodedSizeWithTag(4, value.localized_expiration_main_text) + protoAdapter3.encodedSizeWithTag(3, value.localized_passcode_main_text) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CardPasscodeAndExpirationBlockerSupplement redact(CardPasscodeAndExpirationBlockerSupplement value) {
                value.getClass();
                LocalizableString localizableString = value.localized_passcode_main_text;
                LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                LocalizableString localizableString3 = value.localized_expiration_main_text;
                LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.passcode_main_text;
                String str2 = value.expiration_main_text;
                byteString.getClass();
                return new CardPasscodeAndExpirationBlockerSupplement(str, localizableString2, str2, localizableString4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CardPasscodeAndExpirationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 4, value.localized_expiration_main_text);
                protoAdapter2.encodeWithTag(writer, 3, value.localized_passcode_main_text);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 2, value.expiration_main_text);
                protoAdapter3.encodeWithTag(writer, 1, value.passcode_main_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardPasscodeAndExpirationBlockerSupplement(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.passcode_main_text = str;
        this.expiration_main_text = str2;
        this.localized_passcode_main_text = localizableString;
        this.localized_expiration_main_text = localizableString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardPasscodeAndExpirationBlockerSupplement)) {
            return false;
        }
        CardPasscodeAndExpirationBlockerSupplement cardPasscodeAndExpirationBlockerSupplement = (CardPasscodeAndExpirationBlockerSupplement) obj;
        return Intrinsics.areEqual(unknownFields(), cardPasscodeAndExpirationBlockerSupplement.unknownFields()) && Intrinsics.areEqual(this.passcode_main_text, cardPasscodeAndExpirationBlockerSupplement.passcode_main_text) && Intrinsics.areEqual(this.expiration_main_text, cardPasscodeAndExpirationBlockerSupplement.expiration_main_text) && Intrinsics.areEqual(this.localized_passcode_main_text, cardPasscodeAndExpirationBlockerSupplement.localized_passcode_main_text) && Intrinsics.areEqual(this.localized_expiration_main_text, cardPasscodeAndExpirationBlockerSupplement.localized_expiration_main_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.passcode_main_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.expiration_main_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localized_passcode_main_text;
        int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localized_expiration_main_text;
        int hashCode5 = hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.passcode_main_text = this.passcode_main_text;
        builder.expiration_main_text = this.expiration_main_text;
        builder.localized_passcode_main_text = this.localized_passcode_main_text;
        builder.localized_expiration_main_text = this.localized_expiration_main_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.passcode_main_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "passcode_main_text=", arrayList);
        }
        String str2 = this.expiration_main_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "expiration_main_text=", arrayList);
        }
        LocalizableString localizableString = this.localized_passcode_main_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_passcode_main_text=", localizableString, arrayList);
        }
        LocalizableString localizableString2 = this.localized_expiration_main_text;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_expiration_main_text=", localizableString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardPasscodeAndExpirationBlockerSupplement{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/CardPasscodeAndExpirationBlockerSupplement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/CardPasscodeAndExpirationBlockerSupplement$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/CardPasscodeAndExpirationBlockerSupplement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/CardPasscodeAndExpirationBlockerSupplement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CardPasscodeAndExpirationBlockerSupplement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
