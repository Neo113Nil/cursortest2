package n4;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ln4/b;", "Ln4/h0;", "Ln4/a;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@g0("activity")
/* loaded from: classes.dex */
public class b extends h0 {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f7030c;

    public b(Context context) {
        Object obj;
        context.getClass();
        Iterator it = de.k.c(context, new m2.u(13)).iterator();
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
        this.f7030c = (Activity) obj;
    }

    @Override // n4.h0
    public final s a() {
        return new a(this);
    }

    @Override // n4.h0
    public final s c(s sVar) {
        throw new IllegalStateException(("Destination " + ((a) sVar).f7115e.f1694a + " does not have an Intent set.").toString());
    }

    @Override // n4.h0
    public final boolean f() {
        Activity activity = this.f7030c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
