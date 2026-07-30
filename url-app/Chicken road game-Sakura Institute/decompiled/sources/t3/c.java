package t3;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
@f0("activity")
/* loaded from: classes.dex */
public class c extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f8771c;

    public c(Context context) {
        Object obj;
        r6.k.f(context, "context");
        Iterator it = y6.h.o(context, b.f8737h).iterator();
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
        this.f8771c = (Activity) obj;
    }

    @Override // t3.g0
    public final v a() {
        return new a(this);
    }

    @Override // t3.g0
    public final v c(v vVar) {
        throw new IllegalStateException(("Destination " + ((a) vVar).f8862k + " does not have an Intent set.").toString());
    }

    @Override // t3.g0
    public final boolean f() {
        Activity activity = this.f8771c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
