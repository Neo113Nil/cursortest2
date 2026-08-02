package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
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
public final class MoneybotContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MoneybotContext> CREATOR;
    public final String session_id;

    static {
        MoneybotContext$Companion$ADAPTER$1 moneybotContext$Companion$ADAPTER$1 = new MoneybotContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneybotContext.class), "type.googleapis.com/squareup.cash.cashautomationtooling.api.external.v1beta1.MoneybotContext", Syntax.PROTO_2, null, "squareup/cash/cashautomationtooling/api/external/v1beta1/bug_report_service.proto");
        ADAPTER = moneybotContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(moneybotContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotContext(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.session_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MoneybotContext)) {
            return false;
        }
        MoneybotContext moneybotContext = (MoneybotContext) obj;
        return Intrinsics.areEqual(unknownFields(), moneybotContext.unknownFields()) && Intrinsics.areEqual(this.session_id, moneybotContext.session_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.session_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(29);
        builder.display_name = this.session_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.session_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "session_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MoneybotContext{", "}", 0, null, null, 56);
    }
}
