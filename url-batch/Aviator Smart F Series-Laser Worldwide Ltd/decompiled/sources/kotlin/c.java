package kotlin;

import kotlin.jvm.internal.s;
import kotlin.reflect.m;
import y5.f;

/* loaded from: classes3.dex */
class c extends b {
    private static final <T> T getValue(f fVar, Object obj, m property) {
        s.checkNotNullParameter(fVar, "<this>");
        s.checkNotNullParameter(property, "property");
        return (T) fVar.getValue();
    }

    public static final <T> f lazyOf(T t7) {
        return new InitializedLazyImpl(t7);
    }
}
