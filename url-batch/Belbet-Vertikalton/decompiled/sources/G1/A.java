package G1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f338a;

    /* renamed from: b, reason: collision with root package name */
    public final int f339b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f340c;

    public A(Context context, XmlResourceParser xmlResourceParser) {
        this.f340c = new ArrayList();
        this.f339b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), x.r.f4708h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f338a = obtainStyledAttributes.getResourceId(index, this.f338a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f339b);
                this.f339b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new x.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public A() {
        this.f340c = new A[256];
        this.f338a = 0;
        this.f339b = 0;
    }

    public A(int i, int i2) {
        this.f340c = null;
        this.f338a = i;
        int i3 = i2 & 7;
        this.f339b = i3 == 0 ? 8 : i3;
    }
}
