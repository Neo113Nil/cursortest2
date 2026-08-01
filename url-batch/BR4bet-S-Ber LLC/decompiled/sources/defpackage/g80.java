package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class g80 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public g80() {
        if (ky.g == null) {
            ky.g = new ky(18);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = ic0.d(view);
            y yVar = d != null ? d instanceof x ? ((x) d).a : new y(d) : null;
            if (yVar == null) {
                yVar = new y();
            }
            ic0.m(view, yVar);
            view.setTag(this.a, obj);
            ic0.h(view, this.c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
