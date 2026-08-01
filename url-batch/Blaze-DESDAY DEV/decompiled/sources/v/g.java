package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f3875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3876b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3877c;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f3877c = new ArrayList();
        this.f3876b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f3875a = obtainStyledAttributes.getResourceId(index, this.f3875a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3876b);
                this.f3876b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public g() {
        this.f3877c = new g[256];
        this.f3875a = 0;
        this.f3876b = 0;
    }

    public g(int i, int i2) {
        this.f3877c = null;
        this.f3875a = i;
        int i3 = i2 & 7;
        this.f3876b = i3 == 0 ? 8 : i3;
    }
}
