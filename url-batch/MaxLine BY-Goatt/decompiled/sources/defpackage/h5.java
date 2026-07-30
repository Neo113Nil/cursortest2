package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h5 extends pr2 implements Function2 {
    public final /* synthetic */ zn1 A;
    public final /* synthetic */ zn1 B;
    public final /* synthetic */ zn1 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int m = 1;
    public int n;
    public final /* synthetic */ ij1 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ boolean q;
    public fn2 r;
    public final /* synthetic */ zn1 s;
    public final /* synthetic */ zn1 t;
    public final /* synthetic */ zn1 u;
    public final /* synthetic */ zn1 v;
    public final /* synthetic */ zn1 w;
    public final /* synthetic */ zn1 x;
    public final /* synthetic */ zn1 y;
    public final /* synthetic */ zn1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(ij1 ij1Var, long j, boolean z, fn2 fn2Var, Function0 function0, zn1 zn1Var, zn1 zn1Var2, zn1 zn1Var3, zn1 zn1Var4, zn1 zn1Var5, zn1 zn1Var6, zn1 zn1Var7, zn1 zn1Var8, zn1 zn1Var9, zn1 zn1Var10, zn1 zn1Var11, o30 o30Var) {
        super(2, o30Var);
        this.o = ij1Var;
        this.p = j;
        this.q = z;
        this.r = fn2Var;
        this.D = function0;
        this.s = zn1Var;
        this.t = zn1Var2;
        this.u = zn1Var3;
        this.v = zn1Var4;
        this.w = zn1Var5;
        this.x = zn1Var6;
        this.y = zn1Var7;
        this.z = zn1Var8;
        this.A = zn1Var9;
        this.B = zn1Var10;
        this.C = zn1Var11;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.D;
        switch (i) {
            case 0:
                return new h5(this.q, this.o, this.p, (fn2) obj2, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, o30Var);
            default:
                return new h5(this.o, this.p, this.q, this.r, (Function0) obj2, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, o30Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((h5) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:13|(1:15)(1:51)|16|(2:17|18)|(16:20|21|22|(1:24)(1:47)|25|26|27|(9:29|30|31|(1:33)(1:43)|34|(1:36)(1:42)|37|38|(1:40))|45|31|(0)(0)|34|(0)(0)|37|38|(0))|49|22|(0)(0)|25|26|27|(0)|45|31|(0)(0)|34|(0)(0)|37|38|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019c, code lost:
    
        if (r5 == r4) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd A[Catch: NumberFormatException -> 0x00d8, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00d8, blocks: (B:27:0x00c7, B:29:0x00cd), top: B:26:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z51 z51Var;
        Object U;
        Object U2;
        fn2 fn2Var;
        Double d;
        String l;
        Double d2;
        a61 a61Var;
        w0 w0Var;
        z51 z51Var2;
        int i = this.m;
        Object obj2 = this.D;
        zn1 zn1Var = this.C;
        boolean z = this.q;
        zn1 zn1Var2 = this.B;
        zn1 zn1Var3 = this.A;
        zn1 zn1Var4 = this.z;
        zn1 zn1Var5 = this.y;
        zn1 zn1Var6 = this.x;
        zn1 zn1Var7 = this.w;
        zn1 zn1Var8 = this.v;
        zn1 zn1Var9 = this.u;
        zn1 zn1Var10 = this.t;
        zn1 zn1Var11 = this.s;
        ij1 ij1Var = this.o;
        switch (i) {
            case 0:
                fn2 fn2Var2 = (fn2) obj2;
                z51 z51Var3 = ij1Var.c;
                b50 b50Var = b50.m;
                int i2 = this.n;
                long j = this.p;
                if (i2 == 0) {
                    ca2.b(obj);
                    if (z) {
                        this.n = 1;
                        z51Var = z51Var3;
                        U = l41.U(this, z51Var3.a, new u51(j, 5), true, false);
                        break;
                    }
                } else if (i2 == 1) {
                    ca2.b(obj);
                    U = obj;
                    z51Var = z51Var3;
                } else if (i2 != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    fn2Var = this.r;
                    ca2.b(obj);
                    U2 = obj;
                    fn2Var.addAll((Collection) U2);
                    break;
                }
                a61 a61Var2 = (a61) U;
                if (a61Var2 != null) {
                    zn1Var11.setValue(a61Var2.b);
                    zn1Var10.setValue(a61Var2.c);
                    zn1Var9.setValue(a61Var2.d);
                    String str = a61Var2.e;
                    String str2 = BuildConfig.FLAVOR;
                    if (str == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    zn1Var8.setValue(str);
                    Double d3 = a61Var2.f;
                    String d4 = d3 != null ? d3.toString() : null;
                    if (d4 == null) {
                        d4 = BuildConfig.FLAVOR;
                    }
                    zn1Var7.setValue(d4);
                    Double d5 = a61Var2.i;
                    String d6 = d5 != null ? d5.toString() : null;
                    zn1Var6.setValue(d6 == null ? BuildConfig.FLAVOR : d6);
                    String str3 = a61Var2.h;
                    if (str3 == null) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    zn1Var5.setValue(str3);
                    String str4 = a61Var2.j;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    zn1Var4.setValue(str2);
                    zn1Var3.setValue(a61Var2.k);
                    zn1Var2.setValue(a61Var2.g);
                    zn1Var.setValue(Long.valueOf(a61Var2.m));
                }
                fn2Var2.clear();
                this.r = fn2Var2;
                this.n = 2;
                U2 = l41.U(this, z51Var.a, new u51(j, 0), true, false);
                if (U2 != b50Var) {
                    fn2Var = fn2Var2;
                    fn2Var.addAll((Collection) U2);
                }
                break;
            default:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    String obj3 = up2.K((String) zn1Var11.getValue()).toString();
                    String str5 = (String) zn1Var10.getValue();
                    String str6 = (String) zn1Var9.getValue();
                    String obj4 = up2.K((String) zn1Var8.getValue()).toString();
                    o30 o30Var = null;
                    String str7 = up2.y(obj4) ? null : obj4;
                    String l2 = tp2.l((String) zn1Var7.getValue(), ',', '.');
                    if (sp2.e(l2)) {
                        d = Double.valueOf(Double.parseDouble(l2));
                        Long l3 = (Long) zn1Var6.getValue();
                        String obj5 = up2.K((String) zn1Var5.getValue()).toString();
                        String str8 = !up2.y(obj5) ? null : obj5;
                        l = tp2.l((String) zn1Var4.getValue(), ',', '.');
                        if (sp2.e(l)) {
                            d2 = Double.valueOf(Double.parseDouble(l));
                            String obj6 = up2.K((String) zn1Var3.getValue()).toString();
                            a61Var = new a61(this.p, obj3, str5, str6, str7, d, l3, str8, d2, up2.y(obj6) ? null : obj6, (String) zn1Var2.getValue(), false, z ? ((Number) zn1Var.getValue()).longValue() : System.currentTimeMillis());
                            fn2 fn2Var3 = this.r;
                            fn2Var3.getClass();
                            w0Var = tk3.Q(fn2Var3).c;
                            this.n = 1;
                            z51Var2 = ij1Var.c;
                            if (l41.T(z51Var2.a, new mg2(z51Var2, a61Var, w0Var, o30Var, 2), this) == b50Var2) {
                                break;
                            }
                        }
                        d2 = null;
                        String obj62 = up2.K((String) zn1Var3.getValue()).toString();
                        a61Var = new a61(this.p, obj3, str5, str6, str7, d, l3, str8, d2, up2.y(obj62) ? null : obj62, (String) zn1Var2.getValue(), false, z ? ((Number) zn1Var.getValue()).longValue() : System.currentTimeMillis());
                        fn2 fn2Var32 = this.r;
                        fn2Var32.getClass();
                        w0Var = tk3.Q(fn2Var32).c;
                        this.n = 1;
                        z51Var2 = ij1Var.c;
                        if (l41.T(z51Var2.a, new mg2(z51Var2, a61Var, w0Var, o30Var, 2), this) == b50Var2) {
                        }
                    }
                    d = null;
                    Long l32 = (Long) zn1Var6.getValue();
                    String obj52 = up2.K((String) zn1Var5.getValue()).toString();
                    if (!up2.y(obj52)) {
                    }
                    l = tp2.l((String) zn1Var4.getValue(), ',', '.');
                    if (sp2.e(l)) {
                    }
                    d2 = null;
                    String obj622 = up2.K((String) zn1Var3.getValue()).toString();
                    a61Var = new a61(this.p, obj3, str5, str6, str7, d, l32, str8, d2, up2.y(obj622) ? null : obj622, (String) zn1Var2.getValue(), false, z ? ((Number) zn1Var.getValue()).longValue() : System.currentTimeMillis());
                    fn2 fn2Var322 = this.r;
                    fn2Var322.getClass();
                    w0Var = tk3.Q(fn2Var322).c;
                    this.n = 1;
                    z51Var2 = ij1Var.c;
                    if (l41.T(z51Var2.a, new mg2(z51Var2, a61Var, w0Var, o30Var, 2), this) == b50Var2) {
                    }
                } else if (i3 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                ((Function0) obj2).invoke();
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(boolean z, ij1 ij1Var, long j, fn2 fn2Var, zn1 zn1Var, zn1 zn1Var2, zn1 zn1Var3, zn1 zn1Var4, zn1 zn1Var5, zn1 zn1Var6, zn1 zn1Var7, zn1 zn1Var8, zn1 zn1Var9, zn1 zn1Var10, zn1 zn1Var11, o30 o30Var) {
        super(2, o30Var);
        this.q = z;
        this.o = ij1Var;
        this.p = j;
        this.D = fn2Var;
        this.s = zn1Var;
        this.t = zn1Var2;
        this.u = zn1Var3;
        this.v = zn1Var4;
        this.w = zn1Var5;
        this.x = zn1Var6;
        this.y = zn1Var7;
        this.z = zn1Var8;
        this.A = zn1Var9;
        this.B = zn1Var10;
        this.C = zn1Var11;
    }
}
