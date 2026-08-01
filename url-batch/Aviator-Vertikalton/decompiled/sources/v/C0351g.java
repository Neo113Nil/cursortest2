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
public final class C0351g {

    /* renamed from: a, reason: collision with root package name */
    public final float f4322a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4323b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4324c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4325d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4326e;

    public C0351g(Context context, XmlResourceParser xmlResourceParser) {
        this.f4322a = Float.NaN;
        this.f4323b = Float.NaN;
        this.f4324c = Float.NaN;
        this.f4325d = Float.NaN;
        this.f4326e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f4444j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4326e);
                this.f4326e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4325d = obtainStyledAttributes.getDimension(index, this.f4325d);
            } else if (index == 2) {
                this.f4323b = obtainStyledAttributes.getDimension(index, this.f4323b);
            } else if (index == 3) {
                this.f4324c = obtainStyledAttributes.getDimension(index, this.f4324c);
            } else if (index == 4) {
                this.f4322a = obtainStyledAttributes.getDimension(index, this.f4322a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
