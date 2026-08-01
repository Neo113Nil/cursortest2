package v;

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
    public final float f3878a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3879b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3880c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3881e;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f3878a = Float.NaN;
        this.f3879b = Float.NaN;
        this.f3880c = Float.NaN;
        this.d = Float.NaN;
        this.f3881e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f3992j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3881e);
                this.f3881e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f3879b = obtainStyledAttributes.getDimension(index, this.f3879b);
            } else if (index == 3) {
                this.f3880c = obtainStyledAttributes.getDimension(index, this.f3880c);
            } else if (index == 4) {
                this.f3878a = obtainStyledAttributes.getDimension(index, this.f3878a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
