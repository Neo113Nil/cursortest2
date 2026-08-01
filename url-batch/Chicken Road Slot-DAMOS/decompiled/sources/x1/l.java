package x1;

import java.util.ArrayList;
import kotlin.collections.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f10276a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10277b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10278c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10279d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10280e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10281f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10282h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10283i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final float f10284k;

    /* renamed from: l, reason: collision with root package name */
    public final long f10285l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f10286m;

    /* renamed from: n, reason: collision with root package name */
    public final long f10287n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10288o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10289p = false;

    /* renamed from: q, reason: collision with root package name */
    public l f10290q;

    public l(long j, long j3, long j10, boolean z10, float f3, long j11, long j12, boolean z11, int i3, ArrayList arrayList, long j13, float f10, long j14, long j15) {
        this.f10276a = j;
        this.f10277b = j3;
        this.f10278c = j10;
        this.f10279d = z10;
        this.f10280e = f3;
        this.f10281f = j11;
        this.g = j12;
        this.f10282h = z11;
        this.f10283i = i3;
        this.j = j13;
        this.f10284k = f10;
        this.f10285l = j14;
        this.f10287n = 0L;
        this.f10286m = arrayList;
        this.f10287n = j15;
    }

    public final void a() {
        l lVar = this.f10290q;
        if (lVar == null) {
            this.f10288o = true;
            this.f10289p = true;
        } else if (lVar != null) {
            lVar.a();
        }
    }

    public final boolean b() {
        l lVar = this.f10290q;
        return lVar != null ? lVar.b() : this.f10288o || this.f10289p;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) cf.c.N(this.f10276a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f10277b);
        sb2.append(", position=");
        sb2.append((Object) j1.b.e(this.f10278c));
        sb2.append(", pressed=");
        sb2.append(this.f10279d);
        sb2.append(", pressure=");
        sb2.append(this.f10280e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f10281f);
        sb2.append(", previousPosition=");
        sb2.append((Object) j1.b.e(this.g));
        sb2.append(", previousPressed=");
        sb2.append(this.f10282h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        int i3 = this.f10283i;
        sb2.append((Object) (i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", historical=");
        Object obj = this.f10286m;
        if (obj == null) {
            obj = j0.f5574d;
        }
        sb2.append(obj);
        sb2.append(", scrollDelta=");
        sb2.append((Object) j1.b.e(this.j));
        sb2.append(", scaleFactor=");
        sb2.append(this.f10284k);
        sb2.append(", panOffset=");
        sb2.append((Object) j1.b.e(this.f10285l));
        sb2.append(')');
        return sb2.toString();
    }
}
