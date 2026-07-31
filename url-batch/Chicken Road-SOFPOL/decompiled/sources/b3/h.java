package b3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f1132a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1133b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1134c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1135d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1136e;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f1132a = Float.NaN;
        this.f1133b = Float.NaN;
        this.f1134c = Float.NaN;
        this.f1135d = Float.NaN;
        this.f1136e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f1236j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f1136e);
                this.f1136e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f1135d = obtainStyledAttributes.getDimension(index, this.f1135d);
            } else if (index == 2) {
                this.f1133b = obtainStyledAttributes.getDimension(index, this.f1133b);
            } else if (index == 3) {
                this.f1134c = obtainStyledAttributes.getDimension(index, this.f1134c);
            } else if (index == 4) {
                this.f1132a = obtainStyledAttributes.getDimension(index, this.f1132a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
