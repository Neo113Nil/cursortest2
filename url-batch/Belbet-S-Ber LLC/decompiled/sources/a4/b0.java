package a4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f142a;

    /* renamed from: b, reason: collision with root package name */
    public int f143b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f144c;

    public b0(View view) {
        this.f144c = view;
    }

    public b0(Context context, XmlResourceParser xmlResourceParser) {
        this.f144c = new ArrayList();
        this.f143b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), y.q.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f142a = obtainStyledAttributes.getResourceId(index, this.f142a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f143b);
                this.f143b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new y.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public b0() {
        this.f144c = new b0[256];
        this.f142a = 0;
        this.f143b = 0;
    }

    public b0(int i, int i4) {
        this.f144c = null;
        this.f142a = i;
        int i5 = i4 & 7;
        this.f143b = i5 == 0 ? 8 : i5;
    }
}
