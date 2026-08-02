package xyz.block.protos.genie;

import androidx.room.TransactorKt;
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
import xyz.block.protos.genie.FormatStringOp;

/* loaded from: classes10.dex */
public final class CollectionLiteralField extends Message {
    public static final ProtoAdapter ADAPTER = new CollectionLiteralField$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CollectionLiteralField.class), "type.googleapis.com/xyz.block.genie.v1.CollectionLiteralField", Syntax.PROTO_2, null, "xyz/block/genie/v1/expression.proto");
    public final String key;
    public final Expression value_;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String key;
        public Expression value_;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    String str = this.key;
                    if (str == null) {
                        TransactorKt.missingRequiredFields(str, "key");
                        throw null;
                    }
                    Expression expression = this.value_;
                    if (expression != null) {
                        return new CollectionLiteralField(str, expression, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression, "value_");
                    throw null;
                default:
                    String str2 = this.key;
                    if (str2 == null) {
                        TransactorKt.missingRequiredFields(str2, "key");
                        throw null;
                    }
                    Expression expression2 = this.value_;
                    if (expression2 != null) {
                        return new FormatStringOp.TokenReplacement(str2, expression2, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression2, "value_");
                    throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionLiteralField(String str, Expression expression, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        expression.getClass();
        byteString.getClass();
        this.key = str;
        this.value_ = expression;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionLiteralField)) {
            return false;
        }
        CollectionLiteralField collectionLiteralField = (CollectionLiteralField) obj;
        return Intrinsics.areEqual(unknownFields(), collectionLiteralField.unknownFields()) && Intrinsics.areEqual(this.key, collectionLiteralField.key) && Intrinsics.areEqual(this.value_, collectionLiteralField.value_);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.value_.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.key);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.key = this.key;
        builder.value_ = this.value_;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.key, "key=", arrayList);
        Matcher$$ExternalSyntheticOutline0.m("value_=", this.value_, arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CollectionLiteralField{", "}", 0, null, null, 56);
    }
}
