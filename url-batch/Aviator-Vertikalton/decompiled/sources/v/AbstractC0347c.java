package v;

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
import s.C0325d;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0347c extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4244a;

    /* renamed from: b, reason: collision with root package name */
    public int f4245b;

    /* renamed from: c, reason: collision with root package name */
    public Context f4246c;

    /* renamed from: d, reason: collision with root package name */
    public s.i f4247d;

    /* renamed from: e, reason: collision with root package name */
    public String f4248e;

    /* renamed from: f, reason: collision with root package name */
    public String f4249f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f4250g;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        Context context;
        int i;
        HashMap hashMap;
        if (str == null || str.length() == 0 || (context = this.f4246c) == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Object obj = (trim == null || (hashMap = constraintLayout.f1120m) == null || !hashMap.containsKey(trim)) ? null : constraintLayout.f1120m.get(trim);
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
                if (i == 0 && constraintLayout != null) {
                    i = f(constraintLayout, trim);
                }
                if (i == 0) {
                    try {
                        i = q.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i == 0) {
                    i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i == 0) {
                    this.f4250g.put(Integer.valueOf(i), trim);
                    b(i);
                    return;
                } else {
                    Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
                    return;
                }
            }
        }
        i = 0;
        if (i == 0) {
            i = f(constraintLayout, trim);
        }
        if (i == 0) {
        }
        if (i == 0) {
        }
        if (i == 0) {
        }
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f4245b + 1;
        int[] iArr = this.f4244a;
        if (i2 > iArr.length) {
            this.f4244a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f4244a;
        int i3 = this.f4245b;
        iArr2[i3] = i;
        this.f4245b = i3 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f4246c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C0349e) && trim.equals(((C0349e) layoutParams).f4275Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f4245b; i++) {
            View view = (View) constraintLayout.f1110a.get(this.f4244a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f4246c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
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

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4438b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f4248e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f4249f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4244a, this.f4245b);
    }

    public abstract void h(C0325d c0325d, boolean z2);

    public final void i() {
        if (this.f4247d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C0349e) {
            ((C0349e) layoutParams).f4304p0 = this.f4247d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4248e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f4249f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f4248e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f4245b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f4249f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f4245b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4248e = null;
        this.f4245b = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f4248e == null) {
            b(i);
        }
    }
}
