package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) h0.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
