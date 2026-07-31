package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class n0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) o0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
