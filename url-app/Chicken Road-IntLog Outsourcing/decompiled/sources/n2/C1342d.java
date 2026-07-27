package n2;

import g4.AbstractC0460e;
import g4.C0471p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
import kotlin.jvm.internal.i;

/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342d extends AbstractC0460e implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final C0471p f11466a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11467b;

    public C1342d() {
        C0471p c0471p = C0471p.f5750a;
        this.f11466a = c0471p;
        this.f11467b = c0471p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        Object obj2 = this.f11467b;
        C0471p c0471p = this.f11466a;
        if (obj2 == c0471p) {
            this.f11467b = new ArrayList(c0471p);
        }
        Object obj3 = this.f11467b;
        i.c(obj3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        ((ArrayList) obj3).add(i2, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // g4.AbstractC0460e
    public final int c() {
        return this.f11467b.size();
    }

    @Override // g4.AbstractC0460e
    public final Object d(int i2) {
        Object obj = this.f11467b;
        C0471p c0471p = this.f11466a;
        if (obj == c0471p) {
            this.f11467b = new ArrayList(c0471p);
        }
        Object obj2 = this.f11467b;
        i.c(obj2, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) obj2).remove(i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.f11467b.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        Object obj2 = this.f11467b;
        C0471p c0471p = this.f11466a;
        if (obj2 == c0471p) {
            this.f11467b = new ArrayList(c0471p);
        }
        Object obj3 = this.f11467b;
        i.c(obj3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) obj3).set(i2, obj);
    }
}
