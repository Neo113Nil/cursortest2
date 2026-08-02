package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560i4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7497a;

    /* renamed from: b, reason: collision with root package name */
    public final C0612k5 f7498b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7499c;

    /* renamed from: d, reason: collision with root package name */
    public final C0928wa f7500d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f7501e;
    public final C0741p4 f;

    public C0560i4(Context context, C0612k5 c0612k5) {
        this(context, c0612k5, new C0741p4());
    }

    public final InterfaceC0663m4 a(X3 x3, C0922w4 c0922w4) {
        InterfaceC0663m4 interfaceC0663m4;
        synchronized (this.f7497a) {
            try {
                interfaceC0663m4 = (InterfaceC0663m4) this.f7499c.get(x3);
                if (interfaceC0663m4 == null) {
                    this.f.getClass();
                    interfaceC0663m4 = C0741p4.a(x3).a(this.f7501e, this.f7498b, x3, c0922w4);
                    this.f7499c.put(x3, interfaceC0663m4);
                    this.f7500d.a(new C0534h4(x3.f6856b, x3.f6857c, x3.f6858d), x3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0663m4;
    }

    public C0560i4(Context context, C0612k5 c0612k5, C0741p4 c0741p4) {
        this.f7497a = new Object();
        this.f7499c = new HashMap();
        this.f7500d = new C0928wa();
        this.f7501e = context.getApplicationContext();
        this.f7498b = c0612k5;
        this.f = c0741p4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f7497a) {
            try {
                C0928wa c0928wa = this.f7500d;
                Collection collection = (Collection) c0928wa.f8560a.remove(new C0534h4(str, num, str2));
                if (!AbstractC0709no.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC0663m4) this.f7499c.remove((X3) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC0663m4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
