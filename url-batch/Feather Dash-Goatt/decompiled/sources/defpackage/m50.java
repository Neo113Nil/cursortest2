package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lm50;", "Lem0;", "Lra1;", "ui"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class m50 extends em0 {
    public final float a;
    public final float b;
    public final long c;
    public final u91 d;
    public final boolean e;
    public final long f;
    public final long g;

    public m50(float f, float f2, long j, u91 u91Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = u91Var;
        this.e = z;
        this.f = j2;
        this.g = j3;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        ra1 ra1Var = new ra1();
        ra1Var.s = 1.0f;
        ra1Var.t = 1.0f;
        ra1Var.u = this.a;
        ra1Var.v = this.b;
        ra1Var.w = 8.0f;
        ra1Var.x = this.c;
        ra1Var.y = this.d;
        ra1Var.z = this.e;
        ra1Var.A = this.f;
        ra1Var.B = this.g;
        ra1Var.C = 3;
        ra1Var.D = new a3(23, ra1Var);
        return ra1Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        qp0 qp0Var;
        ra1 ra1Var = (ra1) zl0Var;
        ra1Var.s = 1.0f;
        ra1Var.t = 1.0f;
        ra1Var.u = this.a;
        ra1Var.v = this.b;
        ra1Var.w = 8.0f;
        ra1Var.x = this.c;
        ra1Var.y = this.d;
        ra1Var.z = this.e;
        ra1Var.A = this.f;
        ra1Var.B = this.g;
        ra1Var.C = 3;
        a3 a3Var = ra1Var.D;
        if (ra1Var.d.r && (qp0Var = op.G(ra1Var, 2).t) != null) {
            qp0Var.e1(a3Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m50) {
            m50 m50Var = (m50) obj;
            if (Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.a, m50Var.a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.b, m50Var.b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0) {
                long j = m50Var.c;
                int i = aj1.b;
                if (this.c == j && Intrinsics.a(this.d, m50Var.d) && this.e == m50Var.e && hi.c(this.f, m50Var.f) && hi.c(this.g, m50Var.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int b = qy0.b(8.0f, qy0.b(0.0f, qy0.b(0.0f, qy0.b(0.0f, qy0.b(this.b, qy0.b(0.0f, qy0.b(0.0f, qy0.b(this.a, qy0.b(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = aj1.b;
        int d = qy0.d((this.d.hashCode() + qy0.e(this.c, b, 31)) * 31, 961, this.e);
        int i2 = hi.h;
        jk1 jk1Var = kk1.d;
        return qy0.c(3, qy0.c(0, qy0.e(this.g, qy0.e(this.f, d, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.a);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.b);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        int i = aj1.b;
        sb.append((Object) ("TransformOrigin(packedValue=" + this.c + ')'));
        sb.append(", shape=");
        sb.append(this.d);
        sb.append(", clip=");
        sb.append(this.e);
        sb.append(", renderEffect=null, ambientShadowColor=");
        qy0.r(this.f, sb, ", spotShadowColor=");
        sb.append((Object) hi.i(this.g));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) m90.N(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
