package q3;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.emoji2.text.q;
import com.google.android.material.behavior.SwipeDismissBehavior;
import i3.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n0.h;
import n0.p0;
import o0.p;
import t3.j;
import w1.c;
import x0.g;
import x3.m;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements h, p, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3172a;

    public /* synthetic */ a(Object obj) {
        this.f3172a = obj;
    }

    @Override // o0.p
    public boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3172a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        boolean z4 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        int width = (!(i == 0 && z4) && (i != 1 || z4)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = p0.f2816a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // n0.h
    public boolean b(float f5) {
        if (f5 == 0.0f) {
            return false;
        }
        d();
        ((NestedScrollView) this.f3172a).j((int) f5);
        return true;
    }

    @Override // n0.h
    public float c() {
        return -((NestedScrollView) this.f3172a).getVerticalScrollFactorCompat();
    }

    @Override // n0.h
    public void d() {
        ((NestedScrollView) this.f3172a).i.abortAnimation();
    }

    public void e(String str, String str2) {
        d.e(str, "name");
        d.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f3172a;
        arrayList.add(str);
        arrayList.add(p3.d.E0(str2).toString());
    }

    public j f() {
        return new j((String[]) ((ArrayList) this.f3172a).toArray(new String[0]));
    }

    public void g(String str) {
        ArrayList arrayList = (ArrayList) this.f3172a;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public a(int i) {
        switch (i) {
            case 4:
                d.e(TimeUnit.MINUTES, "timeUnit");
                this.f3172a = new m(w3.c.h);
                break;
            case 5:
                this.f3172a = new ArrayList(20);
                break;
            case 11:
                this.f3172a = new LinkedHashSet();
                break;
            default:
                this.f3172a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public a(TextView textView) {
        this.f3172a = new g(textView);
    }

    public a(EditText editText) {
        this.f3172a = new q(editText);
    }

    public a(u3.a aVar) {
        this.f3172a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
