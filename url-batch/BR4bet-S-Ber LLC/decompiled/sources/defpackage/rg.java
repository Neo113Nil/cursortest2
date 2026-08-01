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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class rg implements t9 {
    public static rg j;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public rg(Typeface typeface, ix ixVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.i = typeface;
        this.f = ixVar;
        this.h = new jx(1024);
        int a = ixVar.a(6);
        if (a != 0) {
            int i5 = a + ixVar.a;
            i = ((ByteBuffer) ixVar.d).getInt(((ByteBuffer) ixVar.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.g = new char[i * 2];
        int a2 = ixVar.a(6);
        if (a2 != 0) {
            int i6 = a2 + ixVar.a;
            i2 = ((ByteBuffer) ixVar.d).getInt(((ByteBuffer) ixVar.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            sa0 sa0Var = new sa0(this, i7);
            hx b = sa0Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.d).getInt(a3 + b.a) : 0, (char[]) this.g, i7 * 2);
            hx b2 = sa0Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.a;
                i3 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            b9.d("invalid metadata codepoint length", i3 > 0);
            jx jxVar = (jx) this.h;
            hx b3 = sa0Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.a;
                i4 = ((ByteBuffer) b3.d).getInt(((ByteBuffer) b3.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            jxVar.a(sa0Var, 0, i4 - 1);
        }
    }

    public static rg o() {
        if (j == null) {
            j = new rg(7);
        }
        return j;
    }

    public void A() {
        a60 a60Var = (a60) this.i;
        if (a60Var != null) {
            this.h = a60Var;
            this.i = null;
            b8 b8Var = (b8) a60Var.a.get();
            if (b8Var == null) {
                this.h = null;
            } else {
                Handler handler = f8.y;
                handler.sendMessage(handler.obtainMessage(0, b8Var.a));
            }
        }
    }

    public void a(pm pmVar) {
        if (((ArrayList) this.f).contains(pmVar)) {
            throw new IllegalStateException("Fragment already added: " + pmVar);
        }
        synchronized (((ArrayList) this.f)) {
            ((ArrayList) this.f).add(pmVar);
        }
        pmVar.p = true;
    }

    public void b(vx vxVar) {
        if (((LinkedHashSet) this.i).add(vxVar)) {
            ((wx) this.g).a(this, vxVar, -1);
        }
    }

    public void c(az azVar, int i) {
        if (i != 1 && i != 0) {
            g9.d(f60.e("Unsupported priority value: ", i));
        } else if (((LinkedHashSet) this.i).add(azVar)) {
            ((wx) this.g).a(this, azVar, i);
        }
    }

    public b30 d() {
        Map unmodifiableMap;
        uq uqVar = (uq) this.f;
        if (uqVar == null) {
            g9.s("url == null");
            return null;
        }
        String str = (String) this.g;
        kp A = ((rc0) this.h).A();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.i;
        byte[] bArr = cb0.a;
        linkedHashMap.getClass();
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = jk.f;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            unmodifiableMap.getClass();
        }
        return new b30(uqVar, str, A, null, unmodifiableMap);
    }

    public boolean e(a60 a60Var, int i) {
        b8 b8Var = (b8) a60Var.a.get();
        if (b8Var == null) {
            return false;
        }
        ((Handler) this.g).removeCallbacksAndMessages(a60Var);
        Handler handler = f8.y;
        handler.sendMessage(handler.obtainMessage(1, i, 0, b8Var.a));
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
        ArrayList arrayList2 = (ArrayList) ((w50) this.g).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                f(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void g(vx vxVar, tx txVar) {
        wx wxVar = (wx) this.g;
        wxVar.getClass();
        if (wxVar.g != 0) {
            return;
        }
        cz c = wxVar.c(-1);
        wxVar.f = c;
        wxVar.g = -1;
        wxVar.h = vxVar;
        if (txVar != null) {
            if (c != null) {
                c.d.getClass();
            }
            wxVar.a.b(new yx(txVar));
        }
    }

    public pm h(String str) {
        ln lnVar = (ln) ((HashMap) this.g).get(str);
        if (lnVar != null) {
            return lnVar.c;
        }
        return null;
    }

    public pm i(String str) {
        for (ln lnVar : ((HashMap) this.g).values()) {
            if (lnVar != null) {
                pm pmVar = lnVar.c;
                if (!str.equals(pmVar.j)) {
                    pmVar = pmVar.y.c.i(str);
                }
                if (pmVar != null) {
                    return pmVar;
                }
            }
        }
        return null;
    }

    public void j(f10 f10Var) {
        f10Var.g.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.h;
        synchronized (this) {
            if (!arrayDeque.remove(f10Var)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        x();
    }

    public s70 k(m1 m1Var) {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s70 s70Var = (s70) arrayList.get(i);
            if (s70Var != null && s70Var.b == m1Var) {
                return s70Var;
            }
        }
        s70 s70Var2 = new s70((Context) this.g, m1Var);
        arrayList.add(s70Var2);
        return s70Var2;
    }

    public ArrayList l() {
        ArrayList arrayList = new ArrayList();
        for (ln lnVar : ((HashMap) this.g).values()) {
            if (lnVar != null) {
                arrayList.add(lnVar);
            }
        }
        return arrayList;
    }

    public ArrayList m() {
        ArrayList arrayList = new ArrayList();
        for (ln lnVar : ((HashMap) this.g).values()) {
            if (lnVar != null) {
                arrayList.add(lnVar.c);
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

    @Override // defpackage.t9
    public void onCancel() {
        View view = (View) this.f;
        view.clearAnimation();
        ((ViewGroup) this.g).endViewTransition(view);
        ((sg) this.h).d();
        if (en.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((m60) this.i) + " has been cancelled.");
        }
    }

    public void p(String str, String str2) {
        str2.getClass();
        rc0 rc0Var = (rc0) this.h;
        rc0Var.getClass();
        kr.h(str);
        kr.j(str2, str);
        rc0Var.J(str);
        str2.getClass();
        ArrayList arrayList = (ArrayList) rc0Var.g;
        arrayList.add(str);
        arrayList.add(f70.g0(str2).toString());
    }

    public boolean q(b8 b8Var) {
        a60 a60Var = (a60) this.h;
        return (a60Var == null || b8Var == null || a60Var.a.get() != b8Var) ? false : true;
    }

    public void r(ln lnVar) {
        pm pmVar = lnVar.c;
        String str = pmVar.j;
        HashMap hashMap = (HashMap) this.g;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(pmVar.j, lnVar);
        if (en.G(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + pmVar);
        }
    }

    public void s(ln lnVar) {
        pm pmVar = lnVar.c;
        if (pmVar.F) {
            ((hn) this.i).f(pmVar);
        }
        if (((ln) ((HashMap) this.g).put(pmVar.j, null)) != null && en.G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + pmVar);
        }
    }

    public void t(String str, la0 la0Var) {
        str.getClass();
        if (str.length() <= 0) {
            g9.i("method.isEmpty() == true");
            return;
        }
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            g9.d(f60.f("method ", str, " must have a request body."));
        } else {
            this.g = str;
        }
    }

    public boolean u(m1 m1Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f).onActionItemClicked(k(m1Var), new uw((Context) this.g, (w70) menuItem));
    }

    public boolean v(m1 m1Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f;
        s70 k = k(m1Var);
        w50 w50Var = (w50) this.i;
        Menu menu2 = (Menu) w50Var.get(menu);
        if (menu2 == null) {
            menu2 = new gx((Context) this.g, (mw) menu);
            w50Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(k, menu2);
    }

    public void w(b8 b8Var) {
        synchronized (this.f) {
            try {
                if (q(b8Var)) {
                    a60 a60Var = (a60) this.h;
                    if (!a60Var.c) {
                        a60Var.c = true;
                        ((Handler) this.g).removeCallbacksAndMessages(a60Var);
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
        byte[] bArr = cb0.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.g).iterator();
                it.getClass();
                while (it.hasNext()) {
                    f10 f10Var = (f10) it.next();
                    if (((ArrayDeque) this.h).size() >= 64) {
                        break;
                    }
                    if (f10Var.g.get() < 5) {
                        it.remove();
                        f10Var.g.incrementAndGet();
                        arrayList.add(f10Var);
                        ((ArrayDeque) this.h).add(f10Var);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.h).size();
                    ((ArrayDeque) this.i).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    f10 f10Var2 = (f10) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f) == null) {
                                this.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new bb0(cb0.g + " Dispatcher", false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f;
                            threadPoolExecutor.getClass();
                        } finally {
                        }
                    }
                    f10Var2.getClass();
                    i10 i10Var = f10Var2.h;
                    byte[] bArr2 = cb0.a;
                    try {
                        try {
                            threadPoolExecutor.execute(f10Var2);
                        } catch (Throwable th) {
                            i10Var.f.f.j(f10Var2);
                            throw th;
                        }
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        i10Var.h(interruptedIOException);
                        f10Var2.f.J(i10Var, interruptedIOException);
                        i10Var.f.f.j(f10Var2);
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

    public void y(b8 b8Var) {
        synchronized (this.f) {
            try {
                if (q(b8Var)) {
                    a60 a60Var = (a60) this.h;
                    if (a60Var.c) {
                        a60Var.c = false;
                        z(a60Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(a60 a60Var) {
        Handler handler = (Handler) this.g;
        int i = a60Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(a60Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, a60Var), i);
    }

    public rg(int i) {
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
                this.f = new c00(10);
                this.g = new w50(0);
                this.h = new ArrayList();
                this.i = new HashSet();
                break;
            case 6:
                this.i = new LinkedHashMap();
                this.g = "GET";
                this.h = new rc0(25);
                break;
            case 7:
                this.f = new Object();
                this.g = new Handler(Looper.getMainLooper(), new z50(this));
                break;
            case 9:
                this.f = new x6(0);
                this.g = new SparseArray();
                this.h = new eu();
                this.i = new x6(0);
                break;
        }
    }
}
