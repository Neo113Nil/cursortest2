package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eh extends dh {
    @Override // defpackage.dh, defpackage.fh
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.fh
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
