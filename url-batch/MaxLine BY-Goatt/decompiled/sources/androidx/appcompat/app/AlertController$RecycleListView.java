package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.b62;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int m;
    public final int n;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b62.t);
        this.n = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.m = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
