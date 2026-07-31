package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    private int f11889a;

    /* renamed from: b, reason: collision with root package name */
    private int f11890b;

    public I(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f11889a | this.f11890b;
    }

    public void b(View view, View view2, int i4) {
        c(view, view2, i4, 0);
    }

    public void c(View view, View view2, int i4, int i5) {
        if (i5 == 1) {
            this.f11890b = i4;
        } else {
            this.f11889a = i4;
        }
    }

    public void d(View view, int i4) {
        if (i4 == 1) {
            this.f11890b = 0;
        } else {
            this.f11889a = 0;
        }
    }
}
