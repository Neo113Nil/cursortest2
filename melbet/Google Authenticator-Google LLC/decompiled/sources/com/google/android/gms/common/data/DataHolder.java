package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.a;
import defpackage.ckq;
import defpackage.cri;
import defpackage.oy;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DataHolder extends cri implements Closeable {
    public static final Parcelable.Creator CREATOR = new ckq(15);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    int i = 1;
    private final boolean j = true;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public final void a(String str, int i) {
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(str));
        }
        if (c()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.h) {
            throw new CursorIndexOutOfBoundsException(i, this.h);
        }
    }

    public final void b() {
        synchronized (this) {
            int i = this.i - 1;
            this.i = i;
            if (i == 0) {
                for (CursorWindow cursorWindow : this.d) {
                    cursorWindow.releaseReference();
                }
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this) {
            z = this.i <= 0;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    protected final void finalize() {
        try {
            if (this.j && this.d.length > 0 && !c()) {
                synchronized (this) {
                    if (this.i > 1) {
                        this.i = 1;
                    }
                    b();
                }
                Log.e("DataBuffer", a.aa(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.b;
        int q = oy.q(parcel, 20293);
        oy.J(parcel, 1, strArr);
        oy.L(parcel, 2, this.d, i);
        oy.v(parcel, 3, this.e);
        oy.z(parcel, 4, this.f);
        oy.v(parcel, 1000, this.a);
        oy.r(parcel, q);
        if ((i & 1) != 0) {
            b();
        }
    }
}
