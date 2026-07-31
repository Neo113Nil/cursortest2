package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: ListSaver.kt */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aa\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00022\u001a\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/Saver;", "", "listSaver", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListSaverKt {
    public static final Saver listSaver(final Function2 function2, Function1 function1) {
        Function2 function22 = new Function2() { // from class: androidx.compose.runtime.saveable.ListSaverKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object listSaver$lambda$1;
                listSaver$lambda$1 = ListSaverKt.listSaver$lambda$1(Function2.this, (SaverScope) obj, obj2);
                return listSaver$lambda$1;
            }
        };
        Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return SaverKt.Saver(function22, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object listSaver$lambda$1(Function2 function2, SaverScope saverScope, Object obj) {
        List list = (List) function2.invoke(saverScope, obj);
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 != null && !saverScope.canBeSaved(obj2)) {
                throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj2).toString());
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new ArrayList(list2);
    }
}
