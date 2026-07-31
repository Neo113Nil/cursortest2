package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Saver.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a[\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\b\"\u0004\b\u0000\u0010\u000b¢\u0006\u0004\b\f\u0010\r\"\"\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/Saver;", "Saver", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "T", "autoSaver", "()Landroidx/compose/runtime/saveable/Saver;", "AutoSaver", "Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SaverKt {
    private static final Saver AutoSaver = Saver(new Function2() { // from class: androidx.compose.runtime.saveable.SaverKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Object AutoSaver$lambda$0;
            AutoSaver$lambda$0 = SaverKt.AutoSaver$lambda$0((SaverScope) obj, obj2);
            return AutoSaver$lambda$0;
        }
    }, new Function1() { // from class: androidx.compose.runtime.saveable.SaverKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object AutoSaver$lambda$1;
            AutoSaver$lambda$1 = SaverKt.AutoSaver$lambda$1(obj);
            return AutoSaver$lambda$1;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AutoSaver$lambda$0(SaverScope saverScope, Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AutoSaver$lambda$1(Object obj) {
        return obj;
    }

    public static final Saver Saver(final Function2 function2, final Function1 function1) {
        return new Saver<Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$Saver$1
            @Override // androidx.compose.runtime.saveable.Saver
            public Object save(SaverScope saverScope, Object obj) {
                return Function2.this.invoke(saverScope, obj);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Object restore(Object value) {
                return function1.invoke(value);
            }
        };
    }

    public static final Saver autoSaver() {
        Saver saver = AutoSaver;
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }
}
