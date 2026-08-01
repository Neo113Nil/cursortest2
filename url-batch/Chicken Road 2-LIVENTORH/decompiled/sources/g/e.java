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
import com.oriondriftchasers.arordrft.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1607a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1608b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f1609c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f1610e;

    /* renamed from: f, reason: collision with root package name */
    public Button f1611f;

    /* renamed from: g, reason: collision with root package name */
    public Button f1612g;

    /* renamed from: h, reason: collision with root package name */
    public Button f1613h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1614j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f1615k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f1616l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1617m;

    /* renamed from: n, reason: collision with root package name */
    public View f1618n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f1619o;

    /* renamed from: q, reason: collision with root package name */
    public final int f1621q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1622r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1623s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1624t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1625u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1626v;

    /* renamed from: p, reason: collision with root package name */
    public int f1620p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.l f1627w = new com.google.android.material.datepicker.l(1, this);

    public e(Context context, g gVar, Window window) {
        this.f1607a = context;
        this.f1608b = gVar;
        this.f1609c = window;
        c cVar = new c();
        cVar.f1580a = new WeakReference(gVar);
        this.f1626v = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f1243e, R.attr.alertDialogStyle, 0);
        this.f1621q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f1622r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f1623s = obtainStyledAttributes.getResourceId(7, 0);
        this.f1624t = obtainStyledAttributes.getResourceId(3, 0);
        this.f1625u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        gVar.f().f(1);
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
