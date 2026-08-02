package com.squareup.protos.franklin.loyalty;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.person.Alias;
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
public final class LoyaltyProgram extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoyaltyProgram> CREATOR;
    public final String cash_merchant_token;
    public final String deep_link_token;
    public final String id;
    public final LoyaltyUnit loyalty_unit;
    public final String program_description;
    public final ProgramRewards program_rewards;
    public final String render_json;

    static {
        LoyaltyProgram$Companion$ADAPTER$1 loyaltyProgram$Companion$ADAPTER$1 = new LoyaltyProgram$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoyaltyProgram.class), "type.googleapis.com/squareup.franklin.loyalty.LoyaltyProgram", Syntax.PROTO_2, null, "squareup/franklin/loyalty.proto");
        ADAPTER = loyaltyProgram$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyProgram$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyProgram(String str, String str2, ProgramRewards programRewards, LoyaltyUnit loyaltyUnit, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.cash_merchant_token = str2;
        this.program_rewards = programRewards;
        this.loyalty_unit = loyaltyUnit;
        this.render_json = str3;
        this.program_description = str4;
        this.deep_link_token = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoyaltyProgram)) {
            return false;
        }
        LoyaltyProgram loyaltyProgram = (LoyaltyProgram) obj;
        return Intrinsics.areEqual(unknownFields(), loyaltyProgram.unknownFields()) && Intrinsics.areEqual(this.id, loyaltyProgram.id) && Intrinsics.areEqual(this.cash_merchant_token, loyaltyProgram.cash_merchant_token) && Intrinsics.areEqual(this.program_rewards, loyaltyProgram.program_rewards) && Intrinsics.areEqual(this.loyalty_unit, loyaltyProgram.loyalty_unit) && Intrinsics.areEqual(this.render_json, loyaltyProgram.render_json) && Intrinsics.areEqual(this.program_description, loyaltyProgram.program_description) && Intrinsics.areEqual(this.deep_link_token, loyaltyProgram.deep_link_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cash_merchant_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ProgramRewards programRewards = this.program_rewards;
        int hashCode4 = (hashCode3 + (programRewards != null ? programRewards.hashCode() : 0)) * 37;
        LoyaltyUnit loyaltyUnit = this.loyalty_unit;
        int hashCode5 = (hashCode4 + (loyaltyUnit != null ? loyaltyUnit.hashCode() : 0)) * 37;
        String str3 = this.render_json;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.program_description;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.deep_link_token;
        int hashCode8 = hashCode7 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(15, false);
        builder.scope = this.id;
        builder.value = this.cash_merchant_token;
        builder.f1407type = this.program_rewards;
        builder.first_verified_at_ms = this.loyalty_unit;
        builder.last_verified_at_ms = this.render_json;
        builder.created_at = this.program_description;
        builder.updated_at = this.deep_link_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.cash_merchant_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cash_merchant_token=", arrayList);
        }
        ProgramRewards programRewards = this.program_rewards;
        if (programRewards != null) {
            arrayList.add("program_rewards=" + programRewards);
        }
        LoyaltyUnit loyaltyUnit = this.loyalty_unit;
        if (loyaltyUnit != null) {
            arrayList.add("loyalty_unit=" + loyaltyUnit);
        }
        String str3 = this.render_json;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "render_json=", arrayList);
        }
        String str4 = this.program_description;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "program_description=", arrayList);
        }
        String str5 = this.deep_link_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "deep_link_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoyaltyProgram{", "}", 0, null, null, 56);
    }
}
