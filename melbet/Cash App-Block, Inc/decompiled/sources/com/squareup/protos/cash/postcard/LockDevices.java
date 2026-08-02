package com.squareup.protos.cash.postcard;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes7.dex */
public final class LockDevices extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LockDevices> CREATOR;
    public final LocalizedString description;
    public final LocalizedString title;

    static {
        LockDevices$Companion$ADAPTER$1 lockDevices$Companion$ADAPTER$1 = new LockDevices$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LockDevices.class), "type.googleapis.com/squareup.cash.postcard.LockDevices", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
        ADAPTER = lockDevices$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lockDevices$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockDevices(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.description = localizedString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LockDevices)) {
            return false;
        }
        LockDevices lockDevices = (LockDevices) obj;
        return Intrinsics.areEqual(unknownFields(), lockDevices.unknownFields()) && Intrinsics.areEqual(this.title, lockDevices.title) && Intrinsics.areEqual(this.description, lockDevices.description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.description;
        int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.HalfApplet.Builder builder = new BillsApplet.HalfApplet.Builder(3);
        builder.title = this.title;
        builder.description = this.description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.description;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("description=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LockDevices{", "}", 0, null, null, 56);
    }
}
