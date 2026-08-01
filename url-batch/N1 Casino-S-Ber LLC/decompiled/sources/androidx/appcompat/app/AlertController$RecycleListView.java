package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.wx;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int f;
    public final int g;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wx.t);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
