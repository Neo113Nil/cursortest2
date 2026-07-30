package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h71 implements w71 {
    public static final c51 j = new c51(new j61(21), 3, new k61(6));
    public final xu0 a;
    public float f;
    public final xr h;
    public final xr i;
    public final xu0 b = new xu0(0);
    public final xu0 c = new xu0(0);
    public final gn0 d = new gn0();
    public final xu0 e = new xu0(Integer.MAX_VALUE);
    public final jb g = new jb(new l(19, this));

    public h71(int i) {
        this.a = new xu0(i);
        final int i2 = 0;
        this.h = gb0.o(new Function0(this) { // from class: g71
            public final /* synthetic */ h71 e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                h71 h71Var = this.e;
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Boolean.valueOf(h71Var.a.h() < h71Var.e.h());
                    default:
                        return Boolean.valueOf(h71Var.a.h() > 0);
                }
            }
        });
        final int i3 = 1;
        this.i = gb0.o(new Function0(this) { // from class: g71
            public final /* synthetic */ h71 e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                h71 h71Var = this.e;
                switch (i32) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Boolean.valueOf(h71Var.a.h() < h71Var.e.h());
                    default:
                        return Boolean.valueOf(h71Var.a.h() > 0);
                }
            }
        });
    }

    @Override // defpackage.w71
    public final boolean a() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.w71
    public final boolean b() {
        return this.g.b();
    }

    @Override // defpackage.w71
    public final Object c(go0 go0Var, Function2 function2, fn fnVar) {
        Object c = this.g.c(go0Var, function2, fnVar);
        return c == tn.d ? c : Unit.a;
    }

    @Override // defpackage.w71
    public final boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.w71
    public final float e(float f) {
        return this.g.e(f);
    }
}
