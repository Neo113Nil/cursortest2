package defpackage;

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
import com.moontiko.really.admiralcasino.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class k2 {
    public final int A;
    public final boolean B;
    public final i2 C;
    public final Context a;
    public final m2 b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public AlertController$RecycleListView f;
    public Button g;
    public CharSequence h;
    public Message i;
    public Button j;
    public CharSequence k;
    public Message l;
    public Button m;
    public CharSequence n;
    public Message o;
    public NestedScrollView p;
    public Drawable q;
    public ImageView r;
    public TextView s;
    public TextView t;
    public View u;
    public ListAdapter v;
    public final int x;
    public final int y;
    public final int z;
    public int w = -1;
    public final v0 D = new v0(1, this);

    public k2(Context context, m2 m2Var, Window window) {
        this.a = context;
        this.b = m2Var;
        this.c = window;
        i2 i2Var = new i2();
        i2Var.a = new WeakReference(m2Var);
        this.C = i2Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, z00.e, R.attr.alertDialogStyle, 0);
        this.x = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.y = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.z = obtainStyledAttributes.getResourceId(7, 0);
        this.A = obtainStyledAttributes.getResourceId(3, 0);
        this.B = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        m2Var.f().f(1);
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

    public final void b(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.C.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.n = charSequence;
            this.o = obtainMessage;
        } else if (i == -2) {
            this.k = charSequence;
            this.l = obtainMessage;
        } else if (i != -1) {
            g9.i("Button does not exist");
        } else {
            this.h = charSequence;
            this.i = obtainMessage;
        }
    }
}
