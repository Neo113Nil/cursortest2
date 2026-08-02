package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.AddMoneyScreen;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/AddMoneyScreen;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AddMoneyScreen$Builder;", "", "title", "Ljava/lang/String;", "subtitle", "confirmation_button_text", "Lcom/squareup/protos/franklin/api/AddMoneyScreen$GooglePayButton;", "google_pay_button", "Lcom/squareup/protos/franklin/api/AddMoneyScreen$GooglePayButton;", "Lcom/squareup/protos/common/Money;", "initial_amount", "Lcom/squareup/protos/common/Money;", "max_amount", "min_amount", "Companion", "Builder", "GooglePayButton", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AddMoneyScreen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddMoneyScreen> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String confirmation_button_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.AddMoneyScreen$GooglePayButton#ADAPTER", schemaIndex = 3, tag = 4)
    public final GooglePayButton google_pay_button;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 4, tag = 5)
    public final Money initial_amount;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 5, tag = 6)
    public final Money max_amount;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 6, tag = 7)
    public final Money min_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/AddMoneyScreen$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AddMoneyScreen;", "<init>", "()V", "title", "", "subtitle", "confirmation_button_text", "google_pay_button", "Lcom/squareup/protos/franklin/api/AddMoneyScreen$GooglePayButton;", "initial_amount", "Lcom/squareup/protos/common/Money;", "max_amount", "min_amount", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String confirmation_button_text;
        public GooglePayButton google_pay_button;
        public Money initial_amount;
        public Money max_amount;
        public Money min_amount;
        public String subtitle;
        public String title;

        @Override // com.squareup.wire.Message.Builder
        public AddMoneyScreen build() {
            return new AddMoneyScreen(this.title, this.subtitle, this.confirmation_button_text, this.google_pay_button, this.initial_amount, this.max_amount, this.min_amount, buildUnknownFields());
        }

        public final Builder confirmation_button_text(String confirmation_button_text) {
            this.confirmation_button_text = confirmation_button_text;
            return this;
        }

        public final Builder google_pay_button(GooglePayButton google_pay_button) {
            this.google_pay_button = google_pay_button;
            return this;
        }

        public final Builder initial_amount(Money initial_amount) {
            this.initial_amount = initial_amount;
            return this;
        }

        public final Builder max_amount(Money max_amount) {
            this.max_amount = max_amount;
            return this;
        }

        public final Builder min_amount(Money min_amount) {
            this.min_amount = min_amount;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddMoneyScreen.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AddMoneyScreen$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AddMoneyScreen decode(ProtoReader reader) {
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
                        return new AddMoneyScreen((String) obj, (String) obj2, (String) obj3, (AddMoneyScreen.GooglePayButton) obj4, (Money) obj5, (Money) obj6, (Money) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
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
                            obj4 = TransactorKt.decodeMessageOrMerge(AddMoneyScreen.GooglePayButton.ADAPTER, reader, obj4);
                            break;
                        case 5:
                            obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj5);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj6);
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj7);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AddMoneyScreen value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 3, value.confirmation_button_text);
                AddMoneyScreen.GooglePayButton.ADAPTER.encodeWithTag(writer, 4, value.google_pay_button);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 5, value.initial_amount);
                protoAdapter3.encodeWithTag(writer, 6, value.max_amount);
                protoAdapter3.encodeWithTag(writer, 7, value.min_amount);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AddMoneyScreen value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = AddMoneyScreen.GooglePayButton.ADAPTER.encodedSizeWithTag(4, value.google_pay_button) + protoAdapter2.encodedSizeWithTag(3, value.confirmation_button_text) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                return protoAdapter3.encodedSizeWithTag(7, value.min_amount) + protoAdapter3.encodedSizeWithTag(6, value.max_amount) + protoAdapter3.encodedSizeWithTag(5, value.initial_amount) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AddMoneyScreen redact(AddMoneyScreen value) {
                value.getClass();
                AddMoneyScreen.GooglePayButton googlePayButton = value.google_pay_button;
                AddMoneyScreen.GooglePayButton googlePayButton2 = googlePayButton != null ? (AddMoneyScreen.GooglePayButton) AddMoneyScreen.GooglePayButton.ADAPTER.redact(googlePayButton) : null;
                Money money = value.initial_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = value.max_amount;
                Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                Money money5 = value.min_amount;
                Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.subtitle;
                String str3 = value.confirmation_button_text;
                byteString.getClass();
                return new AddMoneyScreen(str, str2, str3, googlePayButton2, money2, money4, money6, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AddMoneyScreen value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 7, value.min_amount);
                protoAdapter2.encodeWithTag(writer, 6, value.max_amount);
                protoAdapter2.encodeWithTag(writer, 5, value.initial_amount);
                AddMoneyScreen.GooglePayButton.ADAPTER.encodeWithTag(writer, 4, value.google_pay_button);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 3, value.confirmation_button_text);
                protoAdapter3.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter3.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMoneyScreen(String str, String str2, String str3, GooglePayButton googlePayButton, Money money, Money money2, Money money3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.confirmation_button_text = str3;
        this.google_pay_button = googlePayButton;
        this.initial_amount = money;
        this.max_amount = money2;
        this.min_amount = money3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddMoneyScreen)) {
            return false;
        }
        AddMoneyScreen addMoneyScreen = (AddMoneyScreen) obj;
        return Intrinsics.areEqual(unknownFields(), addMoneyScreen.unknownFields()) && Intrinsics.areEqual(this.title, addMoneyScreen.title) && Intrinsics.areEqual(this.subtitle, addMoneyScreen.subtitle) && Intrinsics.areEqual(this.confirmation_button_text, addMoneyScreen.confirmation_button_text) && Intrinsics.areEqual(this.google_pay_button, addMoneyScreen.google_pay_button) && Intrinsics.areEqual(this.initial_amount, addMoneyScreen.initial_amount) && Intrinsics.areEqual(this.max_amount, addMoneyScreen.max_amount) && Intrinsics.areEqual(this.min_amount, addMoneyScreen.min_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.confirmation_button_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        GooglePayButton googlePayButton = this.google_pay_button;
        int hashCode5 = (hashCode4 + (googlePayButton != null ? googlePayButton.hashCode() : 0)) * 37;
        Money money = this.initial_amount;
        int hashCode6 = (hashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.max_amount;
        int hashCode7 = (hashCode6 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.min_amount;
        int hashCode8 = hashCode7 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.confirmation_button_text = this.confirmation_button_text;
        builder.google_pay_button = this.google_pay_button;
        builder.initial_amount = this.initial_amount;
        builder.max_amount = this.max_amount;
        builder.min_amount = this.min_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        String str3 = this.confirmation_button_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "confirmation_button_text=", arrayList);
        }
        GooglePayButton googlePayButton = this.google_pay_button;
        if (googlePayButton != null) {
            arrayList.add("google_pay_button=" + googlePayButton);
        }
        Money money = this.initial_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("initial_amount=", money, arrayList);
        }
        Money money2 = this.max_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("max_amount=", money2, arrayList);
        }
        Money money3 = this.min_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("min_amount=", money3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddMoneyScreen{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AddMoneyScreen$GooglePayButton;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AddMoneyScreen$GooglePayButton$Builder;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GooglePayButton extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GooglePayButton> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/AddMoneyScreen$GooglePayButton$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AddMoneyScreen$GooglePayButton;", "<init>", "()V", "text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public GooglePayButton build() {
                return new GooglePayButton(this.text, buildUnknownFields());
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GooglePayButton.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AddMoneyScreen$GooglePayButton$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyScreen.GooglePayButton decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AddMoneyScreen.GooglePayButton((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AddMoneyScreen.GooglePayButton value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AddMoneyScreen.GooglePayButton value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AddMoneyScreen.GooglePayButton redact(AddMoneyScreen.GooglePayButton value) {
                    value.getClass();
                    return AddMoneyScreen.GooglePayButton.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AddMoneyScreen.GooglePayButton value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ GooglePayButton(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ GooglePayButton copy$default(GooglePayButton googlePayButton, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = googlePayButton.text;
            }
            if ((i & 2) != 0) {
                byteString = googlePayButton.unknownFields();
            }
            return googlePayButton.copy(str, byteString);
        }

        public final GooglePayButton copy(String text, ByteString unknownFields) {
            unknownFields.getClass();
            return new GooglePayButton(text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof GooglePayButton)) {
                return false;
            }
            GooglePayButton googlePayButton = (GooglePayButton) other;
            return Intrinsics.areEqual(unknownFields(), googlePayButton.unknownFields()) && Intrinsics.areEqual(this.text, googlePayButton.text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GooglePayButton{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AddMoneyScreen$GooglePayButton$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AddMoneyScreen$GooglePayButton$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AddMoneyScreen$GooglePayButton;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AddMoneyScreen$GooglePayButton;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ GooglePayButton build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public GooglePayButton() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePayButton(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AddMoneyScreen$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AddMoneyScreen$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AddMoneyScreen;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AddMoneyScreen;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AddMoneyScreen build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
