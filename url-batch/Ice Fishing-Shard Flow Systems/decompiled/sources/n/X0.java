package n;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.icefishing.icefish.ice.fishing.s294s.R;

/* loaded from: classes.dex */
public final class X0 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f6723a;

    public X0(SearchView searchView) {
        this.f6723a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i5, int i7, int i8, int i9, int i10, int i11, int i12) {
        SearchView searchView = this.f6723a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f3256x;
        View view2 = searchView.f3225F;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f3258z.getPaddingLeft();
            Rect rect = new Rect();
            boolean a7 = z1.a(searchView);
            int dimensionPixelSize = searchView.f3239U ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(a7 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
