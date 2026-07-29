package com.facebook.internal;

import android.app.Activity;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: FacebookDialogBase.java */
/* loaded from: classes.dex */
public abstract class i<CONTENT, RESULT> {

    /* renamed from: a, reason: collision with root package name */
    protected static final Object f6115a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Activity f6116b;

    /* renamed from: c, reason: collision with root package name */
    private final m f6117c;

    /* renamed from: d, reason: collision with root package name */
    private List<i<CONTENT, RESULT>.a> f6118d;
    private int e;

    protected abstract void a(e eVar, com.facebook.h<RESULT> hVar);

    protected abstract List<i<CONTENT, RESULT>.a> c();

    protected abstract com.facebook.internal.a d();

    protected i(Activity activity, int i) {
        ac.a(activity, "activity");
        this.f6116b = activity;
        this.f6117c = null;
        this.e = i;
    }

    protected i(m mVar, int i) {
        ac.a(mVar, "fragmentWrapper");
        this.f6117c = mVar;
        this.f6116b = null;
        this.e = i;
        if (mVar.c() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }

    public final void a(com.facebook.e eVar, com.facebook.h<RESULT> hVar) {
        if (!(eVar instanceof e)) {
            throw new com.facebook.j("Unexpected CallbackManager, please use the provided Factory.");
        }
        a((e) eVar, (com.facebook.h) hVar);
    }

    public int a() {
        return this.e;
    }

    public boolean a(CONTENT content) {
        return a((i<CONTENT, RESULT>) content, f6115a);
    }

    protected boolean a(CONTENT content, Object obj) {
        boolean z = obj == f6115a;
        for (i<CONTENT, RESULT>.a aVar : e()) {
            if (z || ab.a(aVar.a(), obj)) {
                if (aVar.a(content, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b(CONTENT content) {
        b(content, f6115a);
    }

    protected void b(CONTENT content, Object obj) {
        com.facebook.internal.a c2 = c(content, obj);
        if (c2 != null) {
            if (this.f6117c != null) {
                h.a(c2, this.f6117c);
                return;
            } else {
                h.a(c2, this.f6116b);
                return;
            }
        }
        Log.e("FacebookDialog", "No code path should ever result in a null appCall");
        if (com.facebook.l.b()) {
            throw new IllegalStateException("No code path should ever result in a null appCall");
        }
    }

    protected Activity b() {
        if (this.f6116b != null) {
            return this.f6116b;
        }
        if (this.f6117c != null) {
            return this.f6117c.c();
        }
        return null;
    }

    private com.facebook.internal.a c(CONTENT content, Object obj) {
        boolean z = obj == f6115a;
        com.facebook.internal.a aVar = null;
        Iterator<i<CONTENT, RESULT>.a> it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i<CONTENT, RESULT>.a next = it.next();
            if (z || ab.a(next.a(), obj)) {
                if (next.a(content, true)) {
                    try {
                        aVar = next.a(content);
                        break;
                    } catch (com.facebook.j e) {
                        aVar = d();
                        h.a(aVar, e);
                    }
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        com.facebook.internal.a d2 = d();
        h.a(d2);
        return d2;
    }

    private List<i<CONTENT, RESULT>.a> e() {
        if (this.f6118d == null) {
            this.f6118d = c();
        }
        return this.f6118d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: FacebookDialogBase.java */
    public abstract class a {
        public abstract com.facebook.internal.a a(CONTENT content);

        public abstract boolean a(CONTENT content, boolean z);

        protected a() {
        }

        public Object a() {
            return i.f6115a;
        }
    }
}
