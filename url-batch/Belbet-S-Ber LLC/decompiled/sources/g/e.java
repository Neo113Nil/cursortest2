package g;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
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
import com.gdmhkmf.belbet.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final c E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1492a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1493b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f1494c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public String f1495e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f1496f;

    /* renamed from: g, reason: collision with root package name */
    public View f1497g;
    public Button i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1498j;

    /* renamed from: k, reason: collision with root package name */
    public Message f1499k;

    /* renamed from: l, reason: collision with root package name */
    public Button f1500l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f1501m;

    /* renamed from: n, reason: collision with root package name */
    public Message f1502n;

    /* renamed from: o, reason: collision with root package name */
    public Button f1503o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1504p;

    /* renamed from: q, reason: collision with root package name */
    public Message f1505q;

    /* renamed from: r, reason: collision with root package name */
    public NestedScrollView f1506r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f1507s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f1508t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1509u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f1510v;

    /* renamed from: w, reason: collision with root package name */
    public View f1511w;

    /* renamed from: x, reason: collision with root package name */
    public ListAdapter f1512x;

    /* renamed from: z, reason: collision with root package name */
    public final int f1514z;
    public boolean h = false;

    /* renamed from: y, reason: collision with root package name */
    public int f1513y = -1;
    public final com.google.android.material.datepicker.p F = new com.google.android.material.datepicker.p(1, this);

    public e(Context context, f fVar, Window window) {
        this.f1492a = context;
        this.f1493b = fVar;
        this.f1494c = window;
        c cVar = new c();
        cVar.f1483a = new WeakReference(fVar);
        this.E = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f1393e, R.attr.alertDialogStyle, 0);
        this.f1514z = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.A = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.B = obtainStyledAttributes.getResourceId(7, 0);
        this.C = obtainStyledAttributes.getResourceId(3, 0);
        this.D = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        fVar.e().f(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
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

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.E.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f1504p = charSequence;
            this.f1505q = obtainMessage;
        } else if (i == -2) {
            this.f1501m = charSequence;
            this.f1502n = obtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f1498j = charSequence;
            this.f1499k = obtainMessage;
        }
    }
}
