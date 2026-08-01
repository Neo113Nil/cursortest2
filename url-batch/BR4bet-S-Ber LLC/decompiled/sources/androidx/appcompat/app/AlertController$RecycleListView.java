package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.z00;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int f;
    public final int g;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.t);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
