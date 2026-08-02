package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zztj;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
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
public final class PendingRequestSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PendingRequestSection> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final zztj f1243type;

    static {
        PendingRequestSection$Companion$ADAPTER$1 pendingRequestSection$Companion$ADAPTER$1 = new PendingRequestSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PendingRequestSection.class), "type.googleapis.com/squareup.cash.aegis.core.PendingRequestSection", Syntax.PROTO_2, null, "squareup/cash/aegis/core/FamilyAccountsParameters.proto");
        ADAPTER = pendingRequestSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pendingRequestSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingRequestSection(zztj zztjVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1243type = zztjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PendingRequestSection)) {
            return false;
        }
        PendingRequestSection pendingRequestSection = (PendingRequestSection) obj;
        return Intrinsics.areEqual(unknownFields(), pendingRequestSection.unknownFields()) && Intrinsics.areEqual(this.f1243type, pendingRequestSection.f1243type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zztj zztjVar = this.f1243type;
        int hashCode2 = hashCode + (zztjVar != null ? zztjVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(20);
        builder.f1245type = this.f1243type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zztj zztjVar = this.f1243type;
        if (zztjVar != null) {
            arrayList.add("type=" + zztjVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PendingRequestSection{", "}", 0, null, null, 56);
    }
}
