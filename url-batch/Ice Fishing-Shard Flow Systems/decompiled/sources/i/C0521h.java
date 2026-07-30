package i;

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.icefishing.icefish.ice.fishing.s294s.R;
import h.AbstractC0454a;
import java.lang.ref.WeakReference;

/* renamed from: i.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521h {

    /* renamed from: A, reason: collision with root package name */
    public final int f5433A;

    /* renamed from: B, reason: collision with root package name */
    public final int f5434B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5435C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f5436D;

    /* renamed from: E, reason: collision with root package name */
    public final HandlerC0519f f5437E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5439a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0522i f5440b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f5441c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f5442d;

    /* renamed from: e, reason: collision with root package name */
    public String f5443e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f5444f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f5445g;

    /* renamed from: i, reason: collision with root package name */
    public Button f5447i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public Message f5448k;

    /* renamed from: l, reason: collision with root package name */
    public Button f5449l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f5450m;

    /* renamed from: n, reason: collision with root package name */
    public Message f5451n;

    /* renamed from: o, reason: collision with root package name */
    public Button f5452o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f5453p;

    /* renamed from: q, reason: collision with root package name */
    public Message f5454q;

    /* renamed from: r, reason: collision with root package name */
    public NestedScrollView f5455r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f5456s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f5457t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f5458u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f5459v;

    /* renamed from: w, reason: collision with root package name */
    public View f5460w;

    /* renamed from: x, reason: collision with root package name */
    public ListAdapter f5461x;

    /* renamed from: z, reason: collision with root package name */
    public final int f5463z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5446h = false;

    /* renamed from: y, reason: collision with root package name */
    public int f5462y = -1;

    /* renamed from: F, reason: collision with root package name */
    public final ViewOnClickListenerC0516c f5438F = new ViewOnClickListenerC0516c(0, this);

    public C0521h(Context context, DialogInterfaceC0522i dialogInterfaceC0522i, Window window) {
        this.f5439a = context;
        this.f5440b = dialogInterfaceC0522i;
        this.f5441c = window;
        HandlerC0519f handlerC0519f = new HandlerC0519f();
        handlerC0519f.f5432a = new WeakReference(dialogInterfaceC0522i);
        this.f5437E = handlerC0519f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0454a.f5041e, R.attr.alertDialogStyle, 0);
        this.f5463z = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f5433A = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f5434B = obtainStyledAttributes.getResourceId(7, 0);
        this.f5435C = obtainStyledAttributes.getResourceId(3, 0);
        this.f5436D = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0522i.c().h(1);
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

    public final void c(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f5437E.obtainMessage(i2, onClickListener) : null;
        if (i2 == -3) {
            this.f5453p = charSequence;
            this.f5454q = obtainMessage;
        } else if (i2 == -2) {
            this.f5450m = charSequence;
            this.f5451n = obtainMessage;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.j = charSequence;
            this.f5448k = obtainMessage;
        }
    }
}
