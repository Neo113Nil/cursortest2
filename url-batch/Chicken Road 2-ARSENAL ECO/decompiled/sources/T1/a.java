package T1;

import android.app.Activity;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class a implements d {
    @Override // T1.d
    public void onActivityAvailable(Activity activity) {
        i.e(activity, "activity");
    }

    @Override // T1.d
    public void onActivityStopped(Activity activity) {
        i.e(activity, "activity");
    }
}
