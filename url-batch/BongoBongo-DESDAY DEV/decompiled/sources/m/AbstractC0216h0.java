package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: m.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0216h0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0218i0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
