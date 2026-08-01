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
import com.neonpulse.gridlogic.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2429a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0129f f2430b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2431c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2432e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2433f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2434g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2435j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2436k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2437l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2438m;

    /* renamed from: n, reason: collision with root package name */
    public View f2439n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2440o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2442q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2443r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2444s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2445t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2446u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0126c f2447v;

    /* renamed from: p, reason: collision with root package name */
    public int f2441p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2448w = new com.google.android.material.datepicker.j(1, this);

    public C0128e(Context context, DialogInterfaceC0129f dialogInterfaceC0129f, Window window) {
        this.f2429a = context;
        this.f2430b = dialogInterfaceC0129f;
        this.f2431c = window;
        HandlerC0126c handlerC0126c = new HandlerC0126c();
        handlerC0126c.f2428a = new WeakReference(dialogInterfaceC0129f);
        this.f2447v = handlerC0126c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f2060e, R.attr.alertDialogStyle, 0);
        this.f2442q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2443r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2444s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2445t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2446u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0129f.f().f(1);
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
