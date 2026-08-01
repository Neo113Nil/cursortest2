package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class v2 {
    public int a;
    public final Object b;

    public v2(int i) {
        switch (i) {
            case 3:
                this.b = new int[10];
                break;
            default:
                this.a = 1;
                this.b = Collections.singletonList(null);
                break;
        }
    }

    public w2 a() {
        r2 r2Var = (r2) this.b;
        w2 w2Var = new w2(r2Var.a, this.a);
        View view = r2Var.e;
        u2 u2Var = w2Var.f;
        if (view != null) {
            u2Var.u = view;
        } else {
            CharSequence charSequence = r2Var.d;
            if (charSequence != null) {
                u2Var.d = charSequence;
                TextView textView = u2Var.s;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = r2Var.c;
            if (drawable != null) {
                u2Var.q = drawable;
                ImageView imageView = u2Var.r;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    u2Var.r.setImageDrawable(drawable);
                }
            }
        }
        String str = r2Var.f;
        if (str != null) {
            u2Var.e = str;
            TextView textView2 = u2Var.t;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = r2Var.g;
        if (charSequence2 != null) {
            u2Var.b(-1, charSequence2, r2Var.h);
        }
        CharSequence charSequence3 = r2Var.i;
        if (charSequence3 != null) {
            u2Var.b(-2, charSequence3, null);
        }
        if (r2Var.k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) r2Var.b.inflate(u2Var.y, (ViewGroup) null);
            int i = r2Var.m ? u2Var.z : u2Var.A;
            ListAdapter listAdapter = r2Var.k;
            if (listAdapter == null) {
                listAdapter = new t2(r2Var.a, i, R.id.text1, null);
            }
            u2Var.v = listAdapter;
            u2Var.w = r2Var.n;
            if (r2Var.l != null) {
                alertController$RecycleListView.setOnItemClickListener(new q2(r2Var, u2Var));
            }
            if (r2Var.m) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            u2Var.f = alertController$RecycleListView;
        }
        w2Var.setCancelable(true);
        w2Var.setCanceledOnTouchOutside(true);
        w2Var.setOnCancelListener(null);
        w2Var.setOnDismissListener(null);
        bu buVar = r2Var.j;
        if (buVar != null) {
            w2Var.setOnKeyListener(buVar);
        }
        return w2Var;
    }

    public int b() {
        if ((this.a & 128) != 0) {
            return ((int[]) this.b)[7];
        }
        return 65535;
    }

    public boolean c() {
        return this.a < ((ArrayList) this.b).size();
    }

    public void d(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }

    public v2(Context context, int i) {
        this.b = new r2(new ContextThemeWrapper(context, w2.b(context, i)));
        this.a = i;
    }

    public v2(Context context) {
        this(context, w2.b(context, 0));
    }

    public v2(ArrayList arrayList, int i) {
        switch (i) {
            case 2:
                this.b = arrayList;
                break;
            default:
                this.a = 0;
                this.b = arrayList;
                break;
        }
    }
}
