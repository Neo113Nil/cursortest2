package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.e;
import androidx.databinding.o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f12103a = new SparseIntArray(0);

    @Override // androidx.databinding.e
    public List collectDependencies() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.e
    public o getDataBinder(DataBindingComponent dataBindingComponent, View view, int i4) {
        if (f12103a.get(i4) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.e
    public o getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i4) {
        if (viewArr == null || viewArr.length == 0 || f12103a.get(i4) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
