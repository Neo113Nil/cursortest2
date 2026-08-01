package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class c50 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public c50() {
        if (vw.g == null) {
            vw.g = new vw(16);
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
            View.AccessibilityDelegate d = x80.d(view);
            w wVar = d != null ? d instanceof v ? ((v) d).a : new w(d) : null;
            if (wVar == null) {
                wVar = new w();
            }
            x80.m(view, wVar);
            view.setTag(this.a, obj);
            x80.h(view, this.c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
