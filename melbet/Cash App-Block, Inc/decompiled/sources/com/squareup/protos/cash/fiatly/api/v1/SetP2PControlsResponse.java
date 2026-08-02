package com.squareup.protos.cash.fiatly.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Asset;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/fiatly/api/v1/SetP2PControlsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/composer/app/Asset$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetP2PControlsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetP2PControlsResponse> CREATOR;
    public final P2PControls p2p_controls;

    static {
        SetP2PControlsResponse$Companion$ADAPTER$1 setP2PControlsResponse$Companion$ADAPTER$1 = new SetP2PControlsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetP2PControlsResponse.class), "type.googleapis.com/squareup.cash.fiatly.api.v1.SetP2PControlsResponse", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v1/p2p_controls.proto");
        ADAPTER = setP2PControlsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setP2PControlsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetP2PControlsResponse(P2PControls p2PControls, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.p2p_controls = p2PControls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetP2PControlsResponse)) {
            return false;
        }
        SetP2PControlsResponse setP2PControlsResponse = (SetP2PControlsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setP2PControlsResponse.unknownFields()) && Intrinsics.areEqual(this.p2p_controls, setP2PControlsResponse.p2p_controls);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        P2PControls p2PControls = this.p2p_controls;
        int hashCode2 = hashCode + (p2PControls != null ? p2PControls.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(19);
        builder.asset_type = this.p2p_controls;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        P2PControls p2PControls = this.p2p_controls;
        if (p2PControls != null) {
            arrayList.add("p2p_controls=" + p2PControls);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetP2PControlsResponse{", "}", 0, null, null, 56);
    }
}
