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
import com.winworm.neongrid.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2230a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0105f f2231b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2232c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2233e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2234f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2235g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2236j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2237k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2238l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2239m;

    /* renamed from: n, reason: collision with root package name */
    public View f2240n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2241o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2243q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2244r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2245s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2246t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2247u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0102c f2248v;

    /* renamed from: p, reason: collision with root package name */
    public int f2242p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2249w = new com.google.android.material.datepicker.j(1, this);

    public C0104e(Context context, DialogInterfaceC0105f dialogInterfaceC0105f, Window window) {
        this.f2230a = context;
        this.f2231b = dialogInterfaceC0105f;
        this.f2232c = window;
        HandlerC0102c handlerC0102c = new HandlerC0102c();
        handlerC0102c.f2229a = new WeakReference(dialogInterfaceC0105f);
        this.f2248v = handlerC0102c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f2101e, R.attr.alertDialogStyle, 0);
        this.f2243q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2244r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2245s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2246t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2247u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0105f.f().f(1);
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
