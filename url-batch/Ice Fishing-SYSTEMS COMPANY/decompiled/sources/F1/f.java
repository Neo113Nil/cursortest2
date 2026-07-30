package F1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.i;
import com.bumptech.glide.n;
import com.bumptech.glide.p;
import java.util.ArrayList;
import r1.C4956a;
import s1.l;
import u1.j;
import v1.InterfaceC5117a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final r1.d f976a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f977b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f978c;

    /* renamed from: d, reason: collision with root package name */
    public final p f979d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC5117a f980e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f981f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f982g;

    /* renamed from: h, reason: collision with root package name */
    public n f983h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f984j;

    /* renamed from: k, reason: collision with root package name */
    public d f985k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f986l;

    /* renamed from: m, reason: collision with root package name */
    public d f987m;

    /* renamed from: n, reason: collision with root package name */
    public int f988n;

    /* renamed from: o, reason: collision with root package name */
    public int f989o;

    /* renamed from: p, reason: collision with root package name */
    public int f990p;

    public f(com.bumptech.glide.c cVar, r1.d dVar, int i, int i4, Bitmap bitmap) {
        A1.e eVar = A1.e.f18b;
        InterfaceC5117a interfaceC5117a = cVar.f23530n;
        i iVar = cVar.f23532v;
        p c4 = com.bumptech.glide.c.c(iVar.getBaseContext());
        p c9 = com.bumptech.glide.c.c(iVar.getBaseContext());
        c9.getClass();
        n a9 = new n(c9.f23645n, c9, Bitmap.class, c9.f23646u).a(p.f23641D).a(((J1.e) ((J1.e) ((J1.e) new J1.e().j(j.f41127b)).y()).u()).n(i, i4));
        this.f978c = new ArrayList();
        this.f979d = c4;
        Handler handler = new Handler(Looper.getMainLooper(), new E3.e(1, this));
        this.f980e = interfaceC5117a;
        this.f977b = handler;
        this.f983h = a9;
        this.f976a = dVar;
        c(eVar, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f981f || this.f982g) {
            return;
        }
        d dVar = this.f987m;
        if (dVar != null) {
            this.f987m = null;
            b(dVar);
            return;
        }
        this.f982g = true;
        r1.d dVar2 = this.f976a;
        int i4 = dVar2.f40269l.f40247c;
        long uptimeMillis = SystemClock.uptimeMillis() + ((i4 <= 0 || (i = dVar2.f40268k) < 0) ? 0 : (i < 0 || i >= i4) ? -1 : ((C4956a) r2.f40249e.get(i)).i);
        int i9 = (dVar2.f40268k + 1) % dVar2.f40269l.f40247c;
        dVar2.f40268k = i9;
        this.f985k = new d(this.f977b, i9, uptimeMillis);
        n F8 = this.f983h.a((J1.e) new J1.e().t(new M1.d(Double.valueOf(Math.random())))).F(dVar2);
        F8.D(this.f985k, F8);
    }

    public final void b(d dVar) {
        this.f982g = false;
        boolean z8 = this.f984j;
        Handler handler = this.f977b;
        if (z8) {
            handler.obtainMessage(2, dVar).sendToTarget();
            return;
        }
        if (!this.f981f) {
            this.f987m = dVar;
            return;
        }
        if (dVar.f975z != null) {
            Bitmap bitmap = this.f986l;
            if (bitmap != null) {
                this.f980e.d(bitmap);
                this.f986l = null;
            }
            d dVar2 = this.i;
            this.i = dVar;
            ArrayList arrayList = this.f978c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) ((e) arrayList.get(size));
                Object callback = bVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    bVar.stop();
                    bVar.invalidateSelf();
                } else {
                    bVar.invalidateSelf();
                    d dVar3 = ((f) bVar.f961n.f744b).i;
                    if ((dVar3 != null ? dVar3.f973x : -1) == r5.f976a.f40269l.f40247c - 1) {
                        bVar.f966y++;
                    }
                    int i = bVar.f967z;
                    if (i != -1 && bVar.f966y >= i) {
                        bVar.stop();
                    }
                }
            }
            if (dVar2 != null) {
                handler.obtainMessage(2, dVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(l lVar, Bitmap bitmap) {
        N1.g.c(lVar, "Argument must not be null");
        N1.g.c(bitmap, "Argument must not be null");
        this.f986l = bitmap;
        this.f983h = this.f983h.a(new J1.e().x(lVar, true));
        this.f988n = N1.p.c(bitmap);
        this.f989o = bitmap.getWidth();
        this.f990p = bitmap.getHeight();
    }
}
