package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353g {

    /* renamed from: a, reason: collision with root package name */
    public final float f4326a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4327b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4328c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4329d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4330e;

    public C0353g(Context context, XmlResourceParser xmlResourceParser) {
        this.f4326a = Float.NaN;
        this.f4327b = Float.NaN;
        this.f4328c = Float.NaN;
        this.f4329d = Float.NaN;
        this.f4330e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f4448j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4330e);
                this.f4330e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4329d = obtainStyledAttributes.getDimension(index, this.f4329d);
            } else if (index == 2) {
                this.f4327b = obtainStyledAttributes.getDimension(index, this.f4327b);
            } else if (index == 3) {
                this.f4328c = obtainStyledAttributes.getDimension(index, this.f4328c);
            } else if (index == 4) {
                this.f4326a = obtainStyledAttributes.getDimension(index, this.f4326a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
