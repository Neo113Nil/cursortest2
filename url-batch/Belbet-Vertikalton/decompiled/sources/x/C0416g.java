package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416g {

    /* renamed from: a, reason: collision with root package name */
    public final float f4593a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4594b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4595c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4596d;
    public final int e;

    public C0416g(Context context, XmlResourceParser xmlResourceParser) {
        this.f4593a = Float.NaN;
        this.f4594b = Float.NaN;
        this.f4595c = Float.NaN;
        this.f4596d = Float.NaN;
        this.e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4596d = obtainStyledAttributes.getDimension(index, this.f4596d);
            } else if (index == 2) {
                this.f4594b = obtainStyledAttributes.getDimension(index, this.f4594b);
            } else if (index == 3) {
                this.f4595c = obtainStyledAttributes.getDimension(index, this.f4595c);
            } else if (index == 4) {
                this.f4593a = obtainStyledAttributes.getDimension(index, this.f4593a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
