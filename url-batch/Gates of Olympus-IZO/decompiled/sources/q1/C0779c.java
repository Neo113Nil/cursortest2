package q1;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

@I("activity")
/* renamed from: q1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0779c extends J {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f6888c;

    public C0779c(Context context) {
        Object obj;
        Z1.i.f(context, "context");
        Iterator it = g2.h.c0(context, C0778b.f6877f).iterator();
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
        this.f6888c = (Activity) obj;
    }

    @Override // q1.J
    public final w a() {
        return new C0777a(this);
    }

    @Override // q1.J
    public final w c(w wVar) {
        throw new IllegalStateException(("Destination " + ((C0777a) wVar).f6967i + " does not have an Intent set.").toString());
    }

    @Override // q1.J
    public final boolean f() {
        Activity activity = this.f6888c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
