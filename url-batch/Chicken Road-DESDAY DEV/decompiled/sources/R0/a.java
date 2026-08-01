package R0;

import P0.c;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import u1.d;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Button f715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f717c;
    public final /* synthetic */ float d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f718e;

    public /* synthetic */ a(Button button, c cVar, boolean z2, float f2, boolean z3) {
        this.f715a = button;
        this.f716b = cVar;
        this.f717c = z2;
        this.d = f2;
        this.f718e = z3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        Button button = this.f715a;
        c cVar = this.f716b;
        boolean z2 = this.f717c;
        float f2 = this.d;
        boolean z3 = this.f718e;
        if (action == 0) {
            d.g(button, cVar, z2, f2, z3, true);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        d.g(button, cVar, z2, f2, z3, false);
        return false;
    }
}
