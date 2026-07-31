package androidx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static e f12100a = new DataBinderMapperImpl();

    /* renamed from: b, reason: collision with root package name */
    private static DataBindingComponent f12101b = null;

    static o a(DataBindingComponent dataBindingComponent, View view, int i4) {
        return f12100a.getDataBinder(dataBindingComponent, view, i4);
    }

    static o b(DataBindingComponent dataBindingComponent, View[] viewArr, int i4) {
        return f12100a.getDataBinder(dataBindingComponent, viewArr, i4);
    }

    private static o c(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i4, int i5) {
        int childCount = viewGroup.getChildCount();
        int i6 = childCount - i4;
        if (i6 == 1) {
            return a(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i5);
        }
        View[] viewArr = new View[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            viewArr[i7] = viewGroup.getChildAt(i7 + i4);
        }
        return b(dataBindingComponent, viewArr, i5);
    }

    public static DataBindingComponent d() {
        return f12101b;
    }

    public static o e(LayoutInflater layoutInflater, int i4, ViewGroup viewGroup, boolean z4, DataBindingComponent dataBindingComponent) {
        boolean z5 = viewGroup != null && z4;
        return z5 ? c(dataBindingComponent, viewGroup, z5 ? viewGroup.getChildCount() : 0, i4) : a(dataBindingComponent, layoutInflater.inflate(i4, viewGroup, z4), i4);
    }
}
