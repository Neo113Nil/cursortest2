package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.R;
import defpackage.b62;
import defpackage.bl1;
import defpackage.fk1;
import defpackage.lk1;
import defpackage.mh;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements bl1, AbsListView.SelectionBoundsAdjuster {
    public final boolean A;
    public LayoutInflater B;
    public boolean C;
    public lk1 m;
    public ImageView n;
    public RadioButton o;
    public TextView p;
    public CheckBox q;
    public TextView r;
    public ImageView s;
    public ImageView t;
    public LinearLayout u;
    public final Drawable v;
    public final int w;
    public final Context x;
    public boolean y;
    public final Drawable z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mh z = mh.z(getContext(), attributeSet, b62.r, R.attr.listMenuViewStyle);
        this.v = z.q(5);
        TypedArray typedArray = (TypedArray) z.n;
        this.w = typedArray.getResourceId(1, -1);
        this.y = typedArray.getBoolean(7, false);
        this.x = context;
        this.z = z.q(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.A = obtainStyledAttributes.hasValue(0);
        z.B();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.B == null) {
            this.B = LayoutInflater.from(getContext());
        }
        return this.B;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.s;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if ((r1.n() ? r0.j : r0.h) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    @Override // defpackage.bl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(lk1 lk1Var) {
        boolean z;
        String sb;
        this.m = lk1Var;
        boolean isVisible = lk1Var.isVisible();
        fk1 fk1Var = lk1Var.n;
        int i = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(lk1Var.e);
        setCheckable(lk1Var.isCheckable());
        if (fk1Var.o()) {
            if ((fk1Var.n() ? lk1Var.j : lk1Var.h) != 0) {
                z = true;
                fk1Var.n();
                if (z) {
                    lk1 lk1Var2 = this.m;
                    fk1 fk1Var2 = lk1Var2.n;
                    if (fk1Var2.o()) {
                    }
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.r;
                    lk1 lk1Var3 = this.m;
                    fk1 fk1Var3 = lk1Var3.n;
                    Context context = fk1Var3.a;
                    char c = fk1Var3.n() ? lk1Var3.j : lk1Var3.h;
                    if (c == 0) {
                        sb = BuildConfig.FLAVOR;
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = fk1Var3.n() ? lk1Var3.k : lk1Var3.i;
                        lk1.c(i2, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        lk1.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        lk1.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        lk1.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        lk1.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        lk1.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c != ' ') {
                            sb2.append(c);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.r.getVisibility() != i) {
                    this.r.setVisibility(i);
                }
                setIcon(lk1Var.getIcon());
                setEnabled(lk1Var.isEnabled());
                setSubMenuArrowVisible(lk1Var.hasSubMenu());
                setContentDescription(lk1Var.q);
            }
        }
        z = false;
        fk1Var.n();
        if (z) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.r.getVisibility() != i) {
        }
        setIcon(lk1Var.getIcon());
        setEnabled(lk1Var.isEnabled());
        setSubMenuArrowVisible(lk1Var.hasSubMenu());
        setContentDescription(lk1Var.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.t;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.t.getLayoutParams();
        rect.top = this.t.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // defpackage.bl1
    public lk1 getItemData() {
        return this.m;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.v);
        TextView textView = (TextView) findViewById(R.id.title);
        this.p = textView;
        int i = this.w;
        if (i != -1) {
            textView.setTextAppearance(this.x, i);
        }
        this.r = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.s = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.z);
        }
        this.t = (ImageView) findViewById(R.id.group_divider);
        this.u = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.n != null && this.y) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.n.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.o == null && this.q == null) {
            return;
        }
        if ((this.m.x & 4) != 0) {
            if (this.o == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.o = radioButton;
                LinearLayout linearLayout = this.u;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.o;
            view = this.q;
        } else {
            if (this.q == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.q = checkBox;
                LinearLayout linearLayout2 = this.u;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.q;
            view = this.o;
        }
        if (z) {
            compoundButton.setChecked(this.m.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.q;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.o;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.m.x & 4) != 0) {
            if (this.o == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.o = radioButton;
                LinearLayout linearLayout = this.u;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.o;
        } else {
            if (this.q == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.q = checkBox;
                LinearLayout linearLayout2 = this.u;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.q;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.C = z;
        this.y = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setVisibility((this.A || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        fk1 fk1Var = this.m.n;
        boolean z = this.C;
        if (z || this.y) {
            ImageView imageView = this.n;
            if (imageView == null && drawable == null && !this.y) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.n = imageView2;
                LinearLayout linearLayout = this.u;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.y) {
                this.n.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.n;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.n.getVisibility() != 0) {
                this.n.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.p;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.p.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.p.getVisibility() != 0) {
                this.p.setVisibility(0);
            }
        }
    }
}
