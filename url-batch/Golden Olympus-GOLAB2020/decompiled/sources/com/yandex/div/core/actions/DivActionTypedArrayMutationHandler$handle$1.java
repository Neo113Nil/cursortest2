package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata
/* loaded from: classes2.dex */
final class DivActionTypedArrayMutationHandler$handle$1 extends s implements Function1<JSONArray, JSONArray> {
    final /* synthetic */ Integer $index;
    final /* synthetic */ Object $newValue;
    final /* synthetic */ String $variableName;
    final /* synthetic */ Div2View $view;

    @Metadata
    /* renamed from: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function1<List<Object>, Unit> {
        final /* synthetic */ Object $newValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$newValue = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<Object>) obj);
            return Unit.f41027a;
        }

        public final void invoke(@NotNull List<Object> mutate) {
            Intrinsics.checkNotNullParameter(mutate, "$this$mutate");
            mutate.add(this.$newValue);
        }
    }

    @Metadata
    /* renamed from: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements Function1<List<Object>, Unit> {
        final /* synthetic */ Integer $index;
        final /* synthetic */ Object $newValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Integer num, Object obj) {
            super(1);
            this.$index = num;
            this.$newValue = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<Object>) obj);
            return Unit.f41027a;
        }

        public final void invoke(@NotNull List<Object> mutate) {
            Intrinsics.checkNotNullParameter(mutate, "$this$mutate");
            mutate.add(this.$index.intValue(), this.$newValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionTypedArrayMutationHandler$handle$1(Integer num, Div2View div2View, String str, Object obj) {
        super(1);
        this.$index = num;
        this.$view = div2View;
        this.$variableName = str;
        this.$newValue = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final JSONArray invoke(@NotNull JSONArray array) {
        JSONArray mutate;
        JSONArray mutate2;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length();
        Integer num = this.$index;
        if (num == null || num.intValue() == length) {
            mutate = DivActionTypedArrayMutationHandlerKt.mutate(array, new AnonymousClass1(this.$newValue));
            return mutate;
        }
        if (g.p(0, length).h(num.intValue())) {
            mutate2 = DivActionTypedArrayMutationHandlerKt.mutate(array, new AnonymousClass2(this.$index, this.$newValue));
            return mutate2;
        }
        DivActionTypedUtilsKt.logError(this.$view, new IndexOutOfBoundsException("Index out of bound (" + this.$index + ") for mutation " + this.$variableName + " (" + length + ')'));
        return array;
    }
}
