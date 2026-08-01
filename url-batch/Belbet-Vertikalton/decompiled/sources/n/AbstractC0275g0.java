package n;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: n.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0275g0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0277h0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
