package i8;

import B2.z;
import N2.A;
import android.content.res.Resources;
import android.os.RemoteException;
import android.view.MenuItem;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.InterfaceC3852rb;
import e8.C4483a;
import g1.C4524d;
import h.C4541H;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import l.InterfaceC4682j;
import m.InterfaceC4749n;
import m.V0;
import m1.C4776c;
import o3.InterfaceC4832a;
import r7.C4977h;
import y1.C5222B;
import y1.C5227b;
import y1.C5241p;
import y1.InterfaceC5244s;
import y1.InterfaceC5245t;

/* loaded from: classes2.dex */
public final class m implements x, InterfaceC4682j, InterfaceC4832a, O1.a, InterfaceC5245t {

    /* renamed from: n, reason: collision with root package name */
    public Object f38384n;

    public /* synthetic */ m(Object obj) {
        this.f38384n = obj;
    }

    @Override // i8.x
    public boolean a(r rVar) {
        return ((t) this.f38384n).a(rVar);
    }

    @Override // i8.x
    public boolean b(e8.o url) {
        kotlin.jvm.internal.h.e(url, "url");
        return ((t) this.f38384n).b(url);
    }

    @Override // i8.x
    public C4483a c() {
        return ((t) this.f38384n).f38430B;
    }

    @Override // i8.x
    public boolean d() {
        return ((t) this.f38384n).f38432D.k();
    }

    @Override // i8.x
    public C4977h e() {
        return ((t) this.f38384n).f38436H;
    }

    @Override // O1.a
    public Object f() {
        F.d dVar = (F.d) this.f38384n;
        return new u1.h((N1.h) dVar.f909c, (Y2.e) dVar.f910d);
    }

    @Override // i8.x
    public w g() {
        return ((t) this.f38384n).f();
    }

    public void h(C4776c c4776c, com.bumptech.glide.manager.n nVar, h3.l lVar) {
        synchronized (c4776c.f39565w) {
            c4776c.f39556B = true;
        }
        c4776c.a("post-response");
        ((A) this.f38384n).execute(new z(c4776c, nVar, lVar, 11));
    }

    @Override // y1.InterfaceC5245t
    public InterfaceC5244s i(y1.y yVar) {
        return new C5227b((Resources) this.f38384n, C5222B.f41814b);
    }

    @Override // l.InterfaceC4682j
    public void j(l.l lVar) {
        InterfaceC4682j interfaceC4682j = ((ActionMenuView) this.f38384n).f4679O;
        if (interfaceC4682j != null) {
            interfaceC4682j.j(lVar);
        }
    }

    public void k(ImageView.ScaleType scaleType) {
        InterfaceC3852rb interfaceC3852rb = ((NativeAdView) this.f38384n).f23749u;
        if (interfaceC3852rb == null || scaleType == null) {
            return;
        }
        try {
            interfaceC3852rb.Q1(new V2.b(scaleType));
        } catch (RemoteException e6) {
            u2.i.d("Unable to call setMediaViewImageScaleType on delegate", e6);
        }
    }

    @Override // l.InterfaceC4682j
    public boolean o(l.l lVar, MenuItem menuItem) {
        boolean onMenuItemSelected;
        InterfaceC4749n interfaceC4749n = ((ActionMenuView) this.f38384n).f4684T;
        if (interfaceC4749n != null) {
            Toolbar toolbar = (Toolbar) ((C4524d) interfaceC4749n).f37858u;
            if (toolbar.f4727p0.a()) {
                onMenuItemSelected = true;
            } else {
                V0 v02 = toolbar.f4729r0;
                onMenuItemSelected = v02 != null ? ((C4541H) ((C4524d) v02).f37858u).f38032b.f38132n.onMenuItemSelected(0, menuItem) : false;
            }
            if (onMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    public m(int i) {
        switch (i) {
            case 9:
                this.f38384n = new C5241p(500L, 0);
                break;
            case 10:
            default:
                this.f38384n = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            case 11:
                this.f38384n = null;
                break;
        }
    }
}
