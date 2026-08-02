package com.squareup.protos.cash.kgoose.syncentity;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cats.Cats;
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
public final class CashUserSettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashUserSettings> CREATOR;
    public final Long moneybot_disclosure_accepted_ts;

    static {
        CashUserSettings$Companion$ADAPTER$1 cashUserSettings$Companion$ADAPTER$1 = new CashUserSettings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashUserSettings.class), "type.googleapis.com/squareup.cash.kgoose.syncentity.CashUserSettings", Syntax.PROTO_2, null, "squareup/cash/kgoose/syncentity/cash_sync_entities.proto");
        ADAPTER = cashUserSettings$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashUserSettings$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashUserSettings(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.moneybot_disclosure_accepted_ts = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashUserSettings)) {
            return false;
        }
        CashUserSettings cashUserSettings = (CashUserSettings) obj;
        return Intrinsics.areEqual(unknownFields(), cashUserSettings.unknownFields()) && Intrinsics.areEqual(this.moneybot_disclosure_accepted_ts, cashUserSettings.moneybot_disclosure_accepted_ts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.moneybot_disclosure_accepted_ts;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(4);
        builder.cat_count = this.moneybot_disclosure_accepted_ts;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.moneybot_disclosure_accepted_ts;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("moneybot_disclosure_accepted_ts=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashUserSettings{", "}", 0, null, null, 56);
    }
}
