package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class wi implements la {
    public static wi j;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public wi(Typeface typeface, m20 m20Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.i = typeface;
        this.f = m20Var;
        this.h = new n20(1024);
        int a = m20Var.a(6);
        if (a != 0) {
            int i5 = a + m20Var.f;
            i = ((ByteBuffer) m20Var.i).getInt(((ByteBuffer) m20Var.i).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.g = new char[i * 2];
        int a2 = m20Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + m20Var.f;
            i2 = ((ByteBuffer) m20Var.i).getInt(((ByteBuffer) m20Var.i).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            nk0 nk0Var = new nk0(this, i7);
            l20 b = nk0Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.i).getInt(a3 + b.f) : 0, (char[]) this.g, i7 * 2);
            l20 b2 = nk0Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.f;
                i3 = ((ByteBuffer) b2.i).getInt(((ByteBuffer) b2.i).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            bi.n("invalid metadata codepoint length", i3 > 0);
            n20 n20Var = (n20) this.h;
            l20 b3 = nk0Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.f;
                i4 = ((ByteBuffer) b3.i).getInt(((ByteBuffer) b3.i).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            n20Var.a(nk0Var, 0, i4 - 1);
        }
    }

    public static wi i() {
        if (j == null) {
            j = new wi(6);
        }
        return j;
    }

    public void a(i30 i30Var) {
        if (((LinkedHashSet) this.i).add(i30Var)) {
            ((j30) this.g).a(this, i30Var, -1);
        }
    }

    public void b(r40 r40Var, int i) {
        if (i != 1 && i != 0) {
            s9.e(r7.b("Unsupported priority value: ", i));
        } else if (((LinkedHashSet) this.i).add(r40Var)) {
            ((j30) this.g).a(this, r40Var, i);
        }
    }

    public j90 c() {
        Map unmodifiableMap;
        ou ouVar = (ou) this.f;
        if (ouVar == null) {
            s9.u("url == null");
            return null;
        }
        String str = (String) this.g;
        bt x = ((o0) this.h).x();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.i;
        byte[] bArr = zk0.a;
        linkedHashMap.getClass();
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = xm.f;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            unmodifiableMap.getClass();
        }
        return new j90(ouVar, str, x, null, unmodifiableMap);
    }

    public boolean d(de0 de0Var, int i) {
        n8 n8Var = (n8) de0Var.a.get();
        if (n8Var == null) {
            return false;
        }
        ((Handler) this.g).removeCallbacksAndMessages(de0Var);
        Handler handler = q8.x;
        handler.sendMessage(handler.obtainMessage(1, i, 0, n8Var.a));
        return true;
    }

    public void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((zd0) this.g).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void f(i30 i30Var, g30 g30Var) {
        j30 j30Var = (j30) this.g;
        j30Var.getClass();
        if (j30Var.g != 0) {
            return;
        }
        t40 c = j30Var.c(-1);
        j30Var.f = c;
        j30Var.g = -1;
        j30Var.h = i30Var;
        if (g30Var != null) {
            if (c != null) {
                c.d.getClass();
            }
            ef0 ef0Var = j30Var.a;
            l30 l30Var = new l30(g30Var);
            ef0Var.getClass();
            ef0Var.i0(null, l30Var);
        }
    }

    public void g(k70 k70Var) {
        k70Var.g.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.h;
        synchronized (this) {
            if (!arrayDeque.remove(k70Var)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        q();
    }

    public bg0 h(p1 p1Var) {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bg0 bg0Var = (bg0) arrayList.get(i);
            if (bg0Var != null && bg0Var.b == p1Var) {
                return bg0Var;
            }
        }
        bg0 bg0Var2 = new bg0((Context) this.g, p1Var);
        arrayList.add(bg0Var2);
        return bg0Var2;
    }

    public om0 j(dc dcVar, String str) {
        om0 om0Var;
        om0 a;
        synchronized (((xy) this.i)) {
            try {
                sm0 sm0Var = (sm0) this.f;
                sm0Var.getClass();
                om0Var = (om0) sm0Var.a.get(str);
                if (dcVar.c(om0Var)) {
                    rm0 rm0Var = (rm0) this.g;
                    if (rm0Var instanceof tb0) {
                        tb0 tb0Var = (tb0) rm0Var;
                        om0Var.getClass();
                        nx nxVar = tb0Var.i;
                        if (nxVar != null) {
                            i5 i5Var = tb0Var.j;
                            i5Var.getClass();
                            bi.g(om0Var, i5Var, nxVar);
                        }
                    }
                    om0Var.getClass();
                } else {
                    a30 a30Var = new a30((hh) this.h);
                    a30Var.a.put(mv.n, str);
                    rm0 rm0Var2 = (rm0) this.g;
                    try {
                        try {
                            a = rm0Var2.i(dcVar, a30Var);
                        } catch (AbstractMethodError unused) {
                            a = rm0Var2.a(mv.u(dcVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        a = rm0Var2.e(mv.u(dcVar), a30Var);
                    }
                    om0Var = a;
                    sm0 sm0Var2 = (sm0) this.f;
                    sm0Var2.getClass();
                    om0Var.getClass();
                    om0 om0Var2 = (om0) sm0Var2.a.put(str, om0Var);
                    if (om0Var2 != null) {
                        om0Var2.clear$lifecycle_viewmodel_release();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return om0Var;
    }

    public void k(String str, String str2) {
        str2.getClass();
        o0 o0Var = (o0) this.h;
        o0Var.getClass();
        gk0.e(str);
        gk0.f(str2, str);
        o0Var.E(str);
        str2.getClass();
        ArrayList arrayList = (ArrayList) o0Var.g;
        arrayList.add(str);
        arrayList.add(mf0.E(str2).toString());
    }

    public boolean l(n8 n8Var) {
        de0 de0Var = (de0) this.h;
        return (de0Var == null || n8Var == null || de0Var.a.get() != n8Var) ? false : true;
    }

    public void m(String str, n9 n9Var) {
        str.getClass();
        if (str.length() <= 0) {
            s9.k("method.isEmpty() == true");
            return;
        }
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            s9.e(r7.c("method ", str, " must have a request body."));
        } else {
            this.g = str;
        }
    }

    public boolean n(p1 p1Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f).onActionItemClicked(h(p1Var), new y10((Context) this.g, (fg0) menuItem));
    }

    public boolean o(p1 p1Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f;
        bg0 h = h(p1Var);
        zd0 zd0Var = (zd0) this.i;
        Menu menu2 = (Menu) zd0Var.get(menu);
        if (menu2 == null) {
            menu2 = new k20((Context) this.g, (r10) menu);
            zd0Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(h, menu2);
    }

    @Override // defpackage.la
    public void onCancel() {
        View view = (View) this.f;
        view.clearAnimation();
        ((ViewGroup) this.g).endViewTransition(view);
        ((xi) this.h).d();
        if (c.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((qe0) this.i) + " has been cancelled.");
        }
    }

    public void p(n8 n8Var) {
        synchronized (this.f) {
            try {
                if (l(n8Var)) {
                    de0 de0Var = (de0) this.h;
                    if (!de0Var.c) {
                        de0Var.c = true;
                        ((Handler) this.g).removeCallbacksAndMessages(de0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = zk0.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.g).iterator();
                it.getClass();
                while (it.hasNext()) {
                    k70 k70Var = (k70) it.next();
                    if (((ArrayDeque) this.h).size() >= 64) {
                        break;
                    }
                    if (k70Var.g.get() < 5) {
                        it.remove();
                        k70Var.g.incrementAndGet();
                        arrayList.add(k70Var);
                        ((ArrayDeque) this.h).add(k70Var);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.h).size();
                    ((ArrayDeque) this.i).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    k70 k70Var2 = (k70) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f) == null) {
                                this.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new yk0(zk0.g + " Dispatcher", false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f;
                            threadPoolExecutor.getClass();
                        } finally {
                        }
                    }
                    k70Var2.getClass();
                    n70 n70Var = k70Var2.h;
                    byte[] bArr2 = zk0.a;
                    try {
                        try {
                            threadPoolExecutor.execute(k70Var2);
                        } catch (Throwable th) {
                            n70Var.f.f.g(k70Var2);
                            throw th;
                        }
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        n70Var.h(interruptedIOException);
                        k70Var2.f.G(n70Var, interruptedIOException);
                        n70Var.f.f.g(k70Var2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        while (i < size) {
        }
    }

    public void r(n8 n8Var) {
        synchronized (this.f) {
            try {
                if (l(n8Var)) {
                    de0 de0Var = (de0) this.h;
                    if (de0Var.c) {
                        de0Var.c = false;
                        s(de0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(de0 de0Var) {
        Handler handler = (Handler) this.g;
        int i = de0Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(de0Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, de0Var), i);
    }

    public void t() {
        de0 de0Var = (de0) this.i;
        if (de0Var != null) {
            this.h = de0Var;
            this.i = null;
            n8 n8Var = (n8) de0Var.a.get();
            if (n8Var == null) {
                this.h = null;
            } else {
                Handler handler = q8.x;
                handler.sendMessage(handler.obtainMessage(0, n8Var.a));
            }
        }
    }

    public wi(int i) {
        switch (i) {
            case 2:
                this.g = new ArrayDeque();
                this.h = new ArrayDeque();
                this.i = new ArrayDeque();
                break;
            case 3:
            case 4:
            case 7:
            default:
                this.f = new f60(10);
                this.g = new zd0(0);
                this.h = new ArrayList();
                this.i = new HashSet();
                break;
            case 5:
                this.i = new LinkedHashMap();
                this.g = "GET";
                this.h = new o0(27);
                break;
            case 6:
                this.f = new Object();
                this.g = new Handler(Looper.getMainLooper(), new ce0(this));
                break;
            case 8:
                this.f = new g7(0);
                this.g = new SparseArray();
                this.h = new ez();
                this.i = new g7(0);
                break;
        }
    }

    public wi(sm0 sm0Var, rm0 rm0Var, hh hhVar) {
        sm0Var.getClass();
        hhVar.getClass();
        this.f = sm0Var;
        this.g = rm0Var;
        this.h = hhVar;
        this.i = new xy(19);
    }
}
