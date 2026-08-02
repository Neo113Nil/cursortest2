package squareup.cash.savings.bespoke_elements;

import android.os.Parcelable;
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
import squareup.cash.analytics.CdfEvent;
import squareup.cash.paychecks.Deduction;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;

/* loaded from: classes10.dex */
public final class NoGoalHeader extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NoGoalHeader> CREATOR;
    public final SavingsAction body_tap_action;
    public final Card body_tap_present_card;
    public final CdfEvent body_tap_present_card_cdf_event;
    public final HeroNumericsHeader hero_numerics_header;

    static {
        NoGoalHeader$Companion$ADAPTER$1 noGoalHeader$Companion$ADAPTER$1 = new NoGoalHeader$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NoGoalHeader.class), "type.googleapis.com/squareup.cash.savings.bespoke_elements.NoGoalHeader", Syntax.PROTO_2, null, "squareup/cash/savings/bespoke_elements/NoGoalHeader.proto");
        ADAPTER = noGoalHeader$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(noGoalHeader$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoGoalHeader(HeroNumericsHeader heroNumericsHeader, SavingsAction savingsAction, Card card, CdfEvent cdfEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.hero_numerics_header = heroNumericsHeader;
        this.body_tap_action = savingsAction;
        this.body_tap_present_card = card;
        this.body_tap_present_card_cdf_event = cdfEvent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NoGoalHeader)) {
            return false;
        }
        NoGoalHeader noGoalHeader = (NoGoalHeader) obj;
        return Intrinsics.areEqual(unknownFields(), noGoalHeader.unknownFields()) && Intrinsics.areEqual(this.hero_numerics_header, noGoalHeader.hero_numerics_header) && Intrinsics.areEqual(this.body_tap_action, noGoalHeader.body_tap_action) && Intrinsics.areEqual(this.body_tap_present_card, noGoalHeader.body_tap_present_card) && Intrinsics.areEqual(this.body_tap_present_card_cdf_event, noGoalHeader.body_tap_present_card_cdf_event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        HeroNumericsHeader heroNumericsHeader = this.hero_numerics_header;
        int hashCode2 = (hashCode + (heroNumericsHeader != null ? heroNumericsHeader.hashCode() : 0)) * 37;
        SavingsAction savingsAction = this.body_tap_action;
        int hashCode3 = (hashCode2 + (savingsAction != null ? savingsAction.hashCode() : 0)) * 37;
        Card card = this.body_tap_present_card;
        int hashCode4 = (hashCode3 + (card != null ? card.hashCode() : 0)) * 37;
        CdfEvent cdfEvent = this.body_tap_present_card_cdf_event;
        int hashCode5 = hashCode4 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(22);
        builder.amount = this.hero_numerics_header;
        builder.description = this.body_tap_action;
        builder.note = this.body_tap_present_card;
        builder.tint_color = this.body_tap_present_card_cdf_event;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        HeroNumericsHeader heroNumericsHeader = this.hero_numerics_header;
        if (heroNumericsHeader != null) {
            arrayList.add("hero_numerics_header=" + heroNumericsHeader);
        }
        SavingsAction savingsAction = this.body_tap_action;
        if (savingsAction != null) {
            arrayList.add("body_tap_action=" + savingsAction);
        }
        Card card = this.body_tap_present_card;
        if (card != null) {
            arrayList.add("body_tap_present_card=" + card);
        }
        CdfEvent cdfEvent = this.body_tap_present_card_cdf_event;
        if (cdfEvent != null) {
            arrayList.add("body_tap_present_card_cdf_event=" + cdfEvent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NoGoalHeader{", "}", 0, null, null, 56);
    }
}
