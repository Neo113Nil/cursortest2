package defpackage;

import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.common.ConstraintLayoutInterceptingTouches;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxf {
    public final dyk a;
    public final RecyclerView b;
    public final ImageView c;
    public final ImageView d;
    public final ObjectAnimator e;
    public final TextView f;
    public boolean g;
    public jgr h = new jgs(new jhh(R.string.og_account_list_collapsed_a11y), 1);
    public final iee i;
    private final ConstraintLayoutInterceptingTouches j;

    public dxf(dyk dykVar, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, ObjectAnimator objectAnimator, TextView textView, iee ieeVar, ConstraintLayoutInterceptingTouches constraintLayoutInterceptingTouches) {
        this.a = dykVar;
        this.b = recyclerView;
        this.c = imageView;
        this.d = imageView2;
        this.e = objectAnimator;
        this.f = textView;
        this.i = ieeVar;
        this.j = constraintLayoutInterceptingTouches;
    }

    public final void a(boolean z) {
        this.g = z;
        this.j.i = !z;
        ((View) this.i.e).setVisibility(true != z ? 8 : 0);
        this.f.setVisibility(true == z ? 8 : 0);
        if (!z) {
            this.d.setImageResource(R.drawable.og_chevron_background);
        } else {
            this.b.setVisibility(8);
            this.d.setImageResource(R.drawable.og_compact_header_chevron_background);
        }
    }
}
