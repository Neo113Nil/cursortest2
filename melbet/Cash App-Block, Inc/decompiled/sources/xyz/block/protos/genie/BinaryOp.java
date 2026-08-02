package xyz.block.protos.genie;

import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class BinaryOp extends Message {
    public static final ProtoAdapter ADAPTER = new BinaryOp$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BinaryOp.class), "type.googleapis.com/xyz.block.genie.v1.BinaryOp", Syntax.PROTO_2, null, "xyz/block/genie/v1/expression.proto");
    public final Expression left;
    public final Operator operator_;
    public final Expression right;

    public enum Operator implements WireEnum {
        OPERATOR_UNSPECIFIED(0),
        OPERATOR_AND(1),
        OPERATOR_OR(2),
        OPERATOR_EQUAL(3),
        OPERATOR_NOT_EQUAL(4),
        OPERATOR_LESS_THAN(5),
        OPERATOR_GREATER_THAN(6),
        OPERATOR_ADD(7),
        OPERATOR_SUBTRACT(8),
        OPERATOR_MULTIPLY(9),
        OPERATOR_DIVIDE(10),
        OPERATOR_CONCAT(11),
        OPERATOR_CONTAINS(12);

        public static final BinaryOp$Operator$Companion$ADAPTER$1 ADAPTER;
        public static final Companion Companion;
        public final int value;

        public final class Companion implements LastInteractionIdentifier {
            public static Operator fromValue(int i) {
                switch (i) {
                    case 0:
                        return Operator.OPERATOR_UNSPECIFIED;
                    case 1:
                        return Operator.OPERATOR_AND;
                    case 2:
                        return Operator.OPERATOR_OR;
                    case 3:
                        return Operator.OPERATOR_EQUAL;
                    case 4:
                        return Operator.OPERATOR_NOT_EQUAL;
                    case 5:
                        return Operator.OPERATOR_LESS_THAN;
                    case 6:
                        return Operator.OPERATOR_GREATER_THAN;
                    case 7:
                        return Operator.OPERATOR_ADD;
                    case 8:
                        return Operator.OPERATOR_SUBTRACT;
                    case 9:
                        return Operator.OPERATOR_MULTIPLY;
                    case 10:
                        return Operator.OPERATOR_DIVIDE;
                    case 11:
                        return Operator.OPERATOR_CONCAT;
                    case 12:
                        return Operator.OPERATOR_CONTAINS;
                    default:
                        return null;
                }
            }

            @Override // com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier
            public boolean validate(PreviousViewLastInteractionContext previousViewLastInteractionContext) {
                return false;
            }
        }

        static {
            Operator operator = OPERATOR_UNSPECIFIED;
            Companion = new Companion();
            ADAPTER = new BinaryOp$Operator$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Operator.class), Syntax.PROTO_2, operator);
        }

        Operator(int i) {
            this.value = i;
        }

        public static final Operator fromValue(int i) {
            Companion.getClass();
            return Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryOp(Operator operator, Expression expression, Expression expression2, ByteString byteString) {
        super(ADAPTER, byteString);
        operator.getClass();
        expression.getClass();
        expression2.getClass();
        byteString.getClass();
        this.operator_ = operator;
        this.left = expression;
        this.right = expression2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BinaryOp)) {
            return false;
        }
        BinaryOp binaryOp = (BinaryOp) obj;
        return Intrinsics.areEqual(unknownFields(), binaryOp.unknownFields()) && this.operator_ == binaryOp.operator_ && Intrinsics.areEqual(this.left, binaryOp.left) && Intrinsics.areEqual(this.right, binaryOp.right);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.right.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.left, (this.operator_.hashCode() + (unknownFields().hashCode() * 37)) * 37, 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(29);
        builder.action = this.operator_;
        builder.full_applet = this.left;
        builder.half_applet = this.right;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("operator_=" + this.operator_);
        Matcher$$ExternalSyntheticOutline0.m("left=", this.left, arrayList);
        Matcher$$ExternalSyntheticOutline0.m("right=", this.right, arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BinaryOp{", "}", 0, null, null, 56);
    }
}
