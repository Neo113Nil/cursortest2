package xyz.block.protos.genie;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Error;

/* loaded from: classes10.dex */
public final class GetSceneRequest extends Message {
    public static final ProtoAdapter ADAPTER = new GetSceneRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSceneRequest.class), "type.googleapis.com/xyz.block.genie.v1.GetSceneRequest", Syntax.PROTO_2, null, "xyz/block/genie/v1/service.proto");
    public final KeyValueMap inputs;
    public final ByteString scene_inputs;
    public final String scene_slug;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSceneRequest(String str, KeyValueMap keyValueMap, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.scene_slug = str;
        this.inputs = keyValueMap;
        this.scene_inputs = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSceneRequest)) {
            return false;
        }
        GetSceneRequest getSceneRequest = (GetSceneRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getSceneRequest.unknownFields()) && Intrinsics.areEqual(this.scene_slug, getSceneRequest.scene_slug) && Intrinsics.areEqual(this.inputs, getSceneRequest.inputs) && Intrinsics.areEqual(this.scene_inputs, getSceneRequest.scene_inputs);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.scene_slug;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        KeyValueMap keyValueMap = this.inputs;
        int hashCode3 = (hashCode2 + (keyValueMap != null ? keyValueMap.hashCode() : 0)) * 37;
        ByteString byteString = this.scene_inputs;
        int hashCode4 = hashCode3 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(2);
        builder.code = this.scene_slug;
        builder.debug_info = this.inputs;
        builder.display_error = this.scene_inputs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.scene_slug;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scene_slug=", arrayList);
        }
        if (this.inputs != null) {
            arrayList.add("inputs=██");
        }
        if (this.scene_inputs != null) {
            arrayList.add("scene_inputs=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSceneRequest{", "}", 0, null, null, 56);
    }
}
