package q7;

import d6.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p7.p;
import p7.s;
import p7.v;
import r6.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f7563a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7564b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7565c;

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, d6.b bVar, j6.a aVar) {
        i iVar;
        int i7;
        byte g9;
        LinkedHashMap linkedHashMap;
        j5.a aVar2;
        LinkedHashMap linkedHashMap2;
        j jVar2;
        byte b9;
        j5.a aVar3 = (j5.a) jVar.f7565c;
        if (aVar instanceof i) {
            iVar = (i) aVar;
            int i8 = iVar.f7562l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.f7562l = i8 - Integer.MIN_VALUE;
                Object obj = iVar.f7560j;
                i7 = iVar.f7562l;
                if (i7 != 0) {
                    d6.a.e(obj);
                    g9 = aVar3.g((byte) 6);
                    if (aVar3.y() == 4) {
                        j5.a.o(aVar3, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = iVar.f7559i;
                    linkedHashMap2 = iVar.f7558h;
                    jVar2 = iVar.f7557g;
                    d6.b bVar2 = iVar.f7556f;
                    d6.a.e(obj);
                    linkedHashMap2.put(str, (p7.k) obj);
                    b9 = ((j5.a) jVar2.f7565c).f();
                    if (b9 != 4) {
                        if (b9 != 7) {
                            j5.a.o((j5.a) jVar2.f7565c, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        j5.a aVar4 = (j5.a) jVar2.f7565c;
                        if (b9 != 6) {
                            aVar4.g((byte) 7);
                        } else if (b9 == 4) {
                            f.e(aVar4, "object");
                            throw null;
                        }
                        return new v(linkedHashMap2);
                    }
                    g9 = b9;
                    jVar = jVar2;
                    linkedHashMap = linkedHashMap2;
                    bVar = bVar2;
                }
                aVar2 = (j5.a) jVar.f7565c;
                if (aVar2.b()) {
                    linkedHashMap2 = linkedHashMap;
                    jVar2 = jVar;
                    b9 = g9;
                    j5.a aVar42 = (j5.a) jVar2.f7565c;
                    if (b9 != 6) {
                    }
                    return new v(linkedHashMap2);
                }
                String k8 = jVar.f7564b ? aVar2.k() : aVar2.j();
                aVar2.g((byte) 5);
                iVar.f7556f = bVar;
                iVar.f7557g = jVar;
                iVar.f7558h = linkedHashMap;
                iVar.f7559i = k8;
                iVar.f7562l = 1;
                bVar.getClass();
                bVar.f2609g = iVar;
                return i6.a.f4956f;
            }
        }
        iVar = new i(jVar, aVar);
        Object obj2 = iVar.f7560j;
        i7 = iVar.f7562l;
        if (i7 != 0) {
        }
        aVar2 = (j5.a) jVar.f7565c;
        if (aVar2.b()) {
        }
    }

    public p7.k b() {
        p7.k vVar;
        Object obj;
        j5.a aVar = (j5.a) this.f7565c;
        byte y4 = aVar.y();
        if (y4 == 1) {
            return d(true);
        }
        if (y4 == 0) {
            return d(false);
        }
        if (y4 != 6) {
            if (y4 == 8) {
                return c();
            }
            j5.a.o(aVar, "Cannot read Json element because of unexpected ".concat(f.h(y4)), 0, null, 6);
            throw null;
        }
        int i7 = this.f7563a + 1;
        this.f7563a = i7;
        if (i7 == 200) {
            h hVar = new h(this, null);
            d6.b bVar = new d6.b();
            bVar.f2608f = hVar;
            bVar.f2609g = bVar;
            i6.a aVar2 = d6.a.f2605a;
            bVar.f2610h = aVar2;
            while (true) {
                obj = bVar.f2610h;
                h6.d dVar = bVar.f2609g;
                if (dVar == null) {
                    break;
                }
                if (r6.k.a(aVar2, obj)) {
                    try {
                        h hVar2 = bVar.f2608f;
                        y.d(3, hVar2);
                        h hVar3 = new h(hVar2.f7555i, dVar);
                        hVar3.f7554h = bVar;
                        Object invokeSuspend = hVar3.invokeSuspend(z.f2639a);
                        if (invokeSuspend != i6.a.f4956f) {
                            dVar.resumeWith(invokeSuspend);
                        }
                    } catch (Throwable th) {
                        dVar.resumeWith(d6.a.b(th));
                    }
                } else {
                    bVar.f2610h = aVar2;
                    dVar.resumeWith(obj);
                }
            }
            d6.a.e(obj);
            vVar = (p7.k) obj;
        } else {
            byte g9 = aVar.g((byte) 6);
            if (aVar.y() == 4) {
                j5.a.o(aVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!aVar.b()) {
                    break;
                }
                String k8 = this.f7564b ? aVar.k() : aVar.j();
                aVar.g((byte) 5);
                linkedHashMap.put(k8, b());
                g9 = aVar.f();
                if (g9 != 4) {
                    if (g9 != 7) {
                        j5.a.o(aVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (g9 == 6) {
                aVar.g((byte) 7);
            } else if (g9 == 4) {
                f.e(aVar, "object");
                throw null;
            }
            vVar = new v(linkedHashMap);
        }
        this.f7563a--;
        return vVar;
    }

    public p7.e c() {
        j5.a aVar = (j5.a) this.f7565c;
        byte f9 = aVar.f();
        if (aVar.y() == 4) {
            j5.a.o(aVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.b()) {
            arrayList.add(b());
            f9 = aVar.f();
            if (f9 != 4) {
                boolean z8 = f9 == 9;
                int i7 = aVar.f5034b;
                if (!z8) {
                    j5.a.o(aVar, "Expected end of the array or comma", i7, null, 4);
                    throw null;
                }
            }
        }
        if (f9 == 8) {
            aVar.g((byte) 9);
        } else if (f9 == 4) {
            f.e(aVar, "array");
            throw null;
        }
        return new p7.e(arrayList);
    }

    public p7.z d(boolean z8) {
        j5.a aVar = (j5.a) this.f7565c;
        String k8 = (this.f7564b || !z8) ? aVar.k() : aVar.j();
        return (z8 || !r6.k.a(k8, "null")) ? new p(k8, z8) : s.INSTANCE;
    }
}
