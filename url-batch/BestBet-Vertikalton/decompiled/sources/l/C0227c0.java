package l;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: l.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0227c0 extends AbstractC0233f0 {
    @Override // l.AbstractC0233f0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0235g0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
