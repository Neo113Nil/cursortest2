package com.yandex.div.core.view2.divs.pager;

import O1.E9;
import O1.L9;
import android.view.View;
import androidx.core.view.M;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivPagerBinder$observeSizeChange$1 implements Disposable, View.OnLayoutChangeListener {
    final /* synthetic */ E9 $div;
    final /* synthetic */ Function1<Object, Unit> $observer;
    final /* synthetic */ ViewPager2 $this_observeSizeChange;
    private int oldSize;

    DivPagerBinder$observeSizeChange$1(final ViewPager2 viewPager2, final Function1<Object, Unit> function1, E9 e9) {
        this.$this_observeSizeChange = viewPager2;
        this.$observer = function1;
        this.$div = e9;
        viewPager2.addOnLayoutChangeListener(this);
        M.a(viewPager2, new Runnable() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$observeSizeChange$1$special$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                int size;
                size = this.getSize();
                function1.invoke(Integer.valueOf(size));
                this.oldSize = size;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSize() {
        return this.$this_observeSizeChange.getOrientation() == 0 ? this.$this_observeSizeChange.getWidth() : this.$this_observeSizeChange.getHeight();
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.$this_observeSizeChange.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@NotNull View v4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        Intrinsics.checkNotNullParameter(v4, "v");
        int size = getSize();
        if (this.oldSize != size) {
            this.oldSize = size;
            this.$observer.invoke(Integer.valueOf(size));
        } else if (this.$div.f2595u instanceof L9.d) {
            this.$this_observeSizeChange.j();
        }
    }
}
