package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: l.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0265i0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0267j0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
