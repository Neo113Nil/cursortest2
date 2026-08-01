package ba;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface a {
    d build();

    <T> e register(Class<T> cls);

    <T> e register(T t6);

    <T> e register(Function1<? super b, ? extends T> function1);
}
