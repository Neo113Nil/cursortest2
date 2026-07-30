package M0;

import G0.s;
import G0.t;
import P0.p;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f1725f;

    static {
        String f7 = s.f("NetworkMeteredCtrlr");
        Intrinsics.checkNotNullExpressionValue(f7, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f1725f = f7;
    }

    @Override // M0.b
    public final boolean a(p workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.f794a == t.f829m;
    }

    @Override // M0.b
    public final boolean b(Object obj) {
        L0.a value = (L0.a) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            return (value.f1656a && value.f1658c) ? false : true;
        }
        s.d().a(f1725f, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !value.f1656a;
    }
}
