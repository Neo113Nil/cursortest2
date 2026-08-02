package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475a4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11416a;

    /* renamed from: b, reason: collision with root package name */
    public final C0554d5 f11417b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11418c;

    /* renamed from: d, reason: collision with root package name */
    public final C0869pa f11419d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f11420e;

    /* renamed from: f, reason: collision with root package name */
    public final C0682i4 f11421f;

    public C0475a4(Context context, C0554d5 c0554d5) {
        this(context, c0554d5, new C0682i4());
    }

    public final InterfaceC0604f4 a(P3 p32, C0863p4 c0863p4) {
        InterfaceC0604f4 interfaceC0604f4;
        synchronized (this.f11416a) {
            try {
                interfaceC0604f4 = (InterfaceC0604f4) this.f11418c.get(p32);
                if (interfaceC0604f4 == null) {
                    this.f11421f.getClass();
                    interfaceC0604f4 = C0682i4.a(p32).a(this.f11420e, this.f11417b, p32, c0863p4);
                    this.f11418c.put(p32, interfaceC0604f4);
                    this.f11419d.a(new Z3(p32.f10790b, p32.f10791c, p32.f10792d), p32);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0604f4;
    }

    public C0475a4(Context context, C0554d5 c0554d5, C0682i4 c0682i4) {
        this.f11416a = new Object();
        this.f11418c = new HashMap();
        this.f11419d = new C0869pa();
        this.f11420e = context.getApplicationContext();
        this.f11417b = c0554d5;
        this.f11421f = c0682i4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f11416a) {
            try {
                C0869pa c0869pa = this.f11419d;
                Collection collection = (Collection) c0869pa.f12571a.remove(new Z3(str, num, str2));
                if (!AbstractC0779lo.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC0604f4) this.f11418c.remove((P3) it.next()));
                    }
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((InterfaceC0604f4) obj).a();
                    }
                }
            } finally {
            }
        }
    }
}
