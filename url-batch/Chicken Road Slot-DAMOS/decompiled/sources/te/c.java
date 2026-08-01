package te;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9342b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f9343c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pe.a aVar, int i3) {
        super(aVar);
        this.f9342b = i3;
        aVar.getClass();
        switch (i3) {
            case 1:
                super(aVar);
                re.e d10 = aVar.d();
                d10.getClass();
                this.f9343c = new b(d10, 2);
                break;
            case 2:
                super(aVar);
                re.e d11 = aVar.d();
                d11.getClass();
                this.f9343c = new b(d11, 3);
                break;
            default:
                re.e d12 = aVar.d();
                d12.getClass();
                this.f9343c = new b(d12, 1);
                break;
        }
    }

    @Override // pe.a
    public final re.e d() {
        switch (this.f9342b) {
        }
        return (b) this.f9343c;
    }

    @Override // te.a
    public final Object e() {
        switch (this.f9342b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // te.a
    public final int f(Object obj) {
        switch (this.f9342b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // te.a
    public final Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // te.a
    public final int h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // te.a
    public final Object k(Object obj) {
        switch (this.f9342b) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // te.a
    public final Object l(Object obj) {
        switch (this.f9342b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // te.q
    public final void m(int i3, Object obj, Object obj2) {
        switch (this.f9342b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i3, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }
}
