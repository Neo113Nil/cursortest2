package defpackage;

import android.content.Context;
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
import com.awerser.monnit.betplay.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class u2 {
    public final int A;
    public final boolean B;
    public final s2 C;
    public final Context a;
    public final w2 b;
    public final Window c;
    public CharSequence d;
    public String e;
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
    public final w0 D = new w0(1, this);

    public u2(Context context, w2 w2Var, Window window) {
        this.a = context;
        this.b = w2Var;
        this.c = window;
        s2 s2Var = new s2();
        s2Var.a = new WeakReference(w2Var);
        this.C = s2Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, my.e, R.attr.alertDialogStyle, 0);
        this.x = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.y = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.z = obtainStyledAttributes.getResourceId(7, 0);
        this.A = obtainStyledAttributes.getResourceId(3, 0);
        this.B = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        w2Var.supportRequestWindowFeature(1);
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

    public final void b(int i, CharSequence charSequence, zr zrVar) {
        Message obtainMessage = zrVar != null ? this.C.obtainMessage(i, zrVar) : null;
        if (i == -3) {
            this.n = charSequence;
            this.o = obtainMessage;
        } else if (i == -2) {
            this.k = charSequence;
            this.l = obtainMessage;
        } else if (i != -1) {
            o8.j("Button does not exist");
        } else {
            this.h = charSequence;
            this.i = obtainMessage;
        }
    }
}
