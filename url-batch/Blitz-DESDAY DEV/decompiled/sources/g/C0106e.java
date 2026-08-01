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
import com.winfour.neondrop.R;
import f.AbstractC0084a;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2292a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0107f f2293b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2294c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2295e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2296f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2297g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2298j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2299k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2300l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2301m;

    /* renamed from: n, reason: collision with root package name */
    public View f2302n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2303o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2305q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2306r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2307s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2308t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2309u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0104c f2310v;

    /* renamed from: p, reason: collision with root package name */
    public int f2304p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2311w = new com.google.android.material.datepicker.j(1, this);

    public C0106e(Context context, DialogInterfaceC0107f dialogInterfaceC0107f, Window window) {
        this.f2292a = context;
        this.f2293b = dialogInterfaceC0107f;
        this.f2294c = window;
        HandlerC0104c handlerC0104c = new HandlerC0104c();
        handlerC0104c.f2291a = new WeakReference(dialogInterfaceC0107f);
        this.f2310v = handlerC0104c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0084a.f2130e, R.attr.alertDialogStyle, 0);
        this.f2305q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2306r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2307s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2308t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2309u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0107f.e().f(1);
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
