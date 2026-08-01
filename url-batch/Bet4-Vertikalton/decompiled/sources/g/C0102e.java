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
import com.playbag.tripgear.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2190a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0103f f2191b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2192c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2193e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2194f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2195g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2196j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2197k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2198l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2199m;

    /* renamed from: n, reason: collision with root package name */
    public View f2200n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2201o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2203q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2204r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2205s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2206t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2207u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0100c f2208v;

    /* renamed from: p, reason: collision with root package name */
    public int f2202p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2209w = new com.google.android.material.datepicker.j(1, this);

    public C0102e(Context context, DialogInterfaceC0103f dialogInterfaceC0103f, Window window) {
        this.f2190a = context;
        this.f2191b = dialogInterfaceC0103f;
        this.f2192c = window;
        HandlerC0100c handlerC0100c = new HandlerC0100c();
        handlerC0100c.f2189a = new WeakReference(dialogInterfaceC0103f);
        this.f2208v = handlerC0100c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f2058e, R.attr.alertDialogStyle, 0);
        this.f2203q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2204r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2205s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2206t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2207u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0103f.f().f(1);
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
