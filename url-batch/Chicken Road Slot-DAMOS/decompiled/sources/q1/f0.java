package q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 extends h0 implements Iterable, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final String f7856d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7857e;

    /* renamed from: i, reason: collision with root package name */
    public final float f7858i;

    /* renamed from: r, reason: collision with root package name */
    public final float f7859r;

    /* renamed from: s, reason: collision with root package name */
    public final float f7860s;

    /* renamed from: t, reason: collision with root package name */
    public final float f7861t;

    /* renamed from: u, reason: collision with root package name */
    public final float f7862u;

    /* renamed from: v, reason: collision with root package name */
    public final float f7863v;

    /* renamed from: w, reason: collision with root package name */
    public final List f7864w;

    /* renamed from: x, reason: collision with root package name */
    public final List f7865x;

    public f0(String str, float f3, float f10, float f11, float f12, float f13, float f14, float f15, List list, ArrayList arrayList) {
        this.f7856d = str;
        this.f7857e = f3;
        this.f7858i = f10;
        this.f7859r = f11;
        this.f7860s = f12;
        this.f7861t = f13;
        this.f7862u = f14;
        this.f7863v = f15;
        this.f7864w = list;
        this.f7865x = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof f0)) {
            f0 f0Var = (f0) obj;
            return Intrinsics.a(this.f7856d, f0Var.f7856d) && this.f7857e == f0Var.f7857e && this.f7858i == f0Var.f7858i && this.f7859r == f0Var.f7859r && this.f7860s == f0Var.f7860s && this.f7861t == f0Var.f7861t && this.f7862u == f0Var.f7862u && this.f7863v == f0Var.f7863v && Intrinsics.a(this.f7864w, f0Var.f7864w) && Intrinsics.a(this.f7865x, f0Var.f7865x);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7865x.hashCode() + ((this.f7864w.hashCode() + n0.l.b(this.f7863v, n0.l.b(this.f7862u, n0.l.b(this.f7861t, n0.l.b(this.f7860s, n0.l.b(this.f7859r, n0.l.b(this.f7858i, n0.l.b(this.f7857e, this.f7856d.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kotlin.collections.h(this);
    }
}
