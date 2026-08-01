package de;

import hd.u;
import java.util.Iterator;
import te.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m implements Iterable, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3721d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3722e;

    public /* synthetic */ m(int i3, Object obj) {
        this.f3721d = i3;
        this.f3722e = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3721d) {
            case 0:
                return new kotlin.text.b((kotlin.text.c) this.f3722e);
            case 1:
                Object[] objArr = (Object[]) ((a1.b) this.f3722e).f7e;
                objArr.getClass();
                return new u(new u(objArr));
            default:
                return new u((w) this.f3722e);
        }
    }
}
