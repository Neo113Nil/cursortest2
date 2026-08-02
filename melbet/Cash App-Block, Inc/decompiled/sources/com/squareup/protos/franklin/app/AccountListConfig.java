package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.app.ProfileListConfig;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AccountListConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AccountListConfig> CREATOR;
    public final List accounts;
    public final ClientScenario client_scenario;

    /* loaded from: classes8.dex */
    public final class Account extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Account> CREATOR;
        public final String account_id;
        public final List aliases;
        public final Avatar avatar;
        public final String cash_tag;
        public final Boolean is_business;
        public final Boolean is_passkey_registered;
        public final UiAlias preferred_alias;
        public final Region region;
        public final String subtitle;
        public final String title;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public String account_id;
            public List aliases;
            public Avatar avatar;
            public String cash_tag;
            public Boolean is_business;
            public Boolean is_passkey_registered;
            public UiAlias preferred_alias;
            public Region region;
            public String subtitle;
            public String title;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Account(this.title, this.subtitle, this.avatar, this.aliases, this.preferred_alias, this.account_id, this.cash_tag, this.region, this.is_passkey_registered, this.is_business, buildUnknownFields());
                    default:
                        return new ProfileListConfig.Profile(this.title, this.subtitle, this.avatar, this.aliases, this.preferred_alias, this.account_id, this.cash_tag, this.region, this.is_passkey_registered, this.is_business, buildUnknownFields());
                }
            }
        }

        static {
            AccountListConfig$Account$Companion$ADAPTER$1 accountListConfig$Account$Companion$ADAPTER$1 = new AccountListConfig$Account$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Account.class), "type.googleapis.com/squareup.franklin.app.AccountListConfig.Account", Syntax.PROTO_2, null, "squareup/franklin/app/initiateSession.proto");
            ADAPTER = accountListConfig$Account$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(accountListConfig$Account$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Account(String str, String str2, Avatar avatar, List list, UiAlias uiAlias, String str3, String str4, Region region, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.avatar = avatar;
            this.preferred_alias = uiAlias;
            this.account_id = str3;
            this.cash_tag = str4;
            this.region = region;
            this.is_passkey_registered = bool;
            this.is_business = bool2;
            this.aliases = TransactorKt.immutableCopyOf("aliases", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Account)) {
                return false;
            }
            Account account = (Account) obj;
            return Intrinsics.areEqual(unknownFields(), account.unknownFields()) && Intrinsics.areEqual(this.title, account.title) && Intrinsics.areEqual(this.subtitle, account.subtitle) && Intrinsics.areEqual(this.avatar, account.avatar) && Intrinsics.areEqual(this.aliases, account.aliases) && Intrinsics.areEqual(this.preferred_alias, account.preferred_alias) && Intrinsics.areEqual(this.account_id, account.account_id) && Intrinsics.areEqual(this.cash_tag, account.cash_tag) && this.region == account.region && Intrinsics.areEqual(this.is_passkey_registered, account.is_passkey_registered) && Intrinsics.areEqual(this.is_business, account.is_business);
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
            Avatar avatar = this.avatar;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (avatar != null ? avatar.hashCode() : 0)) * 37, 37, this.aliases);
            UiAlias uiAlias = this.preferred_alias;
            int hashCode4 = (m + (uiAlias != null ? uiAlias.hashCode() : 0)) * 37;
            String str3 = this.account_id;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.cash_tag;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Region region = this.region;
            int hashCode7 = (hashCode6 + (region != null ? region.hashCode() : 0)) * 37;
            Boolean bool = this.is_passkey_registered;
            int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_business;
            int hashCode9 = hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.avatar = this.avatar;
            builder.aliases = this.aliases;
            builder.preferred_alias = this.preferred_alias;
            builder.account_id = this.account_id;
            builder.cash_tag = this.cash_tag;
            builder.region = this.region;
            builder.is_passkey_registered = this.is_passkey_registered;
            builder.is_business = this.is_business;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.title != null) {
                arrayList.add("title=██");
            }
            if (this.subtitle != null) {
                arrayList.add("subtitle=██");
            }
            Avatar avatar = this.avatar;
            if (avatar != null) {
                arrayList.add("avatar=" + avatar);
            }
            List list = this.aliases;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("aliases=", arrayList, list);
            }
            UiAlias uiAlias = this.preferred_alias;
            if (uiAlias != null) {
                arrayList.add("preferred_alias=" + uiAlias);
            }
            if (this.account_id != null) {
                arrayList.add("account_id=██");
            }
            if (this.cash_tag != null) {
                arrayList.add("cash_tag=██");
            }
            Region region = this.region;
            if (region != null) {
                arrayList.add("region=" + region);
            }
            Boolean bool = this.is_passkey_registered;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_passkey_registered=", bool, arrayList);
            }
            Boolean bool2 = this.is_business;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_business=", bool2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Account{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List accounts;
        public ClientScenario client_scenario;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.accounts = EmptyList.INSTANCE;
                    break;
                default:
                    this.accounts = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new AccountListConfig(this.accounts, this.client_scenario, buildUnknownFields());
                default:
                    return new ProfileListConfig(this.accounts, this.client_scenario, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AccountListConfig.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.AccountListConfig$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new AccountListConfig(m, (ClientScenario) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(AccountListConfig.Account.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj = ClientScenario.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AccountListConfig accountListConfig = (AccountListConfig) obj;
                reverseProtoWriter.getClass();
                accountListConfig.getClass();
                reverseProtoWriter.writeBytes(accountListConfig.unknownFields());
                ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 2, accountListConfig.client_scenario);
                AccountListConfig.Account.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, accountListConfig.accounts);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AccountListConfig accountListConfig = (AccountListConfig) obj;
                accountListConfig.getClass();
                return ClientScenario.ADAPTER.encodedSizeWithTag(2, accountListConfig.client_scenario) + AccountListConfig.Account.ADAPTER.asRepeated().encodedSizeWithTag(1, accountListConfig.accounts) + accountListConfig.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AccountListConfig accountListConfig = (AccountListConfig) obj;
                accountListConfig.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(accountListConfig.accounts, AccountListConfig.Account.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                ClientScenario clientScenario = accountListConfig.client_scenario;
                byteString.getClass();
                return new AccountListConfig(m1169redactElements, clientScenario, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AccountListConfig accountListConfig = (AccountListConfig) obj;
                accountListConfig.getClass();
                AccountListConfig.Account.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, accountListConfig.accounts);
                ClientScenario.ADAPTER.encodeWithTag(protoWriter, 2, accountListConfig.client_scenario);
                protoWriter.writeBytes(accountListConfig.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountListConfig(List list, ClientScenario clientScenario, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.client_scenario = clientScenario;
        this.accounts = TransactorKt.immutableCopyOf("accounts", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountListConfig)) {
            return false;
        }
        AccountListConfig accountListConfig = (AccountListConfig) obj;
        return Intrinsics.areEqual(unknownFields(), accountListConfig.unknownFields()) && Intrinsics.areEqual(this.accounts, accountListConfig.accounts) && this.client_scenario == accountListConfig.client_scenario;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.accounts);
        ClientScenario clientScenario = this.client_scenario;
        int hashCode = m + (clientScenario != null ? clientScenario.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.accounts = this.accounts;
        builder.client_scenario = this.client_scenario;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.accounts;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("accounts=", arrayList, list);
        }
        ClientScenario clientScenario = this.client_scenario;
        if (clientScenario != null) {
            Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountListConfig{", "}", 0, null, null, 56);
    }
}
