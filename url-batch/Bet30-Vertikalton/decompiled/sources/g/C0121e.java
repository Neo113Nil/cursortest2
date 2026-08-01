package g;

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
import com.lasercut.dash.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2298a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0122f f2299b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2300c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2301e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2302f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2303g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2304j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2305k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2306l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2307m;

    /* renamed from: n, reason: collision with root package name */
    public View f2308n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2309o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2311q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2312r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2313s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2314t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2315u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0119c f2316v;

    /* renamed from: p, reason: collision with root package name */
    public int f2310p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2317w = new com.google.android.material.datepicker.j(1, this);

    public C0121e(Context context, DialogInterfaceC0122f dialogInterfaceC0122f, Window window) {
        this.f2298a = context;
        this.f2299b = dialogInterfaceC0122f;
        this.f2300c = window;
        HandlerC0119c handlerC0119c = new HandlerC0119c();
        handlerC0119c.f2297a = new WeakReference(dialogInterfaceC0122f);
        this.f2316v = handlerC0119c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f1928e, R.attr.alertDialogStyle, 0);
        this.f2311q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2312r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2313s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2314t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2315u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0122f.f().f(1);
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
