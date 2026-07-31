package z2;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
final class j extends RelativeLayout {

    /* renamed from: f, reason: collision with root package name */
    final a3.x f23648f;

    /* renamed from: g, reason: collision with root package name */
    boolean f23649g;

    public j(Context context, String str, String str2, String str3) {
        super(context);
        a3.x xVar = new a3.x(context, str);
        this.f23648f = xVar;
        xVar.o(str2);
        xVar.n(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f23649g) {
            return false;
        }
        this.f23648f.m(motionEvent);
        return false;
    }
}
