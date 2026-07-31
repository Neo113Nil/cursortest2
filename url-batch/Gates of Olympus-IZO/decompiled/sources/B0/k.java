package B0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A2.w f277f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(A2.w wVar, int i3) {
        super(0);
        this.f276e = i3;
        this.f277f = wVar;
    }

    @Override // Y1.a
    public final Object b() {
        Object obj;
        Object obj2;
        switch (this.f276e) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f277f.f197f;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float b2 = ((m) obj3).f285a.f2436i.b();
                    int b02 = M1.m.b0(arrayList);
                    int i3 = 1;
                    if (1 <= b02) {
                        while (true) {
                            Object obj4 = arrayList.get(i3);
                            float b3 = ((m) obj4).f285a.f2436i.b();
                            if (Float.compare(b2, b3) < 0) {
                                obj3 = obj4;
                                b2 = b3;
                            }
                            if (i3 != b02) {
                                i3++;
                            }
                        }
                    }
                    obj = obj3;
                }
                m mVar = (m) obj;
                return Float.valueOf(mVar != null ? mVar.f285a.f2436i.b() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.f277f.f197f;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float c3 = ((m) obj5).f285a.c();
                    int b03 = M1.m.b0(arrayList2);
                    int i4 = 1;
                    if (1 <= b03) {
                        while (true) {
                            Object obj6 = arrayList2.get(i4);
                            float c4 = ((m) obj6).f285a.c();
                            if (Float.compare(c3, c4) < 0) {
                                obj5 = obj6;
                                c3 = c4;
                            }
                            if (i4 != b03) {
                                i4++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                m mVar2 = (m) obj2;
                return Float.valueOf(mVar2 != null ? mVar2.f285a.c() : 0.0f);
        }
    }
}
