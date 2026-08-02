package net.idrnd.face.iad.capture.internal;

import android.content.Context;
import android.graphics.YuvImage;
import android.os.SystemClock;
import android.util.Size;
import com.miteksystems.misnap.camera.a.b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.ImageFormat;
import net.idrnd.face.iad.capture.NativeImageProcessor;
import net.idrnd.face.iad.capture.Plane;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes9.dex */
public final class h implements AutoCloseable {
    public boolean a;
    public final p0 c;
    public final o0 d;
    public final c f;
    public final n3 g;
    public final a3 i;
    public boolean q;
    public final Object b = new Object();
    public final Lazy e = LazyKt.lazy(f.a);
    public final Object h = new Object();
    public final Object j = new Object();
    public final ExecutorService k = Executors.newSingleThreadExecutor();
    public final Object l = new Object();
    public final LinkedHashMap m = MapsKt__MapsKt.mutableMapOf(new Pair(e.a, -1L), new Pair(e.b, -1L));
    public final Object p = new Object();

    public h(Context context, a3 a3Var) {
        this.i = a3Var;
        this.f = new c(context);
        p0 p0Var = new p0();
        this.c = p0Var;
        this.d = new o0(p0Var, 0);
        n3 n3Var = new n3();
        this.g = n3Var;
        synchronized (n3Var.g) {
        }
    }

