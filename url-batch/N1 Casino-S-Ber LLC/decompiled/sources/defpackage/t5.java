package defpackage;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class t5 extends v5 {
    @Override // defpackage.v5
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) w5.e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
