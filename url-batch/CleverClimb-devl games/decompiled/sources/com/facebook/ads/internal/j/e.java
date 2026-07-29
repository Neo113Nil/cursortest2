package com.facebook.ads.internal.j;

import com.facebook.ads.internal.j.d;
import com.facebook.ads.internal.j.f;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes.dex */
public class e<T extends f, E extends d> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<E>, List<WeakReference<T>>> f5172a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Queue<E> f5173b = new ArrayDeque();

    private void a(List<WeakReference<T>> list) {
        if (list != null) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                WeakReference<T> weakReference = list.get(i2);
                if (weakReference.get() != null) {
                    list.set(i, weakReference);
                    i++;
                }
            }
            for (int size = list.size() - 1; size >= i; size--) {
                list.remove(size);
            }
        }
    }

    private void b(E e) {
        List<WeakReference<T>> list;
        if (this.f5172a == null || (list = this.f5172a.get(e.getClass())) == null) {
            return;
        }
        a(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            f fVar = (f) ((WeakReference) it.next()).get();
            if (fVar != null && fVar.b(e)) {
                fVar.a(e);
            }
        }
    }

    public synchronized void a(E e) {
        if (this.f5173b.isEmpty()) {
            this.f5173b.add(e);
            while (!this.f5173b.isEmpty()) {
                b((e<T, E>) this.f5173b.peek());
                this.f5173b.remove();
            }
        } else {
            this.f5173b.add(e);
        }
    }

    public synchronized void a(T... tArr) {
        if (tArr == null) {
            return;
        }
        for (T t : tArr) {
            a((e<T, E>) t);
        }
    }

    public synchronized boolean a(T t) {
        if (t == null) {
            return false;
        }
        Class<E> a2 = t.a();
        if (this.f5172a.get(a2) == null) {
            this.f5172a.put(a2, new ArrayList());
        }
        List<WeakReference<T>> list = this.f5172a.get(a2);
        a(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).get() == t) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t));
    }

    public synchronized void b(T... tArr) {
        if (tArr == null) {
            return;
        }
        for (T t : tArr) {
            b((e<T, E>) t);
        }
    }

    public synchronized boolean b(T t) {
        if (t == null) {
            return false;
        }
        List<WeakReference<T>> list = this.f5172a.get(t.a());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).get() == t) {
                list.get(i).clear();
                return true;
            }
        }
        return false;
    }
}
