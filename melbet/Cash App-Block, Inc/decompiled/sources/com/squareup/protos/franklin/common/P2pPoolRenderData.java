package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.person.Alias;
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

/* loaded from: classes8.dex */
public final class P2pPoolRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<P2pPoolRenderData> CREATOR;
    public final Avatar avatar;
    public final Money contributed_amount;
    public final Money goal_amount;
    public final String owner_customer_token;
    public final String pool_name;
    public final String pool_token;
    public final PoolState state;

    public enum PoolState implements WireEnum {
        UNKNOWN(0),
        ACTIVE(1),
        CLOSING(2),
        CLOSED(3),
        GOAL_REACHED(4);

        public static final P2pPoolRenderData$PoolState$Companion$ADAPTER$1 ADAPTER;
        public static final KeyScope.Companion Companion;
        public final int value;

        static {
            PoolState poolState = UNKNOWN;
            Companion = new KeyScope.Companion();
            ADAPTER = new P2pPoolRenderData$PoolState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PoolState.class), Syntax.PROTO_2, poolState);
        }

        PoolState(int i) {
            this.value = i;
        }

        public static final PoolState fromValue(int i) {
            Companion.getClass();
            return KeyScope.Companion.m3970fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        P2pPoolRenderData$Companion$ADAPTER$1 p2pPoolRenderData$Companion$ADAPTER$1 = new P2pPoolRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(P2pPoolRenderData.class), "type.googleapis.com/squareup.franklin.P2pPoolRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = p2pPoolRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(p2pPoolRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2pPoolRenderData(String str, String str2, String str3, Avatar avatar, Money money, Money money2, PoolState poolState, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.owner_customer_token = str;
        this.pool_token = str2;
        this.pool_name = str3;
        this.avatar = avatar;
        this.goal_amount = money;
        this.contributed_amount = money2;
        this.state = poolState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P2pPoolRenderData)) {
            return false;
        }
        P2pPoolRenderData p2pPoolRenderData = (P2pPoolRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), p2pPoolRenderData.unknownFields()) && Intrinsics.areEqual(this.owner_customer_token, p2pPoolRenderData.owner_customer_token) && Intrinsics.areEqual(this.pool_token, p2pPoolRenderData.pool_token) && Intrinsics.areEqual(this.pool_name, p2pPoolRenderData.pool_name) && Intrinsics.areEqual(this.avatar, p2pPoolRenderData.avatar) && Intrinsics.areEqual(this.goal_amount, p2pPoolRenderData.goal_amount) && Intrinsics.areEqual(this.contributed_amount, p2pPoolRenderData.contributed_amount) && this.state == p2pPoolRenderData.state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.owner_customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.pool_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.pool_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Avatar avatar = this.avatar;
        int hashCode5 = (hashCode4 + (avatar != null ? avatar.hashCode() : 0)) * 37;
        Money money = this.goal_amount;
        int hashCode6 = (hashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.contributed_amount;
        int hashCode7 = (hashCode6 + (money2 != null ? money2.hashCode() : 0)) * 37;
        PoolState poolState = this.state;
        int hashCode8 = hashCode7 + (poolState != null ? poolState.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(6, false);
        builder.scope = this.owner_customer_token;
        builder.value = this.pool_token;
        builder.f1407type = this.pool_name;
        builder.first_verified_at_ms = this.avatar;
        builder.last_verified_at_ms = this.goal_amount;
        builder.created_at = this.contributed_amount;
        builder.updated_at = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.owner_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "owner_customer_token=", arrayList);
        }
        String str2 = this.pool_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "pool_token=", arrayList);
        }
        String str3 = this.pool_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "pool_name=", arrayList);
        }
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        Money money = this.goal_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("goal_amount=", money, arrayList);
        }
        Money money2 = this.contributed_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("contributed_amount=", money2, arrayList);
        }
        PoolState poolState = this.state;
        if (poolState != null) {
            arrayList.add("state=" + poolState);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "P2pPoolRenderData{", "}", 0, null, null, 56);
    }
}
