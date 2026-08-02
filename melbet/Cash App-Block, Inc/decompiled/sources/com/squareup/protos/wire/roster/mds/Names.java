package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import squareup.cash.bills.BillsConfig;

/* loaded from: classes8.dex */
public final class Names extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Names> CREATOR;
    public final List others;
    public final Name primary;

    static {
        Names$Companion$ADAPTER$1 names$Companion$ADAPTER$1 = new Names$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Names.class), "type.googleapis.com/squareup.roster.mds.Names", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = names$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(names$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Names(Name name, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.primary = name;
        this.others = TransactorKt.immutableCopyOf("others", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Names)) {
            return false;
        }
        Names names = (Names) obj;
        return Intrinsics.areEqual(unknownFields(), names.unknownFields()) && Intrinsics.areEqual(this.primary, names.primary) && Intrinsics.areEqual(this.others, names.others);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Name name = this.primary;
        int hashCode2 = this.others.hashCode() + ((hashCode + (name != null ? name.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(4);
        builder.bills_applet_default_action = this.primary;
        builder.half_applet_content = this.others;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Name name = this.primary;
        if (name != null) {
            arrayList.add("primary=" + name);
        }
        List list = this.others;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("others=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Names{", "}", 0, null, null, 56);
    }
}
