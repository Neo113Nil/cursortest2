package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import e.a;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: f, reason: collision with root package name */
    public final int f147f;
    public final int g;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1511t);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f147f = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
