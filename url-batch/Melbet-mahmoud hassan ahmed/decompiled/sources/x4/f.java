package x4;

import android.app.Activity;
import kotlin.jvm.internal.i;
import x4.a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Activity f23194a;

    private final boolean a() {
        Activity activity = this.f23194a;
        i.b(activity);
        return (activity.getWindow().getAttributes().flags & 128) != 0;
    }

    public final a.C0154a b() {
        if (this.f23194a == null) {
            throw new e();
        }
        a.C0154a c0154a = new a.C0154a();
        c0154a.b(Boolean.valueOf(a()));
        return c0154a;
    }

    public final void c(Activity activity) {
        this.f23194a = activity;
    }

    public final void d(a.b bVar) {
        i.d(bVar, "message");
        Activity activity = this.f23194a;
        if (activity == null) {
            throw new e();
        }
        i.b(activity);
        boolean a7 = a();
        Boolean b7 = bVar.b();
        i.b(b7);
        if (b7.booleanValue()) {
            if (a7) {
                return;
            }
            activity.getWindow().addFlags(128);
        } else if (a7) {
            activity.getWindow().clearFlags(128);
        }
    }
}
