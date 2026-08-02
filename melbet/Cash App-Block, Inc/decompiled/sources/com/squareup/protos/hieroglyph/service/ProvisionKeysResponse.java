package com.squareup.protos.hieroglyph.service;

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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Collection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/hieroglyph/service/ProvisionKeysResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/Collection$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProvisionKeysResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProvisionKeysResponse> CREATOR;
    public final List keys;

    static {
        ProvisionKeysResponse$Companion$ADAPTER$1 provisionKeysResponse$Companion$ADAPTER$1 = new ProvisionKeysResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProvisionKeysResponse.class), "type.googleapis.com/squareup.hieroglyph.service.ProvisionKeysResponse", Syntax.PROTO_2, null, "squareup/hieroglyph/service.proto");
        ADAPTER = provisionKeysResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(provisionKeysResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProvisionKeysResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.keys = TransactorKt.immutableCopyOf("keys", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProvisionKeysResponse)) {
            return false;
        }
        ProvisionKeysResponse provisionKeysResponse = (ProvisionKeysResponse) obj;
        return Intrinsics.areEqual(unknownFields(), provisionKeysResponse.unknownFields()) && Intrinsics.areEqual(this.keys, provisionKeysResponse.keys);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.keys.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(7, false);
        builder.items = this.keys;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.keys;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("keys=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProvisionKeysResponse{", "}", 0, null, null, 56);
    }
}
