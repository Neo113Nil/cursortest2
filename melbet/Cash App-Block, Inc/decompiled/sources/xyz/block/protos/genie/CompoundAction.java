package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.KeyPath;

/* loaded from: classes10.dex */
public final class CompoundAction extends Message {
    public static final ProtoAdapter ADAPTER = new CompoundAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CompoundAction.class), "type.googleapis.com/xyz.block.genie.v1.CompoundAction", Syntax.PROTO_2, null, "xyz/block/genie/v1/action.proto");
    public final List actions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompoundAction(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.actions = TransactorKt.immutableCopyOf("actions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompoundAction)) {
            return false;
        }
        CompoundAction compoundAction = (CompoundAction) obj;
        return Intrinsics.areEqual(unknownFields(), compoundAction.unknownFields()) && Intrinsics.areEqual(this.actions, compoundAction.actions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.actions.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        KeyPath.Builder builder = new KeyPath.Builder(4);
        builder.segments = this.actions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.actions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("actions=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CompoundAction{", "}", 0, null, null, 56);
    }
}
