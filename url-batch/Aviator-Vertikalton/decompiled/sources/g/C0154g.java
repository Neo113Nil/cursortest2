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
import com.fortuneink.neonpad.R;
import java.lang.ref.WeakReference;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2552a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0155h f2553b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2554c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f2555d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2556e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2557f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2558g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2559j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2560k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2561l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2562m;

    /* renamed from: n, reason: collision with root package name */
    public View f2563n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2564o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2566q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2567r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2568s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2569t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2570u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0152e f2571v;

    /* renamed from: p, reason: collision with root package name */
    public int f2565p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2572w = new com.google.android.material.datepicker.j(1, this);

    public C0154g(Context context, DialogInterfaceC0155h dialogInterfaceC0155h, Window window) {
        this.f2552a = context;
        this.f2553b = dialogInterfaceC0155h;
        this.f2554c = window;
        HandlerC0152e handlerC0152e = new HandlerC0152e();
        handlerC0152e.f2551a = new WeakReference(dialogInterfaceC0155h);
        this.f2571v = handlerC0152e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f2391e, R.attr.alertDialogStyle, 0);
        this.f2566q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2567r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2568s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2569t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2570u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0155h.d().i(1);
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
