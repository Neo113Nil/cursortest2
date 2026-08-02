package com.squareup.protos.multipass.service;

import android.os.Parcelable;
import com.squareup.protos.rewardly.ui.AppLinks;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/multipass/service/CreateOtkResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/rewardly/ui/AppLinks$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreateOtkResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateOtkResponse> CREATOR;
    public final Error error;
    public final OneTimeKey one_time_key;

    static {
        CreateOtkResponse$Companion$ADAPTER$1 createOtkResponse$Companion$ADAPTER$1 = new CreateOtkResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateOtkResponse.class), "type.googleapis.com/squareup.multipass.service.CreateOtkResponse", Syntax.PROTO_2, null, "squareup/multipass/service/service.proto");
        ADAPTER = createOtkResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createOtkResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOtkResponse(Error error, OneTimeKey oneTimeKey, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.error = error;
        this.one_time_key = oneTimeKey;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateOtkResponse)) {
            return false;
        }
        CreateOtkResponse createOtkResponse = (CreateOtkResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createOtkResponse.unknownFields()) && this.error == createOtkResponse.error && Intrinsics.areEqual(this.one_time_key, createOtkResponse.one_time_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Error error = this.error;
        int hashCode2 = (hashCode + (error != null ? error.hashCode() : 0)) * 37;
        OneTimeKey oneTimeKey = this.one_time_key;
        int hashCode3 = hashCode2 + (oneTimeKey != null ? oneTimeKey.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(18);
        builder.f1411android = this.error;
        builder.ios = this.one_time_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Error error = this.error;
        if (error != null) {
            arrayList.add("error=" + error);
        }
        OneTimeKey oneTimeKey = this.one_time_key;
        if (oneTimeKey != null) {
            arrayList.add("one_time_key=" + oneTimeKey);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateOtkResponse{", "}", 0, null, null, 56);
    }
}
