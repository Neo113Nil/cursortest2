package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.a;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: f, reason: collision with root package name */
    public final int f253f;

    /* renamed from: g, reason: collision with root package name */
    public final int f254g;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1406t);
        this.f254g = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f253f = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
