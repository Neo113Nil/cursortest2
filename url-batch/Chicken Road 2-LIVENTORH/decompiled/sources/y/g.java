package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f3681a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3682b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3683c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3684e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f3681a = Float.NaN;
        this.f3682b = Float.NaN;
        this.f3683c = Float.NaN;
        this.d = Float.NaN;
        this.f3684e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f3774j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3684e);
                this.f3684e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f3682b = obtainStyledAttributes.getDimension(index, this.f3682b);
            } else if (index == 3) {
                this.f3683c = obtainStyledAttributes.getDimension(index, this.f3683c);
            } else if (index == 4) {
                this.f3681a = obtainStyledAttributes.getDimension(index, this.f3681a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
