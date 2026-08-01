package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class d1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) e1.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
