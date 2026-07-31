package b3;

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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: d, reason: collision with root package name */
    public int[] f1073d;

    /* renamed from: e, reason: collision with root package name */
    public int f1074e;

    /* renamed from: f, reason: collision with root package name */
    public Context f1075f;

    /* renamed from: g, reason: collision with root package name */
    public y2.i f1076g;

    /* renamed from: h, reason: collision with root package name */
    public String f1077h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public HashMap f1078j;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        int i;
        HashMap hashMap;
        Context context = this.f1075f;
        if (str == null || str.length() == 0 || context == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Object obj = (trim == null || (hashMap = constraintLayout.f582p) == null || !hashMap.containsKey(trim)) ? null : constraintLayout.f582p.get(trim);
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
                if (i == 0 && constraintLayout != null) {
                    i = f(constraintLayout, trim);
                }
                if (i == 0) {
                    try {
                        i = r.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i == 0) {
                    i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i == 0) {
                    this.f1078j.put(Integer.valueOf(i), trim);
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
        int i8 = this.f1074e + 1;
        int[] iArr = this.f1073d;
        if (i8 > iArr.length) {
            this.f1073d = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1073d;
        int i9 = this.f1074e;
        iArr2[i9] = i;
        this.f1074e = i9 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f1075f == null) {
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
        for (int i = 0; i < this.f1074e; i++) {
            View view = (View) constraintLayout.f571d.get(this.f1073d[i]);
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
        if (str != null && (resources = this.f1075f.getResources()) != null) {
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
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f1229b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1077h = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.i = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1073d, this.f1074e);
    }

    public abstract void h(y2.d dVar, boolean z3);

    public final void i() {
        if (this.f1076g == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).f1110p0 = this.f1076g;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1077h;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.i;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1077h = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f1074e = 0;
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
        this.i = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f1074e = 0;
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
        this.f1077h = null;
        this.f1074e = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f1077h == null) {
            b(i);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
