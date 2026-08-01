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
import com.skydrop.fallring.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2299a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0123f f2300b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2301c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2302e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2303f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2304g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2305j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2306k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2307l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2308m;

    /* renamed from: n, reason: collision with root package name */
    public View f2309n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2310o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2312q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2313r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2314s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2315t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2316u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0120c f2317v;

    /* renamed from: p, reason: collision with root package name */
    public int f2311p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2318w = new com.google.android.material.datepicker.j(1, this);

    public C0122e(Context context, DialogInterfaceC0123f dialogInterfaceC0123f, Window window) {
        this.f2299a = context;
        this.f2300b = dialogInterfaceC0123f;
        this.f2301c = window;
        HandlerC0120c handlerC0120c = new HandlerC0120c();
        handlerC0120c.f2298a = new WeakReference(dialogInterfaceC0123f);
        this.f2317v = handlerC0120c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f1929e, R.attr.alertDialogStyle, 0);
        this.f2312q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2313r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2314s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2315t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2316u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0123f.f().h(1);
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
