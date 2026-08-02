package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.em;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AlertController$RecycleListView extends ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, em.u);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }
}
