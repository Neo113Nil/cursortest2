package com.baidu.ar;

import com.baidu.ar.databasic.AlgoHandleAdapter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class f0 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList<e3> f2180a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public e3 f2181b;

    /* renamed from: c, reason: collision with root package name */
    public e3 f2182c;

    /* renamed from: d, reason: collision with root package name */
    public kb f2183d;

    public class a implements e3 {
        public a() {
        }

        @Override // com.baidu.ar.e3
        public void a(b3 b3Var) {
            if (f0.this.f2180a != null && f0.this.f2180a.size() > 0) {
                Iterator it = f0.this.f2180a.iterator();
                while (it.hasNext()) {
                    e3 e3Var = (e3) it.next();
                    if (b3Var.b() > 0) {
                        AlgoHandleAdapter.increaseHandleReference(b3Var.b());
                    }
                    e3Var.a(b3Var);
                }
            }
            if (f0.this.f2182c != null) {
                f0.this.f2182c.a(b3Var);
            }
        }

        @Override // com.baidu.ar.e3
        public void b(kb kbVar) {
            if (f0.this.f2182c != null) {
                f0.this.f2182c.b(kbVar);
            }
            if (f0.this.f2180a == null || f0.this.f2180a.size() <= 0) {
                return;
            }
            Iterator it = f0.this.f2180a.iterator();
            while (it.hasNext()) {
                ((e3) it.next()).b(kbVar);
            }
        }

        @Override // com.baidu.ar.e3
        public void a(kb kbVar) {
            f0.this.f2183d = kbVar;
            if (f0.this.f2182c != null) {
                f0.this.f2182c.a(kbVar);
            }
            if (f0.this.f2180a == null || f0.this.f2180a.size() <= 0) {
                return;
            }
            Iterator it = f0.this.f2180a.iterator();
            while (it.hasNext()) {
                ((e3) it.next()).a(kbVar);
            }
        }
    }

    public void c(e3 e3Var) {
        CopyOnWriteArrayList<e3> copyOnWriteArrayList = this.f2180a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(e3Var);
        }
    }

    public void d(e3 e3Var) {
        this.f2182c = e3Var;
    }

    @Override // com.baidu.ar.t5
    public void release() {
        CopyOnWriteArrayList<e3> copyOnWriteArrayList = this.f2180a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f2180a = null;
        }
    }

    public void b(e3 e3Var) {
        CopyOnWriteArrayList<e3> copyOnWriteArrayList = this.f2180a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(e3Var);
            kb kbVar = this.f2183d;
            if (kbVar != null) {
                e3Var.a(kbVar);
            }
        }
    }

    @Override // com.baidu.ar.t5
    public void a(e3 e3Var) {
        this.f2182c = e3Var;
        this.f2181b = new a();
    }

    public boolean a() {
        CopyOnWriteArrayList<e3> copyOnWriteArrayList = this.f2180a;
        return copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0;
    }
}
