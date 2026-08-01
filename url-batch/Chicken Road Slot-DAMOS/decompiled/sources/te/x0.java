package te;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x0 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9462a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9463b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9464c;

    public x0(Object obj, String str) {
        obj.getClass();
        this.f9462a = obj;
        this.f9463b = kotlin.collections.j0.f5574d;
        this.f9464c = hd.h.a(hd.i.f4507d, new a4.a(12, str, this));
    }

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        obj.getClass();
        d().getClass();
        d().getClass();
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        d().getClass();
        int a9 = lVar.a(d());
        if (a9 == -1) {
            return this.f9462a;
        }
        throw new ee.h(v4.a.j(a9, "Unexpected index "));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hd.g, java.lang.Object] */
    @Override // pe.a
    public final re.e d() {
        return (re.e) this.f9464c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x0(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.f9463b = asList;
    }
}
