package com.squareup.protos.rewardly.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class UiSelectedReward extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiSelectedReward> CREATOR;
    public final String reward_token;
    public final String token;

    static {
        UiSelectedReward$Companion$ADAPTER$1 uiSelectedReward$Companion$ADAPTER$1 = new UiSelectedReward$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiSelectedReward.class), "type.googleapis.com/squareup.rewardly.ui.UiSelectedReward", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
        ADAPTER = uiSelectedReward$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiSelectedReward$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiSelectedReward(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.reward_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiSelectedReward)) {
            return false;
        }
        UiSelectedReward uiSelectedReward = (UiSelectedReward) obj;
        return Intrinsics.areEqual(unknownFields(), uiSelectedReward.unknownFields()) && Intrinsics.areEqual(this.token, uiSelectedReward.token) && Intrinsics.areEqual(this.reward_token, uiSelectedReward.reward_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.reward_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(16);
        builder.server = this.token;
        builder.local = this.reward_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.reward_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "reward_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiSelectedReward{", "}", 0, null, null, 56);
    }
}
