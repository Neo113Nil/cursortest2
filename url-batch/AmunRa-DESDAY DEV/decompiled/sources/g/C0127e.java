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
import com.visualfortune.eyerest.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2367a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0128f f2368b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2369c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2370e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2371f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2372g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2373j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2374k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2375l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2376m;

    /* renamed from: n, reason: collision with root package name */
    public View f2377n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2378o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2380q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2381r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2382s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2383t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2384u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0125c f2385v;

    /* renamed from: p, reason: collision with root package name */
    public int f2379p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2386w = new com.google.android.material.datepicker.j(1, this);

    public C0127e(Context context, DialogInterfaceC0128f dialogInterfaceC0128f, Window window) {
        this.f2367a = context;
        this.f2368b = dialogInterfaceC0128f;
        this.f2369c = window;
        HandlerC0125c handlerC0125c = new HandlerC0125c();
        handlerC0125c.f2366a = new WeakReference(dialogInterfaceC0128f);
        this.f2385v = handlerC0125c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f1992e, R.attr.alertDialogStyle, 0);
        this.f2380q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2381r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2382s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2383t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2384u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0128f.f().h(1);
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
