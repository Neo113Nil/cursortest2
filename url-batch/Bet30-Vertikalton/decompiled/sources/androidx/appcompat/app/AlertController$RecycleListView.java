package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f1106a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1107b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1941t);
        this.f1107b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1106a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
