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
import com.luckyarcade.spinthrow.R;
import java.lang.ref.WeakReference;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2556a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0156h f2557b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2558c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f2559d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2560e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2561f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2562g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2563j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2564k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2565l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2566m;

    /* renamed from: n, reason: collision with root package name */
    public View f2567n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2568o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2570q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2571r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2572s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2573t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2574u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0153e f2575v;

    /* renamed from: p, reason: collision with root package name */
    public int f2569p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2576w = new com.google.android.material.datepicker.j(1, this);

    public C0155g(Context context, DialogInterfaceC0156h dialogInterfaceC0156h, Window window) {
        this.f2556a = context;
        this.f2557b = dialogInterfaceC0156h;
        this.f2558c = window;
        HandlerC0153e handlerC0153e = new HandlerC0153e();
        handlerC0153e.f2555a = new WeakReference(dialogInterfaceC0156h);
        this.f2575v = handlerC0153e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f2395e, R.attr.alertDialogStyle, 0);
        this.f2570q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2571r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2572s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2573t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2574u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0156h.d().g(1);
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
