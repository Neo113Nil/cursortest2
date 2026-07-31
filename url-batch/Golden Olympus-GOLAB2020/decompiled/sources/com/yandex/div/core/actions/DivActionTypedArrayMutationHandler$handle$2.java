package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata
/* loaded from: classes2.dex */
final class DivActionTypedArrayMutationHandler$handle$2 extends s implements Function1<JSONArray, JSONArray> {
    final /* synthetic */ int $index;
    final /* synthetic */ String $variableName;
    final /* synthetic */ Div2View $view;

    @Metadata
    /* renamed from: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function1<List<Object>, Unit> {
        final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i4) {
            super(1);
            this.$index = i4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<Object>) obj);
            return Unit.f41027a;
        }

        public final void invoke(@NotNull List<Object> mutate) {
            Intrinsics.checkNotNullParameter(mutate, "$this$mutate");
            mutate.remove(this.$index);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionTypedArrayMutationHandler$handle$2(int i4, Div2View div2View, String str) {
        super(1);
        this.$index = i4;
        this.$view = div2View;
        this.$variableName = str;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final JSONArray invoke(@NotNull JSONArray array) {
        JSONArray mutate;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length();
        int i4 = this.$index;
        if (i4 >= 0 && i4 < length) {
            mutate = DivActionTypedArrayMutationHandlerKt.mutate(array, new AnonymousClass1(i4));
            return mutate;
        }
        DivActionTypedUtilsKt.logError(this.$view, new IndexOutOfBoundsException("Index out of bound (" + this.$index + ") for mutation " + this.$variableName + " (" + length + ')'));
        return array;
    }
}
