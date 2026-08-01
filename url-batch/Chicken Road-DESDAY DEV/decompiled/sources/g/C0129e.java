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
import com.playgen.securelock.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2368a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0130f f2369b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2370c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2371e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2372f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2373g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2374j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2375k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2376l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2377m;

    /* renamed from: n, reason: collision with root package name */
    public View f2378n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2379o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2381q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2382r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2383s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2384t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2385u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0127c f2386v;

    /* renamed from: p, reason: collision with root package name */
    public int f2380p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2387w = new com.google.android.material.datepicker.j(1, this);

    public C0129e(Context context, DialogInterfaceC0130f dialogInterfaceC0130f, Window window) {
        this.f2368a = context;
        this.f2369b = dialogInterfaceC0130f;
        this.f2370c = window;
        HandlerC0127c handlerC0127c = new HandlerC0127c();
        handlerC0127c.f2367a = new WeakReference(dialogInterfaceC0130f);
        this.f2386v = handlerC0127c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f1993e, R.attr.alertDialogStyle, 0);
        this.f2381q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2382r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2383s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2384t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2385u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0130f.f().f(1);
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
