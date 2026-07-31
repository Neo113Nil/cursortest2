package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import t.C3423e;
import t.h;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a, reason: collision with root package name */
    protected int[] f11185a;

    /* renamed from: b, reason: collision with root package name */
    protected int f11186b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f11187c;

    /* renamed from: d, reason: collision with root package name */
    protected h f11188d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f11189e;

    /* renamed from: f, reason: collision with root package name */
    protected String f11190f;

    /* renamed from: g, reason: collision with root package name */
    private View[] f11191g;

    /* renamed from: h, reason: collision with root package name */
    private HashMap f11192h;

    public b(Context context) {
        super(context);
        this.f11185a = new int[32];
        this.f11189e = false;
        this.f11191g = null;
        this.f11192h = new HashMap();
        this.f11187c = context;
        e(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f11187c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int d4 = d(trim);
        if (d4 != 0) {
            this.f11192h.put(Integer.valueOf(d4), trim);
            b(d4);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void b(int i4) {
        if (i4 == getId()) {
            return;
        }
        int i5 = this.f11186b + 1;
        int[] iArr = this.f11185a;
        if (i5 > iArr.length) {
            this.f11185a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f11185a;
        int i6 = this.f11186b;
        iArr2[i6] = i4;
        this.f11186b = i6 + 1;
    }

    private int c(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f11187c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int d(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i4 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i4 = ((Integer) designInformation).intValue();
            }
        }
        if (i4 == 0 && constraintLayout != null) {
            i4 = c(constraintLayout, str);
        }
        if (i4 == 0) {
            try {
                i4 = f.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i4 == 0 ? this.f11187c.getResources().getIdentifier(str, "id", this.f11187c.getPackageName()) : i4;
    }

    protected void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f11422a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.f11472k1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f11190f = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(C3423e c3423e, boolean z4);

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f11185a, this.f11186b);
    }

    public void h(ConstraintLayout constraintLayout) {
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
        String str;
        int c4;
        if (isInEditMode()) {
            setIds(this.f11190f);
        }
        h hVar = this.f11188d;
        if (hVar == null) {
            return;
        }
        hVar.b();
        for (int i4 = 0; i4 < this.f11186b; i4++) {
            int i5 = this.f11185a[i4];
            View viewById = constraintLayout.getViewById(i5);
            if (viewById == null && (c4 = c(constraintLayout, (str = (String) this.f11192h.get(Integer.valueOf(i5))))) != 0) {
                this.f11185a[i4] = c4;
                this.f11192h.put(Integer.valueOf(c4), str);
                viewById = constraintLayout.getViewById(c4);
            }
            if (viewById != null) {
                this.f11188d.c(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f11188d.a(constraintLayout.mLayoutWidget);
    }

    public void k() {
        if (this.f11188d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f11146n0 = (C3423e) this.f11188d;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f11190f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f11189e) {
            super.onMeasure(i4, i5);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f11190f = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f11186b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i4);
            if (indexOf == -1) {
                a(str.substring(i4));
                return;
            } else {
                a(str.substring(i4, indexOf));
                i4 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f11190f = null;
        this.f11186b = 0;
        for (int i4 : iArr) {
            b(i4);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11185a = new int[32];
        this.f11189e = false;
        this.f11191g = null;
        this.f11192h = new HashMap();
        this.f11187c = context;
        e(attributeSet);
    }
}
