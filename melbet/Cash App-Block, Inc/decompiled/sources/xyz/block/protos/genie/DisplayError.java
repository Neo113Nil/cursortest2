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
import xyz.block.protos.genie.IdValue;

/* loaded from: classes10.dex */
public final class DisplayError extends Message {
    public static final ProtoAdapter ADAPTER = new DisplayError$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisplayError.class), "type.googleapis.com/xyz.block.genie.v1.DisplayError", Syntax.PROTO_2, null, "xyz/block/genie/v1/error.proto");
    public final String description;
    public final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayError(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.description = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisplayError)) {
            return false;
        }
        DisplayError displayError = (DisplayError) obj;
        return Intrinsics.areEqual(unknownFields(), displayError.unknownFields()) && Intrinsics.areEqual(this.title, displayError.title) && Intrinsics.areEqual(this.description, displayError.description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(25);
        builder.server = this.title;
        builder.local = this.description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayError{", "}", 0, null, null, 56);
    }
}
