package androidx.databinding;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {
    public List collectDependencies() {
        return Collections.EMPTY_LIST;
    }

    public abstract o getDataBinder(DataBindingComponent dataBindingComponent, View view, int i4);

    public abstract o getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i4);
}
