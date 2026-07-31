package b6;

import com.snovikpovik.vuevnxsj.MainActivity;
import j0.l2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f1272e;

    public /* synthetic */ b1(w wVar, int i) {
        this.f1271d = 4;
        this.f1272e = wVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        int i = this.f1271d;
        int i8 = 2;
        c6.m mVar = c6.m.f1757a;
        w wVar = this.f1272e;
        int i9 = 1;
        byte b8 = 0;
        switch (i) {
            case 0:
                m0.s sVar = (m0.s) obj;
                int intValue = ((Integer) obj2).intValue();
                int i10 = MainActivity.f2043w;
                if (!sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    sVar.Q();
                    break;
                } else {
                    d2.a(false, u0.h.d(-521165853, new b1(wVar, i9, b8), sVar), sVar, 48);
                    break;
                }
            case 1:
                m0.s sVar2 = (m0.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i11 = MainActivity.f2043w;
                if (!sVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.Q();
                    break;
                } else {
                    l2.a(androidx.compose.foundation.layout.a.f503b, null, ((j0.b0) sVar2.j(j0.c0.f3599a)).f3569n, 0L, 0.0f, 0.0f, u0.h.d(2063985832, new b1(wVar, i8, b8), sVar2), sVar2, 12582918, 122);
                    break;
                }
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m0.s sVar3 = (m0.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i12 = MainActivity.f2043w;
                if (!sVar3.N(1 & intValue3, (intValue3 & 3) != 2)) {
                    sVar3.Q();
                    break;
                } else {
                    k.A(null, u0.h.d(879117698, new b1(wVar, 3, b8), sVar3), sVar3, 48);
                    break;
                }
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                m0.s sVar4 = (m0.s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i13 = MainActivity.f2043w;
                if (!sVar4.N(intValue4 & 1, (intValue4 & 3) != 2)) {
                    sVar4.Q();
                    break;
                } else {
                    k.d(wVar, sVar4, 0);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                k.d(wVar, (m0.s) obj, m0.b.w(1));
                break;
        }
        return mVar;
    }

    public /* synthetic */ b1(w wVar, int i, byte b8) {
        this.f1271d = i;
        this.f1272e = wVar;
    }
}
