package z2;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.eu0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f23650a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup.LayoutParams f23651b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f23652c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f23653d;

    public k(eu0 eu0Var) {
        this.f23651b = eu0Var.getLayoutParams();
        ViewParent parent = eu0Var.getParent();
        this.f23653d = eu0Var.J();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new i("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f23652c = viewGroup;
        this.f23650a = viewGroup.indexOfChild(eu0Var.c0());
        viewGroup.removeView(eu0Var.c0());
        eu0Var.Y(true);
    }
}
