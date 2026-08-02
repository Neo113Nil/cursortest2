package xyz.block.genie.expressions;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import xyz.block.genie.state.GenieStateValue;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lxyz/block/genie/expressions/ExpressionError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "MissingExpression", "UnresolvedKeyPath", "TypeMismatch", "UnsupportedOperator", "DivisionByZero", "UnresolvedTemplateTokens", "MaxDepthExceeded", "Lxyz/block/genie/expressions/ExpressionError$DivisionByZero;", "Lxyz/block/genie/expressions/ExpressionError$MaxDepthExceeded;", "Lxyz/block/genie/expressions/ExpressionError$MissingExpression;", "Lxyz/block/genie/expressions/ExpressionError$TypeMismatch;", "Lxyz/block/genie/expressions/ExpressionError$UnresolvedKeyPath;", "Lxyz/block/genie/expressions/ExpressionError$UnresolvedTemplateTokens;", "Lxyz/block/genie/expressions/ExpressionError$UnsupportedOperator;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ExpressionError extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/expressions/ExpressionError$DivisionByZero;", "Lxyz/block/genie/expressions/ExpressionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DivisionByZero extends ExpressionError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/expressions/ExpressionError$MaxDepthExceeded;", "Lxyz/block/genie/expressions/ExpressionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MaxDepthExceeded extends ExpressionError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/expressions/ExpressionError$MissingExpression;", "Lxyz/block/genie/expressions/ExpressionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MissingExpression extends ExpressionError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/expressions/ExpressionError$TypeMismatch;", "Lxyz/block/genie/expressions/ExpressionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TypeMismatch extends ExpressionError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeMismatch(String str, GenieStateValue genieStateValue) {
            super("Expected " + str + ", got " + genieStateValue);
            str.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/expressions/ExpressionError$UnresolvedKeyPath;", "Lxyz/block/genie/expressions/ExpressionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnresolvedKeyPath extends ExpressionError {
        public final List segments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnresolvedKeyPath(List list) {
            super("Unresolved key path: ".concat(CollectionsKt.joinToString$default(list, ".", null, null, 0, null, null, 62)));
            list.getClass();
            this.segments = list;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/expressions/ExpressionError$UnresolvedTemplateTokens;", "Lxyz/block/genie/expressions/ExpressionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnresolvedTemplateTokens extends ExpressionError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxyz/block/genie/expressions/ExpressionError$UnsupportedOperator;", "Lxyz/block/genie/expressions/ExpressionError;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnsupportedOperator extends ExpressionError {
    }
}