    public final k3 a(f3 f3Var, f3 f3Var2, byte[] bArr) {
        q a;
        q a2;
        byte[] a3;
        q a4;
        e eVar = e.a;
        synchronized (this.b) {
            if (!this.a) {
                synchronized (this.g.e) {
                }
            }
        }
        synchronized (this.h) {
            try {
                l3 l3Var = this.i.e;
                List list = l3Var.a;
                int a5 = l3Var.a();
                int i = c3.$r8$clinit;
                if (bArr != null) {
                    a = new q(ImageFormat.JPEG, bArr, new Size(f3Var2.b, f3Var2.c), f3Var2.d, System.currentTimeMillis());
                } else {
                    q0 q0Var = (q0) list.get(a5);
                    int ordinal = q0Var.a.ordinal();
                    if (ordinal == 0) {
                        p0 p0Var = this.c;
                        MatchResult.Destructured destructured = f3Var2.d;
                        Integer num = q0Var.b;
                        num.getClass();
                        a = p0Var.a(f3Var2, destructured, num.intValue());
                    } else {
                        if (ordinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a = this.c.a(f3Var2);
                    }
                }
                q qVar = a;
                ByteBuffer.wrap(qVar.b).getClass();
                int i2 = 0;
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(new Plane(0));
                Size size = qVar.c;
                size.getHeight();
                size.getWidth();
                System.currentTimeMillis();
                SystemClock.elapsedRealtime();
                listOf.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    ArrayList arrayList2 = null;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        if (i2 != a5) {
                            arrayList.add(next);
                        }
                        i2 = i3;
                    } else {
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            q0 q0Var2 = (q0) it2.next();
                            int ordinal2 = q0Var2.a.ordinal();
                            if (ordinal2 == 0) {
                                p0 p0Var2 = this.c;
                                MatchResult.Destructured destructured2 = f3Var2.d;
                                Integer num2 = q0Var2.b;
                                num2.getClass();
                                a4 = p0Var2.a(f3Var2, destructured2, num2.intValue());
                            } else {
                                if (ordinal2 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                a4 = this.c.a(f3Var2);
                            }
                            arrayList3.add(a4);
                        }
                        int i4 = c3.$r8$clinit;
                        v vVar = this.i.e.c;
                        if (vVar != null) {
                            arrayList2 = this.d.a(f3Var2, vVar.b, vVar.d);
                        }
                        f3Var2.close();
                        q0 q0Var3 = this.i.e.b;
                        int ordinal3 = q0Var3.a.ordinal();
                        if (ordinal3 == 0) {
                            p0 p0Var3 = this.c;
                            MatchResult.Destructured destructured3 = f3Var.d;
                            Integer num3 = q0Var3.b;
                            num3.getClass();
                            a2 = p0Var3.a(f3Var, destructured3, num3.intValue());
                        } else {
                            if (ordinal3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            a2 = this.c.a(f3Var);
                        }
                        q qVar2 = a2;
                        f3Var.close();
                        a3 = this.f.a(qVar2, qVar, arrayList2, arrayList3, this.i, ((Number) MapsKt__MapsKt.getValue(this.m, eVar)).longValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new k3(a3);
    }

    public final void b(f3 f3Var) {
        synchronized (this.l) {
            ((m3) this.e.getValue()).a(f3Var);
        }
        if (a()) {
            synchronized (this.p) {
                if (this.q) {
                    this.q = false;
                    b();
                    return;
                }
                synchronized (this.l) {
                    f3 a = ((m3) this.e.getValue()).a(f3Var.b());
                    if (a == null) {
                        return;
                    }
                    if (a.c()) {
                        return;
                    }
                    if (f3Var.c()) {
                        return;
                    }
                    f3 a2 = a.a();
                    a2.getClass();
                    f3 a3 = f3Var.a();
                    a3.getClass();
                    System.currentTimeMillis();
                    n3 n3Var = this.g;
                    n3Var.getClass();
                    synchronized (n3Var.e) {
                    }
                    a2.close();
                    a3.close();
                    System.currentTimeMillis();
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            if (this.a) {
                return;
            }
            synchronized (this.j) {
                this.k.shutdown();
            }
            this.g.close();
            synchronized (this.l) {
                m3 m3Var = (m3) this.e.getValue();
                synchronized (m3Var) {
                    List list = CollectionsKt.toList(m3Var.b);
                    m3Var.b.clear();
                    if (m3Var.c != null) {
                        list.getClass();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((f3) it.next()).close();
                        }
                    }
                }
            }
            this.a = true;
        }
    }

    public final b b(long j, byte[] bArr) {
        Object failure;
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            failure = a(j, bArr);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl == null) {
            return new x3(new p(new k3(((k3) failure).a)));
        }
        if (m4120exceptionOrNullimpl instanceof h3) {
            obj = i.a;
        } else if (m4120exceptionOrNullimpl instanceof g3) {
            obj = l.a;
        } else if (m4120exceptionOrNullimpl instanceof w) {
            obj = j.a;
        } else if (m4120exceptionOrNullimpl instanceof d0) {
            obj = k.a;
        } else if (m4120exceptionOrNullimpl instanceof o3) {
            obj = m.a;
        } else {
            obj = n.a;
        }
        return new w3(obj);
    }

    public final void b() {
        List list;
        synchronized (this.b) {
            if (this.a) {
                return;
            }
            this.m.put(e.a, Long.valueOf(System.currentTimeMillis()));
            if (!a()) {
                synchronized (this.p) {
                    this.q = true;
                }
                return;
            }
            synchronized (this.l) {
                m3 m3Var = (m3) this.e.getValue();
                synchronized (m3Var) {
                    list = CollectionsKt.toList(m3Var.b);
                }
                f3 f3Var = (f3) CollectionsKt.last(list);
                f3 b = ((m3) this.e.getValue()).b();
                if (b == null) {
                    return;
                }
                f3 a = f3Var.a();
                a.getClass();
                f3 a2 = b.a();
                a2.getClass();
                a(a2, a, null);
            }
        }
    }

    public final boolean a() {
        int size;
        f3 b;
        synchronized (this.l) {
            m3 m3Var = (m3) this.e.getValue();
            synchronized (m3Var) {
                size = m3Var.b.size();
            }
        }
        if (size < 2) {
            return false;
        }
        synchronized (this.l) {
            b = ((m3) this.e.getValue()).b();
        }
        return b != null;
    }

    public final k3 a(long j, byte[] bArr) {
        List list;
        Object obj;
        f3 a;
        f3 a2;
        f3 a3;
        synchronized (this.b) {
            if (this.a) {
                throw new h3();
            }
        }
        this.m.put(e.a, Long.valueOf(System.currentTimeMillis()));
        if (a()) {
            synchronized (this.l) {
                try {
                    m3 m3Var = (m3) this.e.getValue();
                    synchronized (m3Var) {
                        list = CollectionsKt.toList(m3Var.b);
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((IadFrame) ((f3) obj).d.match).b - j == 0) {
                            break;
                        }
                    }
                    f3 f3Var = (f3) obj;
                    if (f3Var != null) {
                        synchronized (this.l) {
                            a = ((m3) this.e.getValue()).a(f3Var.b());
                        }
                        if (a != null) {
                            a2 = f3Var.a();
                            a2.getClass();
                            a3 = a.a();
                            a3.getClass();
                        } else {
                            throw new g3();
                        }
                    } else {
                        throw new o3();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            e eVar = e.a;
            return a(a3, a2, bArr);
        }
        synchronized (this.p) {
            this.q = true;
        }
        throw new g3();
    }

    public final b a(YuvImage yuvImage, MatchResult.Destructured destructured) {
        v3 v3Var;
        if (yuvImage.getHeight() <= 0 || yuvImage.getWidth() <= 0) {
            return new w3(q3.a);
        }
        if (((IadFrame) destructured.match).b < 0) {
            return new w3(r3.a);
        }
        synchronized (this.b) {
            if (this.a) {
                return new w3(p3.a);
            }
            byte[] yuvData = yuvImage.getYuvData();
            yuvData.getClass();
            b(new f3(new d3(NativeImageProcessor.a.copyJavaByteArrayToNativeMemory(yuvData), yuvData.length), yuvImage.getWidth(), yuvImage.getHeight(), destructured));
            if (a()) {
                v3Var = v3.a;
            } else {
                v3Var = v3.b;
            }
            return new x3(new t3(v3Var));
        }
    }
}
