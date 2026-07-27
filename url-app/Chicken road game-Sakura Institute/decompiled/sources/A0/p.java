package A0;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import z2.C1441y;

/* loaded from: classes.dex */
public final class p extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i2) {
        super(0);
        this.f358d = i2;
        this.f359e = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        Object obj2;
        switch (this.f358d) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f359e.f361b;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float b4 = ((s) obj3).f373a.f3353i.b();
                    int d4 = C1441y.d(arrayList);
                    int i2 = 1;
                    if (1 <= d4) {
                        while (true) {
                            Object obj4 = arrayList.get(i2);
                            float b5 = ((s) obj4).f373a.f3353i.b();
                            if (Float.compare(b4, b5) < 0) {
                                obj3 = obj4;
                                b4 = b5;
                            }
                            if (i2 != d4) {
                                i2++;
                            }
                        }
                    }
                    obj = obj3;
                }
                s sVar = (s) obj;
                return Float.valueOf(sVar != null ? sVar.f373a.f3353i.b() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.f359e.f361b;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float a4 = ((s) obj5).f373a.a();
                    int d5 = C1441y.d(arrayList2);
                    int i4 = 1;
                    if (1 <= d5) {
                        while (true) {
                            Object obj6 = arrayList2.get(i4);
                            float a5 = ((s) obj6).f373a.a();
                            if (Float.compare(a4, a5) < 0) {
                                obj5 = obj6;
                                a4 = a5;
                            }
                            if (i4 != d5) {
                                i4++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                s sVar2 = (s) obj2;
                return Float.valueOf(sVar2 != null ? sVar2.f373a.a() : 0.0f);
        }
    }
}
