package com.squareup.protos.cash.sup.plasma;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.IssuedCard;
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

/* loaded from: classes8.dex */
public final class SupCreateCardFlowEndResult extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SupCreateCardFlowEndResult> CREATOR;
    public final Money authorized_card_amount;
    public final IssuedCard sup_card;
    public final String sup_checkout_id;

    static {
        SupCreateCardFlowEndResult$Companion$ADAPTER$1 supCreateCardFlowEndResult$Companion$ADAPTER$1 = new SupCreateCardFlowEndResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupCreateCardFlowEndResult.class), "type.googleapis.com/squareup.cash.sup.plasma.v1.SupCreateCardFlowEndResult", Syntax.PROTO_2, null, "squareup/cash/sup/plasma/v1/sup_create_card_flow.proto");
        ADAPTER = supCreateCardFlowEndResult$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(supCreateCardFlowEndResult$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupCreateCardFlowEndResult(IssuedCard issuedCard, Money money, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sup_card = issuedCard;
        this.authorized_card_amount = money;
        this.sup_checkout_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupCreateCardFlowEndResult)) {
            return false;
        }
        SupCreateCardFlowEndResult supCreateCardFlowEndResult = (SupCreateCardFlowEndResult) obj;
        return Intrinsics.areEqual(unknownFields(), supCreateCardFlowEndResult.unknownFields()) && Intrinsics.areEqual(this.sup_card, supCreateCardFlowEndResult.sup_card) && Intrinsics.areEqual(this.authorized_card_amount, supCreateCardFlowEndResult.authorized_card_amount) && Intrinsics.areEqual(this.sup_checkout_id, supCreateCardFlowEndResult.sup_checkout_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        IssuedCard issuedCard = this.sup_card;
        int hashCode2 = (hashCode + (issuedCard != null ? issuedCard.hashCode() : 0)) * 37;
        Money money = this.authorized_card_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.sup_checkout_id;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(24);
        builder.modules = this.sup_card;
        builder.overflow_modules = this.authorized_card_amount;
        builder.card_home_actions = this.sup_checkout_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        IssuedCard issuedCard = this.sup_card;
        if (issuedCard != null) {
            arrayList.add("sup_card=" + issuedCard);
        }
        Money money = this.authorized_card_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("authorized_card_amount=", money, arrayList);
        }
        String str = this.sup_checkout_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sup_checkout_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupCreateCardFlowEndResult{", "}", 0, null, null, 56);
    }
}
