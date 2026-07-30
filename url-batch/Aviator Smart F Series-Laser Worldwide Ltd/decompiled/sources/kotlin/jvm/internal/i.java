package kotlin.jvm.internal;

import kotlin.collections.a0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.z0;

/* loaded from: classes4.dex */
public abstract class i {
    public static final kotlin.collections.n iterator(byte[] array) {
        s.checkNotNullParameter(array, "array");
        return new b(array);
    }

    public static final kotlin.collections.o iterator(char[] array) {
        s.checkNotNullParameter(array, "array");
        return new c(array);
    }

    public static final z0 iterator(short[] array) {
        s.checkNotNullParameter(array, "array");
        return new k(array);
    }

    public static final f0 iterator(int[] array) {
        s.checkNotNullParameter(array, "array");
        return new f(array);
    }

    public static final g0 iterator(long[] array) {
        s.checkNotNullParameter(array, "array");
        return new j(array);
    }

    public static final a0 iterator(float[] array) {
        s.checkNotNullParameter(array, "array");
        return new e(array);
    }

    public static final kotlin.collections.y iterator(double[] array) {
        s.checkNotNullParameter(array, "array");
        return new d(array);
    }

    public static final kotlin.collections.m iterator(boolean[] array) {
        s.checkNotNullParameter(array, "array");
        return new a(array);
    }
}
