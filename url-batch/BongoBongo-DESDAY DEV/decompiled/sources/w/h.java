package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f4062a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4063b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4064c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4065e;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f4062a = Float.NaN;
        this.f4063b = Float.NaN;
        this.f4064c = Float.NaN;
        this.d = Float.NaN;
        this.f4065e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f4180j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4065e);
                this.f4065e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f4063b = obtainStyledAttributes.getDimension(index, this.f4063b);
            } else if (index == 3) {
                this.f4064c = obtainStyledAttributes.getDimension(index, this.f4064c);
            } else if (index == 4) {
                this.f4062a = obtainStyledAttributes.getDimension(index, this.f4062a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
