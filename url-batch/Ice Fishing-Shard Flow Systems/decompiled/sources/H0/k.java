package H0;

import G0.s;
import G0.u;
import G0.y;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends O6.g {

    /* renamed from: h, reason: collision with root package name */
    public static final String f903h = s.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final p f904a;

    /* renamed from: b, reason: collision with root package name */
    public final String f905b;

    /* renamed from: c, reason: collision with root package name */
    public final List f906c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f907d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f908e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f909f;

    /* renamed from: g, reason: collision with root package name */
    public P0.c f910g;

    public k(p pVar, String str, List list) {
        this.f904a = pVar;
        this.f905b = str;
        this.f906c = list;
        this.f907d = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            String uuid = ((u) list.get(i2)).f832a.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            this.f907d.add(uuid);
            this.f908e.add(uuid);
        }
    }

    public static HashSet e0(k kVar) {
        HashSet hashSet = new HashSet();
        kVar.getClass();
        return hashSet;
    }

    public final y d0() {
        if (this.f909f) {
            s.d().g(f903h, "Already enqueued work ids (" + TextUtils.join(", ", this.f907d) + ")");
        } else {
            Q0.d dVar = new Q0.d(this);
            this.f904a.f921d.r(dVar);
            this.f910g = dVar.f2299e;
        }
        return this.f910g;
    }
}
