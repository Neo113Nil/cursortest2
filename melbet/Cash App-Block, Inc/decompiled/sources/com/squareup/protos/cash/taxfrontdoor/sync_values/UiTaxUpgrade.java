package com.squareup.protos.cash.taxfrontdoor.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.SplitButtons;
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
public final class UiTaxUpgrade extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiTaxUpgrade> CREATOR;
    public final String customer_token;
    public final UpgradeStatus upgrade_status;

    static {
        UiTaxUpgrade$Companion$ADAPTER$1 uiTaxUpgrade$Companion$ADAPTER$1 = new UiTaxUpgrade$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiTaxUpgrade.class), "type.googleapis.com/squareup.cash.taxfrontdoor.sync_values.UiTaxUpgrade", Syntax.PROTO_2, null, "squareup/cash/taxfrontdoor/sync_values/UiTaxUpgrade.proto");
        ADAPTER = uiTaxUpgrade$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiTaxUpgrade$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiTaxUpgrade(String str, UpgradeStatus upgradeStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.upgrade_status = upgradeStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiTaxUpgrade)) {
            return false;
        }
        UiTaxUpgrade uiTaxUpgrade = (UiTaxUpgrade) obj;
        return Intrinsics.areEqual(unknownFields(), uiTaxUpgrade.unknownFields()) && Intrinsics.areEqual(this.customer_token, uiTaxUpgrade.customer_token) && this.upgrade_status == uiTaxUpgrade.upgrade_status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        UpgradeStatus upgradeStatus = this.upgrade_status;
        int hashCode3 = hashCode2 + (upgradeStatus != null ? upgradeStatus.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(17);
        builder.primary_button = this.customer_token;
        builder.secondary_button = this.upgrade_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        UpgradeStatus upgradeStatus = this.upgrade_status;
        if (upgradeStatus != null) {
            arrayList.add("upgrade_status=" + upgradeStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiTaxUpgrade{", "}", 0, null, null, 56);
    }
}
