package m0;

import a1.AbstractC0223a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l0.r;
import l0.v;
import u0.C0689s;

/* loaded from: classes.dex */
public final class k extends AbstractC0223a {

    /* renamed from: j, reason: collision with root package name */
    public static final String f5359j = l0.q.f("WorkContinuationImpl");

    /* renamed from: c, reason: collision with root package name */
    public final o f5360c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5361d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5362e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5363f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5364g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f5365h;

    /* renamed from: i, reason: collision with root package name */
    public C0689s f5366i;

    public k(o oVar, String str, List list) {
        this.f5360c = oVar;
        this.f5361d = str;
        this.f5362e = list;
        this.f5363f = new ArrayList(list.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            String uuid = ((r) list.get(i7)).f5284a.toString();
            kotlin.jvm.internal.i.d(uuid, "id.toString()");
            this.f5363f.add(uuid);
            this.f5364g.add(uuid);
        }
    }

    public static HashSet I(k kVar) {
        HashSet hashSet = new HashSet();
        kVar.getClass();
        return hashSet;
    }

    public final v H() {
        if (this.f5365h) {
            l0.q.d().g(f5359j, "Already enqueued work ids (" + TextUtils.join(", ", this.f5363f) + ")");
        } else {
            v0.c cVar = new v0.c(this);
            this.f5360c.f5376d.a(cVar);
            this.f5366i = cVar.f6059g;
        }
        return this.f5366i;
    }
}
