package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306g {

    /* renamed from: a, reason: collision with root package name */
    public final int f4031a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4032b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4033c;

    public C0306g(Context context, XmlResourceParser xmlResourceParser) {
        this.f4033c = new ArrayList();
        this.f4032b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f4031a = obtainStyledAttributes.getResourceId(index, this.f4031a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4032b);
                this.f4032b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public C0306g() {
        this.f4033c = new C0306g[256];
        this.f4031a = 0;
        this.f4032b = 0;
    }

    public C0306g(int i, int i2) {
        this.f4033c = null;
        this.f4031a = i;
        int i3 = i2 & 7;
        this.f4032b = i3 == 0 ? 8 : i3;
    }
}
