package net.idrnd.face.iad.capture.internal;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class a implements AutoCloseable {
    public final ArrayList a = new ArrayList();

    @Override // java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Bitmap) it.next()).recycle();
        }
        arrayList.clear();
    }
}
