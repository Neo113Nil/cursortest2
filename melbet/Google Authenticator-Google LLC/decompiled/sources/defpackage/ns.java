package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ns {
    public boolean c;
    public final List b = new ArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    public ns(boolean z) {
        this.c = z;
    }

    public abstract void b();

    public final void e() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                a.d((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        List list = this.b;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((nr) it2.next()).f();
        }
        list.clear();
    }

    public final void f(boolean z) {
        this.c = z;
        for (nr nrVar : this.b) {
            boolean z2 = false;
            if (nrVar.a && z) {
                z2 = true;
            }
            nrVar.g(z2);
        }
    }

    public void a() {
    }

    public void d() {
    }

    public void c(mx mxVar) {
    }
}
