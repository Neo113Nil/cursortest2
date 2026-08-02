package androidx.appcompat.view.menu;

import B1.j;
import E.H;
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
import com.rockchicken.pump.up.road.R;
import f.AbstractC0410a;
import j.k;
import j.q;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public k f4306a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f4307b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f4308c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f4309d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f4310e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f4311f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f4312g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f4313h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f4314i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f4315j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4316k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f4317l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4318m;
    public final Drawable n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f4319p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4320q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j v = j.v(getContext(), attributeSet, AbstractC0410a.n, R.attr.listMenuViewStyle);
        this.f4315j = v.o(5);
        TypedArray typedArray = (TypedArray) v.f202c;
        this.f4316k = typedArray.getResourceId(1, -1);
        this.f4318m = typedArray.getBoolean(7, false);
        this.f4317l = context;
        this.n = v.o(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.o = obtainStyledAttributes.hasValue(0);
        v.x();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4319p == null) {
            this.f4319p = LayoutInflater.from(getContext());
        }
        return this.f4319p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f4312g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4313h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4313h.getLayoutParams();
        rect.top = this.f4313h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // j.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(k kVar) {
        boolean z;
        String sb;
        boolean z4;
        this.f4306a = kVar;
        int i4 = 0;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.f13672e);
        setCheckable(kVar.isCheckable());
        if (kVar.n.n()) {
            if ((kVar.n.m() ? kVar.f13677j : kVar.f13675h) != 0) {
                z = true;
                kVar.n.m();
                if (z) {
                    k kVar2 = this.f4306a;
                    if (kVar2.n.n()) {
                        if ((kVar2.n.m() ? kVar2.f13677j : kVar2.f13675h) != 0) {
                            z4 = true;
                        }
                    }
                    z4 = false;
                }
                i4 = 8;
                if (i4 == 0) {
                    TextView textView = this.f4311f;
                    k kVar3 = this.f4306a;
                    j.j jVar = kVar3.n;
                    Context context = jVar.f13647a;
                    char c4 = jVar.m() ? kVar3.f13677j : kVar3.f13675h;
                    if (c4 == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i5 = jVar.m() ? kVar3.f13678k : kVar3.f13676i;
                        k.a(sb2, i5, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        k.a(sb2, i5, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        k.a(sb2, i5, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        k.a(sb2, i5, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        k.a(sb2, i5, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        k.a(sb2, i5, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c4 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c4 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c4 != ' ') {
                            sb2.append(c4);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f4311f.getVisibility() != i4) {
                    this.f4311f.setVisibility(i4);
                }
                setIcon(kVar.getIcon());
                setEnabled(kVar.isEnabled());
                setSubMenuArrowVisible(kVar.hasSubMenu());
                setContentDescription(kVar.f13682q);
            }
        }
        z = false;
        kVar.n.m();
        if (z) {
        }
        i4 = 8;
        if (i4 == 0) {
        }
        if (this.f4311f.getVisibility() != i4) {
        }
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
        setContentDescription(kVar.f13682q);
    }

    @Override // j.q
    public k getItemData() {
        return this.f4306a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = H.f375a;
        setBackground(this.f4315j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f4309d = textView;
        int i4 = this.f4316k;
        if (i4 != -1) {
            textView.setTextAppearance(this.f4317l, i4);
        }
        this.f4311f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f4312g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.f4313h = (ImageView) findViewById(R.id.group_divider);
        this.f4314i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        if (this.f4307b != null && this.f4318m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4307b.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f4308c == null && this.f4310e == null) {
            return;
        }
        if ((this.f4306a.f13688x & 4) != 0) {
            if (this.f4308c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4308c = radioButton;
                LinearLayout linearLayout = this.f4314i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4308c;
            view = this.f4310e;
        } else {
            if (this.f4310e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4310e = checkBox;
                LinearLayout linearLayout2 = this.f4314i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4310e;
            view = this.f4308c;
        }
        if (z) {
            compoundButton.setChecked(this.f4306a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f4310e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4308c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f4306a.f13688x & 4) != 0) {
            if (this.f4308c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4308c = radioButton;
                LinearLayout linearLayout = this.f4314i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4308c;
        } else {
            if (this.f4310e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4310e = checkBox;
                LinearLayout linearLayout2 = this.f4314i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4310e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f4320q = z;
        this.f4318m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f4313h;
        if (imageView != null) {
            imageView.setVisibility((this.o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        j.j jVar = this.f4306a.n;
        boolean z = this.f4320q;
        if (z || this.f4318m) {
            ImageView imageView = this.f4307b;
            if (imageView == null && drawable == null && !this.f4318m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f4307b = imageView2;
                LinearLayout linearLayout = this.f4314i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4318m) {
                this.f4307b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4307b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4307b.getVisibility() != 0) {
                this.f4307b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4309d.getVisibility() != 8) {
                this.f4309d.setVisibility(8);
            }
        } else {
            this.f4309d.setText(charSequence);
            if (this.f4309d.getVisibility() != 0) {
                this.f4309d.setVisibility(0);
            }
        }
    }
}
