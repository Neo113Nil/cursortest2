package P;

import java.util.Set;
import kotlin.Unit;
import y4.C1030A;

/* renamed from: P.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154t implements q6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q6.e f2158e;

    public /* synthetic */ C0154t(q6.e eVar, int i2) {
        this.f2157d = i2;
        this.f2158e = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    @Override // q6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, V5.b bVar) {
        C0153s c0153s;
        int i2;
        C1030A c1030a;
        int i5;
        switch (this.f2157d) {
            case 0:
                if (bVar instanceof C0153s) {
                    c0153s = (C0153s) bVar;
                    int i7 = c0153s.f2155e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0153s.f2155e = i7 - Integer.MIN_VALUE;
                        Object obj2 = c0153s.f2154d;
                        W5.a aVar = W5.a.f2787d;
                        i2 = c0153s.f2155e;
                        if (i2 != 0) {
                            V6.b.P(obj2);
                            m0 m0Var = (m0) obj;
                            if (m0Var instanceof e0) {
                                throw ((e0) m0Var).f2075b;
                            }
                            if (!(m0Var instanceof C0139d)) {
                                if (m0Var instanceof c0 ? true : m0Var instanceof n0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new R5.k();
                            }
                            Object obj3 = ((C0139d) m0Var).f2066b;
                            c0153s.f2155e = 1;
                            if (this.f2158e.a(obj3, c0153s) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            V6.b.P(obj2);
                        }
                        return Unit.f6114a;
                    }
                }
                c0153s = new C0153s(this, bVar);
                Object obj22 = c0153s.f2154d;
                W5.a aVar2 = W5.a.f2787d;
                i2 = c0153s.f2155e;
                if (i2 != 0) {
                }
                return Unit.f6114a;
            default:
                if (bVar instanceof C1030A) {
                    c1030a = (C1030A) bVar;
                    int i8 = c1030a.f8531e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c1030a.f8531e = i8 - Integer.MIN_VALUE;
                        Object obj4 = c1030a.f8530d;
                        W5.a aVar3 = W5.a.f2787d;
                        i5 = c1030a.f8531e;
                        if (i5 != 0) {
                            V6.b.P(obj4);
                            Set keySet = ((T.b) obj).a().keySet();
                            c1030a.f8531e = 1;
                            if (this.f2158e.a(keySet, c1030a) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            V6.b.P(obj4);
                        }
                        return Unit.f6114a;
                    }
                }
                c1030a = new C1030A(this, bVar);
                Object obj42 = c1030a.f8530d;
                W5.a aVar32 = W5.a.f2787d;
                i5 = c1030a.f8531e;
                if (i5 != 0) {
                }
                return Unit.f6114a;
        }
    }
}
