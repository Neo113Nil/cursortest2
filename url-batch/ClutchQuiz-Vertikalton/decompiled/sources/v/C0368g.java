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
public final class C0368g {

    /* renamed from: a, reason: collision with root package name */
    public final float f3866a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3867b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3868c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3869e;

    public C0368g(Context context, XmlResourceParser xmlResourceParser) {
        this.f3866a = Float.NaN;
        this.f3867b = Float.NaN;
        this.f3868c = Float.NaN;
        this.d = Float.NaN;
        this.f3869e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f3980j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3869e);
                this.f3869e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f3867b = obtainStyledAttributes.getDimension(index, this.f3867b);
            } else if (index == 3) {
                this.f3868c = obtainStyledAttributes.getDimension(index, this.f3868c);
            } else if (index == 4) {
                this.f3866a = obtainStyledAttributes.getDimension(index, this.f3866a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
