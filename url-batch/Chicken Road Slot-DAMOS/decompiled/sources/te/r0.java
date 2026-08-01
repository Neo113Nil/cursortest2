package te;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r0 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public final pe.a f9430a;

    /* renamed from: b, reason: collision with root package name */
    public final pe.a f9431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9432c;

    /* renamed from: d, reason: collision with root package name */
    public final re.f f9433d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(final pe.a aVar, final pe.a aVar2, int i3) {
        this(aVar, aVar2, (byte) 0);
        this.f9432c = i3;
        switch (i3) {
            case 1:
                this(aVar, aVar2, (byte) 0);
                final int i10 = 1;
                this.f9433d = g8.b.q("kotlin.Pair", new re.e[0], new Function1() { // from class: te.p0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        re.a aVar3 = (re.a) obj;
                        switch (i10) {
                            case 0:
                                aVar3.getClass();
                                re.a.a(aVar3, "key", aVar.d());
                                re.a.a(aVar3, "value", aVar2.d());
                                break;
                            default:
                                aVar3.getClass();
                                re.a.a(aVar3, "first", aVar.d());
                                re.a.a(aVar3, "second", aVar2.d());
                                break;
                        }
                        return Unit.f5554a;
                    }
                });
                break;
            default:
                final int i11 = 0;
                this.f9433d = g8.b.r("kotlin.collections.Map.Entry", re.h.f8255i, new re.e[0], new Function1() { // from class: te.p0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        re.a aVar3 = (re.a) obj;
                        switch (i11) {
                            case 0:
                                aVar3.getClass();
                                re.a.a(aVar3, "key", aVar.d());
                                re.a.a(aVar3, "value", aVar2.d());
                                break;
                            default:
                                aVar3.getClass();
                                re.a.a(aVar3, "first", aVar.d());
                                re.a.a(aVar3, "second", aVar2.d());
                                break;
                        }
                        return Unit.f5554a;
                    }
                });
                break;
        }
    }

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        Object key;
        Object value;
        d().getClass();
        re.e d10 = d();
        switch (this.f9432c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                key = pair.f5552d;
                break;
        }
        oVar.k(d10, 0, this.f9430a, key);
        re.e d11 = d();
        switch (this.f9432c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                value = pair2.f5553e;
                break;
        }
        oVar.k(d11, 1, this.f9431b, value);
        d().getClass();
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        d().getClass();
        Object obj = b1.f9340c;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int a9 = lVar.a(d());
            if (a9 == -1) {
                if (obj2 == obj) {
                    throw new ee.h("Element 'key' is missing");
                }
                if (obj3 == obj) {
                    throw new ee.h("Element 'value' is missing");
                }
                switch (this.f9432c) {
                    case 0:
                        return new q0(obj2, obj3);
                    default:
                        return new Pair(obj2, obj3);
                }
            }
            if (a9 == 0) {
                obj2 = y6.l.d(lVar, d(), 0, this.f9430a);
            } else {
                if (a9 != 1) {
                    throw new ee.h(v4.a.j(a9, "Invalid index: "));
                }
                obj3 = y6.l.d(lVar, d(), 1, this.f9431b);
            }
        }
    }

    @Override // pe.a
    public final re.e d() {
        switch (this.f9432c) {
        }
        return this.f9433d;
    }

    public r0(pe.a aVar, pe.a aVar2, byte b10) {
        this.f9430a = aVar;
        this.f9431b = aVar2;
    }
}
