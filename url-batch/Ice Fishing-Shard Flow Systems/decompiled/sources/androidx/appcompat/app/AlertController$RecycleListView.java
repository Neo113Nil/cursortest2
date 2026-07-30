package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import h.AbstractC0454a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: d, reason: collision with root package name */
    public final int f3106d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3107e;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0454a.f5055t);
        this.f3107e = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f3106d = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
