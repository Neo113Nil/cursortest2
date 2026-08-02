package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/SetFeatureFlagsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/Headers$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SetFeatureFlagsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetFeatureFlagsResponse> CREATOR;
    public final List feature_flags;

    static {
        SetFeatureFlagsResponse$Companion$ADAPTER$1 setFeatureFlagsResponse$Companion$ADAPTER$1 = new SetFeatureFlagsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetFeatureFlagsResponse.class), "type.googleapis.com/squareup.franklin.app.SetFeatureFlagsResponse", Syntax.PROTO_2, null, "squareup/franklin/app/feature_flags.proto");
        ADAPTER = setFeatureFlagsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setFeatureFlagsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetFeatureFlagsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.feature_flags = TransactorKt.immutableCopyOf("feature_flags", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetFeatureFlagsResponse)) {
            return false;
        }
        SetFeatureFlagsResponse setFeatureFlagsResponse = (SetFeatureFlagsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setFeatureFlagsResponse.unknownFields()) && Intrinsics.areEqual(this.feature_flags, setFeatureFlagsResponse.feature_flags);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.feature_flags.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(17, false);
        builder.header = this.feature_flags;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.feature_flags;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("feature_flags=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetFeatureFlagsResponse{", "}", 0, null, null, 56);
    }
}
