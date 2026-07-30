package D1;

import F1.d;
import F1.f;
import N1.g;
import S0.e;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.p;
import com.google.android.gms.internal.ads.C3112dq;
import u1.t;
import u1.x;
import v1.InterfaceC5117a;

/* loaded from: classes.dex */
public final class b implements x, t {

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f678n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f679u;

    public b(Drawable drawable, int i) {
        this.f679u = i;
        g.c(drawable, "Argument must not be null");
        this.f678n = drawable;
    }

    @Override // u1.x
    public final void a() {
        C3112dq c3112dq;
        C3112dq c3112dq2;
        C3112dq c3112dq3;
        switch (this.f679u) {
            case 0:
                break;
            default:
                F1.b bVar = (F1.b) this.f678n;
                bVar.stop();
                bVar.f964w = true;
                f fVar = (f) bVar.f961n.f744b;
                fVar.f978c.clear();
                Bitmap bitmap = fVar.f986l;
                if (bitmap != null) {
                    fVar.f980e.d(bitmap);
                    fVar.f986l = null;
                }
                fVar.f981f = false;
                d dVar = fVar.i;
                p pVar = fVar.f979d;
                if (dVar != null) {
                    pVar.i(dVar);
                    fVar.i = null;
                }
                d dVar2 = fVar.f985k;
                if (dVar2 != null) {
                    pVar.i(dVar2);
                    fVar.f985k = null;
                }
                d dVar3 = fVar.f987m;
                if (dVar3 != null) {
                    pVar.i(dVar3);
                    fVar.f987m = null;
                }
                r1.d dVar4 = fVar.f976a;
                dVar4.f40269l = null;
                byte[] bArr = dVar4.i;
                e eVar = dVar4.f40261c;
                if (bArr != null && (c3112dq3 = (C3112dq) eVar.f2892v) != null) {
                    c3112dq3.k(bArr);
                }
                int[] iArr = dVar4.f40267j;
                if (iArr != null && (c3112dq2 = (C3112dq) eVar.f2892v) != null) {
                    c3112dq2.k(iArr);
                }
                Bitmap bitmap2 = dVar4.f40270m;
                if (bitmap2 != null) {
                    ((InterfaceC5117a) eVar.f2891u).d(bitmap2);
                }
                dVar4.f40270m = null;
                dVar4.f40262d = null;
                dVar4.f40276s = null;
                byte[] bArr2 = dVar4.f40263e;
                if (bArr2 != null && (c3112dq = (C3112dq) eVar.f2892v) != null) {
                    c3112dq.k(bArr2);
                }
                fVar.f984j = true;
                break;
        }
    }

    @Override // u1.x
    public final int c() {
        switch (this.f679u) {
            case 0:
                Drawable drawable = this.f678n;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                f fVar = (f) ((F1.b) this.f678n).f961n.f744b;
                r1.d dVar = fVar.f976a;
                return (dVar.f40267j.length * 4) + dVar.f40262d.limit() + dVar.i.length + fVar.f988n;
        }
    }

    @Override // u1.x
    public final Class d() {
        switch (this.f679u) {
            case 0:
                return this.f678n.getClass();
            default:
                return F1.b.class;
        }
    }

    @Override // u1.x
    public final Object get() {
        Drawable drawable = this.f678n;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // u1.t
    public void initialize() {
        switch (this.f679u) {
            case 1:
                ((f) ((F1.b) this.f678n).f961n.f744b).f986l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f678n;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof F1.b) {
                        ((f) ((F1.b) drawable).f961n.f744b).f986l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    private final void b() {
    }
}
