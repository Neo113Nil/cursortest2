package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import g.AbstractC0122a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f1674a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1675b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0122a.f2711t);
        this.f1675b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1674a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
