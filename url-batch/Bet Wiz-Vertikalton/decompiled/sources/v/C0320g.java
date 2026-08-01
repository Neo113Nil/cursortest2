package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320g {

    /* renamed from: a, reason: collision with root package name */
    public final int f3914a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3915b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3916c;

    public C0320g(Context context, XmlResourceParser xmlResourceParser) {
        this.f3916c = new ArrayList();
        this.f3915b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f3914a = obtainStyledAttributes.getResourceId(index, this.f3914a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3915b);
                this.f3915b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public C0320g() {
        this.f3916c = new C0320g[256];
        this.f3914a = 0;
        this.f3915b = 0;
    }

    public C0320g(int i, int i2) {
        this.f3916c = null;
        this.f3914a = i;
        int i3 = i2 & 7;
        this.f3915b = i3 == 0 ? 8 : i3;
    }
}
