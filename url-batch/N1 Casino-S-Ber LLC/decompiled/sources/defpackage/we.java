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
import androidx.fragment.app.a;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class we implements g9 {
    public static we j;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public we(Typeface typeface, hu huVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.i = typeface;
        this.f = huVar;
        this.h = new iu(1024);
        int a = huVar.a(6);
        if (a != 0) {
            int i5 = a + huVar.a;
            i = ((ByteBuffer) huVar.d).getInt(((ByteBuffer) huVar.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.g = new char[i * 2];
        int a2 = huVar.a(6);
        if (a2 != 0) {
            int i6 = a2 + huVar.a;
            i2 = ((ByteBuffer) huVar.d).getInt(((ByteBuffer) huVar.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            l70 l70Var = new l70(this, i7);
            gu b = l70Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.d).getInt(a3 + b.a) : 0, (char[]) this.g, i7 * 2);
            gu b2 = l70Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.a;
                i3 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            zo.c("invalid metadata codepoint length", i3 > 0);
            iu iuVar = (iu) this.h;
            gu b3 = l70Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.a;
                i4 = ((ByteBuffer) b3.d).getInt(((ByteBuffer) b3.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            iuVar.a(l70Var, 0, i4 - 1);
        }
    }

    public static we o() {
        if (j == null) {
            j = new we(7);
        }
        return j;
    }

    public void A() {
        y20 y20Var = (y20) this.i;
        if (y20Var != null) {
            this.h = y20Var;
            this.i = null;
            p7 p7Var = (p7) y20Var.a.get();
            if (p7Var == null) {
                this.h = null;
            } else {
                Handler handler = s7.w;
                handler.sendMessage(handler.obtainMessage(0, p7Var.a));
            }
        }
    }

    public void a(mk mkVar) {
        if (((ArrayList) this.f).contains(mkVar)) {
            throw new IllegalStateException("Fragment already added: " + mkVar);
        }
        synchronized (((ArrayList) this.f)) {
            ((ArrayList) this.f).add(mkVar);
        }
        mkVar.p = true;
    }

    public void b(tu tuVar) {
        if (((LinkedHashSet) this.i).add(tuVar)) {
            ((uu) this.g).a(this, tuVar, -1);
        }
    }

    public void c(xv xvVar, int i) {
        if (i != 1 && i != 0) {
            t8.e(d30.e("Unsupported priority value: ", i));
        } else if (((LinkedHashSet) this.i).add(xvVar)) {
            ((uu) this.g).a(this, xvVar, i);
        }
    }

    public xz d() {
        Map unmodifiableMap;
        jo joVar = (jo) this.f;
        if (joVar == null) {
            t8.t("url == null");
            return null;
        }
        String str = (String) this.g;
        ym B = ((k0) this.h).B();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.i;
        byte[] bArr = r70.a;
        linkedHashMap.getClass();
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = ei.f;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            unmodifiableMap.getClass();
        }
        return new xz(joVar, str, B, null, unmodifiableMap);
    }

    public boolean e(y20 y20Var, int i) {
        p7 p7Var = (p7) y20Var.a.get();
        if (p7Var == null) {
            return false;
        }
        ((Handler) this.g).removeCallbacksAndMessages(y20Var);
        Handler handler = s7.w;
        handler.sendMessage(handler.obtainMessage(1, i, 0, p7Var.a));
        return true;
    }

    public void f(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((u20) this.g).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                f(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void g(tu tuVar, ru ruVar) {
        uu uuVar = (uu) this.g;
        uuVar.getClass();
        if (uuVar.g != 0) {
            return;
        }
        zv c = uuVar.c(-1);
        uuVar.f = c;
        uuVar.g = -1;
        uuVar.h = tuVar;
        if (ruVar != null) {
            if (c != null) {
                c.d.getClass();
            }
            uuVar.a.b(new wu(ruVar));
        }
    }

    public mk h(String str) {
        a aVar = (a) ((HashMap) this.g).get(str);
        if (aVar != null) {
            return aVar.c;
        }
        return null;
    }

    public mk i(String str) {
        for (a aVar : ((HashMap) this.g).values()) {
            if (aVar != null) {
                mk mkVar = aVar.c;
                if (!str.equals(mkVar.j)) {
                    mkVar = mkVar.y.c.i(str);
                }
                if (mkVar != null) {
                    return mkVar;
                }
            }
        }
        return null;
    }

    public void j(dy dyVar) {
        dyVar.g.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.h;
        synchronized (this) {
            if (!arrayDeque.remove(dyVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        x();
    }

    public q40 k(l1 l1Var) {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q40 q40Var = (q40) arrayList.get(i);
            if (q40Var != null && q40Var.b == l1Var) {
                return q40Var;
            }
        }
        q40 q40Var2 = new q40((Context) this.g, l1Var);
        arrayList.add(q40Var2);
        return q40Var2;
    }

    public ArrayList l() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : ((HashMap) this.g).values()) {
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public ArrayList m() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : ((HashMap) this.g).values()) {
            if (aVar != null) {
                arrayList.add(aVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List n() {
        ArrayList arrayList;
        if (((ArrayList) this.f).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f)) {
            arrayList = new ArrayList((ArrayList) this.f);
        }
        return arrayList;
    }

    @Override // defpackage.g9
    public void onCancel() {
        View view = (View) this.f;
        view.clearAnimation();
        ((ViewGroup) this.g).endViewTransition(view);
        ((xe) this.h).d();
        if (bl.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((k30) this.i) + " has been cancelled.");
        }
    }

    public void p(String str, String str2) {
        str2.getClass();
        k0 k0Var = (k0) this.h;
        k0Var.getClass();
        zo.f(str);
        zo.i(str2, str);
        k0Var.I(str);
        str2.getClass();
        ArrayList arrayList = (ArrayList) k0Var.g;
        arrayList.add(str);
        arrayList.add(c40.y0(str2).toString());
    }

    public boolean q(p7 p7Var) {
        y20 y20Var = (y20) this.h;
        return (y20Var == null || p7Var == null || y20Var.a.get() != p7Var) ? false : true;
    }

    public void r(a aVar) {
        mk mkVar = aVar.c;
        String str = mkVar.j;
        HashMap hashMap = (HashMap) this.g;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(mkVar.j, aVar);
        if (bl.G(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + mkVar);
        }
    }

    public void s(a aVar) {
        mk mkVar = aVar.c;
        if (mkVar.F) {
            ((dl) this.i).e(mkVar);
        }
        if (((a) ((HashMap) this.g).put(mkVar.j, null)) != null && bl.G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + mkVar);
        }
    }

    public void t(String str, zo zoVar) {
        str.getClass();
        if (str.length() <= 0) {
            t8.k("method.isEmpty() == true");
            return;
        }
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            t8.u(str, " must have a request body.", "method ");
        } else {
            this.g = str;
        }
    }

    public boolean u(l1 l1Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f).onActionItemClicked(k(l1Var), new tt((Context) this.g, (u40) menuItem));
    }

    public boolean v(l1 l1Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f;
        q40 k = k(l1Var);
        u20 u20Var = (u20) this.i;
        Menu menu2 = (Menu) u20Var.get(menu);
        if (menu2 == null) {
            menu2 = new fu((Context) this.g, (mt) menu);
            u20Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(k, menu2);
    }

    public void w(p7 p7Var) {
        synchronized (this.f) {
            try {
                if (q(p7Var)) {
                    y20 y20Var = (y20) this.h;
                    if (!y20Var.c) {
                        y20Var.c = true;
                        ((Handler) this.g).removeCallbacksAndMessages(y20Var);
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
    public void x() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = r70.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.g).iterator();
                it.getClass();
                while (it.hasNext()) {
                    dy dyVar = (dy) it.next();
                    if (((ArrayDeque) this.h).size() >= 64) {
                        break;
                    }
                    if (dyVar.g.get() < 5) {
                        it.remove();
                        dyVar.g.incrementAndGet();
                        arrayList.add(dyVar);
                        ((ArrayDeque) this.h).add(dyVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.h).size();
                    ((ArrayDeque) this.i).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    dy dyVar2 = (dy) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f) == null) {
                                this.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new q70(r70.g + " Dispatcher", false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f;
                            threadPoolExecutor.getClass();
                        } finally {
                        }
                    }
                    dyVar2.getClass();
                    gy gyVar = dyVar2.h;
                    byte[] bArr2 = r70.a;
                    try {
                        try {
                            threadPoolExecutor.execute(dyVar2);
                        } catch (Throwable th) {
                            gyVar.f.f.j(dyVar2);
                            throw th;
                        }
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        gyVar.h(interruptedIOException);
                        dyVar2.f.J(gyVar, interruptedIOException);
                        gyVar.f.f.j(dyVar2);
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

    public void y(p7 p7Var) {
        synchronized (this.f) {
            try {
                if (q(p7Var)) {
                    y20 y20Var = (y20) this.h;
                    if (y20Var.c) {
                        y20Var.c = false;
                        z(y20Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(y20 y20Var) {
        Handler handler = (Handler) this.g;
        int i = y20Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(y20Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, y20Var), i);
    }

    public we(int i) {
        switch (i) {
            case 2:
                this.g = new ArrayDeque();
                this.h = new ArrayDeque();
                this.i = new ArrayDeque();
                break;
            case 3:
                this.f = new ArrayList();
                this.g = new HashMap();
                this.h = new HashMap();
                break;
            case 4:
            case 5:
            case 8:
            default:
                this.f = new zw(10);
                this.g = new u20(0);
                this.h = new ArrayList();
                this.i = new HashSet();
                break;
            case 6:
                this.i = new LinkedHashMap();
                this.g = "GET";
                this.h = new k0(25);
                break;
            case 7:
                this.f = new Object();
                this.g = new Handler(Looper.getMainLooper(), new x20(this));
                break;
            case 9:
                this.f = new n6(0);
                this.g = new SparseArray();
                this.h = new hr();
                this.i = new n6(0);
                break;
        }
    }
}
