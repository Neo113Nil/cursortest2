package com.squareup.protos.cash.guardrails.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AccountSuspension extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AccountSuspension> CREATOR;
    public final String adversity_type;
    public final String banner_message;
    public final String client_route_url;
    public final LocalizableString localizable_banner_message;
    public final SuspensionState state;

    public enum SuspensionState implements WireEnum {
        STYLE_UNSPECIFIED(0),
        INFO(1),
        WARNING(2),
        SUCCESS(3);

        public static final AccountSuspension$SuspensionState$Companion$ADAPTER$1 ADAPTER;
        public static final FeeType.Companion Companion;
        public final int value;

        static {
            SuspensionState suspensionState = STYLE_UNSPECIFIED;
            Companion = new FeeType.Companion();
            ADAPTER = new AccountSuspension$SuspensionState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SuspensionState.class), Syntax.PROTO_2, suspensionState);
        }

        SuspensionState(int i) {
            this.value = i;
        }

        public static final SuspensionState fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return STYLE_UNSPECIFIED;
            }
            if (i == 1) {
                return INFO;
            }
            if (i == 2) {
                return WARNING;
            }
            if (i != 3) {
                return null;
            }
            return SUCCESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        AccountSuspension$Companion$ADAPTER$1 accountSuspension$Companion$ADAPTER$1 = new AccountSuspension$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AccountSuspension.class), "type.googleapis.com/squareup.cash.guardrails.api.v1beta1.AccountSuspension", Syntax.PROTO_2, null, "squareup/cash/guardrails/api/v1beta1/account_suspension.proto");
        ADAPTER = accountSuspension$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(accountSuspension$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSuspension(String str, SuspensionState suspensionState, String str2, String str3, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.banner_message = str;
        this.state = suspensionState;
        this.client_route_url = str2;
        this.adversity_type = str3;
        this.localizable_banner_message = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountSuspension)) {
            return false;
        }
        AccountSuspension accountSuspension = (AccountSuspension) obj;
        return Intrinsics.areEqual(unknownFields(), accountSuspension.unknownFields()) && Intrinsics.areEqual(this.banner_message, accountSuspension.banner_message) && this.state == accountSuspension.state && Intrinsics.areEqual(this.client_route_url, accountSuspension.client_route_url) && Intrinsics.areEqual(this.adversity_type, accountSuspension.adversity_type) && Intrinsics.areEqual(this.localizable_banner_message, accountSuspension.localizable_banner_message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.banner_message;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        SuspensionState suspensionState = this.state;
        int hashCode3 = (hashCode2 + (suspensionState != null ? suspensionState.hashCode() : 0)) * 37;
        String str2 = this.client_route_url;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.adversity_type;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_banner_message;
        int hashCode6 = hashCode5 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(15);
        builder.text = this.banner_message;
        builder.text_style = this.state;
        builder.text_decoration = this.client_route_url;
        builder.text_color = this.adversity_type;
        builder.icon = this.localizable_banner_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.banner_message != null) {
            arrayList.add("banner_message=██");
        }
        SuspensionState suspensionState = this.state;
        if (suspensionState != null) {
            arrayList.add("state=" + suspensionState);
        }
        String str = this.client_route_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
        }
        String str2 = this.adversity_type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "adversity_type=", arrayList);
        }
        if (this.localizable_banner_message != null) {
            arrayList.add("localizable_banner_message=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountSuspension{", "}", 0, null, null, 56);
    }
}
