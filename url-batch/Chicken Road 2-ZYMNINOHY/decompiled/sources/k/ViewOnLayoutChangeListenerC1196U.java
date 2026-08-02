package k;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.rockchicken.pump.up.road.R;

/* renamed from: k.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1196U implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f13965a;

    public ViewOnLayoutChangeListenerC1196U(SearchView searchView) {
        this.f13965a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        SearchView searchView = this.f13965a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f4411p;
        View view2 = searchView.f4418x;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f4413r.getPaddingLeft();
            Rect rect = new Rect();
            boolean a3 = t0.a(searchView);
            int dimensionPixelSize = searchView.f4394M ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(a3 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
