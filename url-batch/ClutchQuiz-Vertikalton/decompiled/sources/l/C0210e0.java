package l;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

/* renamed from: l.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210e0 extends C0208d0 {
    @Override // l.C0208d0, l.AbstractC0212f0
    public void a(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // l.AbstractC0212f0
    public boolean b(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}
