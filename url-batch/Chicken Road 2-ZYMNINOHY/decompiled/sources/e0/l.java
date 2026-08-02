package e0;

import T.C0097o;
import android.net.Uri;
import java.util.ArrayList;
import v2.I;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: f, reason: collision with root package name */
    public final j f8392f;

    /* renamed from: g, reason: collision with root package name */
    public final t f8393g;

    public l(C0097o c0097o, I i4, r rVar, ArrayList arrayList) {
        super(c0097o, i4, rVar, arrayList);
        Uri.parse(((C0392b) i4.get(0)).f8342a);
        long j4 = rVar.f8412e;
        j jVar = j4 <= 0 ? null : new j(rVar.f8411d, j4, null);
        this.f8392f = jVar;
        this.f8393g = jVar == null ? new t(new j(0L, -1L, null)) : null;
    }

    @Override // e0.m
    public final String b() {
        return null;
    }

    @Override // e0.m
    public final d0.i c() {
        return this.f8393g;
    }

    @Override // e0.m
    public final j d() {
        return this.f8392f;
    }
}
