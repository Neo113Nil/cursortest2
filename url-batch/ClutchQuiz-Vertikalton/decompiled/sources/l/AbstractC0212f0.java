package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: l.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0212f0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0214g0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
