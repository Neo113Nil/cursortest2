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
import com.clutchquizarena.app.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2425a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0133f f2426b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2427c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2428e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2429f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2430g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2431j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2432k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2433l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2434m;

    /* renamed from: n, reason: collision with root package name */
    public View f2435n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2436o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2438q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2439r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2440s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2441t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2442u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0130c f2443v;

    /* renamed from: p, reason: collision with root package name */
    public int f2437p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2444w = new com.google.android.material.datepicker.j(1, this);

    public C0132e(Context context, DialogInterfaceC0133f dialogInterfaceC0133f, Window window) {
        this.f2425a = context;
        this.f2426b = dialogInterfaceC0133f;
        this.f2427c = window;
        HandlerC0130c handlerC0130c = new HandlerC0130c();
        handlerC0130c.f2424a = new WeakReference(dialogInterfaceC0133f);
        this.f2443v = handlerC0130c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f2112e, R.attr.alertDialogStyle, 0);
        this.f2438q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2439r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2440s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2441t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2442u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0133f.f().f(1);
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
