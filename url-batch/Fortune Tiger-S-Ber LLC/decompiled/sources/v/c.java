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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: f, reason: collision with root package name */
    public int[] f3439f;
    public int g;
    public Context h;

    /* renamed from: i, reason: collision with root package name */
    public s.i f3440i;

    /* renamed from: j, reason: collision with root package name */
    public String f3441j;

    /* renamed from: k, reason: collision with root package name */
    public String f3442k;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f3443l;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        int i4;
        HashMap hashMap;
        Context context = this.h;
        if (str == null || str.length() == 0 || context == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Object obj = (trim == null || (hashMap = constraintLayout.f269r) == null || !hashMap.containsKey(trim)) ? null : constraintLayout.f269r.get(trim);
            if (obj instanceof Integer) {
                i4 = ((Integer) obj).intValue();
                if (i4 == 0 && constraintLayout != null) {
                    i4 = f(constraintLayout, trim);
                }
                if (i4 == 0) {
                    try {
                        i4 = p.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i4 == 0) {
                    i4 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i4 == 0) {
                    this.f3443l.put(Integer.valueOf(i4), trim);
                    b(i4);
                    return;
                } else {
                    Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
                    return;
                }
            }
        }
        i4 = 0;
        if (i4 == 0) {
            i4 = f(constraintLayout, trim);
        }
        if (i4 == 0) {
        }
        if (i4 == 0) {
        }
        if (i4 == 0) {
        }
    }

    public final void b(int i4) {
        if (i4 == getId()) {
            return;
        }
        int i5 = this.g + 1;
        int[] iArr = this.f3439f;
        if (i5 > iArr.length) {
            this.f3439f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3439f;
        int i6 = this.g;
        iArr2[i6] = i4;
        this.g = i6 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.h == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof e) && trim.equals(((e) layoutParams).Y)) {
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
        for (int i4 = 0; i4 < this.g; i4++) {
            View view = (View) constraintLayout.f259f.get(this.f3439f[i4]);
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
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f3569b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3441j = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f3442k = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3439f, this.g);
    }

    public abstract void h(s.d dVar, boolean z3);

    public final void i() {
        if (this.f3440i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).f3471p0 = this.f3440i;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3441j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f3442k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f3441j = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.g = 0;
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

    public void setReferenceTags(String str) {
        this.f3442k = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.g = 0;
        while (true) {
            int indexOf = str.indexOf(44, i4);
            if (indexOf == -1) {
                c(str.substring(i4));
                return;
            } else {
                c(str.substring(i4, indexOf));
                i4 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3441j = null;
        this.g = 0;
        for (int i4 : iArr) {
            b(i4);
        }
    }

    @Override // android.view.View
    public final void setTag(int i4, Object obj) {
        super.setTag(i4, obj);
        if (obj == null && this.f3441j == null) {
            b(i4);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
