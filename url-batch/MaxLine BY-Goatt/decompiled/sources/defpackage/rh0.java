package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rh0 extends pr2 implements Function2 {
    public List m;
    public uw1 n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ sh0 s;
    public final /* synthetic */ lh0 t;
    public final /* synthetic */ uw1 u;
    public final /* synthetic */ List v;
    public final /* synthetic */ oi0 w;
    public final /* synthetic */ r01 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh0(sh0 sh0Var, lh0 lh0Var, uw1 uw1Var, List list, oi0 oi0Var, r01 r01Var, o30 o30Var) {
        super(2, o30Var);
        this.s = sh0Var;
        this.t = lh0Var;
        this.u = uw1Var;
        this.v = list;
        this.w = oi0Var;
        this.x = r01Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        rh0 rh0Var = new rh0(this.s, this.t, this.u, this.v, this.w, this.x, o30Var);
        rh0Var.r = obj;
        return rh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rh0) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        a50 a50Var;
        uw1 uw1Var;
        Bitmap s;
        List list;
        int size;
        int i;
        b50 b50Var = b50.m;
        int i2 = this.q;
        oi0 oi0Var = this.w;
        lh0 lh0Var = this.t;
        if (i2 == 0) {
            ca2.b(obj);
            a50Var = (a50) this.r;
            Drawable drawable = lh0Var.a;
            boolean z = drawable instanceof BitmapDrawable;
            uw1Var = this.u;
            if (z) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (oi.o(l.a, config)) {
                    s = bitmap;
                    oi0Var.getClass();
                    list = this.v;
                    size = list.size();
                    i = 0;
                }
            }
            s = yj1.s(drawable, uw1Var.b, uw1Var.d, uw1Var.e, uw1Var.f);
            oi0Var.getClass();
            list = this.v;
            size = list.size();
            i = 0;
        } else {
            if (i2 != 1) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            size = this.p;
            int i3 = this.o;
            uw1Var = this.n;
            list = this.m;
            a50Var = (a50) this.r;
            ca2.b(obj);
            s = (Bitmap) obj;
            l41.C(a50Var.n());
            i = i3 + 1;
        }
        if (i >= size) {
            oi0Var.getClass();
            return new lh0(new BitmapDrawable(this.x.a.getResources(), s), lh0Var.b, lh0Var.c, lh0Var.d);
        }
        if (list.get(i) != null) {
            b71.o();
            return null;
        }
        pl2 pl2Var = uw1Var.d;
        this.r = a50Var;
        this.m = list;
        this.n = uw1Var;
        this.o = i;
        this.p = size;
        this.q = 1;
        throw null;
    }
}
