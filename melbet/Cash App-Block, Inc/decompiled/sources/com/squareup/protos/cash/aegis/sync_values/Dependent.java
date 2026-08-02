package com.squareup.protos.cash.aegis.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.ContactAlias;
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
public final class Dependent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Dependent> CREATOR;
    public final String customer_token;
    public final Text lock_card_error;
    public final LockCardWarning lock_card_warning;
    public final SendCashCta send_cash_cta;
    public final SponsorshipTier sponsorship_tier;
    public final SponsorshipState status;
    public final String switching_identifier;

    static {
        Dependent$Companion$ADAPTER$1 dependent$Companion$ADAPTER$1 = new Dependent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Dependent.class), "type.googleapis.com/squareup.cash.aegis.sync_values.Dependent", Syntax.PROTO_2, null, "squareup/cash/aegis/sync_values/UiFamilyAccount.proto");
        ADAPTER = dependent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dependent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dependent(String str, SponsorshipState sponsorshipState, SendCashCta sendCashCta, LockCardWarning lockCardWarning, Text text, SponsorshipTier sponsorshipTier, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.status = sponsorshipState;
        this.send_cash_cta = sendCashCta;
        this.lock_card_warning = lockCardWarning;
        this.lock_card_error = text;
        this.sponsorship_tier = sponsorshipTier;
        this.switching_identifier = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dependent)) {
            return false;
        }
        Dependent dependent = (Dependent) obj;
        return Intrinsics.areEqual(unknownFields(), dependent.unknownFields()) && Intrinsics.areEqual(this.customer_token, dependent.customer_token) && this.status == dependent.status && Intrinsics.areEqual(this.send_cash_cta, dependent.send_cash_cta) && Intrinsics.areEqual(this.lock_card_warning, dependent.lock_card_warning) && Intrinsics.areEqual(this.lock_card_error, dependent.lock_card_error) && this.sponsorship_tier == dependent.sponsorship_tier && Intrinsics.areEqual(this.switching_identifier, dependent.switching_identifier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        SponsorshipState sponsorshipState = this.status;
        int hashCode3 = (hashCode2 + (sponsorshipState != null ? sponsorshipState.hashCode() : 0)) * 37;
        SendCashCta sendCashCta = this.send_cash_cta;
        int hashCode4 = (hashCode3 + (sendCashCta != null ? sendCashCta.hashCode() : 0)) * 37;
        LockCardWarning lockCardWarning = this.lock_card_warning;
        int hashCode5 = (hashCode4 + (lockCardWarning != null ? lockCardWarning.hashCode() : 0)) * 37;
        Text text = this.lock_card_error;
        int hashCode6 = (hashCode5 + (text != null ? text.hashCode() : 0)) * 37;
        SponsorshipTier sponsorshipTier = this.sponsorship_tier;
        int hashCode7 = (hashCode6 + (sponsorshipTier != null ? sponsorshipTier.hashCode() : 0)) * 37;
        String str2 = this.switching_identifier;
        int hashCode8 = hashCode7 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(5, false);
        builder.customer_token = this.customer_token;
        builder.hashed_alias_token = this.status;
        builder.alias_type = this.send_cash_cta;
        builder.updated_at = this.lock_card_warning;
        builder.linked_at = this.lock_card_error;
        builder.version = this.sponsorship_tier;
        builder.alias_value = this.switching_identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        SponsorshipState sponsorshipState = this.status;
        if (sponsorshipState != null) {
            arrayList.add("status=" + sponsorshipState);
        }
        SendCashCta sendCashCta = this.send_cash_cta;
        if (sendCashCta != null) {
            arrayList.add("send_cash_cta=" + sendCashCta);
        }
        LockCardWarning lockCardWarning = this.lock_card_warning;
        if (lockCardWarning != null) {
            arrayList.add("lock_card_warning=" + lockCardWarning);
        }
        Text text = this.lock_card_error;
        if (text != null) {
            arrayList.add("lock_card_error=" + text);
        }
        SponsorshipTier sponsorshipTier = this.sponsorship_tier;
        if (sponsorshipTier != null) {
            arrayList.add("sponsorship_tier=" + sponsorshipTier);
        }
        String str2 = this.switching_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "switching_identifier=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Dependent{", "}", 0, null, null, 56);
    }
}
