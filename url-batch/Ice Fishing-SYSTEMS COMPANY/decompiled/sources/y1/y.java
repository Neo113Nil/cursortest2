package y1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final C5221A f41873e = new C5221A(10);

    /* renamed from: f, reason: collision with root package name */
    public static final C5222B f41874f = new C5222B(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f41875a;

    /* renamed from: b, reason: collision with root package name */
    public final C5221A f41876b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f41877c;

    /* renamed from: d, reason: collision with root package name */
    public final Y2.e f41878d;

    public y(Y2.e eVar) {
        C5221A c5221a = f41873e;
        this.f41875a = new ArrayList();
        this.f41877c = new HashSet();
        this.f41878d = eVar;
        this.f41876b = c5221a;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f41875a.iterator();
            while (it.hasNext()) {
                x xVar = (x) it.next();
                if (!this.f41877c.contains(xVar) && xVar.f41870a.isAssignableFrom(cls)) {
                    this.f41877c.add(xVar);
                    arrayList.add(xVar.f41872c.i(this));
                    this.f41877c.remove(xVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized InterfaceC5244s b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f41875a.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                x xVar = (x) it.next();
                if (this.f41877c.contains(xVar)) {
                    z8 = true;
                } else if (xVar.f41870a.isAssignableFrom(cls) && xVar.f41871b.isAssignableFrom(cls2)) {
                    this.f41877c.add(xVar);
                    arrayList.add(xVar.f41872c.i(this));
                    this.f41877c.remove(xVar);
                }
            }
            if (arrayList.size() > 1) {
                C5221A c5221a = this.f41876b;
                Y2.e eVar = this.f41878d;
                c5221a.getClass();
                return new C5227b(2, arrayList, eVar);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC5244s) arrayList.get(0);
            }
            if (z8) {
                return f41874f;
            }
            throw new com.bumptech.glide.k("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f41877c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f41875a.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (!arrayList.contains(xVar.f41871b) && xVar.f41870a.isAssignableFrom(cls)) {
                arrayList.add(xVar.f41871b);
            }
        }
        return arrayList;
    }
}
