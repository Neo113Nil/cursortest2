package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController$RecycleListView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dg extends ea implements DialogInterface {
    public final de a;

    protected dg(Context context, int i) {
        super(context, a(context, i));
        this.a = new de(getContext(), this, getWindow());
    }

    static int a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0251 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ec  */
    @Override // defpackage.ea, defpackage.nh, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onCreate(Bundle bundle) {
        ViewGroup d;
        ViewGroup d2;
        TextView textView;
        int i;
        TypedValue typedValue;
        boolean z;
        int i2;
        boolean z2;
        View findViewById;
        ListView listView;
        ListView listView2;
        ListAdapter listAdapter;
        int i3;
        View findViewById2;
        super.onCreate(bundle);
        de deVar = this.a;
        int i4 = deVar.B;
        deVar.b.setContentView(deVar.A);
        Window window = deVar.c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view = deVar.g;
        if (view == null) {
            view = null;
        }
        boolean z3 = view != null;
        if (!z3 || !de.b(view)) {
            window.setFlags(131072, 131072);
            if (!z3) {
                viewGroup.setVisibility(8);
                View findViewById7 = viewGroup.findViewById(R.id.topPanel);
                View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
                View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
                d = de.d(findViewById7, findViewById4);
                ViewGroup d3 = de.d(findViewById8, findViewById5);
                d2 = de.d(findViewById9, findViewById6);
                deVar.r = (NestedScrollView) window.findViewById(R.id.scrollView);
                deVar.r.setFocusable(false);
                deVar.r.setNestedScrollingEnabled(false);
                deVar.w = (TextView) d3.findViewById(android.R.id.message);
                textView = deVar.w;
                if (textView != null) {
                    CharSequence charSequence = deVar.e;
                    if (charSequence != null) {
                        textView.setText(charSequence);
                    } else {
                        textView.setVisibility(8);
                        deVar.r.removeView(deVar.w);
                        if (deVar.f != null) {
                            ViewGroup viewGroup2 = (ViewGroup) deVar.r.getParent();
                            int indexOfChild = viewGroup2.indexOfChild(deVar.r);
                            viewGroup2.removeViewAt(indexOfChild);
                            viewGroup2.addView(deVar.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                        } else {
                            d3.setVisibility(8);
                        }
                    }
                }
                deVar.i = (Button) d2.findViewById(android.R.id.button1);
                Button button = deVar.i;
                View.OnClickListener onClickListener = deVar.I;
                button.setOnClickListener(onClickListener);
                if (TextUtils.isEmpty(deVar.j)) {
                    deVar.i.setText(deVar.j);
                    deVar.i.setVisibility(0);
                    i = 1;
                } else {
                    deVar.i.setVisibility(8);
                    i = 0;
                }
                deVar.l = (Button) d2.findViewById(android.R.id.button2);
                deVar.l.setOnClickListener(onClickListener);
                if (TextUtils.isEmpty(deVar.m)) {
                    deVar.l.setText(deVar.m);
                    deVar.l.setVisibility(0);
                    i |= 2;
                } else {
                    deVar.l.setVisibility(8);
                }
                deVar.o = (Button) d2.findViewById(android.R.id.button3);
                deVar.o.setOnClickListener(onClickListener);
                if (TextUtils.isEmpty(deVar.p)) {
                    deVar.o.setText(deVar.p);
                    deVar.o.setVisibility(0);
                    i |= 4;
                } else {
                    deVar.o.setVisibility(8);
                }
                Context context = deVar.a;
                typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
                if (typedValue.data != 0) {
                    if (i == 1) {
                        de.c(deVar.i);
                    } else if (i == 2) {
                        de.c(deVar.l);
                    } else if (i == 4) {
                        de.c(deVar.o);
                    }
                    if (deVar.x != null) {
                        d.addView(deVar.x, 0, new ViewGroup.LayoutParams(-1, -2));
                        window.findViewById(R.id.title_template).setVisibility(8);
                    } else {
                        deVar.u = (ImageView) window.findViewById(android.R.id.icon);
                        if (TextUtils.isEmpty(deVar.d) || !deVar.G) {
                            window.findViewById(R.id.title_template).setVisibility(8);
                            deVar.u.setVisibility(8);
                            d.setVisibility(8);
                        } else {
                            deVar.v = (TextView) window.findViewById(R.id.alertTitle);
                            deVar.v.setText(deVar.d);
                            int i5 = deVar.s;
                            if (i5 != 0) {
                                deVar.u.setImageResource(i5);
                            } else {
                                Drawable drawable = deVar.t;
                                if (drawable != null) {
                                    deVar.u.setImageDrawable(drawable);
                                } else {
                                    deVar.v.setPadding(deVar.u.getPaddingLeft(), deVar.u.getPaddingTop(), deVar.u.getPaddingRight(), deVar.u.getPaddingBottom());
                                    deVar.u.setVisibility(8);
                                }
                            }
                        }
                    }
                    z = viewGroup == null && viewGroup.getVisibility() != 8;
                    i2 = (d != null || d.getVisibility() == 8) ? 0 : 1;
                    z2 = d2 == null && d2.getVisibility() != 8;
                    if (!z2 && d3 != null && (findViewById2 = d3.findViewById(R.id.textSpacerNoButtons)) != null) {
                        findViewById2.setVisibility(0);
                    }
                    if (i2 != 0) {
                        NestedScrollView nestedScrollView = deVar.r;
                        if (nestedScrollView != null) {
                            nestedScrollView.setClipToPadding(true);
                        }
                        View findViewById10 = (deVar.e == null && deVar.f == null) ? null : d.findViewById(R.id.titleDividerNoCustom);
                        if (findViewById10 != null) {
                            findViewById10.setVisibility(0);
                        }
                    } else if (d3 != null && (findViewById = d3.findViewById(R.id.textSpacerNoTitle)) != null) {
                        findViewById.setVisibility(0);
                    }
                    listView = deVar.f;
                    if (listView instanceof AlertController$RecycleListView) {
                        if (!z2) {
                            i3 = i2;
                        } else if (i2 == 0) {
                            i3 = 0;
                        }
                        AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) listView;
                        alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
                    }
                    if (!z) {
                        View view2 = deVar.f;
                        if (view2 == null) {
                            view2 = deVar.r;
                        }
                        if (view2 != null) {
                            int i6 = i2 | (true == z2 ? 2 : 0);
                            View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                            View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                            int i7 = yq.a;
                            view2.setScrollIndicators(i6, 3);
                            if (findViewById11 != null) {
                                d3.removeView(findViewById11);
                            }
                            if (findViewById12 != null) {
                                d3.removeView(findViewById12);
                            }
                        }
                    }
                    listView2 = deVar.f;
                    if (listView2 == null || (listAdapter = deVar.y) == null) {
                        return;
                    }
                    listView2.setAdapter(listAdapter);
                    int i8 = deVar.z;
                    if (i8 >= 0) {
                        listView2.setItemChecked(i8, true);
                        listView2.setSelection(i8);
                        return;
                    }
                    return;
                }
                if (i == 0) {
                    d2.setVisibility(8);
                }
                if (deVar.x != null) {
                }
                if (viewGroup == null) {
                }
                if (d != null) {
                }
                if (d2 == null) {
                }
                if (!z2) {
                    findViewById2.setVisibility(0);
                }
                if (i2 != 0) {
                }
                listView = deVar.f;
                if (listView instanceof AlertController$RecycleListView) {
                }
                if (!z) {
                }
                listView2 = deVar.f;
                if (listView2 == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        ((FrameLayout) window.findViewById(R.id.custom)).addView(view, new ViewGroup.LayoutParams(-1, -1));
        boolean z4 = deVar.h;
        if (deVar.f != null) {
            ((ka) viewGroup.getLayoutParams()).weight = 0.0f;
        }
        View findViewById72 = viewGroup.findViewById(R.id.topPanel);
        View findViewById82 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById92 = viewGroup.findViewById(R.id.buttonPanel);
        d = de.d(findViewById72, findViewById4);
        ViewGroup d32 = de.d(findViewById82, findViewById5);
        d2 = de.d(findViewById92, findViewById6);
        deVar.r = (NestedScrollView) window.findViewById(R.id.scrollView);
        deVar.r.setFocusable(false);
        deVar.r.setNestedScrollingEnabled(false);
        deVar.w = (TextView) d32.findViewById(android.R.id.message);
        textView = deVar.w;
        if (textView != null) {
        }
        deVar.i = (Button) d2.findViewById(android.R.id.button1);
        Button button2 = deVar.i;
        View.OnClickListener onClickListener2 = deVar.I;
        button2.setOnClickListener(onClickListener2);
        if (TextUtils.isEmpty(deVar.j)) {
        }
        deVar.l = (Button) d2.findViewById(android.R.id.button2);
        deVar.l.setOnClickListener(onClickListener2);
        if (TextUtils.isEmpty(deVar.m)) {
        }
        deVar.o = (Button) d2.findViewById(android.R.id.button3);
        deVar.o.setOnClickListener(onClickListener2);
        if (TextUtils.isEmpty(deVar.p)) {
        }
        Context context2 = deVar.a;
        typedValue = new TypedValue();
        context2.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
        }
        if (i == 0) {
        }
        if (deVar.x != null) {
        }
        if (viewGroup == null) {
        }
        if (d != null) {
        }
        if (d2 == null) {
        }
        if (!z2) {
        }
        if (i2 != 0) {
        }
        listView = deVar.f;
        if (listView instanceof AlertController$RecycleListView) {
        }
        if (!z) {
        }
        listView2 = deVar.f;
        if (listView2 == null) {
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.r;
        if (nestedScrollView == null || !nestedScrollView.n(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.r;
        if (nestedScrollView == null || !nestedScrollView.n(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.ea, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }
}
