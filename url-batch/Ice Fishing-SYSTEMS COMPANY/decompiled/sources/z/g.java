package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f41975a;

    /* renamed from: b, reason: collision with root package name */
    public final float f41976b;

    /* renamed from: c, reason: collision with root package name */
    public final float f41977c;

    /* renamed from: d, reason: collision with root package name */
    public final float f41978d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41979e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f41975a = Float.NaN;
        this.f41976b = Float.NaN;
        this.f41977c = Float.NaN;
        this.f41978d = Float.NaN;
        this.f41979e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f42102j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f41979e);
                this.f41979e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f41978d = obtainStyledAttributes.getDimension(index, this.f41978d);
            } else if (index == 2) {
                this.f41976b = obtainStyledAttributes.getDimension(index, this.f41976b);
            } else if (index == 3) {
                this.f41977c = obtainStyledAttributes.getDimension(index, this.f41977c);
            } else if (index == 4) {
                this.f41975a = obtainStyledAttributes.getDimension(index, this.f41975a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
