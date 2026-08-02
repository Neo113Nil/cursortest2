package xyz.block.protos.genie;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Error;

/* loaded from: classes10.dex */
public final class FilterOp extends Message {
    public static final ProtoAdapter ADAPTER = new FilterOp$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FilterOp.class), "type.googleapis.com/xyz.block.genie.v1.FilterOp", Syntax.PROTO_2, null, "xyz/block/genie/v1/expression.proto");
    public final Expression collection;
    public final String item_variable;
    public final Expression predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterOp(Expression expression, String str, Expression expression2, ByteString byteString) {
        super(ADAPTER, byteString);
        expression.getClass();
        str.getClass();
        expression2.getClass();
        byteString.getClass();
        this.collection = expression;
        this.item_variable = str;
        this.predicate = expression2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FilterOp)) {
            return false;
        }
        FilterOp filterOp = (FilterOp) obj;
        return Intrinsics.areEqual(unknownFields(), filterOp.unknownFields()) && Intrinsics.areEqual(this.collection, filterOp.collection) && Intrinsics.areEqual(this.item_variable, filterOp.item_variable) && Intrinsics.areEqual(this.predicate, filterOp.predicate);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.predicate.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.collection, unknownFields().hashCode() * 37, 37), 37, this.item_variable);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(1);
        builder.code = this.collection;
        builder.debug_info = this.item_variable;
        builder.display_error = this.predicate;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Matcher$$ExternalSyntheticOutline0.m("collection=", this.collection, arrayList);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.item_variable, "item_variable=", arrayList);
        Matcher$$ExternalSyntheticOutline0.m("predicate=", this.predicate, arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FilterOp{", "}", 0, null, null, 56);
    }
}
