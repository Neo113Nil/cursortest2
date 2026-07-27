package c2;

import Q.C0273i;
import Z1.r;
import e2.C0563e;
import g2.u;
import j2.C0712b;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import u2.InterfaceC1228a;
import u2.InterfaceC1229b;
import y.t;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5840a;

    /* renamed from: b, reason: collision with root package name */
    public final r f5841b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f5842c;

    public C0538b(r rVar, int i2) {
        this.f5840a = i2;
        switch (i2) {
            case 1:
                this.f5841b = rVar;
                this.f5842c = new AtomicReference();
                rVar.a(new C0273i(4, this));
                break;
            default:
                this.f5841b = rVar;
                this.f5842c = new AtomicReference();
                rVar.a(new C0273i(3, this));
                break;
        }
    }

    public final void a(final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, final u uVar) {
        switch (this.f5840a) {
            case 0:
                final int i2 = 0;
                this.f5841b.a(new InterfaceC1228a(scheduledThreadPoolExecutor, uVar, i2) { // from class: c2.a

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f5838a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ScheduledThreadPoolExecutor f5839b;

                    {
                        this.f5838a = i2;
                    }

                    @Override // u2.InterfaceC1228a
                    public final void b(InterfaceC1229b interfaceC1229b) {
                        switch (this.f5838a) {
                            case 0:
                                interfaceC1229b.get().getClass();
                                throw new ClassCastException();
                            default:
                                interfaceC1229b.get().getClass();
                                throw new ClassCastException();
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                this.f5841b.a(new InterfaceC1228a(scheduledThreadPoolExecutor, uVar, i4) { // from class: c2.a

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f5838a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ScheduledThreadPoolExecutor f5839b;

                    {
                        this.f5838a = i4;
                    }

                    @Override // u2.InterfaceC1228a
                    public final void b(InterfaceC1229b interfaceC1229b) {
                        switch (this.f5838a) {
                            case 0:
                                interfaceC1229b.get().getClass();
                                throw new ClassCastException();
                            default:
                                interfaceC1229b.get().getClass();
                                throw new ClassCastException();
                        }
                    }
                });
                break;
        }
    }

    public final void b(t tVar) {
        switch (this.f5840a) {
            case 0:
                if (this.f5842c.get() != null) {
                    throw new ClassCastException();
                }
                ((C0712b) tVar.f11494e).execute(new C.t(9, (C0563e) tVar.f11495i));
                return;
            default:
                if (this.f5842c.get() != null) {
                    throw new ClassCastException();
                }
                ((C0712b) tVar.f11494e).execute(new C.t(9, (C0563e) tVar.f11495i));
                return;
        }
    }
}
