package com.squareup.protos.checkmate.profile;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.franklin.common.BalanceData;
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
public final class CheckDepositProfile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CheckDepositProfile> CREATOR;
    public final BalanceData.Button deposit_check;
    public final Boolean enabled;

    static {
        CheckDepositProfile$Companion$ADAPTER$1 checkDepositProfile$Companion$ADAPTER$1 = new CheckDepositProfile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CheckDepositProfile.class), "type.googleapis.com/squareup.checkmate.profile.CheckDepositProfile", Syntax.PROTO_2, null, "squareup/checkmate/profile/check_deposit_profile.proto");
        ADAPTER = checkDepositProfile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(checkDepositProfile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckDepositProfile(Boolean bool, BalanceData.Button button, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.enabled = bool;
        this.deposit_check = button;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckDepositProfile)) {
            return false;
        }
        CheckDepositProfile checkDepositProfile = (CheckDepositProfile) obj;
        return Intrinsics.areEqual(unknownFields(), checkDepositProfile.unknownFields()) && Intrinsics.areEqual(this.enabled, checkDepositProfile.enabled) && Intrinsics.areEqual(this.deposit_check, checkDepositProfile.deposit_check);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        BalanceData.Button button = this.deposit_check;
        int hashCode3 = hashCode2 + (button != null ? button.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(26);
        builder.primary_button = this.enabled;
        builder.secondary_button = this.deposit_check;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        BalanceData.Button button = this.deposit_check;
        if (button != null) {
            arrayList.add("deposit_check=" + button);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckDepositProfile{", "}", 0, null, null, 56);
    }
}
