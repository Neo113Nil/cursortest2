package q1;

import android.graphics.Path;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public k1.v f7870b;

    /* renamed from: f, reason: collision with root package name */
    public float f7874f;
    public k1.v g;

    /* renamed from: k, reason: collision with root package name */
    public float f7877k;

    /* renamed from: m, reason: collision with root package name */
    public float f7879m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7882p;

    /* renamed from: q, reason: collision with root package name */
    public m1.g f7883q;

    /* renamed from: r, reason: collision with root package name */
    public final k1.g f7884r;

    /* renamed from: s, reason: collision with root package name */
    public k1.g f7885s;

    /* renamed from: t, reason: collision with root package name */
    public k1.g f7886t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f7887u;

    /* renamed from: c, reason: collision with root package name */
    public float f7871c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List f7872d = g0.f7869a;

    /* renamed from: e, reason: collision with root package name */
    public float f7873e = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f7875h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f7876i = 0;
    public float j = 4.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f7878l = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7880n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7881o = true;

    public h() {
        k1.g a9 = k1.i.a();
        this.f7884r = a9;
        this.f7885s = a9;
        this.f7887u = hd.h.a(hd.i.f4508e, g.f7866e);
    }

    @Override // q1.c0
    public final void a(m1.d dVar) {
        m1.d dVar2;
        m1.g gVar;
        if (this.f7880n) {
            b.e(this.f7872d, this.f7884r);
            e();
        } else if (this.f7882p) {
            e();
        }
        this.f7880n = false;
        this.f7882p = false;
        k1.v vVar = this.f7870b;
        if (vVar != null) {
            dVar2 = dVar;
            m1.d.z(dVar2, this.f7885s, vVar, this.f7871c, null, 56);
        } else {
            dVar2 = dVar;
        }
        k1.v vVar2 = this.g;
        if (vVar2 != null) {
            m1.g gVar2 = this.f7883q;
            if (this.f7881o || gVar2 == null) {
                m1.g gVar3 = new m1.g(this.f7874f, this.j, this.f7875h, this.f7876i, 16);
                this.f7883q = gVar3;
                this.f7881o = false;
                gVar = gVar3;
            } else {
                gVar = gVar2;
            }
            m1.d.z(dVar2, this.f7885s, vVar2, this.f7873e, gVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [hd.g, java.lang.Object] */
    public final void e() {
        float f3 = this.f7877k;
        k1.g gVar = this.f7884r;
        if (f3 == 0.0f && this.f7878l == 1.0f) {
            this.f7885s = gVar;
            return;
        }
        if (Intrinsics.a(this.f7885s, gVar)) {
            this.f7885s = k1.i.a();
        } else {
            Path.FillType fillType = this.f7885s.f5321a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z10 = fillType == fillType2;
            this.f7885s.f5321a.rewind();
            Path path = this.f7885s.f5321a;
            if (!z10) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.f7887u;
        ((k1.h) r02.getValue()).f5324a.setPath(gVar != null ? gVar.f5321a : null, false);
        float length = ((k1.h) r02.getValue()).f5324a.getLength();
        float f10 = this.f7877k;
        float f11 = this.f7879m;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.f7878l + f11) % 1.0f) * length;
        if (f12 <= f13) {
            ((k1.h) r02.getValue()).a(f12, f13, this.f7885s);
            return;
        }
        k1.g gVar2 = this.f7886t;
        if (gVar2 == null) {
            gVar2 = k1.i.a();
            this.f7886t = gVar2;
        }
        Path path2 = gVar2.f5321a;
        path2.reset();
        ((k1.h) r02.getValue()).a(f12, length, gVar2);
        k1.g.a(this.f7885s, gVar2);
        path2.reset();
        ((k1.h) r02.getValue()).a(0.0f, f13, gVar2);
        k1.g.a(this.f7885s, gVar2);
    }

    public final String toString() {
        return this.f7884r.toString();
    }
}
