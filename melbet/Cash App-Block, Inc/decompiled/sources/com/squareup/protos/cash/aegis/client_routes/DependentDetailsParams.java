package com.squareup.protos.cash.aegis.client_routes;

import android.os.Parcelable;
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
public final class DependentDetailsParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DependentDetailsParams> CREATOR;
    public final DependentDetailsEntryDialog entryDialog;

    static {
        DependentDetailsParams$Companion$ADAPTER$1 dependentDetailsParams$Companion$ADAPTER$1 = new DependentDetailsParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DependentDetailsParams.class), "type.googleapis.com/squareup.cash.aegis.client_routes.DependentDetailsParams", Syntax.PROTO_2, null, "squareup/cash/aegis/client_routes/parameters.proto");
        ADAPTER = dependentDetailsParams$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dependentDetailsParams$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DependentDetailsParams(DependentDetailsEntryDialog dependentDetailsEntryDialog, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entryDialog = dependentDetailsEntryDialog;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DependentDetailsParams)) {
            return false;
        }
        DependentDetailsParams dependentDetailsParams = (DependentDetailsParams) obj;
        return Intrinsics.areEqual(unknownFields(), dependentDetailsParams.unknownFields()) && Intrinsics.areEqual(this.entryDialog, dependentDetailsParams.entryDialog);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DependentDetailsEntryDialog dependentDetailsEntryDialog = this.entryDialog;
        int hashCode2 = hashCode + (dependentDetailsEntryDialog != null ? dependentDetailsEntryDialog.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(19);
        builder.f1245type = this.entryDialog;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DependentDetailsEntryDialog dependentDetailsEntryDialog = this.entryDialog;
        if (dependentDetailsEntryDialog != null) {
            arrayList.add("entryDialog=" + dependentDetailsEntryDialog);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DependentDetailsParams{", "}", 0, null, null, 56);
    }
}
