package b8;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f1443i;

    public t(u uVar) {
        this.f1443i = uVar;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        u uVar = this.f1443i;
        i7.a.v(i3, uVar.f1446t);
        Object[] objArr = uVar.f1445s;
        int i10 = i3 * 2;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // b8.b
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1443i.f1446t;
    }
}
