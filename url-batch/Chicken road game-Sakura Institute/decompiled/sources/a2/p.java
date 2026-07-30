package a2;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f432g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f433h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i7) {
        super(0);
        this.f432g = i7;
        this.f433h = qVar;
    }

    @Override // q6.a
    public final Object a() {
        Object obj;
        Object obj2;
        switch (this.f432g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ArrayList arrayList = (ArrayList) this.f433h.f435b;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float b9 = ((s) obj3).f447a.f4867i.b();
                    int W = e6.m.W(arrayList);
                    int i7 = 1;
                    if (1 <= W) {
                        while (true) {
                            Object obj4 = arrayList.get(i7);
                            float b10 = ((s) obj4).f447a.f4867i.b();
                            if (Float.compare(b9, b10) < 0) {
                                obj3 = obj4;
                                b9 = b10;
                            }
                            if (i7 != W) {
                                i7++;
                            }
                        }
                    }
                    obj = obj3;
                }
                s sVar = (s) obj;
                return Float.valueOf(sVar != null ? sVar.f447a.f4867i.b() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.f433h.f435b;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float a3 = ((s) obj5).f447a.a();
                    int W2 = e6.m.W(arrayList2);
                    int i8 = 1;
                    if (1 <= W2) {
                        while (true) {
                            Object obj6 = arrayList2.get(i8);
                            float a9 = ((s) obj6).f447a.a();
                            if (Float.compare(a3, a9) < 0) {
                                obj5 = obj6;
                                a3 = a9;
                            }
                            if (i8 != W2) {
                                i8++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                s sVar2 = (s) obj2;
                return Float.valueOf(sVar2 != null ? sVar2.f447a.a() : 0.0f);
        }
    }
}
