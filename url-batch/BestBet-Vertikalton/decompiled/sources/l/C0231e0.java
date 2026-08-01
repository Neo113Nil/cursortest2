package l;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

/* renamed from: l.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231e0 extends C0227c0 {
    @Override // l.C0227c0, l.AbstractC0233f0
    public void a(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // l.AbstractC0233f0
    public boolean b(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}
