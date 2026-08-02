package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.franklin.api.SupportConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AccountParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AccountParams> CREATOR;
    public final EntryDialog entryDialog;

    public final class EntryDialog extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EntryDialog> CREATOR;
        public final String confirm_button_text;
        public final String subtitle;
        public final String title;

        static {
            AccountParams$EntryDialog$Companion$ADAPTER$1 accountParams$EntryDialog$Companion$ADAPTER$1 = new AccountParams$EntryDialog$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EntryDialog.class), "type.googleapis.com/squareup.cash.janus.api.AccountParams.EntryDialog", Syntax.PROTO_2, null, "squareup/cash/janus/api/CreateSecondaryPersonalAccountProto.proto");
            ADAPTER = accountParams$EntryDialog$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(accountParams$EntryDialog$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntryDialog(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.confirm_button_text = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntryDialog)) {
                return false;
            }
            EntryDialog entryDialog = (EntryDialog) obj;
            return Intrinsics.areEqual(unknownFields(), entryDialog.unknownFields()) && Intrinsics.areEqual(this.title, entryDialog.title) && Intrinsics.areEqual(this.subtitle, entryDialog.subtitle) && Intrinsics.areEqual(this.confirm_button_text, entryDialog.confirm_button_text);
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
            String str3 = this.confirm_button_text;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SupportConfig.Builder builder = new SupportConfig.Builder(13);
            builder.contact_support_url = this.title;
            builder.privacy_policy_url = this.subtitle;
            builder.terms_of_service_url = this.confirm_button_text;
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
            String str = this.confirm_button_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "confirm_button_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EntryDialog{", "}", 0, null, null, 56);
        }
    }

    static {
        AccountParams$Companion$ADAPTER$1 accountParams$Companion$ADAPTER$1 = new AccountParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AccountParams.class), "type.googleapis.com/squareup.cash.janus.api.AccountParams", Syntax.PROTO_2, null, "squareup/cash/janus/api/CreateSecondaryPersonalAccountProto.proto");
        ADAPTER = accountParams$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(accountParams$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountParams(EntryDialog entryDialog, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entryDialog = entryDialog;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountParams)) {
            return false;
        }
        AccountParams accountParams = (AccountParams) obj;
        return Intrinsics.areEqual(unknownFields(), accountParams.unknownFields()) && Intrinsics.areEqual(this.entryDialog, accountParams.entryDialog);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EntryDialog entryDialog = this.entryDialog;
        int hashCode2 = hashCode + (entryDialog != null ? entryDialog.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GroupParticipant.Builder builder = new GroupParticipant.Builder(9);
        builder.f1276type = this.entryDialog;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EntryDialog entryDialog = this.entryDialog;
        if (entryDialog != null) {
            arrayList.add("entryDialog=" + entryDialog);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountParams{", "}", 0, null, null, 56);
    }
}
