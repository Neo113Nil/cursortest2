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
import com.winfour.winrandom.R;
import f.AbstractC0097a;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2309a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0103f f2310b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2311c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2312e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2313f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2314g;

    /* renamed from: h, reason: collision with root package name */
    public Button f2315h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2316j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2317k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2318l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2319m;

    /* renamed from: n, reason: collision with root package name */
    public View f2320n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2321o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2323q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2324r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2325s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2326t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2327u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0100c f2328v;

    /* renamed from: p, reason: collision with root package name */
    public int f2322p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2329w = new com.google.android.material.datepicker.j(1, this);

    public C0102e(Context context, DialogInterfaceC0103f dialogInterfaceC0103f, Window window) {
        this.f2309a = context;
        this.f2310b = dialogInterfaceC0103f;
        this.f2311c = window;
        HandlerC0100c handlerC0100c = new HandlerC0100c();
        handlerC0100c.f2308a = new WeakReference(dialogInterfaceC0103f);
        this.f2328v = handlerC0100c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0097a.f2139e, R.attr.alertDialogStyle, 0);
        this.f2323q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2324r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2325s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2326t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2327u = obtainStyledAttributes.getBoolean(6, true);
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
