package com.c.a;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ObjectAnimator.java */
/* loaded from: classes.dex */
public final class g extends k {
    private static final Map<String, com.c.b.c> h = new HashMap();
    private Object i;
    private String j;
    private com.c.b.c k;

    static {
        h.put("alpha", h.f3534a);
        h.put("pivotX", h.f3535b);
        h.put("pivotY", h.f3536c);
        h.put("translationX", h.f3537d);
        h.put("translationY", h.e);
        h.put("rotation", h.f);
        h.put("rotationX", h.g);
        h.put("rotationY", h.h);
        h.put("scaleX", h.i);
        h.put("scaleY", h.j);
        h.put("scrollX", h.k);
        h.put("scrollY", h.l);
        h.put("x", h.m);
        h.put("y", h.n);
    }

    public void a(com.c.b.c cVar) {
        if (this.f != null) {
            i iVar = this.f[0];
            String c2 = iVar.c();
            iVar.a(cVar);
            this.g.remove(c2);
            this.g.put(this.j, iVar);
        }
        if (this.k != null) {
            this.j = cVar.a();
        }
        this.k = cVar;
        this.e = false;
    }

    public static g a(Object obj, i... iVarArr) {
        g gVar = new g();
        gVar.i = obj;
        gVar.a(iVarArr);
        return gVar;
    }

    @Override // com.c.a.k, com.c.a.a
    public void a() {
        super.a();
    }

    @Override // com.c.a.k
    void d() {
        if (this.e) {
            return;
        }
        if (this.k == null && com.c.c.a.a.f3547a && (this.i instanceof View) && h.containsKey(this.j)) {
            a(h.get(this.j));
        }
        int length = this.f.length;
        for (int i = 0; i < length; i++) {
            this.f[i].a(this.i);
        }
        super.d();
    }

    @Override // com.c.a.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public g b(long j) {
        super.b(j);
        return this;
    }

    @Override // com.c.a.k
    void a(float f) {
        super.a(f);
        int length = this.f.length;
        for (int i = 0; i < length; i++) {
            this.f[i].b(this.i);
        }
    }

    @Override // com.c.a.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public g clone() {
        return (g) super.clone();
    }

    @Override // com.c.a.k
    public String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.i;
        if (this.f != null) {
            for (int i = 0; i < this.f.length; i++) {
                str = str + "\n    " + this.f[i].toString();
            }
        }
        return str;
    }
}
