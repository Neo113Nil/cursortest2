package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3056w4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f40001a;

    /* renamed from: b, reason: collision with root package name */
    public final C3109y5 f40002b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f40003c;

    /* renamed from: d, reason: collision with root package name */
    public final Ka f40004d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f40005e;

    /* renamed from: f, reason: collision with root package name */
    public final D4 f40006f;

    public C3056w4(Context context, C3109y5 c3109y5) {
        this(context, c3109y5, new D4());
    }

    public final A4 a(C2771l4 c2771l4, K4 k4) {
        A4 a4;
        synchronized (this.f40001a) {
            try {
                a4 = (A4) this.f40003c.get(c2771l4);
                if (a4 == null) {
                    this.f40006f.getClass();
                    a4 = D4.a(c2771l4).a(this.f40005e, this.f40002b, c2771l4, k4);
                    this.f40003c.put(c2771l4, a4);
                    this.f40004d.a(new C3030v4(c2771l4.f39370b, c2771l4.f39371c, c2771l4.f39372d), c2771l4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a4;
    }

    public C3056w4(Context context, C3109y5 c3109y5, D4 d4) {
        this.f40001a = new Object();
        this.f40003c = new HashMap();
        this.f40004d = new Ka();
        this.f40005e = context.getApplicationContext();
        this.f40002b = c3109y5;
        this.f40006f = d4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f40001a) {
            try {
                Ka ka = this.f40004d;
                Collection collection = (Collection) ka.f37877a.remove(new C3030v4(str, num, str2));
                if (!AbstractC2713io.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((A4) this.f40003c.remove((C2771l4) it.next()));
                    }
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((A4) obj).a();
                    }
                }
            } finally {
            }
        }
    }
}
