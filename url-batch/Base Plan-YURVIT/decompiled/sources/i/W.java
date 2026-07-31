package i;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.crane.slab.beam.R;

/* loaded from: classes.dex */
public final class W implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f2181a;

    public W(SearchView searchView) {
        this.f2181a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        SearchView searchView = this.f2181a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.t;
        View view2 = searchView.f1270B;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f1299v.getPaddingLeft();
            Rect rect = new Rect();
            boolean a2 = w0.a(searchView);
            int dimensionPixelSize = searchView.f1284Q ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
