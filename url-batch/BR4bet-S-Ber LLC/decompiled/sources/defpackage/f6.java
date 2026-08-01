package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class f6 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) g6.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
