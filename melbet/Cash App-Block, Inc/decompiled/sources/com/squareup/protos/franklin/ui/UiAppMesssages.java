package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerResponse;
import com.squareup.protos.cash.marketprices.service.GetCurrentPricesRequest;
import com.squareup.protos.cash.supportal.app.SearchSupportFlowResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiAppMesssages extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiAppMesssages> CREATOR;
    public final Boolean app_message_notifications_enabled;
    public final List app_message_tokens;

    static {
        UiAppMesssages$Companion$ADAPTER$1 uiAppMesssages$Companion$ADAPTER$1 = new UiAppMesssages$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiAppMesssages.class), "type.googleapis.com/squareup.franklin.ui.UiAppMesssages", Syntax.PROTO_2, null, "squareup/franklin/ui/app_messages.proto");
        ADAPTER = uiAppMesssages$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiAppMesssages$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiAppMesssages(Boolean bool, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.app_message_notifications_enabled = bool;
        this.app_message_tokens = TransactorKt.immutableCopyOf("app_message_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiAppMesssages)) {
            return false;
        }
        UiAppMesssages uiAppMesssages = (UiAppMesssages) obj;
        return Intrinsics.areEqual(unknownFields(), uiAppMesssages.unknownFields()) && Intrinsics.areEqual(this.app_message_notifications_enabled, uiAppMesssages.app_message_notifications_enabled) && Intrinsics.areEqual(this.app_message_tokens, uiAppMesssages.app_message_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.app_message_notifications_enabled;
        int hashCode2 = this.app_message_tokens.hashCode() + ((hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.app_message_notifications_enabled = this.app_message_notifications_enabled;
        builder.app_message_tokens = this.app_message_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.app_message_notifications_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("app_message_notifications_enabled=", bool, arrayList);
        }
        List list = this.app_message_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("app_message_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiAppMesssages{", "}", 0, null, null, 56);
    }

    /* loaded from: classes6.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Boolean app_message_notifications_enabled;
        public List app_message_tokens;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 3:
                    this.app_message_tokens = EmptyList.INSTANCE;
                    break;
                default:
                    this.app_message_tokens = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiAppMesssages(this.app_message_notifications_enabled, this.app_message_tokens, buildUnknownFields());
                case 1:
                    return new CryptoExchangeCustomerControl(this.app_message_notifications_enabled, this.app_message_tokens, buildUnknownFields());
                case 2:
                    return new GetAllowlistForCustomerResponse(this.app_message_notifications_enabled, this.app_message_tokens, buildUnknownFields());
                case 3:
                    return new GetCurrentPricesRequest(this.app_message_notifications_enabled, this.app_message_tokens, buildUnknownFields());
                default:
                    return new SearchSupportFlowResponse(this.app_message_notifications_enabled, this.app_message_tokens, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
