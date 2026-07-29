package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.m;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements m.a {

    /* renamed from: a, reason: collision with root package name */
    private MenuItemImpl f1739a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f1740b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f1741c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f1742d;
    private CheckBox e;
    private TextView f;
    private ImageView g;
    private Drawable h;
    private int i;
    private Context j;
    private boolean k;
    private Drawable l;
    private int m;
    private LayoutInflater n;
    private boolean o;

    @Override // android.support.v7.view.menu.m.a
    public boolean a() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, R.styleable.MenuView, i, 0);
        this.h = obtainStyledAttributes.getDrawable(R.styleable.MenuView_android_itemBackground);
        this.i = obtainStyledAttributes.getResourceId(R.styleable.MenuView_android_itemTextAppearance, -1);
        this.k = obtainStyledAttributes.getBoolean(R.styleable.MenuView_preserveIconSpacing, false);
        this.j = context;
        this.l = obtainStyledAttributes.getDrawable(R.styleable.MenuView_subMenuArrow);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.setBackground(this, this.h);
        this.f1742d = (TextView) findViewById(R.id.title);
        if (this.i != -1) {
            this.f1742d.setTextAppearance(this.j, this.i);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        this.g = (ImageView) findViewById(R.id.submenuarrow);
        if (this.g != null) {
            this.g.setImageDrawable(this.l);
        }
    }

    @Override // android.support.v7.view.menu.m.a
    public void a(MenuItemImpl menuItemImpl, int i) {
        this.f1739a = menuItemImpl;
        this.m = i;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setTitle(menuItemImpl.a((m.a) this));
        setCheckable(menuItemImpl.isCheckable());
        a(menuItemImpl.e(), menuItemImpl.c());
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    public void setForceShowIcon(boolean z) {
        this.o = z;
        this.k = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1742d.setText(charSequence);
            if (this.f1742d.getVisibility() != 0) {
                this.f1742d.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f1742d.getVisibility() != 8) {
            this.f1742d.setVisibility(8);
        }
    }

    @Override // android.support.v7.view.menu.m.a
    public MenuItemImpl getItemData() {
        return this.f1739a;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f1741c == null && this.e == null) {
            return;
        }
        if (this.f1739a.f()) {
            if (this.f1741c == null) {
                c();
            }
            compoundButton = this.f1741c;
            compoundButton2 = this.e;
        } else {
            if (this.e == null) {
                d();
            }
            compoundButton = this.e;
            compoundButton2 = this.f1741c;
        }
        if (z) {
            compoundButton.setChecked(this.f1739a.isChecked());
            int i = z ? 0 : 8;
            if (compoundButton.getVisibility() != i) {
                compoundButton.setVisibility(i);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        if (this.e != null) {
            this.e.setVisibility(8);
        }
        if (this.f1741c != null) {
            this.f1741c.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1739a.f()) {
            if (this.f1741c == null) {
                c();
            }
            compoundButton = this.f1741c;
        } else {
            if (this.e == null) {
                d();
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.g != null) {
            this.g.setVisibility(z ? 0 : 8);
        }
    }

    public void a(boolean z, char c2) {
        int i = (z && this.f1739a.e()) ? 0 : 8;
        if (i == 0) {
            this.f.setText(this.f1739a.d());
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1739a.h() || this.o;
        if (z || this.k) {
            if (this.f1740b == null && drawable == null && !this.k) {
                return;
            }
            if (this.f1740b == null) {
                b();
            }
            if (drawable != null || this.k) {
                ImageView imageView = this.f1740b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f1740b.getVisibility() != 0) {
                    this.f1740b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f1740b.setVisibility(8);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f1740b != null && this.k) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1740b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    private void b() {
        this.f1740b = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
        addView(this.f1740b, 0);
    }

    private void c() {
        this.f1741c = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        addView(this.f1741c);
    }

    private void d() {
        this.e = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        addView(this.e);
    }

    private LayoutInflater getInflater() {
        if (this.n == null) {
            this.n = LayoutInflater.from(getContext());
        }
        return this.n;
    }
}
