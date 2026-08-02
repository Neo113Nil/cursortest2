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
import xyz.block.protos.genie.OpenURL;

/* loaded from: classes10.dex */
public final class DebugInfo extends Message {
    public static final ProtoAdapter ADAPTER = new DebugInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DebugInfo.class), "type.googleapis.com/xyz.block.genie.v1.DebugInfo", Syntax.PROTO_2, null, "xyz/block/genie/v1/error.proto");
    public final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugInfo(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DebugInfo)) {
            return false;
        }
        DebugInfo debugInfo = (DebugInfo) obj;
        return Intrinsics.areEqual(unknownFields(), debugInfo.unknownFields()) && Intrinsics.areEqual(this.message, debugInfo.message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.message;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpenURL.Builder builder = new OpenURL.Builder(10);
        builder.url = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DebugInfo{", "}", 0, null, null, 56);
    }
}
