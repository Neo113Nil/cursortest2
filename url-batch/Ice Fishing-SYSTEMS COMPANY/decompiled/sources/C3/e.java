package C3;

import N2.InterfaceC0323i;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractActivityC0490x;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.w;
import r.C4951a;
import r7.AbstractC4978i;
import r7.AbstractC4981l;
import v1.InterfaceC5117a;

/* loaded from: classes2.dex */
public class e implements B1.n, O1.c, InterfaceC0323i, com.bumptech.glide.manager.f, i2.a, w, s1.f {

    /* renamed from: n, reason: collision with root package name */
    public static e f381n;

    /* renamed from: u, reason: collision with root package name */
    public static e f382u;

    public /* synthetic */ e(Object obj) {
    }

    public static final void i(u8.c node, long j9, boolean z8) {
        G1.a aVar = u8.c.f41264h;
        if (u8.c.i == null) {
            u8.c.i = new u8.c();
            W2.d dVar = new W2.d("Okio Watchdog");
            dVar.setDaemon(true);
            dVar.start();
        }
        long nanoTime = System.nanoTime();
        if (j9 != 0 && z8) {
            node.f41271g = Math.min(j9, node.c() - nanoTime) + nanoTime;
        } else if (j9 != 0) {
            node.f41271g = nanoTime + j9;
        } else {
            if (!z8) {
                throw new AssertionError();
            }
            node.f41271g = node.c();
        }
        G1.a aVar2 = u8.c.f41264h;
        kotlin.jvm.internal.h.e(node, "node");
        int i = aVar2.f1194u + 1;
        aVar2.f1194u = i;
        u8.c[] cVarArr = (u8.c[]) aVar2.f1195v;
        if (i == cVarArr.length) {
            u8.c[] cVarArr2 = new u8.c[i * 2];
            AbstractC4978i.I(0, 0, cVarArr.length, cVarArr, cVarArr2);
            aVar2.f1195v = cVarArr2;
        }
        aVar2.e(i, node);
        if (node.f41270f == 1) {
            u8.c.f41266k.signal();
        }
    }

    public static ArrayList j(List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((e8.t) obj) != e8.t.f37502v) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4981l.E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((e8.t) it.next()).f37507n);
        }
        return arrayList2;
    }

    public static u8.c k() {
        G1.a aVar = u8.c.f41264h;
        u8.c cVar = ((u8.c[]) aVar.f1195v)[1];
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            u8.c.f41266k.await(u8.c.f41267l, TimeUnit.MILLISECONDS);
            if (((u8.c[]) aVar.f1195v)[1] != null || System.nanoTime() - nanoTime < u8.c.f41268m) {
                return null;
            }
            return u8.c.i;
        }
        long nanoTime2 = cVar.f41271g - System.nanoTime();
        if (nanoTime2 > 0) {
            u8.c.f41266k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        aVar.n(cVar);
        cVar.f41269e = 2;
        return cVar;
    }

    public static byte[] l(List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        u8.e eVar = new u8.e();
        Iterator it = j(protocols).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            eVar.X(str.length());
            eVar.d0(str);
        }
        return eVar.A(eVar.f41277u);
    }

    @Override // i2.a
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // N2.InterfaceC0323i
    public void accept(Object obj, Object obj2) {
        Y2.c cVar = (Y2.c) ((Y2.b) obj).u();
        Y2.f fVar = new Y2.f((h3.h) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = Y2.a.f3958a;
        obtain.writeInt(1);
        S0.f.C(obtain, S0.f.B(obtain, 20293));
        obtain.writeStrongBinder(fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f3959n.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // O1.c
    public void f(Object obj) {
        ((List) obj).clear();
    }

    @Override // l.w
    public boolean g(l.l lVar) {
        return false;
    }

    public void m(S0.e eVar, float f6) {
        C4951a c4951a = (C4951a) ((Drawable) eVar.f2891u);
        CardView cardView = (CardView) eVar.f2892v;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f6 != c4951a.f40191e || c4951a.f40192f != useCompatPadding || c4951a.f40193g != preventCornerOverlap) {
            c4951a.f40191e = f6;
            c4951a.f40192f = useCompatPadding;
            c4951a.f40193g = preventCornerOverlap;
            c4951a.b(null);
            c4951a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            eVar.q(0, 0, 0, 0);
            return;
        }
        C4951a c4951a2 = (C4951a) ((Drawable) eVar.f2891u);
        float f9 = c4951a2.f40191e;
        float f10 = c4951a2.f40187a;
        int ceil = (int) Math.ceil(r.b.a(f9, f10, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(r.b.b(f9, f10, cardView.getPreventCornerOverlap()));
        eVar.q(ceil, ceil2, ceil, ceil2);
    }

    @Override // B1.n
    public void c() {
    }

    @Override // com.bumptech.glide.manager.f
    public void b(AbstractActivityC0490x abstractActivityC0490x) {
    }

    @Override // B1.n
    public void d(Bitmap bitmap, InterfaceC5117a interfaceC5117a) {
    }

    @Override // l.w
    public void e(l.l lVar, boolean z8) {
    }

    @Override // s1.f
    public void h(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
