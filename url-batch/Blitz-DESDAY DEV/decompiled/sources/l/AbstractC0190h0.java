package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: l.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0190h0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0192i0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
