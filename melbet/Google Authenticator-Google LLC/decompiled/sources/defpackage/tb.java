package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tb extends View {
    public int[] c;
    public int d;
    protected final Context e;
    public String f;
    protected String g;
    public final HashMap h;
    public si i;

    public tb(Context context) {
        super(context);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = context;
        a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b(String str) {
        int i;
        if (str == null || str.length() == 0 || this.e == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object d = constraintLayout.d(trim);
            if (d instanceof Integer) {
                i = ((Integer) d).intValue();
                if (i == 0) {
                    i = constraintLayout != null ? d(constraintLayout, trim) : 0;
                }
                if (i != 0) {
                    try {
                        i2 = tq.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                } else {
                    i2 = i;
                }
                if (i2 == 0) {
                    Context context = this.e;
                    i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i2 != 0) {
                    Log.w("ConstraintHelper", a.Z(trim, "Could not find id of \"", "\""));
                    return;
                } else {
                    this.h.put(Integer.valueOf(i2), trim);
                    l(i2);
                    return;
                }
            }
        }
        i = 0;
        if (i == 0) {
        }
        if (i != 0) {
        }
        if (i2 == 0) {
        }
        if (i2 != 0) {
        }
    }

    private final void l(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.d + 1;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 > length) {
            iArr = Arrays.copyOf(iArr, length + length);
            this.c = iArr;
        }
        int i3 = this.d;
        iArr[i3] = i;
        this.d = i3 + 1;
    }

    private final void m(String str) {
        if (str == null || str.length() == 0 || this.e == null) {
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
            if ((layoutParams instanceof td) && trim.equals(((td) layoutParams).ac)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    l(childAt.getId());
                }
            }
        }
    }

    protected void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tr.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(35);
                    this.f = string;
                    h(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(36);
                    this.g = string2;
                    i(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.e.getResources()) != null) {
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

    protected final void e() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }

    protected void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.d; i++) {
            View a = constraintLayout.a(this.c[i]);
            if (a != null) {
                a.setVisibility(visibility);
                if (elevation > 0.0f) {
                    a.setTranslationZ(a.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final void h(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.d = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                b(str.substring(i));
                return;
            } else {
                b(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    protected final void i(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.d = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m(str.substring(i));
                return;
            } else {
                m(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public final void j(int[] iArr) {
        this.f = null;
        this.d = 0;
        for (int i : iArr) {
            l(i);
        }
    }

    public final void k() {
        if (this.i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof td) {
            ((td) layoutParams).av = this.i;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            h(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            i(str2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            l(i);
        }
    }

    public tb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = context;
        a(attributeSet);
    }

    public tb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = context;
        a(attributeSet);
    }

    protected void g(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void c(sd sdVar, boolean z) {
    }
}
