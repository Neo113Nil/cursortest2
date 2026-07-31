package ru.rustore.sdk.core.tasks;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
/* loaded from: classes3.dex */
public final class TaskKt {
    private static final long INFINITE_TIMEOUT = Long.MIN_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void forEachWithDeletion(List<T> list, Function1<? super T, Unit> function1) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
            it.remove();
        }
    }
}
