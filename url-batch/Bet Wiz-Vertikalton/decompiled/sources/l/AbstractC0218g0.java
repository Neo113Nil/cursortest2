package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: l.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0218g0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0220h0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
