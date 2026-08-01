package x0;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.i0;
import wd.c0;
import wd.d0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function2, wd.l, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f10215d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f10216e;

    /* renamed from: i, reason: collision with root package name */
    public final String f10217i;

    /* renamed from: r, reason: collision with root package name */
    public final String f10218r;

    /* renamed from: t, reason: collision with root package name */
    public final int f10220t;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f10219s = false;

    /* renamed from: u, reason: collision with root package name */
    public final int f10221u = 4;

    public c(int i3, Class cls, Object obj, String str, String str2) {
        this.f10215d = obj;
        this.f10216e = cls;
        this.f10217i = str;
        this.f10218r = str2;
        this.f10220t = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10219s == cVar.f10219s && this.f10220t == cVar.f10220t && this.f10221u == cVar.f10221u && this.f10215d.equals(cVar.f10215d) && this.f10216e.equals(cVar.f10216e) && this.f10217i.equals(cVar.f10217i) && this.f10218r.equals(cVar.f10218r);
    }

    @Override // wd.l
    public final int getArity() {
        return this.f10220t;
    }

    public final int hashCode() {
        return ((((((this.f10218r.hashCode() + ((this.f10217i.hashCode() + ((this.f10216e.hashCode() + (this.f10215d.hashCode() * 31)) * 31)) * 31)) * 31) + (this.f10219s ? 1231 : 1237)) * 31) + this.f10220t) * 31) + this.f10221u;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        ((d) this.f10215d).b(intValue, (i0) obj);
        return Unit.f5554a;
    }

    public final String toString() {
        c0.f10143a.getClass();
        return d0.a(this);
    }
}
