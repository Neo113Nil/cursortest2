package D2;

import K.f;
import L2.h;
import O2.w;
import Q0.d;
import V2.c;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.a0;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.C2593Hm;
import com.google.android.gms.internal.ads.C2881Yl;
import com.google.android.gms.internal.ads.C3320hg;
import com.google.android.gms.internal.ads.CL;
import com.google.android.gms.internal.ads.InterfaceC3373ig;
import com.google.android.gms.internal.ads.InterfaceC3426jg;
import com.google.android.gms.internal.ads.MD;
import com.google.android.gms.internal.ads.Vx;
import com.google.android.gms.internal.ads.XC;
import com.google.android.gms.internal.ads.YD;
import h.LayoutInflaterFactory2C4535B;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;
import k2.EnumC4631b;
import k2.x;
import l.s;
import p2.j;
import q2.C4897k;
import q2.C4903n;
import q2.C4907p;
import q2.S;
import q2.r;
import s.k;
import t2.E;
import u2.i;
import y1.InterfaceC5244s;
import y1.InterfaceC5245t;
import y1.y;
import z1.C5270d;

/* loaded from: classes.dex */
public abstract class a implements InterfaceC5245t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f682n;

    /* renamed from: u, reason: collision with root package name */
    public Object f683u;

    /* renamed from: v, reason: collision with root package name */
    public Object f684v;

    public /* synthetic */ a(int i, Object obj) {
        this.f682n = i;
        this.f683u = obj;
    }

    public void c() {
        d dVar = (d) this.f683u;
        if (dVar != null) {
            try {
                ((LayoutInflaterFactory2C4535B) this.f684v).f37973D.unregisterReceiver(dVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f683u = null;
        }
    }

    public void d() {
        a0 a0Var = (a0) this.f683u;
        f fVar = (f) this.f684v;
        LinkedHashSet linkedHashSet = a0Var.f5062e;
        if (linkedHashSet.remove(fVar) && linkedHashSet.isEmpty()) {
            a0Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof I.a)) {
            return menuItem;
        }
        I.a aVar = (I.a) menuItem;
        if (((k) this.f684v) == null) {
            this.f684v = new k();
        }
        MenuItem menuItem2 = (MenuItem) ((k) this.f684v).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        s sVar = new s((Context) this.f683u, aVar);
        ((k) this.f684v).put(aVar, sVar);
        return sVar;
    }

    public abstract Object h(IBinder iBinder);

    @Override // y1.InterfaceC5245t
    public InterfaceC5244s i(y yVar) {
        Class cls = (Class) this.f684v;
        return new C5270d((Context) this.f683u, yVar.b(File.class, cls), yVar.b(Uri.class, cls), cls);
    }

    public Object j(Context context) {
        Context context2;
        if (this.f684v == null) {
            w.h(context);
            AtomicBoolean atomicBoolean = h.f1727a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                throw new c("Could not get remote context.");
            }
            try {
                this.f684v = h((IBinder) context2.getClassLoader().loadClass((String) this.f683u).newInstance());
            } catch (ClassNotFoundException e6) {
                throw new c("Could not load creator class.", e6);
            } catch (IllegalAccessException e9) {
                throw new c("Could not access creator.", e9);
            } catch (InstantiationException e10) {
                throw new c("Could not instantiate creator.", e10);
            }
        }
        return this.f684v;
    }

    public boolean k() {
        a0 a0Var = (a0) this.f683u;
        View view = a0Var.f5060c.f5162X;
        kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
        int i = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                i = 2;
            } else if (visibility != 4) {
                if (visibility != 8) {
                    throw new IllegalArgumentException(CL.i(visibility, "Unknown visibility "));
                }
                i = 3;
            }
        }
        int i4 = a0Var.f5058a;
        if (i != i4) {
            return (i == 2 || i4 == 2) ? false : true;
        }
        return true;
    }

    public abstract void l();

    public void m() {
        c();
        IntentFilter e6 = e();
        if (e6.countActions() == 0) {
            return;
        }
        if (((d) this.f683u) == null) {
            this.f683u = new d(8, this);
        }
        ((LayoutInflaterFactory2C4535B) this.f684v).f37973D.registerReceiver((d) this.f683u, e6);
    }

    public abstract c8.c n(int i, byte[] bArr);

    public byte[] o(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((c8.c) this.f684v).c(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i4 = i == 0 ? length : (length + 16) - i;
            int remaining = byteBuffer.remaining();
            int i9 = remaining % 16;
            int i10 = (i9 == 0 ? remaining : (remaining + 16) - i9) + i4;
            ByteBuffer order = ByteBuffer.allocate(i10 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(i4);
            order.put(byteBuffer);
            order.position(i10);
            order.putLong(length);
            order.putLong(remaining);
            if (!MessageDigest.isEqual(YD.c(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            c8.c cVar = (c8.c) this.f683u;
            cVar.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != cVar.b()) {
                int b9 = cVar.b();
                throw new GeneralSecurityException(D.y.j(b9, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(b9).length() + 36)));
            }
            int remaining2 = byteBuffer.remaining();
            int i11 = remaining2 / 64;
            for (int i12 = 0; i12 < i11 + 1; i12++) {
                ByteBuffer c4 = cVar.c(cVar.f5765a + i12, bArr);
                if (i12 == i11) {
                    XC.i(allocate, byteBuffer, c4, remaining2 % 64);
                } else {
                    XC.i(allocate, byteBuffer, c4, 64);
                }
            }
            return allocate.array();
        } catch (GeneralSecurityException e6) {
            throw new AEADBadTagException(e6.toString());
        }
    }

    public void p(InterfaceC3426jg interfaceC3426jg, InterfaceC3373ig interfaceC3373ig) {
        C2881Yl c2881Yl = new C2881Yl(this, interfaceC3426jg, interfaceC3373ig);
        C3320hg c3320hg = (C3320hg) this.f683u;
        c3320hg.c(new MD(0, c3320hg, c2881Yl), AbstractC3212fg.f30745h);
    }

    public void q() {
        switch (this.f682n) {
            case 0:
                try {
                    ((S) this.f683u).O(((EnumC4631b) this.f684v).f38699n);
                    break;
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
                    return;
                }
            default:
                ((C3320hg) this.f683u).b(new Exception());
                break;
        }
    }

    public void r(String str, Throwable th) {
        ((C3320hg) this.f683u).b(th);
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.C8)).booleanValue()) {
            j.f39798C.f39808h.e(str, th);
        }
    }

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f682n = i;
        this.f683u = obj;
        this.f684v = obj2;
    }

    public a(C2593Hm c2593Hm, E e6) {
        this.f682n = 4;
        this.f684v = c2593Hm;
        this.f683u = e6;
    }

    public a() {
        this.f682n = 3;
        C3320hg c3320hg = new C3320hg();
        this.f683u = c3320hg;
        this.f684v = new AtomicInteger(0);
        Vx vx = new Vx(this);
        c3320hg.c(new MD(0, c3320hg, vx), AbstractC3212fg.f30745h);
    }

    public a(Context context, EnumC4631b enumC4631b) {
        this.f682n = 0;
        if (x.f38742b == null) {
            synchronized (x.class) {
                try {
                    if (x.f38742b == null) {
                        C4903n c4903n = C4907p.f40108g.f40110b;
                        BinderC3317hd binderC3317hd = new BinderC3317hd();
                        c4903n.getClass();
                        x.f38742b = (S) new C4897k(c4903n, context, binderC3317hd).d(context, false);
                    }
                } finally {
                }
            }
        }
        this.f683u = x.f38742b;
        context.getApplicationContext();
        this.f684v = enumC4631b;
    }

    public a(byte[] bArr) {
        this.f682n = 5;
        if (XC.e(1)) {
            this.f683u = n(1, bArr);
            this.f684v = n(0, bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public a(LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B) {
        this.f682n = 6;
        this.f684v = layoutInflaterFactory2C4535B;
    }
}
