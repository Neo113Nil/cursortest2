package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4379a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4380b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4381c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4382d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4383e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4384f;

    public q(p pVar) {
        this.f4383e = null;
        this.f4384f = null;
        this.f4379a = false;
        this.f4380b = false;
        this.f4382d = pVar;
    }

    public void a() {
        p pVar = (p) this.f4382d;
        Drawable buttonDrawable = pVar.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f4379a || this.f4380b) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f4379a) {
                    mutate.setTintList((ColorStateList) this.f4383e);
                }
                if (this.f4380b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f4384f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(pVar.getDrawableState());
                }
                pVar.setButtonDrawable(mutate);
            }
        }
    }

    public Object b() {
        if (this.f4379a) {
            return null;
        }
        Object obj = this.f4384f;
        if (obj != null) {
            return obj;
        }
        m0.t.d("Unexpected form of a provided value");
        throw new a5.c();
    }

    public q(m0.r1 r1Var, Object obj, boolean z3, m0.n2 n2Var, boolean z7) {
        this.f4382d = r1Var;
        this.f4379a = z3;
        this.f4383e = n2Var;
        this.f4380b = z7;
        this.f4384f = obj;
        this.f4381c = true;
    }
}
