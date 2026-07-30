package com.crrepa.p;

import com.crrepa.ble.util.BleLog;
import com.crrepa.f.k;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList<a> f13600a = new LinkedList<>();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedList<a> f13601b = new LinkedList<>();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList<a> f13602c = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f13603d = false;

    /* renamed from: e, reason: collision with root package name */
    private a f13604e;

    public void a() {
        this.f13600a.clear();
        this.f13601b.clear();
        this.f13602c.clear();
        this.f13604e = null;
    }

    public synchronized void b() {
        if (this.f13600a.isEmpty() && this.f13601b.isEmpty()) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<a> it = this.f13600a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (k.a(next.a())) {
                linkedList.add(next);
            }
        }
        BleLog.d("clearChatQueue size1: " + linkedList.size());
        if (!linkedList.isEmpty()) {
            this.f13600a.removeAll(linkedList);
        }
        linkedList.clear();
        Iterator<a> it2 = this.f13601b.iterator();
        while (it2.hasNext()) {
            a next2 = it2.next();
            if (k.a(next2.a())) {
                linkedList.add(next2);
            }
        }
        BleLog.d("clearChatQueue size2: " + linkedList.size());
        if (!linkedList.isEmpty()) {
            this.f13601b.removeAll(linkedList);
        }
    }

    public synchronized void c() {
        this.f13602c.clear();
    }

    public synchronized a d() {
        a aVar;
        a removeFirst;
        try {
            aVar = null;
            if (!this.f13603d) {
                a aVar2 = this.f13604e;
                if (aVar2 != null) {
                    a aVar3 = new a(aVar2.b(), this.f13604e.a());
                    this.f13604e = null;
                    aVar = aVar3;
                } else {
                    if (!this.f13602c.isEmpty()) {
                        removeFirst = this.f13602c.removeFirst();
                    } else if (!this.f13601b.isEmpty()) {
                        removeFirst = this.f13601b.removeFirst();
                    } else if (!this.f13600a.isEmpty()) {
                        removeFirst = this.f13600a.removeFirst();
                    }
                    aVar = removeFirst;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    public boolean e() {
        return (this.f13604e == null && this.f13600a.isEmpty() && this.f13601b.isEmpty() && this.f13602c.isEmpty()) ? false : true;
    }

    public synchronized void a(a aVar) {
        LinkedList<a> linkedList;
        try {
            int b8 = aVar.b();
            if (b8 == 39) {
                linkedList = this.f13602c;
            } else if (b8 != 64) {
                linkedList = aVar.c() ? this.f13601b : this.f13600a;
            } else {
                this.f13604e = aVar;
            }
            linkedList.add(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(boolean z7) {
        this.f13603d = z7;
    }
}
