package r0;

import android.os.Build;
import kotlin.jvm.internal.i;
import l0.q;
import q0.C0593a;
import u0.C0686p;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611c extends AbstractC0610b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f5846f;

    static {
        String f7 = q.f("NetworkMeteredCtrlr");
        i.d(f7, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f5846f = f7;
    }

    @Override // r0.AbstractC0610b
    public final boolean a(C0686p workSpec) {
        i.e(workSpec, "workSpec");
        return workSpec.f6009j.f5255a == 5;
    }

    @Override // r0.AbstractC0610b
    public final boolean b(Object obj) {
        C0593a value = (C0593a) obj;
        i.e(value, "value");
        boolean z5 = value.f5749a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z5 && value.f5751c) ? false : true;
        }
        q.d().a(f5846f, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z5;
    }
}
