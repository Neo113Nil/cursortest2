package j3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f2494a;

    /* renamed from: b, reason: collision with root package name */
    public int f2495b;
    public final Object c;

    public z(View view) {
        this.c = view;
    }

    public z(Context context, XmlResourceParser xmlResourceParser) {
        this.c = new ArrayList();
        this.f2495b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.q.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                this.f2494a = obtainStyledAttributes.getResourceId(index, this.f2494a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f2495b);
                this.f2495b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new v.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public z() {
        this.c = new z[256];
        this.f2494a = 0;
        this.f2495b = 0;
    }

    public z(int i4, int i5) {
        this.c = null;
        this.f2494a = i4;
        int i6 = i5 & 7;
        this.f2495b = i6 == 0 ? 8 : i6;
    }
}
