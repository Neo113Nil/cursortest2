package defpackage;

import android.os.Parcel;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kdq implements Closeable {
    private Parcel a;

    public kdq(Parcel parcel) {
        this.a = parcel;
    }

    public static kdq c() {
        return new kdq(Parcel.obtain());
    }

    public final Parcel a() {
        hoq.I(this.a != null, "get() after close()/release()");
        return this.a;
    }

    public final Parcel b() {
        Parcel a = a();
        this.a = null;
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Parcel parcel = this.a;
        if (parcel != null) {
            parcel.recycle();
            this.a = null;
        }
    }
}
