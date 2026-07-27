package a5;

import java.io.IOException;
import java.util.List;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f3970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3971c;

    public /* synthetic */ m(t tVar, int i2, Object obj, int i3) {
        this.f3969a = i3;
        this.f3970b = tVar;
        this.f3971c = i2;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        switch (this.f3969a) {
            case 0:
                t tVar = this.f3970b;
                int i2 = this.f3971c;
                tVar.f3998k.getClass();
                try {
                    tVar.f4011x.q(i2, EnumC0200b.f3922h);
                    synchronized (tVar) {
                        tVar.z.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused) {
                }
                return f4.v.f5689a;
            case 1:
                t tVar2 = this.f3970b;
                int i3 = this.f3971c;
                tVar2.f3998k.getClass();
                synchronized (tVar2) {
                    tVar2.z.remove(Integer.valueOf(i3));
                }
                return f4.v.f5689a;
            default:
                t tVar3 = this.f3970b;
                int i6 = this.f3971c;
                tVar3.f3998k.getClass();
                try {
                    tVar3.f4011x.q(i6, EnumC0200b.f3922h);
                    synchronized (tVar3) {
                        tVar3.z.remove(Integer.valueOf(i6));
                    }
                } catch (IOException unused2) {
                }
                return f4.v.f5689a;
        }
    }

    public /* synthetic */ m(t tVar, int i2, List list, boolean z) {
        this.f3969a = 2;
        this.f3970b = tVar;
        this.f3971c = i2;
    }
}
