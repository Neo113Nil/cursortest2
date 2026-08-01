package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.a;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: f, reason: collision with root package name */
    public final int f120f;

    /* renamed from: g, reason: collision with root package name */
    public final int f121g;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1257t);
        this.f121g = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f120f = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
