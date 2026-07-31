package com.yandex.div.json.expressions;

import com.yandex.div.core.CompositeDisposable;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class MutableExpressionList<T> implements ExpressionList<T> {

    @NotNull
    private final List<Expression<T>> expressions;

    @NotNull
    private final String key;

    @Nullable
    private List<? extends T> lastValidValuesList;

    @NotNull
    private final ListValidator<T> listValidator;

    @NotNull
    private final ParsingErrorLogger logger;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableExpressionList(@NotNull String key, @NotNull List<? extends Expression<T>> expressions, @NotNull ListValidator<T> listValidator, @NotNull ParsingErrorLogger logger) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(expressions, "expressions");
        Intrinsics.checkNotNullParameter(listValidator, "listValidator");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.key = key;
        this.expressions = expressions;
        this.listValidator = listValidator;
        this.logger = logger;
    }

    private final List<T> tryResolve(ExpressionResolver expressionResolver) {
        List<Expression<T>> list = this.expressions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Expression) it.next()).evaluate(expressionResolver));
        }
        if (this.listValidator.isValid(arrayList)) {
            return arrayList;
        }
        throw ParsingExceptionKt.invalidValue(this.key, arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof MutableExpressionList) && Intrinsics.areEqual(this.expressions, ((MutableExpressionList) obj).expressions);
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    public List<T> evaluate(@NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        try {
            List<T> tryResolve = tryResolve(resolver);
            this.lastValidValuesList = tryResolve;
            return tryResolve;
        } catch (ParsingException e4) {
            this.logger.logError(e4);
            List<? extends T> list = this.lastValidValuesList;
            if (list != null) {
                return list;
            }
            throw e4;
        }
    }

    @NotNull
    public final List<Expression<T>> getExpressionsInternal() {
        return this.expressions;
    }

    public int hashCode() {
        return this.expressions.hashCode() * 16;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    public Disposable observe(@NotNull ExpressionResolver resolver, @NotNull Function1<? super List<? extends T>, Unit> callback) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MutableExpressionList$observe$itemCallback$1 mutableExpressionList$observe$itemCallback$1 = new MutableExpressionList$observe$itemCallback$1(callback, this, resolver);
        if (this.expressions.size() == 1) {
            return ((Expression) CollectionsKt.first((List) this.expressions)).observe(resolver, mutableExpressionList$observe$itemCallback$1);
        }
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        Iterator<T> it = this.expressions.iterator();
        while (it.hasNext()) {
            compositeDisposable.add(((Expression) it.next()).observe(resolver, mutableExpressionList$observe$itemCallback$1));
        }
        return compositeDisposable;
    }
}
