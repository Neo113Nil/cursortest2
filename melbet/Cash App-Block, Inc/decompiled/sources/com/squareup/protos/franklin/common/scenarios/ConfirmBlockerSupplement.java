package com.squareup.protos.franklin.common.scenarios;

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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u0012\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/ConfirmBlockerSupplement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/ConfirmBlockerSupplement$Builder;", "", "main_text", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/common/scenarios/MenuItem;", "menu_item_confirm_payment", "Lcom/squareup/protos/franklin/common/scenarios/MenuItem;", "getMenu_item_confirm_payment$annotations", "()V", "menu_item_pay_duplicate", "getMenu_item_pay_duplicate$annotations", "confirm_payment_button_title", "pay_duplicate_button_title", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConfirmBlockerSupplement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ConfirmBlockerSupplement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String confirm_payment_button_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String main_text;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.MenuItem#ADAPTER", schemaIndex = 1, tag = 2)
    public final MenuItem menu_item_confirm_payment;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.MenuItem#ADAPTER", schemaIndex = 2, tag = 3)
    public final MenuItem menu_item_pay_duplicate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String pay_duplicate_button_title;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/ConfirmBlockerSupplement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/ConfirmBlockerSupplement;", "<init>", "()V", "main_text", "", "menu_item_confirm_payment", "Lcom/squareup/protos/franklin/common/scenarios/MenuItem;", "menu_item_pay_duplicate", "confirm_payment_button_title", "pay_duplicate_button_title", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String confirm_payment_button_title;
        public String main_text;
        public MenuItem menu_item_confirm_payment;
        public MenuItem menu_item_pay_duplicate;
        public String pay_duplicate_button_title;

        @Override // com.squareup.wire.Message.Builder
        public ConfirmBlockerSupplement build() {
            return new ConfirmBlockerSupplement(this.main_text, this.menu_item_confirm_payment, this.menu_item_pay_duplicate, this.confirm_payment_button_title, this.pay_duplicate_button_title, buildUnknownFields());
        }

        public final Builder confirm_payment_button_title(String confirm_payment_button_title) {
            this.confirm_payment_button_title = confirm_payment_button_title;
            return this;
        }

        public final Builder main_text(String main_text) {
            this.main_text = main_text;
            return this;
        }

        @Deprecated
        public final Builder menu_item_confirm_payment(MenuItem menu_item_confirm_payment) {
            this.menu_item_confirm_payment = menu_item_confirm_payment;
            return this;
        }

        @Deprecated
        public final Builder menu_item_pay_duplicate(MenuItem menu_item_pay_duplicate) {
            this.menu_item_pay_duplicate = menu_item_pay_duplicate;
            return this;
        }

        public final Builder pay_duplicate_button_title(String pay_duplicate_button_title) {
            this.pay_duplicate_button_title = pay_duplicate_button_title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmBlockerSupplement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.ConfirmBlockerSupplement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ConfirmBlockerSupplement decode(ProtoReader reader) {
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
                        return new ConfirmBlockerSupplement((String) obj, (MenuItem) obj2, (MenuItem) obj3, (String) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(MenuItem.ADAPTER, reader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(MenuItem.ADAPTER, reader, obj3);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ConfirmBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.main_text);
                ProtoAdapter protoAdapter3 = MenuItem.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 2, value.menu_item_confirm_payment);
                protoAdapter3.encodeWithTag(writer, 3, value.menu_item_pay_duplicate);
                protoAdapter2.encodeWithTag(writer, 4, value.confirm_payment_button_title);
                protoAdapter2.encodeWithTag(writer, 5, value.pay_duplicate_button_title);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ConfirmBlockerSupplement value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.main_text) + size$okio;
                ProtoAdapter protoAdapter3 = MenuItem.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(5, value.pay_duplicate_button_title) + protoAdapter2.encodedSizeWithTag(4, value.confirm_payment_button_title) + protoAdapter3.encodedSizeWithTag(3, value.menu_item_pay_duplicate) + protoAdapter3.encodedSizeWithTag(2, value.menu_item_confirm_payment) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ConfirmBlockerSupplement redact(ConfirmBlockerSupplement value) {
                value.getClass();
                MenuItem menuItem = value.menu_item_confirm_payment;
                MenuItem menuItem2 = menuItem != null ? (MenuItem) MenuItem.ADAPTER.redact(menuItem) : null;
                MenuItem menuItem3 = value.menu_item_pay_duplicate;
                MenuItem menuItem4 = menuItem3 != null ? (MenuItem) MenuItem.ADAPTER.redact(menuItem3) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.confirm_payment_button_title;
                String str2 = value.pay_duplicate_button_title;
                byteString.getClass();
                return new ConfirmBlockerSupplement(null, menuItem2, menuItem4, str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ConfirmBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.pay_duplicate_button_title);
                protoAdapter2.encodeWithTag(writer, 4, value.confirm_payment_button_title);
                ProtoAdapter protoAdapter3 = MenuItem.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 3, value.menu_item_pay_duplicate);
                protoAdapter3.encodeWithTag(writer, 2, value.menu_item_confirm_payment);
                protoAdapter2.encodeWithTag(writer, 1, value.main_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmBlockerSupplement(String str, MenuItem menuItem, MenuItem menuItem2, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.main_text = str;
        this.menu_item_confirm_payment = menuItem;
        this.menu_item_pay_duplicate = menuItem2;
        this.confirm_payment_button_title = str2;
        this.pay_duplicate_button_title = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfirmBlockerSupplement)) {
            return false;
        }
        ConfirmBlockerSupplement confirmBlockerSupplement = (ConfirmBlockerSupplement) obj;
        return Intrinsics.areEqual(unknownFields(), confirmBlockerSupplement.unknownFields()) && Intrinsics.areEqual(this.main_text, confirmBlockerSupplement.main_text) && Intrinsics.areEqual(this.menu_item_confirm_payment, confirmBlockerSupplement.menu_item_confirm_payment) && Intrinsics.areEqual(this.menu_item_pay_duplicate, confirmBlockerSupplement.menu_item_pay_duplicate) && Intrinsics.areEqual(this.confirm_payment_button_title, confirmBlockerSupplement.confirm_payment_button_title) && Intrinsics.areEqual(this.pay_duplicate_button_title, confirmBlockerSupplement.pay_duplicate_button_title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.main_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        MenuItem menuItem = this.menu_item_confirm_payment;
        int hashCode3 = (hashCode2 + (menuItem != null ? menuItem.hashCode() : 0)) * 37;
        MenuItem menuItem2 = this.menu_item_pay_duplicate;
        int hashCode4 = (hashCode3 + (menuItem2 != null ? menuItem2.hashCode() : 0)) * 37;
        String str2 = this.confirm_payment_button_title;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.pay_duplicate_button_title;
        int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.main_text = this.main_text;
        builder.menu_item_confirm_payment = this.menu_item_confirm_payment;
        builder.menu_item_pay_duplicate = this.menu_item_pay_duplicate;
        builder.confirm_payment_button_title = this.confirm_payment_button_title;
        builder.pay_duplicate_button_title = this.pay_duplicate_button_title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.main_text != null) {
            arrayList.add("main_text=██");
        }
        MenuItem menuItem = this.menu_item_confirm_payment;
        if (menuItem != null) {
            arrayList.add("menu_item_confirm_payment=" + menuItem);
        }
        MenuItem menuItem2 = this.menu_item_pay_duplicate;
        if (menuItem2 != null) {
            arrayList.add("menu_item_pay_duplicate=" + menuItem2);
        }
        String str = this.confirm_payment_button_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "confirm_payment_button_title=", arrayList);
        }
        String str2 = this.pay_duplicate_button_title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "pay_duplicate_button_title=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmBlockerSupplement{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/ConfirmBlockerSupplement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/ConfirmBlockerSupplement$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/ConfirmBlockerSupplement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/ConfirmBlockerSupplement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ConfirmBlockerSupplement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
