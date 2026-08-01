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
public final class C0325g {

    /* renamed from: a, reason: collision with root package name */
    public final float f3898a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3899b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3900c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3901e;

    public C0325g(Context context, XmlResourceParser xmlResourceParser) {
        this.f3898a = Float.NaN;
        this.f3899b = Float.NaN;
        this.f3900c = Float.NaN;
        this.d = Float.NaN;
        this.f3901e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f4012j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3901e);
                this.f3901e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f3899b = obtainStyledAttributes.getDimension(index, this.f3899b);
            } else if (index == 3) {
                this.f3900c = obtainStyledAttributes.getDimension(index, this.f3900c);
            } else if (index == 4) {
                this.f3898a = obtainStyledAttributes.getDimension(index, this.f3898a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
