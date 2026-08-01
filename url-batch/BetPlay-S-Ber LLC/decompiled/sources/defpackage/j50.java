package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class j50 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public j50() {
        if (ix.g == null) {
            ix.g = new ix(16);
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
            View.AccessibilityDelegate d = e90.d(view);
            w wVar = d != null ? d instanceof v ? ((v) d).a : new w(d) : null;
            if (wVar == null) {
                wVar = new w();
            }
            e90.m(view, wVar);
            view.setTag(this.a, obj);
            e90.h(view, this.c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
