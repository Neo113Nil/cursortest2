package o4;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
@x("activity")
/* loaded from: classes.dex */
public class b extends y {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f5619c;

    public b(Context context) {
        Object obj;
        q6.i.e(context, "context");
        Iterator it = x6.g.b0(context, new j0.l(7)).iterator();
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
        this.f5619c = (Activity) obj;
    }

    @Override // o4.y
    public final o a() {
        return new a(this);
    }

    @Override // o4.y
    public final o c(o oVar) {
        throw new IllegalStateException(("Destination " + ((a) oVar).f5671e.f4348a + " does not have an Intent set.").toString());
    }

    @Override // o4.y
    public final boolean f() {
        Activity activity = this.f5619c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
