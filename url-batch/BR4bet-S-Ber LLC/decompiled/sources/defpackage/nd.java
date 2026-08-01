package defpackage;

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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class nd extends View {
    public int[] f;
    public int g;
    public Context h;
    public mp i;
    public String j;
    public String k;
    public HashMap l;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        int i;
        HashMap hashMap;
        Context context = this.h;
        if (str.length() == 0 || context == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Object obj = (trim == null || (hashMap = constraintLayout.r) == null || !hashMap.containsKey(trim)) ? null : constraintLayout.r.get(trim);
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
                if (i == 0 && constraintLayout != null) {
                    i = f(constraintLayout, trim);
                }
                if (i == 0) {
                    try {
                        i = r00.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i == 0) {
                    i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i == 0) {
                    this.l.put(Integer.valueOf(i), trim);
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
        int i2 = this.g + 1;
        int[] iArr = this.f;
        if (i2 > iArr.length) {
            this.f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f;
        int i3 = this.g;
        iArr2[i3] = i;
        this.g = i3 + 1;
    }

    public final void c(String str) {
        if (str.length() == 0 || this.h == null) {
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
            if ((layoutParams instanceof pd) && trim.equals(((pd) layoutParams).Y)) {
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
        for (int i = 0; i < this.g; i++) {
            View view = (View) constraintLayout.f.get(this.f[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.h.getResources()) != null) {
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
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t00.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.j = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.k = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f, this.g);
    }

    public abstract void h(ae aeVar, boolean z);

    public final void i() {
        if (this.i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof pd) {
            ((pd) layoutParams).p0 = this.i;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.j = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.g = 0;
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
        this.k = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.g = 0;
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
        this.j = null;
        this.g = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.j == null) {
            b(i);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
