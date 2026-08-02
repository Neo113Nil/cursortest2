package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.PreferenceManager;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import okio.Path;
import okio.internal.ResourceFileSystem;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/janus/api/GetAccountSettingsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/SandboxMetadata$Builder;", "Builder", "SettingType", "SettingName", "SettingCollection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetAccountSettingsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAccountSettingsResponse> CREATOR;
    public final List collection;

    public final class SettingCollection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SettingCollection> CREATOR;
        public final List settings;

        /* renamed from: type, reason: collision with root package name */
        public final SettingType f1282type;

        public final class Setting extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Setting> CREATOR;
            public final Boolean editable;
            public final SettingName key;

            static {
                GetAccountSettingsResponse$SettingCollection$Setting$Companion$ADAPTER$1 getAccountSettingsResponse$SettingCollection$Setting$Companion$ADAPTER$1 = new GetAccountSettingsResponse$SettingCollection$Setting$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Setting.class), "type.googleapis.com/squareup.cash.janus.api.GetAccountSettingsResponse.SettingCollection.Setting", Syntax.PROTO_2, null, "squareup/cash/janus/api/AccountSettings.proto");
                ADAPTER = getAccountSettingsResponse$SettingCollection$Setting$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getAccountSettingsResponse$SettingCollection$Setting$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Setting(SettingName settingName, Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.key = settingName;
                this.editable = bool;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Setting)) {
                    return false;
                }
                Setting setting = (Setting) obj;
                return Intrinsics.areEqual(unknownFields(), setting.unknownFields()) && this.key == setting.key && Intrinsics.areEqual(this.editable, setting.editable);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                SettingName settingName = this.key;
                int hashCode2 = (hashCode + (settingName != null ? settingName.hashCode() : 0)) * 37;
                Boolean bool = this.editable;
                int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Card.Builder builder = new Card.Builder(16);
                builder.card_type = this.key;
                builder.card_pii = this.editable;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                SettingName settingName = this.key;
                if (settingName != null) {
                    arrayList.add("key=" + settingName);
                }
                Boolean bool = this.editable;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("editable=", bool, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Setting{", "}", 0, null, null, 56);
            }
        }

        static {
            GetAccountSettingsResponse$SettingCollection$Companion$ADAPTER$1 getAccountSettingsResponse$SettingCollection$Companion$ADAPTER$1 = new GetAccountSettingsResponse$SettingCollection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SettingCollection.class), "type.googleapis.com/squareup.cash.janus.api.GetAccountSettingsResponse.SettingCollection", Syntax.PROTO_2, null, "squareup/cash/janus/api/AccountSettings.proto");
            ADAPTER = getAccountSettingsResponse$SettingCollection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getAccountSettingsResponse$SettingCollection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingCollection(SettingType settingType, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.f1282type = settingType;
            this.settings = TransactorKt.immutableCopyOf(PreferenceManager.PREF_SETTINGS, list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SettingCollection)) {
                return false;
            }
            SettingCollection settingCollection = (SettingCollection) obj;
            return Intrinsics.areEqual(unknownFields(), settingCollection.unknownFields()) && this.f1282type == settingCollection.f1282type && Intrinsics.areEqual(this.settings, settingCollection.settings);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            SettingType settingType = this.f1282type;
            int hashCode2 = this.settings.hashCode() + ((hashCode + (settingType != null ? settingType.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder();
            builder.card_type = this.f1282type;
            builder.card_pii = this.settings;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            SettingType settingType = this.f1282type;
            if (settingType != null) {
                arrayList.add("type=" + settingType);
            }
            List list = this.settings;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("settings=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SettingCollection{", "}", 0, null, null, 56);
        }
    }

    public enum SettingName implements WireEnum {
        SECURITY_LOCK(1),
        DEVICES(2),
        IDV(3),
        CASHTAG(4),
        INCOMING_REQUESTS(5),
        SYNC_CONTACTS(6),
        INVESTING_TRUSTED_CONTACT(7),
        TAXES_PASSWORD(8),
        TAXES_AUTH_APP(9),
        RECEIPTS(10),
        MESSAGES(11),
        ALIASES(12),
        ADDRESS(13),
        PIN(14),
        PASSKEYS(15),
        CREATE_BUSINESS_ACCOUNT(16),
        INVITE_TEEN(17),
        DOWNGRADE_TO_P2P(18),
        CREATE_PERSONAL_ACCOUNT(19),
        UPGRADE_TO_BUSINESS(20),
        SEARCH_PRIVACY(24),
        LINK_ACCOUNT(25),
        LINK_BANKS(26),
        MANAGE_FAVORITES(27),
        MANAGE_THEME(28),
        INVITE_FRIENDS(29),
        ENTER_CODE(30),
        CASH_PIN(31),
        VIEW_SHOPPING(32),
        VIEW_SECURITY_HUB(33);

        public final int value;
        public static final Path.Companion Companion = new Path.Companion();
        public static final GetAccountSettingsResponse$SettingName$Companion$ADAPTER$1 ADAPTER = new GetAccountSettingsResponse$SettingName$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SettingName.class), Syntax.PROTO_2, null);

        SettingName(int i) {
            this.value = i;
        }

        public static final SettingName fromValue(int i) {
            Companion.getClass();
            return Path.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum SettingType implements WireEnum {
        SECURITY(1),
        NOTIFICATION(2),
        PERSONAL(3),
        ACCOUNT_CREATION(4),
        FAMILY(5),
        ACCOUNT_DOWNGRADE(6),
        ACCOUNT_UPGRADE(7),
        ACCOUNT_LINKING(9),
        BANK_LINKING(10),
        FAVORITES(11),
        THEME(12),
        PROMOTIONS(13),
        SHOPPING(14),
        SECURITY_HUB(15);

        public final int value;
        public static final ResourceFileSystem.Companion Companion = new ResourceFileSystem.Companion();
        public static final GetAccountSettingsResponse$SettingType$Companion$ADAPTER$1 ADAPTER = new GetAccountSettingsResponse$SettingType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SettingType.class), Syntax.PROTO_2, null);

        SettingType(int i) {
            this.value = i;
        }

        public static final SettingType fromValue(int i) {
            Companion.getClass();
            return ResourceFileSystem.Companion.m4351fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GetAccountSettingsResponse$Companion$ADAPTER$1 getAccountSettingsResponse$Companion$ADAPTER$1 = new GetAccountSettingsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAccountSettingsResponse.class), "type.googleapis.com/squareup.cash.janus.api.GetAccountSettingsResponse", Syntax.PROTO_2, null, "squareup/cash/janus/api/AccountSettings.proto");
        ADAPTER = getAccountSettingsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAccountSettingsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountSettingsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.collection = TransactorKt.immutableCopyOf("collection", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAccountSettingsResponse)) {
            return false;
        }
        GetAccountSettingsResponse getAccountSettingsResponse = (GetAccountSettingsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAccountSettingsResponse.unknownFields()) && Intrinsics.areEqual(this.collection, getAccountSettingsResponse.collection);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.collection.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(20);
        builder.scenarios = this.collection;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.collection;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("collection=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountSettingsResponse{", "}", 0, null, null, 56);
    }
}
