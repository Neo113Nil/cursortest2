package K0;

import J0.s;
import J0.t;
import J0.x;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends Z5.c {

    /* renamed from: h, reason: collision with root package name */
    public static final String f1515h = s.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final p f1516a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1517b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1518c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1519d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1520e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1521f;

    /* renamed from: g, reason: collision with root package name */
    public S0.e f1522g;

    public k(p pVar, String str, List list) {
        this.f1516a = pVar;
        this.f1517b = str;
        this.f1518c = list;
        this.f1519d = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String uuid = ((t) list.get(i)).f1331a.toString();
            kotlin.jvm.internal.h.d(uuid, "id.toString()");
            this.f1519d.add(uuid);
            this.f1520e.add(uuid);
        }
    }

    public static HashSet s(k kVar) {
        HashSet hashSet = new HashSet();
        kVar.getClass();
        return hashSet;
    }

    public final x r() {
        if (this.f1521f) {
            s.d().g(f1515h, "Already enqueued work ids (" + TextUtils.join(", ", this.f1519d) + ")");
        } else {
            T0.d dVar = new T0.d(this);
            this.f1516a.f1533d.i(dVar);
            this.f1522g = dVar.f3041u;
        }
        return this.f1522g;
    }
}
