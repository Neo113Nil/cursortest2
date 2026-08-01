package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.fragment.app.n;
import androidx.fragment.app.s;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class h8 implements b9, o1 {
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public h8(Typeface typeface, wu wuVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.i = typeface;
        this.f = wuVar;
        this.h = new xu(1024);
        int a = wuVar.a(6);
        if (a != 0) {
            int i5 = a + wuVar.a;
            i = ((ByteBuffer) wuVar.d).getInt(((ByteBuffer) wuVar.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.g = new char[i * 2];
        int a2 = wuVar.a(6);
        if (a2 != 0) {
            int i6 = a2 + wuVar.a;
            i2 = ((ByteBuffer) wuVar.d).getInt(((ByteBuffer) wuVar.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            s70 s70Var = new s70(this, i7);
            vu b = s70Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.d).getInt(a3 + b.a) : 0, (char[]) this.g, i7 * 2);
            vu b2 = s70Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.a;
                i3 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            vw.l("invalid metadata codepoint length", i3 > 0);
            xu xuVar = (xu) this.h;
            vu b3 = s70Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.a;
                i4 = ((ByteBuffer) b3.d).getInt(((ByteBuffer) b3.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            xuVar.a(s70Var, 0, i4 - 1);
        }
    }

    public pp a() {
        Map unmodifiableMap;
        yo yoVar = (yo) this.f;
        if (yoVar == null) {
            o8.t("url == null");
            return null;
        }
        String str = (String) this.g;
        nn u = ((j1) this.h).u();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.i;
        byte[] bArr = y70.a;
        linkedHashMap.getClass();
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = wh.f;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            unmodifiableMap.getClass();
        }
        return new pp(yoVar, str, u, (vw) null, unmodifiableMap);
    }

    public void b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((h30) this.g).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void c(sy syVar) {
        syVar.g.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.h;
        synchronized (this) {
            if (!arrayDeque.remove(syVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        i();
    }

    public x40 d(p1 p1Var) {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x40 x40Var = (x40) arrayList.get(i);
            if (x40Var != null && x40Var.b == p1Var) {
                return x40Var;
            }
        }
        x40 x40Var2 = new x40((Context) this.g, p1Var);
        arrayList.add(x40Var2);
        return x40Var2;
    }

    public void e(String str, String str2) {
        str2.getClass();
        j1 j1Var = (j1) this.h;
        j1Var.getClass();
        l70.g(str);
        l70.h(str2, str);
        j1Var.x(str);
        str2.getClass();
        ArrayList arrayList = (ArrayList) j1Var.g;
        arrayList.add(str);
        arrayList.add(l40.q0(str2).toString());
    }

    public void f(String str, vw vwVar) {
        str.getClass();
        if (str.length() <= 0) {
            o8.j("method.isEmpty() == true");
            return;
        }
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            o8.u(str, " must have a request body.", "method ");
        } else {
            this.g = str;
        }
    }

    public boolean g(p1 p1Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f).onActionItemClicked(d(p1Var), new iu((Context) this.g, (b50) menuItem));
    }

    public boolean h(p1 p1Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f;
        x40 d = d(p1Var);
        h30 h30Var = (h30) this.i;
        Menu menu2 = (Menu) h30Var.get(menu);
        if (menu2 == null) {
            menu2 = new uu((Context) this.g, (au) menu);
            h30Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(d, menu2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = y70.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.g).iterator();
                it.getClass();
                while (it.hasNext()) {
                    sy syVar = (sy) it.next();
                    if (((ArrayDeque) this.h).size() >= 64) {
                        break;
                    }
                    if (syVar.g.get() < 5) {
                        it.remove();
                        syVar.g.incrementAndGet();
                        arrayList.add(syVar);
                        ((ArrayDeque) this.h).add(syVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.h).size();
                    ((ArrayDeque) this.i).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    sy syVar2 = (sy) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f) == null) {
                                this.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new x70(y70.g + " Dispatcher", false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f;
                            threadPoolExecutor.getClass();
                        } finally {
                        }
                    }
                    syVar2.getClass();
                    vy vyVar = syVar2.h;
                    byte[] bArr2 = y70.a;
                    try {
                        try {
                            threadPoolExecutor.execute(syVar2);
                        } catch (Throwable th) {
                            vyVar.f.f.c(syVar2);
                            throw th;
                        }
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        vyVar.h(interruptedIOException);
                        syVar2.f.D(vyVar, interruptedIOException);
                        vyVar.f.f.c(syVar2);
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

    @Override // defpackage.b9
    public void onCancel() {
        View view = (View) this.f;
        view.clearAnimation();
        ((ViewGroup) this.g).endViewTransition(view);
        ((d) this.h).a();
        if (n.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((s) this.i) + " has been cancelled.");
        }
    }

    public h8(int i) {
        switch (i) {
            case 3:
                this.g = new ArrayDeque();
                this.h = new ArrayDeque();
                this.i = new ArrayDeque();
                break;
            case 4:
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
            default:
                this.f = new mx(10);
                this.g = new h30(0);
                this.h = new ArrayList();
                this.i = new HashSet();
                break;
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                this.i = new LinkedHashMap();
                this.g = "GET";
                this.h = new j1(21);
                break;
            case 7:
                this.f = new e7(0);
                this.g = new SparseArray();
                this.h = new vr();
                this.i = new e7(0);
                break;
        }
    }
}
