package C0;

import e2.InterfaceC0422a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f627f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i3) {
        super(0);
        this.f626e = i3;
        this.f627f = qVar;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        Object obj;
        Object obj2;
        switch (this.f626e) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f627f.f629b;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float b3 = ((s) obj3).f641a.f3237i.b();
                    int z02 = S1.m.z0(arrayList);
                    int i3 = 1;
                    if (1 <= z02) {
                        while (true) {
                            Object obj4 = arrayList.get(i3);
                            float b4 = ((s) obj4).f641a.f3237i.b();
                            if (Float.compare(b3, b4) < 0) {
                                obj3 = obj4;
                                b3 = b4;
                            }
                            if (i3 != z02) {
                                i3++;
                            }
                        }
                    }
                    obj = obj3;
                }
                s sVar = (s) obj;
                return Float.valueOf(sVar != null ? sVar.f641a.f3237i.b() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.f627f.f629b;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float a3 = ((s) obj5).f641a.a();
                    int z03 = S1.m.z0(arrayList2);
                    int i4 = 1;
                    if (1 <= z03) {
                        while (true) {
                            Object obj6 = arrayList2.get(i4);
                            float a4 = ((s) obj6).f641a.a();
                            if (Float.compare(a3, a4) < 0) {
                                obj5 = obj6;
                                a3 = a4;
                            }
                            if (i4 != z03) {
                                i4++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                s sVar2 = (s) obj2;
                return Float.valueOf(sVar2 != null ? sVar2.f641a.a() : 0.0f);
        }
    }
}
