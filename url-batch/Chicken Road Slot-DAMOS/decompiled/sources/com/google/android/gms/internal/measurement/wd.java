package com.google.android.gms.internal.measurement;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class wd extends ke {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2948e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2949d;

    public wd(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.f2949d = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f2949d;
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

    @Override // com.google.android.gms.internal.measurement.ke, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.f2949d.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                kotlin.collections.i0.j();
            } else {
                int length = bArr.length;
                throw null;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i3) {
        ((FilterOutputStream) this).out.write(i3);
        Iterator it = this.f2949d.iterator();
        if (it.hasNext()) {
            throw v4.a.i(it);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ke, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i10) {
        ((FilterOutputStream) this).out.write(bArr, i3, i10);
        Iterator it = this.f2949d.iterator();
        if (it.hasNext()) {
            throw v4.a.i(it);
        }
    }
}
