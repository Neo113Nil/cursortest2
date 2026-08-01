package p1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f3489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3490b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3491c;

    public y(Context context, XmlResourceParser xmlResourceParser) {
        this.f3491c = new ArrayList();
        this.f3490b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.r.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f3489a = obtainStyledAttributes.getResourceId(index, this.f3489a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3490b);
                this.f3490b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new v.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public y() {
        this.f3491c = new y[256];
        this.f3489a = 0;
        this.f3490b = 0;
    }

    public y(int i, int i2) {
        this.f3491c = null;
        this.f3489a = i;
        int i3 = i2 & 7;
        this.f3490b = i3 == 0 ? 8 : i3;
    }
}
