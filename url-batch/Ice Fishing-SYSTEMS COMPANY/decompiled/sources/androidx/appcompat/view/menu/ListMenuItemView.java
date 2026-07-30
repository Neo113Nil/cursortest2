package androidx.appcompat.view.menu;

import android.R;
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
import com.anythink.basead.exoplayer.b;
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;
import l.l;
import l.n;
import l.y;
import m.Q0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A, reason: collision with root package name */
    public ImageView f4600A;

    /* renamed from: B, reason: collision with root package name */
    public LinearLayout f4601B;

    /* renamed from: C, reason: collision with root package name */
    public final Drawable f4602C;

    /* renamed from: D, reason: collision with root package name */
    public final int f4603D;

    /* renamed from: E, reason: collision with root package name */
    public final Context f4604E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4605F;

    /* renamed from: G, reason: collision with root package name */
    public final Drawable f4606G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f4607H;

    /* renamed from: I, reason: collision with root package name */
    public LayoutInflater f4608I;
    public boolean J;

    /* renamed from: n, reason: collision with root package name */
    public n f4609n;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f4610u;

    /* renamed from: v, reason: collision with root package name */
    public RadioButton f4611v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f4612w;

    /* renamed from: x, reason: collision with root package name */
    public CheckBox f4613x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f4614y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f4615z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Q0 p6 = Q0.p(getContext(), attributeSet, AbstractC4518a.f37835s, C5284R.attr.listMenuViewStyle);
        this.f4602C = p6.g(5);
        TypedArray typedArray = (TypedArray) p6.f39326c;
        this.f4603D = typedArray.getResourceId(1, -1);
        this.f4605F = typedArray.getBoolean(7, false);
        this.f4604E = context;
        this.f4606G = p6.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C5284R.attr.dropDownListViewStyle, 0);
        this.f4607H = obtainStyledAttributes.hasValue(0);
        p6.q();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4608I == null) {
            this.f4608I = LayoutInflater.from(getContext());
        }
        return this.f4608I;
    }

    private void setSubMenuArrowVisible(boolean z8) {
        ImageView imageView = this.f4615z;
        if (imageView != null) {
            imageView.setVisibility(z8 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4600A;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4600A.getLayoutParams();
        rect.top = this.f4600A.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // l.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(n nVar) {
        boolean z8;
        String sb;
        boolean z9;
        this.f4609n = nVar;
        int i = 0;
        setVisibility(nVar.isVisible() ? 0 : 8);
        setTitle(nVar.f38997x);
        setCheckable(nVar.isCheckable());
        if (nVar.f38978G.o()) {
            if ((nVar.f38978G.n() ? nVar.f38974C : nVar.f38972A) != 0) {
                z8 = true;
                nVar.f38978G.n();
                if (z8) {
                    n nVar2 = this.f4609n;
                    if (nVar2.f38978G.o()) {
                        if ((nVar2.f38978G.n() ? nVar2.f38974C : nVar2.f38972A) != 0) {
                            z9 = true;
                        }
                    }
                    z9 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f4614y;
                    n nVar3 = this.f4609n;
                    char c4 = nVar3.f38978G.n() ? nVar3.f38974C : nVar3.f38972A;
                    if (c4 == 0) {
                        sb = "";
                    } else {
                        l lVar = nVar3.f38978G;
                        Resources resources = lVar.f38962n.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(lVar.f38962n).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(C5284R.string.abc_prepend_shortcut_label));
                        }
                        int i4 = lVar.n() ? nVar3.f38975D : nVar3.f38973B;
                        n.c(i4, b.aX, resources.getString(C5284R.string.abc_menu_meta_shortcut_label), sb2);
                        n.c(i4, 4096, resources.getString(C5284R.string.abc_menu_ctrl_shortcut_label), sb2);
                        n.c(i4, 2, resources.getString(C5284R.string.abc_menu_alt_shortcut_label), sb2);
                        n.c(i4, 1, resources.getString(C5284R.string.abc_menu_shift_shortcut_label), sb2);
                        n.c(i4, 4, resources.getString(C5284R.string.abc_menu_sym_shortcut_label), sb2);
                        n.c(i4, 8, resources.getString(C5284R.string.abc_menu_function_shortcut_label), sb2);
                        if (c4 == '\b') {
                            sb2.append(resources.getString(C5284R.string.abc_menu_delete_shortcut_label));
                        } else if (c4 == '\n') {
                            sb2.append(resources.getString(C5284R.string.abc_menu_enter_shortcut_label));
                        } else if (c4 != ' ') {
                            sb2.append(c4);
                        } else {
                            sb2.append(resources.getString(C5284R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f4614y.getVisibility() != i) {
                    this.f4614y.setVisibility(i);
                }
                setIcon(nVar.getIcon());
                setEnabled(nVar.isEnabled());
                setSubMenuArrowVisible(nVar.hasSubMenu());
                setContentDescription(nVar.J);
            }
        }
        z8 = false;
        nVar.f38978G.n();
        if (z8) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f4614y.getVisibility() != i) {
        }
        setIcon(nVar.getIcon());
        setEnabled(nVar.isEnabled());
        setSubMenuArrowVisible(nVar.hasSubMenu());
        setContentDescription(nVar.J);
    }

    @Override // l.y
    public n getItemData() {
        return this.f4609n;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f4602C);
        TextView textView = (TextView) findViewById(C5284R.id.title);
        this.f4612w = textView;
        int i = this.f4603D;
        if (i != -1) {
            textView.setTextAppearance(this.f4604E, i);
        }
        this.f4614y = (TextView) findViewById(C5284R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(C5284R.id.submenuarrow);
        this.f4615z = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4606G);
        }
        this.f4600A = (ImageView) findViewById(C5284R.id.group_divider);
        this.f4601B = (LinearLayout) findViewById(C5284R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        if (this.f4610u != null && this.f4605F) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4610u.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i, i4);
    }

    public void setCheckable(boolean z8) {
        CompoundButton compoundButton;
        View view;
        if (!z8 && this.f4611v == null && this.f4613x == null) {
            return;
        }
        if ((this.f4609n.f38987Q & 4) != 0) {
            if (this.f4611v == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C5284R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4611v = radioButton;
                LinearLayout linearLayout = this.f4601B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4611v;
            view = this.f4613x;
        } else {
            if (this.f4613x == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C5284R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4613x = checkBox;
                LinearLayout linearLayout2 = this.f4601B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4613x;
            view = this.f4611v;
        }
        if (z8) {
            compoundButton.setChecked(this.f4609n.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f4613x;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4611v;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z8) {
        CompoundButton compoundButton;
        if ((this.f4609n.f38987Q & 4) != 0) {
            if (this.f4611v == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C5284R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4611v = radioButton;
                LinearLayout linearLayout = this.f4601B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4611v;
        } else {
            if (this.f4613x == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C5284R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4613x = checkBox;
                LinearLayout linearLayout2 = this.f4601B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4613x;
        }
        compoundButton.setChecked(z8);
    }

    public void setForceShowIcon(boolean z8) {
        this.J = z8;
        this.f4605F = z8;
    }

    public void setGroupDividerEnabled(boolean z8) {
        ImageView imageView = this.f4600A;
        if (imageView != null) {
            imageView.setVisibility((this.f4607H || !z8) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4609n.f38978G.getClass();
        boolean z8 = this.J;
        if (z8 || this.f4605F) {
            ImageView imageView = this.f4610u;
            if (imageView == null && drawable == null && !this.f4605F) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(C5284R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f4610u = imageView2;
                LinearLayout linearLayout = this.f4601B;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4605F) {
                this.f4610u.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4610u;
            if (!z8) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4610u.getVisibility() != 0) {
                this.f4610u.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4612w.getVisibility() != 8) {
                this.f4612w.setVisibility(8);
            }
        } else {
            this.f4612w.setText(charSequence);
            if (this.f4612w.getVisibility() != 0) {
                this.f4612w.setVisibility(0);
            }
        }
    }
}
