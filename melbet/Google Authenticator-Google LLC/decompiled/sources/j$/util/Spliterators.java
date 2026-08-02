package j$.util;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class Spliterators {
    public static final v a = new v();

    public static u a(Object[] objArr, int i, int i2, int i3) {
        objArr.getClass();
        int length = objArr.length;
        if (i <= i2) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(i);
            }
            if (i2 <= length) {
                return new u(objArr, i, i2, i3);
            }
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i + ") > fence(" + i2 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        collection.getClass();
        return new y(collection, i);
    }
}
