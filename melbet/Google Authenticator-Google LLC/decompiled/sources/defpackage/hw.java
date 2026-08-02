package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hw {
    public PorterDuff.Mode a = null;
    public boolean b = false;
    public boolean c = false;
    private final CompoundButton d;
    private boolean e;

    public hw(CompoundButton compoundButton) {
        this.d = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.b || this.c) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.b) {
                    mutate.setTintList(null);
                }
                if (this.c) {
                    mutate.setTintMode(this.a);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001e, B:5:0x0024, B:8:0x002a, B:9:0x004f, B:11:0x0056, B:12:0x005f, B:14:0x0066, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001e, B:5:0x0024, B:8:0x002a, B:9:0x004f, B:11:0x0056, B:12:0x005f, B:14:0x0066, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void b(AttributeSet attributeSet, int i) {
        int h;
        int h2;
        CompoundButton compoundButton = this.d;
        Context context = compoundButton.getContext();
        int[] iArr = em.m;
        byo u = byo.u(context, attributeSet, iArr, i, 0);
        yq.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) u.a, i, 0);
        try {
            if (u.p(1) && (h2 = u.h(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(e.f(compoundButton.getContext(), h2));
                } catch (Resources.NotFoundException unused) {
                }
                if (u.p(2)) {
                    this.d.setButtonTintList(u.i(2));
                }
                if (u.p(3)) {
                    CompoundButton compoundButton2 = this.d;
                    int e = u.e(3, -1);
                    Rect rect = jl.a;
                    compoundButton2.setButtonTintMode(a.q(e, null));
                }
            }
            if (u.p(0) && (h = u.h(0, 0)) != 0) {
                CompoundButton compoundButton3 = this.d;
                compoundButton3.setButtonDrawable(e.f(compoundButton3.getContext(), h));
            }
            if (u.p(2)) {
            }
            if (u.p(3)) {
            }
        } finally {
            u.n();
        }
    }

    final void c() {
        if (this.e) {
            this.e = false;
        } else {
            this.e = true;
            a();
        }
    }
}
