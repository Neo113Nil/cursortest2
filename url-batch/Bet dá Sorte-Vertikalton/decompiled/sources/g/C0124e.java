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
import com.glasspulse.glasspulse.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2408a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0125f f2409b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2410c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2411e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2412f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2413g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2414j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2415k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2416l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2417m;

    /* renamed from: n, reason: collision with root package name */
    public View f2418n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2419o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2421q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2422r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2423s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2424t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2425u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0122c f2426v;

    /* renamed from: p, reason: collision with root package name */
    public int f2420p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2427w = new com.google.android.material.datepicker.j(1, this);

    public C0124e(Context context, DialogInterfaceC0125f dialogInterfaceC0125f, Window window) {
        this.f2408a = context;
        this.f2409b = dialogInterfaceC0125f;
        this.f2410c = window;
        HandlerC0122c handlerC0122c = new HandlerC0122c();
        handlerC0122c.f2407a = new WeakReference(dialogInterfaceC0125f);
        this.f2426v = handlerC0122c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f2035e, R.attr.alertDialogStyle, 0);
        this.f2421q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2422r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2423s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2424t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2425u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0125f.f().f(1);
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
