package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cwk {
    static Integer d;
    public final List a;
    public Object b;
    public final Object c;

    public cwk(View view) {
        this.a = new ArrayList();
        this.c = view;
    }

    public static final boolean g(int i, int i2) {
        return i(i) && i(i2);
    }

    private final int h(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = (View) this.c;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = view.getContext();
        Integer num = d;
        if (num == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            a.v(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            num = Integer.valueOf(Math.max(point.x, point.y));
            d = num;
        }
        return num.intValue();
    }

    private static final boolean i(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cwj, java.lang.Object] */
    public final ddi a(Object obj, gzf gzfVar) {
        boolean isEmpty;
        synchronized (this) {
            List list = this.a;
            isEmpty = list.isEmpty();
            list.add(obj);
        }
        if (isEmpty) {
            return (ddi) gzfVar.a(obj);
        }
        synchronized (this) {
            Object obj2 = this.b;
            if (obj2 != null) {
                this.c.a(obj, obj2);
            }
        }
        return dih.w(null);
    }

    public final ddi b(Object obj, gzf gzfVar) {
        synchronized (this) {
            List list = this.a;
            list.remove(obj);
            if (list.isEmpty()) {
                return (ddi) gzfVar.a(null);
            }
            return dih.w(true);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [cwj, java.lang.Object] */
    final void c(Object obj) {
        synchronized (this) {
            this.b = obj;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.c.a(it.next(), obj);
        }
    }

    public final int d() {
        View view = (View) this.c;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return h(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int e() {
        View view = (View) this.c;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return h(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    public final void f() {
        ViewTreeObserver viewTreeObserver = ((View) this.c).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.b);
        }
        this.b = null;
        this.a.clear();
    }

    public cwk(cwj cwjVar) {
        this.a = new CopyOnWriteArrayList();
        this.c = cwjVar;
    }
}
