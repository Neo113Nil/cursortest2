package u5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import t5.p;
import t5.t;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final String f9637h = t5.o.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final m f9638a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9639b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9640c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9641d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9642e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f9643f;
    public c6.c g;

    public j(m mVar, String str, List list) {
        this.f9638a = mVar;
        this.f9639b = str;
        this.f9640c = list;
        this.f9641d = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            String uuid = ((p) list.get(i3)).f9315a.toString();
            uuid.getClass();
            this.f9641d.add(uuid);
            this.f9642e.add(uuid);
        }
    }

    public static HashSet b(j jVar) {
        HashSet hashSet = new HashSet();
        jVar.getClass();
        return hashSet;
    }

    public final t a() {
        if (this.f9643f) {
            t5.o.d().g(f9637h, "Already enqueued work ids (" + TextUtils.join(", ", this.f9641d) + ")");
        } else {
            d6.c cVar = new d6.c(this);
            this.f9638a.f9652d.a(cVar);
            this.g = cVar.f3626e;
        }
        return this.g;
    }
}
