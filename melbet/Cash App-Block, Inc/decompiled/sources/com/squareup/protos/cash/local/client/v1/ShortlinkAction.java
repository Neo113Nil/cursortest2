package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShortlinkAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShortlinkAction> CREATOR;
    public final String next_shortlink_flow_state;
    public final String shortlink_key;

    static {
        ShortlinkAction$Companion$ADAPTER$1 shortlinkAction$Companion$ADAPTER$1 = new ShortlinkAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShortlinkAction.class), "type.googleapis.com/squareup.cash.local.client.v1.ShortlinkAction", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_sheet.proto");
        ADAPTER = shortlinkAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shortlinkAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortlinkAction(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.shortlink_key = str;
        this.next_shortlink_flow_state = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShortlinkAction)) {
            return false;
        }
        ShortlinkAction shortlinkAction = (ShortlinkAction) obj;
        return Intrinsics.areEqual(unknownFields(), shortlinkAction.unknownFields()) && Intrinsics.areEqual(this.shortlink_key, shortlinkAction.shortlink_key) && Intrinsics.areEqual(this.next_shortlink_flow_state, shortlinkAction.next_shortlink_flow_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.shortlink_key);
        String str = this.next_shortlink_flow_state;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FullName.Builder builder = new FullName.Builder(24);
        builder.given_name = this.shortlink_key;
        builder.family_name = this.next_shortlink_flow_state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.shortlink_key, "shortlink_key=", arrayList);
        String str = this.next_shortlink_flow_state;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_shortlink_flow_state=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShortlinkAction{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ShortlinkAction(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }
}
