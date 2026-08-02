package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class df {
    public final db a;
    private final int b;

    public df(Context context, int i) {
        this.a = new db(new ContextThemeWrapper(context, dg.a(context, i)));
        this.b = i;
    }

    public final Context a() {
        return this.a.a;
    }

    public dg b() {
        ListAdapter listAdapter;
        db dbVar = this.a;
        Context context = dbVar.a;
        dg dgVar = new dg(context, this.b);
        de deVar = dgVar.a;
        View view = dbVar.f;
        if (view != null) {
            deVar.x = view;
        } else {
            CharSequence charSequence = dbVar.e;
            if (charSequence != null) {
                deVar.a(charSequence);
            }
            Drawable drawable = dbVar.d;
            if (drawable != null) {
                deVar.t = drawable;
                deVar.s = 0;
                ImageView imageView = deVar.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    deVar.u.setImageDrawable(drawable);
                }
            }
            int i = dbVar.c;
            if (i != 0) {
                deVar.t = null;
                deVar.s = i;
                ImageView imageView2 = deVar.u;
                if (imageView2 != null) {
                    if (i != 0) {
                        imageView2.setVisibility(0);
                        deVar.u.setImageResource(deVar.s);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = dbVar.g;
        if (charSequence2 != null) {
            deVar.e = charSequence2;
            TextView textView = deVar.w;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = dbVar.h;
        if (charSequence3 != null) {
            deVar.e(-1, charSequence3, dbVar.i);
        }
        CharSequence charSequence4 = dbVar.j;
        if (charSequence4 != null) {
            deVar.e(-2, charSequence4, dbVar.k);
        }
        CharSequence charSequence5 = dbVar.l;
        if (charSequence5 != null) {
            deVar.e(-3, charSequence5, dbVar.m);
        }
        if (dbVar.q != null || dbVar.r != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) dbVar.b.inflate(deVar.C, (ViewGroup) null);
            if (dbVar.v) {
                listAdapter = new cy(dbVar, context, deVar.D, dbVar.q, alertController$RecycleListView);
            } else {
                int i2 = dbVar.w ? deVar.E : deVar.F;
                ListAdapter listAdapter2 = dbVar.r;
                if (listAdapter2 == null) {
                    listAdapter2 = new dd(context, i2, dbVar.q);
                }
                listAdapter = listAdapter2;
            }
            deVar.y = listAdapter;
            deVar.z = dbVar.x;
            if (dbVar.s != null) {
                alertController$RecycleListView.setOnItemClickListener(new cz(dbVar, deVar));
            } else if (dbVar.y != null) {
                alertController$RecycleListView.setOnItemClickListener(new da(dbVar, alertController$RecycleListView, deVar));
            }
            if (dbVar.w) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (dbVar.v) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            deVar.f = alertController$RecycleListView;
        }
        View view2 = dbVar.t;
        if (view2 != null) {
            deVar.g = view2;
            deVar.h = false;
        }
        dgVar.setCancelable(dbVar.n);
        if (dbVar.n) {
            dgVar.setCanceledOnTouchOutside(true);
        }
        dgVar.setOnCancelListener(dbVar.o);
        dgVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = dbVar.p;
        if (onKeyListener != null) {
            dgVar.setOnKeyListener(onKeyListener);
        }
        return dgVar;
    }

    public final void c(Drawable drawable) {
        this.a.d = drawable;
    }

    public final void d(CharSequence charSequence) {
        this.a.g = charSequence;
    }

    public final void e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        db dbVar = this.a;
        dbVar.j = charSequence;
        dbVar.k = onClickListener;
    }

    public final void f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        db dbVar = this.a;
        dbVar.h = charSequence;
        dbVar.i = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.a.e = charSequence;
    }

    public final void h(View view) {
        this.a.t = view;
    }

    public final void i() {
        b().show();
    }

    public df(Context context) {
        this(context, dg.a(context, 0));
    }
}
