package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzja;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalUserIntent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalUserIntent> CREATOR;
    public final String brand_token;
    public final Long created_at;
    public final List errors;
    public final zzja intent;
    public final String token;
    public final Long updated_at;

    static {
        LocalUserIntent$Companion$ADAPTER$1 localUserIntent$Companion$ADAPTER$1 = new LocalUserIntent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalUserIntent.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalUserIntent", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_user_intent.proto");
        ADAPTER = localUserIntent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localUserIntent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalUserIntent(String str, String str2, Long l, Long l2, zzja zzjaVar, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.brand_token = str2;
        this.created_at = l;
        this.updated_at = l2;
        this.intent = zzjaVar;
        this.errors = TransactorKt.immutableCopyOf("errors", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalUserIntent)) {
            return false;
        }
        LocalUserIntent localUserIntent = (LocalUserIntent) obj;
        return Intrinsics.areEqual(unknownFields(), localUserIntent.unknownFields()) && Intrinsics.areEqual(this.token, localUserIntent.token) && Intrinsics.areEqual(this.brand_token, localUserIntent.brand_token) && Intrinsics.areEqual(this.created_at, localUserIntent.created_at) && Intrinsics.areEqual(this.updated_at, localUserIntent.updated_at) && Intrinsics.areEqual(this.intent, localUserIntent.intent) && Intrinsics.areEqual(this.errors, localUserIntent.errors);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.brand_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        zzja zzjaVar = this.intent;
        int hashCode6 = this.errors.hashCode() + ((hashCode5 + (zzjaVar != null ? zzjaVar.hashCode() : 0)) * 37);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(17);
        builder.slice_token = this.token;
        builder.requester = this.brand_token;
        builder.responder = this.created_at;
        builder.amount = this.updated_at;
        builder.status = this.intent;
        builder.action = this.errors;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.brand_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "brand_token=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.updated_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l2, arrayList);
        }
        zzja zzjaVar = this.intent;
        if (zzjaVar != null) {
            arrayList.add("intent=" + zzjaVar);
        }
        List list = this.errors;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("errors=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalUserIntent{", "}", 0, null, null, 56);
    }
}
