package h;

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
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;
import java.lang.ref.WeakReference;

/* renamed from: h.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4549h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38088a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC4550i f38089b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f38090c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f38091d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f38092e;

    /* renamed from: f, reason: collision with root package name */
    public Button f38093f;

    /* renamed from: g, reason: collision with root package name */
    public Button f38094g;

    /* renamed from: h, reason: collision with root package name */
    public Button f38095h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f38096j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f38097k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f38098l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f38099m;

    /* renamed from: n, reason: collision with root package name */
    public View f38100n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f38101o;

    /* renamed from: q, reason: collision with root package name */
    public final int f38103q;

    /* renamed from: r, reason: collision with root package name */
    public final int f38104r;

    /* renamed from: s, reason: collision with root package name */
    public final int f38105s;

    /* renamed from: t, reason: collision with root package name */
    public final int f38106t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f38107u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC4547f f38108v;

    /* renamed from: p, reason: collision with root package name */
    public int f38102p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f38109w = new com.google.android.material.datepicker.j(3, this);

    public C4549h(Context context, DialogInterfaceC4550i dialogInterfaceC4550i, Window window) {
        this.f38088a = context;
        this.f38089b = dialogInterfaceC4550i;
        this.f38090c = window;
        HandlerC4547f handlerC4547f = new HandlerC4547f();
        handlerC4547f.f38087b = new WeakReference(dialogInterfaceC4550i);
        this.f38108v = handlerC4547f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC4518a.f37822e, C5284R.attr.alertDialogStyle, 0);
        this.f38103q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f38104r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f38105s = obtainStyledAttributes.getResourceId(7, 0);
        this.f38106t = obtainStyledAttributes.getResourceId(3, 0);
        this.f38107u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC4550i.c().g(1);
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
