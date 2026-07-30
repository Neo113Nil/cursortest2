package M0;

import G0.t;
import N0.f;
import P0.p;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1719f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, int i2) {
        super(fVar);
        this.f1719f = i2;
    }

    @Override // M0.b
    public final boolean a(p workSpec) {
        switch (this.f1719f) {
            case 0:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f795b;
            case 1:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f797d;
            case 2:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f794a == t.f826e;
            case 3:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                t tVar = workSpec.j.f794a;
                return tVar == t.f827i || (Build.VERSION.SDK_INT >= 30 && tVar == t.f830n);
            default:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f798e;
        }
    }

    @Override // M0.b
    public final boolean b(Object obj) {
        boolean booleanValue;
        switch (this.f1719f) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                L0.a value = (L0.a) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                return Build.VERSION.SDK_INT < 26 ? !value.f1656a : !(value.f1656a && value.f1657b);
            case 3:
                L0.a value2 = (L0.a) obj;
                Intrinsics.checkNotNullParameter(value2, "value");
                return !value2.f1656a || value2.f1658c;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }
}
