package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.cryptoinvestflow.CryptoPayrollPreference;
import com.squareup.protos.franklin.ui.UiCashLimits;
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
public final class SyncCryptoPayrollPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncCryptoPayrollPreference> CREATOR;
    public final CryptoPayrollPreference preference;

    static {
        SyncCryptoPayrollPreference$Companion$ADAPTER$1 syncCryptoPayrollPreference$Companion$ADAPTER$1 = new SyncCryptoPayrollPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncCryptoPayrollPreference.class), "type.googleapis.com/squareup.franklin.SyncCryptoPayrollPreference", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncCryptoPayrollPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncCryptoPayrollPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncCryptoPayrollPreference(CryptoPayrollPreference cryptoPayrollPreference, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.preference = cryptoPayrollPreference;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncCryptoPayrollPreference)) {
            return false;
        }
        SyncCryptoPayrollPreference syncCryptoPayrollPreference = (SyncCryptoPayrollPreference) obj;
        return Intrinsics.areEqual(unknownFields(), syncCryptoPayrollPreference.unknownFields()) && Intrinsics.areEqual(this.preference, syncCryptoPayrollPreference.preference);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CryptoPayrollPreference cryptoPayrollPreference = this.preference;
        int hashCode2 = hashCode + (cryptoPayrollPreference != null ? cryptoPayrollPreference.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(5);
        builder.cash_limit_group = this.preference;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CryptoPayrollPreference cryptoPayrollPreference = this.preference;
        if (cryptoPayrollPreference != null) {
            arrayList.add("preference=" + cryptoPayrollPreference);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncCryptoPayrollPreference{", "}", 0, null, null, 56);
    }
}
