package e6;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.IOException;
import java.util.List;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4087f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f4088g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4089h;

    public /* synthetic */ l(r rVar, int i7, Object obj, int i8) {
        this.f4087f = i8;
        this.f4088g = rVar;
        this.f4089h = i7;
    }

    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        switch (this.f4087f) {
            case 0:
                r rVar = this.f4088g;
                int i7 = this.f4089h;
                rVar.f4114p.getClass();
                try {
                    rVar.f4101B.n(i7, EnumC0356b.f4043m);
                    synchronized (rVar) {
                        rVar.f4103D.remove(Integer.valueOf(i7));
                    }
                } catch (IOException unused) {
                }
                return k5.v.f5219a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                r rVar2 = this.f4088g;
                int i8 = this.f4089h;
                rVar2.f4114p.getClass();
                synchronized (rVar2) {
                    rVar2.f4103D.remove(Integer.valueOf(i8));
                }
                return k5.v.f5219a;
            default:
                r rVar3 = this.f4088g;
                int i9 = this.f4089h;
                rVar3.f4114p.getClass();
                try {
                    rVar3.f4101B.n(i9, EnumC0356b.f4043m);
                    synchronized (rVar3) {
                        rVar3.f4103D.remove(Integer.valueOf(i9));
                    }
                } catch (IOException unused2) {
                }
                return k5.v.f5219a;
        }
    }

    public /* synthetic */ l(r rVar, int i7, List list, boolean z5) {
        this.f4087f = 2;
        this.f4088g = rVar;
        this.f4089h = i7;
    }
}
