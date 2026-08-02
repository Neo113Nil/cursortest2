package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
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
public final class PreparedRecoveryActivity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PreparedRecoveryActivity> CREATOR;
    public final String activity_type;
    public final String unsigned_body;

    static {
        PreparedRecoveryActivity$Companion$ADAPTER$1 preparedRecoveryActivity$Companion$ADAPTER$1 = new PreparedRecoveryActivity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PreparedRecoveryActivity.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.PreparedRecoveryActivity", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/recovery.proto");
        ADAPTER = preparedRecoveryActivity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(preparedRecoveryActivity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreparedRecoveryActivity(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity_type = str;
        this.unsigned_body = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreparedRecoveryActivity)) {
            return false;
        }
        PreparedRecoveryActivity preparedRecoveryActivity = (PreparedRecoveryActivity) obj;
        return Intrinsics.areEqual(unknownFields(), preparedRecoveryActivity.unknownFields()) && Intrinsics.areEqual(this.activity_type, preparedRecoveryActivity.activity_type) && Intrinsics.areEqual(this.unsigned_body, preparedRecoveryActivity.unsigned_body);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.activity_type;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.unsigned_body;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(19);
        builder.prefix = this.activity_type;
        builder.name = this.unsigned_body;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.activity_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "activity_type=", arrayList);
        }
        if (this.unsigned_body != null) {
            arrayList.add("unsigned_body=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PreparedRecoveryActivity{", "}", 0, null, null, 56);
    }
}
