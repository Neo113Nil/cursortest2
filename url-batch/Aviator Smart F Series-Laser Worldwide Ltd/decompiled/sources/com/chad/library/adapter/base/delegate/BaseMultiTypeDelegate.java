package com.chad.library.adapter.base.delegate;

import android.util.SparseIntArray;
import androidx.annotation.LayoutRes;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class BaseMultiTypeDelegate<T> {
    private boolean autoMode;
    private SparseIntArray layouts;
    private boolean selfMode;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseMultiTypeDelegate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void checkMode(boolean z7) {
        if (!(!z7)) {
            throw new IllegalArgumentException("Don't mess two register mode".toString());
        }
    }

    private final void registerItemType(int i8, @LayoutRes int i9) {
        this.layouts.put(i8, i9);
    }

    public final BaseMultiTypeDelegate<T> addItemType(int i8, @LayoutRes int i9) {
        this.selfMode = true;
        checkMode(this.autoMode);
        registerItemType(i8, i9);
        return this;
    }

    public final BaseMultiTypeDelegate<T> addItemTypeAutoIncrease(@LayoutRes int... layoutResIds) {
        s.checkNotNullParameter(layoutResIds, "layoutResIds");
        this.autoMode = true;
        checkMode(this.selfMode);
        int length = layoutResIds.length;
        for (int i8 = 0; i8 < length; i8++) {
            registerItemType(i8, layoutResIds[i8]);
        }
        return this;
    }

    public abstract int getItemType(List<? extends T> list, int i8);

    public final int getLayoutId(int i8) {
        int i9 = this.layouts.get(i8);
        if (i9 != 0) {
            return i9;
        }
        throw new IllegalArgumentException(("ViewType: " + i8 + " found layoutResId，please use registerItemType() first!").toString());
    }

    public BaseMultiTypeDelegate(SparseIntArray layouts) {
        s.checkNotNullParameter(layouts, "layouts");
        this.layouts = layouts;
    }

    public /* synthetic */ BaseMultiTypeDelegate(SparseIntArray sparseIntArray, int i8, o oVar) {
        this((i8 & 1) != 0 ? new SparseIntArray() : sparseIntArray);
    }
}
