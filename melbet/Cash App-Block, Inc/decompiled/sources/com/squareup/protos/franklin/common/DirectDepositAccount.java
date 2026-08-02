package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class DirectDepositAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DirectDepositAccount> CREATOR;
    public final String account_number;
    public final String account_number_prefix;
    public final String dda_explanation_text;
    public final Boolean display_complete_account_number;
    public final Boolean is_placeholder;
    public final LocalizableString localizable_dda_explanation_text;
    public final DirectDepositAccountState primary_dda_state;
    public final String routing_number;
    public final String support_node_token;

    /* loaded from: classes8.dex */
    public enum DirectDepositAccountState implements WireEnum {
        OPEN(1),
        CLOSED(2),
        NOT_PRESENT(3),
        LOCKED(4);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final DirectDepositAccount$DirectDepositAccountState$Companion$ADAPTER$1 ADAPTER = new DirectDepositAccount$DirectDepositAccountState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DirectDepositAccountState.class), Syntax.PROTO_2, null);

        DirectDepositAccountState(int i) {
            this.value = i;
        }

        public static final DirectDepositAccountState fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return OPEN;
            }
            if (i == 2) {
                return CLOSED;
            }
            if (i == 3) {
                return NOT_PRESENT;
            }
            if (i != 4) {
                return null;
            }
            return LOCKED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DirectDepositAccount.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.common.DirectDepositAccount$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                Object obj;
                Object obj2;
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new DirectDepositAccount((String) obj3, (String) obj4, (String) obj5, (Boolean) obj6, (String) obj7, (LocalizableString) obj8, (Boolean) obj9, (String) obj10, (DirectDepositAccount.DirectDepositAccountState) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            obj6 = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 5:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 6:
                            obj9 = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 7:
                            obj10 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 8:
                            obj8 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj8);
                            continue;
                        case 9:
                            try {
                                obj11 = DirectDepositAccount.DirectDepositAccountState.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj3;
                                obj2 = obj4;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj3;
                            obj2 = obj4;
                            break;
                    }
                    obj3 = obj;
                    obj4 = obj2;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                DirectDepositAccount directDepositAccount = (DirectDepositAccount) obj;
                reverseProtoWriter.getClass();
                directDepositAccount.getClass();
                reverseProtoWriter.writeBytes(directDepositAccount.unknownFields());
                DirectDepositAccount.DirectDepositAccountState.ADAPTER.encodeWithTag(reverseProtoWriter, 9, directDepositAccount.primary_dda_state);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, directDepositAccount.support_node_token);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 6, directDepositAccount.display_complete_account_number);
                LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, directDepositAccount.localizable_dda_explanation_text);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, directDepositAccount.dda_explanation_text);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 4, directDepositAccount.is_placeholder);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, directDepositAccount.account_number_prefix);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, directDepositAccount.account_number);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, directDepositAccount.routing_number);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                DirectDepositAccount directDepositAccount = (DirectDepositAccount) obj;
                directDepositAccount.getClass();
                int size$okio = directDepositAccount.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(3, directDepositAccount.account_number_prefix) + protoAdapter2.encodedSizeWithTag(2, directDepositAccount.account_number) + protoAdapter2.encodedSizeWithTag(1, directDepositAccount.routing_number) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                return DirectDepositAccount.DirectDepositAccountState.ADAPTER.encodedSizeWithTag(9, directDepositAccount.primary_dda_state) + protoAdapter2.encodedSizeWithTag(7, directDepositAccount.support_node_token) + protoAdapter3.encodedSizeWithTag(6, directDepositAccount.display_complete_account_number) + LocalizableString.ADAPTER.encodedSizeWithTag(8, directDepositAccount.localizable_dda_explanation_text) + protoAdapter2.encodedSizeWithTag(5, directDepositAccount.dda_explanation_text) + protoAdapter3.encodedSizeWithTag(4, directDepositAccount.is_placeholder) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                DirectDepositAccount directDepositAccount = (DirectDepositAccount) obj;
                directDepositAccount.getClass();
                LocalizableString localizableString = directDepositAccount.localizable_dda_explanation_text;
                LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = directDepositAccount.account_number_prefix;
                Boolean bool = directDepositAccount.is_placeholder;
                String str2 = directDepositAccount.dda_explanation_text;
                Boolean bool2 = directDepositAccount.display_complete_account_number;
                String str3 = directDepositAccount.support_node_token;
                DirectDepositAccount.DirectDepositAccountState directDepositAccountState = directDepositAccount.primary_dda_state;
                byteString.getClass();
                return new DirectDepositAccount(null, null, str, bool, str2, localizableString2, bool2, str3, directDepositAccountState, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                DirectDepositAccount directDepositAccount = (DirectDepositAccount) obj;
                directDepositAccount.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, directDepositAccount.routing_number);
                protoAdapter2.encodeWithTag(protoWriter, 2, directDepositAccount.account_number);
                protoAdapter2.encodeWithTag(protoWriter, 3, directDepositAccount.account_number_prefix);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(protoWriter, 4, directDepositAccount.is_placeholder);
                protoAdapter2.encodeWithTag(protoWriter, 5, directDepositAccount.dda_explanation_text);
                LocalizableString.ADAPTER.encodeWithTag(protoWriter, 8, directDepositAccount.localizable_dda_explanation_text);
                protoAdapter3.encodeWithTag(protoWriter, 6, directDepositAccount.display_complete_account_number);
                protoAdapter2.encodeWithTag(protoWriter, 7, directDepositAccount.support_node_token);
                DirectDepositAccount.DirectDepositAccountState.ADAPTER.encodeWithTag(protoWriter, 9, directDepositAccount.primary_dda_state);
                protoWriter.writeBytes(directDepositAccount.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDepositAccount(String str, String str2, String str3, Boolean bool, String str4, LocalizableString localizableString, Boolean bool2, String str5, DirectDepositAccountState directDepositAccountState, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.routing_number = str;
        this.account_number = str2;
        this.account_number_prefix = str3;
        this.is_placeholder = bool;
        this.dda_explanation_text = str4;
        this.localizable_dda_explanation_text = localizableString;
        this.display_complete_account_number = bool2;
        this.support_node_token = str5;
        this.primary_dda_state = directDepositAccountState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DirectDepositAccount)) {
            return false;
        }
        DirectDepositAccount directDepositAccount = (DirectDepositAccount) obj;
        return Intrinsics.areEqual(unknownFields(), directDepositAccount.unknownFields()) && Intrinsics.areEqual(this.routing_number, directDepositAccount.routing_number) && Intrinsics.areEqual(this.account_number, directDepositAccount.account_number) && Intrinsics.areEqual(this.account_number_prefix, directDepositAccount.account_number_prefix) && Intrinsics.areEqual(this.is_placeholder, directDepositAccount.is_placeholder) && Intrinsics.areEqual(this.dda_explanation_text, directDepositAccount.dda_explanation_text) && Intrinsics.areEqual(this.localizable_dda_explanation_text, directDepositAccount.localizable_dda_explanation_text) && Intrinsics.areEqual(this.display_complete_account_number, directDepositAccount.display_complete_account_number) && Intrinsics.areEqual(this.support_node_token, directDepositAccount.support_node_token) && this.primary_dda_state == directDepositAccount.primary_dda_state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.routing_number;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.account_number;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.account_number_prefix;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.is_placeholder;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str4 = this.dda_explanation_text;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_dda_explanation_text;
        int hashCode7 = (hashCode6 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        Boolean bool2 = this.display_complete_account_number;
        int hashCode8 = (hashCode7 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str5 = this.support_node_token;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        DirectDepositAccountState directDepositAccountState = this.primary_dda_state;
        int hashCode10 = hashCode9 + (directDepositAccountState != null ? directDepositAccountState.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(8, false);
        builder.token = this.routing_number;
        builder.source = this.account_number;
        builder.target = this.account_number_prefix;
        builder.state = this.is_placeholder;
        builder.amount = this.dda_explanation_text;
        builder.push_amount = this.localizable_dda_explanation_text;
        builder.created_at = this.display_complete_account_number;
        builder.completed_at = this.support_node_token;
        builder.failed_at = this.primary_dda_state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.routing_number != null) {
            arrayList.add("routing_number=██");
        }
        if (this.account_number != null) {
            arrayList.add("account_number=██");
        }
        String str = this.account_number_prefix;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "account_number_prefix=", arrayList);
        }
        Boolean bool = this.is_placeholder;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_placeholder=", bool, arrayList);
        }
        String str2 = this.dda_explanation_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dda_explanation_text=", arrayList);
        }
        LocalizableString localizableString = this.localizable_dda_explanation_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_dda_explanation_text=", localizableString, arrayList);
        }
        Boolean bool2 = this.display_complete_account_number;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_complete_account_number=", bool2, arrayList);
        }
        String str3 = this.support_node_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "support_node_token=", arrayList);
        }
        DirectDepositAccountState directDepositAccountState = this.primary_dda_state;
        if (directDepositAccountState != null) {
            arrayList.add("primary_dda_state=" + directDepositAccountState);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DirectDepositAccount{", "}", 0, null, null, 56);
    }
}
