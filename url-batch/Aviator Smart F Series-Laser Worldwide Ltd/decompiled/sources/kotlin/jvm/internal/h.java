package kotlin.jvm.internal;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class h {
    public static final <T> Iterator<T> iterator(T[] array) {
        s.checkNotNullParameter(array, "array");
        return new g(array);
    }
}
