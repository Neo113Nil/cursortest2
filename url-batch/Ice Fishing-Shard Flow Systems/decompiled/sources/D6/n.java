package D6;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g0.C0409B;
import io.flutter.plugin.platform.C0556b;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import j5.C0583a;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n implements io.flutter.plugin.platform.j {

    /* renamed from: d, reason: collision with root package name */
    public int f540d;

    /* renamed from: e, reason: collision with root package name */
    public int f541e;

    /* renamed from: i, reason: collision with root package name */
    public Object f542i;

    /* renamed from: l, reason: collision with root package name */
    public Object f543l;

    /* renamed from: m, reason: collision with root package name */
    public Object f544m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f545n;

    public n() {
        this.f540d = 64;
        this.f541e = 5;
        this.f543l = new ArrayDeque();
        this.f544m = new ArrayDeque();
        this.f545n = new ArrayDeque();
    }

    public static void e(n dispatcher, H6.n nVar, H6.n nVar2, int i2) {
        m mVar;
        if ((i2 & 1) != 0) {
            nVar = null;
        }
        if ((i2 & 4) != 0) {
            nVar2 = null;
        }
        dispatcher.getClass();
        TimeZone timeZone = E6.e.f712a;
        Intrinsics.checkNotNullParameter(dispatcher, "<this>");
        boolean isShutdown = dispatcher.b().isShutdown();
        synchronized (dispatcher) {
            if (nVar2 != null) {
                try {
                    nVar2.f1066e.decrementAndGet();
                    if (!((ArrayDeque) dispatcher.f544m).remove(nVar2)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (nVar != null) {
                ((ArrayDeque) dispatcher.f543l).add(nVar);
                H6.n other = dispatcher.c(((s) nVar.f1067i.f1071e.f640c).f565d);
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    nVar.f1066e = other.f1066e;
                }
            }
            if (nVar2 != null && (isShutdown || ((ArrayDeque) dispatcher.f544m).isEmpty())) {
                ((ArrayDeque) dispatcher.f545n).isEmpty();
            }
            if (isShutdown) {
                List z7 = CollectionsKt.z((ArrayDeque) dispatcher.f543l);
                ((ArrayDeque) dispatcher.f543l).clear();
                mVar = new m(z7);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) dispatcher.f543l).iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    H6.n nVar3 = (H6.n) it.next();
                    if (((ArrayDeque) dispatcher.f544m).size() >= dispatcher.f540d) {
                        break;
                    }
                    if (nVar3.f1066e.get() < dispatcher.f541e) {
                        it.remove();
                        nVar3.f1066e.incrementAndGet();
                        arrayList.add(nVar3);
                        ((ArrayDeque) dispatcher.f544m).add(nVar3);
                    }
                }
                mVar = new m(arrayList);
            }
        }
        int size = mVar.f539a.size();
        boolean z8 = true;
        for (int i5 = 0; i5 < size; i5++) {
            H6.n nVar4 = (H6.n) mVar.f539a.get(i5);
            if (nVar4 == nVar) {
                z8 = false;
            } else {
                H6.q call = nVar4.f1067i;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            }
            if (isShutdown) {
                nVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                nVar4.f1067i.g(interruptedIOException);
                ((C0583a) nVar4.f1065d.f2251d).accept(interruptedIOException);
            } else {
                ExecutorService executorService = dispatcher.b();
                nVar4.getClass();
                Intrinsics.checkNotNullParameter(executorService, "executorService");
                H6.q qVar = nVar4.f1067i;
                Intrinsics.checkNotNullParameter(qVar.f1070d.f598a, "<this>");
                try {
                    try {
                        executorService.execute(nVar4);
                    } catch (Throwable th2) {
                        qVar.f1070d.f598a.d(nVar4);
                        throw th2;
                    }
                } catch (RejectedExecutionException e7) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e7);
                    nVar4.f1067i.g(interruptedIOException2);
                    ((C0583a) nVar4.f1065d.f2251d).accept(interruptedIOException2);
                    qVar.f1070d.f598a.d(nVar4);
                }
            }
        }
        if (!z8 || nVar == null) {
            return;
        }
        H6.q call2 = nVar.f1067i;
        Intrinsics.checkNotNullParameter(call2, "call");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
    }

    @Override // io.flutter.plugin.platform.j
    public void a(int i2, int i5) {
        ImageReader newInstance;
        ImageReader imageReader = (ImageReader) this.f543l;
        if (imageReader != null && this.f540d == i2 && this.f541e == i5) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f542i).pushImage(null);
            ((ImageReader) this.f543l).close();
            this.f543l = null;
        }
        this.f540d = i2;
        this.f541e = i5;
        Handler handler = (Handler) this.f544m;
        C0556b c0556b = (C0556b) this.f545n;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            J.c.r();
            ImageReader.Builder i8 = J.c.i(this.f540d, this.f541e);
            i8.setMaxImages(4);
            i8.setImageFormat(34);
            i8.setUsage(256L);
            newInstance = i8.build();
            newInstance.setOnImageAvailableListener(c0556b, handler);
        } else {
            if (i7 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            newInstance = ImageReader.newInstance(i2, i5, 34, 4, 256L);
            newInstance.setOnImageAvailableListener(c0556b, handler);
        }
        this.f543l = newInstance;
    }

    public synchronized ExecutorService b() {
        ExecutorService executorService;
        try {
            if (((ExecutorService) this.f542i) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = E6.e.f713b + " Dispatcher";
                Intrinsics.checkNotNullParameter(name, "name");
                this.f542i = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new E6.d(name, false));
            }
            executorService = (ExecutorService) this.f542i;
            Intrinsics.b(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public H6.n c(String str) {
        Iterator it = ((ArrayDeque) this.f544m).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            H6.n nVar = (H6.n) it.next();
            if (Intrinsics.a(((s) nVar.f1067i.f1071e.f640c).f565d, str)) {
                return nVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f543l).iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            H6.n nVar2 = (H6.n) it2.next();
            if (Intrinsics.a(((s) nVar2.f1067i.f1071e.f640c).f565d, str)) {
                return nVar2;
            }
        }
        return null;
    }

    public void d(H6.n call) {
        Intrinsics.checkNotNullParameter(call, "call");
        e(this, null, call, 3);
    }

    public void f(int i2) {
        RecyclerView recyclerView = (RecyclerView) this.f545n;
        C0409B c0409b = recyclerView.f3984f0;
        if (i2 < 0 || i2 >= c0409b.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + c0409b.a() + recyclerView.h());
        }
        boolean z7 = c0409b.f4857c;
        ArrayList arrayList = (ArrayList) this.f543l;
        ArrayList arrayList2 = (ArrayList) this.f542i;
        if (arrayList2.size() > 0) {
            throw C4.p.f(arrayList2, 0);
        }
        ArrayList arrayList3 = (ArrayList) recyclerView.f3991l.f332l;
        if (arrayList3.size() > 0) {
            RecyclerView.j((View) arrayList3.get(0));
            throw null;
        }
        if (arrayList.size() > 0) {
            throw C4.p.f(arrayList, 0);
        }
        int F4 = recyclerView.f3987i.F(i2, 0);
        if (F4 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + F4 + ").state:" + c0409b.a() + recyclerView.h());
    }

    public void g() {
        ArrayList arrayList = (ArrayList) this.f543l;
        this.f541e = this.f540d;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f541e) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f3952p0;
        throw null;
    }

    @Override // io.flutter.plugin.platform.j
    public int getHeight() {
        return this.f541e;
    }

    @Override // io.flutter.plugin.platform.j
    public long getId() {
        return ((TextureRegistry$ImageTextureEntry) this.f542i).id();
    }

    @Override // io.flutter.plugin.platform.j
    public Surface getSurface() {
        return ((ImageReader) this.f543l).getSurface();
    }

    @Override // io.flutter.plugin.platform.j
    public int getWidth() {
        return this.f540d;
    }

    @Override // io.flutter.plugin.platform.j
    public void release() {
        if (((ImageReader) this.f543l) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f542i).pushImage(null);
            ((ImageReader) this.f543l).close();
            this.f543l = null;
        }
        this.f542i = null;
    }

    public n(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f540d = 0;
        this.f541e = 0;
        this.f544m = new Handler();
        this.f545n = new C0556b(this);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f542i = textureRegistry$ImageTextureEntry;
            return;
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public n(RecyclerView recyclerView) {
        this.f545n = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f542i = arrayList;
        this.f543l = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f540d = 2;
        this.f541e = 2;
    }
}
