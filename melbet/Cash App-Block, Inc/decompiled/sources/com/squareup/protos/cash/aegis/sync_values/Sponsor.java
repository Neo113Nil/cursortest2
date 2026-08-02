package com.squareup.protos.cash.aegis.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
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
public final class Sponsor extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Sponsor> CREATOR;
    public final String customer_token;
    public final GraduationCta graduation_cta;
    public final LinkText primary_cta;
    public final Long sponsorship_requested_at;
    public final SponsorshipState status;

    static {
        Sponsor$Companion$ADAPTER$1 sponsor$Companion$ADAPTER$1 = new Sponsor$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Sponsor.class), "type.googleapis.com/squareup.cash.aegis.sync_values.Sponsor", Syntax.PROTO_2, null, "squareup/cash/aegis/sync_values/UiFamilyAccount.proto");
        ADAPTER = sponsor$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sponsor$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sponsor(String str, SponsorshipState sponsorshipState, LinkText linkText, Long l, GraduationCta graduationCta, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.status = sponsorshipState;
        this.primary_cta = linkText;
        this.sponsorship_requested_at = l;
        this.graduation_cta = graduationCta;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sponsor)) {
            return false;
        }
        Sponsor sponsor = (Sponsor) obj;
        return Intrinsics.areEqual(unknownFields(), sponsor.unknownFields()) && Intrinsics.areEqual(this.customer_token, sponsor.customer_token) && this.status == sponsor.status && Intrinsics.areEqual(this.primary_cta, sponsor.primary_cta) && Intrinsics.areEqual(this.sponsorship_requested_at, sponsor.sponsorship_requested_at) && Intrinsics.areEqual(this.graduation_cta, sponsor.graduation_cta);
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
        LinkText linkText = this.primary_cta;
        int hashCode4 = (hashCode3 + (linkText != null ? linkText.hashCode() : 0)) * 37;
        Long l = this.sponsorship_requested_at;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        GraduationCta graduationCta = this.graduation_cta;
        int hashCode6 = hashCode5 + (graduationCta != null ? graduationCta.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(16);
        builder.for_each = this.customer_token;
        builder.moneybot_scaffold = this.status;
        builder.compose_platform = this.primary_cta;
        builder.is_included = this.sponsorship_requested_at;
        builder.motion = this.graduation_cta;
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
        if (this.primary_cta != null) {
            arrayList.add("primary_cta=██");
        }
        Long l = this.sponsorship_requested_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sponsorship_requested_at=", l, arrayList);
        }
        GraduationCta graduationCta = this.graduation_cta;
        if (graduationCta != null) {
            arrayList.add("graduation_cta=" + graduationCta);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Sponsor{", "}", 0, null, null, 56);
    }
}
