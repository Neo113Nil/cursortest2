package com.google.android.gms.internal.measurement;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class vd extends je {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2892e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2893d;

    public vd(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.f2893d = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f2893d;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (obj != null) {
                kotlin.collections.i0.j();
                return;
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            Iterator it = this.f2893d.iterator();
            if (it.hasNext()) {
                throw v4.a.i(it);
            }
        }
        return read;
    }

    @Override // com.google.android.gms.internal.measurement.je, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = ((FilterInputStream) this).in.read(bArr);
        if (read != -1) {
            Iterator it = this.f2893d.iterator();
            if (it.hasNext()) {
                throw v4.a.i(it);
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        int read = ((FilterInputStream) this).in.read(bArr, i3, i10);
        if (read != -1) {
            Iterator it = this.f2893d.iterator();
            if (it.hasNext()) {
                throw v4.a.i(it);
            }
        }
        return read;
    }
}
