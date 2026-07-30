package h5;

import androidx.lifecycle.c0;
import com.android.installreferrer.api.InstallReferrerClient;
import e5.r;
import j5.e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import l5.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4650a;

    /* renamed from: b, reason: collision with root package name */
    public final r f4651b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f4652c;

    public b(r rVar, int i7) {
        this.f4650a = i7;
        switch (i7) {
            case 1:
                this.f4651b = rVar;
                this.f4652c = new AtomicReference();
                rVar.a(new e5.a(3, this));
                break;
            default:
                this.f4651b = rVar;
                this.f4652c = new AtomicReference();
                rVar.a(new e5.a(2, this));
                break;
        }
    }

    public final void a(final o5.b bVar, final u uVar) {
        switch (this.f4650a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                final int i7 = 0;
                this.f4651b.a(new z5.a(bVar, uVar, i7) { // from class: h5.a

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f4648a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ExecutorService f4649b;

                    {
                        this.f4648a = i7;
                    }

                    @Override // z5.a
                    public final void a(z5.b bVar2) {
                        switch (this.f4648a) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                bVar2.get().getClass();
                                throw new ClassCastException();
                            default:
                                bVar2.get().getClass();
                                throw new ClassCastException();
                        }
                    }
                });
                break;
            default:
                final int i8 = 1;
                this.f4651b.a(new z5.a(bVar, uVar, i8) { // from class: h5.a

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f4648a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ExecutorService f4649b;

                    {
                        this.f4648a = i8;
                    }

                    @Override // z5.a
                    public final void a(z5.b bVar2) {
                        switch (this.f4648a) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                bVar2.get().getClass();
                                throw new ClassCastException();
                            default:
                                bVar2.get().getClass();
                                throw new ClassCastException();
                        }
                    }
                });
                break;
        }
    }

    public final void b(androidx.room.c cVar) {
        switch (this.f4650a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.f4652c.get() != null) {
                    throw new ClassCastException();
                }
                ((ScheduledExecutorService) cVar.f1069g).execute(new c0(8, (e) cVar.f1070h));
                return;
            default:
                if (this.f4652c.get() != null) {
                    throw new ClassCastException();
                }
                ((ScheduledExecutorService) cVar.f1069g).execute(new c0(8, (e) cVar.f1070h));
                return;
        }
    }
}
