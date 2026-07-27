package s1;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@G("activity")
/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1187c extends H {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f10501c;

    public C1187c(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator it = T2.n.f(context, C1186b.f10489e).iterator();
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
        this.f10501c = (Activity) obj;
    }

    @Override // s1.H
    public final v a() {
        Intrinsics.checkNotNullParameter(this, "activityNavigator");
        return new C1185a(this);
    }

    @Override // s1.H
    public final v c(v vVar) {
        C1185a destination = (C1185a) vVar;
        Intrinsics.checkNotNullParameter(destination, "destination");
        throw new IllegalStateException(("Destination " + destination.f10575l + " does not have an Intent set.").toString());
    }

    @Override // s1.H
    public final boolean f() {
        Activity activity = this.f10501c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
