package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashDrawerData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashDrawerData> CREATOR;
    public final CardControls card_controls;
    public final Boolean skip_null_state;

    public final class CardControls extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardControls> CREATOR;
        public final UiControl card_control;
        public final UiControl card_status_control;
        public final List overflow_controls;

        static {
            CashDrawerData$CardControls$Companion$ADAPTER$1 cashDrawerData$CardControls$Companion$ADAPTER$1 = new CashDrawerData$CardControls$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardControls.class), "type.googleapis.com/squareup.franklin.common.CashDrawerData.CardControls", Syntax.PROTO_2, null, "squareup/franklin/common/cash_drawer_data.proto");
            ADAPTER = cashDrawerData$CardControls$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashDrawerData$CardControls$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardControls(UiControl uiControl, UiControl uiControl2, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.card_control = uiControl;
            this.card_status_control = uiControl2;
            this.overflow_controls = TransactorKt.immutableCopyOf("overflow_controls", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardControls)) {
                return false;
            }
            CardControls cardControls = (CardControls) obj;
            return Intrinsics.areEqual(unknownFields(), cardControls.unknownFields()) && Intrinsics.areEqual(this.card_control, cardControls.card_control) && Intrinsics.areEqual(this.card_status_control, cardControls.card_status_control) && Intrinsics.areEqual(this.overflow_controls, cardControls.overflow_controls);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            UiControl uiControl = this.card_control;
            int hashCode2 = (hashCode + (uiControl != null ? uiControl.hashCode() : 0)) * 37;
            UiControl uiControl2 = this.card_status_control;
            int hashCode3 = this.overflow_controls.hashCode() + ((hashCode2 + (uiControl2 != null ? uiControl2.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Institution.Builder builder = new Institution.Builder(13, false);
            builder.institution_token = this.card_control;
            builder.display_info = this.card_status_control;
            builder.help_menu_items = this.overflow_controls;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            UiControl uiControl = this.card_control;
            if (uiControl != null) {
                arrayList.add("card_control=" + uiControl);
            }
            UiControl uiControl2 = this.card_status_control;
            if (uiControl2 != null) {
                arrayList.add("card_status_control=" + uiControl2);
            }
            List list = this.overflow_controls;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("overflow_controls=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardControls{", "}", 0, null, null, 56);
        }
    }

    static {
        CashDrawerData$Companion$ADAPTER$1 cashDrawerData$Companion$ADAPTER$1 = new CashDrawerData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashDrawerData.class), "type.googleapis.com/squareup.franklin.common.CashDrawerData", Syntax.PROTO_2, null, "squareup/franklin/common/cash_drawer_data.proto");
        ADAPTER = cashDrawerData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashDrawerData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashDrawerData(CardControls cardControls, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card_controls = cardControls;
        this.skip_null_state = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashDrawerData)) {
            return false;
        }
        CashDrawerData cashDrawerData = (CashDrawerData) obj;
        return Intrinsics.areEqual(unknownFields(), cashDrawerData.unknownFields()) && Intrinsics.areEqual(this.card_controls, cashDrawerData.card_controls) && Intrinsics.areEqual(this.skip_null_state, cashDrawerData.skip_null_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardControls cardControls = this.card_controls;
        int hashCode2 = (hashCode + (cardControls != null ? cardControls.hashCode() : 0)) * 37;
        Boolean bool = this.skip_null_state;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(4);
        builder.f1372android = this.card_controls;
        builder.ios = this.skip_null_state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardControls cardControls = this.card_controls;
        if (cardControls != null) {
            arrayList.add("card_controls=" + cardControls);
        }
        Boolean bool = this.skip_null_state;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_null_state=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashDrawerData{", "}", 0, null, null, 56);
    }
}
