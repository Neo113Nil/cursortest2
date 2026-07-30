package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: m.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4730d0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C4732e0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
