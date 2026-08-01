package k;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class d1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) e1.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
