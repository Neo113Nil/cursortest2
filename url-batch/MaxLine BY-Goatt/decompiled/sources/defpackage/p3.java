package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@br1("activity")
/* loaded from: classes.dex */
public class p3 extends cr1 {
    public final Activity c;

    public p3(Context context) {
        Object obj;
        context.getClass();
        Iterator it = aj2.c(context, o3.n).iterator();
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
        this.c = (Activity) obj;
    }

    @Override // defpackage.cr1
    public final op1 a() {
        return new n3(this);
    }

    @Override // defpackage.cr1
    public final op1 c(op1 op1Var) {
        throw new IllegalStateException(("Destination " + ((n3) op1Var).r + " does not have an Intent set.").toString());
    }

    @Override // defpackage.cr1
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
