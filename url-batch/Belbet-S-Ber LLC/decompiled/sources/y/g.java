package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f4005a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4006b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4007c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4008e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f4005a = Float.NaN;
        this.f4006b = Float.NaN;
        this.f4007c = Float.NaN;
        this.d = Float.NaN;
        this.f4008e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f4092j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4008e);
                this.f4008e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f4006b = obtainStyledAttributes.getDimension(index, this.f4006b);
            } else if (index == 3) {
                this.f4007c = obtainStyledAttributes.getDimension(index, this.f4007c);
            } else if (index == 4) {
                this.f4005a = obtainStyledAttributes.getDimension(index, this.f4005a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
