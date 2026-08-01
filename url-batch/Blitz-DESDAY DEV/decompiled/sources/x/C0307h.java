package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307h {

    /* renamed from: a, reason: collision with root package name */
    public final float f4034a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4035b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4036c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4037e;

    public C0307h(Context context, XmlResourceParser xmlResourceParser) {
        this.f4034a = Float.NaN;
        this.f4035b = Float.NaN;
        this.f4036c = Float.NaN;
        this.d = Float.NaN;
        this.f4037e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f4148j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4037e);
                this.f4037e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f4035b = obtainStyledAttributes.getDimension(index, this.f4035b);
            } else if (index == 3) {
                this.f4036c = obtainStyledAttributes.getDimension(index, this.f4036c);
            } else if (index == 4) {
                this.f4034a = obtainStyledAttributes.getDimension(index, this.f4034a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
