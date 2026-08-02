package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpe implements Iterable, Closeable, cna {
    public final DataHolder a;

    public cpe(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.cna
    public final void a() {
        this.a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ksf(this, 1);
    }
}
