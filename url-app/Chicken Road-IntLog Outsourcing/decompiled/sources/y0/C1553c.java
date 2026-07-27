package y0;

import B0.q;
import android.os.Build;
import kotlin.jvm.internal.i;
import s0.s;
import x0.C1535a;

/* renamed from: y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1553c extends AbstractC1552b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f12338f;

    static {
        String f3 = s.f("NetworkMeteredCtrlr");
        i.d(f3, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f12338f = f3;
    }

    @Override // y0.AbstractC1552b
    public final boolean a(q workSpec) {
        i.e(workSpec, "workSpec");
        return workSpec.f182j.f11762a == 5;
    }

    @Override // y0.AbstractC1552b
    public final boolean b(Object obj) {
        C1535a value = (C1535a) obj;
        i.e(value, "value");
        int i2 = Build.VERSION.SDK_INT;
        boolean z = value.f12254a;
        if (i2 < 26) {
            s.d().a(f12338f, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z) {
                return false;
            }
        } else if (z && value.f12256c) {
            return false;
        }
        return true;
    }
}
