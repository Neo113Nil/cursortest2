package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class r extends s {
    public final Object[] h;

    public r(r rVar, Spliterator spliterator, long j, long j2) {
        super(rVar, spliterator, j, j2, rVar.h.length);
        this.h = rVar.h;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    public r(Spliterator spliterator, d0 d0Var, Object[] objArr) {
        super(spliterator, d0Var, objArr.length);
        this.h = objArr;
    }
}
