package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class baf extends bky implements Cloneable {
    private boolean A;
    private boolean B;
    private final bah q;
    private final Class r;
    private final azu s;
    private bai t;
    private Object u;
    private List v;
    private baf w;
    private baf x;
    private Float y;
    private boolean z = true;

    static {
    }

    protected baf(azj azjVar, bah bahVar, Class cls) {
        this.q = bahVar;
        this.r = cls;
        azu azuVar = bahVar.a.c;
        bai baiVar = (bai) azuVar.c.get(cls);
        if (baiVar == null) {
            for (Map.Entry entry : azuVar.c.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    baiVar = (bai) entry.getValue();
                }
            }
        }
        this.t = baiVar == null ? azu.a : baiVar;
        this.s = azjVar.c;
        Iterator it = bahVar.d.iterator();
        while (it.hasNext()) {
            a((ble) it.next());
        }
        f(bahVar.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final blb J(Object obj, bln blnVar, bld bldVar, bai baiVar, azw azwVar, int i, int i2, bky bkyVar, Executor executor) {
        bld bldVar2;
        bld bldVar3;
        blb K;
        azw azwVar2;
        baf bafVar = this;
        bky bkyVar2 = bkyVar;
        if (bafVar.x != null) {
            bldVar2 = new bkz(obj, bldVar);
            bldVar3 = bldVar2;
        } else {
            bldVar2 = bldVar;
            bldVar3 = null;
        }
        baf bafVar2 = bafVar.w;
        if (bafVar2 == null) {
            K = bafVar.K(obj, blnVar, bkyVar2, bldVar2, baiVar, azwVar, i, i2, executor);
        } else {
            if (bafVar.B) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            bai baiVar2 = true == bafVar2.z ? baiVar : bafVar2.t;
            if (super.D(8)) {
                azwVar2 = bafVar2.c;
            } else {
                int i3 = bae.b[azwVar.ordinal()];
                if (i3 == 1) {
                    azwVar2 = azw.c;
                } else if (i3 == 2) {
                    azwVar2 = azw.b;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(bafVar.c))));
                    }
                    azwVar2 = azw.a;
                }
            }
            azw azwVar3 = azwVar2;
            baf bafVar3 = bafVar.w;
            int i4 = bafVar3.f;
            int i5 = bafVar3.e;
            if (bmi.k(i, i2) && !bafVar.w.E()) {
                i4 = bkyVar2.f;
                i5 = bkyVar2.e;
            }
            int i6 = i5;
            int i7 = i4;
            blh blhVar = new blh(obj, bldVar2);
            blb K2 = bafVar.K(obj, blnVar, bkyVar2, blhVar, baiVar, azwVar, i, i2, executor);
            bafVar.B = true;
            baf bafVar4 = bafVar.w;
            blb J = bafVar4.J(obj, blnVar, blhVar, baiVar2, azwVar3, i7, i6, bafVar4, executor);
            bafVar.B = false;
            blhVar.a = K2;
            blhVar.b = J;
            bafVar = bafVar;
            K = blhVar;
            bkyVar2 = bkyVar;
        }
        if (bldVar3 == null) {
            return K;
        }
        baf bafVar5 = bafVar.x;
        int i8 = bafVar5.f;
        int i9 = bafVar5.e;
        if (bmi.k(i, i2) && !bafVar.x.E()) {
            i8 = bkyVar2.f;
            i9 = bkyVar2.e;
        }
        baf bafVar6 = bafVar.x;
        bkz bkzVar = bldVar3;
        blb J2 = bafVar6.J(obj, blnVar, bkzVar, bafVar6.t, bafVar6.c, i8, i9, bafVar6, executor);
        bkzVar.a = K;
        bkzVar.b = J2;
        return bkzVar;
    }

    private final blb K(Object obj, bln blnVar, bky bkyVar, bld bldVar, bai baiVar, azw azwVar, int i, int i2, Executor executor) {
        Object obj2 = this.u;
        List list = this.v;
        a aVar = baiVar.a;
        Class cls = this.r;
        azu azuVar = this.s;
        return new blg(azuVar, obj, obj2, cls, bkyVar, i, i2, azwVar, blnVar, list, bldVar, azuVar.d, executor);
    }

    public baf a(ble bleVar) {
        if (this.n) {
            return g().a(bleVar);
        }
        if (bleVar != null) {
            if (this.v == null) {
                this.v = new ArrayList();
            }
            this.v.add(bleVar);
        }
        H();
        return this;
    }

    @Override // defpackage.bky
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public baf f(bky bkyVar) {
        a.v(bkyVar, "Argument must not be null");
        return (baf) super.f(bkyVar);
    }

    @Override // defpackage.bky
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public baf g() {
        baf bafVar = (baf) super.g();
        bafVar.t = bafVar.t.clone();
        List list = bafVar.v;
        if (list != null) {
            bafVar.v = new ArrayList(list);
        }
        baf bafVar2 = bafVar.w;
        if (bafVar2 != null) {
            bafVar.w = bafVar2.g();
        }
        baf bafVar3 = bafVar.x;
        if (bafVar3 != null) {
            bafVar.x = bafVar3.g();
        }
        return bafVar;
    }

    public baf d(Object obj) {
        return e(obj);
    }

    public final baf e(Object obj) {
        if (this.n) {
            return g().e(obj);
        }
        this.u = obj;
        this.A = true;
        H();
        return this;
    }

    @Override // defpackage.bky
    public final boolean equals(Object obj) {
        if (obj instanceof baf) {
            baf bafVar = (baf) obj;
            if (super.equals(bafVar) && Objects.equals(this.r, bafVar.r) && this.t.equals(bafVar.t) && Objects.equals(this.u, bafVar.u) && Objects.equals(this.v, bafVar.v) && Objects.equals(this.w, bafVar.w) && Objects.equals(this.x, bafVar.x)) {
                Float f = bafVar.y;
                if (Objects.equals(null, null) && this.z == bafVar.z && this.A == bafVar.A) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(ImageView imageView) {
        bky bkyVar;
        Class cls;
        bln bllVar;
        bmi.f();
        a.v(imageView, "Argument must not be null");
        if (!super.D(2048) && this.i && imageView.getScaleType() != null) {
            switch (bae.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    bkyVar = g().p();
                    break;
                case 2:
                    bkyVar = g().q();
                    break;
                case 3:
                case 4:
                case 5:
                    bkyVar = g().r();
                    break;
                case 6:
                    bkyVar = g().q();
                    break;
            }
            azu azuVar = this.s;
            cls = this.r;
            a aVar = azuVar.g;
            if (!Bitmap.class.equals(cls)) {
                bllVar = new blj(imageView);
            } else {
                if (!Drawable.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException(a.aa(cls, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)"));
                }
                bllVar = new bll(imageView);
            }
            i(bllVar, bkyVar, bma.a);
        }
        bkyVar = this;
        azu azuVar2 = this.s;
        cls = this.r;
        a aVar2 = azuVar2.g;
        if (!Bitmap.class.equals(cls)) {
        }
        i(bllVar, bkyVar, bma.a);
    }

    @Override // defpackage.bky
    public final int hashCode() {
        return (((bmi.c(null, bmi.c(this.x, bmi.c(this.w, bmi.c(this.v, bmi.c(this.u, bmi.c(this.t, bmi.c(this.r, super.hashCode()))))))) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0);
    }

    public final void i(bln blnVar, bky bkyVar, Executor executor) {
        a.v(blnVar, "Argument must not be null");
        if (!this.A) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        blb J = J(new Object(), blnVar, null, this.t, bkyVar.c, bkyVar.f, bkyVar.e, bkyVar, executor);
        blb a = blnVar.a();
        if (!J.m(a) || (!bkyVar.d && a.l())) {
            bah bahVar = this.q;
            bahVar.f(blnVar);
            blnVar.c(J);
            bahVar.n(blnVar, J);
            return;
        }
        a.v(a, "Argument must not be null");
        if (a.n()) {
            return;
        }
        a.b();
    }
}
