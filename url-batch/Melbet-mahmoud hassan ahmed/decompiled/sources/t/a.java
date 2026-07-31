package t;

import androidx.room.h;
import w.f;

/* loaded from: classes.dex */
public abstract class a<T> extends d {
    public a(h hVar) {
        super(hVar);
    }

    protected abstract void g(f fVar, T t6);

    public final void h(T t6) {
        f a7 = a();
        try {
            g(a7, t6);
            a7.K();
        } finally {
            f(a7);
        }
    }
}
