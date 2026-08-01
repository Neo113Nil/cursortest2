package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f3487a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3488b;
    public final float c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3489d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3490e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f3487a = Float.NaN;
        this.f3488b = Float.NaN;
        this.c = Float.NaN;
        this.f3489d = Float.NaN;
        this.f3490e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f3574j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3490e);
                this.f3490e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f3489d = obtainStyledAttributes.getDimension(index, this.f3489d);
            } else if (index == 2) {
                this.f3488b = obtainStyledAttributes.getDimension(index, this.f3488b);
            } else if (index == 3) {
                this.c = obtainStyledAttributes.getDimension(index, this.c);
            } else if (index == 4) {
                this.f3487a = obtainStyledAttributes.getDimension(index, this.f3487a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
