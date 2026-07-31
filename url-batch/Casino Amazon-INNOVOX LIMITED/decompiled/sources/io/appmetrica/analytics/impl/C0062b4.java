package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0062b4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1176a;
    public final C0140e5 b;
    public final HashMap c;
    public final C0451qa d;
    public final Context e;
    public final C0268j4 f;

    public C0062b4(Context context, C0140e5 c0140e5) {
        this(context, c0140e5, new C0268j4());
    }

    public final InterfaceC0191g4 a(Q3 q3, C0445q4 c0445q4) {
        InterfaceC0191g4 interfaceC0191g4;
        synchronized (this.f1176a) {
            interfaceC0191g4 = (InterfaceC0191g4) this.c.get(q3);
            if (interfaceC0191g4 == null) {
                this.f.getClass();
                interfaceC0191g4 = C0268j4.a(q3).a(this.e, this.b, q3, c0445q4);
                this.c.put(q3, interfaceC0191g4);
                this.d.a(new C0036a4(q3.b, q3.c, q3.d), q3);
            }
        }
        return interfaceC0191g4;
    }

    public C0062b4(Context context, C0140e5 c0140e5, C0268j4 c0268j4) {
        this.f1176a = new Object();
        this.c = new HashMap();
        this.d = new C0451qa();
        this.e = context.getApplicationContext();
        this.b = c0140e5;
        this.f = c0268j4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f1176a) {
            C0451qa c0451qa = this.d;
            Collection collection = (Collection) c0451qa.f1451a.remove(new C0036a4(str, num, str2));
            if (!mo.a(collection)) {
                collection.size();
                ArrayList arrayList = new ArrayList(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add((InterfaceC0191g4) this.c.remove((Q3) it.next()));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC0191g4) it2.next()).a();
                }
            }
        }
    }
}
