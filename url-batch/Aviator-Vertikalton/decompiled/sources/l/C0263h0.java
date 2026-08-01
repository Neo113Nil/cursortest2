package l;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

/* renamed from: l.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263h0 extends C0261g0 {
    @Override // l.C0261g0, l.AbstractC0265i0
    public void a(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // l.AbstractC0265i0
    public boolean b(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}
