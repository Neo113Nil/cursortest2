package f;

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
import com.gglhk.bofio.fortunetiger.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1571a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1572b;
    public final Window c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f1573d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f1574e;

    /* renamed from: f, reason: collision with root package name */
    public Button f1575f;
    public Button g;
    public Button h;

    /* renamed from: i, reason: collision with root package name */
    public NestedScrollView f1576i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1577j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f1578k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f1579l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1580m;

    /* renamed from: n, reason: collision with root package name */
    public View f1581n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f1582o;

    /* renamed from: q, reason: collision with root package name */
    public final int f1584q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1585r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1586s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1587t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1588u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1589v;

    /* renamed from: p, reason: collision with root package name */
    public int f1583p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.k f1590w = new com.google.android.material.datepicker.k(1, this);

    public e(Context context, g gVar, Window window) {
        this.f1571a = context;
        this.f1572b = gVar;
        this.c = window;
        c cVar = new c();
        cVar.f1567a = new WeakReference(gVar);
        this.f1589v = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, e.a.f1498e, R.attr.alertDialogStyle, 0);
        this.f1584q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f1585r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f1586s = obtainStyledAttributes.getResourceId(7, 0);
        this.f1587t = obtainStyledAttributes.getResourceId(3, 0);
        this.f1588u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        gVar.d().f(1);
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
