package com.ironsource.b.e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ProviderSettingsHolder.java */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    private static p f6827b;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<o> f6828a = new ArrayList<>();

    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            if (f6827b == null) {
                f6827b = new p();
            }
            pVar = f6827b;
        }
        return pVar;
    }

    private p() {
    }

    public void a(o oVar) {
        if (oVar != null) {
            this.f6828a.add(oVar);
        }
    }

    public o a(String str) {
        Iterator<o> it = this.f6828a.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next.a().equals(str)) {
                return next;
            }
        }
        o oVar = new o(str);
        a(oVar);
        return oVar;
    }

    public boolean b(String str) {
        Iterator<o> it = this.f6828a.iterator();
        while (it.hasNext()) {
            if (it.next().a().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        Iterator<o> it = this.f6828a.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next.g() && !TextUtils.isEmpty(next.c())) {
                o a2 = a(next.c());
                next.b(com.ironsource.b.h.g.a(next.d(), a2.d()));
                next.a(com.ironsource.b.h.g.a(next.b(), a2.b()));
                next.c(com.ironsource.b.h.g.a(next.e(), a2.e()));
            }
        }
    }
}
