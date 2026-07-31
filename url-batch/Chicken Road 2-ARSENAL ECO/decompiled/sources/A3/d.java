package A3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
import kotlin.jvm.internal.i;
import l5.AbstractC0501e;
import l5.C0512p;

/* loaded from: classes.dex */
public final class d extends AbstractC0501e implements RandomAccess, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final C0512p f50f;

    /* renamed from: g, reason: collision with root package name */
    public Object f51g;

    public d() {
        C0512p c0512p = C0512p.f5303f;
        this.f50f = c0512p;
        this.f51g = c0512p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // l5.AbstractC0501e
    public final int a() {
        return this.f51g.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        Object obj2 = this.f51g;
        C0512p c0512p = this.f50f;
        if (obj2 == c0512p) {
            this.f51g = new ArrayList(c0512p);
        }
        Object obj3 = this.f51g;
        i.c(obj3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        ((ArrayList) obj3).add(i7, obj);
    }

    @Override // l5.AbstractC0501e
    public final Object b(int i7) {
        Object obj = this.f51g;
        C0512p c0512p = this.f50f;
        if (obj == c0512p) {
            this.f51g = new ArrayList(c0512p);
        }
        Object obj2 = this.f51g;
        i.c(obj2, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) obj2).remove(i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.f51g.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Object obj2 = this.f51g;
        C0512p c0512p = this.f50f;
        if (obj2 == c0512p) {
            this.f51g = new ArrayList(c0512p);
        }
        Object obj3 = this.f51g;
        i.c(obj3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) obj3).set(i7, obj);
    }
}
