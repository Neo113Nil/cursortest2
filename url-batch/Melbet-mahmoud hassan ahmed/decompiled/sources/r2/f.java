package r2;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.ad0;
import com.google.android.gms.internal.ads.b40;
import com.google.android.gms.internal.ads.d00;
import com.google.android.gms.internal.ads.ev;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.jx;
import com.google.android.gms.internal.ads.kg0;
import com.google.android.gms.internal.ads.kz;
import com.google.android.gms.internal.ads.ov;
import com.google.android.gms.internal.ads.p60;
import com.google.android.gms.internal.ads.q60;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.s00;
import f3.c;
import u2.f;
import u2.h;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final ov f21135a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f21136b;

    /* renamed from: c, reason: collision with root package name */
    private final gx f21137c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f21138a;

        /* renamed from: b, reason: collision with root package name */
        private final jx f21139b;

        public a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
            Context context2 = (Context) r3.o.j(context, "context cannot be null");
            jx c7 = qw.a().c(context, str, new ad0());
            this.f21138a = context2;
            this.f21139b = c7;
        }

        @RecentlyNonNull
        public f a() {
            try {
                return new f(this.f21138a, this.f21139b.b(), ov.f9836a);
            } catch (RemoteException e7) {
                io0.e("Failed to build AdLoader.", e7);
                return new f(this.f21138a, new d00().t6(), ov.f9836a);
            }
        }

        @RecentlyNonNull
        @Deprecated
        public a b(@RecentlyNonNull String str, @RecentlyNonNull f.b bVar, f.a aVar) {
            p60 p60Var = new p60(bVar, aVar);
            try {
                this.f21139b.g4(str, p60Var.e(), p60Var.d());
            } catch (RemoteException e7) {
                io0.h("Failed to add custom template ad listener", e7);
            }
            return this;
        }

        @RecentlyNonNull
        public a c(@RecentlyNonNull c.InterfaceC0063c interfaceC0063c) {
            try {
                this.f21139b.V4(new kg0(interfaceC0063c));
            } catch (RemoteException e7) {
                io0.h("Failed to add google native ad listener", e7);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public a d(@RecentlyNonNull h.a aVar) {
            try {
                this.f21139b.V4(new q60(aVar));
            } catch (RemoteException e7) {
                io0.h("Failed to add google native ad listener", e7);
            }
            return this;
        }

        @RecentlyNonNull
        public a e(@RecentlyNonNull d dVar) {
            try {
                this.f21139b.D5(new ev(dVar));
            } catch (RemoteException e7) {
                io0.h("Failed to set AdListener.", e7);
            }
            return this;
        }

        @RecentlyNonNull
        public a f(@RecentlyNonNull f3.d dVar) {
            try {
                this.f21139b.u4(new b40(4, dVar.e(), -1, dVar.d(), dVar.a(), dVar.c() != null ? new s00(dVar.c()) : null, dVar.f(), dVar.b()));
            } catch (RemoteException e7) {
                io0.h("Failed to specify native ad options", e7);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public a g(@RecentlyNonNull u2.e eVar) {
            try {
                this.f21139b.u4(new b40(eVar));
            } catch (RemoteException e7) {
                io0.h("Failed to specify native ad options", e7);
            }
            return this;
        }
    }

    f(Context context, gx gxVar, ov ovVar) {
        this.f21136b = context;
        this.f21137c = gxVar;
        this.f21135a = ovVar;
    }

    private final void c(kz kzVar) {
        try {
            this.f21137c.Y1(this.f21135a.a(this.f21136b, kzVar));
        } catch (RemoteException e7) {
            io0.e("Failed to load ad.", e7);
        }
    }

    public void a(@RecentlyNonNull g gVar) {
        c(gVar.a());
    }

    public void b(@RecentlyNonNull s2.a aVar) {
        c(aVar.f21140a);
    }
}
