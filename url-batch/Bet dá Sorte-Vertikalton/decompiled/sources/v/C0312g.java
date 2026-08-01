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
public final class C0312g {

    /* renamed from: a, reason: collision with root package name */
    public final float f4050a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4051b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4052c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4053e;

    public C0312g(Context context, XmlResourceParser xmlResourceParser) {
        this.f4050a = Float.NaN;
        this.f4051b = Float.NaN;
        this.f4052c = Float.NaN;
        this.d = Float.NaN;
        this.f4053e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f4163j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4053e);
                this.f4053e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f4051b = obtainStyledAttributes.getDimension(index, this.f4051b);
            } else if (index == 3) {
                this.f4052c = obtainStyledAttributes.getDimension(index, this.f4052c);
            } else if (index == 4) {
                this.f4050a = obtainStyledAttributes.getDimension(index, this.f4050a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
