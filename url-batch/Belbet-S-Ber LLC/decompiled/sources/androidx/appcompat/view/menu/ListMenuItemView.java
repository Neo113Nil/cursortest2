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
import androidx.emoji2.text.t;
import com.gdmhkmf.belbet.R;
import f.a;
import k.m;
import k.o;
import k.z;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f, reason: collision with root package name */
    public o f268f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f269g;
    public RadioButton h;
    public TextView i;

    /* renamed from: j, reason: collision with root package name */
    public CheckBox f270j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f271k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f272l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f273m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f274n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f275o;

    /* renamed from: p, reason: collision with root package name */
    public final int f276p;

    /* renamed from: q, reason: collision with root package name */
    public final Context f277q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f278r;

    /* renamed from: s, reason: collision with root package name */
    public final Drawable f279s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f280t;

    /* renamed from: u, reason: collision with root package name */
    public LayoutInflater f281u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f282v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t i = t.i(R.attr.listMenuViewStyle, 0, getContext(), attributeSet, a.f1404r);
        this.f275o = i.d(5);
        TypedArray typedArray = (TypedArray) i.f473b;
        this.f276p = typedArray.getResourceId(1, -1);
        this.f278r = typedArray.getBoolean(7, false);
        this.f277q = context;
        this.f279s = i.d(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f280t = obtainStyledAttributes.hasValue(0);
        i.k();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f281u == null) {
            this.f281u = LayoutInflater.from(getContext());
        }
        return this.f281u;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f272l;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f273m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f273m.getLayoutParams();
        rect.top = this.f273m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // k.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(o oVar) {
        boolean z4;
        String sb;
        boolean z5;
        this.f268f = oVar;
        boolean isVisible = oVar.isVisible();
        m mVar = oVar.f2244n;
        int i = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(oVar.f2237e);
        setCheckable(oVar.isCheckable());
        if (mVar.o()) {
            if ((mVar.n() ? oVar.f2240j : oVar.h) != 0) {
                z4 = true;
                mVar.n();
                if (z4) {
                    o oVar2 = this.f268f;
                    m mVar2 = oVar2.f2244n;
                    if (mVar2.o()) {
                        if ((mVar2.n() ? oVar2.f2240j : oVar2.h) != 0) {
                            z5 = true;
                        }
                    }
                    z5 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f271k;
                    o oVar3 = this.f268f;
                    m mVar3 = oVar3.f2244n;
                    Context context = mVar3.f2211a;
                    char c5 = mVar3.n() ? oVar3.f2240j : oVar3.h;
                    if (c5 == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i4 = mVar3.n() ? oVar3.f2241k : oVar3.i;
                        o.c(i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        o.c(i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        o.c(i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        o.c(i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        o.c(i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        o.c(i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c5 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c5 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c5 != ' ') {
                            sb2.append(c5);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f271k.getVisibility() != i) {
                    this.f271k.setVisibility(i);
                }
                setIcon(oVar.getIcon());
                setEnabled(oVar.isEnabled());
                setSubMenuArrowVisible(oVar.hasSubMenu());
                setContentDescription(oVar.f2247q);
            }
        }
        z4 = false;
        mVar.n();
        if (z4) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f271k.getVisibility() != i) {
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.f2247q);
    }

    @Override // k.z
    public o getItemData() {
        return this.f268f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f275o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.i = textView;
        int i = this.f276p;
        if (i != -1) {
            textView.setTextAppearance(this.f277q, i);
        }
        this.f271k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f272l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f279s);
        }
        this.f273m = (ImageView) findViewById(R.id.group_divider);
        this.f274n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        if (this.f269g != null && this.f278r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f269g.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i, i4);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.h == null && this.f270j == null) {
            return;
        }
        if ((this.f268f.f2254x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.f274n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
            view = this.f270j;
        } else {
            if (this.f270j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f270j = checkBox;
                LinearLayout linearLayout2 = this.f274n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f270j;
            view = this.h;
        }
        if (z4) {
            compoundButton.setChecked(this.f268f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f270j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.f268f.f2254x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.f274n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
        } else {
            if (this.f270j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f270j = checkBox;
                LinearLayout linearLayout2 = this.f274n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f270j;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f282v = z4;
        this.f278r = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f273m;
        if (imageView != null) {
            imageView.setVisibility((this.f280t || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        m mVar = this.f268f.f2244n;
        boolean z4 = this.f282v;
        if (z4 || this.f278r) {
            ImageView imageView = this.f269g;
            if (imageView == null && drawable == null && !this.f278r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f269g = imageView2;
                LinearLayout linearLayout = this.f274n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f278r) {
                this.f269g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f269g;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f269g.getVisibility() != 0) {
                this.f269g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.i.getVisibility() != 8) {
                this.i.setVisibility(8);
            }
        } else {
            this.i.setText(charSequence);
            if (this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
        }
    }
}
