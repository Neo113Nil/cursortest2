package com.baidu.ar;

/* loaded from: classes.dex */
public class zb extends y2 {

    /* renamed from: e, reason: collision with root package name */
    public nd f3825e;

    /* renamed from: f, reason: collision with root package name */
    public d7 f3826f;

    public zb(c7 c7Var, nd ndVar, int i8, int i9) {
        super(c7Var, i8, i9);
        this.f3825e = ndVar;
    }

    public final int a(float[] fArr, int i8) {
        return 90.0f - ((float) (((Math.acos((double) (-fArr[10])) * 180.0d) * 1.0d) / 3.141592653589793d)) > ((float) i8) ? 0 : 1;
    }

    public void a(d7 d7Var) {
        this.f3826f = d7Var;
    }

    @Override // com.baidu.ar.y2, com.baidu.ar.s6
    public boolean a(float[] fArr) {
        float[] a8 = this.f3826f.a(this.f3825e.c(), fArr);
        if (a8 != null) {
            String a9 = this.f3743a.a(this.f3825e);
            int i8 = (int) a8[0];
            if (i8 == 0) {
                int a10 = a(fArr, this.f3825e.c());
                if (a10 == 0) {
                    this.f3743a.c();
                } else if (a10 == 1) {
                    this.f3743a.d();
                }
                this.f3743a.a(new float[16]);
            } else if (i8 == 1) {
                this.f3743a.a(a9, (int) a8[1], (int) a8[2], y2.f3742d, this.f3825e.a());
                this.f3743a.b();
                return true;
            }
        }
        return false;
    }
}
