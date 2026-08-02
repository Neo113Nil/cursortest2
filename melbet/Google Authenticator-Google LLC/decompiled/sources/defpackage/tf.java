package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tf {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public tf(Context context, XmlPullParser xmlPullParser) {
        this.c = new ArrayList();
        this.b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), tr.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(0, this.a);
            } else if (index == 1) {
                this.b = obtainStyledAttributes.getResourceId(1, this.b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.b);
                context.getResources().getResourceName(this.b);
                if ("layout".equals(resourceTypeName)) {
                    tn tnVar = new tn();
                    this.d = tnVar;
                    tnVar.d(context, this.b);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        this.c = attribute;
        this.d = obj;
        this.a = i;
        this.b = i2;
    }

    public tf(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        a(attribute, obj, i, i2);
    }

    public tf(Object obj, int i, int i2) {
        a(h.a, obj, i, i2);
    }
}
