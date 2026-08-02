package xyz.block.protos.genie;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.UnaryOp;

/* loaded from: classes10.dex */
public final class ViewSpec extends Message {
    public static final ProtoAdapter ADAPTER = new ViewSpec$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ViewSpec.class), "type.googleapis.com/xyz.block.genie.v1.ViewSpec", Syntax.PROTO_2, null, "xyz/block/genie/v1/view.proto");
    public final ByteString view_node;
    public final KeyValueMap view_state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSpec(ByteString byteString, ByteString byteString2, KeyValueMap keyValueMap) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.view_node = byteString;
        this.view_state = keyValueMap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewSpec)) {
            return false;
        }
        ViewSpec viewSpec = (ViewSpec) obj;
        return Intrinsics.areEqual(unknownFields(), viewSpec.unknownFields()) && Intrinsics.areEqual(this.view_node, viewSpec.view_node) && Intrinsics.areEqual(this.view_state, viewSpec.view_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.view_node;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        KeyValueMap keyValueMap = this.view_state;
        int hashCode3 = hashCode2 + (keyValueMap != null ? keyValueMap.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UnaryOp.Builder builder = new UnaryOp.Builder(8);
        builder.operator_ = this.view_node;
        builder.operand = this.view_state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.view_node;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("view_node=", byteString, arrayList);
        }
        KeyValueMap keyValueMap = this.view_state;
        if (keyValueMap != null) {
            arrayList.add("view_state=" + keyValueMap);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ViewSpec{", "}", 0, null, null, 56);
    }
}
