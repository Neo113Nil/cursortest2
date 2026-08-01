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
import com.fortunequest.neontrack.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2647a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0125f f2648b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2649c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2650e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2651f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2652g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2653j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2654k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2655l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2656m;

    /* renamed from: n, reason: collision with root package name */
    public View f2657n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2658o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2660q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2661r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2662s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2663t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2664u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0122c f2665v;

    /* renamed from: p, reason: collision with root package name */
    public int f2659p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2666w = new com.google.android.material.datepicker.j(1, this);

    public C0124e(Context context, DialogInterfaceC0125f dialogInterfaceC0125f, Window window) {
        this.f2647a = context;
        this.f2648b = dialogInterfaceC0125f;
        this.f2649c = window;
        HandlerC0122c handlerC0122c = new HandlerC0122c();
        handlerC0122c.f2646a = new WeakReference(dialogInterfaceC0125f);
        this.f2665v = handlerC0122c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f2517e, R.attr.alertDialogStyle, 0);
        this.f2660q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2661r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2662s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2663t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2664u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0125f.f().h(1);
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
