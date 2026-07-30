package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ok1 extends FrameLayout implements mv {
    public final CollapsibleActionView m;

    /* JADX WARN: Multi-variable type inference failed */
    public ok1(View view) {
        super(view.getContext());
        this.m = (CollapsibleActionView) view;
        addView(view);
    }
}
