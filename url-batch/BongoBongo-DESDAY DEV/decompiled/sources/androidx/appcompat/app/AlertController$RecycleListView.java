package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.AbstractC0097a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f1305a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1306b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f2153t);
        this.f1306b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1305a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
