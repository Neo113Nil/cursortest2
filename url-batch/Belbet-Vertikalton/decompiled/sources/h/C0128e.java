package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.winpower.neonfit.R;
import g.AbstractC0122a;
import java.lang.ref.WeakReference;

/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2778a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0129f f2779b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2780c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f2781d;
    public AlertController$RecycleListView e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2782f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2783g;

    /* renamed from: h, reason: collision with root package name */
    public Button f2784h;
    public NestedScrollView i;
    public Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2785k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2786l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2787m;

    /* renamed from: n, reason: collision with root package name */
    public View f2788n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2789o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2791q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2792r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2793s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2794t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2795u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0126c f2796v;

    /* renamed from: p, reason: collision with root package name */
    public int f2790p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2797w = new com.google.android.material.datepicker.j(1, this);

    public C0128e(Context context, DialogInterfaceC0129f dialogInterfaceC0129f, Window window) {
        this.f2778a = context;
        this.f2779b = dialogInterfaceC0129f;
        this.f2780c = window;
        HandlerC0126c handlerC0126c = new HandlerC0126c();
        handlerC0126c.f2777a = new WeakReference(dialogInterfaceC0129f);
        this.f2796v = handlerC0126c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0122a.e, R.attr.alertDialogStyle, 0);
        this.f2791q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2792r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2793s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2794t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2795u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0129f.f().h(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
