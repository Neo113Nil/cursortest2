package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ConditionalOp extends Message {
    public static final ProtoAdapter ADAPTER = new ConditionalOp$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConditionalOp.class), "type.googleapis.com/xyz.block.genie.v1.ConditionalOp", Syntax.PROTO_2, null, "xyz/block/genie/v1/expression.proto");
    public final Expression condition;
    public final Expression else_expr;
    public final Expression then_expr;

    /* loaded from: classes6.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Expression condition;
        public Expression else_expr;
        public Expression then_expr;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    Expression expression = this.condition;
                    if (expression == null) {
                        TransactorKt.missingRequiredFields(expression, "condition");
                        throw null;
                    }
                    Expression expression2 = this.then_expr;
                    if (expression2 == null) {
                        TransactorKt.missingRequiredFields(expression2, "then_expr");
                        throw null;
                    }
                    Expression expression3 = this.else_expr;
                    if (expression3 != null) {
                        return new ConditionalOp(expression, expression2, expression3, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression3, "else_expr");
                    throw null;
                case 1:
                    return new ComposePlatform.ProgressIndicator(this.condition, this.then_expr, this.else_expr, buildUnknownFields());
                case 2:
                    Expression expression4 = this.condition;
                    if (expression4 != null) {
                        return new MoneybotScaffold.Evidence.Breakdown.BarChart.Bar(expression4, this.then_expr, this.else_expr, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression4, "value_");
                    throw null;
                case 3:
                    Expression expression5 = this.condition;
                    if (expression5 == null) {
                        TransactorKt.missingRequiredFields(expression5, "category");
                        throw null;
                    }
                    Expression expression6 = this.then_expr;
                    if (expression6 != null) {
                        return new MoneybotScaffold.Evidence.Breakdown.CategoryRow(expression5, expression6, this.else_expr, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression6, "amount");
                    throw null;
                case 4:
                    Expression expression7 = this.condition;
                    if (expression7 == null) {
                        TransactorKt.missingRequiredFields(expression7, "eyebrow");
                        throw null;
                    }
                    Expression expression8 = this.then_expr;
                    if (expression8 != null) {
                        return new MoneybotScaffold.Meaning.Opportunity(expression7, expression8, this.else_expr, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression8, "heading");
                    throw null;
                default:
                    Expression expression9 = this.condition;
                    if (expression9 == null) {
                        TransactorKt.missingRequiredFields(expression9, "eyebrow");
                        throw null;
                    }
                    Expression expression10 = this.then_expr;
                    if (expression10 != null) {
                        return new MoneybotScaffold.Meaning.RiskPattern(expression9, expression10, this.else_expr, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression10, "heading");
                    throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConditionalOp(Expression expression, Expression expression2, Expression expression3, ByteString byteString) {
        super(ADAPTER, byteString);
        expression.getClass();
        expression2.getClass();
        expression3.getClass();
        byteString.getClass();
        this.condition = expression;
        this.then_expr = expression2;
        this.else_expr = expression3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConditionalOp)) {
            return false;
        }
        ConditionalOp conditionalOp = (ConditionalOp) obj;
        return Intrinsics.areEqual(unknownFields(), conditionalOp.unknownFields()) && Intrinsics.areEqual(this.condition, conditionalOp.condition) && Intrinsics.areEqual(this.then_expr, conditionalOp.then_expr) && Intrinsics.areEqual(this.else_expr, conditionalOp.else_expr);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.else_expr.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.then_expr, Matcher$$ExternalSyntheticOutline0.m(this.condition, unknownFields().hashCode() * 37, 37), 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.condition = this.condition;
        builder.then_expr = this.then_expr;
        builder.else_expr = this.else_expr;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Matcher$$ExternalSyntheticOutline0.m("condition=", this.condition, arrayList);
        Matcher$$ExternalSyntheticOutline0.m("then_expr=", this.then_expr, arrayList);
        Matcher$$ExternalSyntheticOutline0.m("else_expr=", this.else_expr, arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConditionalOp{", "}", 0, null, null, 56);
    }
}
