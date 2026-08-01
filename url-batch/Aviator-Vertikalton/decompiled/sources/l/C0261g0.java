package l;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: l.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0261g0 extends AbstractC0265i0 {
    @Override // l.AbstractC0265i0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0267j0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
