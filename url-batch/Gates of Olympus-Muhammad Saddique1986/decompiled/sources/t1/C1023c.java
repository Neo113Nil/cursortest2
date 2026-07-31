package t1;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

@InterfaceC1018F("activity")
/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1023c extends AbstractC1019G {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f8867c;

    public C1023c(Context context) {
        Object obj;
        f2.j.f(context, "context");
        Iterator it = m2.h.T(context, C1022b.f8856f).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f8867c = (Activity) obj;
    }

    @Override // t1.AbstractC1019G
    public final u a() {
        return new C1021a(this);
    }

    @Override // t1.AbstractC1019G
    public final u c(u uVar) {
        throw new IllegalStateException(("Destination " + ((C1021a) uVar).f8936i + " does not have an Intent set.").toString());
    }

    @Override // t1.AbstractC1019G
    public final boolean f() {
        Activity activity = this.f8867c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
