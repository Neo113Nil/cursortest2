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
import com.pairspot.fortunetiles.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2293a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0122f f2294b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2295c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2296e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2297f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2298g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2299j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2300k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2301l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2302m;

    /* renamed from: n, reason: collision with root package name */
    public View f2303n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2304o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2306q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2307r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2308s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2309t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2310u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0119c f2311v;

    /* renamed from: p, reason: collision with root package name */
    public int f2305p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2312w = new com.google.android.material.datepicker.j(1, this);

    public C0121e(Context context, DialogInterfaceC0122f dialogInterfaceC0122f, Window window) {
        this.f2293a = context;
        this.f2294b = dialogInterfaceC0122f;
        this.f2295c = window;
        HandlerC0119c handlerC0119c = new HandlerC0119c();
        handlerC0119c.f2292a = new WeakReference(dialogInterfaceC0122f);
        this.f2311v = handlerC0119c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f1923e, R.attr.alertDialogStyle, 0);
        this.f2306q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2307r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2308s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2309t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2310u = obtainStyledAttributes.getBoolean(6, true);
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
